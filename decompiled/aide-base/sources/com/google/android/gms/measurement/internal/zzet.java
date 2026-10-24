package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzet implements Runnable {
    private final /* synthetic */ zzaj zzasq;
    private final /* synthetic */ zzes zzasr;

    zzet(zzes zzesVar, zzaj zzajVar) {
        this.zzasr = zzesVar;
        this.zzasq = zzajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzasr) {
            zzes.zza(this.zzasr, false);
            if (!this.zzasr.zzasi.isConnected()) {
                this.zzasr.zzasi.zzgt().zzjo().zzby("Connected to service");
                this.zzasr.zzasi.zza(this.zzasq);
            }
        }
    }
}
