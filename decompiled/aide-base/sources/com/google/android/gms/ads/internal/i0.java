package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public final class i0 implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.ads.c1 WB;
    private final /* synthetic */ c0 mb;

    i0(c0 c0Var, com.google.android.gms.internal.ads.c1 c1Var) {
        this.mb = c0Var;
        this.WB = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mb.k2.e3 != null) {
                this.mb.k2.e3.k5(this.WB);
                this.mb.Qv(this.WB.QX());
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
