package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x7 {
    public static final Object DW;
    protected static final Charset j6 = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        DW = new Object();
    }

    public static boolean DW(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    public static boolean FH(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length;
                boolean z2 = i2 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    public static int Hw(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(iArr);
    }

    public static void VH(t7 t7Var, t7 t7Var2) {
        v7 v7Var = t7Var.DW;
        if (v7Var != null) {
            t7Var2.DW = (v7) v7Var.clone();
        }
    }

    public static int Zo(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                iHashCode = (iHashCode * 31) + obj.hashCode();
            }
        }
        return iHashCode;
    }

    public static boolean j6(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    public static int v5(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }
}
