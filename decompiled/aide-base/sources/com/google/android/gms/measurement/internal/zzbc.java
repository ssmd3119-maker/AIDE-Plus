package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzbc implements Runnable {
    private final /* synthetic */ boolean zzamw;
    private final /* synthetic */ zzbb zzamx;

    zzbc(zzbb zzbbVar, boolean z) {
        this.zzamx = zzbbVar;
        this.zzamw = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzamx.zzamv.zzm(this.zzamw);
    }
}
