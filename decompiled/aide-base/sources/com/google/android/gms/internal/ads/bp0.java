package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bp0 {
    private int DW;
    private int FH;
    private int Hw = 0;
    private byte[] j6;

    public bp0(byte[] bArr, int i, int i2) {
        this.j6 = bArr;
        this.FH = i;
        this.DW = i2;
        gn();
    }

    private final boolean FH(int i) {
        if (2 > i || i >= this.DW) {
            return false;
        }
        byte[] bArr = this.j6;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    private final int VH() {
        int i = 0;
        while (!Hw()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? j6(i) : 0);
    }

    private final void gn() {
        int i;
        int i2;
        int i3 = this.FH;
        ro0.Hw(i3 >= 0 && (i = this.Hw) >= 0 && i < 8 && (i3 < (i2 = this.DW) || (i3 == i2 && i == 0)));
    }

    public final void DW(int i) {
        int i2 = this.FH;
        int i3 = (i / 8) + i2;
        this.FH = i3;
        int i4 = this.Hw + (i % 8);
        this.Hw = i4;
        if (i4 > 7) {
            this.FH = i3 + 1;
            this.Hw = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.FH) {
                gn();
                return;
            } else if (FH(i2)) {
                this.FH++;
                i2 += 2;
            }
        }
    }

    public final boolean Hw() {
        return j6(1) == 1;
    }

    public final int Zo() {
        int iVH = VH();
        return (iVH % 2 == 0 ? -1 : 1) * ((iVH + 1) / 2);
    }

    public final int j6(int i) {
        int i2;
        int i3;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = FH(this.FH + 1) ? this.FH + 2 : this.FH + 1;
            int i8 = this.Hw;
            if (i8 != 0) {
                byte[] bArr = this.j6;
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.FH] & 255) << i8);
            } else {
                i3 = this.j6[this.FH];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.FH = i7;
        }
        if (i > 0) {
            int i9 = this.Hw + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = FH(this.FH + 1) ? this.FH + 2 : this.FH + 1;
            if (i9 > 8) {
                byte[] bArr2 = this.j6;
                i2 = (b & (((255 & bArr2[i10]) >> (16 - i9)) | ((bArr2[this.FH] & 255) << (i9 - 8)))) | i5;
                this.FH = i10;
            } else {
                i2 = (b & ((255 & this.j6[this.FH]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.FH = i10;
                }
            }
            i5 = i2;
            this.Hw = i9 % 8;
        }
        gn();
        return i5;
    }

    public final int v5() {
        return VH();
    }
}
