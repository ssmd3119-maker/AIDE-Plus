package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class y30 {
    private int DW;
    private int FH;
    private final byte[] j6 = new byte[256];

    public y30(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.j6[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.j6;
            i2 = (i2 + bArr2[i3] + bArr[i3 % bArr.length]) & 255;
            byte b = bArr2[i3];
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.DW = 0;
        this.FH = 0;
    }

    public final void j6(byte[] bArr) {
        int i = this.DW;
        int i2 = this.FH;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.j6;
            i2 = (i2 + bArr2[i]) & 255;
            byte b = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.DW = i;
        this.FH = i2;
    }
}
