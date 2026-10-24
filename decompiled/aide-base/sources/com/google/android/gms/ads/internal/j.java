package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzwb;

/* loaded from: classes.dex */
public final class j implements Runnable {
    private final /* synthetic */ zzwb WB;
    private final /* synthetic */ i mb;

    j(i iVar, zzwb zzwbVar) {
        this.mb = iVar;
        this.WB = zzwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.e3) {
            if (this.mb.Yb()) {
                this.mb.nG(this.WB);
            } else {
                this.mb.UE(this.WB, 1);
            }
        }
    }
}
