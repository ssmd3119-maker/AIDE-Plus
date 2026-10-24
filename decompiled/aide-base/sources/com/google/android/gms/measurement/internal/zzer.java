package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzer implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzfv zzaqn;
    private final /* synthetic */ zzeb zzasi;
    private final /* synthetic */ boolean zzasl;

    zzer(zzeb zzebVar, boolean z, zzfv zzfvVar, zzk zzkVar) {
        this.zzasi = zzebVar;
        this.zzasl = z;
        this.zzaqn = zzfvVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar = this.zzasi.zzasc;
        if (zzajVar == null) {
            this.zzasi.zzgt().zzjg().zzby("Discarding data. Failed to set user attribute");
        } else {
            this.zzasi.zza(zzajVar, this.zzasl ? null : this.zzaqn, this.zzaqk);
            this.zzasi.zzcy();
        }
    }
}
