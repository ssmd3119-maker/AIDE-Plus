package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class nq0 implements tr0 {
    private final yl DW;
    private final View j6;

    public nq0(View view, yl ylVar) {
        this.j6 = view;
        this.DW = ylVar;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final boolean DW() {
        return this.DW == null || this.j6 == null;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final View FH() {
        return this.j6;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final tr0 j6() {
        return this;
    }
}
