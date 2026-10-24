package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dk0 implements Runnable {
    private final /* synthetic */ bk0 WB;

    dk0(bk0 bk0Var) {
        this.WB = bk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.ys) {
            return;
        }
        this.WB.Jl.Hw(this.WB);
    }
}
