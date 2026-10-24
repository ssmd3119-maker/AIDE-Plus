package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzea implements Runnable {
    private final /* synthetic */ zzdy zzarz;
    private final /* synthetic */ zzdx zzasa;

    zzea(zzdy zzdyVar, zzdx zzdxVar) {
        this.zzarz = zzdyVar;
        this.zzasa = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzarz.zza(this.zzasa, false);
        zzdy zzdyVar = this.zzarz;
        zzdyVar.zzarq = null;
        zzdyVar.zzgl().zza((zzdx) null);
    }
}
