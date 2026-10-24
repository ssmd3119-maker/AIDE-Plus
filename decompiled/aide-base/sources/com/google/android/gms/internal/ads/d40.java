package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class d40 {
    private static final boolean DW;
    private static final Class<?> j6 = FH("libcore.io.Memory");

    static {
        DW = FH("org.robolectric.Robolectric") != null;
    }

    static Class<?> DW() {
        return j6;
    }

    private static <T> Class<T> FH(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean j6() {
        return (j6 == null || DW) ? false : true;
    }
}
