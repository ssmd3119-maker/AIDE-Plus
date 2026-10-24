package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.yl;

/* loaded from: classes.dex */
public final class i1 implements Runnable {
    private final /* synthetic */ h1 WB;

    i1(h1 h1Var) {
        this.WB = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1 h1Var = this.WB;
        h1Var.fY.BJ(new yl(h1Var.WB, null, null, null, null, null, null, null));
    }
}
