package com.google.android.gms.measurement.internal;

import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class zzcd implements Runnable {
    private final /* synthetic */ zzby zzaql;
    private final /* synthetic */ zzo zzaqm;

    zzcd(zzby zzbyVar, zzo zzoVar) {
        this.zzaql = zzbyVar;
        this.zzaqm = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        this.zzaql.zzamv.zzme();
        this.zzaql.zzamv.zze(this.zzaqm);
    }
}
