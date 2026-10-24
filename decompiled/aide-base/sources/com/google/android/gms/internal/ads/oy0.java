package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class oy0 implements Runnable {
    private final /* synthetic */ ny0 WB;

    oy0(ny0 ny0Var) {
        this.WB = ny0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.WB.WB != null) {
            try {
                this.WB.WB.WB.Gj(1);
            } catch (RemoteException e) {
                xp.v5("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
