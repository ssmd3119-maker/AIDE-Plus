package com.jcraft.jsch;

/* loaded from: classes.dex */
public class Packet {
    private static Random FH;
    byte[] DW = new byte[4];
    Buffer j6;

    public Packet(Buffer buffer) {
        this.j6 = buffer;
    }

    static void Hw(Random random) {
        FH = random;
    }

    void DW(int i) {
        int i2 = this.j6.FH;
        int i3 = (-i2) & (i - 1);
        if (i3 < i) {
            i3 += i;
        }
        int i4 = (i2 + i3) - 4;
        byte[] bArr = this.DW;
        bArr[0] = (byte) (i4 >>> 24);
        bArr[1] = (byte) (i4 >>> 16);
        bArr[2] = (byte) (i4 >>> 8);
        bArr[3] = (byte) i4;
        System.arraycopy(bArr, 0, this.j6.DW, 0, 4);
        this.j6.DW[4] = (byte) i3;
        synchronized (FH) {
            FH.j6(this.j6.DW, this.j6.FH, i3);
        }
        this.j6.ei(i3);
    }

    public void FH() {
        this.j6.FH = 5;
    }

    void Zo(byte b, int i, int i2, int i3) {
        byte[] bArr = this.j6.DW;
        System.arraycopy(bArr, i2, bArr, 14, i3);
        Buffer buffer = this.j6;
        buffer.DW[5] = b;
        buffer.FH = 6;
        buffer.a8(i);
        this.j6.a8(i3);
        this.j6.FH = i3 + 5 + 9;
    }

    Buffer j6() {
        return this.j6;
    }

    int v5(int i, int i2, int i3) {
        int i4 = i + 5 + 9;
        int i5 = (-i4) & (i2 - 1);
        if (i5 < i2) {
            i5 += i2;
        }
        int i6 = i5 + i4 + i3 + 32;
        Buffer buffer = this.j6;
        byte[] bArr = buffer.DW;
        int length = bArr.length;
        int i7 = buffer.FH;
        if (length < (((i6 + i7) - 5) - 9) - i) {
            byte[] bArr2 = new byte[(((i7 + i6) - 5) - 9) - i];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.j6.DW = bArr2;
        }
        byte[] bArr3 = this.j6.DW;
        System.arraycopy(bArr3, i4, bArr3, i6, ((r6.FH - 5) - 9) - i);
        Buffer buffer2 = this.j6;
        buffer2.FH = 10;
        buffer2.a8(i);
        this.j6.FH = i4;
        return i6;
    }
}
