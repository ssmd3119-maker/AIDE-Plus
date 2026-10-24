package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzdb implements Runnable {
    private final /* synthetic */ AtomicReference zzard;
    private final /* synthetic */ zzda zzare;

    zzdb(zzda zzdaVar, AtomicReference atomicReference) {
        this.zzare = zzdaVar;
        this.zzard = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzard) {
            try {
                this.zzard.set(Boolean.valueOf(this.zzare.zzgv().zzax(this.zzare.zzgk().zzal())));
            } finally {
                this.zzard.notify();
            }
        }
    }
}
