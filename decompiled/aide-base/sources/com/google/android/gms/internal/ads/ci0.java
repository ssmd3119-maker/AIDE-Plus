package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzki;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ci0 {
    private static final int j6 = ip0.Ws("vide");
    private static final int DW = ip0.Ws("soun");
    private static final int FH = ip0.Ws("text");
    private static final int Hw = ip0.Ws("sbtl");
    private static final int v5 = ip0.Ws("subt");
    private static final int Zo = ip0.Ws("clcp");
    private static final int VH = ip0.Ws("cenc");
    private static final int gn = ip0.Ws("meta");

    /* JADX WARN: Removed duplicated region for block: B:200:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0820 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.vi0 DW(com.google.android.gms.internal.ads.ai0 r49, com.google.android.gms.internal.ads.bi0 r50, long r51, com.google.android.gms.internal.ads.zzhp r53, boolean r54) throws com.google.android.gms.internal.ads.af0 {
        /*
            Method dump skipped, instructions count: 2138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ci0.DW(com.google.android.gms.internal.ads.ai0, com.google.android.gms.internal.ads.bi0, long, com.google.android.gms.internal.ads.zzhp, boolean):com.google.android.gms.internal.ads.vi0");
    }

    public static yi0 FH(vi0 vi0Var, ai0 ai0Var, ih0 ih0Var) throws af0 {
        fi0 ii0Var;
        boolean z;
        int iA8;
        int iA82;
        vi0 vi0Var2;
        int i;
        long[] jArr;
        int[] iArr;
        int i2;
        long[] jArr2;
        int[] iArr2;
        long j;
        long j2;
        long[] jArr3;
        long[] jArr4;
        boolean z2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i3;
        int i4;
        int iA83;
        int iA84;
        bi0 bi0VarZo = ai0Var.Zo(zh0.oY);
        if (bi0VarZo != null) {
            ii0Var = new hi0(bi0VarZo);
        } else {
            bi0 bi0VarZo2 = ai0Var.Zo(zh0.ko);
            if (bi0VarZo2 == null) {
                throw new af0("Track has no sample table size information");
            }
            ii0Var = new ii0(bi0VarZo2);
        }
        int iFH = ii0Var.FH();
        if (iFH == 0) {
            return new yi0(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        bi0 bi0VarZo3 = ai0Var.Zo(zh0.Ev);
        if (bi0VarZo3 == null) {
            bi0VarZo3 = ai0Var.Zo(zh0.ye);
            z = true;
        } else {
            z = false;
        }
        ap0 ap0Var = bi0VarZo3.sg;
        ap0 ap0Var2 = ai0Var.Zo(zh0.jO).sg;
        ap0 ap0Var3 = ai0Var.Zo(zh0.hz).sg;
        bi0 bi0VarZo4 = ai0Var.Zo(zh0.aq);
        ap0 ap0Var4 = null;
        ap0 ap0Var5 = bi0VarZo4 != null ? bi0VarZo4.sg : null;
        bi0 bi0VarZo5 = ai0Var.Zo(zh0.FN);
        ap0 ap0Var6 = bi0VarZo5 != null ? bi0VarZo5.sg : null;
        di0 di0Var = new di0(ap0Var2, ap0Var, z);
        ap0Var3.EQ(12);
        int iA85 = ap0Var3.a8() - 1;
        int iA86 = ap0Var3.a8();
        int iA87 = ap0Var3.a8();
        if (ap0Var6 != null) {
            ap0Var6.EQ(12);
            iA8 = ap0Var6.a8();
        } else {
            iA8 = 0;
        }
        int iA88 = -1;
        if (ap0Var5 != null) {
            ap0Var5.EQ(12);
            iA82 = ap0Var5.a8();
            if (iA82 > 0) {
                iA88 = ap0Var5.a8() - 1;
                ap0Var4 = ap0Var5;
            }
        } else {
            ap0Var4 = ap0Var5;
            iA82 = 0;
        }
        long j3 = 0;
        if (ii0Var.DW() && "audio/raw".equals(vi0Var.Zo.k2) && iA85 == 0 && iA8 == 0 && iA82 == 0) {
            vi0Var2 = vi0Var;
            i = iFH;
            fi0 fi0Var = ii0Var;
            int i5 = di0Var.j6;
            long[] jArr5 = new long[i5];
            int[] iArr6 = new int[i5];
            while (di0Var.j6()) {
                int i6 = di0Var.DW;
                jArr5[i6] = di0Var.Hw;
                iArr6[i6] = di0Var.FH;
            }
            int iJ6 = fi0Var.j6();
            long j4 = iA87;
            int i7 = 8192 / iJ6;
            int iU2 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                iU2 += ip0.U2(iArr6[i8], i7);
            }
            long[] jArr6 = new long[iU2];
            int[] iArr7 = new int[iU2];
            long[] jArr7 = new long[iU2];
            int[] iArr8 = new int[iU2];
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int iMax = 0;
            while (i9 < i5) {
                int i12 = iArr6[i9];
                long j5 = jArr5[i9];
                int i13 = i5;
                int i14 = i12;
                while (i14 > 0) {
                    int iMin = Math.min(i7, i14);
                    jArr6[i11] = j5;
                    iArr7[i11] = iJ6 * iMin;
                    iMax = Math.max(iMax, iArr7[i11]);
                    jArr7[i11] = i10 * j4;
                    iArr8[i11] = 1;
                    j5 += iArr7[i11];
                    i10 += iMin;
                    i14 -= iMin;
                    i11++;
                    jArr5 = jArr5;
                    iArr6 = iArr6;
                }
                i9++;
                i5 = i13;
            }
            mi0 mi0Var = new mi0(jArr6, iArr7, iMax, jArr7, iArr8);
            jArr = mi0Var.j6;
            iArr = mi0Var.DW;
            i2 = mi0Var.FH;
            jArr2 = mi0Var.Hw;
            iArr2 = mi0Var.v5;
            j = 0;
        } else {
            long[] jArr8 = new long[iFH];
            iArr = new int[iFH];
            jArr2 = new long[iFH];
            int i15 = iA82;
            iArr2 = new int[iFH];
            int iA89 = iA88;
            long j7 = 0;
            j = 0;
            int i16 = 0;
            i2 = 0;
            int iA810 = 0;
            int i17 = 0;
            int iHw = 0;
            int i18 = iA8;
            int i19 = iA87;
            int i20 = iA86;
            int i21 = iA85;
            int i22 = i15;
            while (i16 < iFH) {
                while (i17 == 0) {
                    ro0.Hw(di0Var.j6());
                    j7 = di0Var.Hw;
                    i17 = di0Var.FH;
                    i19 = i19;
                    i20 = i20;
                }
                int i23 = i20;
                int i24 = i19;
                if (ap0Var6 != null) {
                    while (iA810 == 0 && i18 > 0) {
                        iA810 = ap0Var6.a8();
                        iHw = ap0Var6.Hw();
                        i18--;
                    }
                    iA810--;
                }
                int i25 = iHw;
                jArr8[i16] = j7;
                iArr[i16] = ii0Var.j6();
                if (iArr[i16] > i2) {
                    i2 = iArr[i16];
                }
                int i26 = iFH;
                fi0 fi0Var2 = ii0Var;
                jArr2[i16] = j + i25;
                iArr2[i16] = ap0Var4 == null ? 1 : 0;
                if (i16 == iA89) {
                    iArr2[i16] = 1;
                    i22--;
                    if (i22 > 0) {
                        iA89 = ap0Var4.a8() - 1;
                    }
                }
                long[] jArr9 = jArr8;
                j += i24;
                int i27 = i23 - 1;
                if (i27 != 0 || i21 <= 0) {
                    iA83 = i24;
                    iA84 = i27;
                } else {
                    iA84 = ap0Var3.a8();
                    iA83 = ap0Var3.a8();
                    i21--;
                }
                int i28 = iA84;
                j7 += iArr[i16];
                i17--;
                i16++;
                iFH = i26;
                jArr8 = jArr9;
                iA89 = iA89;
                iHw = i25;
                i20 = i28;
                i19 = iA83;
                ii0Var = fi0Var2;
            }
            i = iFH;
            long[] jArr10 = jArr8;
            int i29 = i20;
            ro0.j6(iA810 == 0);
            while (i18 > 0) {
                ro0.j6(ap0Var6.a8() == 0);
                ap0Var6.Hw();
                i18--;
            }
            if (i22 == 0 && i29 == 0) {
                i4 = i17;
                if (i4 == 0 && i21 == 0) {
                    vi0Var2 = vi0Var;
                }
                jArr = jArr10;
            } else {
                i4 = i17;
            }
            vi0Var2 = vi0Var;
            int i30 = vi0Var2.j6;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i30);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i22);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i29);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i4);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i21);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr10;
        }
        if (vi0Var2.u7 == null || ih0Var.FH()) {
            int[] iArr9 = iArr;
            ip0.gn(jArr2, 1000000L, vi0Var2.FH);
            return new yi0(jArr, iArr9, i2, jArr2, iArr2);
        }
        long[] jArr11 = vi0Var2.u7;
        if (jArr11.length == 1 && vi0Var2.DW == 1 && jArr2.length >= 2) {
            long j8 = vi0Var2.tp[0];
            long jHw = ip0.Hw(jArr11[0], vi0Var2.FH, vi0Var2.Hw) + j8;
            if (jArr2[0] <= j8 && j8 < jArr2[1] && jArr2[jArr2.length - 1] < jHw && jHw <= j) {
                long j9 = j - jHw;
                long jHw2 = ip0.Hw(j8 - jArr2[0], vi0Var2.Zo.eU, vi0Var2.FH);
                long jHw3 = ip0.Hw(j9, vi0Var2.Zo.eU, vi0Var2.FH);
                if ((jHw2 != 0 || jHw3 != 0) && jHw2 <= 2147483647L && jHw3 <= 2147483647L) {
                    ih0Var.j6 = (int) jHw2;
                    ih0Var.DW = (int) jHw3;
                    ip0.gn(jArr2, 1000000L, vi0Var2.FH);
                    return new yi0(jArr, iArr, i2, jArr2, iArr2);
                }
            }
        }
        long[] jArr12 = vi0Var2.u7;
        if (jArr12.length == 1) {
            char c = 0;
            if (jArr12[0] == 0) {
                int i31 = 0;
                while (i31 < jArr2.length) {
                    jArr2[i31] = ip0.Hw(jArr2[i31] - vi0Var2.tp[c], 1000000L, vi0Var2.FH);
                    i31++;
                    c = 0;
                }
                return new yi0(jArr, iArr, i2, jArr2, iArr2);
            }
        }
        boolean z3 = vi0Var2.DW == 1;
        boolean z4 = false;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            long[] jArr13 = vi0Var2.u7;
            j2 = -1;
            if (i34 >= jArr13.length) {
                break;
            }
            int i35 = i2;
            int[] iArr10 = iArr;
            long j10 = vi0Var2.tp[i34];
            if (j10 != -1) {
                i3 = i35;
                long jHw4 = ip0.Hw(jArr13[i34], vi0Var2.FH, vi0Var2.Hw);
                int iXL = ip0.XL(jArr2, j10, true, true);
                int iXL2 = ip0.XL(jArr2, j10 + jHw4, z3, false);
                i32 += iXL2 - iXL;
                z4 |= i33 != iXL;
                i33 = iXL2;
            } else {
                i3 = i35;
            }
            i34++;
            iArr = iArr10;
            i2 = i3;
        }
        int i36 = i2;
        int[] iArr11 = iArr;
        boolean z5 = z4 | (i32 != i);
        long[] jArr14 = z5 ? new long[i32] : jArr;
        int[] iArr12 = z5 ? new int[i32] : iArr11;
        int i37 = z5 ? 0 : i36;
        int[] iArr13 = z5 ? new int[i32] : iArr2;
        long[] jArr15 = new long[i32];
        int i38 = i37;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            long[] jArr16 = vi0Var2.u7;
            if (i39 >= jArr16.length) {
                break;
            }
            int[] iArr14 = iArr12;
            int[] iArr15 = iArr13;
            long j11 = vi0Var2.tp[i39];
            long j12 = jArr16[i39];
            if (j11 != j2) {
                jArr3 = jArr14;
                long[] jArr17 = jArr;
                long jHw5 = ip0.Hw(j12, vi0Var2.FH, vi0Var2.Hw) + j11;
                int iXL3 = ip0.XL(jArr2, j11, true, true);
                int iXL4 = ip0.XL(jArr2, jHw5, z3, false);
                if (z5) {
                    int i41 = iXL4 - iXL3;
                    System.arraycopy(jArr17, iXL3, jArr3, i40, i41);
                    iArr4 = iArr11;
                    z2 = z3;
                    iArr3 = iArr14;
                    System.arraycopy(iArr4, iXL3, iArr3, i40, i41);
                    jArr4 = jArr17;
                    iArr5 = iArr15;
                    System.arraycopy(iArr2, iXL3, iArr5, i40, i41);
                } else {
                    iArr4 = iArr11;
                    jArr4 = jArr17;
                    iArr5 = iArr15;
                    z2 = z3;
                    iArr3 = iArr14;
                }
                int i42 = i38;
                while (iXL3 < iXL4) {
                    int[] iArr16 = iArr5;
                    int[] iArr17 = iArr4;
                    long j13 = j11;
                    jArr15[i40] = ip0.Hw(j3, 1000000L, vi0Var2.Hw) + ip0.Hw(jArr2[iXL3] - j11, 1000000L, vi0Var2.FH);
                    if (z5 && iArr3[i40] > i42) {
                        i42 = iArr17[iXL3];
                    }
                    i40++;
                    iXL3++;
                    iArr4 = iArr17;
                    j11 = j13;
                    iArr5 = iArr16;
                }
                iArr15 = iArr5;
                iArr11 = iArr4;
                i38 = i42;
            } else {
                jArr3 = jArr14;
                jArr4 = jArr;
                z2 = z3;
                iArr3 = iArr14;
            }
            j3 += j12;
            i39++;
            iArr12 = iArr3;
            jArr14 = jArr3;
            z3 = z2;
            iArr13 = iArr15;
            jArr = jArr4;
            j2 = -1;
        }
        long[] jArr18 = jArr14;
        int[] iArr18 = iArr12;
        int[] iArr19 = iArr13;
        boolean z6 = false;
        for (int i43 = 0; i43 < iArr19.length && !z6; i43++) {
            z6 |= (iArr19[i43] & 1) != 0;
        }
        if (z6) {
            return new yi0(jArr18, iArr18, i38, jArr15, iArr19);
        }
        throw new af0("The edited sample sequence does not contain a sync sample.");
    }

    public static zzki Hw(bi0 bi0Var, boolean z) {
        if (z) {
            return null;
        }
        ap0 ap0Var = bi0Var.sg;
        ap0Var.EQ(8);
        while (ap0Var.XL() >= 8) {
            int iDW = ap0Var.DW();
            int iHw = ap0Var.Hw();
            if (ap0Var.Hw() == zh0.AL) {
                ap0Var.EQ(iDW);
                int i = iDW + iHw;
                ap0Var.J0(12);
                while (true) {
                    if (ap0Var.DW() >= i) {
                        break;
                    }
                    int iDW2 = ap0Var.DW();
                    int iHw2 = ap0Var.Hw();
                    if (ap0Var.Hw() == zh0.w9) {
                        ap0Var.EQ(iDW2);
                        int i2 = iDW2 + iHw2;
                        ap0Var.J0(8);
                        ArrayList arrayList = new ArrayList();
                        while (ap0Var.DW() < i2) {
                            zzki.zza zzaVarHw = qi0.Hw(ap0Var);
                            if (zzaVarHw != null) {
                                arrayList.add(zzaVarHw);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzki(arrayList);
                        }
                    } else {
                        ap0Var.J0(iHw2 - 8);
                    }
                }
                return null;
            }
            ap0Var.J0(iHw - 8);
        }
        return null;
    }

    private static int Zo(ap0 ap0Var) {
        int iVH = ap0Var.VH();
        int i = iVH & 127;
        while ((iVH & 128) == 128) {
            iVH = ap0Var.VH();
            i = (i << 7) | (iVH & 127);
        }
        return i;
    }

    private static int j6(ap0 ap0Var, int i, int i2, gi0 gi0Var, int i3) {
        int iDW = ap0Var.DW();
        while (true) {
            if (iDW - i >= i2) {
                return 0;
            }
            ap0Var.EQ(iDW);
            int iHw = ap0Var.Hw();
            ro0.DW(iHw > 0, "childAtomSize should be positive");
            if (ap0Var.Hw() == zh0.Qq) {
                int i4 = iDW + 8;
                Pair pairCreate = null;
                Integer numValueOf = null;
                wi0 wi0Var = null;
                boolean z = false;
                while (i4 - iDW < iHw) {
                    ap0Var.EQ(i4);
                    int iHw2 = ap0Var.Hw();
                    int iHw3 = ap0Var.Hw();
                    if (iHw3 == zh0.XX) {
                        numValueOf = Integer.valueOf(ap0Var.Hw());
                    } else if (iHw3 == zh0.sy) {
                        ap0Var.J0(4);
                        z = ap0Var.Hw() == VH;
                    } else if (iHw3 == zh0.aj) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= iHw2) {
                                wi0Var = null;
                                break;
                            }
                            ap0Var.EQ(i5);
                            int iHw4 = ap0Var.Hw();
                            if (ap0Var.Hw() == zh0.lp) {
                                ap0Var.J0(6);
                                boolean z2 = ap0Var.VH() == 1;
                                int iVH = ap0Var.VH();
                                byte[] bArr = new byte[16];
                                ap0Var.QX(bArr, 0, 16);
                                wi0Var = new wi0(z2, iVH, bArr);
                            } else {
                                i5 += iHw4;
                            }
                        }
                    }
                    i4 += iHw2;
                }
                if (z) {
                    ro0.DW(numValueOf != null, "frma atom is mandatory");
                    ro0.DW(wi0Var != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, wi0Var);
                }
                if (pairCreate != null) {
                    gi0Var.j6[i3] = (wi0) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            iDW += iHw;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<java.lang.String, byte[]> v5(com.google.android.gms.internal.ads.ap0 r3, int r4) {
        /*
            int r4 = r4 + 8
            int r4 = r4 + 4
            r3.EQ(r4)
            r4 = 1
            r3.J0(r4)
            Zo(r3)
            r0 = 2
            r3.J0(r0)
            int r1 = r3.VH()
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L1d
            r3.J0(r0)
        L1d:
            r2 = r1 & 64
            if (r2 == 0) goto L28
            int r2 = r3.gn()
            r3.J0(r2)
        L28:
            r2 = 32
            r1 = r1 & r2
            if (r1 == 0) goto L30
            r3.J0(r0)
        L30:
            r3.J0(r4)
            Zo(r3)
            int r0 = r3.VH()
            r1 = 0
            if (r0 == r2) goto L80
            r2 = 33
            if (r0 == r2) goto L7d
            r2 = 35
            if (r0 == r2) goto L7a
            r2 = 64
            if (r0 == r2) goto L77
            r2 = 107(0x6b, float:1.5E-43)
            if (r0 == r2) goto L70
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L6d
            r2 = 166(0xa6, float:2.33E-43)
            if (r0 == r2) goto L6a
            switch(r0) {
                case 102: goto L77;
                case 103: goto L77;
                case 104: goto L77;
                default: goto L58;
            }
        L58:
            switch(r0) {
                case 169: goto L63;
                case 170: goto L5c;
                case 171: goto L5c;
                case 172: goto L63;
                default: goto L5b;
            }
        L5b:
            goto L82
        L5c:
            java.lang.String r3 = "audio/vnd.dts.hd"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L63:
            java.lang.String r3 = "audio/vnd.dts"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L6a:
            java.lang.String r1 = "audio/eac3"
            goto L82
        L6d:
            java.lang.String r1 = "audio/ac3"
            goto L82
        L70:
            java.lang.String r3 = "audio/mpeg"
            android.util.Pair r3 = android.util.Pair.create(r3, r1)
            return r3
        L77:
            java.lang.String r1 = "audio/mp4a-latm"
            goto L82
        L7a:
            java.lang.String r1 = "video/hevc"
            goto L82
        L7d:
            java.lang.String r1 = "video/avc"
            goto L82
        L80:
            java.lang.String r1 = "video/mp4v-es"
        L82:
            r0 = 12
            r3.J0(r0)
            r3.J0(r4)
            int r4 = Zo(r3)
            byte[] r0 = new byte[r4]
            r2 = 0
            r3.QX(r0, r2, r4)
            android.util.Pair r3 = android.util.Pair.create(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ci0.v5(com.google.android.gms.internal.ads.ap0, int):android.util.Pair");
    }
}
