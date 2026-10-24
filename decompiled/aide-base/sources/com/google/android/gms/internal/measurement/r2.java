package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class r2 {
    private static final boolean DW;
    private static final Class<?> j6 = j6("libcore.io.Memory");

    static {
        DW = j6("org.robolectric.Robolectric") != null;
    }

    static boolean DW() {
        return (j6 == null || DW) ? false : true;
    }

    static Class<?> FH() {
        return j6;
    }

    private static <T> Class<T> j6(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
