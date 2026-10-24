package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzef implements Runnable {
    private final /* synthetic */ zzk zzaqk;
    private final /* synthetic */ zzeb zzasi;
    private final /* synthetic */ AtomicReference zzasj;

    zzef(zzeb zzebVar, AtomicReference atomicReference, zzk zzkVar) {
        this.zzasi = zzebVar;
        this.zzasj = atomicReference;
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
                    this.zzasi.zzgt().zzjg().zzg("Failed to get app instance id", e);
                }
                if (zzajVar == null) {
                    this.zzasi.zzgt().zzjg().zzby("Failed to get app instance id");
                    return;
                }
                this.zzasj.set(zzajVar.zzc(this.zzaqk));
                String str = (String) this.zzasj.get();
                if (str != null) {
                    this.zzasi.zzgj().zzcp(str);
                    this.zzasi.zzgu().zzanh.zzcd(str);
                }
                this.zzasi.zzcy();
                this.zzasj.notify();
            } finally {
                this.zzasj.notify();
            }
        }
    }
}
