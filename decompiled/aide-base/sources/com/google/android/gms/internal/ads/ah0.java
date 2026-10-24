package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ah0 implements kh0 {
    public final int[] DW;
    public final long[] FH;
    public final long[] Hw;
    private final long Zo;
    public final int j6;
    public final long[] v5;

    public ah0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.DW = iArr;
        this.FH = jArr;
        this.Hw = jArr2;
        this.v5 = jArr3;
        int length = iArr.length;
        this.j6 = length;
        if (length > 0) {
            this.Zo = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.Zo = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.kh0
    public final boolean Hw() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kh0
    public final long gn() {
        return this.Zo;
    }

    public final int j6(long j) {
        return ip0.FH(this.v5, j, true, true);
    }

    @Override // com.google.android.gms.internal.ads.kh0
    public final long v5(long j) {
        return this.FH[j6(j)];
    }
}
