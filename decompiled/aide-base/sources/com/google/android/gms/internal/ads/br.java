package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class br implements Executor {
    private final Handler j6 = new um(Looper.getMainLooper());

    br() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.j6.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.w0.v5();
            bn.XL(com.google.android.gms.ads.internal.w0.u7().j6(), th);
            throw th;
        }
    }
}
