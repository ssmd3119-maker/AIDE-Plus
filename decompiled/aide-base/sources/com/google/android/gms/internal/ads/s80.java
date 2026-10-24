package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s80 {
    private static final u80 j6;

    static {
        j6 = (!(q80.we() && q80.J0()) || d40.j6()) ? new v80() : new x80();
    }

    static int DW(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return j6.DW(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int EQ(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return Zo(b);
        }
        if (i3 == 1) {
            return Hw(b, bArr[i]);
        }
        if (i3 == 2) {
            return gn(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    static void FH(CharSequence charSequence, ByteBuffer byteBuffer) {
        u80 u80Var = j6;
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(DW(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            u80Var.FH(charSequence, byteBuffer);
        } else {
            u80.Hw(charSequence, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Hw(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static boolean J8(byte[] bArr) {
        return j6.v5(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Zo(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gn(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static int j6(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new w80(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = i3 + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean tp(byte[] bArr, int i, int i2) {
        return j6.v5(bArr, i, i2);
    }

    static String we(byte[] bArr, int i, int i2) {
        return j6.Zo(bArr, i, i2);
    }
}
