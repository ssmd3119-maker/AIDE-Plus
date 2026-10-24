package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* renamed from: com.google.android.gms.internal.ads.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo {
    private final Object j6 = new Object();

    @GuardedBy("mLock")
    private String DW = "";

    @GuardedBy("mLock")
    private String FH = "";

    @GuardedBy("mLock")
    private boolean Hw = false;
    private String v5 = "";

    private final void DW(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            bn.gn.post(new eo(this, context, str, z, z2));
        } else {
            xp.gn("Can not create dialog without Activity Context");
        }
    }

    private static String EQ(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.w0.v5().Eq(context, str2));
        vq<String> vqVarHw = new zzazs(context).Hw(str, map);
        try {
            return vqVarHw.get(((Integer) cw0.v5().FH(p.qI)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(str);
            xp.Hw(strValueOf.length() != 0 ? "Interrupted while retriving a response from: ".concat(strValueOf) : new String("Interrupted while retriving a response from: "), e);
            vqVarHw.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String strValueOf2 = String.valueOf(str);
            xp.Hw(strValueOf2.length() != 0 ? "Timeout while retriving a response from: ".concat(strValueOf2) : new String("Timeout while retriving a response from: "), e2);
            vqVarHw.cancel(true);
            return null;
        } catch (Exception e3) {
            String strValueOf3 = String.valueOf(str);
            xp.Hw(strValueOf3.length() != 0 ? "Error retriving a response from: ".concat(strValueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    private final Uri VH(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("linkedDeviceId", Zo(context));
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    private final String Zo(Context context) {
        String str;
        synchronized (this.j6) {
            if (TextUtils.isEmpty(this.DW)) {
                com.google.android.gms.ads.internal.w0.v5();
                String strHz = bn.hz(context, "debug_signals_id.txt");
                this.DW = strHz;
                if (TextUtils.isEmpty(strHz)) {
                    com.google.android.gms.ads.internal.w0.v5();
                    this.DW = bn.WB();
                    com.google.android.gms.ads.internal.w0.v5();
                    bn.ca(context, "debug_signals_id.txt", this.DW);
                }
            }
            str = this.DW;
        }
        return str;
    }

    private final boolean tp(Context context, String str, String str2) {
        String strEQ = EQ(context, VH(context, (String) cw0.v5().FH(p.ep), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strEQ)) {
            xp.VH("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strEQ.trim()).optString("debug_mode"));
            synchronized (this.j6) {
                this.Hw = zEquals;
            }
            return zEquals;
        } catch (JSONException e) {
            xp.v5("Fail to get debug mode response json.", e);
            return false;
        }
    }

    private final boolean u7(Context context, String str, String str2) {
        String strEQ = EQ(context, VH(context, (String) cw0.v5().FH(p.uC), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strEQ)) {
            xp.VH("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strEQ.trim());
            String strOptString = jSONObject.optString("gct");
            this.v5 = jSONObject.optString("status");
            synchronized (this.j6) {
                this.FH = strOptString;
            }
            return true;
        } catch (JSONException e) {
            xp.v5("Fail to get in app preview response json.", e);
            return false;
        }
    }

    private final void we(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.w0.v5();
        bn.we(context, VH(context, (String) cw0.v5().FH(p.qU), str, str2));
    }

    public final String FH() {
        String str;
        synchronized (this.j6) {
            str = this.FH;
        }
        return str;
    }

    public final boolean Hw() {
        boolean z;
        synchronized (this.j6) {
            z = this.Hw;
        }
        return z;
    }

    public final void gn(Context context, String str, String str2) {
        if (!u7(context, str, str2)) {
            DW(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(this.v5)) {
            xp.VH("Creative is not pushed for this device.");
            DW(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.v5)) {
            xp.VH("The app is not linked for creative preview.");
            we(context, str, str2);
        } else if ("0".equals(this.v5)) {
            xp.VH("Device is linked for in app preview.");
            DW(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void j6(Context context, String str, String str2, @Nullable String str3) {
        boolean zHw = Hw();
        if (!tp(context, str, str2)) {
            we(context, str, str2);
            return;
        }
        if (!zHw && !TextUtils.isEmpty(str3)) {
            v5(context, str2, str3, str);
        }
        xp.VH("Device is linked for debug signals.");
        DW(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final void v5(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = VH(context, (String) cw0.v5().FH(p.HO), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.w0.v5();
        bn.Mz(context, str, builderBuildUpon.build().toString());
    }
}
