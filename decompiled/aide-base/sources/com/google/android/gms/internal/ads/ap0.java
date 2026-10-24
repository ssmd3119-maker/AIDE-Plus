package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ap0 {
    private int DW;
    private int FH;
    public byte[] j6;

    public ap0() {
    }

    public final int DW() {
        return this.DW;
    }

    public final void EQ(int i) {
        ro0.j6(i >= 0 && i <= this.FH);
        this.DW = i;
    }

    public final int FH() {
        return this.FH;
    }

    public final int Hw() {
        byte[] bArr = this.j6;
        int i = this.DW;
        int i2 = i + 1;
        this.DW = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i2 + 1;
        this.DW = i4;
        int i5 = i3 | ((bArr[i2] & 255) << 16);
        int i6 = i4 + 1;
        this.DW = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.DW = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    public final void J0(int i) {
        EQ(this.DW + i);
    }

    public final String J8(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.DW + i) - 1;
        String str = new String(this.j6, this.DW, (i2 >= this.FH || this.j6[i2] != 0) ? i : i - 1);
        this.DW += i;
        return str;
    }

    public final long Mr() {
        byte[] bArr = this.j6;
        int i = this.DW + 1;
        this.DW = i;
        long j = bArr[r1] & 255;
        int i2 = i + 1;
        this.DW = i2;
        long j2 = j | ((bArr[i] & 255) << 8);
        int i3 = i2 + 1;
        this.DW = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 16);
        this.DW = i3 + 1;
        return ((bArr[i3] & 255) << 24) | j3;
    }

    public final void QX(byte[] bArr, int i, int i2) {
        System.arraycopy(this.j6, this.DW, bArr, i, i2);
        this.DW += i2;
    }

    public final int U2() {
        byte[] bArr = this.j6;
        int i = this.DW;
        int i2 = i + 1;
        this.DW = i2;
        int i3 = (bArr[i] & 255) << 8;
        int i4 = i2 + 1;
        this.DW = i4;
        int i5 = (bArr[i2] & 255) | i3;
        this.DW = i4 + 2;
        return i5;
    }

    public final int VH() {
        byte[] bArr = this.j6;
        int i = this.DW;
        this.DW = i + 1;
        return bArr[i] & 255;
    }

    public final void Ws(byte[] bArr, int i) {
        this.j6 = bArr;
        this.FH = i;
        this.DW = 0;
    }

    public final int XL() {
        return this.FH - this.DW;
    }

    public final short Zo() {
        byte[] bArr = this.j6;
        int i = this.DW;
        int i2 = i + 1;
        this.DW = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.DW = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final int a8() {
        int iHw = Hw();
        if (iHw >= 0) {
            return iHw;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iHw);
        throw new IllegalStateException(sb.toString());
    }

    public final int aM() {
        byte[] bArr = this.j6;
        int i = this.DW;
        int i2 = i + 1;
        this.DW = i2;
        int i3 = bArr[i] & 255;
        this.DW = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final int gn() {
        byte[] bArr = this.j6;
        int i = this.DW;
        int i2 = i + 1;
        this.DW = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.DW = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final long j3() {
        byte[] bArr = this.j6;
        int i = this.DW + 1;
        this.DW = i;
        long j = (bArr[r1] & 255) << 24;
        int i2 = i + 1;
        this.DW = i2;
        long j2 = j | ((bArr[i] & 255) << 16);
        int i3 = i2 + 1;
        this.DW = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 8);
        this.DW = i3 + 1;
        return (bArr[i3] & 255) | j3;
    }

    public final int j6() {
        byte[] bArr = this.j6;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final long lg() {
        long jV5 = v5();
        if (jV5 >= 0) {
            return jV5;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jV5);
        throw new IllegalStateException(sb.toString());
    }

    public final String rN() {
        if (XL() == 0) {
            return null;
        }
        int i = this.DW;
        while (i < this.FH && this.j6[i] != 0) {
            i++;
        }
        byte[] bArr = this.j6;
        int i2 = this.DW;
        String str = new String(bArr, i2, i - i2);
        this.DW = i;
        if (i < this.FH) {
            this.DW = i + 1;
        }
        return str;
    }

    public final void tp(int i) {
        Ws(j6() < i ? new byte[i] : this.j6, i);
    }

    public final void u7() {
        this.DW = 0;
        this.FH = 0;
    }

    public final long v5() {
        byte[] bArr = this.j6;
        int i = this.DW + 1;
        this.DW = i;
        long j = (bArr[r1] & 255) << 56;
        int i2 = i + 1;
        this.DW = i2;
        long j2 = j | ((bArr[i] & 255) << 48);
        int i3 = i2 + 1;
        this.DW = i3;
        long j3 = j2 | ((bArr[i2] & 255) << 40);
        int i4 = i3 + 1;
        this.DW = i4;
        long j4 = j3 | ((bArr[i3] & 255) << 32);
        int i5 = i4 + 1;
        this.DW = i5;
        long j5 = j4 | ((bArr[i4] & 255) << 24);
        int i6 = i5 + 1;
        this.DW = i6;
        long j6 = j5 | ((bArr[i5] & 255) << 16);
        int i7 = i6 + 1;
        this.DW = i7;
        long j7 = j6 | ((bArr[i6] & 255) << 8);
        this.DW = i7 + 1;
        return (bArr[i7] & 255) | j7;
    }

    public final void we(int i) {
        ro0.j6(i >= 0 && i <= this.j6.length);
        this.FH = i;
    }

    public ap0(int i) {
        this.j6 = new byte[i];
        this.FH = i;
    }

    public ap0(byte[] bArr) {
        this.j6 = bArr;
        this.FH = bArr.length;
    }
}
