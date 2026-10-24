package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class fl0 implements gh0 {
    public final dh0 WB;
    private boolean fY;
    private final SparseArray<gl0> jw = new SparseArray<>();
    private kh0 k2;
    private final zzfs mb;
    private hl0 qp;
    private zzfs[] zh;

    public fl0(dh0 dh0Var, zzfs zzfsVar) {
        this.WB = dh0Var;
        this.mb = zzfsVar;
    }

    public final void DW(hl0 hl0Var) {
        this.qp = hl0Var;
        if (!this.fY) {
            this.WB.FH(this);
            this.fY = true;
            return;
        }
        this.WB.Zo(0L, 0L);
        for (int i = 0; i < this.jw.size(); i++) {
            this.jw.valueAt(i).v5(hl0Var);
        }
    }

    public final kh0 FH() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.gh0
    public final void Hw() {
        zzfs[] zzfsVarArr = new zzfs[this.jw.size()];
        for (int i = 0; i < this.jw.size(); i++) {
            zzfsVarArr[i] = this.jw.valueAt(i).Hw;
        }
        this.zh = zzfsVarArr;
    }

    @Override // com.google.android.gms.internal.ads.gh0
    public final mh0 j6(int i, int i2) {
        gl0 gl0Var = this.jw.get(i);
        if (gl0Var != null) {
            return gl0Var;
        }
        ro0.Hw(this.zh == null);
        gl0 gl0Var2 = new gl0(i, i2, this.mb);
        gl0Var2.v5(this.qp);
        this.jw.put(i, gl0Var2);
        return gl0Var2;
    }

    @Override // com.google.android.gms.internal.ads.gh0
    public final void u7(kh0 kh0Var) {
        this.k2 = kh0Var;
    }

    public final zzfs[] v5() {
        return this.zh;
    }
}
