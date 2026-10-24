package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e1 implements Runnable {
    private final /* synthetic */ c1 WB;

    e1(c1 c1Var) {
        this.WB = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.Jl != null) {
            this.WB.Jl.E4();
            this.WB.Jl.PH();
            this.WB.Jl.Bx();
        }
        c1.Mt(this.WB, null);
    }
}
