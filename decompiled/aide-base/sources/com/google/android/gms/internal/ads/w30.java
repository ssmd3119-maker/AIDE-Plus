package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public final class w30 extends t30 {
    private final u30 j6 = new u30();

    w30() {
    }

    @Override // com.google.android.gms.internal.ads.t30
    public final void DW(Throwable th) {
        th.printStackTrace();
        List<Throwable> listJ6 = this.j6.j6(th, false);
        if (listJ6 == null) {
            return;
        }
        synchronized (listJ6) {
            for (Throwable th2 : listJ6) {
                System.err.print("Suppressed: ");
                th2.printStackTrace();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t30
    public final void j6(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> listJ6 = this.j6.j6(th, false);
        if (listJ6 == null) {
            return;
        }
        synchronized (listJ6) {
            for (Throwable th2 : listJ6) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }
}
