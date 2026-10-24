package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzdp implements Runnable {
    private final /* synthetic */ AtomicReference zzard;
    private final /* synthetic */ zzda zzare;

    zzdp(zzda zzdaVar, AtomicReference atomicReference) {
        this.zzare = zzdaVar;
        this.zzard = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzard) {
            try {
                this.zzard.set(Double.valueOf(this.zzare.zzgv().zzc(this.zzare.zzgk().zzal(), zzai.zzakf)));
            } finally {
                this.zzard.notify();
            }
        }
    }
}
