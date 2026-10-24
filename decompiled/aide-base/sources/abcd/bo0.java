package abcd;

/* loaded from: classes.dex */
public class bo0 extends sn0 {
    static final int[] J8 = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int EQ;
    private int Hw;
    private int J0;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int u7;
    private int v5;
    private int[] we = new int[64];

    public bo0() {
        DW();
    }

    private int EQ(int i, int i2, int i3) {
        return ((i ^ (-1)) & i3) ^ (i2 & i);
    }

    private int J0(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private int J8(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private int QX(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    private int Ws(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private int we(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    @Override // abcd.sn0, abcd.on0
    public void DW() {
        super.DW();
        this.Hw = -1056596264;
        this.v5 = 914150663;
        this.Zo = 812702999;
        this.VH = -150054599;
        this.gn = -4191439;
        this.u7 = 1750603025;
        this.tp = 1694076839;
        this.EQ = -1090891868;
        this.J0 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.we;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // abcd.on0
    public int Hw(byte[] bArr, int i) {
        VH();
        uo0.FH(this.Hw, bArr, i);
        uo0.FH(this.v5, bArr, i + 4);
        uo0.FH(this.Zo, bArr, i + 8);
        uo0.FH(this.VH, bArr, i + 12);
        uo0.FH(this.gn, bArr, i + 16);
        uo0.FH(this.u7, bArr, i + 20);
        uo0.FH(this.tp, bArr, i + 24);
        DW();
        return 28;
    }

    @Override // abcd.on0
    public int Zo() {
        return 28;
    }

    @Override // abcd.sn0
    public void gn() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.we;
            int iQX = QX(iArr[i - 2]);
            int[] iArr2 = this.we;
            iArr[i] = iQX + iArr2[i - 7] + Ws(iArr2[i - 15]) + this.we[i - 16];
        }
        int iJ0 = this.Hw;
        int iJ02 = this.v5;
        int iJ03 = this.Zo;
        int iJ04 = this.VH;
        int i2 = this.gn;
        int i3 = this.u7;
        int i4 = this.tp;
        int i5 = this.EQ;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iJ8 = i5 + J8(i2) + EQ(i2, i3, i4) + J8[i6] + this.we[i6];
            int i8 = iJ04 + iJ8;
            int iJ05 = iJ8 + J0(iJ0) + we(iJ0, iJ02, iJ03);
            int i9 = i6 + 1;
            int iJ82 = i4 + J8(i8) + EQ(i8, i2, i3) + J8[i9] + this.we[i9];
            int i10 = iJ03 + iJ82;
            int iJ06 = iJ82 + J0(iJ05) + we(iJ05, iJ0, iJ02);
            int i11 = i9 + 1;
            int iJ83 = i3 + J8(i10) + EQ(i10, i8, i2) + J8[i11] + this.we[i11];
            int i12 = iJ02 + iJ83;
            int iJ07 = iJ83 + J0(iJ06) + we(iJ06, iJ05, iJ0);
            int i13 = i11 + 1;
            int iJ84 = i2 + J8(i12) + EQ(i12, i10, i8) + J8[i13] + this.we[i13];
            int i14 = iJ0 + iJ84;
            int iJ08 = iJ84 + J0(iJ07) + we(iJ07, iJ06, iJ05);
            int i15 = i13 + 1;
            int iJ85 = i8 + J8(i14) + EQ(i14, i12, i10) + J8[i15] + this.we[i15];
            i5 = iJ05 + iJ85;
            iJ04 = iJ85 + J0(iJ08) + we(iJ08, iJ07, iJ06);
            int i16 = i15 + 1;
            int iJ86 = i10 + J8(i5) + EQ(i5, i14, i12) + J8[i16] + this.we[i16];
            i4 = iJ06 + iJ86;
            iJ03 = iJ86 + J0(iJ04) + we(iJ04, iJ08, iJ07);
            int i17 = i16 + 1;
            int iJ87 = i12 + J8(i4) + EQ(i4, i5, i14) + J8[i17] + this.we[i17];
            i3 = iJ07 + iJ87;
            iJ02 = iJ87 + J0(iJ03) + we(iJ03, iJ04, iJ08);
            int i18 = i17 + 1;
            int iJ88 = i14 + J8(i3) + EQ(i3, i4, i5) + J8[i18] + this.we[i18];
            i2 = iJ08 + iJ88;
            iJ0 = iJ88 + J0(iJ02) + we(iJ02, iJ03, iJ04);
            i6 = i18 + 1;
        }
        this.Hw += iJ0;
        this.v5 += iJ02;
        this.Zo += iJ03;
        this.VH += iJ04;
        this.gn += i2;
        this.u7 += i3;
        this.tp += i4;
        this.EQ += i5;
        this.J0 = 0;
        for (int i19 = 0; i19 < 16; i19++) {
            this.we[i19] = 0;
        }
    }

    @Override // abcd.sn0
    public void tp(byte[] bArr, int i) {
        int i2 = bArr[i] << 24;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = (bArr[i5 + 1] & 255) | i4 | ((bArr[i5] & 255) << 8);
        int[] iArr = this.we;
        int i7 = this.J0;
        iArr[i7] = i6;
        int i8 = i7 + 1;
        this.J0 = i8;
        if (i8 == 16) {
            gn();
        }
    }

    @Override // abcd.sn0
    public void u7(long j) {
        if (this.J0 > 14) {
            gn();
        }
        int[] iArr = this.we;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // abcd.on0
    public String v5() {
        return "SHA-224";
    }
}
