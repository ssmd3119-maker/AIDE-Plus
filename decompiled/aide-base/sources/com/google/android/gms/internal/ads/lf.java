package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lf implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ WeakReference WB;
    private final /* synthetic */ df mb;

    lf(df dfVar, WeakReference weakReference) {
        this.mb = dfVar;
        this.WB = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.mb.Zo(this.WB, false);
    }
}
