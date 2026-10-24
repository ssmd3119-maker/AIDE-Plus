package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public final class p1 implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.ads.v0 WB;
    private final /* synthetic */ m1 mb;

    p1(m1 m1Var, com.google.android.gms.internal.ads.v0 v0Var) {
        this.mb = m1Var;
        this.WB = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mb.k2.iW != null) {
                this.mb.k2.iW.ms(this.WB);
                this.mb.Iy(this.WB.QX());
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
