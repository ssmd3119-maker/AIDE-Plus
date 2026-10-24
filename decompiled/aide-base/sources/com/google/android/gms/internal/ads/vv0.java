package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class vv0 extends bw0<uw0> {
    private final /* synthetic */ Context DW;
    private final /* synthetic */ zzwf FH;
    private final /* synthetic */ String Hw;
    private final /* synthetic */ uv0 Zo;
    private final /* synthetic */ ka v5;

    vv0(uv0 uv0Var, Context context, zzwf zzwfVar, String str, ka kaVar) {
        this.Zo = uv0Var;
        this.DW = context;
        this.FH = zzwfVar;
        this.Hw = str;
        this.v5 = kaVar;
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ uw0 FH() {
        uv0.FH(this.DW, "banner");
        return new py0();
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ uw0 Hw() {
        return this.Zo.j6.FH(this.DW, this.FH, this.Hw, this.v5, 1);
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ uw0 j6(fx0 fx0Var) {
        return fx0Var.createBannerAdManager(abcd.xu.sy(this.DW), this.FH, this.Hw, this.v5, 14300000);
    }
}
