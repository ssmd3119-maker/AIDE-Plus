package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.h;

/* loaded from: classes.dex */
public final class zzeq implements Runnable {
    private final /* synthetic */ String zzads;
    private final /* synthetic */ String zzadz;
    private final /* synthetic */ boolean zzaeg;
    private final /* synthetic */ h zzagg;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;

    zzeq(zzeb zzebVar, String str, String str2, boolean z, zzk zzkVar, h hVar) {
        this.zzasi = zzebVar;
        this.zzads = str;
        this.zzadz = str2;
        this.zzaeg = z;
        this.zzaqk = zzkVar;
        this.zzagg = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            zzaj zzajVar = this.zzasi.zzasc;
            if (zzajVar == null) {
                this.zzasi.zzgt().zzjg().zze("Failed to get user properties", this.zzads, this.zzadz);
                return;
            }
            Bundle bundleZzd = zzfy.zzd(zzajVar.zza(this.zzads, this.zzadz, this.zzaeg, this.zzaqk));
            this.zzasi.zzcy();
            this.zzasi.zzgr().zza(this.zzagg, bundleZzd);
        } catch (RemoteException e) {
            this.zzasi.zzgt().zzjg().zze("Failed to get user properties", this.zzads, e);
        } finally {
            this.zzasi.zzgr().zza(this.zzagg, bundle);
        }
    }
}
