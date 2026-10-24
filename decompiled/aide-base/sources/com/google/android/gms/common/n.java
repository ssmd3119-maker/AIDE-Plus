package com.google.android.gms.common;

import abcd.xu;
import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* loaded from: classes.dex */
public final class n {
    private static final Object DW = new Object();
    private static Context FH;
    private static volatile l0 j6;

    static synchronized void FH(Context context) {
        if (FH != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            FH = context.getApplicationContext();
        }
    }

    private static w Hw(final String str, final p pVar, final boolean z) {
        try {
            if (j6 == null) {
                com.google.android.gms.common.internal.p.u7(FH);
                synchronized (DW) {
                    if (j6 == null) {
                        j6 = m0.dx(DynamiteModule.v5(FH, DynamiteModule.tp, "com.google.android.gms.googlecertificates").Hw("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            com.google.android.gms.common.internal.p.u7(FH);
            try {
                return j6.mu(new zzk(str, pVar, z), xu.sy(FH.getPackageManager())) ? w.Zo() : w.FH(new Callable(z, str, pVar) { // from class: com.google.android.gms.common.o
                    private final String DW;
                    private final p FH;
                    private final boolean j6;

                    {
                        this.j6 = z;
                        this.DW = str;
                        this.FH = pVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z2 = this.j6;
                        String str2 = this.DW;
                        p pVar2 = this.FH;
                        return w.Hw(str2, pVar2, z2, !z2 && n.Hw(str2, pVar2, true).j6);
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return w.DW("module call", e);
            }
        } catch (DynamiteModule.a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String strValueOf = String.valueOf(e2.getMessage());
            return w.DW(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e2);
        }
    }

    static w j6(String str, p pVar, boolean z) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return Hw(str, pVar, z);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
