package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class nt0 implements c.b {
    private final /* synthetic */ fr WB;
    private final /* synthetic */ ht0 mb;

    nt0(ht0 ht0Var, fr frVar) {
        this.mb = ht0Var;
        this.WB = frVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.mb.Hw) {
            this.WB.Hw(new RuntimeException("Connection failed."));
        }
    }
}
