package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.b;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class x9 implements ba {
    private final ka DW;
    private final boolean EQ;
    private final long FH;
    private final u9 Hw;
    private final List<String> J0;
    private final List<String> J8;
    private final boolean QX;
    private final zzwf VH;
    private final List<String> Ws;

    @GuardedBy("mLock")
    private na XL;
    private zzwb Zo;
    private final Context gn;
    private ta j3;
    private final String j6;
    private final zzbbi tp;
    private final t9 v5;
    private final zzacp we;
    private final Object u7 = new Object();

    @GuardedBy("mLock")
    private int aM = -2;

    public x9(Context context, String str, ka kaVar, u9 u9Var, t9 t9Var, zzwb zzwbVar, zzwf zzwfVar, zzbbi zzbbiVar, boolean z, boolean z2, zzacp zzacpVar, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        this.gn = context;
        this.DW = kaVar;
        this.v5 = t9Var;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.j6 = j3();
        } else {
            this.j6 = str;
        }
        this.Hw = u9Var;
        long j = t9Var.U2;
        if (j != -1) {
            this.FH = j;
        } else {
            long j2 = u9Var.DW;
            if (j2 != -1) {
                this.FH = j2;
            } else {
                this.FH = 10000L;
            }
        }
        this.Zo = zzwbVar;
        this.VH = zzwfVar;
        this.tp = zzbbiVar;
        this.EQ = z;
        this.QX = z2;
        this.we = zzacpVar;
        this.J0 = list;
        this.J8 = list2;
        this.Ws = list3;
    }

    private static na Hw(com.google.android.gms.ads.mediation.b bVar) {
        return new ib(bVar);
    }

    private static com.google.android.gms.ads.formats.b J0(String str) {
        b.a aVar = new b.a();
        if (str == null) {
            return aVar.j6();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            aVar.Hw(jSONObject.optBoolean("multiple_images", false));
            aVar.v5(jSONObject.optBoolean("only_urls", false));
            String strOptString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(strOptString)) {
                i = 2;
            } else if ("portrait".equals(strOptString)) {
                i = 1;
            } else if (!"any".equals(strOptString)) {
                i = -1;
            }
            aVar.FH(i);
        } catch (JSONException e) {
            xp.v5("Exception occurred when creating native ad options", e);
        }
        return aVar.j6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean J8(int i) {
        try {
            Bundle bundleIW = this.EQ ? this.XL.iW() : this.VH.fY ? this.XL.getInterstitialAdapterInfo() : this.XL.zzuw();
            return bundleIW != null && (bundleIW.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException unused) {
            xp.u7("Could not get adapter info. Returning false");
            return false;
        }
    }

    @GuardedBy("mLock")
    private final ta Mr() {
        if (this.aM != 0 || !a8()) {
            return null;
        }
        try {
            if (J8(4) && this.j3 != null && this.j3.jJ() != 0) {
                return this.j3;
            }
        } catch (RemoteException unused) {
            xp.u7("Could not get cpm value from MediationResponseMetadata");
        }
        return new z9(lg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final na U2() {
        String strValueOf = String.valueOf(this.j6);
        xp.gn(strValueOf.length() != 0 ? "Instantiating mediation adapter: ".concat(strValueOf) : new String("Instantiating mediation adapter: "));
        if (!this.EQ && !this.v5.DW()) {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.j6)) {
                return Hw(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(this.j6)) {
                return Hw(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.j6)) {
                return new ib(new zzanu());
            }
        }
        try {
            return this.DW.wu(this.j6);
        } catch (RemoteException e) {
            String strValueOf2 = String.valueOf(this.j6);
            xp.FH(strValueOf2.length() != 0 ? "Could not instantiate mediation adapter: ".concat(strValueOf2) : new String("Could not instantiate mediation adapter: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void VH(w9 w9Var) {
        String strWe = we(this.v5.EQ);
        try {
            if (this.tp.jw < 4100000) {
                if (this.VH.fY) {
                    this.XL.Oo(abcd.xu.sy(this.gn), this.Zo, strWe, w9Var);
                    return;
                } else {
                    this.XL.ix(abcd.xu.sy(this.gn), this.VH, this.Zo, strWe, w9Var);
                    return;
                }
            }
            if (!this.EQ && !this.v5.DW()) {
                if (this.VH.fY) {
                    this.XL.Vw(abcd.xu.sy(this.gn), this.Zo, strWe, this.v5.j6, w9Var);
                    return;
                }
                if (!this.QX) {
                    this.XL.uW(abcd.xu.sy(this.gn), this.VH, this.Zo, strWe, this.v5.j6, w9Var);
                    return;
                } else if (this.v5.Ws != null) {
                    this.XL.T6(abcd.xu.sy(this.gn), this.Zo, strWe, this.v5.j6, w9Var, new zzacp(J0(this.v5.j3)), this.v5.aM);
                    return;
                } else {
                    this.XL.uW(abcd.xu.sy(this.gn), this.VH, this.Zo, strWe, this.v5.j6, w9Var);
                    return;
                }
            }
            ArrayList arrayList = new ArrayList(this.J0);
            if (this.J8 != null) {
                for (String str : this.J8) {
                    String str2 = ":false";
                    if (this.Ws != null && this.Ws.contains(str)) {
                        str2 = ":true";
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + str2.length());
                    sb.append("custom:");
                    sb.append(str);
                    sb.append(str2);
                    arrayList.add(sb.toString());
                }
            }
            this.XL.T6(abcd.xu.sy(this.gn), this.Zo, strWe, this.v5.j6, w9Var, this.we, arrayList);
        } catch (RemoteException e) {
            xp.v5("Could not request ad from mediation adapter.", e);
            DW(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a8() {
        return this.Hw.J0 != -1;
    }

    private final String j3() {
        try {
            if (!TextUtils.isEmpty(this.v5.v5)) {
                return this.DW.GW(this.v5.v5) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException unused) {
            xp.u7("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    @GuardedBy("mLock")
    private final int lg() {
        if (this.v5.EQ == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.v5.EQ);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.j6)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int iOptInt = J8(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return iOptInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : iOptInt;
        } catch (JSONException unused) {
            xp.u7("Could not convert to json. Returning 0");
            return 0;
        }
    }

    @GuardedBy("mLock")
    private final String we(String str) {
        if (str != null && a8() && !J8(2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                return jSONObject.toString();
            } catch (JSONException unused) {
                xp.u7("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void DW(int i) {
        synchronized (this.u7) {
            this.aM = i;
            this.u7.notify();
        }
    }

    public final void FH() {
        synchronized (this.u7) {
            try {
            } catch (RemoteException e) {
                xp.v5("Could not destroy mediation adapter.", e);
            }
            if (this.XL != null) {
                this.XL.destroy();
                this.aM = -1;
                this.u7.notify();
            } else {
                this.aM = -1;
                this.u7.notify();
            }
        }
    }

    public final aa aM(long j, long j2) {
        aa aaVar;
        synchronized (this.u7) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            w9 w9Var = new w9();
            bn.gn.post(new y9(this, w9Var));
            long j3 = this.FH;
            while (this.aM == -2) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (jElapsedRealtime2 - jElapsedRealtime);
                long j5 = j2 - (jElapsedRealtime2 - j);
                if (j4 <= 0 || j5 <= 0) {
                    xp.gn("Timed out waiting for adapter.");
                    this.aM = 3;
                } else {
                    try {
                        this.u7.wait(Math.min(j4, j5));
                    } catch (InterruptedException unused) {
                        this.aM = 5;
                    }
                }
            }
            aaVar = new aa(this.v5, this.XL, this.j6, w9Var, this.aM, Mr(), com.google.android.gms.ads.internal.w0.we().DW() - jElapsedRealtime);
        }
        return aaVar;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void j6(int i, ta taVar) {
        synchronized (this.u7) {
            this.aM = 0;
            this.j3 = taVar;
            this.u7.notify();
        }
    }
}
