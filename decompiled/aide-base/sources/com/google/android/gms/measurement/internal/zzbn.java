package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzbn implements Runnable {
    private final /* synthetic */ zzbw zzaoe;
    private final /* synthetic */ zzas zzaof;

    zzbn(zzbm zzbmVar, zzbw zzbwVar, zzas zzasVar) {
        this.zzaoe = zzbwVar;
        this.zzaof = zzasVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzaoe.zzkk() == null) {
            this.zzaof.zzjg().zzby("Install Referrer Reporter is null");
            return;
        }
        zzbj zzbjVarZzkk = this.zzaoe.zzkk();
        zzbjVarZzkk.zzada.zzgg();
        zzbjVarZzkk.zzce(zzbjVarZzkk.zzada.getContext().getPackageName());
    }
}
