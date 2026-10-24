package com.google.android.gms.internal.ads;

import android.util.Log;

@jg
/* loaded from: classes.dex */
public class xp {
    public static boolean DW(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    public static void EQ(String str) {
        Zo(str, null);
    }

    public static void FH(String str, Throwable th) {
        if (DW(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void Hw(String str, Throwable th) {
        if (DW(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void VH(String str) {
        if (DW(3)) {
            Log.d("Ads", str);
        }
    }

    public static void Zo(String str, Throwable th) {
        if (DW(5)) {
            if (th != null) {
                v5(tp(str), th);
            } else {
                u7(tp(str));
            }
        }
    }

    public static void gn(String str) {
        if (DW(4)) {
            Log.i("Ads", str);
        }
    }

    public static void j6(String str) {
        if (DW(6)) {
            Log.e("Ads", str);
        }
    }

    private static String tp(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void u7(String str) {
        if (DW(5)) {
            Log.w("Ads", str);
        }
    }

    public static void v5(String str, Throwable th) {
        if (DW(5)) {
            Log.w("Ads", str, th);
        }
    }
}
