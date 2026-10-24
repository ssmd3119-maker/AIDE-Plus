package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pk0 {
    private int EQ;
    private zzfs XL;
    private int tp;
    private int u7;
    private int we;
    private int j6 = 1000;
    private int[] DW = new int[1000];
    private long[] FH = new long[1000];
    private long[] Zo = new long[1000];
    private int[] v5 = new int[1000];
    private int[] Hw = new int[1000];
    private nh0[] VH = new nh0[1000];
    private zzfs[] gn = new zzfs[1000];
    private long J0 = Long.MIN_VALUE;
    private long J8 = Long.MIN_VALUE;
    private boolean QX = true;
    private boolean Ws = true;

    public final synchronized void DW(long j, int i, long j2, int i2, nh0 nh0Var) {
        if (this.Ws) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.Ws = false;
            }
        }
        ro0.Hw(!this.QX);
        FH(j);
        this.Zo[this.we] = j;
        this.FH[this.we] = j2;
        this.Hw[this.we] = i2;
        this.v5[this.we] = i;
        this.VH[this.we] = nh0Var;
        this.gn[this.we] = this.XL;
        this.DW[this.we] = 0;
        int i3 = this.u7 + 1;
        this.u7 = i3;
        if (i3 != this.j6) {
            int i4 = this.we + 1;
            this.we = i4;
            if (i4 == this.j6) {
                this.we = 0;
            }
            return;
        }
        int i5 = this.j6 + 1000;
        int[] iArr = new int[i5];
        long[] jArr = new long[i5];
        long[] jArr2 = new long[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        nh0[] nh0VarArr = new nh0[i5];
        zzfs[] zzfsVarArr = new zzfs[i5];
        int i6 = this.j6 - this.EQ;
        System.arraycopy(this.FH, this.EQ, jArr, 0, i6);
        System.arraycopy(this.Zo, this.EQ, jArr2, 0, i6);
        System.arraycopy(this.v5, this.EQ, iArr2, 0, i6);
        System.arraycopy(this.Hw, this.EQ, iArr3, 0, i6);
        System.arraycopy(this.VH, this.EQ, nh0VarArr, 0, i6);
        System.arraycopy(this.gn, this.EQ, zzfsVarArr, 0, i6);
        System.arraycopy(this.DW, this.EQ, iArr, 0, i6);
        int i7 = this.EQ;
        System.arraycopy(this.FH, 0, jArr, i6, i7);
        System.arraycopy(this.Zo, 0, jArr2, i6, i7);
        System.arraycopy(this.v5, 0, iArr2, i6, i7);
        System.arraycopy(this.Hw, 0, iArr3, i6, i7);
        System.arraycopy(this.VH, 0, nh0VarArr, i6, i7);
        System.arraycopy(this.gn, 0, zzfsVarArr, i6, i7);
        System.arraycopy(this.DW, 0, iArr, i6, i7);
        this.FH = jArr;
        this.Zo = jArr2;
        this.v5 = iArr2;
        this.Hw = iArr3;
        this.VH = nh0VarArr;
        this.gn = zzfsVarArr;
        this.DW = iArr;
        this.EQ = 0;
        this.we = this.j6;
        this.u7 = this.j6;
        this.j6 = i5;
    }

    public final synchronized boolean EQ() {
        return this.u7 != 0;
    }

    public final synchronized void FH(long j) {
        this.J8 = Math.max(this.J8, j);
    }

    public final long Hw(int i) {
        int iU7 = u7() - i;
        ro0.j6(iU7 >= 0 && iU7 <= this.u7);
        if (iU7 == 0) {
            if (this.tp == 0 && this.u7 == 0) {
                return 0L;
            }
            int i2 = this.we;
            if (i2 == 0) {
                i2 = this.j6;
            }
            return this.FH[i2 - 1] + this.Hw[r0];
        }
        int i3 = this.u7 - iU7;
        this.u7 = i3;
        int i4 = this.we;
        int i5 = this.j6;
        this.we = ((i4 + i5) - iU7) % i5;
        this.J8 = Long.MIN_VALUE;
        for (int i6 = i3 - 1; i6 >= 0; i6--) {
            int i7 = (this.EQ + i6) % this.j6;
            this.J8 = Math.max(this.J8, this.Zo[i7]);
            if ((this.v5[i7] & 1) != 0) {
                break;
            }
        }
        return this.FH[this.we];
    }

    public final synchronized long J0() {
        if (!EQ()) {
            return -1L;
        }
        int i = ((this.EQ + this.u7) - 1) % this.j6;
        this.EQ = (this.EQ + this.u7) % this.j6;
        this.tp += this.u7;
        this.u7 = 0;
        return this.FH[i] + this.Hw[i];
    }

    public final synchronized boolean J8(zzfs zzfsVar) {
        if (zzfsVar == null) {
            this.QX = true;
            return false;
        }
        this.QX = false;
        if (ip0.u7(zzfsVar, this.XL)) {
            return false;
        }
        this.XL = zzfsVar;
        return true;
    }

    public final void VH() {
        this.tp = 0;
        this.EQ = 0;
        this.we = 0;
        this.u7 = 0;
        this.Ws = true;
    }

    public final synchronized long Zo() {
        return Math.max(this.J0, this.J8);
    }

    public final void gn() {
        this.J0 = Long.MIN_VALUE;
        this.J8 = Long.MIN_VALUE;
    }

    public final synchronized int j6(xe0 xe0Var, tg0 tg0Var, boolean z, boolean z2, zzfs zzfsVar, qk0 qk0Var) {
        if (!EQ()) {
            if (z2) {
                tg0Var.DW(4);
                return -4;
            }
            if (this.XL == null || (!z && this.XL == zzfsVar)) {
                return -3;
            }
            xe0Var.j6 = this.XL;
            return -5;
        }
        if (!z && this.gn[this.EQ] == zzfsVar) {
            if (tg0Var.FH == null) {
                return -3;
            }
            tg0Var.Hw = this.Zo[this.EQ];
            tg0Var.DW(this.v5[this.EQ]);
            qk0Var.j6 = this.Hw[this.EQ];
            qk0Var.DW = this.FH[this.EQ];
            qk0Var.Hw = this.VH[this.EQ];
            this.J0 = Math.max(this.J0, tg0Var.Hw);
            this.u7--;
            int i = this.EQ + 1;
            this.EQ = i;
            this.tp++;
            if (i == this.j6) {
                this.EQ = 0;
            }
            qk0Var.FH = this.u7 > 0 ? this.FH[this.EQ] : qk0Var.DW + qk0Var.j6;
            return -4;
        }
        xe0Var.j6 = this.gn[this.EQ];
        return -5;
    }

    public final int tp() {
        return this.tp;
    }

    public final int u7() {
        return this.tp + this.u7;
    }

    public final synchronized long v5(long j, boolean z) {
        if (EQ() && j >= this.Zo[this.EQ]) {
            if (j > this.J8 && !z) {
                return -1L;
            }
            int i = 0;
            int i2 = this.EQ;
            int i3 = -1;
            while (i2 != this.we && this.Zo[i2] <= j) {
                if ((this.v5[i2] & 1) != 0) {
                    i3 = i;
                }
                i2 = (i2 + 1) % this.j6;
                i++;
            }
            if (i3 == -1) {
                return -1L;
            }
            int i4 = (this.EQ + i3) % this.j6;
            this.EQ = i4;
            this.tp += i3;
            this.u7 -= i3;
            return this.FH[i4];
        }
        return -1L;
    }

    public final synchronized zzfs we() {
        if (this.QX) {
            return null;
        }
        return this.XL;
    }
}
