package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes.dex */
public final class dq0 implements Runnable {
    private final /* synthetic */ Surface WB;
    private final /* synthetic */ wp0 mb;

    dq0(wp0 wp0Var, Surface surface) {
        this.mb = wp0Var;
        this.WB = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.DW.Ws(this.WB);
    }
}
