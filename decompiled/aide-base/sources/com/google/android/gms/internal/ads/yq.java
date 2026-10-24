package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

@jg
/* loaded from: classes.dex */
public final class yq<V> extends FutureTask<V> implements vq<V> {
    private final wq WB;

    yq(Callable<V> callable) {
        super(callable);
        this.WB = new wq();
    }

    @Override // com.google.android.gms.internal.ads.vq
    public final void DW(Runnable runnable, Executor executor) {
        this.WB.j6(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        this.WB.DW();
    }

    yq(Runnable runnable, @Nullable V v) {
        super(runnable, v);
        this.WB = new wq();
    }
}
