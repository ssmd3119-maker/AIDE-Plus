package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.t7;

/* loaded from: classes.dex */
public abstract class t7<M extends t7<M>> extends z7 {
    protected v7 DW;

    @Override // com.google.android.gms.internal.measurement.z7
    public void DW(r7 r7Var) throws s7, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (this.DW == null) {
            return;
        }
        for (int i = 0; i < this.DW.Hw(); i++) {
            this.DW.gn(i).FH(r7Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z7
    protected int FH() {
        if (this.DW == null) {
            return 0;
        }
        int iZo = 0;
        for (int i = 0; i < this.DW.Hw(); i++) {
            iZo += this.DW.gn(i).Zo();
        }
        return iZo;
    }

    protected final boolean VH(q7 q7Var, int i) throws y7 {
        int iJ6 = q7Var.j6();
        if (!q7Var.Zo(i)) {
            return false;
        }
        int i2 = i >>> 3;
        b8 b8Var = new b8(i, q7Var.we(iJ6, q7Var.j6() - iJ6));
        w7 w7VarVH = null;
        v7 v7Var = this.DW;
        if (v7Var == null) {
            this.DW = new v7();
        } else {
            w7VarVH = v7Var.VH(i2);
        }
        if (w7VarVH == null) {
            w7VarVH = new w7();
            this.DW.Zo(i2, w7VarVH);
        }
        w7VarVH.Hw(b8Var);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public /* synthetic */ Object clone() {
        t7 t7Var = (t7) super.clone();
        x7.VH(this, t7Var);
        return t7Var;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    /* renamed from: v5 */
    public final /* synthetic */ z7 clone() {
        return (t7) clone();
    }
}
