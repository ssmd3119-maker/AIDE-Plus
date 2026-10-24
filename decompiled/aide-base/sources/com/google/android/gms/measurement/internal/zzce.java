package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzce implements Callable<List<zzfx>> {
    private final /* synthetic */ String zzads;
    private final /* synthetic */ String zzadz;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzby zzaql;

    zzce(zzby zzbyVar, zzk zzkVar, String str, String str2) {
        this.zzaql = zzbyVar;
        this.zzaqk = zzkVar;
        this.zzads = str;
        this.zzadz = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzfx> call() {
        this.zzaql.zzamv.zzme();
        return this.zzaql.zzamv.zzjt().zzb(this.zzaqk.packageName, this.zzads, this.zzadz);
    }
}
