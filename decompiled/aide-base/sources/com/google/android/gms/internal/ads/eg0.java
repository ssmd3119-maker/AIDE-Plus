package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class eg0 implements c0 {
    private int DW;
    private final int FH;
    private final float Hw;
    private int j6;

    public eg0() {
        this(2500, 1, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final int DW() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final int J8() {
        return this.j6;
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final void j6(e3 e3Var) throws e3 {
        int i = this.DW + 1;
        this.DW = i;
        int i2 = this.j6;
        this.j6 = i2 + ((int) (i2 * this.Hw));
        if (!(i <= this.FH)) {
            throw e3Var;
        }
    }

    private eg0(int i, int i2, float f) {
        this.j6 = 2500;
        this.FH = 1;
        this.Hw = 1.0f;
    }
}
