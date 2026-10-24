package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class hj extends rj {
    private final Context WB;

    @GuardedBy("mLock")
    private final ij fY;
    private final zzbbi jw;
    private final Object mb;

    public hj(Context context, com.google.android.gms.ads.internal.s1 s1Var, ka kaVar, zzbbi zzbbiVar) {
        this(context, zzbbiVar, new ij(context, s1Var, zzwf.QX(), kaVar, zzbbiVar));
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void Bz() {
        synchronized (this.mb) {
            this.fY.G5();
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void C(abcd.wu wuVar) {
        synchronized (this.mb) {
            this.fY.Mr();
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void HV(oj ojVar) {
        synchronized (this.mb) {
            this.fY.HV(ojVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void Mr() {
        C(null);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void NF(String str) {
        if (((Boolean) cw0.v5().FH(p.ko)).booleanValue()) {
            synchronized (this.mb) {
                this.fY.ew(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void XL() {
        b(null);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final Bundle XX() {
        Bundle bundleXX;
        if (!((Boolean) cw0.v5().FH(p.oY)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.mb) {
            bundleXX = this.fY.XX();
        }
        return bundleXX;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void Xa(String str) {
        synchronized (this.mb) {
            this.fY.Xa(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void YM(zzavh zzavhVar) {
        synchronized (this.mb) {
            this.fY.YM(zzavhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void b(abcd.wu wuVar) {
        Context context;
        synchronized (this.mb) {
            if (wuVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) abcd.xu.g3(wuVar);
                } catch (Exception e) {
                    xp.v5("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.fY.BF(context);
                this.fY.XL();
            } else {
                this.fY.XL();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void br(wj wjVar) {
        synchronized (this.mb) {
            this.fY.br(wjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void destroy() {
        e7(null);
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void e7(abcd.wu wuVar) {
        synchronized (this.mb) {
            this.fY.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final boolean kJ() {
        boolean zKJ;
        synchronized (this.mb) {
            zKJ = this.fY.kJ();
        }
        return zKJ;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void o4(String str) throws RemoteException {
        Context context = this.WB;
        if (context instanceof gj) {
            try {
                ((gj) context).j6(str);
                throw null;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Build.VERSION.SDK_INT > 15) {
                    throw new RemoteException(PackageManager.NameNotFoundException.class.getSimpleName());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void sG(boolean z) {
        synchronized (this.mb) {
            this.fY.sG(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final String u7() {
        String strU7;
        synchronized (this.mb) {
            strU7 = this.fY.u7();
        }
        return strU7;
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final synchronized void wV(abcd.wu wuVar) {
        if (this.WB instanceof gj) {
            ((gj) this.WB).DW((Activity) abcd.xu.g3(wuVar));
            throw null;
        }
        Bz();
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final void ye(zw0 zw0Var) {
        if (((Boolean) cw0.v5().FH(p.oY)).booleanValue()) {
            synchronized (this.mb) {
                this.fY.ye(zw0Var);
            }
        }
    }

    private hj(Context context, zzbbi zzbbiVar, ij ijVar) {
        this.mb = new Object();
        this.WB = context;
        this.jw = zzbbiVar;
        this.fY = ijVar;
    }
}
