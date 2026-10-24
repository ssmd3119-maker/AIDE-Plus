package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hv implements com.google.android.gms.ads.internal.overlay.m {
    private cv WB;
    private com.google.android.gms.ads.internal.overlay.m mb;

    public hv(cv cvVar, com.google.android.gms.ads.internal.overlay.m mVar) {
        this.WB = cvVar;
        this.mb = mVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void Do() {
        this.mb.Do();
        this.WB.qj();
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void lb() {
        this.mb.lb();
        this.WB.GK();
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void onResume() {
    }
}
