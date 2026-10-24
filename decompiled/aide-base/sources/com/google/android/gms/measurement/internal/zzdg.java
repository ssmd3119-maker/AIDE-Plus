package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzdg implements Runnable {
    private final /* synthetic */ zzda zzare;
    private final /* synthetic */ long zzark;

    zzdg(zzda zzdaVar, long j) {
        this.zzare = zzdaVar;
        this.zzark = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzda zzdaVar = this.zzare;
        long j = this.zzark;
        zzdaVar.zzaf();
        zzdaVar.zzgg();
        zzdaVar.zzcl();
        zzdaVar.zzgt().zzjn().zzby("Resetting analytics data (FE)");
        zzdaVar.zzgo().zzln();
        if (zzdaVar.zzgv().zzbc(zzdaVar.zzgk().zzal())) {
            zzdaVar.zzgu().zzanf.set(j);
        }
        boolean zIsEnabled = zzdaVar.zzada.isEnabled();
        if (!zzdaVar.zzgv().zzhz()) {
            zzdaVar.zzgu().zzi(!zIsEnabled);
        }
        zzdaVar.zzgl().resetAnalyticsData();
        zzdaVar.zzarc = !zIsEnabled;
        if (this.zzare.zzgv().zza(zzai.zzalb)) {
            this.zzare.zzgl().zza(new AtomicReference<>());
        }
    }
}
