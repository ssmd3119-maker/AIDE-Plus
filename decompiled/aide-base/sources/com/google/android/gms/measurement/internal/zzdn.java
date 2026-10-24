package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzdn implements Runnable {
    private final /* synthetic */ AtomicReference zzard;
    private final /* synthetic */ zzda zzare;

    zzdn(zzda zzdaVar, AtomicReference atomicReference) {
        this.zzare = zzdaVar;
        this.zzard = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzard) {
            try {
                this.zzard.set(Long.valueOf(this.zzare.zzgv().zza(this.zzare.zzgk().zzal(), zzai.zzakd)));
            } finally {
                this.zzard.notify();
            }
        }
    }
}
