package com.google.android.gms.measurement.internal;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class zzbz implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzby zzaql;

    zzbz(zzby zzbyVar, zzk zzkVar) {
        this.zzaql = zzbyVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        this.zzaql.zzamv.zzme();
        this.zzaql.zzamv.zze(this.zzaqk);
    }
}
