package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class xv0 extends bw0<uw0> {
    private final /* synthetic */ Context DW;
    private final /* synthetic */ zzwf FH;
    private final /* synthetic */ String Hw;
    private final /* synthetic */ uv0 v5;

    xv0(uv0 uv0Var, Context context, zzwf zzwfVar, String str) {
        this.v5 = uv0Var;
        this.DW = context;
        this.FH = zzwfVar;
        this.Hw = str;
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ uw0 FH() {
        uv0.FH(this.DW, "search");
        return new py0();
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ uw0 Hw() {
        return this.v5.j6.FH(this.DW, this.FH, this.Hw, null, 3);
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ uw0 j6(fx0 fx0Var) {
        return fx0Var.createSearchAdManager(abcd.xu.sy(this.DW), this.FH, this.Hw, 14300000);
    }
}
