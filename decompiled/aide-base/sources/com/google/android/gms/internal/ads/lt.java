package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class lt implements ze0 {
    private long DW;
    private long FH;
    private long Hw;
    private boolean VH;
    private int Zo;
    private final do0 j6;
    private long v5;

    lt() {
        this(15000, 30000, 2500L, 5000L);
    }

    private final void we(boolean z) {
        this.Zo = 0;
        this.VH = false;
        if (z) {
            this.j6.Zo();
        }
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final synchronized boolean DW(long j) {
        boolean z;
        z = false;
        char c = j > this.FH ? (char) 0 : j < this.DW ? (char) 2 : (char) 1;
        boolean z2 = this.j6.gn() >= this.Zo;
        if (c == 2 || (c == 1 && this.VH && !z2)) {
            z = true;
        }
        this.VH = z;
        return z;
    }

    public final synchronized void EQ(int i) {
        this.FH = i * 1000;
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final vn0 FH() {
        return this.j6;
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final void Hw(cf0[] cf0VarArr, al0 al0Var, qn0 qn0Var) {
        this.Zo = 0;
        for (int i = 0; i < cf0VarArr.length; i++) {
            if (qn0Var.j6(i) != null) {
                this.Zo += ip0.j3(cf0VarArr[i].sh());
            }
        }
        this.j6.VH(this.Zo);
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final void VH() {
        we(true);
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final synchronized boolean Zo(long j, boolean z) {
        long j2;
        j2 = z ? this.v5 : this.Hw;
        return j2 <= 0 || j >= j2;
    }

    public final synchronized void gn(int i) {
        this.Hw = i * 1000;
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final void j6() {
        we(false);
    }

    public final synchronized void tp(int i) {
        this.DW = i * 1000;
    }

    public final synchronized void u7(int i) {
        this.v5 = i * 1000;
    }

    @Override // com.google.android.gms.internal.ads.ze0
    public final void v5() {
        we(true);
    }

    private lt(int i, int i2, long j, long j2) {
        this.j6 = new do0(true, 65536);
        this.DW = 15000000L;
        this.FH = 30000000L;
        this.Hw = 2500000L;
        this.v5 = 5000000L;
    }
}
