package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.h;

/* loaded from: classes.dex */
public final class zzeg implements Runnable {
    private final /* synthetic */ h zzagg;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;

    zzeg(zzeb zzebVar, zzk zzkVar, h hVar) {
        this.zzasi = zzebVar;
        this.zzaqk = zzkVar;
        this.zzagg = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzaj zzajVar = this.zzasi.zzasc;
            if (zzajVar == null) {
                this.zzasi.zzgt().zzjg().zzby("Failed to get app instance id");
                return;
            }
            String strZzc = zzajVar.zzc(this.zzaqk);
            if (strZzc != null) {
                this.zzasi.zzgj().zzcp(strZzc);
                this.zzasi.zzgu().zzanh.zzcd(strZzc);
            }
            this.zzasi.zzcy();
            this.zzasi.zzgr().zzb(this.zzagg, strZzc);
        } catch (RemoteException e) {
            this.zzasi.zzgt().zzjg().zzg("Failed to get app instance id", e);
        } finally {
            this.zzasi.zzgr().zzb(this.zzagg, null);
        }
    }
}
