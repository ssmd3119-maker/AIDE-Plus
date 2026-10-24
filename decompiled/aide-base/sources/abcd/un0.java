package abcd;

/* loaded from: classes.dex */
public class un0 implements on0 {
    private static final byte[] Zo = {41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    private int DW;
    private int Hw;
    private byte[] j6 = new byte[48];
    private byte[] FH = new byte[16];
    private byte[] v5 = new byte[16];

    public un0() {
        DW();
    }

    @Override // abcd.on0
    public void DW() {
        this.DW = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.j6;
            if (i == bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.Hw = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.FH;
            if (i2 == bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.v5;
            if (i3 == bArr3.length) {
                return;
            }
            bArr3[i3] = 0;
            i3++;
        }
    }

    @Override // abcd.on0
    public void FH(byte b) {
        byte[] bArr = this.FH;
        int i = this.Hw;
        int i2 = i + 1;
        this.Hw = i2;
        bArr[i] = b;
        if (i2 == 16) {
            gn(bArr);
            VH(this.FH);
            this.Hw = 0;
        }
    }

    @Override // abcd.on0
    public int Hw(byte[] bArr, int i) {
        int length = this.FH.length;
        int i2 = this.Hw;
        byte b = (byte) (length - i2);
        while (true) {
            byte[] bArr2 = this.FH;
            if (i2 >= bArr2.length) {
                gn(bArr2);
                VH(this.FH);
                VH(this.v5);
                System.arraycopy(this.j6, this.DW, bArr, i, 16);
                DW();
                return 16;
            }
            bArr2[i2] = b;
            i2++;
        }
    }

    public void VH(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.j6;
            bArr2[i + 16] = bArr[i];
            bArr2[i + 32] = (byte) (bArr[i] ^ bArr2[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 18; i3++) {
            for (int i4 = 0; i4 < 48; i4++) {
                byte[] bArr3 = this.j6;
                byte b = (byte) (Zo[i2] ^ bArr3[i4]);
                bArr3[i4] = b;
                i2 = b & 255;
            }
            i2 = (i2 + i3) % 256;
        }
    }

    @Override // abcd.on0
    public int Zo() {
        return 16;
    }

    public void gn(byte[] bArr) {
        byte b = this.v5[15];
        for (int i = 0; i < 16; i++) {
            byte[] bArr2 = this.v5;
            bArr2[i] = (byte) (Zo[(b ^ bArr[i]) & 255] ^ bArr2[i]);
            b = bArr2[i];
        }
    }

    @Override // abcd.on0
    public void j6(byte[] bArr, int i, int i2) {
        while (this.Hw != 0 && i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > 16) {
            System.arraycopy(bArr, i, this.FH, 0, 16);
            gn(this.FH);
            VH(this.FH);
            i2 -= 16;
            i += 16;
        }
        while (i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // abcd.on0
    public String v5() {
        return "MD2";
    }
}
