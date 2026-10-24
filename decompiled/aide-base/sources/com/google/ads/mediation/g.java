package com.google.ads.mediation;

import abcd.ou;
import abcd.pu;
import com.google.android.gms.ads.InterstitialAd;

/* loaded from: classes.dex */
public final class g implements pu {
    private final /* synthetic */ AbstractAdViewAdapter j6;

    g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.j6 = abstractAdViewAdapter;
    }

    @Override // abcd.pu
    public final void AE() {
        this.j6.zzhx.I(this.j6);
    }

    @Override // abcd.pu
    public final void Mz() {
        this.j6.zzhx.sy(this.j6);
        AbstractAdViewAdapter.zza(this.j6, (InterstitialAd) null);
    }

    @Override // abcd.pu
    public final void P8() {
        this.j6.zzhx.Mz(this.j6);
    }

    @Override // abcd.pu
    public final void SI() {
        this.j6.zzhx.x9(this.j6);
    }

    @Override // abcd.pu
    public final void Za(ou ouVar) {
        this.j6.zzhx.ca(this.j6, ouVar);
    }

    @Override // abcd.pu
    public final void ca() {
        this.j6.zzhx.g3(this.j6);
    }

    @Override // abcd.pu
    public final void ei() {
        this.j6.zzhx.Sf(this.j6);
    }

    @Override // abcd.pu
    public final void wc(int i) {
        this.j6.zzhx.vJ(this.j6, i);
    }
}
