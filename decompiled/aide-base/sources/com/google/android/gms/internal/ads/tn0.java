package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tn0 {
    public final qn0 DW;
    public final Object FH;
    public final ff0[] Hw;
    public final al0 j6;

    public tn0(al0 al0Var, qn0 qn0Var, Object obj, ff0[] ff0VarArr) {
        this.j6 = al0Var;
        this.DW = qn0Var;
        this.FH = obj;
        this.Hw = ff0VarArr;
    }

    public final boolean j6(tn0 tn0Var, int i) {
        return tn0Var != null && ip0.u7(this.DW.j6(i), tn0Var.DW.j6(i)) && ip0.u7(this.Hw[i], tn0Var.Hw[i]);
    }
}
