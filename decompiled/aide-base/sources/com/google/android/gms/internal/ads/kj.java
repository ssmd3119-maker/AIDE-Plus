package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kj implements Runnable {
    private final /* synthetic */ zl WB;
    private final /* synthetic */ ij mb;

    kj(ij ijVar, zl zlVar) {
        this.mb = ijVar;
        this.WB = zlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.BJ(new yl(this.WB, null, null, null, null, null, null, null));
    }
}
