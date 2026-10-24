package com.google.android.gms.internal.ads;

import android.app.Activity;

/* loaded from: classes.dex */
public final class wv0 extends bw0<ld> {
    private final /* synthetic */ Activity DW;
    private final /* synthetic */ uv0 FH;

    wv0(uv0 uv0Var, Activity activity) {
        this.FH = uv0Var;
        this.DW = activity;
    }

    @Override // com.google.android.gms.internal.ads.bw0
    protected final /* synthetic */ ld FH() {
        uv0.FH(this.DW, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ ld Hw() {
        return this.FH.Hw.FH(this.DW);
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ ld j6(fx0 fx0Var) {
        return fx0Var.createAdOverlay(abcd.xu.sy(this.DW));
    }
}
