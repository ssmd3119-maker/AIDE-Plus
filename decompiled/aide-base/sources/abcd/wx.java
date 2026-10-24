package abcd;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class wx {
    int DW;
    long Hw;
    tx VH;
    int Zo;
    private final zx gn;
    int j6;
    private int u7;
    int v5;
    long FH = -1;
    private int tp = -1;
    private byte[] EQ = new byte[4];
    sx we = null;
    private ByteArrayOutputStream J0 = null;

    class a extends Exception {
        int WB;

        public a(wx wxVar, int i) {
            this.WB = i;
        }
    }

    public wx(zx zxVar) {
        this.gn = zxVar;
    }

    private int VH(int i, int i2, int i3) throws a {
        if (this.tp == -1) {
            this.tp = i;
            this.Hw = 0L;
        }
        while (true) {
            int i4 = this.tp;
            if (i4 <= 0) {
                if (i == 2) {
                    this.Hw &= 65535;
                } else if (i == 4) {
                    this.Hw &= 4294967295L;
                }
                this.tp = -1;
                return i2;
            }
            zx zxVar = this.gn;
            int i5 = zxVar.FH;
            if (i5 == 0) {
                throw new a(this, i2);
            }
            zxVar.FH = i5 - 1;
            zxVar.Hw++;
            long j = this.Hw;
            byte[] bArr = zxVar.j6;
            zxVar.DW = zxVar.DW + 1;
            this.Hw = j | ((bArr[r5] & 255) << ((i - i4) * 8));
            this.tp = i4 - 1;
            i2 = i3;
        }
    }

    private int Zo(int i, int i2) throws a {
        if (this.J0 == null) {
            this.J0 = new ByteArrayOutputStream();
        }
        while (this.Hw > 0) {
            zx zxVar = this.gn;
            int i3 = zxVar.FH;
            if (i3 == 0) {
                throw new a(this, i);
            }
            zxVar.FH = i3 - 1;
            zxVar.Hw++;
            byte[] bArr = zxVar.j6;
            int i4 = zxVar.DW;
            byte b = bArr[i4];
            this.J0.write(bArr, i4, 1);
            zx zxVar2 = this.gn;
            zxVar2.J0.j6(zxVar2.j6, zxVar2.DW, 1);
            this.gn.DW++;
            this.Hw--;
            i = i2;
        }
        return i;
    }

    private int gn(int i, int i2) throws a {
        if (this.J0 == null) {
            this.J0 = new ByteArrayOutputStream();
        }
        while (true) {
            zx zxVar = this.gn;
            int i3 = zxVar.FH;
            if (i3 == 0) {
                throw new a(this, i);
            }
            zxVar.FH = i3 - 1;
            zxVar.Hw++;
            byte[] bArr = zxVar.j6;
            int i4 = zxVar.DW;
            byte b = bArr[i4];
            if (b != 0) {
                this.J0.write(bArr, i4, 1);
            }
            zx zxVar2 = this.gn;
            zxVar2.J0.j6(zxVar2.j6, zxVar2.DW, 1);
            this.gn.DW++;
            if (b == 0) {
                return i2;
            }
            i = i2;
        }
    }

    private void j6(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            this.EQ[i2] = (byte) (255 & j);
            j >>= 8;
        }
        this.gn.J0.j6(this.EQ, 0, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0415, code lost:
    
        r4 = r19.gn;
        r6 = r4.FH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0419, code lost:
    
        if (r6 != 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x041b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x041c, code lost:
    
        r4.FH = r6 - 1;
        r4.Hw++;
        r2 = r4.j6;
        r4.DW = r4.DW + 1;
        r19.Hw = ((r2[r6] & 255) << 24) & 4278190080L;
        r19.j6 = 3;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0441, code lost:
    
        r4 = r19.gn;
        r6 = r4.FH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0445, code lost:
    
        if (r6 != 0) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0447, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0448, code lost:
    
        r4.FH = r6 - 1;
        r4.Hw++;
        r9 = r19.Hw;
        r2 = r4.j6;
        r4.DW = r4.DW + 1;
        r19.Hw = r9 + (((r2[r6] & 255) << 16) & 16711680);
        r19.j6 = 4;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x046b, code lost:
    
        r3 = r19.gn;
        r4 = r3.FH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x046f, code lost:
    
        if (r4 != 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0471, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0472, code lost:
    
        r3.FH = r4 - 1;
        r3.Hw++;
        r4 = r19.Hw;
        r2 = r3.j6;
        r3.DW = r3.DW + 1;
        r19.Hw = r4 + (((r2[r6] & 255) << 8) & 65280);
        r19.j6 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0495, code lost:
    
        r2 = r19.gn;
        r3 = r2.FH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0499, code lost:
    
        if (r3 != 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x049b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x049c, code lost:
    
        r2.FH = r3 - 1;
        r2.Hw++;
        r3 = r19.Hw;
        r0 = r2.j6;
        r2.DW = r2.DW + 1;
        r3 = r3 + (r0[r5] & 255);
        r19.Hw = r3;
        r2.J0.FH(r3);
        r19.j6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04c0, code lost:
    
        return 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int DW(int r20) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.wx.DW(int):int");
    }

    public int FH() {
        tx txVar = this.VH;
        if (txVar == null) {
            return 0;
        }
        txVar.j6();
        return 0;
    }

    public int Hw(int i) {
        this.gn.u7 = null;
        this.VH = null;
        this.v5 = 0;
        if (i < 0) {
            i = -i;
        } else if ((1073741824 & i) != 0) {
            this.v5 = 4;
            i &= -1073741825;
            if (i < 48) {
                i &= 15;
            }
        } else {
            if ((i & (-32)) != 0) {
                this.v5 = 4;
            } else {
                this.v5 = (i >> 4) + 1;
                if (i < 48) {
                }
            }
            i &= 15;
        }
        if (i < 8 || i > 15) {
            FH();
            return -2;
        }
        tx txVar = this.VH;
        if (txVar != null && this.Zo != i) {
            txVar.j6();
            this.VH = null;
        }
        this.Zo = i;
        this.VH = new tx(this.gn, 1 << i);
        v5();
        return 0;
    }

    public int v5() {
        zx zxVar = this.gn;
        if (zxVar == null) {
            return -2;
        }
        zxVar.gn = 0L;
        zxVar.Hw = 0L;
        zxVar.u7 = null;
        this.j6 = 14;
        this.tp = -1;
        this.VH.Hw();
        return 0;
    }
}
