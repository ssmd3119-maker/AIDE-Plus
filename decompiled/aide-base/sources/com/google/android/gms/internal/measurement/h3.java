package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class h3 extends f3 {
    private final byte[] Hw;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int u7;
    private int v5;

    private h3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.tp = Integer.MAX_VALUE;
        this.Hw = bArr;
        this.v5 = i2 + i;
        this.VH = i;
        this.gn = i;
    }

    private final long KD() throws k4 {
        int i = this.VH;
        if (this.v5 - i < 8) {
            throw k4.DW();
        }
        byte[] bArr = this.Hw;
        this.VH = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final int SI() throws k4 {
        int i = this.VH;
        if (this.v5 - i < 4) {
            throw k4.DW();
        }
        byte[] bArr = this.Hw;
        this.VH = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final byte cn() throws k4 {
        int i = this.VH;
        if (i == this.v5) {
            throw k4.DW();
        }
        byte[] bArr = this.Hw;
        this.VH = i + 1;
        return bArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int ei() {
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
            long r0 = r5.P8()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h3.ei():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long nw() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h3.nw():long");
    }

    private final void ro() {
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

    @Override // com.google.android.gms.internal.measurement.f3
    public final boolean BT() {
        return this.VH == this.v5;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final float DW() {
        return Float.intBitsToFloat(SI());
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final void EQ(int i) throws k4 {
        if (i >= 0) {
            int i2 = this.v5;
            int i3 = this.VH;
            if (i <= i2 - i3) {
                this.VH = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw k4.DW();
        }
        throw k4.FH();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final String FH() throws k4 {
        int iEi = ei();
        if (iEi > 0 && iEi <= this.v5 - this.VH) {
            String str = new String(this.Hw, this.VH, iEi, g4.j6);
            this.VH += iEi;
            return str;
        }
        if (iEi == 0) {
            return "";
        }
        if (iEi < 0) {
            throw k4.FH();
        }
        throw k4.DW();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int J0() throws k4 {
        if (BT()) {
            this.u7 = 0;
            return 0;
        }
        int iEi = ei();
        this.u7 = iEi;
        if ((iEi >>> 3) != 0) {
            return iEi;
        }
        throw new k4("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final long J8() {
        return nw();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final String Mr() throws k4 {
        int iEi = ei();
        if (iEi > 0) {
            int i = this.v5;
            int i2 = this.VH;
            if (iEi <= i - i2) {
                String strTp = c7.tp(this.Hw, i2, iEi);
                this.VH += iEi;
                return strTp;
            }
        }
        if (iEi == 0) {
            return "";
        }
        if (iEi <= 0) {
            throw k4.FH();
        }
        throw k4.DW();
    }

    final long P8() throws k4 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((cn() & 128) == 0) {
                return j;
            }
        }
        throw k4.Hw();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int QX() {
        return ei();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.measurement.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.u2 U2() throws com.google.android.gms.internal.measurement.k4 {
        /*
            r3 = this;
            int r0 = r3.ei()
            if (r0 <= 0) goto L19
            int r1 = r3.v5
            int r2 = r3.VH
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.Hw
            com.google.android.gms.internal.measurement.u2 r1 = com.google.android.gms.internal.measurement.u2.Ws(r1, r2, r0)
            int r2 = r3.VH
            int r2 = r2 + r0
            r3.VH = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.measurement.u2 r0 = com.google.android.gms.internal.measurement.u2.mb
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
            byte[] r0 = com.google.android.gms.internal.measurement.g4.DW
        L37:
            com.google.android.gms.internal.measurement.u2 r0 = com.google.android.gms.internal.measurement.u2.aM(r0)
            return r0
        L3c:
            com.google.android.gms.internal.measurement.k4 r0 = com.google.android.gms.internal.measurement.k4.FH()
            throw r0
        L41:
            com.google.android.gms.internal.measurement.k4 r0 = com.google.android.gms.internal.measurement.k4.DW()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h3.U2():com.google.android.gms.internal.measurement.u2");
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final boolean VH(int i) throws k4 {
        int iJ0;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.v5 - this.VH < 10) {
                while (i3 < 10) {
                    if (cn() < 0) {
                        i3++;
                    }
                }
                throw k4.Hw();
            }
            while (i3 < 10) {
                byte[] bArr = this.Hw;
                int i4 = this.VH;
                this.VH = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw k4.Hw();
            return true;
        }
        if (i2 == 1) {
            EQ(8);
            return true;
        }
        if (i2 == 2) {
            EQ(ei());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw k4.Zo();
            }
            EQ(4);
            return true;
        }
        do {
            iJ0 = J0();
            if (iJ0 == 0) {
                break;
            }
        } while (VH(iJ0));
        Zo(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final long Ws() {
        return nw();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final long XL() {
        return KD();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final void Zo(int i) throws k4 {
        if (this.u7 != i) {
            throw k4.v5();
        }
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int a8() {
        return ei();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int aM() {
        return SI();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final long er() {
        return KD();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final long gW() {
        long jNw = nw();
        return (-(jNw & 1)) ^ (jNw >>> 1);
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final boolean j3() {
        return nw() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final double j6() {
        return Double.longBitsToDouble(KD());
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int lg() {
        return ei();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int rN() {
        return SI();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final void tp(int i) {
        this.tp = i;
        ro();
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int u7(int i) {
        if (i < 0) {
            throw k4.FH();
        }
        int iVy = i + vy();
        int i2 = this.tp;
        if (iVy > i2) {
            throw k4.DW();
        }
        this.tp = iVy;
        ro();
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final <T extends l5> T v5(w5<T> w5Var, r3 r3Var) throws k4 {
        int iEi = ei();
        if (this.j6 >= this.DW) {
            throw k4.VH();
        }
        int iU7 = u7(iEi);
        this.j6++;
        T tJ6 = w5Var.j6(this, r3Var);
        Zo(0);
        this.j6--;
        tp(iU7);
        return tJ6;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int vy() {
        return this.VH - this.gn;
    }

    @Override // com.google.android.gms.internal.measurement.f3
    public final int yS() {
        int iEi = ei();
        return (-(iEi & 1)) ^ (iEi >>> 1);
    }
}
