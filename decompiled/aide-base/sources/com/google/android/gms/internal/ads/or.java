package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@jg
/* loaded from: classes.dex */
public final class or extends qr implements ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> mb;

    public or(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.mb = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final void Hw(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.mb.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            DW();
        }
    }

    @Override // com.google.android.gms.internal.ads.qr
    protected final void v5(ViewTreeObserver viewTreeObserver) {
        com.google.android.gms.ads.internal.w0.VH().gn(viewTreeObserver, this);
    }
}
