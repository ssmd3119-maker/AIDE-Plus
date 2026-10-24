package com.jcraft.jsch.jcraft;

import abcd.zx;

/* loaded from: classes.dex */
public class Compression implements com.jcraft.jsch.Compression {
    private byte[] FH;
    private byte[] DW = new byte[4096];
    private zx j6 = new zx();

    @Override // com.jcraft.jsch.Compression
    public void DW(int i, int i2) {
        if (i == 1) {
            this.j6.DW(i2);
        } else if (i == 0) {
            this.j6.VH();
            this.FH = new byte[4096];
        }
    }

    @Override // com.jcraft.jsch.Compression
    public byte[] FH(byte[] bArr, int i, int[] iArr) {
        zx zxVar = this.j6;
        zxVar.j6 = bArr;
        zxVar.DW = i;
        zxVar.FH = iArr[0];
        int i2 = 0;
        while (true) {
            zx zxVar2 = this.j6;
            zxVar2.v5 = this.DW;
            zxVar2.Zo = 0;
            zxVar2.VH = 4096;
            int iZo = zxVar2.Zo(1);
            if (iZo == -5) {
                if (i2 > bArr.length - i) {
                    byte[] bArr2 = new byte[i2 + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    System.arraycopy(this.FH, 0, bArr2, i, i2);
                    bArr = bArr2;
                } else {
                    System.arraycopy(this.FH, 0, bArr, i, i2);
                }
                iArr[0] = i2;
                return bArr;
            }
            if (iZo != 0) {
                System.err.println("uncompress: inflate returnd " + iZo);
                return null;
            }
            byte[] bArr3 = this.FH;
            int length = bArr3.length;
            int i3 = i2 + 4096;
            int i4 = this.j6.VH;
            if (length < i3 - i4) {
                int length2 = bArr3.length * 2;
                if (length2 < i3 - i4) {
                    length2 = i3 - i4;
                }
                byte[] bArr4 = new byte[length2];
                System.arraycopy(this.FH, 0, bArr4, 0, i2);
                this.FH = bArr4;
            }
            System.arraycopy(this.DW, 0, this.FH, i2, 4096 - this.j6.VH);
            i2 += 4096 - this.j6.VH;
            iArr[0] = i2;
        }
    }

    @Override // com.jcraft.jsch.Compression
    public byte[] j6(byte[] bArr, int i, int[] iArr) {
        zx zxVar = this.j6;
        zxVar.j6 = bArr;
        zxVar.DW = i;
        zxVar.FH = iArr[0] - i;
        do {
            zx zxVar2 = this.j6;
            zxVar2.v5 = this.DW;
            zxVar2.Zo = 0;
            zxVar2.VH = 4096;
            int iJ6 = zxVar2.j6(1);
            if (iJ6 != 0) {
                System.err.println("compress: deflate returnd " + iJ6);
            } else {
                int i2 = 4096 - this.j6.VH;
                int i3 = i + i2;
                int i4 = i3 + 52;
                if (bArr.length < i4) {
                    byte[] bArr2 = new byte[i4 * 2];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    bArr = bArr2;
                }
                System.arraycopy(this.DW, 0, bArr, i, i2);
                i = i3;
            }
        } while (this.j6.VH == 0);
        iArr[0] = i;
        return bArr;
    }
}
