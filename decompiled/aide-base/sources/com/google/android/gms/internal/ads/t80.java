package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t80 {
    /* JADX INFO: Access modifiers changed from: private */
    public static void DW(byte b, byte b2, byte b3, char[] cArr, int i) throws y50 {
        if (we(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || we(b3)))) {
            throw y50.u7();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean EQ(byte b) {
        return b < -16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void FH(byte b, byte b2, char[] cArr, int i) throws y50 {
        if (b < -62 || we(b2)) {
            throw y50.u7();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Hw(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j6(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws y50 {
        if (we(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || we(b3) || we(b4)) {
            throw y50.u7();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean tp(byte b) {
        return b < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u7(byte b) {
        return b >= 0;
    }

    private static boolean we(byte b) {
        return b > -65;
    }
}
