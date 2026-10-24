package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

@jg
@TargetApi(14)
/* loaded from: classes.dex */
public final class fr0 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long kf = ((Long) cw0.v5().FH(p.oy)).longValue();
    private WeakReference<View> AL;
    private final Rect Q6;
    private final Context WB;
    private final PowerManager fY;
    private final WindowManager jw;
    private BroadcastReceiver k2;
    private Application mb;
    private final DisplayMetrics n5;
    private final KeyguardManager qp;
    private kr0 w9;
    private WeakReference<ViewTreeObserver> zh;
    private bp hK = new bp(kf);
    private boolean cT = false;
    private int q7 = -1;
    private final HashSet<jr0> Z1 = new HashSet<>();

    public fr0(Context context, View view) {
        this.WB = context.getApplicationContext();
        this.jw = (WindowManager) context.getSystemService("window");
        this.fY = (PowerManager) this.WB.getSystemService("power");
        this.qp = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.WB;
        if (context2 instanceof Application) {
            this.mb = (Application) context2;
            this.w9 = new kr0((Application) context2, this);
        }
        this.n5 = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.Q6 = rect;
        rect.right = this.jw.getDefaultDisplay().getWidth();
        this.Q6.bottom = this.jw.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.AL;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            tp(view2);
        }
        this.AL = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.w0.VH().DW(view)) {
                u7(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void DW(Activity activity, int i) {
        Window window;
        if (this.AL == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.AL.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.q7 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void VH(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        if (this.Z1.size() == 0 || (weakReference = this.AL) == null) {
            return;
        }
        View view = weakReference.get();
        boolean z3 = i == 1;
        boolean z4 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr2);
            } catch (Exception e) {
                xp.Hw("Failure getting view location.", e);
            }
            int i2 = iArr[0];
            rect.left = i2;
            rect.top = iArr[1];
            rect.right = i2 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            z = false;
            z2 = false;
        }
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i3 = this.q7;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        boolean z5 = !z4 && com.google.android.gms.ads.internal.w0.v5().lg(view, this.fY, this.qp) && z && z2 && windowVisibility == 0;
        if (z3 && !this.hK.j6() && z5 == this.cT) {
            return;
        }
        if (z5 || this.cT || i != 1) {
            ir0 ir0Var = new ir0(com.google.android.gms.ads.internal.w0.we().DW(), this.fY.isScreenOn(), view != null ? com.google.android.gms.ads.internal.w0.VH().DW(view) : false, view != null ? view.getWindowVisibility() : 8, j6(this.Q6), j6(rect), j6(rect2), z, j6(rect3), z2, j6(rect4), this.n5.density, z5);
            Iterator<jr0> it = this.Z1.iterator();
            while (it.hasNext()) {
                it.next().J8(ir0Var);
            }
            this.cT = z5;
        }
    }

    private final int gn(int i) {
        return (int) (i / this.n5.density);
    }

    private final Rect j6(Rect rect) {
        return new Rect(gn(rect.left), gn(rect.top), gn(rect.right), gn(rect.bottom));
    }

    private final void tp(View view) {
        try {
            if (this.zh != null) {
                ViewTreeObserver viewTreeObserver = this.zh.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zh = null;
            }
        } catch (Exception e) {
            xp.Hw("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            xp.Hw("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.k2 != null) {
            try {
                com.google.android.gms.ads.internal.w0.BT().DW(this.WB, this.k2);
            } catch (IllegalStateException e3) {
                xp.Hw("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.w0.u7().v5(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.k2 = null;
        }
        Application application = this.mb;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.w9);
            } catch (Exception e5) {
                xp.Hw("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    private final void u7(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zh = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.k2 == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.k2 = new hr0(this);
            com.google.android.gms.ads.internal.w0.BT().FH(this.WB, this.k2, intentFilter);
        }
        Application application = this.mb;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.w9);
            } catch (Exception e) {
                xp.Hw("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void v5() {
        com.google.android.gms.ads.internal.w0.v5();
        bn.gn.post(new gr0(this));
    }

    public final void EQ() {
        VH(4);
    }

    public final void Hw(jr0 jr0Var) {
        this.Z1.add(jr0Var);
        VH(3);
    }

    public final void Zo(jr0 jr0Var) {
        this.Z1.remove(jr0Var);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        DW(activity, 0);
        VH(3);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        VH(3);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        DW(activity, 4);
        VH(3);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        DW(activity, 0);
        VH(3);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        VH(3);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        DW(activity, 0);
        VH(3);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        VH(3);
        v5();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        VH(2);
        v5();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        VH(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.q7 = -1;
        u7(view);
        VH(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.q7 = -1;
        VH(3);
        v5();
        tp(view);
    }
}
