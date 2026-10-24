package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class e4 {
    public static boolean DW = Log.isLoggable("Volley", 2);
    private static final String FH = e4.class.getName();
    private static String j6 = "Volley";

    static class a {
        public static final boolean FH = e4.DW;
        private final List<y4> j6 = new ArrayList();
        private boolean DW = false;

        a() {
        }

        public final synchronized void DW(String str) {
            this.DW = true;
            long j = this.j6.size() == 0 ? 0L : this.j6.get(this.j6.size() - 1).FH - this.j6.get(0).FH;
            if (j <= 0) {
                return;
            }
            long j2 = this.j6.get(0).FH;
            e4.j6("(%-4d ms) %s", Long.valueOf(j), str);
            for (y4 y4Var : this.j6) {
                long j3 = y4Var.FH;
                e4.j6("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(y4Var.DW), y4Var.j6);
                j2 = j3;
            }
        }

        protected final void finalize() {
            if (this.DW) {
                return;
            }
            DW("Request on the loose");
            e4.DW("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        public final synchronized void j6(String str, long j) {
            if (this.DW) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.j6.add(new y4(str, j, SystemClock.elapsedRealtime()));
        }
    }

    public static void DW(String str, Object... objArr) {
        Log.e(j6, Hw(str, objArr));
    }

    public static void FH(String str, Object... objArr) {
        if (DW) {
            Log.v(j6, Hw(str, objArr));
        }
    }

    private static String Hw(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(FH)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(strSubstring2);
                sb.append(".");
                sb.append(methodName);
                string = sb.toString();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
    }

    public static void j6(String str, Object... objArr) {
        Log.d(j6, Hw(str, objArr));
    }

    public static void v5(Throwable th, String str, Object... objArr) {
        Log.e(j6, Hw(str, objArr), th);
    }
}
