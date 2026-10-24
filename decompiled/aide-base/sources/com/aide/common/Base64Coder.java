package com.aide.common;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;

@cy(clazz = 3652670998646084835L, container = 3652670998646084835L, user = true)
/* loaded from: classes.dex */
public class Base64Coder {

    @dy(field = 2232468409789294999L)
    private static final byte[] DW;

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 2232362214247671792L)
    private static final char[] j6;

    static {
        try {
            iy.Zo(Base64Coder.class);
            if (FH) {
                iy.gn(817984480114782529L, null);
            }
            System.getProperty("line.separator");
            j6 = new char[64];
            char c = 'A';
            int i = 0;
            while (c <= 'Z') {
                j6[i] = c;
                c = (char) (c + 1);
                i++;
            }
            char c2 = 'a';
            while (c2 <= 'z') {
                j6[i] = c2;
                c2 = (char) (c2 + 1);
                i++;
            }
            char c3 = '0';
            while (c3 <= '9') {
                j6[i] = c3;
                c3 = (char) (c3 + 1);
                i++;
            }
            j6[i] = '+';
            j6[i + 1] = '/';
            DW = new byte[128];
            for (int i2 = 0; i2 < DW.length; i2++) {
                DW[i2] = -1;
            }
            for (int i3 = 0; i3 < 64; i3++) {
                DW[j6[i3]] = (byte) i3;
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 817984480114782529L, null);
            }
            throw th;
        }
    }

    @ey(method = -486250662208906560L)
    private Base64Coder() {
        try {
            if (FH) {
                iy.gn(3560877588869042785L, null);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 3560877588869042785L, null);
            }
            throw th;
        }
    }

    @ey(method = 416888748184978500L)
    public static byte[] DW(char[] cArr) {
        try {
            if (FH) {
                iy.tp(-580864727814534699L, null, cArr);
            }
            return FH(cArr, 0, cArr.length);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -580864727814534699L, null, cArr);
            }
            throw th;
        }
    }

    @ey(method = -646720484262534432L)
    public static byte[] FH(char[] cArr, int i, int i2) {
        int i3;
        char c;
        int i4;
        char c2;
        try {
            if (FH) {
                iy.we(-1329082667528528781L, null, cArr, new Integer(i), new Integer(i2));
            }
            if (i2 % 4 != 0) {
                throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
            }
            while (i2 > 0 && cArr[(i + i2) - 1] == '=') {
                i2--;
            }
            int i5 = (i2 * 3) / 4;
            byte[] bArr = new byte[i5];
            int i6 = i + i2;
            int i7 = 0;
            for (int i8 = i; i8 < i6; i8 = i4) {
                int i9 = i8 + 1;
                char c3 = cArr[i8];
                int i10 = i9 + 1;
                char c4 = cArr[i9];
                if (i10 < i6) {
                    i3 = i10 + 1;
                    c = cArr[i10];
                } else {
                    i3 = i10;
                    c = 'A';
                }
                if (i3 < i6) {
                    i4 = i3 + 1;
                    c2 = cArr[i3];
                } else {
                    i4 = i3;
                    c2 = 'A';
                }
                if (c3 > 127 || c4 > 127 || c > 127 || c2 > 127) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                byte b = DW[c3];
                byte b2 = DW[c4];
                byte b3 = DW[c];
                byte b4 = DW[c2];
                if (b < 0 || b2 < 0 || b3 < 0 || b4 < 0) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                int i11 = (b << 2) | (b2 >>> 4);
                int i12 = ((b2 & 15) << 4) | (b3 >>> 2);
                int i13 = ((b3 & 3) << 6) | b4;
                int i14 = i7 + 1;
                bArr[i7] = (byte) i11;
                if (i14 < i5) {
                    bArr[i14] = (byte) i12;
                    i14++;
                }
                if (i14 < i5) {
                    i7 = i14 + 1;
                    bArr[i14] = (byte) i13;
                } else {
                    i7 = i14;
                }
            }
            return bArr;
        } finally {
        }
    }

    @ey(method = 124666146648241825L)
    public static char[] Hw(byte[] bArr) {
        try {
            if (FH) {
                iy.tp(-11316083948896048L, null, bArr);
            }
            return v5(bArr, 0, bArr.length);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -11316083948896048L, null, bArr);
            }
            throw th;
        }
    }

    @ey(method = -901443613635461248L)
    public static byte[] j6(String str) {
        try {
            if (FH) {
                iy.tp(144228122012975121L, null, str);
            }
            return DW(str.toCharArray());
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 144228122012975121L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3331353606720069651L)
    public static char[] v5(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        try {
            if (FH) {
                iy.we(77141844226625856L, null, bArr, new Integer(i), new Integer(i2));
            }
            int i6 = ((i2 * 4) + 2) / 3;
            char[] cArr = new char[((i2 + 2) / 3) * 4];
            int i7 = i + i2;
            int i8 = i;
            int i9 = 0;
            while (i8 < i7) {
                int i10 = i8 + 1;
                int i11 = bArr[i8] & 255;
                if (i10 < i7) {
                    i3 = i10 + 1;
                    i4 = bArr[i10] & 255;
                } else {
                    i3 = i10;
                    i4 = 0;
                }
                if (i3 < i7) {
                    i5 = bArr[i3] & 255;
                    i3++;
                } else {
                    i5 = 0;
                }
                int i12 = i11 >>> 2;
                int i13 = ((i11 & 3) << 4) | (i4 >>> 4);
                int i14 = ((i4 & 15) << 2) | (i5 >>> 6);
                int i15 = i5 & 63;
                int i16 = i9 + 1;
                cArr[i9] = j6[i12];
                int i17 = i16 + 1;
                cArr[i16] = j6[i13];
                cArr[i17] = i17 < i6 ? j6[i14] : '=';
                int i18 = i17 + 1;
                cArr[i18] = i18 < i6 ? j6[i15] : '=';
                i9 = i18 + 1;
                i8 = i3;
            }
            return cArr;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 77141844226625856L, null, bArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
