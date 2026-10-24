package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class ys0 implements c.b {
    private final /* synthetic */ us0 WB;

    ys0(us0 us0Var) {
        this.WB = us0Var;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.WB.DW) {
            this.WB.v5 = null;
            if (this.WB.FH != null) {
                us0.v5(this.WB, null);
            }
            this.WB.DW.notifyAll();
        }
    }
}
