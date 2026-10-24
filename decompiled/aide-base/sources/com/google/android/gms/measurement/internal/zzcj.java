package com.google.android.gms.measurement.internal;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class zzcj implements Runnable {
    private final /* synthetic */ zzag zzagi;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzby zzaql;

    zzcj(zzby zzbyVar, zzag zzagVar, zzk zzkVar) {
        this.zzaql = zzbyVar;
        this.zzagi = zzagVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        zzag zzagVarZzb = this.zzaql.zzb(this.zzagi, this.zzaqk);
        this.zzaql.zzamv.zzme();
        this.zzaql.zzamv.zzc(zzagVarZzb, this.zzaqk);
    }
}
