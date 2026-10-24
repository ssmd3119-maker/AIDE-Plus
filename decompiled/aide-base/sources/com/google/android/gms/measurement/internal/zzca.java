package com.google.android.gms.measurement.internal;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class zzca implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzby zzaql;
    private final /* synthetic */ zzo zzaqm;

    zzca(zzby zzbyVar, zzo zzoVar, zzk zzkVar) {
        this.zzaql = zzbyVar;
        this.zzaqm = zzoVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        this.zzaql.zzamv.zzme();
        this.zzaql.zzamv.zzc(this.zzaqm, this.zzaqk);
    }
}
