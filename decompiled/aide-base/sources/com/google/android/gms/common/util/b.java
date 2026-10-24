package com.google.android.gms.common.util;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {
    public static <T> T[] DW(T[] tArr, T... tArr2) {
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
        if (tArr2.length == 1) {
            i = 0;
            for (T t : tArr) {
                if (!com.google.android.gms.common.internal.o.j6(tArr2[0], t)) {
                    tArr3[i] = t;
                    i++;
                }
            }
        } else {
            int i2 = 0;
            for (T t2 : tArr) {
                if (!j6(tArr2, t2)) {
                    tArr3[i2] = t2;
                    i2++;
                }
            }
            i = i2;
        }
        if (tArr3 == null) {
            return null;
        }
        return i != tArr3.length ? (T[]) Arrays.copyOf(tArr3, i) : tArr3;
    }

    public static void FH(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    public static void Hw(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    public static <T> void VH(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i].toString());
        }
    }

    public static void Zo(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    public static void gn(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    public static <T> boolean j6(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (com.google.android.gms.common.internal.o.j6(tArr[i], t)) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static void u7(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }

    public static void v5(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }
}
