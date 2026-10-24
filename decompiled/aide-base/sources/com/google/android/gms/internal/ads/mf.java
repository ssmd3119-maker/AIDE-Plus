package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class mf implements ViewTreeObserver.OnScrollChangedListener {
    private final /* synthetic */ WeakReference WB;
    private final /* synthetic */ df mb;

    mf(df dfVar, WeakReference weakReference) {
        this.mb = dfVar;
        this.WB = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.mb.Zo(this.WB, true);
    }
}
