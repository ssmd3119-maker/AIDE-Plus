package com.google.android.gms.measurement.internal;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class zzcp implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzby zzaql;

    zzcp(zzby zzbyVar, zzk zzkVar) {
        this.zzaql = zzbyVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        this.zzaql.zzamv.zzme();
        this.zzaql.zzamv.zzf(this.zzaqk);
    }
}
