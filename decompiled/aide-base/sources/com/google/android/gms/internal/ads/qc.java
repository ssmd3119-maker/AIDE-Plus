package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qc implements com.google.android.gms.ads.internal.overlay.m {
    private final /* synthetic */ zzanu WB;

    qc(zzanu zzanuVar) {
        this.WB = zzanuVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void Do() {
        xp.VH("AdMobCustomTabsAdapter overlay is closed.");
        this.WB.DW.XL(this.WB);
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void lb() {
        xp.VH("Opening AdMobCustomTabsAdapter overlay.");
        this.WB.DW.a8(this.WB);
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void onPause() {
        xp.VH("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void onResume() {
        xp.VH("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
