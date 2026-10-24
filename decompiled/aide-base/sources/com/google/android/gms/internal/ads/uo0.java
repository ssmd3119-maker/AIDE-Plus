package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class uo0 {
    private long[] DW;
    private int j6;

    public uo0() {
        this(32);
    }

    public final long DW(int i) {
        if (i >= 0 && i < this.j6) {
            return this.DW[i];
        }
        int i2 = this.j6;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int FH() {
        return this.j6;
    }

    public final void j6(long j) {
        int i = this.j6;
        long[] jArr = this.DW;
        if (i == jArr.length) {
            this.DW = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.DW;
        int i2 = this.j6;
        this.j6 = i2 + 1;
        jArr2[i2] = j;
    }

    private uo0(int i) {
        this.DW = new long[32];
    }
}
