package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcf implements Callable<List<zzfx>> {
    private final /* synthetic */ String zzads;
    private final /* synthetic */ String zzadz;
    private final /* synthetic */ String zzagj;
    private final /* synthetic */ zzby zzaql;

    zzcf(zzby zzbyVar, String str, String str2, String str3) {
        this.zzaql = zzbyVar;
        this.zzagj = str;
        this.zzads = str2;
        this.zzadz = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzfx> call() {
        this.zzaql.zzamv.zzme();
        return this.zzaql.zzamv.zzjt().zzb(this.zzagj, this.zzads, this.zzadz);
    }
}
