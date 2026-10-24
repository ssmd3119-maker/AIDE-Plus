package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ml0 extends cl0 {
    private final long J0;
    private final fl0 J8;
    private volatile boolean QX;
    private volatile int Ws;
    private volatile boolean XL;
    private final int we;

    public ml0(xn0 xn0Var, bo0 bo0Var, zzfs zzfsVar, int i, Object obj, long j, long j2, int i2, int i3, long j3, fl0 fl0Var) {
        super(xn0Var, bo0Var, zzfsVar, i, obj, j, j2, i2);
        this.we = i3;
        this.J0 = j3;
        this.J8 = fl0Var;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final boolean DW() {
        return this.QX;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void FH() {
        this.QX = true;
    }

    @Override // com.google.android.gms.internal.ads.el0
    public final long Hw() {
        return this.Ws;
    }

    @Override // com.google.android.gms.internal.ads.ol0
    public final boolean Zo() {
        return this.XL;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void j6() {
        bo0 bo0VarV5 = ip0.v5(this.j6, this.Ws);
        try {
            bh0 bh0Var = new bh0(this.gn, bo0VarV5.FH, this.gn.DW(bo0VarV5));
            if (this.Ws == 0) {
                dl0 dl0VarU7 = u7();
                dl0VarU7.DW(this.J0);
                this.J8.DW(dl0VarU7);
            }
            try {
                dh0 dh0Var = this.J8.WB;
                int iDW = 0;
                while (iDW == 0 && !this.QX) {
                    iDW = dh0Var.DW(bh0Var, null);
                }
                ro0.Hw(iDW != 1);
                ip0.VH(this.gn);
                this.XL = true;
            } finally {
                this.Ws = (int) (bh0Var.u7() - this.j6.FH);
            }
        } catch (Throwable th) {
            ip0.VH(this.gn);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ol0
    public final int v5() {
        return this.u7 + this.we;
    }
}
