package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

@jg
/* loaded from: classes.dex */
public final class yo {
    private HandlerThread j6 = null;
    private Handler DW = null;
    private int FH = 0;
    private final Object Hw = new Object();

    public final Looper DW() {
        Looper looper;
        synchronized (this.Hw) {
            if (this.FH != 0) {
                com.google.android.gms.common.internal.p.tp(this.j6, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.j6 == null) {
                sm.we("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.j6 = handlerThread;
                handlerThread.start();
                this.DW = new Handler(this.j6.getLooper());
                sm.we("Looper thread started.");
            } else {
                sm.we("Resuming the looper thread");
                this.Hw.notifyAll();
            }
            this.FH++;
            looper = this.j6.getLooper();
        }
        return looper;
    }

    public final Handler j6() {
        return this.DW;
    }
}
