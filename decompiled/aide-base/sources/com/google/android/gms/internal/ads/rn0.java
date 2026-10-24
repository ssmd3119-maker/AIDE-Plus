package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class rn0 {
    private sn0 j6;

    public abstract tn0 DW(ef0[] ef0VarArr, al0 al0Var);

    public final void FH(sn0 sn0Var) {
        this.j6 = sn0Var;
    }

    public abstract void Hw(Object obj);

    protected final void j6() {
        sn0 sn0Var = this.j6;
        if (sn0Var != null) {
            sn0Var.DW();
        }
    }
}
