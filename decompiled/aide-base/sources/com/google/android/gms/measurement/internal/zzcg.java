package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzcg implements Callable<List<zzo>> {
    private final /* synthetic */ String zzads;
    private final /* synthetic */ String zzadz;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzby zzaql;

    zzcg(zzby zzbyVar, zzk zzkVar, String str, String str2) {
        this.zzaql = zzbyVar;
        this.zzaqk = zzkVar;
        this.zzads = str;
        this.zzadz = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzo> call() {
        this.zzaql.zzamv.zzme();
        return this.zzaql.zzamv.zzjt().zzc(this.zzaqk.packageName, this.zzads, this.zzadz);
    }
}
