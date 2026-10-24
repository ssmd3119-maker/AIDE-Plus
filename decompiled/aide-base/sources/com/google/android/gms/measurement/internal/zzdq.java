package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzdq implements Runnable {
    private final /* synthetic */ boolean zzaed;
    private final /* synthetic */ zzda zzare;

    zzdq(zzda zzdaVar, boolean z) {
        this.zzare = zzdaVar;
        this.zzaed = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zzj(this.zzaed);
    }
}
