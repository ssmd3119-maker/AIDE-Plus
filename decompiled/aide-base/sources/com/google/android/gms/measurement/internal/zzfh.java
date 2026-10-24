package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzfh implements Runnable {
    private final /* synthetic */ long zzafg;
    private final /* synthetic */ zzfd zzatd;

    zzfh(zzfd zzfdVar, long j) {
        this.zzatd = zzfdVar;
        this.zzafg = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzatd.zzai(this.zzafg);
    }
}
