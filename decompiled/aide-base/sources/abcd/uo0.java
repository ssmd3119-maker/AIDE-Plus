package abcd;

/* loaded from: classes.dex */
public abstract class uo0 {
    public static long DW(byte[] bArr, int i) {
        return (j6(bArr, i + 4) & 4294967295L) | ((j6(bArr, i) & 4294967295L) << 32);
    }

    public static void FH(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void Hw(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void Zo(long j, byte[] bArr, int i) {
        Hw((int) (4294967295L & j), bArr, i);
        Hw((int) (j >>> 32), bArr, i + 4);
    }

    public static int j6(byte[] bArr, int i) {
        int i2 = bArr[i] << 24;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = i3 + 1;
        return (bArr[i5 + 1] & 255) | i4 | ((bArr[i5] & 255) << 8);
    }

    public static void v5(long j, byte[] bArr, int i) {
        FH((int) (j >>> 32), bArr, i);
        FH((int) (j & 4294967295L), bArr, i + 4);
    }
}
