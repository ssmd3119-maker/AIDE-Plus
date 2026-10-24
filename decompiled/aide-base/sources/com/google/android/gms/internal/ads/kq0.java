package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class kq0 implements tr0 {
    private WeakReference<h1> j6;

    public kq0(h1 h1Var) {
        this.j6 = new WeakReference<>(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final boolean DW() {
        return this.j6.get() == null;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final View FH() {
        h1 h1Var = this.j6.get();
        if (h1Var != null) {
            return h1Var.TI();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final tr0 j6() {
        return new mq0(this.j6.get());
    }
}
