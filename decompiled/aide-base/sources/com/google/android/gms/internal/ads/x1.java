package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x1 implements Runnable {
    private final /* synthetic */ l1 WB;
    private final /* synthetic */ w1 mb;

    x1(w1 w1Var, l1 l1Var) {
        this.mb = w1Var;
        this.WB = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.k6(this.WB);
    }
}
