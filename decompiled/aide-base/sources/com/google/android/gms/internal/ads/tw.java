package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class tw implements View.OnAttachStateChangeListener {
    private final /* synthetic */ jl WB;
    private final /* synthetic */ qw mb;

    tw(qw qwVar, jl jlVar) {
        this.mb = qwVar;
        this.WB = jlVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.mb.rN(view, this.WB, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
