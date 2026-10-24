package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzee implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;

    zzee(zzeb zzebVar, zzk zzkVar) {
        this.zzasi = zzebVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar = this.zzasi.zzasc;
        if (zzajVar == null) {
            this.zzasi.zzgt().zzjg().zzby("Failed to reset data on the service; null service");
            return;
        }
        try {
            zzajVar.zzd(this.zzaqk);
        } catch (RemoteException e) {
            this.zzasi.zzgt().zzjg().zzg("Failed to reset data on the service", e);
        }
        this.zzasi.zzcy();
    }
}
