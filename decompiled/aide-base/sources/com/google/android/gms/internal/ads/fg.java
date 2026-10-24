package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class fg implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ dg DW;
    private final /* synthetic */ Thread.UncaughtExceptionHandler j6;

    fg(dg dgVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.DW = dgVar;
        this.j6 = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.DW.Hw(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.j6;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            xp.j6("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.j6;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
