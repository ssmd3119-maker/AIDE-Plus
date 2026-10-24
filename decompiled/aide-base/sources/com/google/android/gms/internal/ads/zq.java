package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface zq extends ExecutorService {
    <T> vq<T> DW(Callable<T> callable);

    vq<?> j6(Runnable runnable);
}
