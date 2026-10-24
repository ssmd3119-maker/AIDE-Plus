package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class h6 implements Runnable {
    private final /* synthetic */ i6 WB;
    private final /* synthetic */ j6 mb;

    h6(i5 i5Var, i6 i6Var, j6 j6Var) {
        this.WB = i6Var;
        this.mb = j6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.WB.j6(this.mb);
        } catch (RemoteException e) {
            xp.v5("Could not propagate interstitial ad event.", e);
        }
    }
}
