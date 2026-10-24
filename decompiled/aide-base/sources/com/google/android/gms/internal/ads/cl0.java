package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class cl0 extends ol0 {
    private int[] EQ;
    private dl0 tp;

    public cl0(xn0 xn0Var, bo0 bo0Var, zzfs zzfsVar, int i, Object obj, long j, long j2, int i2) {
        super(xn0Var, bo0Var, zzfsVar, i, obj, j, j2, i2);
    }

    public final void VH(dl0 dl0Var) {
        this.tp = dl0Var;
        this.EQ = dl0Var.FH();
    }

    public final int gn(int i) {
        return this.EQ[i];
    }

    protected final dl0 u7() {
        return this.tp;
    }
}
