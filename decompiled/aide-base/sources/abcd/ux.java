package abcd;

/* loaded from: classes.dex */
public final class ux {
    private static final int[] XL = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    int DW;
    int[] EQ;
    int[] FH;
    int Hw = 0;
    int[] J0;
    int J8;
    private final tx QX;
    int VH;
    private final zx Ws;
    int Zo;
    int gn;
    int j6;
    byte tp;
    byte u7;
    int v5;
    int we;

    public ux(zx zxVar, tx txVar) {
        this.Ws = zxVar;
        this.QX = txVar;
    }

    public int DW(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, tx txVar, zx zxVar) {
        int i5;
        int i6;
        int i7;
        int i8 = zxVar.DW;
        int i9 = zxVar.FH;
        int i10 = txVar.XL;
        int i11 = txVar.QX;
        int i12 = txVar.a8;
        int i13 = txVar.U2;
        int i14 = i12 < i13 ? (i13 - i12) - 1 : txVar.Mr - i12;
        int[] iArr3 = XL;
        int i15 = iArr3[i];
        int i16 = iArr3[i2];
        while (true) {
            if (i11 >= 20) {
                int i17 = i10 & i15;
                int i18 = (i3 + i17) * 3;
                int i19 = iArr[i18];
                if (i19 == 0) {
                    int i20 = i18 + 1;
                    i10 >>= iArr[i20];
                    i11 -= iArr[i20];
                    i7 = i12 + 1;
                    txVar.j3[i12] = (byte) iArr[i18 + 2];
                } else {
                    do {
                        int i21 = i18 + 1;
                        i10 >>= iArr[i21];
                        i11 -= iArr[i21];
                        if ((i19 & 16) != 0) {
                            int i22 = i19 & 15;
                            int i23 = iArr[i18 + 2] + (XL[i22] & i10);
                            int i24 = i10 >> i22;
                            int i25 = i11 - i22;
                            while (i25 < 15) {
                                i9--;
                                i24 |= (zxVar.j6[i8] & 255) << i25;
                                i25 += 8;
                                i8++;
                            }
                            int i26 = i24 & i16;
                            int i27 = (i4 + i26) * 3;
                            int i28 = iArr2[i27];
                            while (true) {
                                int i29 = i27 + 1;
                                i24 >>= iArr2[i29];
                                i25 -= iArr2[i29];
                                if ((i28 & 16) != 0) {
                                    int i30 = i28 & 15;
                                    while (i25 < i30) {
                                        i9--;
                                        i24 |= (zxVar.j6[i8] & 255) << i25;
                                        i25 += 8;
                                        i8++;
                                    }
                                    int i31 = iArr2[i27 + 2] + (XL[i30] & i24);
                                    int i32 = i24 >> i30;
                                    int i33 = i25 - i30;
                                    int i34 = i14 - i23;
                                    if (i12 >= i31) {
                                        int i35 = i12 - i31;
                                        int i36 = i12 - i35;
                                        if (i36 <= 0 || 2 <= i36) {
                                            byte[] bArr = txVar.j3;
                                            System.arraycopy(bArr, i35, bArr, i12, 2);
                                            i12 += 2;
                                            i5 = i35 + 2;
                                        } else {
                                            byte[] bArr2 = txVar.j3;
                                            int i37 = i12 + 1;
                                            int i38 = i35 + 1;
                                            bArr2[i12] = bArr2[i35];
                                            i12 = i37 + 1;
                                            i5 = i38 + 1;
                                            bArr2[i37] = bArr2[i38];
                                        }
                                        i23 -= 2;
                                    } else {
                                        i5 = i12 - i31;
                                        do {
                                            i6 = txVar.Mr;
                                            i5 += i6;
                                        } while (i5 < 0);
                                        int i39 = i6 - i5;
                                        if (i23 > i39) {
                                            i23 -= i39;
                                            int i40 = i12 - i5;
                                            if (i40 <= 0 || i39 <= i40) {
                                                byte[] bArr3 = txVar.j3;
                                                System.arraycopy(bArr3, i5, bArr3, i12, i39);
                                                i12 += i39;
                                            } else {
                                                while (true) {
                                                    byte[] bArr4 = txVar.j3;
                                                    int i41 = i5 + 1;
                                                    bArr4[i12] = bArr4[i5];
                                                    i39--;
                                                    i12++;
                                                    if (i39 == 0) {
                                                        break;
                                                    }
                                                    i5 = i41;
                                                }
                                            }
                                            i5 = 0;
                                        }
                                    }
                                    int i42 = i12 - i5;
                                    if (i42 <= 0 || i23 <= i42) {
                                        byte[] bArr5 = txVar.j3;
                                        System.arraycopy(bArr5, i5, bArr5, i12, i23);
                                        i12 += i23;
                                    } else {
                                        while (true) {
                                            byte[] bArr6 = txVar.j3;
                                            int i43 = i5 + 1;
                                            bArr6[i12] = bArr6[i5];
                                            i23--;
                                            i12++;
                                            if (i23 == 0) {
                                                break;
                                            }
                                            i5 = i43;
                                        }
                                    }
                                    i10 = i32;
                                    i11 = i33;
                                    i14 = i34;
                                } else {
                                    if ((i28 & 64) != 0) {
                                        zxVar.u7 = "invalid distance code";
                                        int i44 = zxVar.FH - i9;
                                        int i45 = i25 >> 3;
                                        if (i45 < i44) {
                                            i44 = i45;
                                        }
                                        txVar.XL = i24;
                                        txVar.QX = i25 - (i44 << 3);
                                        zxVar.FH = i9 + i44;
                                        zxVar.Hw += r2 - zxVar.DW;
                                        zxVar.DW = i8 - i44;
                                        txVar.a8 = i12;
                                        return -3;
                                    }
                                    i26 = i26 + iArr2[i27 + 2] + (XL[i28] & i24);
                                    i27 = (i4 + i26) * 3;
                                    i28 = iArr2[i27];
                                }
                            }
                        } else {
                            if ((i19 & 64) != 0) {
                                if ((i19 & 32) != 0) {
                                    int i46 = zxVar.FH - i9;
                                    int i47 = i11 >> 3;
                                    if (i47 < i46) {
                                        i46 = i47;
                                    }
                                    txVar.XL = i10;
                                    txVar.QX = i11 - (i46 << 3);
                                    zxVar.FH = i9 + i46;
                                    zxVar.Hw += r2 - zxVar.DW;
                                    zxVar.DW = i8 - i46;
                                    txVar.a8 = i12;
                                    return 1;
                                }
                                zxVar.u7 = "invalid literal/length code";
                                int i48 = zxVar.FH - i9;
                                int i49 = i11 >> 3;
                                if (i49 < i48) {
                                    i48 = i49;
                                }
                                txVar.XL = i10;
                                txVar.QX = i11 - (i48 << 3);
                                zxVar.FH = i9 + i48;
                                zxVar.Hw += r2 - zxVar.DW;
                                zxVar.DW = i8 - i48;
                                txVar.a8 = i12;
                                return -3;
                            }
                            i17 = i17 + iArr[i18 + 2] + (XL[i19] & i10);
                            i18 = (i3 + i17) * 3;
                            i19 = iArr[i18];
                        }
                    } while (i19 != 0);
                    int i50 = i18 + 1;
                    i10 >>= iArr[i50];
                    i11 -= iArr[i50];
                    i7 = i12 + 1;
                    txVar.j3[i12] = (byte) iArr[i18 + 2];
                }
                i14--;
                i12 = i7;
                if (i14 < 258 || i9 < 10) {
                    break;
                }
            } else {
                i9--;
                i10 |= (zxVar.j6[i8] & 255) << i11;
                i11 += 8;
                i8++;
            }
        }
        int i51 = zxVar.FH - i9;
        int i52 = i11 >> 3;
        if (i52 < i51) {
            i51 = i52;
        }
        txVar.XL = i10;
        txVar.QX = i11 - (i51 << 3);
        zxVar.FH = i9 + i51;
        zxVar.Hw += r2 - zxVar.DW;
        zxVar.DW = i8 - i51;
        txVar.a8 = i12;
        return 0;
    }

    public void FH(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.j6 = 0;
        this.u7 = (byte) i;
        this.tp = (byte) i2;
        this.EQ = iArr;
        this.we = i3;
        this.J0 = iArr2;
        this.J8 = i4;
        this.FH = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r0 = r18.QX;
        r0.XL = r3;
        r0.QX = r4;
        r3 = r18.Ws;
        r3.FH = r1;
        r3.Hw += r2 - r3.DW;
        r3.DW = r2;
        r0.a8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        return r0.DW(1);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0 A[LOOP:1: B:58:0x015d->B:94:0x01f0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Hw(int r19) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.ux.Hw(int):int");
    }

    public void j6(zx zxVar) {
    }
}
