package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzev implements Runnable {
    private final /* synthetic */ zzes zzasr;
    private final /* synthetic */ zzaj zzass;

    zzev(zzes zzesVar, zzaj zzajVar) {
        this.zzasr = zzesVar;
        this.zzass = zzajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzasr) {
            zzes.zza(this.zzasr, false);
            if (!this.zzasr.zzasi.isConnected()) {
                this.zzasr.zzasi.zzgt().zzjn().zzby("Connected to remote service");
                this.zzasr.zzasi.zza(this.zzass);
            }
        }
    }
}
