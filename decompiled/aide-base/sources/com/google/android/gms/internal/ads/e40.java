package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class e40 {
    static int DW(int i, byte[] bArr, int i2, int i3, x50<?> x50Var, f40 f40Var) {
        s50 s50Var = (s50) x50Var;
        int iV5 = v5(bArr, i2, f40Var);
        s50Var.EQ(f40Var.j6);
        while (iV5 < i3) {
            int iV52 = v5(bArr, iV5, f40Var);
            if (i != f40Var.j6) {
                break;
            }
            iV5 = v5(bArr, iV52, f40Var);
            s50Var.EQ(f40Var.j6);
        }
        return iV5;
    }

    static int EQ(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int FH(int i, byte[] bArr, int i2, int i3, k80 k80Var, f40 f40Var) throws y50 {
        if ((i >>> 3) == 0) {
            throw y50.Hw();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iVH = VH(bArr, i2, f40Var);
            k80Var.EQ(i, Long.valueOf(f40Var.DW));
            return iVH;
        }
        if (i4 == 1) {
            k80Var.EQ(i, Long.valueOf(we(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iV5 = v5(bArr, i2, f40Var);
            int i5 = f40Var.j6;
            if (i5 < 0) {
                throw y50.DW();
            }
            if (i5 > bArr.length - iV5) {
                throw y50.j6();
            }
            if (i5 == 0) {
                k80Var.EQ(i, i40.mb);
            } else {
                k80Var.EQ(i, i40.a8(bArr, iV5, i5));
            }
            return iV5 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw y50.Hw();
            }
            k80Var.EQ(i, Integer.valueOf(EQ(bArr, i2)));
            return i2 + 4;
        }
        k80 k80VarVH = k80.VH();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iV52 = v5(bArr, i2, f40Var);
            int i8 = f40Var.j6;
            i7 = i8;
            if (i8 == i6) {
                i2 = iV52;
                break;
            }
            int iFH = FH(i7, bArr, iV52, i3, k80VarVH, f40Var);
            i7 = i8;
            i2 = iFH;
        }
        if (i2 > i3 || i7 != i6) {
            throw y50.gn();
        }
        k80Var.EQ(i, k80VarVH);
        return i2;
    }

    static int Hw(int i, byte[] bArr, int i2, f40 f40Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            f40Var.j6 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            f40Var.j6 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            f40Var.j6 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            f40Var.j6 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                f40Var.j6 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static double J0(byte[] bArr, int i) {
        return Double.longBitsToDouble(we(bArr, i));
    }

    static float J8(byte[] bArr, int i) {
        return Float.intBitsToFloat(EQ(bArr, i));
    }

    static int VH(byte[] bArr, int i, f40 f40Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            f40Var.DW = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        f40Var.DW = j2;
        return i3;
    }

    static int Zo(byte[] bArr, int i, x50<?> x50Var, f40 f40Var) {
        s50 s50Var = (s50) x50Var;
        int iV5 = v5(bArr, i, f40Var);
        int i2 = f40Var.j6 + iV5;
        while (iV5 < i2) {
            iV5 = v5(bArr, iV5, f40Var);
            s50Var.EQ(f40Var.j6);
        }
        if (iV5 == i2) {
            return iV5;
        }
        throw y50.j6();
    }

    static int gn(byte[] bArr, int i, f40 f40Var) throws y50 {
        int iV5 = v5(bArr, i, f40Var);
        int i2 = f40Var.j6;
        if (i2 < 0) {
            throw y50.DW();
        }
        if (i2 == 0) {
            f40Var.FH = "";
            return iV5;
        }
        f40Var.FH = new String(bArr, iV5, i2, t50.j6);
        return iV5 + i2;
    }

    static int j6(int i, byte[] bArr, int i2, int i3, f40 f40Var) {
        if ((i >>> 3) == 0) {
            throw y50.Hw();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return VH(bArr, i2, f40Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return v5(bArr, i2, f40Var) + f40Var.j6;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw y50.Hw();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = v5(bArr, i2, f40Var);
            i6 = f40Var.j6;
            if (i6 == i5) {
                break;
            }
            i2 = j6(i6, bArr, i2, i3, f40Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw y50.gn();
        }
        return i2;
    }

    static int tp(byte[] bArr, int i, f40 f40Var) {
        int iV5 = v5(bArr, i, f40Var);
        int i2 = f40Var.j6;
        if (i2 < 0) {
            throw y50.DW();
        }
        if (i2 > bArr.length - iV5) {
            throw y50.j6();
        }
        if (i2 == 0) {
            f40Var.FH = i40.mb;
            return iV5;
        }
        f40Var.FH = i40.a8(bArr, iV5, i2);
        return iV5 + i2;
    }

    static int u7(byte[] bArr, int i, f40 f40Var) throws y50 {
        int iV5 = v5(bArr, i, f40Var);
        int i2 = f40Var.j6;
        if (i2 < 0) {
            throw y50.DW();
        }
        if (i2 == 0) {
            f40Var.FH = "";
            return iV5;
        }
        f40Var.FH = s80.we(bArr, iV5, i2);
        return iV5 + i2;
    }

    static int v5(byte[] bArr, int i, f40 f40Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return Hw(b, bArr, i2, f40Var);
        }
        f40Var.j6 = b;
        return i2;
    }

    static long we(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
