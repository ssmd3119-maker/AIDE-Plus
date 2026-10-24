package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.ub0;
import com.google.android.gms.internal.ads.vb0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class t0 implements Callable<vb0> {
    private final /* synthetic */ q0 j6;

    t0(q0 q0Var) {
        this.j6 = q0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ vb0 call() {
        return new vb0(ub0.XL(this.j6.WB.WB, this.j6.fY, false));
    }
}
