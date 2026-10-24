package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y0 implements Runnable {
    private final /* synthetic */ x0 WB;

    y0(x0 x0Var) {
        this.WB = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.n5 != null) {
            this.WB.n5.E4();
            this.WB.n5.PH();
            this.WB.n5.Bx();
        }
        x0.Mt(this.WB, null);
    }
}
