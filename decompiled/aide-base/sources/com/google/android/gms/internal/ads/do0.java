package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class do0 implements vn0 {
    private final int DW;
    private final un0[] FH;
    private int Hw;
    private un0[] VH;
    private int Zo;
    private final boolean j6;
    private int v5;

    public do0(boolean z, int i) {
        this(true, 65536, 0);
    }

    @Override // com.google.android.gms.internal.ads.vn0
    public final int DW() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.vn0
    public final synchronized void FH() {
        int iMax = Math.max(0, ip0.U2(this.Hw, this.DW) - this.v5);
        if (iMax >= this.Zo) {
            return;
        }
        Arrays.fill(this.VH, iMax, this.Zo, (Object) null);
        this.Zo = iMax;
    }

    @Override // com.google.android.gms.internal.ads.vn0
    public final synchronized void Hw(un0[] un0VarArr) {
        if (this.Zo + un0VarArr.length >= this.VH.length) {
            this.VH = (un0[]) Arrays.copyOf(this.VH, Math.max(this.VH.length << 1, this.Zo + un0VarArr.length));
        }
        for (un0 un0Var : un0VarArr) {
            ro0.j6(un0Var.j6 == null || un0Var.j6.length == this.DW);
            un0[] un0VarArr2 = this.VH;
            int i = this.Zo;
            this.Zo = i + 1;
            un0VarArr2[i] = un0Var;
        }
        this.v5 -= un0VarArr.length;
        notifyAll();
    }

    public final synchronized void VH(int i) {
        boolean z = i < this.Hw;
        this.Hw = i;
        if (z) {
            FH();
        }
    }

    public final synchronized void Zo() {
        if (this.j6) {
            VH(0);
        }
    }

    public final synchronized int gn() {
        return this.v5 * this.DW;
    }

    @Override // com.google.android.gms.internal.ads.vn0
    public final synchronized un0 j6() {
        un0 un0Var;
        this.v5++;
        if (this.Zo > 0) {
            un0[] un0VarArr = this.VH;
            int i = this.Zo - 1;
            this.Zo = i;
            un0Var = un0VarArr[i];
            this.VH[i] = null;
        } else {
            un0Var = new un0(new byte[this.DW], 0);
        }
        return un0Var;
    }

    @Override // com.google.android.gms.internal.ads.vn0
    public final synchronized void v5(un0 un0Var) {
        this.FH[0] = un0Var;
        Hw(this.FH);
    }

    private do0(boolean z, int i, int i2) {
        ro0.j6(true);
        ro0.j6(true);
        this.j6 = true;
        this.DW = 65536;
        this.Zo = 0;
        this.VH = new un0[100];
        this.FH = new un0[1];
    }
}
