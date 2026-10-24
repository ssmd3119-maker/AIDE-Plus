package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzel implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;

    zzel(zzeb zzebVar, zzk zzkVar) {
        this.zzasi = zzebVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar = this.zzasi.zzasc;
        if (zzajVar == null) {
            this.zzasi.zzgt().zzjg().zzby("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzajVar.zzb(this.zzaqk);
            this.zzasi.zzcy();
        } catch (RemoteException e) {
            this.zzasi.zzgt().zzjg().zzg("Failed to send measurementEnabled to the service", e);
        }
    }
}
