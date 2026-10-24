package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzed implements Runnable {
    private final /* synthetic */ boolean zzaeg;
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;
    private final /* synthetic */ AtomicReference zzasj;

    zzed(zzeb zzebVar, AtomicReference atomicReference, zzk zzkVar, boolean z) {
        this.zzasi = zzebVar;
        this.zzasj = atomicReference;
        this.zzaqk = zzkVar;
        this.zzaeg = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj zzajVar;
        synchronized (this.zzasj) {
            try {
                try {
                    zzajVar = this.zzasi.zzasc;
                } catch (RemoteException e) {
                    this.zzasi.zzgt().zzjg().zzg("Failed to get user properties", e);
                }
                if (zzajVar == null) {
                    this.zzasi.zzgt().zzjg().zzby("Failed to get user properties");
                    return;
                }
                this.zzasj.set(zzajVar.zza(this.zzaqk, this.zzaeg));
                this.zzasi.zzcy();
                this.zzasj.notify();
            } finally {
                this.zzasj.notify();
            }
        }
    }
}
