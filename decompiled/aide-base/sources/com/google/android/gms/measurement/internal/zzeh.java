package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzeh implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;

    zzeh(zzeb zzebVar, zzk zzkVar) {
        this.zzasi = zzebVar;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar = this.zzasi.zzasc;
        if (zzajVar == null) {
            this.zzasi.zzgt().zzjg().zzby("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzajVar.zza(this.zzaqk);
            this.zzasi.zza(zzajVar, (AbstractSafeParcelable) null, this.zzaqk);
            this.zzasi.zzcy();
        } catch (RemoteException e) {
            this.zzasi.zzgt().zzjg().zzg("Failed to send app launch to the service", e);
        }
    }
}
