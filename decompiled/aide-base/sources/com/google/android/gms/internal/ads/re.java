package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class re implements Runnable {
    private final /* synthetic */ yl WB;
    private final /* synthetic */ qe mb;

    re(qe qeVar, yl ylVar) {
        this.mb = qeVar;
        this.WB = ylVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.fY.BJ(this.WB);
    }
}
