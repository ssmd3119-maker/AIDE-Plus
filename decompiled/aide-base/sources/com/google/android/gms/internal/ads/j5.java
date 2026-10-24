package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j5 extends kw0 {
    private final /* synthetic */ i5 WB;

    j5(i5 i5Var) {
        this.WB = i5Var;
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void EQ() {
        this.WB.j6.add(new q5(this));
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void Gj(int i) {
        this.WB.j6.add(new l5(this, i));
        sm.we("Pooled interstitial failed to load.");
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void fN() {
        this.WB.j6.add(new k5(this));
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void hK() {
        this.WB.j6.add(new p5(this));
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void k2() {
        this.WB.j6.add(new n5(this));
        sm.we("Pooled interstitial loaded.");
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void ko() {
        this.WB.j6.add(new o5(this));
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void mb() {
        this.WB.j6.add(new m5(this));
    }
}
