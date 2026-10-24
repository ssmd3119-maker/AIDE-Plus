package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.b3;
import com.google.android.gms.internal.ads.xp;

/* loaded from: classes.dex */
public final class l0 implements Runnable {
    private final /* synthetic */ b3 WB;
    private final /* synthetic */ c0 mb;

    l0(c0 c0Var, b3 b3Var) {
        this.mb = c0Var;
        this.WB = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.mb.k2.pO.get(this.WB.vy()).Fz(this.WB);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
