package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class t50 {
    public static final byte[] DW;
    static final Charset j6 = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        DW = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = DW;
        s40.lg(bArr2, 0, bArr2.length, false);
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

    public static int VH(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int Zo(boolean z) {
        return z ? 1231 : 1237;
    }

    static boolean gn(z60 z60Var) {
        return false;
    }

    static <T> T j6(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static String tp(byte[] bArr) {
        return new String(bArr, j6);
    }

    public static boolean u7(byte[] bArr) {
        return s80.J8(bArr);
    }

    static Object v5(Object obj, Object obj2) {
        a70 a70VarJ6 = ((z60) obj).j6();
        a70VarJ6.vy((z60) obj2);
        return a70VarJ6.KD();
    }
}
