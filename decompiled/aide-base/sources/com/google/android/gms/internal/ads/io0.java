package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class io0 implements no0 {
    private ko0<? extends lo0> DW;
    private IOException FH;
    private final ExecutorService j6;

    public io0(String str) {
        this.j6 = ip0.tp(str);
    }

    public final boolean DW() {
        return this.DW != null;
    }

    public final <T extends lo0> long FH(T t, jo0<T> jo0Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        ro0.Hw(looperMyLooper != null);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new ko0(this, looperMyLooper, t, jo0Var, i, jElapsedRealtime).FH(0L);
        return jElapsedRealtime;
    }

    public final void VH(Runnable runnable) {
        ko0<? extends lo0> ko0Var = this.DW;
        if (ko0Var != null) {
            ko0Var.VH(true);
        }
        if (runnable != null) {
            this.j6.execute(runnable);
        }
        this.j6.shutdown();
    }

    @Override // com.google.android.gms.internal.ads.no0
    public final void j6() throws IOException {
        IOException iOException = this.FH;
        if (iOException != null) {
            throw iOException;
        }
        ko0<? extends lo0> ko0Var = this.DW;
        if (ko0Var != null) {
            ko0Var.Hw(ko0Var.jw);
        }
    }

    public final void tp() {
        this.DW.VH(false);
    }

    public final void u7(int i) throws IOException {
        IOException iOException = this.FH;
        if (iOException != null) {
            throw iOException;
        }
        ko0<? extends lo0> ko0Var = this.DW;
        if (ko0Var != null) {
            ko0Var.Hw(ko0Var.jw);
        }
    }
}
