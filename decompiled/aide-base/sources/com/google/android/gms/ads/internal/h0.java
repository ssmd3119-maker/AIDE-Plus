package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public final class h0 implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.ads.v0 WB;
    private final /* synthetic */ c0 mb;

    h0(c0 c0Var, com.google.android.gms.internal.ads.v0 v0Var) {
        this.mb = c0Var;
        this.WB = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mb.k2.iW != null) {
                this.mb.k2.iW.ms(this.WB);
                this.mb.Qv(this.WB.QX());
            }
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
