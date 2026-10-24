package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
public final class q implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel WB;
    private final /* synthetic */ p mb;

    q(p pVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.mb = pVar;
        this.WB = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w0.FH();
        com.google.android.gms.ads.internal.overlay.k.j6(this.mb.qp.k2.jw, this.WB, true);
    }
}
