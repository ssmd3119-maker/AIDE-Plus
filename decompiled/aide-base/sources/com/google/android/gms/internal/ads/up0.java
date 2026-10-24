package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class up0 implements Handler.Callback, Choreographer.FrameCallback {
    private static final up0 k2 = new up0();
    public volatile long WB;
    private Choreographer fY;
    private final HandlerThread jw;
    private final Handler mb;
    private int qp;

    private up0() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.jw = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.jw.getLooper(), this);
        this.mb = handler;
        handler.sendEmptyMessage(0);
    }

    public static up0 j6() {
        return k2;
    }

    public final void DW() {
        this.mb.sendEmptyMessage(1);
    }

    public final void FH() {
        this.mb.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.WB = j;
        this.fY.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.fY = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.qp + 1;
            this.qp = i2;
            if (i2 == 1) {
                this.fY.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.qp - 1;
        this.qp = i3;
        if (i3 == 0) {
            this.fY.removeFrameCallback(this);
            this.WB = 0L;
        }
        return true;
    }
}
