package com.jcraft.jsch;

/* loaded from: classes.dex */
public class Buffer {
    byte[] DW;
    int FH;
    int Hw;
    final byte[] j6;

    public Buffer(int i) {
        this.j6 = new byte[4];
        this.DW = new byte[i];
        this.FH = 0;
        this.Hw = 0;
    }

    static Buffer DW(byte[][] bArr) {
        int length = bArr.length * 4;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        Buffer buffer = new Buffer(length);
        for (byte[] bArr3 : bArr) {
            buffer.er(bArr3);
        }
        return buffer;
    }

    void BT() {
        this.Hw = 0;
    }

    public long EQ() {
        return ((u7() & 4294967295L) << 32) | (4294967295L & u7());
    }

    public int FH() {
        byte[] bArr = this.DW;
        int i = this.Hw;
        this.Hw = i + 1;
        return bArr[i] & 255;
    }

    public int Hw(int i) {
        int i2 = this.Hw;
        this.Hw = i + i2;
        return i2;
    }

    public byte[] J0() {
        int iU7 = (u7() + 7) / 8;
        byte[] bArr = new byte[iU7];
        Zo(bArr, 0, iU7);
        if ((bArr[0] & 128) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[iU7 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, 0, bArr2, 1, iU7);
        return bArr2;
    }

    public int J8() {
        return this.Hw;
    }

    public void Mr(byte[] bArr) {
        U2(bArr, 0, bArr.length);
    }

    public void P8() {
        int i = this.Hw;
        if (i == 0) {
            return;
        }
        byte[] bArr = this.DW;
        System.arraycopy(bArr, i, bArr, 0, this.FH - i);
        this.FH -= this.Hw;
        this.Hw = 0;
    }

    public byte[] QX() {
        int iU7 = u7();
        if (iU7 < 0 || iU7 > 262144) {
            iU7 = 262144;
        }
        byte[] bArr = new byte[iU7];
        Zo(bArr, 0, iU7);
        return bArr;
    }

    public void U2(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.DW, this.FH, i2);
        this.FH += i2;
    }

    byte[][] VH(int i, String str) throws JSchException {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int iU7 = u7();
            if (tp() < iU7) {
                throw new JSchException(str);
            }
            bArr[i2] = new byte[iU7];
            v5(bArr[i2]);
        }
        return bArr;
    }

    int Ws() {
        return ((FH() << 8) & 65280) | (FH() & 255);
    }

    byte[] XL(int[] iArr, int[] iArr2) {
        int iU7 = u7();
        iArr[0] = Hw(iU7);
        iArr2[0] = iU7;
        return this.DW;
    }

    void Zo(byte[] bArr, int i, int i2) {
        System.arraycopy(this.DW, this.Hw, bArr, i, i2);
        this.Hw += i2;
    }

    public void a8(int i) {
        byte[] bArr = this.j6;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        System.arraycopy(bArr, 0, this.DW, this.FH, 4);
        this.FH += 4;
    }

    public long aM() {
        return (((((FH() << 8) & 65280) | (FH() & 255)) << 16) & (-65536)) | (((65280 & (FH() << 8)) | (FH() & 255)) & 65535);
    }

    void ei(int i) {
        this.FH += i;
    }

    public void er(byte[] bArr) {
        yS(bArr, 0, bArr.length);
    }

    public void gW() {
        this.FH = 0;
        this.Hw = 0;
    }

    byte gn() {
        return this.DW[5];
    }

    public void j3(byte b) {
        byte[] bArr = this.DW;
        int i = this.FH;
        this.FH = i + 1;
        bArr[i] = b;
    }

    void j6(int i) {
        int i2 = this.FH + i + 84;
        byte[] bArr = this.DW;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(this.DW, 0, bArr2, 0, this.FH);
            this.DW = bArr2;
        }
    }

    public void lg(long j) {
        byte[] bArr = this.j6;
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        System.arraycopy(bArr, 0, this.DW, this.FH, 4);
        byte[] bArr2 = this.j6;
        bArr2[0] = (byte) (j >>> 24);
        bArr2[1] = (byte) (j >>> 16);
        bArr2[2] = (byte) (j >>> 8);
        bArr2[3] = (byte) j;
        System.arraycopy(bArr2, 0, this.DW, this.FH + 4, 4);
        this.FH += 8;
    }

    public void rN(byte[] bArr) {
        int length = bArr.length;
        if ((bArr[0] & 128) != 0) {
            a8(length + 1);
            j3((byte) 0);
        } else {
            a8(length);
        }
        Mr(bArr);
    }

    public int tp() {
        return this.FH - this.Hw;
    }

    public int u7() {
        return ((Ws() << 16) & (-65536)) | (Ws() & 65535);
    }

    public void v5(byte[] bArr) {
        Zo(bArr, 0, bArr.length);
    }

    public void vy(int i) {
        this.Hw = i;
    }

    public byte[] we() {
        int iU7 = u7();
        if (iU7 < 0 || iU7 > 8192) {
            iU7 = 8192;
        }
        byte[] bArr = new byte[iU7];
        Zo(bArr, 0, iU7);
        return bArr;
    }

    public void yS(byte[] bArr, int i, int i2) {
        a8(i2);
        U2(bArr, i, i2);
    }

    public Buffer(byte[] bArr) {
        this.j6 = new byte[4];
        this.DW = bArr;
        this.FH = 0;
        this.Hw = 0;
    }

    public Buffer() {
        this(20480);
    }
}
