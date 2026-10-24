package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fm0 implements em0 {
    private final ah0 j6;

    public fm0(ah0 ah0Var) {
        this.j6 = ah0Var;
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final int DW(long j, long j2) {
        return this.j6.j6(j);
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final int FH(long j) {
        return this.j6.j6;
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final long Hw(int i) {
        return this.j6.v5[i];
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final pm0 VH(int i) {
        return new pm0(null, this.j6.FH[i], r0.DW[i]);
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final long Zo(int i, long j) {
        return this.j6.Hw[i];
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final boolean j6() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final int v5() {
        return 0;
    }
}
