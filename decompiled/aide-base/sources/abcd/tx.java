package abcd;

/* loaded from: classes.dex */
public final class tx {
    int DW;
    int FH;
    int Hw;
    private final ux J8;
    int Mr;
    int QX;
    int U2;
    int Ws;
    int XL;
    int a8;
    private final zx er;
    byte[] j3;
    int j6;
    private boolean lg;
    int[] v5;
    private static final int[] yS = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    static final int[] gW = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    int[] Zo = new int[1];
    int[] VH = new int[1];
    int[] gn = new int[1];
    int[] u7 = new int[1];
    int[][] tp = new int[1][];
    int[][] EQ = new int[1][];
    int[] we = new int[1];
    int[] J0 = new int[1];
    private final vx rN = new vx();
    int[] aM = new int[4320];

    public tx(zx zxVar, int i) {
        this.er = zxVar;
        this.J8 = new ux(this.er, this);
        this.j3 = new byte[i];
        this.Mr = i;
        this.lg = zxVar.EQ.v5 != 0;
        this.j6 = 0;
        Hw();
    }

    public int DW(int i) {
        int i2 = this.er.Zo;
        int i3 = this.U2;
        int i4 = this.a8;
        if (i3 > i4) {
            i4 = this.Mr;
        }
        int i5 = i4 - i3;
        int i6 = this.er.VH;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 != 0 && i == -5) {
            i = 0;
        }
        zx zxVar = this.er;
        zxVar.VH -= i5;
        zxVar.gn += i5;
        if (this.lg && i5 > 0) {
            zxVar.J0.j6(this.j3, i3, i5);
        }
        System.arraycopy(this.j3, i3, this.er.v5, i2, i5);
        int i7 = i2 + i5;
        int i8 = i3 + i5;
        int i9 = this.Mr;
        if (i8 == i9) {
            if (this.a8 == i9) {
                this.a8 = 0;
            }
            int i10 = this.a8 - 0;
            int i11 = this.er.VH;
            if (i10 > i11) {
                i10 = i11;
            }
            if (i10 != 0 && i == -5) {
                i = 0;
            }
            zx zxVar2 = this.er;
            zxVar2.VH -= i10;
            zxVar2.gn += i10;
            if (this.lg && i10 > 0) {
                zxVar2.J0.j6(this.j3, 0, i10);
            }
            System.arraycopy(this.j3, 0, this.er.v5, i7, i10);
            i7 += i10;
            i8 = i10 + 0;
        }
        this.er.Zo = i7;
        this.U2 = i8;
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ac, code lost:
    
        r34.v5 = null;
        r34.j6 = 9;
        r1 = r34.er;
        r1.u7 = "invalid bit length repeat";
        r34.XL = r4;
        r34.QX = r5;
        r1.FH = r2;
        r1.Hw += r3 - r1.DW;
        r1.DW = r3;
        r34.a8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d2, code lost:
    
        return DW(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x039b, code lost:
    
        r34.j6 = 9;
        r1 = r34.er;
        r1.u7 = "too many length or distance symbols";
        r34.XL = r4;
        r34.QX = r5;
        r1.FH = r2;
        r1.Hw += r3 - r1.DW;
        r1.DW = r3;
        r34.a8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03be, code lost:
    
        return DW(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d5, code lost:
    
        r34.a8 = r6;
        r1 = DW(r8);
        r6 = r34.a8;
        r7 = r34.U2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e3, code lost:
    
        if (r34.U2 == r34.a8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e5, code lost:
    
        r34.XL = r4;
        r34.QX = r5;
        r4 = r34.er;
        r4.FH = r2;
        r4.Hw += r3 - r4.DW;
        r4.DW = r3;
        r34.a8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ff, code lost:
    
        return DW(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0200, code lost:
    
        r34.j6 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0204, code lost:
    
        r34.XL = r4;
        r34.QX = r5;
        r1 = r34.er;
        r1.FH = r2;
        r1.Hw += r3 - r1.DW;
        r1.DW = r3;
        r34.a8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x021f, code lost:
    
        return DW(1);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0339 A[LOOP:7: B:34:0x00a8->B:114:0x0339, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int FH(int r35) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.tx.FH(int):int");
    }

    public void Hw() {
        if (this.j6 == 6) {
            this.J8.j6(this.er);
        }
        this.j6 = 0;
        this.QX = 0;
        this.XL = 0;
        this.a8 = 0;
        this.U2 = 0;
        if (this.lg) {
            this.er.J0.DW();
        }
    }

    public void j6() {
        Hw();
        this.j3 = null;
        this.aM = null;
    }
}
