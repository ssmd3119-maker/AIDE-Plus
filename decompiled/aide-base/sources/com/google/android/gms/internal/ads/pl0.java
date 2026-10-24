package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pl0 extends cl0 {
    private final zzfs J0;
    private volatile int J8;
    private volatile boolean QX;
    private volatile boolean Ws;
    private final int we;

    public pl0(xn0 xn0Var, bo0 bo0Var, zzfs zzfsVar, int i, Object obj, long j, long j2, int i2, int i3, zzfs zzfsVar2) {
        super(xn0Var, bo0Var, zzfsVar, i, obj, j, j2, i2);
        this.we = i3;
        this.J0 = zzfsVar2;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final boolean DW() {
        return this.Ws;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void FH() {
        this.Ws = true;
    }

    @Override // com.google.android.gms.internal.ads.el0
    public final long Hw() {
        return this.J8;
    }

    @Override // com.google.android.gms.internal.ads.ol0
    public final boolean Zo() {
        return this.QX;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void j6() {
        try {
            long jDW = this.gn.DW(ip0.v5(this.j6, this.J8));
            if (jDW != -1) {
                jDW += this.J8;
            }
            bh0 bh0Var = new bh0(this.gn, this.J8, jDW);
            dl0 dl0VarU7 = u7();
            dl0VarU7.DW(0L);
            mh0 mh0VarJ6 = dl0VarU7.j6(0, this.we);
            mh0VarJ6.j6(this.J0);
            for (int iDW = 0; iDW != -1; iDW = mh0VarJ6.DW(bh0Var, Integer.MAX_VALUE, true)) {
                this.J8 += iDW;
            }
            mh0VarJ6.FH(this.Zo, 1, this.J8, 0, null);
            ip0.VH(this.gn);
            this.QX = true;
        } catch (Throwable th) {
            ip0.VH(this.gn);
            throw th;
        }
    }
}
