package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzbx implements Runnable {
    private final /* synthetic */ zzcz zzaqg;
    private final /* synthetic */ zzbw zzaqh;

    zzbx(zzbw zzbwVar, zzcz zzczVar) {
        this.zzaqh = zzbwVar;
        this.zzaqg = zzczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaqh.zza(this.zzaqg);
        this.zzaqh.start();
    }
}
