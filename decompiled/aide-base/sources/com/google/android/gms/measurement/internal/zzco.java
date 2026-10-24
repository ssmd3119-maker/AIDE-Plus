package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzco implements Callable<List<zzfx>> {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzby zzaql;

    zzco(zzby zzbyVar, zzk zzkVar) {
        this.zzaql = zzbyVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzfx> call() {
        this.zzaql.zzamv.zzme();
        return this.zzaql.zzamv.zzjt().zzbl(this.zzaqk.packageName);
    }
}
