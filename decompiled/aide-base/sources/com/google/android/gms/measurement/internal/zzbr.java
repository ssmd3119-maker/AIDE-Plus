package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import java.lang.Thread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbr extends zzcs {
    private static final AtomicLong zzaoz = new AtomicLong(Long.MIN_VALUE);
    private ExecutorService zzadl;
    private zzbv zzaoq;
    private zzbv zzaor;
    private final PriorityBlockingQueue<zzbu<?>> zzaos;
    private final BlockingQueue<zzbu<?>> zzaot;
    private final Thread.UncaughtExceptionHandler zzaou;
    private final Thread.UncaughtExceptionHandler zzaov;
    private final Object zzaow;
    private final Semaphore zzaox;
    private volatile boolean zzaoy;

    zzbr(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzaow = new Object();
        this.zzaox = new Semaphore(2);
        this.zzaos = new PriorityBlockingQueue<>();
        this.zzaot = new LinkedBlockingQueue();
        this.zzaou = new zzbt(this, "Thread death: Uncaught exception on worker thread");
        this.zzaov = new zzbt(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final <T> T zza(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzgs().zzc(runnable);
            try {
                atomicReference.wait(15000L);
            } catch (InterruptedException unused) {
                zzau zzauVarZzjj = zzgt().zzjj();
                String strValueOf = String.valueOf(str);
                zzauVarZzjj.zzby(strValueOf.length() != 0 ? "Interrupted waiting for ".concat(strValueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzau zzauVarZzjj2 = zzgt().zzjj();
            String strValueOf2 = String.valueOf(str);
            zzauVarZzjj2.zzby(strValueOf2.length() != 0 ? "Timed out waiting for ".concat(strValueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final void zzaf() {
        if (Thread.currentThread() != this.zzaoq) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final <V> Future<V> zzb(Callable<V> callable) {
        zzcl();
        p.u7(callable);
        zzbu<?> zzbuVar = new zzbu<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzaoq) {
            if (!this.zzaos.isEmpty()) {
                zzgt().zzjj().zzby("Callable skipped the worker queue.");
            }
            zzbuVar.run();
        } else {
            zza(zzbuVar);
        }
        return zzbuVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    public final <V> Future<V> zzc(Callable<V> callable) {
        zzcl();
        p.u7(callable);
        zzbu<?> zzbuVar = new zzbu<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzaoq) {
            zzbuVar.run();
        } else {
            zza(zzbuVar);
        }
        return zzbuVar;
    }

    public final void zzd(Runnable runnable) {
        zzcl();
        p.u7(runnable);
        zzbu<?> zzbuVar = new zzbu<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzaow) {
            this.zzaot.add(zzbuVar);
            if (this.zzaor == null) {
                zzbv zzbvVar = new zzbv(this, "Measurement Network", this.zzaot);
                this.zzaor = zzbvVar;
                zzbvVar.setUncaughtExceptionHandler(this.zzaov);
                this.zzaor.start();
            } else {
                this.zzaor.zzki();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgf() {
        super.zzgf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgg() {
        super.zzgg();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final void zzgh() {
        if (Thread.currentThread() != this.zzaor) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzaa zzgp() {
        return super.zzgp();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzaq zzgq() {
        return super.zzgq();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzfy zzgr() {
        return super.zzgr();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzbr zzgs() {
        return super.zzgs();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzgt() {
        return super.zzgt();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzbd zzgu() {
        return super.zzgu();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzq zzgv() {
        return super.zzgv();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzn zzgw() {
        return super.zzgw();
    }

    @Override // com.google.android.gms.measurement.internal.zzcs
    protected final boolean zzgy() {
        return false;
    }

    public final boolean zzkf() {
        return Thread.currentThread() == this.zzaoq;
    }

    public final ExecutorService zzkg() {
        ExecutorService executorService;
        synchronized (this.zzaow) {
            if (this.zzadl == null) {
                this.zzadl = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzadl;
        }
        return executorService;
    }

    public final void zzc(Runnable runnable) {
        zzcl();
        p.u7(runnable);
        zza(new zzbu<>(this, runnable, false, "Task exception on worker thread"));
    }

    private final void zza(zzbu<?> zzbuVar) {
        synchronized (this.zzaow) {
            this.zzaos.add(zzbuVar);
            if (this.zzaoq == null) {
                zzbv zzbvVar = new zzbv(this, "Measurement Worker", this.zzaos);
                this.zzaoq = zzbvVar;
                zzbvVar.setUncaughtExceptionHandler(this.zzaou);
                this.zzaoq.start();
            } else {
                this.zzaoq.zzki();
            }
        }
    }

    static /* synthetic */ zzbv zzb(zzbr zzbrVar, zzbv zzbvVar) {
        zzbrVar.zzaor = null;
        return null;
    }

    static /* synthetic */ zzbv zza(zzbr zzbrVar, zzbv zzbvVar) {
        zzbrVar.zzaoq = null;
        return null;
    }
}
