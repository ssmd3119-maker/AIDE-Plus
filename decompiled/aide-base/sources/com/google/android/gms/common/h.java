package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* loaded from: classes.dex */
public class h {
    private static h DW;
    private final Context j6;

    private h(Context context) {
        this.j6 = context.getApplicationContext();
    }

    private static p Hw(PackageInfo packageInfo, p... pVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        q qVar = new q(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < pVarArr.length; i++) {
            if (pVarArr[i].equals(qVar)) {
                return pVarArr[i];
            }
        }
        return null;
    }

    public static boolean VH(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? Hw(packageInfo, s.j6) : Hw(packageInfo, s.j6[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final w Zo(String str, int i) {
        try {
            return v5(com.google.android.gms.common.wrappers.b.j6(this.j6).gn(str, 64, i));
        } catch (PackageManager.NameNotFoundException unused) {
            String strValueOf = String.valueOf(str);
            return w.v5(strValueOf.length() != 0 ? "no pkg ".concat(strValueOf) : new String("no pkg "));
        }
    }

    public static h j6(Context context) {
        com.google.android.gms.common.internal.p.u7(context);
        synchronized (h.class) {
            if (DW == null) {
                n.FH(context);
                DW = new h(context);
            }
        }
        return DW;
    }

    private final w v5(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        boolean zV5 = g.v5(this.j6);
        if (packageInfo == null) {
            return w.v5("null pkg");
        }
        if (packageInfo.signatures.length != 1) {
            return w.v5("single cert required");
        }
        q qVar = new q(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        w wVarJ6 = n.j6(str, qVar, zV5);
        return (!wVarJ6.j6 || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || (zV5 && !n.j6(str, qVar, false).j6)) ? wVarJ6 : w.v5("debuggable release cert app rejected");
    }

    public boolean DW(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (VH(packageInfo, false)) {
            return true;
        }
        if (VH(packageInfo, true)) {
            if (g.v5(this.j6)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean FH(int i) {
        w wVarV5;
        String[] strArrZo = com.google.android.gms.common.wrappers.b.j6(this.j6).Zo(i);
        if (strArrZo == null || strArrZo.length == 0) {
            wVarV5 = w.v5("no pkgs");
        } else {
            wVarV5 = null;
            for (String str : strArrZo) {
                wVarV5 = Zo(str, i);
                if (wVarV5.j6) {
                    break;
                }
            }
        }
        wVarV5.VH();
        return wVarV5.j6;
    }
}
