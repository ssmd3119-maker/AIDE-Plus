package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzde implements Runnable {
    private final /* synthetic */ boolean zzaeg;
    private final /* synthetic */ AtomicReference zzard;
    private final /* synthetic */ zzda zzare;

    zzde(zzda zzdaVar, AtomicReference atomicReference, boolean z) {
        this.zzare = zzdaVar;
        this.zzard = atomicReference;
        this.zzaeg = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zzgl().zza(this.zzard, this.zzaeg);
    }
}
