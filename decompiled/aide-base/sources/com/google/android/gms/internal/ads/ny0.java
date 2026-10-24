package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ny0 extends nw0 {
    final /* synthetic */ ly0 WB;

    private ny0(ly0 ly0Var) {
        this.WB = ly0Var;
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final String Jl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final boolean cT() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void eT(zzwb zzwbVar, int i) {
        xp.j6("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        mp.j6.post(new oy0(this));
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final void p4(zzwb zzwbVar) {
        eT(zzwbVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.mw0
    public final String u7() {
        return null;
    }
}
