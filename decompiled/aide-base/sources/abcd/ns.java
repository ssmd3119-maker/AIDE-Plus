package abcd;

/* loaded from: classes.dex */
public final class ns {
    public static int DW(int[] iArr) {
        int iBitCount = 0;
        for (int i : iArr) {
            iBitCount += Integer.bitCount(i);
        }
        return iBitCount;
    }

    public static void EQ(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public static void FH(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = ((1 << (i & 31)) ^ (-1)) & iArr[i2];
    }

    public static int Hw(int i, int i2) {
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i & (((1 << i2) - 1) ^ (-1)));
        if (iNumberOfTrailingZeros == 32) {
            return -1;
        }
        return iNumberOfTrailingZeros;
    }

    public static int VH(int[] iArr) {
        return iArr.length * 32;
    }

    public static boolean Zo(int[] iArr, int i) {
        return (iArr[i >> 5] & (1 << (i & 31))) != 0;
    }

    public static boolean gn(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean j6(int[] iArr, int i, int i2) {
        int iV5 = v5(iArr, i);
        return iV5 >= 0 && iV5 < i2;
    }

    public static void tp(int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            iArr[i] = iArr[i] | iArr2[i];
        }
    }

    public static int[] u7(int i) {
        return new int[(i + 31) >> 5];
    }

    public static int v5(int[] iArr, int i) {
        int iHw;
        int length = iArr.length;
        int i2 = i & 31;
        for (int i3 = i >> 5; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0 && (iHw = Hw(i4, i2)) >= 0) {
                return (i3 << 5) + iHw;
            }
            i2 = 0;
        }
        return -1;
    }

    public static void we(int[] iArr, int i, boolean z) {
        int i2 = i >> 5;
        int i3 = 1 << (i & 31);
        if (z) {
            iArr[i2] = i3 | iArr[i2];
        } else {
            iArr[i2] = (i3 ^ (-1)) & iArr[i2];
        }
    }
}
