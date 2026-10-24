package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzfb implements Runnable {
    private final /* synthetic */ Runnable zzacf;
    private final /* synthetic */ zzfo zzasx;

    zzfb(zzey zzeyVar, zzfo zzfoVar, Runnable runnable) {
        this.zzasx = zzfoVar;
        this.zzacf = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzasx.zzme();
        this.zzasx.zzg(this.zzacf);
        this.zzasx.zzlz();
    }
}
