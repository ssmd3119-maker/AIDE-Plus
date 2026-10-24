package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzfp implements Runnable {
    private final /* synthetic */ zzft zzaud;
    private final /* synthetic */ zzfo zzaue;

    zzfp(zzfo zzfoVar, zzft zzftVar) {
        this.zzaue = zzfoVar;
        this.zzaud = zzftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaue.zza(this.zzaud);
        this.zzaue.start();
    }
}
