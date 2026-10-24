package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class g4 {
    public static final byte[] DW;
    static final Charset j6 = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        DW = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = DW;
        f3.Hw(bArr2, 0, bArr2.length, false);
    }

    public static int DW(byte[] bArr) {
        int length = bArr.length;
        int iFH = FH(length, bArr, 0, length);
        if (iFH == 0) {
            return 1;
        }
        return iFH;
    }

    static int FH(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static <T> T Hw(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean VH(l5 l5Var) {
        return false;
    }

    public static int Zo(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean gn(byte[] bArr) {
        return c7.we(bArr);
    }

    static <T> T j6(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static int tp(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String u7(byte[] bArr) {
        return new String(bArr, j6);
    }

    static Object v5(Object obj, Object obj2) {
        m5 m5VarJ6 = ((l5) obj).j6();
        m5VarJ6.aM((l5) obj2);
        return m5VarJ6.a8();
    }
}
