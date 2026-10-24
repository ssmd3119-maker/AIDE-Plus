package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class p {
    public static void DW(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int EQ(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void FH(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static void Hw(String str) {
        if (!com.google.android.gms.common.util.v.j6()) {
            throw new IllegalStateException(str);
        }
    }

    public static void J0(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void VH() {
        gn("Must not be called on the main application thread");
    }

    public static String Zo(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void gn(String str) {
        if (com.google.android.gms.common.util.v.j6()) {
            throw new IllegalStateException(str);
        }
    }

    public static void j6(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T tp(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T u7(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static String v5(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static void we(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
