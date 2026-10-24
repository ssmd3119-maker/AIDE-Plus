package abcd;

/* loaded from: classes.dex */
public final class ig0 {
    public static int DW(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (((((bArr[i] << 8) | (bArr[i + 1] & 255)) << 8) | (bArr[i + 2] & 255)) << 8);
    }

    public static int FH(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static long Hw(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255)) << 8) | (bArr[i + 3] & 255);
    }

    public static void VH(byte[] bArr, int i, int i2) {
        bArr[i + 3] = (byte) i2;
        int i3 = i2 >>> 8;
        bArr[i + 2] = (byte) i3;
        int i4 = i3 >>> 8;
        bArr[i + 1] = (byte) i4;
        bArr[i] = (byte) (i4 >>> 8);
    }

    public static void Zo(byte[] bArr, int i, int i2) {
        bArr[i + 1] = (byte) i2;
        bArr[i] = (byte) (i2 >>> 8);
    }

    public static void gn(byte[] bArr, int i, long j) {
        bArr[i + 7] = (byte) j;
        long j2 = j >>> 8;
        bArr[i + 6] = (byte) j2;
        long j3 = j2 >>> 8;
        bArr[i + 5] = (byte) j3;
        long j4 = j3 >>> 8;
        bArr[i + 4] = (byte) j4;
        long j5 = j4 >>> 8;
        bArr[i + 3] = (byte) j5;
        long j6 = j5 >>> 8;
        bArr[i + 2] = (byte) j6;
        bArr[i + 1] = (byte) (j6 >>> 8);
        bArr[i] = (byte) (r5 >>> 8);
    }

    public static int j6(int i, int i2) {
        int i3 = (i >>> 1) - (i2 >>> 1);
        return i3 != 0 ? i3 : (i & 1) - (i2 & 1);
    }

    public static long v5(byte[] bArr, int i) {
        return Hw(bArr, i + 4) | (Hw(bArr, i) << 32);
    }
}
