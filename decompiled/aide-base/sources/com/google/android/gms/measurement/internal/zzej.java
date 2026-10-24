package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.h;

/* loaded from: classes.dex */
public final class zzej implements Runnable {
    private final /* synthetic */ h zzagg;
    private final /* synthetic */ zzag zzagi;
    private final /* synthetic */ String zzagj;
    private final /* synthetic */ zzeb zzasi;

    zzej(zzeb zzebVar, zzag zzagVar, String str, h hVar) {
        this.zzasi = zzebVar;
        this.zzagi = zzagVar;
        this.zzagj = str;
        this.zzagg = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzaj zzajVar = this.zzasi.zzasc;
            if (zzajVar == null) {
                this.zzasi.zzgt().zzjg().zzby("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] bArrZza = zzajVar.zza(this.zzagi, this.zzagj);
            this.zzasi.zzcy();
            this.zzasi.zzgr().zza(this.zzagg, bArrZza);
        } catch (RemoteException e) {
            this.zzasi.zzgt().zzjg().zzg("Failed to send event to the service to bundle", e);
        } finally {
            this.zzasi.zzgr().zza(this.zzagg, (byte[]) null);
        }
    }
}
