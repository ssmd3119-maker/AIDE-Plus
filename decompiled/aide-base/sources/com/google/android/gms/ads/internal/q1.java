package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public final class q1 implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.ads.x0 WB;
    private final /* synthetic */ m1 mb;

    q1(m1 m1Var, com.google.android.gms.internal.ads.x0 x0Var) {
        this.mb = m1Var;
        this.WB = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mb.k2.eU != null) {
                this.mb.k2.eU.TJ(this.WB);
                this.mb.Iy(this.WB.QX());
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
