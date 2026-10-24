package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class gv implements View.OnAttachStateChangeListener {
    private final /* synthetic */ jl WB;
    private final /* synthetic */ dv mb;

    gv(dv dvVar, jl jlVar) {
        this.mb = dvVar;
        this.WB = jlVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.mb.j3(view, this.WB, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
