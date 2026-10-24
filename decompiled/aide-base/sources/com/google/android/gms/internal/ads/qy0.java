package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qy0 implements Runnable {
    private final /* synthetic */ py0 WB;

    qy0(py0 py0Var) {
        this.WB = py0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.WB != null) {
            try {
                this.WB.WB.Gj(1);
            } catch (RemoteException e) {
                xp.v5("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
