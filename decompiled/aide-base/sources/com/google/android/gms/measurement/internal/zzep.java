package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzep implements Runnable {
    private final /* synthetic */ String zzads;
    private final /* synthetic */ String zzadz;
    private final /* synthetic */ boolean zzaeg;
    private final /* synthetic */ String zzagj;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;
    private final /* synthetic */ AtomicReference zzasj;

    zzep(zzeb zzebVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzk zzkVar) {
        this.zzasi = zzebVar;
        this.zzasj = atomicReference;
        this.zzagj = str;
        this.zzads = str2;
        this.zzadz = str3;
        this.zzaeg = z;
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
                    this.zzasi.zzgt().zzjg().zzd("Failed to get user properties", zzas.zzbw(this.zzagj), this.zzads, e);
                    this.zzasj.set(Collections.emptyList());
                }
                if (zzajVar == null) {
                    this.zzasi.zzgt().zzjg().zzd("Failed to get user properties", zzas.zzbw(this.zzagj), this.zzads, this.zzadz);
                    this.zzasj.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.zzagj)) {
                    this.zzasj.set(zzajVar.zza(this.zzads, this.zzadz, this.zzaeg, this.zzaqk));
                } else {
                    this.zzasj.set(zzajVar.zza(this.zzagj, this.zzads, this.zzadz, this.zzaeg));
                }
                this.zzasi.zzcy();
                this.zzasj.notify();
            } finally {
                this.zzasj.notify();
            }
        }
    }
}
