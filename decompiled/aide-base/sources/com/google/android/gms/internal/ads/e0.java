package com.google.android.gms.internal.ads;

import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e0 extends h0 {
    private final com.google.android.gms.ads.internal.g WB;
    private final String jw;
    private final String mb;

    public e0(com.google.android.gms.ads.internal.g gVar, String str, String str2) {
        this.WB = gVar;
        this.mb = str;
        this.jw = str2;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final String Sq() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void VH() {
        this.WB.uj();
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final String getContent() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void oC() {
        this.WB.Af();
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void rC(abcd.wu wuVar) {
        if (wuVar == null) {
            return;
        }
        this.WB.Qa((View) abcd.xu.g3(wuVar));
    }
}
