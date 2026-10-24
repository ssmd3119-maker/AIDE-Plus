package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
public final class rc implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel WB;
    private final /* synthetic */ zzanu mb;

    rc(zzanu zzanuVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.mb = zzanuVar;
        this.WB = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.w0.FH();
        com.google.android.gms.ads.internal.overlay.k.j6(this.mb.j6, this.WB, true);
    }
}
