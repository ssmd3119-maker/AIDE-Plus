package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzew implements Runnable {
    private final /* synthetic */ zzes zzasr;

    zzew(zzes zzesVar) {
        this.zzasr = zzesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeb zzebVar = this.zzasr.zzasi;
        Context context = this.zzasr.zzasi.getContext();
        this.zzasr.zzasi.zzgw();
        zzebVar.onServiceDisconnected(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
