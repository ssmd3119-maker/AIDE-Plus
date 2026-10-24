package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.xp;

@jg
/* loaded from: classes.dex */
public final class a {
    public static boolean DW(Context context, zzc zzcVar, s sVar) throws NumberFormatException {
        int i = 0;
        if (zzcVar == null) {
            xp.u7("No intent data for launcher overlay.");
            return false;
        }
        com.google.android.gms.internal.ads.p.j6(context);
        Intent intent = zzcVar.AL;
        if (intent != null) {
            return j6(context, intent, sVar);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.mb)) {
            xp.u7("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.jw)) {
            intent2.setData(Uri.parse(zzcVar.mb));
        } else {
            intent2.setDataAndType(Uri.parse(zzcVar.mb), zzcVar.jw);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.fY)) {
            intent2.setPackage(zzcVar.fY);
        }
        if (!TextUtils.isEmpty(zzcVar.qp)) {
            String[] strArrSplit = zzcVar.qp.split("/", 2);
            if (strArrSplit.length < 2) {
                String strValueOf = String.valueOf(zzcVar.qp);
                xp.u7(strValueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(strValueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str = zzcVar.k2;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                xp.u7("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.HT)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.sv)).booleanValue()) {
                w0.v5();
                bn.vJ(context, intent2);
            }
        }
        return j6(context, intent2, sVar);
    }

    private static boolean j6(Context context, Intent intent, s sVar) {
        try {
            String strValueOf = String.valueOf(intent.toURI());
            sm.we(strValueOf.length() != 0 ? "Launching an intent: ".concat(strValueOf) : new String("Launching an intent: "));
            w0.v5();
            bn.EQ(context, intent);
            if (sVar == null) {
                return true;
            }
            sVar.E4();
            return true;
        } catch (ActivityNotFoundException e) {
            xp.u7(e.getMessage());
            return false;
        }
    }
}
