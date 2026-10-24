package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzei implements Runnable {
    private final /* synthetic */ zzdx zzasa;
    private final /* synthetic */ zzeb zzasi;

    zzei(zzeb zzebVar, zzdx zzdxVar) {
        this.zzasi = zzebVar;
        this.zzasa = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar = this.zzasi.zzasc;
        if (zzajVar == null) {
            this.zzasi.zzgt().zzjg().zzby("Failed to send current screen to service");
            return;
        }
        try {
            if (this.zzasa == null) {
                zzajVar.zza(0L, (String) null, (String) null, this.zzasi.getContext().getPackageName());
            } else {
                zzajVar.zza(this.zzasa.zzaro, this.zzasa.zzuw, this.zzasa.zzarn, this.zzasi.getContext().getPackageName());
            }
            this.zzasi.zzcy();
        } catch (RemoteException e) {
            this.zzasi.zzgt().zzjg().zzg("Failed to send current screen to the service", e);
        }
    }
}
