package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xh0 {
    private int DW;
    private final ap0 j6 = new ap0(8);

    private final long DW(fh0 fh0Var) {
        int i = 0;
        fh0Var.v5(this.j6.j6, 0, 1);
        int i2 = this.j6.j6[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (i3 ^ (-1));
        fh0Var.v5(this.j6.j6, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.j6.j6[i] & 255) + (i5 << 8);
        }
        this.DW += i4 + 1;
        return i5;
    }

    public final boolean j6(fh0 fh0Var) {
        long jZo = fh0Var.Zo();
        long j = 1024;
        if (jZo != -1 && jZo <= 1024) {
            j = jZo;
        }
        int i = (int) j;
        fh0Var.v5(this.j6.j6, 0, 4);
        long jJ3 = this.j6.j3();
        this.DW = 4;
        while (jJ3 != 440786851) {
            int i2 = this.DW + 1;
            this.DW = i2;
            if (i2 == i) {
                return false;
            }
            fh0Var.v5(this.j6.j6, 0, 1);
            jJ3 = ((jJ3 << 8) & (-256)) | (this.j6.j6[0] & 255);
        }
        long jDW = DW(fh0Var);
        long j2 = this.DW;
        if (jDW != Long.MIN_VALUE && (jZo == -1 || j2 + jDW < jZo)) {
            while (true) {
                int i3 = this.DW;
                long j3 = j2 + jDW;
                if (i3 < j3) {
                    if (DW(fh0Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jDW2 = DW(fh0Var);
                    if (jDW2 < 0 || jDW2 > 2147483647L) {
                        break;
                    }
                    if (jDW2 != 0) {
                        fh0Var.gn((int) jDW2);
                        this.DW = (int) (this.DW + jDW2);
                    }
                } else if (i3 == j3) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
