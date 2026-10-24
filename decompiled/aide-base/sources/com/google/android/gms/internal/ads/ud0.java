package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class ud0 extends xd0 {
    private final View gn;

    public ud0(nc0 nc0Var, String str, String str2, sz szVar, int i, int i2, View view) {
        super(nc0Var, str, str2, szVar, i, 57);
        this.gn = view;
    }

    @Override // com.google.android.gms.internal.ads.xd0
    protected final void j6() {
        if (this.gn != null) {
            vc0 vc0Var = new vc0((String) this.v5.invoke(null, this.gn, this.j6.j6().getResources().getDisplayMetrics()));
            p10 p10Var = new p10();
            p10Var.v5 = vc0Var.DW;
            p10Var.Zo = vc0Var.FH;
            p10Var.VH = vc0Var.Hw;
            this.Hw.OW = p10Var;
        }
    }
}
