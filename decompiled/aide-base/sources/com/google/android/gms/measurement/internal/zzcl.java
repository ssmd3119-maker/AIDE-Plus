package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcl implements Callable<byte[]> {
    private final /* synthetic */ zzag zzagi;
    private final /* synthetic */ String zzagj;
    private final /* synthetic */ zzby zzaql;

    zzcl(zzby zzbyVar, zzag zzagVar, String str) {
        this.zzaql = zzbyVar;
        this.zzagi = zzagVar;
        this.zzagj = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.zzaql.zzamv.zzme();
        return this.zzaql.zzamv.zzlw().zzb(this.zzagi, this.zzagj);
    }
}
