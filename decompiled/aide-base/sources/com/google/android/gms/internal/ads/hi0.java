package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hi0 implements fi0 {
    private final int DW;
    private final ap0 FH;
    private final int j6;

    public hi0(bi0 bi0Var) {
        ap0 ap0Var = bi0Var.sg;
        this.FH = ap0Var;
        ap0Var.EQ(12);
        this.j6 = this.FH.a8();
        this.DW = this.FH.a8();
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final boolean DW() {
        return this.j6 != 0;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final int FH() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final int j6() {
        int i = this.j6;
        return i == 0 ? this.FH.a8() : i;
    }
}
