package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class zzeu implements Runnable {
    private final /* synthetic */ ComponentName val$name;
    private final /* synthetic */ zzes zzasr;

    zzeu(zzes zzesVar, ComponentName componentName) {
        this.zzasr = zzesVar;
        this.val$name = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzasr.zzasi.onServiceDisconnected(this.val$name);
    }
}
