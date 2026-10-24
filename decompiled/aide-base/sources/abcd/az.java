package abcd;

import java.lang.Thread;

/* loaded from: classes.dex */
public class az {

    static class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler j6;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.j6 = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                py.dx(thread, th);
                long jCurrentTimeMillis = System.currentTimeMillis();
                b00.j6("Flush", "Initiating uncaught exception flush.");
                if (kz.DW(1500L)) {
                    b00.j6("Flush", "Flush successful: elapsed " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms.");
                } else {
                    b00.j6("Flush", "Could not flush within allotted time of 1500ms.");
                }
            } catch (Throwable th2) {
                b00.VH("Runtime Error", th2);
            }
            this.j6.uncaughtException(thread, th);
        }
    }

    public static void j6() {
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
    }
}
