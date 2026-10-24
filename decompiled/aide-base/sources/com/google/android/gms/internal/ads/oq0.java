package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class oq0 implements tr0 {
    private final WeakReference<yl> DW;
    private final WeakReference<View> j6;

    public oq0(View view, yl ylVar) {
        this.j6 = new WeakReference<>(view);
        this.DW = new WeakReference<>(ylVar);
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final boolean DW() {
        return this.j6.get() == null || this.DW.get() == null;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final View FH() {
        return this.j6.get();
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final tr0 j6() {
        return new nq0(this.j6.get(), this.DW.get());
    }
}
