package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzfi implements Runnable {
    private final /* synthetic */ long zzafg;
    private final /* synthetic */ zzfd zzatd;

    zzfi(zzfd zzfdVar, long j) {
        this.zzatd = zzfdVar;
        this.zzafg = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzatd.zzak(this.zzafg);
    }
}
