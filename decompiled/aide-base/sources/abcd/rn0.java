package abcd;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class rn0 implements on0 {
    private static final byte[] j3 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private int VH;
    private long gn;
    private byte[] tp;
    private byte[] j6 = new byte[32];
    private byte[] DW = new byte[32];
    private byte[] FH = new byte[32];
    private byte[] Hw = new byte[32];
    private byte[][] v5 = (byte[][]) Array.newInstance((Class<?>) byte.class, 4, 32);
    private byte[] Zo = new byte[32];
    private ln0 u7 = new fo0();
    private byte[] EQ = new byte[32];
    byte[] we = new byte[8];
    short[] J0 = new short[16];
    short[] J8 = new short[16];
    byte[] Ws = new byte[32];
    byte[] QX = new byte[32];
    byte[] XL = new byte[32];
    byte[] aM = new byte[32];

    public rn0() {
        byte[] bArrGn = fo0.gn("D-A");
        this.tp = bArrGn;
        this.u7.j6(true, new to0(null, bArrGn));
        DW();
    }

    private void EQ(short[] sArr, byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            bArr[i2 + 1] = (byte) (sArr[i] >> 8);
            bArr[i2] = (byte) sArr[i];
        }
    }

    private void J0(byte[] bArr) {
        tp(bArr, this.J0);
        short[] sArr = this.J8;
        short[] sArr2 = this.J0;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        EQ(this.J8, bArr);
    }

    private byte[] VH(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.we[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.we, 0, bArr, 24, 8);
        return bArr;
    }

    private void Ws(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.Hw;
            if (i == bArr2.length) {
                return;
            }
            int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
            bArr2[i] = (byte) i3;
            i2 = i3 >>> 8;
            i++;
        }
    }

    private void gn(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.u7.j6(true, new so0(bArr));
        this.u7.DW(bArr3, i2, bArr2, i);
    }

    private void tp(byte[] bArr, short[] sArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
        }
    }

    private byte[] u7(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte[] bArr2 = this.EQ;
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
        }
        return this.EQ;
    }

    private void we() {
        uo0.Zo(this.gn * 8, this.DW, 0);
        while (this.VH != 0) {
            FH((byte) 0);
        }
        J8(this.DW, 0);
        J8(this.Hw, 0);
    }

    @Override // abcd.on0
    public void DW() {
        this.gn = 0L;
        this.VH = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.j6;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.DW;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.FH;
            if (i3 >= bArr3.length) {
                break;
            }
            bArr3[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[][] bArr4 = this.v5;
            if (i4 >= bArr4[1].length) {
                break;
            }
            bArr4[1][i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[][] bArr5 = this.v5;
            if (i5 >= bArr5[3].length) {
                break;
            }
            bArr5[3][i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr6 = this.Hw;
            if (i6 >= bArr6.length) {
                break;
            }
            bArr6[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr7 = this.Zo;
            if (i7 >= bArr7.length) {
                byte[] bArr8 = j3;
                System.arraycopy(bArr8, 0, this.v5[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i7] = 0;
                i7++;
            }
        }
    }

    @Override // abcd.on0
    public void FH(byte b) {
        byte[] bArr = this.Zo;
        int i = this.VH;
        int i2 = i + 1;
        this.VH = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            Ws(bArr);
            J8(this.Zo, 0);
            this.VH = 0;
        }
        this.gn++;
    }

    @Override // abcd.on0
    public int Hw(byte[] bArr, int i) {
        we();
        byte[] bArr2 = this.j6;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        DW();
        return 32;
    }

    public void J8(byte[] bArr, int i) {
        System.arraycopy(bArr, i, this.FH, 0, 32);
        System.arraycopy(this.j6, 0, this.QX, 0, 32);
        System.arraycopy(this.FH, 0, this.XL, 0, 32);
        for (int i2 = 0; i2 < 32; i2++) {
            this.aM[i2] = (byte) (this.QX[i2] ^ this.XL[i2]);
        }
        gn(u7(this.aM), this.Ws, 0, this.j6, 0);
        for (int i3 = 1; i3 < 4; i3++) {
            byte[] bArr2 = this.QX;
            VH(bArr2);
            for (int i4 = 0; i4 < 32; i4++) {
                this.QX[i4] = (byte) (bArr2[i4] ^ this.v5[i3][i4]);
            }
            byte[] bArr3 = this.XL;
            VH(bArr3);
            VH(bArr3);
            this.XL = bArr3;
            for (int i5 = 0; i5 < 32; i5++) {
                this.aM[i5] = (byte) (this.QX[i5] ^ this.XL[i5]);
            }
            int i6 = i3 * 8;
            gn(u7(this.aM), this.Ws, i6, this.j6, i6);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            J0(this.Ws);
        }
        for (int i8 = 0; i8 < 32; i8++) {
            byte[] bArr4 = this.Ws;
            bArr4[i8] = (byte) (bArr4[i8] ^ this.FH[i8]);
        }
        J0(this.Ws);
        for (int i9 = 0; i9 < 32; i9++) {
            byte[] bArr5 = this.Ws;
            bArr5[i9] = (byte) (this.j6[i9] ^ bArr5[i9]);
        }
        for (int i10 = 0; i10 < 61; i10++) {
            J0(this.Ws);
        }
        byte[] bArr6 = this.Ws;
        byte[] bArr7 = this.j6;
        System.arraycopy(bArr6, 0, bArr7, 0, bArr7.length);
    }

    @Override // abcd.on0
    public int Zo() {
        return 32;
    }

    @Override // abcd.on0
    public void j6(byte[] bArr, int i, int i2) {
        while (this.VH != 0 && i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.Zo;
            if (i2 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            Ws(this.Zo);
            J8(this.Zo, 0);
            byte[] bArr3 = this.Zo;
            i += bArr3.length;
            i2 -= bArr3.length;
            this.gn += bArr3.length;
        }
        while (i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // abcd.on0
    public String v5() {
        return "GOST3411";
    }
}
