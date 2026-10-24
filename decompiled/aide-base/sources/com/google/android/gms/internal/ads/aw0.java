package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class aw0 extends bw0<j2> {
    private final /* synthetic */ FrameLayout DW;
    private final /* synthetic */ FrameLayout FH;
    private final /* synthetic */ Context Hw;
    private final /* synthetic */ uv0 v5;

    aw0(uv0 uv0Var, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.v5 = uv0Var;
        this.DW = frameLayout;
        this.FH = frameLayout2;
        this.Hw = context;
    }

    @Override // com.google.android.gms.internal.ads.bw0
    protected final /* synthetic */ j2 FH() {
        uv0.FH(this.Hw, "native_ad_view_delegate");
        return new ry0();
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ j2 Hw() {
        return this.v5.FH.FH(this.Hw, this.DW, this.FH);
    }

    @Override // com.google.android.gms.internal.ads.bw0
    public final /* synthetic */ j2 j6(fx0 fx0Var) {
        return fx0Var.createNativeAdViewDelegate(abcd.xu.sy(this.DW), abcd.xu.sy(this.FH));
    }
}
