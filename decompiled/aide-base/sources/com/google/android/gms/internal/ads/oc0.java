package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class oc0 implements ThreadFactory {
    private final ThreadFactory j6 = Executors.defaultThreadFactory();

    oc0() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.j6.newThread(runnable);
        threadNewThread.setName(String.valueOf(threadNewThread.getName()).concat(":"));
        return threadNewThread;
    }
}
