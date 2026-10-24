package androidx.core.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public class e0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View WB;
    private final Runnable jw;
    private ViewTreeObserver mb;

    private e0(View view, Runnable runnable) {
        this.WB = view;
        this.mb = view.getViewTreeObserver();
        this.jw = runnable;
    }

    public static e0 j6(View view, Runnable runnable) {
        e0 e0Var = new e0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(e0Var);
        view.addOnAttachStateChangeListener(e0Var);
        return e0Var;
    }

    public void DW() {
        if (this.mb.isAlive()) {
            this.mb.removeOnPreDrawListener(this);
        } else {
            this.WB.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.WB.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        DW();
        this.jw.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.mb = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        DW();
    }
}
