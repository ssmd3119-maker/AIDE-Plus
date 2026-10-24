package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzen implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;
    private final /* synthetic */ boolean zzask;
    private final /* synthetic */ boolean zzasl;
    private final /* synthetic */ zzo zzasm;
    private final /* synthetic */ zzo zzasn;

    zzen(zzeb zzebVar, boolean z, boolean z2, zzo zzoVar, zzk zzkVar, zzo zzoVar2) {
        this.zzasi = zzebVar;
        this.zzask = z;
        this.zzasl = z2;
        this.zzasm = zzoVar;
        this.zzaqk = zzkVar;
        this.zzasn = zzoVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar = this.zzasi.zzasc;
        if (zzajVar == null) {
            this.zzasi.zzgt().zzjg().zzby("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zzask) {
            this.zzasi.zza(zzajVar, this.zzasl ? null : this.zzasm, this.zzaqk);
        } else {
            try {
                if (TextUtils.isEmpty(this.zzasn.packageName)) {
                    zzajVar.zza(this.zzasm, this.zzaqk);
                } else {
                    zzajVar.zzb(this.zzasm);
                }
            } catch (RemoteException e) {
                this.zzasi.zzgt().zzjg().zzg("Failed to send conditional user property to the service", e);
            }
        }
        this.zzasi.zzcy();
    }
}
