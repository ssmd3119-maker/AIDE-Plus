package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ii0 implements fi0 {
    private final int DW;
    private final int FH;
    private int Hw;
    private final ap0 j6;
    private int v5;

    public ii0(bi0 bi0Var) {
        ap0 ap0Var = bi0Var.sg;
        this.j6 = ap0Var;
        ap0Var.EQ(12);
        this.FH = this.j6.a8() & 255;
        this.DW = this.j6.a8();
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final boolean DW() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final int FH() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final int j6() {
        int i = this.FH;
        if (i == 8) {
            return this.j6.VH();
        }
        if (i == 16) {
            return this.j6.gn();
        }
        int i2 = this.Hw;
        this.Hw = i2 + 1;
        if (i2 % 2 != 0) {
            return this.v5 & 15;
        }
        int iVH = this.j6.VH();
        this.v5 = iVH;
        return (iVH & 240) >> 4;
    }
}
