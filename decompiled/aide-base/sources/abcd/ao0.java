package abcd;

/* loaded from: classes.dex */
public class ao0 extends sn0 {
    private int Hw;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int[] u7;
    private int v5;

    public ao0() {
        this.u7 = new int[80];
        DW();
    }

    private int EQ(int i, int i2, int i3) {
        return ((i ^ (-1)) & i3) | (i2 & i);
    }

    private int J0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int we(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    @Override // abcd.sn0, abcd.on0
    public void DW() {
        super.DW();
        this.Hw = 1732584193;
        this.v5 = -271733879;
        this.Zo = -1732584194;
        this.VH = 271733878;
        this.gn = -1009589776;
        this.tp = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.u7;
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
        DW();
        return 20;
    }

    @Override // abcd.on0
    public int Zo() {
        return 20;
    }

    @Override // abcd.sn0
    public void gn() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.u7;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iJ0 = this.Hw;
        int iJ02 = this.v5;
        int i3 = this.Zo;
        int i4 = this.VH;
        int i5 = this.gn;
        int i6 = 0;
        int i7 = 0;
        while (i6 < 4) {
            int i8 = i7 + 1;
            int iEQ = i5 + ((iJ0 << 5) | (iJ0 >>> 27)) + EQ(iJ02, i3, i4) + this.u7[i7] + 1518500249;
            int i9 = (iJ02 >>> 2) | (iJ02 << 30);
            int i10 = i8 + 1;
            int iEQ2 = i4 + ((iEQ << 5) | (iEQ >>> 27)) + EQ(iJ0, i9, i3) + this.u7[i8] + 1518500249;
            int i11 = (iJ0 >>> 2) | (iJ0 << 30);
            int i12 = i10 + 1;
            int iEQ3 = i3 + ((iEQ2 << 5) | (iEQ2 >>> 27)) + EQ(iEQ, i11, i9) + this.u7[i10] + 1518500249;
            i5 = (iEQ >>> 2) | (iEQ << 30);
            int i13 = i12 + 1;
            iJ02 = i9 + ((iEQ3 << 5) | (iEQ3 >>> 27)) + EQ(iEQ2, i5, i11) + this.u7[i12] + 1518500249;
            i4 = (iEQ2 >>> 2) | (iEQ2 << 30);
            iJ0 = i11 + ((iJ02 << 5) | (iJ02 >>> 27)) + EQ(iEQ3, i4, i5) + this.u7[i13] + 1518500249;
            i3 = (iEQ3 >>> 2) | (iEQ3 << 30);
            i6++;
            i7 = i13 + 1;
        }
        int i14 = 0;
        while (i14 < 4) {
            int i15 = i7 + 1;
            int iJ03 = i5 + ((iJ0 << 5) | (iJ0 >>> 27)) + J0(iJ02, i3, i4) + this.u7[i7] + 1859775393;
            int i16 = (iJ02 >>> 2) | (iJ02 << 30);
            int i17 = i15 + 1;
            int iJ04 = i4 + ((iJ03 << 5) | (iJ03 >>> 27)) + J0(iJ0, i16, i3) + this.u7[i15] + 1859775393;
            int i18 = (iJ0 >>> 2) | (iJ0 << 30);
            int i19 = i17 + 1;
            int iJ05 = i3 + ((iJ04 << 5) | (iJ04 >>> 27)) + J0(iJ03, i18, i16) + this.u7[i17] + 1859775393;
            i5 = (iJ03 >>> 2) | (iJ03 << 30);
            int i20 = i19 + 1;
            iJ02 = i16 + ((iJ05 << 5) | (iJ05 >>> 27)) + J0(iJ04, i5, i18) + this.u7[i19] + 1859775393;
            i4 = (iJ04 >>> 2) | (iJ04 << 30);
            iJ0 = i18 + ((iJ02 << 5) | (iJ02 >>> 27)) + J0(iJ05, i4, i5) + this.u7[i20] + 1859775393;
            i3 = (iJ05 >>> 2) | (iJ05 << 30);
            i14++;
            i7 = i20 + 1;
        }
        int i21 = 0;
        while (i21 < 4) {
            int iWe = i5 + (((((iJ0 << 5) | (iJ0 >>> 27)) + we(iJ02, i3, i4)) + this.u7[i7]) - 1894007588);
            int iWe2 = i4 + (((((iWe << 5) | (iWe >>> 27)) + we(iJ0, r2, i3)) + this.u7[r12]) - 1894007588);
            int iWe3 = i3 + (((((iWe2 << 5) | (iWe2 >>> 27)) + we(iWe, r1, r2)) + this.u7[r13]) - 1894007588);
            i5 = (iWe >>> 2) | (iWe << 30);
            iJ02 = ((iJ02 >>> 2) | (iJ02 << 30)) + (((((iWe3 << 5) | (iWe3 >>> 27)) + we(iWe2, i5, r1)) + this.u7[r12]) - 1894007588);
            i4 = (iWe2 >>> 2) | (iWe2 << 30);
            iJ0 = ((iJ0 >>> 2) | (iJ0 << 30)) + (((((iJ02 << 5) | (iJ02 >>> 27)) + we(iWe3, i4, i5)) + this.u7[r13]) - 1894007588);
            i3 = (iWe3 >>> 2) | (iWe3 << 30);
            i21++;
            i7 = i7 + 1 + 1 + 1 + 1 + 1;
        }
        int i22 = 0;
        while (i22 <= 3) {
            int iJ06 = i5 + (((((iJ0 << 5) | (iJ0 >>> 27)) + J0(iJ02, i3, i4)) + this.u7[i7]) - 899497514);
            int iJ07 = i4 + (((((iJ06 << 5) | (iJ06 >>> 27)) + J0(iJ0, r2, i3)) + this.u7[r11]) - 899497514);
            int iJ08 = i3 + (((((iJ07 << 5) | (iJ07 >>> 27)) + J0(iJ06, r1, r2)) + this.u7[r12]) - 899497514);
            i5 = (iJ06 >>> 2) | (iJ06 << 30);
            iJ02 = ((iJ02 >>> 2) | (iJ02 << 30)) + (((((iJ08 << 5) | (iJ08 >>> 27)) + J0(iJ07, i5, r1)) + this.u7[r11]) - 899497514);
            i4 = (iJ07 >>> 2) | (iJ07 << 30);
            iJ0 = ((iJ0 >>> 2) | (iJ0 << 30)) + (((((iJ02 << 5) | (iJ02 >>> 27)) + J0(iJ08, i4, i5)) + this.u7[r12]) - 899497514);
            i3 = (iJ08 >>> 2) | (iJ08 << 30);
            i22++;
            i7 = i7 + 1 + 1 + 1 + 1 + 1;
        }
        this.Hw += iJ0;
        this.v5 += iJ02;
        this.Zo += i3;
        this.VH += i4;
        this.gn += i5;
        this.tp = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.u7[i23] = 0;
        }
    }

    @Override // abcd.sn0
    public void tp(byte[] bArr, int i) {
        int i2 = bArr[i] << 24;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = (bArr[i5 + 1] & 255) | i4 | ((bArr[i5] & 255) << 8);
        int[] iArr = this.u7;
        int i7 = this.tp;
        iArr[i7] = i6;
        int i8 = i7 + 1;
        this.tp = i8;
        if (i8 == 16) {
            gn();
        }
    }

    @Override // abcd.sn0
    public void u7(long j) {
        if (this.tp > 14) {
            gn();
        }
        int[] iArr = this.u7;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & (-1));
    }

    @Override // abcd.on0
    public String v5() {
        return "SHA-1";
    }

    public ao0(ao0 ao0Var) {
        super(ao0Var);
        int[] iArr = new int[80];
        this.u7 = iArr;
        this.Hw = ao0Var.Hw;
        this.v5 = ao0Var.v5;
        this.Zo = ao0Var.Zo;
        this.VH = ao0Var.VH;
        this.gn = ao0Var.gn;
        int[] iArr2 = ao0Var.u7;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.tp = ao0Var.tp;
    }
}
