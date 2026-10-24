package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzds implements Runnable {
    private final /* synthetic */ zzda zzare;
    private final /* synthetic */ long zzarm;

    zzds(zzda zzdaVar, long j) {
        this.zzare = zzdaVar;
        this.zzarm = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zzgu().zzanl.set(this.zzarm);
        this.zzare.zzgt().zzjn().zzg("Minimum session duration set", Long.valueOf(this.zzarm));
    }
}
