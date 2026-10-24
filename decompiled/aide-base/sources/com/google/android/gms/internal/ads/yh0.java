package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yh0 {
    private static final long[] Hw = {128, 64, 32, 16, 8, 4, 2, 1};
    private int DW;
    private int FH;
    private final byte[] j6 = new byte[8];

    public static long FH(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= Hw[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int Hw(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = Hw;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & i) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public final long DW(fh0 fh0Var, boolean z, boolean z2, int i) {
        if (this.DW == 0) {
            if (!fh0Var.VH(this.j6, 0, 1, z)) {
                return -1L;
            }
            int iHw = Hw(this.j6[0] & 255);
            this.FH = iHw;
            if (iHw == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.DW = 1;
        }
        int i2 = this.FH;
        if (i2 > i) {
            this.DW = 0;
            return -2L;
        }
        if (i2 != 1) {
            fh0Var.readFully(this.j6, 1, i2 - 1);
        }
        this.DW = 0;
        return FH(this.j6, this.FH, z2);
    }

    public final void j6() {
        this.DW = 0;
        this.FH = 0;
    }

    public final int v5() {
        return this.FH;
    }
}
