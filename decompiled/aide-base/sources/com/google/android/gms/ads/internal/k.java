package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzwb;

/* loaded from: classes.dex */
public final class k implements Runnable {
    private final /* synthetic */ zzwb WB;
    private final /* synthetic */ i jw;
    private final /* synthetic */ int mb;

    k(i iVar, zzwb zzwbVar, int i) {
        this.jw = iVar;
        this.WB = zzwbVar;
        this.mb = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.jw.e3) {
            this.jw.UE(this.WB, this.mb);
        }
    }
}
