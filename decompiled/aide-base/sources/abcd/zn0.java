package abcd;

/* loaded from: classes.dex */
public class zn0 extends sn0 {
    private int EQ;
    private int Hw;
    private int J0;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int u7;
    private int v5;
    private int[] we = new int[16];

    public zn0() {
        DW();
    }

    private int EQ(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(i + Mr(i2, i3, i4) + i5, i6);
    }

    private int J0(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(i + a8(i2, i3, i4) + i5 + 1859775393, i6);
    }

    private int J8(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(((i + lg(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int Mr(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int QX(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(i + U2(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int U2(int i, int i2, int i3) {
        return ((i ^ (-1)) & i3) | (i2 & i);
    }

    private int Ws(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(i + Mr(i2, i3, i4) + i5, i6);
    }

    private int XL(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(i + a8(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int a8(int i, int i2, int i3) {
        return (i | (i2 ^ (-1))) ^ i3;
    }

    private int aM(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(i + lg(i2, i3, i4) + i5 + 1352829926, i6);
    }

    private int j3(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private int lg(int i, int i2, int i3) {
        return (i & i3) | (i2 & (i3 ^ (-1)));
    }

    private void rN(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private int we(int i, int i2, int i3, int i4, int i5, int i6) {
        return j3(i + U2(i2, i3, i4) + i5 + 1518500249, i6);
    }

    @Override // abcd.sn0, abcd.on0
    public void DW() {
        super.DW();
        this.Hw = 1732584193;
        this.v5 = -271733879;
        this.Zo = -1732584194;
        this.VH = 271733878;
        this.gn = 1985229328;
        this.u7 = -19088744;
        this.tp = -1985229329;
        this.EQ = 19088743;
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
        rN(this.Hw, bArr, i);
        rN(this.v5, bArr, i + 4);
        rN(this.Zo, bArr, i + 8);
        rN(this.VH, bArr, i + 12);
        rN(this.gn, bArr, i + 16);
        rN(this.u7, bArr, i + 20);
        rN(this.tp, bArr, i + 24);
        rN(this.EQ, bArr, i + 28);
        DW();
        return 32;
    }

    @Override // abcd.on0
    public int Zo() {
        return 32;
    }

    @Override // abcd.sn0
    public void gn() {
        int i = this.Hw;
        int i2 = this.v5;
        int i3 = this.Zo;
        int i4 = this.VH;
        int i5 = this.gn;
        int i6 = this.u7;
        int i7 = this.tp;
        int i8 = this.EQ;
        int iEQ = EQ(i, i2, i3, i4, this.we[0], 11);
        int iEQ2 = EQ(i4, iEQ, i2, i3, this.we[1], 14);
        int iEQ3 = EQ(i3, iEQ2, iEQ, i2, this.we[2], 15);
        int iEQ4 = EQ(i2, iEQ3, iEQ2, iEQ, this.we[3], 12);
        int iEQ5 = EQ(iEQ, iEQ4, iEQ3, iEQ2, this.we[4], 5);
        int iEQ6 = EQ(iEQ2, iEQ5, iEQ4, iEQ3, this.we[5], 8);
        int iEQ7 = EQ(iEQ3, iEQ6, iEQ5, iEQ4, this.we[6], 7);
        int iEQ8 = EQ(iEQ4, iEQ7, iEQ6, iEQ5, this.we[7], 9);
        int iEQ9 = EQ(iEQ5, iEQ8, iEQ7, iEQ6, this.we[8], 11);
        int iEQ10 = EQ(iEQ6, iEQ9, iEQ8, iEQ7, this.we[9], 13);
        int iEQ11 = EQ(iEQ7, iEQ10, iEQ9, iEQ8, this.we[10], 14);
        int iEQ12 = EQ(iEQ8, iEQ11, iEQ10, iEQ9, this.we[11], 15);
        int iEQ13 = EQ(iEQ9, iEQ12, iEQ11, iEQ10, this.we[12], 6);
        int iEQ14 = EQ(iEQ10, iEQ13, iEQ12, iEQ11, this.we[13], 7);
        int iEQ15 = EQ(iEQ11, iEQ14, iEQ13, iEQ12, this.we[14], 9);
        int iEQ16 = EQ(iEQ12, iEQ15, iEQ14, iEQ13, this.we[15], 8);
        int iAM = aM(i5, i6, i7, i8, this.we[5], 8);
        int iAM2 = aM(i8, iAM, i6, i7, this.we[14], 9);
        int iAM3 = aM(i7, iAM2, iAM, i6, this.we[7], 9);
        int iAM4 = aM(i6, iAM3, iAM2, iAM, this.we[0], 11);
        int iAM5 = aM(iAM, iAM4, iAM3, iAM2, this.we[9], 13);
        int iAM6 = aM(iAM2, iAM5, iAM4, iAM3, this.we[2], 15);
        int iAM7 = aM(iAM3, iAM6, iAM5, iAM4, this.we[11], 15);
        int iAM8 = aM(iAM4, iAM7, iAM6, iAM5, this.we[4], 5);
        int iAM9 = aM(iAM5, iAM8, iAM7, iAM6, this.we[13], 7);
        int iAM10 = aM(iAM6, iAM9, iAM8, iAM7, this.we[6], 7);
        int iAM11 = aM(iAM7, iAM10, iAM9, iAM8, this.we[15], 8);
        int iAM12 = aM(iAM8, iAM11, iAM10, iAM9, this.we[8], 11);
        int iAM13 = aM(iAM9, iAM12, iAM11, iAM10, this.we[1], 14);
        int iAM14 = aM(iAM10, iAM13, iAM12, iAM11, this.we[10], 14);
        int iAM15 = aM(iAM11, iAM14, iAM13, iAM12, this.we[3], 12);
        int iAM16 = aM(iAM12, iAM15, iAM14, iAM13, this.we[12], 6);
        int iWe = we(iAM13, iEQ16, iEQ15, iEQ14, this.we[7], 7);
        int iWe2 = we(iEQ14, iWe, iEQ16, iEQ15, this.we[4], 6);
        int iWe3 = we(iEQ15, iWe2, iWe, iEQ16, this.we[13], 8);
        int iWe4 = we(iEQ16, iWe3, iWe2, iWe, this.we[1], 13);
        int iWe5 = we(iWe, iWe4, iWe3, iWe2, this.we[10], 11);
        int iWe6 = we(iWe2, iWe5, iWe4, iWe3, this.we[6], 9);
        int iWe7 = we(iWe3, iWe6, iWe5, iWe4, this.we[15], 7);
        int iWe8 = we(iWe4, iWe7, iWe6, iWe5, this.we[3], 15);
        int iWe9 = we(iWe5, iWe8, iWe7, iWe6, this.we[12], 7);
        int iWe10 = we(iWe6, iWe9, iWe8, iWe7, this.we[0], 12);
        int iWe11 = we(iWe7, iWe10, iWe9, iWe8, this.we[9], 15);
        int iWe12 = we(iWe8, iWe11, iWe10, iWe9, this.we[5], 9);
        int iWe13 = we(iWe9, iWe12, iWe11, iWe10, this.we[2], 11);
        int iWe14 = we(iWe10, iWe13, iWe12, iWe11, this.we[14], 7);
        int iWe15 = we(iWe11, iWe14, iWe13, iWe12, this.we[11], 13);
        int iWe16 = we(iWe12, iWe15, iWe14, iWe13, this.we[8], 12);
        int iXL = XL(iEQ13, iAM16, iAM15, iAM14, this.we[6], 9);
        int iXL2 = XL(iAM14, iXL, iAM16, iAM15, this.we[11], 13);
        int iXL3 = XL(iAM15, iXL2, iXL, iAM16, this.we[3], 15);
        int iXL4 = XL(iAM16, iXL3, iXL2, iXL, this.we[7], 7);
        int iXL5 = XL(iXL, iXL4, iXL3, iXL2, this.we[0], 12);
        int iXL6 = XL(iXL2, iXL5, iXL4, iXL3, this.we[13], 8);
        int iXL7 = XL(iXL3, iXL6, iXL5, iXL4, this.we[5], 9);
        int iXL8 = XL(iXL4, iXL7, iXL6, iXL5, this.we[10], 11);
        int iXL9 = XL(iXL5, iXL8, iXL7, iXL6, this.we[14], 7);
        int iXL10 = XL(iXL6, iXL9, iXL8, iXL7, this.we[15], 7);
        int iXL11 = XL(iXL7, iXL10, iXL9, iXL8, this.we[8], 12);
        int iXL12 = XL(iXL8, iXL11, iXL10, iXL9, this.we[12], 7);
        int iXL13 = XL(iXL9, iXL12, iXL11, iXL10, this.we[4], 6);
        int iXL14 = XL(iXL10, iXL13, iXL12, iXL11, this.we[9], 15);
        int iXL15 = XL(iXL11, iXL14, iXL13, iXL12, this.we[1], 13);
        int iXL16 = XL(iXL12, iXL15, iXL14, iXL13, this.we[2], 11);
        int iJ0 = J0(iWe13, iXL16, iWe15, iWe14, this.we[3], 11);
        int iJ02 = J0(iWe14, iJ0, iXL16, iWe15, this.we[10], 13);
        int iJ03 = J0(iWe15, iJ02, iJ0, iXL16, this.we[14], 6);
        int iJ04 = J0(iXL16, iJ03, iJ02, iJ0, this.we[4], 7);
        int iJ05 = J0(iJ0, iJ04, iJ03, iJ02, this.we[9], 14);
        int iJ06 = J0(iJ02, iJ05, iJ04, iJ03, this.we[15], 9);
        int iJ07 = J0(iJ03, iJ06, iJ05, iJ04, this.we[8], 13);
        int iJ08 = J0(iJ04, iJ07, iJ06, iJ05, this.we[1], 15);
        int iJ09 = J0(iJ05, iJ08, iJ07, iJ06, this.we[2], 14);
        int iJ010 = J0(iJ06, iJ09, iJ08, iJ07, this.we[7], 8);
        int iJ011 = J0(iJ07, iJ010, iJ09, iJ08, this.we[0], 13);
        int iJ012 = J0(iJ08, iJ011, iJ010, iJ09, this.we[6], 6);
        int iJ013 = J0(iJ09, iJ012, iJ011, iJ010, this.we[13], 5);
        int iJ014 = J0(iJ010, iJ013, iJ012, iJ011, this.we[11], 12);
        int iJ015 = J0(iJ011, iJ014, iJ013, iJ012, this.we[5], 7);
        int iJ016 = J0(iJ012, iJ015, iJ014, iJ013, this.we[12], 5);
        int iQX = QX(iXL13, iWe16, iXL15, iXL14, this.we[15], 9);
        int iQX2 = QX(iXL14, iQX, iWe16, iXL15, this.we[5], 7);
        int iQX3 = QX(iXL15, iQX2, iQX, iWe16, this.we[1], 15);
        int iQX4 = QX(iWe16, iQX3, iQX2, iQX, this.we[3], 11);
        int iQX5 = QX(iQX, iQX4, iQX3, iQX2, this.we[7], 8);
        int iQX6 = QX(iQX2, iQX5, iQX4, iQX3, this.we[14], 6);
        int iQX7 = QX(iQX3, iQX6, iQX5, iQX4, this.we[6], 6);
        int iQX8 = QX(iQX4, iQX7, iQX6, iQX5, this.we[9], 14);
        int iQX9 = QX(iQX5, iQX8, iQX7, iQX6, this.we[11], 12);
        int iQX10 = QX(iQX6, iQX9, iQX8, iQX7, this.we[8], 13);
        int iQX11 = QX(iQX7, iQX10, iQX9, iQX8, this.we[12], 5);
        int iQX12 = QX(iQX8, iQX11, iQX10, iQX9, this.we[2], 14);
        int iQX13 = QX(iQX9, iQX12, iQX11, iQX10, this.we[10], 13);
        int iQX14 = QX(iQX10, iQX13, iQX12, iQX11, this.we[0], 13);
        int iQX15 = QX(iQX11, iQX14, iQX13, iQX12, this.we[4], 7);
        int iQX16 = QX(iQX12, iQX15, iQX14, iQX13, this.we[13], 5);
        int iJ8 = J8(iJ013, iJ016, iQX15, iJ014, this.we[1], 11);
        int iJ82 = J8(iJ014, iJ8, iJ016, iQX15, this.we[9], 12);
        int iJ83 = J8(iQX15, iJ82, iJ8, iJ016, this.we[11], 14);
        int iJ84 = J8(iJ016, iJ83, iJ82, iJ8, this.we[10], 15);
        int iJ85 = J8(iJ8, iJ84, iJ83, iJ82, this.we[0], 14);
        int iJ86 = J8(iJ82, iJ85, iJ84, iJ83, this.we[8], 15);
        int iJ87 = J8(iJ83, iJ86, iJ85, iJ84, this.we[12], 9);
        int iJ88 = J8(iJ84, iJ87, iJ86, iJ85, this.we[4], 8);
        int iJ89 = J8(iJ85, iJ88, iJ87, iJ86, this.we[13], 9);
        int iJ810 = J8(iJ86, iJ89, iJ88, iJ87, this.we[3], 14);
        int iJ811 = J8(iJ87, iJ810, iJ89, iJ88, this.we[7], 5);
        int iJ812 = J8(iJ88, iJ811, iJ810, iJ89, this.we[15], 6);
        int iJ813 = J8(iJ89, iJ812, iJ811, iJ810, this.we[14], 8);
        int iJ814 = J8(iJ810, iJ813, iJ812, iJ811, this.we[5], 6);
        int iJ815 = J8(iJ811, iJ814, iJ813, iJ812, this.we[6], 5);
        int iJ816 = J8(iJ812, iJ815, iJ814, iJ813, this.we[2], 12);
        int iWs = Ws(iQX13, iQX16, iJ015, iQX14, this.we[8], 15);
        int iWs2 = Ws(iQX14, iWs, iQX16, iJ015, this.we[6], 5);
        int iWs3 = Ws(iJ015, iWs2, iWs, iQX16, this.we[4], 8);
        int iWs4 = Ws(iQX16, iWs3, iWs2, iWs, this.we[1], 11);
        int iWs5 = Ws(iWs, iWs4, iWs3, iWs2, this.we[3], 14);
        int iWs6 = Ws(iWs2, iWs5, iWs4, iWs3, this.we[11], 14);
        int iWs7 = Ws(iWs3, iWs6, iWs5, iWs4, this.we[15], 6);
        int iWs8 = Ws(iWs4, iWs7, iWs6, iWs5, this.we[0], 14);
        int iWs9 = Ws(iWs5, iWs8, iWs7, iWs6, this.we[5], 6);
        int iWs10 = Ws(iWs6, iWs9, iWs8, iWs7, this.we[12], 9);
        int iWs11 = Ws(iWs7, iWs10, iWs9, iWs8, this.we[2], 12);
        int iWs12 = Ws(iWs8, iWs11, iWs10, iWs9, this.we[13], 9);
        int iWs13 = Ws(iWs9, iWs12, iWs11, iWs10, this.we[9], 12);
        int iWs14 = Ws(iWs10, iWs13, iWs12, iWs11, this.we[7], 5);
        int iWs15 = Ws(iWs11, iWs14, iWs13, iWs12, this.we[10], 15);
        int iWs16 = Ws(iWs12, iWs15, iWs14, iWs13, this.we[14], 8);
        this.Hw += iJ813;
        this.v5 += iJ816;
        this.Zo += iJ815;
        this.VH += iWs14;
        this.gn += iWs13;
        this.u7 += iWs16;
        this.tp += iWs15;
        this.EQ += iJ814;
        this.J0 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.we;
            if (i9 == iArr.length) {
                return;
            }
            iArr[i9] = 0;
            i9++;
        }
    }

    @Override // abcd.sn0
    public void tp(byte[] bArr, int i) {
        int[] iArr = this.we;
        int i2 = this.J0;
        int i3 = i2 + 1;
        this.J0 = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            gn();
        }
    }

    @Override // abcd.sn0
    public void u7(long j) {
        if (this.J0 > 14) {
            gn();
        }
        int[] iArr = this.we;
        iArr[14] = (int) ((-1) & j);
        iArr[15] = (int) (j >>> 32);
    }

    @Override // abcd.on0
    public String v5() {
        return "RIPEMD256";
    }
}
