package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u40 extends s40 {
    private final byte[] Hw;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int u7;
    private int v5;

    private u40(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.tp = Integer.MAX_VALUE;
        this.Hw = bArr;
        this.v5 = i2 + i;
        this.VH = i;
        this.gn = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long KD() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u40.KD():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int SI() {
        /*
            r5 = this;
            int r0 = r5.VH
            int r1 = r5.v5
            if (r1 == r0) goto L6b
            byte[] r2 = r5.Hw
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.VH = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.VH = r1
            return r0
        L6b:
            long r0 = r5.nw()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u40.SI():int");
    }

    private final byte cb() throws y50 {
        int i = this.VH;
        if (i == this.v5) {
            throw y50.j6();
        }
        byte[] bArr = this.Hw;
        this.VH = i + 1;
        return bArr[i];
    }

    private final long cn() throws y50 {
        int i = this.VH;
        if (this.v5 - i < 8) {
            throw y50.j6();
        }
        byte[] bArr = this.Hw;
        this.VH = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final int ro() throws y50 {
        int i = this.VH;
        if (this.v5 - i < 4) {
            throw y50.j6();
        }
        byte[] bArr = this.Hw;
        this.VH = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final void sh() {
        int i = this.v5 + this.Zo;
        this.v5 = i;
        int i2 = i - this.gn;
        int i3 = this.tp;
        if (i2 <= i3) {
            this.Zo = 0;
            return;
        }
        int i4 = i2 - i3;
        this.Zo = i4;
        this.v5 = i - i4;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final void BT(int i) {
        this.tp = i;
        sh();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final float DW() {
        return Float.intBitsToFloat(ro());
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final boolean EQ() {
        return KD() != 0;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final String FH() throws y50 {
        int iSI = SI();
        if (iSI > 0 && iSI <= this.v5 - this.VH) {
            String str = new String(this.Hw, this.VH, iSI, t50.j6);
            this.VH += iSI;
            return str;
        }
        if (iSI == 0) {
            return "";
        }
        if (iSI < 0) {
            throw y50.DW();
        }
        throw y50.j6();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final <T extends z60> T Hw(k70<T> k70Var, d50 d50Var) throws y50 {
        int iSI = SI();
        if (this.j6 >= this.DW) {
            throw y50.VH();
        }
        int iGW = gW(iSI);
        this.j6++;
        T tJ6 = k70Var.j6(this, d50Var);
        rN(0);
        this.j6--;
        BT(iGW);
        return tJ6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.ads.s40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.i40 J0() throws com.google.android.gms.internal.ads.y50 {
        /*
            r3 = this;
            int r0 = r3.SI()
            if (r0 <= 0) goto L19
            int r1 = r3.v5
            int r2 = r3.VH
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.Hw
            com.google.android.gms.internal.ads.i40 r1 = com.google.android.gms.internal.ads.i40.a8(r1, r2, r0)
            int r2 = r3.VH
            int r2 = r2 + r0
            r3.VH = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.ads.i40 r0 = com.google.android.gms.internal.ads.i40.mb
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.v5
            int r2 = r3.VH
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.VH = r0
            byte[] r1 = r3.Hw
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.ads.t50.DW
        L37:
            com.google.android.gms.internal.ads.i40 r0 = com.google.android.gms.internal.ads.i40.er(r0)
            return r0
        L3c:
            com.google.android.gms.internal.ads.y50 r0 = com.google.android.gms.internal.ads.y50.DW()
            throw r0
        L41:
            com.google.android.gms.internal.ads.y50 r0 = com.google.android.gms.internal.ads.y50.j6()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u40.J0():com.google.android.gms.internal.ads.i40");
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int J8() {
        return SI();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final boolean Mr() {
        return this.VH == this.v5;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int QX() {
        return ro();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int U2() {
        return this.VH - this.gn;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final long VH() {
        return KD();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int Ws() {
        return SI();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final long XL() {
        return cn();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final long Zo() {
        return KD();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int aM() {
        return s40.P8(SI());
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final boolean er(int i) throws y50 {
        int iV5;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.v5 - this.VH < 10) {
                while (i3 < 10) {
                    if (cb() < 0) {
                        i3++;
                    }
                }
                throw y50.FH();
            }
            while (i3 < 10) {
                byte[] bArr = this.Hw;
                int i4 = this.VH;
                this.VH = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw y50.FH();
            return true;
        }
        if (i2 == 1) {
            vy(8);
            return true;
        }
        if (i2 == 2) {
            vy(SI());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw y50.Zo();
            }
            vy(4);
            return true;
        }
        do {
            iV5 = v5();
            if (iV5 == 0) {
                break;
            }
        } while (er(iV5));
        rN(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int gW(int i) {
        if (i < 0) {
            throw y50.DW();
        }
        int iU2 = i + U2();
        int i2 = this.tp;
        if (iU2 > i2) {
            throw y50.j6();
        }
        this.tp = iU2;
        sh();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int gn() {
        return SI();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final long j3() {
        return s40.a8(KD());
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final double j6() {
        return Double.longBitsToDouble(cn());
    }

    final long nw() throws y50 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((cb() & 128) == 0) {
                return j;
            }
        }
        throw y50.FH();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final void rN(int i) throws y50 {
        if (this.u7 != i) {
            throw y50.v5();
        }
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int tp() {
        return ro();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final long u7() {
        return cn();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final int v5() throws y50 {
        if (Mr()) {
            this.u7 = 0;
            return 0;
        }
        int iSI = SI();
        this.u7 = iSI;
        if ((iSI >>> 3) != 0) {
            return iSI;
        }
        throw y50.Hw();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final void vy(int i) throws y50 {
        if (i >= 0) {
            int i2 = this.v5;
            int i3 = this.VH;
            if (i <= i2 - i3) {
                this.VH = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw y50.j6();
        }
        throw y50.DW();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final String we() throws y50 {
        int iSI = SI();
        if (iSI > 0) {
            int i = this.v5;
            int i2 = this.VH;
            if (iSI <= i - i2) {
                String strWe = s80.we(this.Hw, i2, iSI);
                this.VH += iSI;
                return strWe;
            }
        }
        if (iSI == 0) {
            return "";
        }
        if (iSI <= 0) {
            throw y50.DW();
        }
        throw y50.j6();
    }
}
