package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j90;

/* loaded from: classes.dex */
public abstract class j90<M extends j90<M>> extends p90 {
    protected l90 DW;

    @Override // com.google.android.gms.internal.ads.p90
    public void Hw(h90 h90Var) {
        if (this.DW == null) {
            return;
        }
        for (int i = 0; i < this.DW.FH(); i++) {
            this.DW.VH(i).FH(h90Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.p90
    /* renamed from: Zo */
    public final /* synthetic */ p90 clone() {
        return (j90) clone();
    }

    @Override // com.google.android.gms.internal.ads.p90
    public /* synthetic */ Object clone() {
        j90 j90Var = (j90) super.clone();
        n90.j6(this, j90Var);
        return j90Var;
    }

    @Override // com.google.android.gms.internal.ads.p90
    protected int gn() {
        if (this.DW == null) {
            return 0;
        }
        int iVH = 0;
        for (int i = 0; i < this.DW.FH(); i++) {
            iVH += this.DW.VH(i).VH();
        }
        return iVH;
    }

    protected final boolean u7(g90 g90Var, int i) {
        int iJ6 = g90Var.j6();
        if (!g90Var.aM(i)) {
            return false;
        }
        int i2 = i >>> 3;
        s90 s90Var = new s90(i, g90Var.J8(iJ6, g90Var.j6() - iJ6));
        m90 m90VarZo = null;
        l90 l90Var = this.DW;
        if (l90Var == null) {
            this.DW = new l90();
        } else {
            m90VarZo = l90Var.Zo(i2);
        }
        if (m90VarZo == null) {
            m90VarZo = new m90();
            this.DW.Hw(i2, m90VarZo);
        }
        m90VarZo.Hw(s90Var);
        return true;
    }
}
