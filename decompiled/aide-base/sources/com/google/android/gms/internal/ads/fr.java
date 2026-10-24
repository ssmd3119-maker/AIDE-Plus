package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class fr<T> implements vq<T> {

    @GuardedBy("mLock")
    private boolean fY;

    @GuardedBy("mLock")
    private Throwable jw;

    @GuardedBy("mLock")
    private T mb;

    @GuardedBy("mLock")
    private boolean qp;
    private final Object WB = new Object();
    private final wq k2 = new wq();

    @GuardedBy("mLock")
    private final boolean v5() {
        return this.jw != null || this.fY;
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void DW(Runnable runnable, Executor executor) {
        this.k2.j6(runnable, executor);
    }

    public final void FH(T t) {
        synchronized (this.WB) {
            if (this.qp) {
                return;
            }
            if (v5()) {
                com.google.android.gms.ads.internal.w0.u7().u7(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                return;
            }
            this.fY = true;
            this.mb = t;
            this.WB.notifyAll();
            this.k2.DW();
        }
    }

    public final void Hw(Throwable th) {
        synchronized (this.WB) {
            if (this.qp) {
                return;
            }
            if (v5()) {
                com.google.android.gms.ads.internal.w0.u7().u7(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                return;
            }
            this.jw = th;
            this.WB.notifyAll();
            this.k2.DW();
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.WB) {
            if (v5()) {
                return false;
            }
            this.qp = true;
            this.fY = true;
            this.WB.notifyAll();
            this.k2.DW();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() {
        T t;
        synchronized (this.WB) {
            if (!v5()) {
                try {
                    this.WB.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.jw != null) {
                throw new ExecutionException(this.jw);
            }
            if (this.qp) {
                throw new CancellationException("SettableFuture was cancelled.");
            }
            t = this.mb;
        }
        return t;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        boolean z;
        synchronized (this.WB) {
            z = this.qp;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean zV5;
        synchronized (this.WB) {
            zV5 = v5();
        }
        return zV5;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.WB) {
            if (!v5()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.WB.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.jw == null) {
                if (this.fY) {
                    if (!this.qp) {
                        t = this.mb;
                    } else {
                        throw new CancellationException("SettableFuture was cancelled.");
                    }
                } else {
                    throw new TimeoutException("SettableFuture timed out.");
                }
            } else {
                throw new ExecutionException(this.jw);
            }
        }
        return t;
    }
}
