package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzdo implements Runnable {
    private final /* synthetic */ AtomicReference zzard;
    private final /* synthetic */ zzda zzare;

    zzdo(zzda zzdaVar, AtomicReference atomicReference) {
        this.zzare = zzdaVar;
        this.zzard = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzard) {
            try {
                this.zzard.set(Integer.valueOf(this.zzare.zzgv().zzb(this.zzare.zzgk().zzal(), zzai.zzake)));
            } finally {
                this.zzard.notify();
            }
        }
    }
}
