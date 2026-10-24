package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzem implements Runnable {
    private final /* synthetic */ zzag zzagi;
    private final /* synthetic */ String zzagj;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;
    private final /* synthetic */ boolean zzask;
    private final /* synthetic */ boolean zzasl;

    zzem(zzeb zzebVar, boolean z, boolean z2, zzag zzagVar, zzk zzkVar, String str) {
        this.zzasi = zzebVar;
        this.zzask = z;
        this.zzasl = z2;
        this.zzagi = zzagVar;
        this.zzaqk = zzkVar;
        this.zzagj = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar = this.zzasi.zzasc;
        if (zzajVar == null) {
            this.zzasi.zzgt().zzjg().zzby("Discarding data. Failed to send event to service");
            return;
        }
        if (this.zzask) {
            this.zzasi.zza(zzajVar, this.zzasl ? null : this.zzagi, this.zzaqk);
        } else {
            try {
                if (TextUtils.isEmpty(this.zzagj)) {
                    zzajVar.zza(this.zzagi, this.zzaqk);
                } else {
                    zzajVar.zza(this.zzagi, this.zzagj, this.zzasi.zzgt().zzjq());
                }
            } catch (RemoteException e) {
                this.zzasi.zzgt().zzjg().zzg("Failed to send event to the service", e);
            }
        }
        this.zzasi.zzcy();
    }
}
