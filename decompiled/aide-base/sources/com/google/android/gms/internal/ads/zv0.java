package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zv0 extends bw0<pw0> {
    private final /* synthetic */ Context DW;
    private final /* synthetic */ String FH;
    private final /* synthetic */ ka Hw;
    private final /* synthetic */ uv0 v5;

    zv0(uv0 uv0Var, Context context, String str, ka kaVar) {
        this.v5 = uv0Var;
        this.DW = context;
        this.FH = str;
        this.Hw = kaVar;
    }

    @Override // com.google.android.gms.internal.ads.bw0
    protected final /* synthetic */ pw0 FH() {
        uv0.FH(this.DW, "native_ad");
        return new ly0();
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ pw0 Hw() {
        return this.v5.DW.FH(this.DW, this.FH, this.Hw);
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ pw0 j6(fx0 fx0Var) {
        return fx0Var.createAdLoaderBuilder(abcd.xu.sy(this.DW), this.FH, this.Hw, 14300000);
    }
}
