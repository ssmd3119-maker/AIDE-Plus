package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.lo0;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class ko0<T extends lo0> extends Handler implements Runnable {
    private volatile boolean AL;
    private final T WB;
    private final long fY;
    public final int jw;
    private int k2;
    private final jo0<T> mb;
    private IOException qp;
    private final /* synthetic */ io0 w9;
    private volatile Thread zh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(io0 io0Var, Looper looper, T t, jo0<T> jo0Var, int i, long j) {
        super(looper);
        this.w9 = io0Var;
        this.WB = t;
        this.mb = jo0Var;
        this.jw = i;
        this.fY = j;
    }

    private final void DW() {
        this.w9.DW = null;
    }

    private final void j6() {
        this.qp = null;
        this.w9.j6.execute(this.w9.DW);
    }

    public final void FH(long j) {
        ro0.Hw(this.w9.DW == null);
        this.w9.DW = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            j6();
        }
    }

    public final void Hw(int i) {
        IOException iOException = this.qp;
        if (iOException != null && this.k2 > i) {
            throw iOException;
        }
    }

    public final void VH(boolean z) {
        this.AL = z;
        this.qp = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.WB.FH();
            if (this.zh != null) {
                this.zh.interrupt();
            }
        }
        if (z) {
            DW();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.mb.Zo(this.WB, jElapsedRealtime, jElapsedRealtime - this.fY, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.AL) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            j6();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        DW();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.fY;
        if (this.WB.DW()) {
            this.mb.Zo(this.WB, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            this.mb.Zo(this.WB, jElapsedRealtime, j, false);
            return;
        }
        if (i2 == 2) {
            this.mb.QX(this.WB, jElapsedRealtime, j);
            return;
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.qp = iOException;
        int iJ0 = this.mb.J0(this.WB, jElapsedRealtime, j, iOException);
        if (iJ0 == 3) {
            this.w9.FH = this.qp;
        } else if (iJ0 != 2) {
            this.k2 = iJ0 == 1 ? 1 : this.k2 + 1;
            FH(Math.min((r12 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zh = Thread.currentThread();
            if (!this.WB.DW()) {
                String strValueOf = String.valueOf(this.WB.getClass().getSimpleName());
                gp0.j6(strValueOf.length() != 0 ? "load:".concat(strValueOf) : new String("load:"));
                try {
                    this.WB.j6();
                    gp0.DW();
                } catch (Throwable th) {
                    gp0.DW();
                    throw th;
                }
            }
            if (this.AL) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.AL) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.AL) {
                return;
            }
            obtainMessage(3, new mo0(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.AL) {
                return;
            }
            obtainMessage(3, new mo0(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.AL) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            ro0.Hw(this.WB.DW());
            if (this.AL) {
                return;
            }
            sendEmptyMessage(2);
        }
    }
}
