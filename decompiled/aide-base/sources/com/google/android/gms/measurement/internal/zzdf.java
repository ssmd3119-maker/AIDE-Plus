package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzdf implements Runnable {
    private final /* synthetic */ AtomicReference zzard;
    private final /* synthetic */ zzda zzare;

    zzdf(zzda zzdaVar, AtomicReference atomicReference) {
        this.zzare = zzdaVar;
        this.zzard = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zzgl().zza(this.zzard);
    }
}
