package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* loaded from: classes.dex */
public final class zzdj implements Runnable {
    private final /* synthetic */ zzda zzare;
    private final /* synthetic */ AppMeasurement.ConditionalUserProperty zzarl;

    zzdj(zzda zzdaVar, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.zzare = zzdaVar;
        this.zzarl = conditionalUserProperty;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzare.zzc(this.zzarl);
    }
}
