package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzeo implements Runnable {
    private final /* synthetic */ String zzads;
    private final /* synthetic */ String zzadz;
    private final /* synthetic */ String zzagj;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;
    private final /* synthetic */ AtomicReference zzasj;

    zzeo(zzeb zzebVar, AtomicReference atomicReference, String str, String str2, String str3, zzk zzkVar) {
        this.zzasi = zzebVar;
        this.zzasj = atomicReference;
        this.zzagj = str;
        this.zzads = str2;
        this.zzadz = str3;
        this.zzaqk = zzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar;
        synchronized (this.zzasj) {
            try {
                try {
                    zzajVar = this.zzasi.zzasc;
                } catch (RemoteException e) {
                    this.zzasi.zzgt().zzjg().zzd("Failed to get conditional properties", zzas.zzbw(this.zzagj), this.zzads, e);
                    this.zzasj.set(Collections.emptyList());
                }
                if (zzajVar == null) {
                    this.zzasi.zzgt().zzjg().zzd("Failed to get conditional properties", zzas.zzbw(this.zzagj), this.zzads, this.zzadz);
                    this.zzasj.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.zzagj)) {
                    this.zzasj.set(zzajVar.zza(this.zzads, this.zzadz, this.zzaqk));
                } else {
                    this.zzasj.set(zzajVar.zze(this.zzagj, this.zzads, this.zzadz));
                }
                this.zzasi.zzcy();
                this.zzasj.notify();
            } finally {
                this.zzasj.notify();
            }
        }
    }
}
