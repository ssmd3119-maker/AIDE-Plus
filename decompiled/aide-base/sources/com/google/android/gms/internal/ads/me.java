package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class me implements Runnable {
    private final /* synthetic */ yl WB;
    private final /* synthetic */ le mb;

    me(le leVar, yl ylVar) {
        this.mb = leVar;
        this.WB = ylVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.fY.BJ(this.WB);
    }
}
