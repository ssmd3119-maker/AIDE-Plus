package abcd;

@cy(clazz = -4300697046702703185L, container = -4300697046702703185L, user = true)
/* loaded from: classes.dex */
public class h8 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = -1521855231645763872L)
    private static final byte[] j6;

    static {
        try {
            iy.Zo(h8.class);
            if (DW) {
                iy.gn(782219235085988115L, null);
            }
            h8.class.desiredAssertionStatus();
            j6 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 782219235085988115L, null);
            }
            throw th;
        }
    }

    @ey(method = -2954425623478787736L)
    private h8() {
        try {
            if (DW) {
                iy.gn(-1741002306189647952L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -1741002306189647952L, null);
            }
            throw th;
        }
    }

    @ey(method = 465696393216448585L)
    public static byte[] DW(byte[] bArr, int i, int i2) {
        try {
            if (DW) {
                iy.we(327474969533657088L, null, bArr, new Integer(i), new Integer(i2));
            }
            return FH(bArr, i, i2, j6);
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, 327474969533657088L, null, bArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -537323136479191200L)
    public static byte[] FH(byte[] bArr, int i, int i2, byte[] bArr2) {
        try {
            if (DW) {
                iy.J0(-891347396167264245L, null, bArr, new Integer(i), new Integer(i2), bArr2);
            }
            byte[] bArr3 = new byte[((i2 * 3) / 4) + 2];
            byte[] bArr4 = new byte[4];
            int i3 = 0;
            int i4 = 0;
            int iHw = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + i;
                byte b = (byte) (bArr[i5] & 127);
                byte b2 = bArr2[b];
                if (b2 < -5) {
                    throw new i8("Bad Base64 input character at " + i3 + ": " + ((int) bArr[i5]) + "(decimal)");
                }
                if (b2 >= -1) {
                    if (b == 61) {
                        int i6 = i2 - i3;
                        byte b3 = (byte) (bArr[(i2 - 1) + i] & 127);
                        if (i4 == 0 || i4 == 1) {
                            throw new i8("invalid padding byte '=' at byte offset " + i3);
                        }
                        if ((i4 == 3 && i6 > 2) || (i4 == 4 && i6 > 1)) {
                            throw new i8("padding byte '=' falsely signals end of encoded value at offset " + i3);
                        }
                        if (b3 != 61 && b3 != 10) {
                            throw new i8("encoded value has invalid trailing byte");
                        }
                    } else {
                        int i7 = i4 + 1;
                        bArr4[i4] = b;
                        if (i7 == 4) {
                            iHw += Hw(bArr4, 0, bArr3, iHw, bArr2);
                            i4 = 0;
                        } else {
                            i4 = i7;
                        }
                    }
                }
                i3++;
            }
            if (i4 != 0) {
                if (i4 == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("single trailing character at offset ");
                    sb.append(i2 - 1);
                    throw new i8(sb.toString());
                }
                bArr4[i4] = 61;
                iHw += Hw(bArr4, 0, bArr3, iHw, bArr2);
            }
            byte[] bArr5 = new byte[iHw];
            System.arraycopy(bArr3, 0, bArr5, 0, iHw);
            return bArr5;
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, -891347396167264245L, null, bArr, new Integer(i), new Integer(i2), bArr2);
            }
            throw th;
        }
    }

    @ey(method = -1002586934446808027L)
    private static int Hw(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        try {
            if (DW) {
                iy.J8(1787674903232578976L, null, bArr, new Integer(i), bArr2, new Integer(i2), bArr3);
            }
            int i3 = i + 2;
            if (bArr[i3] == 61) {
                bArr2[i2] = (byte) ((((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12)) >>> 16);
                return 1;
            }
            int i4 = i + 3;
            if (bArr[i4] == 61) {
                int i5 = ((bArr3[bArr[i3]] << 24) >>> 18) | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12);
                bArr2[i2] = (byte) (i5 >>> 16);
                bArr2[i2 + 1] = (byte) (i5 >>> 8);
                return 2;
            }
            int i6 = ((bArr3[bArr[i3]] << 24) >>> 18) | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i4]] << 24) >>> 24);
            bArr2[i2] = (byte) (i6 >> 16);
            bArr2[i2 + 1] = (byte) (i6 >> 8);
            bArr2[i2 + 2] = (byte) i6;
            return 3;
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 1787674903232578976L, null, bArr, new Integer(i), bArr2, new Integer(i2), bArr3);
            }
            throw th;
        }
    }

    @ey(method = 727678514691106896L)
    public static byte[] j6(String str) {
        try {
            if (DW) {
                iy.tp(99001076068885771L, null, str);
            }
            byte[] bytes = str.getBytes();
            return DW(bytes, 0, bytes.length);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 99001076068885771L, null, str);
            }
            throw th;
        }
    }
}
