package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class zzbu<V> extends FutureTask<V> implements Comparable<zzbu> {
    private final String zzapa;
    private final /* synthetic */ zzbr zzapb;
    private final long zzapc;
    final boolean zzapd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbu(zzbr zzbrVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.zzapb = zzbrVar;
        p.u7(str);
        long andIncrement = zzbr.zzaoz.getAndIncrement();
        this.zzapc = andIncrement;
        this.zzapa = str;
        this.zzapd = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzbrVar.zzgt().zzjg().zzby("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzbu zzbuVar) {
        zzbu zzbuVar2 = zzbuVar;
        boolean z = this.zzapd;
        if (z != zzbuVar2.zzapd) {
            return z ? -1 : 1;
        }
        long j = this.zzapc;
        long j2 = zzbuVar2.zzapc;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzapb.zzgt().zzjh().zzg("Two tasks share the same index. index", Long.valueOf(this.zzapc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.zzapb.zzgt().zzjg().zzg(this.zzapa, th);
        if (th instanceof zzbs) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbu(zzbr zzbrVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.zzapb = zzbrVar;
        p.u7(str);
        long andIncrement = zzbr.zzaoz.getAndIncrement();
        this.zzapc = andIncrement;
        this.zzapa = str;
        this.zzapd = false;
        if (andIncrement == Long.MAX_VALUE) {
            zzbrVar.zzgt().zzjg().zzby("Tasks index overflow");
        }
    }
}
