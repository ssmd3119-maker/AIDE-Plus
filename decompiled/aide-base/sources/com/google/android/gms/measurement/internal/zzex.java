package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzex implements Runnable {
    private final /* synthetic */ zzes zzasr;

    zzex(zzes zzesVar) {
        this.zzasr = zzesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb.zza(this.zzasr.zzasi, (zzaj) null);
        this.zzasr.zzasi.zzlj();
    }
}
