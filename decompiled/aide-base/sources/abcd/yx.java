package abcd;

/* loaded from: classes.dex */
public final class yx {
    static final int[] EQ;
    static final byte[] VH;
    static final int[] Zo;
    static final byte[] gn;
    static final int[] tp;
    static final byte[] u7;
    int DW;
    xx FH;
    short[] j6;
    static final int[] Hw = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};
    static final int[] v5 = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    static {
        int[] iArr = new int[19];
        iArr[16] = 2;
        iArr[17] = 3;
        iArr[18] = 7;
        Zo = iArr;
        VH = new byte[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
        gn = new byte[]{0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 16, 17, 18, 18, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29};
        u7 = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28};
        tp = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 0};
        EQ = new int[]{0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576};
    }

    public static int FH(int i) {
        return i < 256 ? gn[i] : gn[(i >>> 7) + 256];
    }

    private static final int j6(int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i3 | (i & 1);
            i >>>= 1;
            i3 = i4 << 1;
            i2--;
        } while (i2 > 0);
        return i3 >>> 1;
    }

    private static final void v5(short[] sArr, int i, short[] sArr2, short[] sArr3) {
        sArr3[0] = 0;
        short s = 0;
        for (int i2 = 1; i2 <= 15; i2++) {
            s = (short) ((s + sArr2[i2 - 1]) << 1);
            sArr3[i2] = s;
        }
        for (int i3 = 0; i3 <= i; i3++) {
            int i4 = i3 * 2;
            short s2 = sArr[i4 + 1];
            if (s2 != 0) {
                short s3 = sArr3[s2];
                sArr3[s2] = (short) (s3 + 1);
                sArr[i4] = (short) j6(s3, s2);
            }
        }
    }

    public void DW(rx rxVar) {
        int i;
        int i2;
        int i3;
        short[] sArr = this.j6;
        xx xxVar = this.FH;
        short[] sArr2 = xxVar.j6;
        int i4 = xxVar.Hw;
        rxVar.Bx = 0;
        rxVar.oa = 573;
        int i5 = -1;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i6 * 2;
            if (sArr[i7] != 0) {
                int[] iArr = rxVar.Jm;
                int i8 = rxVar.Bx + 1;
                rxVar.Bx = i8;
                iArr[i8] = i6;
                rxVar.qP[i6] = 0;
                i5 = i6;
            } else {
                sArr[i7 + 1] = 0;
            }
        }
        while (true) {
            i = rxVar.Bx;
            if (i >= 2) {
                break;
            }
            int[] iArr2 = rxVar.Jm;
            int i9 = i + 1;
            rxVar.Bx = i9;
            if (i5 < 2) {
                i3 = i5 + 1;
                i2 = i3;
            } else {
                i2 = i5;
                i3 = 0;
            }
            iArr2[i9] = i3;
            int i10 = i3 * 2;
            sArr[i10] = 1;
            rxVar.qP[i3] = 0;
            rxVar.AR--;
            if (sArr2 != null) {
                rxVar.TI -= sArr2[i10 + 1];
            }
            i5 = i2;
        }
        this.DW = i5;
        for (int i11 = i / 2; i11 >= 1; i11--) {
            rxVar.SI(sArr, i11);
        }
        while (true) {
            int[] iArr3 = rxVar.Jm;
            int i12 = iArr3[1];
            int i13 = rxVar.Bx;
            rxVar.Bx = i13 - 1;
            iArr3[1] = iArr3[i13];
            rxVar.SI(sArr, 1);
            int[] iArr4 = rxVar.Jm;
            int i14 = iArr4[1];
            int i15 = rxVar.oa - 1;
            rxVar.oa = i15;
            iArr4[i15] = i12;
            int i16 = i15 - 1;
            rxVar.oa = i16;
            iArr4[i16] = i14;
            int i17 = i12 * 2;
            int i18 = i14 * 2;
            sArr[i4 * 2] = (short) (sArr[i17] + sArr[i18]);
            byte[] bArr = rxVar.qP;
            bArr[i4] = (byte) (Math.max((int) bArr[i12], (int) bArr[i14]) + 1);
            short s = (short) i4;
            sArr[i18 + 1] = s;
            sArr[i17 + 1] = s;
            int i19 = i4 + 1;
            rxVar.Jm[1] = i4;
            rxVar.SI(sArr, 1);
            if (rxVar.Bx < 2) {
                int[] iArr5 = rxVar.Jm;
                int i20 = rxVar.oa - 1;
                rxVar.oa = i20;
                iArr5[i20] = iArr5[1];
                Hw(rxVar);
                v5(sArr, i5, rxVar.Pa, rxVar.ce);
                return;
            }
            i4 = i19;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Hw(rx rxVar) {
        short[] sArr;
        short[] sArr2 = this.j6;
        xx xxVar = this.FH;
        short[] sArr3 = xxVar.j6;
        int[] iArr = xxVar.DW;
        int i = xxVar.FH;
        int i2 = xxVar.v5;
        for (int i3 = 0; i3 <= 15; i3++) {
            rxVar.Pa[i3] = 0;
        }
        int[] iArr2 = rxVar.Jm;
        int i4 = rxVar.oa;
        sArr2[(iArr2[i4] * 2) + 1] = 0;
        int i5 = i4 + 1;
        int i6 = 0;
        while (i5 < 573) {
            int i7 = rxVar.Jm[i5];
            int i8 = i7 * 2;
            int i9 = i8 + 1;
            int i10 = sArr2[(sArr2[i9] * 2) + 1] + 1;
            if (i10 > i2) {
                i6++;
                i10 = i2;
            }
            sArr2[i9] = (short) i10;
            if (i7 <= this.DW) {
                short[] sArr4 = rxVar.Pa;
                sArr4[i10] = (short) (sArr4[i10] + 1);
                int i11 = i7 >= i ? iArr[i7 - i] : 0;
                short s = sArr2[i8];
                rxVar.AR += (i10 + i11) * s;
                if (sArr3 != null) {
                    rxVar.TI += s * (sArr3[i9] + i11);
                }
            }
            i5++;
        }
        if (i6 == 0) {
            return;
        }
        int i12 = i6;
        do {
            int i13 = i2 - 1;
            while (true) {
                sArr = rxVar.Pa;
                if (sArr[i13] != 0) {
                    break;
                } else {
                    i13--;
                }
            }
            sArr[i13] = (short) (sArr[i13] - 1);
            int i14 = i13 + 1;
            sArr[i14] = (short) (sArr[i14] + 2);
            sArr[i2] = (short) (sArr[i2] - 1);
            i12 -= 2;
        } while (i12 > 0);
        for (int i15 = i2; i15 != 0; i15--) {
            short s2 = rxVar.Pa[i15];
            while (s2 != 0) {
                i5--;
                int i16 = rxVar.Jm[i5];
                if (i16 <= this.DW) {
                    int i17 = (i16 * 2) + 1;
                    if (sArr2[i17] != i15) {
                        rxVar.AR = (int) (rxVar.AR + ((i15 - sArr2[i17]) * sArr2[r3]));
                        sArr2[i17] = (short) i15;
                    }
                    s2--;
                }
            }
        }
    }
}
