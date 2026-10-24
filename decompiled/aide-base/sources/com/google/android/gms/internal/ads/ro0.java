package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ro0 {
    public static void DW(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T> T FH(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static void Hw(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static int Zo(int i, int i2, int i3) {
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    public static void j6(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void v5(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
