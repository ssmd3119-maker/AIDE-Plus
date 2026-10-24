package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

@jg
/* loaded from: classes.dex */
public final class lp {
    private Activity DW;
    private boolean FH;
    private boolean Hw;
    private ViewTreeObserver.OnScrollChangedListener VH;
    private ViewTreeObserver.OnGlobalLayoutListener Zo;
    private final View j6;
    private boolean v5;

    public lp(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.DW = activity;
        this.j6 = view;
        this.Zo = onGlobalLayoutListener;
        this.VH = onScrollChangedListener;
    }

    private final void Zo() {
        ViewTreeObserver viewTreeObserverGn;
        ViewTreeObserver viewTreeObserverGn2;
        Activity activity = this.DW;
        if (activity != null && this.FH) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.Zo;
            if (onGlobalLayoutListener != null && (viewTreeObserverGn2 = gn(activity)) != null) {
                com.google.android.gms.ads.internal.w0.VH().gn(viewTreeObserverGn2, onGlobalLayoutListener);
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.VH;
            if (onScrollChangedListener != null && (viewTreeObserverGn = gn(this.DW)) != null) {
                viewTreeObserverGn.removeOnScrollChangedListener(onScrollChangedListener);
            }
            this.FH = false;
        }
    }

    private static ViewTreeObserver gn(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void v5() {
        ViewTreeObserver viewTreeObserverGn;
        ViewTreeObserver viewTreeObserverGn2;
        if (this.FH) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.Zo;
        if (onGlobalLayoutListener != null) {
            Activity activity = this.DW;
            if (activity != null && (viewTreeObserverGn2 = gn(activity)) != null) {
                viewTreeObserverGn2.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            com.google.android.gms.ads.internal.w0.P8();
            nr.j6(this.j6, this.Zo);
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.VH;
        if (onScrollChangedListener != null) {
            Activity activity2 = this.DW;
            if (activity2 != null && (viewTreeObserverGn = gn(activity2)) != null) {
                viewTreeObserverGn.addOnScrollChangedListener(onScrollChangedListener);
            }
            com.google.android.gms.ads.internal.w0.P8();
            nr.DW(this.j6, this.VH);
        }
        this.FH = true;
    }

    public final void DW() {
        this.Hw = false;
        Zo();
    }

    public final void FH() {
        this.v5 = true;
        if (this.Hw) {
            v5();
        }
    }

    public final void Hw() {
        this.v5 = false;
        Zo();
    }

    public final void VH(Activity activity) {
        this.DW = activity;
    }

    public final void j6() {
        this.Hw = true;
        if (this.v5) {
            v5();
        }
    }
}
