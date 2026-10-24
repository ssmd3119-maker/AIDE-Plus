package com.google.android.gms.internal.ads;

import android.os.Bundle;

@jg
/* loaded from: classes.dex */
public final class bm {
    private final /* synthetic */ am FH;
    private long j6 = -1;
    private long DW = -1;

    public bm(am amVar) {
        this.FH = amVar;
    }

    public final long DW() {
        return this.DW;
    }

    public final void FH() {
        this.DW = this.FH.j6.DW();
    }

    public final void Hw() {
        this.j6 = this.FH.j6.DW();
    }

    public final Bundle j6() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.j6);
        bundle.putLong("tclose", this.DW);
        return bundle;
    }
}
