package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class el0 implements lo0 {
    public final int DW;
    public final zzfs FH;
    public final int Hw;
    public final long VH;
    public final long Zo;
    protected final xn0 gn;
    public final bo0 j6;
    public final Object v5;

    public el0(xn0 xn0Var, bo0 bo0Var, int i, zzfs zzfsVar, int i2, Object obj, long j, long j2) {
        ro0.FH(xn0Var);
        this.gn = xn0Var;
        ro0.FH(bo0Var);
        this.j6 = bo0Var;
        this.DW = i;
        this.FH = zzfsVar;
        this.Hw = i2;
        this.v5 = obj;
        this.Zo = j;
        this.VH = j2;
    }

    public abstract long Hw();
}
