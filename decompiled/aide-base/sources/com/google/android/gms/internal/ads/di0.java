package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class di0 {
    public int DW;
    public int FH;
    public long Hw;
    private final ap0 VH;
    private final ap0 Zo;
    private int gn;
    public final int j6;
    private int u7;
    private final boolean v5;

    public di0(ap0 ap0Var, ap0 ap0Var2, boolean z) {
        this.VH = ap0Var;
        this.Zo = ap0Var2;
        this.v5 = z;
        ap0Var2.EQ(12);
        this.j6 = ap0Var2.a8();
        ap0Var.EQ(12);
        this.u7 = ap0Var.a8();
        ro0.v5(ap0Var.Hw() == 1, "first_chunk must be 1");
        this.DW = -1;
    }

    public final boolean j6() {
        int i = this.DW + 1;
        this.DW = i;
        if (i == this.j6) {
            return false;
        }
        this.Hw = this.v5 ? this.Zo.lg() : this.Zo.j3();
        if (this.DW == this.gn) {
            this.FH = this.VH.a8();
            this.VH.J0(4);
            int i2 = this.u7 - 1;
            this.u7 = i2;
            this.gn = i2 > 0 ? this.VH.a8() - 1 : -1;
        }
        return true;
    }
}
