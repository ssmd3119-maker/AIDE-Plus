package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p6 {
    zzwb DW;
    i5 FH;
    long Hw;
    private final /* synthetic */ o6 VH;
    boolean Zo;
    com.google.android.gms.ads.internal.m j6;
    boolean v5;

    p6(o6 o6Var, h5 h5Var) {
        this.VH = o6Var;
        this.j6 = h5Var.FH(o6Var.FH);
        i5 i5Var = new i5();
        this.FH = i5Var;
        com.google.android.gms.ads.internal.m mVar = this.j6;
        mVar.xt(new j5(i5Var));
        mVar.lR(new r5(i5Var));
        mVar.rB(new t5(i5Var));
        mVar.JX(new v5(i5Var));
        mVar.br(new x5(i5Var));
    }

    final boolean j6() {
        if (this.v5) {
            return false;
        }
        zzwb zzwbVar = this.DW;
        if (zzwbVar == null) {
            zzwbVar = this.VH.DW;
        }
        this.Zo = this.j6.p8(m6.tp(zzwbVar));
        this.v5 = true;
        this.Hw = com.google.android.gms.ads.internal.w0.we().j6();
        return true;
    }

    p6(o6 o6Var, h5 h5Var, zzwb zzwbVar) {
        this(o6Var, h5Var);
        this.DW = zzwbVar;
    }
}
