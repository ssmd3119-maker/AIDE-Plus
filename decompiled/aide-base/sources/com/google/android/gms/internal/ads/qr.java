package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@jg
/* loaded from: classes.dex */
public abstract class qr {
    private final WeakReference<View> WB;

    public qr(View view) {
        this.WB = new WeakReference<>(view);
    }

    private final ViewTreeObserver FH() {
        ViewTreeObserver viewTreeObserver;
        View view = this.WB.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void DW() {
        ViewTreeObserver viewTreeObserverFH = FH();
        if (viewTreeObserverFH != null) {
            v5(viewTreeObserverFH);
        }
    }

    protected abstract void Hw(ViewTreeObserver viewTreeObserver);

    public final void j6() {
        ViewTreeObserver viewTreeObserverFH = FH();
        if (viewTreeObserverFH != null) {
            Hw(viewTreeObserverFH);
        }
    }

    protected abstract void v5(ViewTreeObserver viewTreeObserver);
}
