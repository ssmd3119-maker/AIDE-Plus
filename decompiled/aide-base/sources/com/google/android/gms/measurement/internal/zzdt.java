package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzdt implements Runnable {
    private final /* synthetic */ zzda zzare;
    private final /* synthetic */ long zzarm;

    zzdt(zzda zzdaVar, long j) {
        this.zzare = zzdaVar;
        this.zzarm = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zzgu().zzanm.set(this.zzarm);
        this.zzare.zzgt().zzjn().zzg("Session timeout duration set", Long.valueOf(this.zzarm));
    }
}
