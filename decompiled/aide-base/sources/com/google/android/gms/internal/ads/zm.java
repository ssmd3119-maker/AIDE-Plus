package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@jg
/* loaded from: classes.dex */
public final class zm {
    public static final zq DW;
    public static final ScheduledExecutorService FH;
    public static final zq j6 = ar.j6(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), FH("Default")));

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), FH("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DW = ar.j6(threadPoolExecutor);
        FH = new ScheduledThreadPoolExecutor(3, FH("Schedule"));
    }

    public static vq<?> DW(Runnable runnable) {
        return j6.submit(runnable);
    }

    private static ThreadFactory FH(String str) {
        return new an(str);
    }

    public static <T> vq<T> j6(Callable<T> callable) {
        return j6.submit(callable);
    }
}
