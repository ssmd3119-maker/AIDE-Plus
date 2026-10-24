package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class xs0 implements c.a {
    private final /* synthetic */ us0 WB;

    xs0(us0 us0Var) {
        this.WB = us0Var;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.WB.DW) {
            try {
            } catch (DeadObjectException e) {
                xp.Hw("Unable to obtain a cache service instance.", e);
                this.WB.DW();
            }
            if (this.WB.FH != null) {
                this.WB.v5 = this.WB.FH.Hw();
                this.WB.DW.notifyAll();
            } else {
                this.WB.DW.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
        synchronized (this.WB.DW) {
            this.WB.v5 = null;
            this.WB.DW.notifyAll();
        }
    }
}
