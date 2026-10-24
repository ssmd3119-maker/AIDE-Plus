package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zo0 {
    private int DW;
    private int FH;
    private int Hw;
    private byte[] j6;

    public zo0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public final int j6(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i6 = i / 8;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.FH;
            if (i9 != 0) {
                byte[] bArr = this.j6;
                int i10 = this.DW;
                i5 = ((bArr[i10 + 1] & 255) >>> (8 - i9)) | ((bArr[i10] & 255) << i9);
            } else {
                i5 = this.j6[this.DW];
            }
            i -= 8;
            i7 |= (255 & i5) << i;
            this.DW++;
        }
        if (i > 0) {
            int i11 = this.FH + i;
            byte b = (byte) (255 >> (8 - i));
            if (i11 > 8) {
                byte[] bArr2 = this.j6;
                int i12 = this.DW;
                i4 = (b & (((255 & bArr2[i12 + 1]) >> (16 - i11)) | ((bArr2[i12] & 255) << (i11 - 8)))) | i7;
                this.DW = i12 + 1;
            } else {
                byte[] bArr3 = this.j6;
                int i13 = this.DW;
                i4 = (b & ((255 & bArr3[i13]) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.DW = i13 + 1;
                }
            }
            i7 = i4;
            this.FH = i11 % 8;
        }
        int i14 = this.DW;
        if (i14 >= 0 && (i2 = this.FH) >= 0 && i2 < 8 && (i14 < (i3 = this.Hw) || (i14 == i3 && i2 == 0))) {
            z = true;
        }
        ro0.Hw(z);
        return i7;
    }

    private zo0(byte[] bArr, int i) {
        this.j6 = bArr;
        this.Hw = i;
    }
}
