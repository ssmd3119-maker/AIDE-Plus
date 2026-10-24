package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class oi implements Runnable {
    private final /* synthetic */ Future WB;

    oi(li liVar, Future future) {
        this.WB = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.WB.isDone()) {
            return;
        }
        this.WB.cancel(true);
    }
}
