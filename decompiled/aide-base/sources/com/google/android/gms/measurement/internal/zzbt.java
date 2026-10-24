package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.p;
import java.lang.Thread;

/* loaded from: classes.dex */
public final class zzbt implements Thread.UncaughtExceptionHandler {
    private final String zzapa;
    private final /* synthetic */ zzbr zzapb;

    public zzbt(zzbr zzbrVar, String str) {
        this.zzapb = zzbrVar;
        p.u7(str);
        this.zzapa = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zzapb.zzgt().zzjg().zzg(this.zzapa, th);
    }
}
