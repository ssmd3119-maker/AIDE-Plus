package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@jg
/* loaded from: classes.dex */
public final class uq<T> implements vq<T> {
    private final T WB;
    private final wq mb;

    uq(T t) {
        this.WB = t;
        wq wqVar = new wq();
        this.mb = wqVar;
        wqVar.DW();
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void DW(Runnable runnable, Executor executor) {
        this.mb.j6(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.WB;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.WB;
    }
}
