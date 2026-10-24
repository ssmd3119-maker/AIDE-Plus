package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ge implements Runnable {
    private final /* synthetic */ yl WB;
    private final /* synthetic */ ee mb;

    ge(ee eeVar, yl ylVar) {
        this.mb = eeVar;
        this.WB = ylVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.mb.k2) {
            ee eeVar = this.mb;
            eeVar.fY.BJ(this.WB);
        }
    }
}
