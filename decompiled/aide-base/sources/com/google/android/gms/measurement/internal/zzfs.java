package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfs implements Callable<String> {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzfo zzaue;

    zzfs(zzfo zzfoVar, zzk zzkVar) {
        this.zzaue = zzfoVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        zzg zzgVarZzg = this.zzaue.zzgv().zzba(this.zzaqk.packageName) ? this.zzaue.zzg(this.zzaqk) : this.zzaue.zzjt().zzbm(this.zzaqk.packageName);
        if (zzgVarZzg != null) {
            return zzgVarZzg.getAppInstanceId();
        }
        this.zzaue.zzgt().zzjj().zzby("App info was null when attempting to get app instance id");
        return null;
    }
}
