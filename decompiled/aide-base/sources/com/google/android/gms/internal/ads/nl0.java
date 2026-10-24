package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nl0 extends el0 {
    private volatile boolean EQ;
    private volatile int tp;
    private final fl0 u7;

    public nl0(xn0 xn0Var, bo0 bo0Var, zzfs zzfsVar, int i, Object obj, fl0 fl0Var) {
        super(xn0Var, bo0Var, 2, zzfsVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.u7 = fl0Var;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final boolean DW() {
        return this.EQ;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void FH() {
        this.EQ = true;
    }

    @Override // com.google.android.gms.internal.ads.el0
    public final long Hw() {
        return this.tp;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void j6() {
        bo0 bo0VarV5 = ip0.v5(this.j6, this.tp);
        try {
            bh0 bh0Var = new bh0(this.gn, bo0VarV5.FH, this.gn.DW(bo0VarV5));
            if (this.tp == 0) {
                this.u7.DW(null);
            }
            try {
                dh0 dh0Var = this.u7.WB;
                int iDW = 0;
                while (iDW == 0 && !this.EQ) {
                    iDW = dh0Var.DW(bh0Var, null);
                }
                ro0.Hw(iDW != 1);
            } finally {
                this.tp = (int) (bh0Var.u7() - this.j6.FH);
            }
        } finally {
            ip0.VH(this.gn);
        }
    }
}
