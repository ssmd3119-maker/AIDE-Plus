package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzdh implements Runnable {
    private final /* synthetic */ zzcx zzaef;
    private final /* synthetic */ zzda zzare;

    zzdh(zzda zzdaVar, zzcx zzcxVar) {
        this.zzare = zzdaVar;
        this.zzaef = zzcxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zza(this.zzaef);
    }
}
