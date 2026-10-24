package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class mq0 implements tr0 {
    private h1 j6;

    public mq0(h1 h1Var) {
        this.j6 = h1Var;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final boolean DW() {
        return this.j6 == null;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final View FH() {
        h1 h1Var = this.j6;
        if (h1Var != null) {
            return h1Var.TI();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final tr0 j6() {
        return this;
    }
}
