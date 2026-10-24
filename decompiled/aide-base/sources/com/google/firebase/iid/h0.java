package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h0 {
    private static final Executor j6 = j0.j6;

    static Executor FH() {
        return j6;
    }

    static Executor Hw() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), i0.j6);
    }

    static final /* synthetic */ Thread j6(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
