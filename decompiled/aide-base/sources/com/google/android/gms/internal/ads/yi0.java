package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yi0 {
    public final long[] DW;
    public final int[] FH;
    public final int Hw;
    public final int[] Zo;
    public final int j6;
    public final long[] v5;

    public yi0(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        ro0.j6(iArr.length == jArr2.length);
        ro0.j6(jArr.length == jArr2.length);
        ro0.j6(iArr2.length == jArr2.length);
        this.DW = jArr;
        this.FH = iArr;
        this.Hw = i;
        this.v5 = jArr2;
        this.Zo = iArr2;
        this.j6 = jArr.length;
    }

    public final int DW(long j) {
        for (int iXL = ip0.XL(this.v5, j, true, false); iXL < this.v5.length; iXL++) {
            if ((this.Zo[iXL] & 1) != 0) {
                return iXL;
            }
        }
        return -1;
    }

    public final int j6(long j) {
        for (int iFH = ip0.FH(this.v5, j, true, false); iFH >= 0; iFH--) {
            if ((this.Zo[iFH] & 1) != 0) {
                return iFH;
            }
        }
        return -1;
    }
}
