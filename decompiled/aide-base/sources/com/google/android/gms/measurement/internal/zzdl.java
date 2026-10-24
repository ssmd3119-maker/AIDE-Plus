package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzdl implements Runnable {
    private final /* synthetic */ AtomicReference zzard;
    private final /* synthetic */ zzda zzare;

    zzdl(zzda zzdaVar, AtomicReference atomicReference) {
        this.zzare = zzdaVar;
        this.zzard = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzard) {
            try {
                this.zzard.set(this.zzare.zzgv().zzay(this.zzare.zzgk().zzal()));
            } finally {
                this.zzard.notify();
            }
        }
    }
}
