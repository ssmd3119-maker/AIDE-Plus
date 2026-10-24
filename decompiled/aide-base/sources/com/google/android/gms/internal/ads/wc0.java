package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class wc0 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler Z1 = new Handler(Looper.getMainLooper());
    private WeakReference<View> AL;
    private final Context WB;
    private final KeyguardManager fY;
    private final PowerManager jw;
    private BroadcastReceiver k2;
    private Application mb;
    private final nc0 qp;
    private ac0 w9;
    private WeakReference<ViewTreeObserver> zh;
    private boolean hK = false;
    private int cT = -1;
    private long q7 = -3;

    public wc0(nc0 nc0Var, View view) {
        this.qp = nc0Var;
        Context context = nc0Var.j6;
        this.WB = context;
        this.jw = (PowerManager) context.getSystemService("power");
        this.fY = (KeyguardManager) this.WB.getSystemService("keyguard");
        Context context2 = this.WB;
        if (context2 instanceof Application) {
            this.mb = (Application) context2;
            this.w9 = new ac0((Application) context2, this);
        }
        Zo(view);
    }

    private final void FH() {
        Z1.post(new xc0(this));
    }

    private final void VH(View view) {
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
            yc0 yc0Var = new yc0(this);
            this.k2 = yc0Var;
            this.WB.registerReceiver(yc0Var, intentFilter);
        }
        Application application = this.mb;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.w9);
            } catch (Exception unused) {
            }
        }
    }

    private final void gn(View view) {
        try {
            if (this.zh != null) {
                ViewTreeObserver viewTreeObserver = this.zh.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zh = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.k2;
        if (broadcastReceiver != null) {
            try {
                this.WB.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.k2 = null;
        }
        Application application = this.mb;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.w9);
            } catch (Exception unused4) {
            }
        }
    }

    private final void j6(Activity activity, int i) {
        Window window;
        if (this.AL == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.AL.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.cT = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v5() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.AL
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto L15
            r2 = -3
            r9.q7 = r2
            r9.hK = r1
            return
        L15:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r2 = r0.getGlobalVisibleRect(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            com.google.android.gms.internal.ads.nc0 r4 = r9.qp
            boolean r4 = r4.aM()
            r5 = 1
            if (r4 != 0) goto L5b
            android.app.KeyguardManager r4 = r9.fY
            boolean r4 = r4.inKeyguardRestrictedInputMode()
            if (r4 == 0) goto L59
            android.app.Activity r4 = com.google.android.gms.internal.ads.uc0.v5(r0)
            if (r4 == 0) goto L55
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L46
            r4 = 0
            goto L4a
        L46:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
        L4a:
            if (r4 == 0) goto L55
            int r4 = r4.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L55
            r4 = 1
            goto L56
        L55:
            r4 = 0
        L56:
            if (r4 == 0) goto L59
            goto L5b
        L59:
            r4 = 0
            goto L5c
        L5b:
            r4 = 1
        L5c:
            int r6 = r0.getWindowVisibility()
            int r7 = r9.cT
            r8 = -1
            if (r7 == r8) goto L66
            r6 = r7
        L66:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L83
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L83
            android.os.PowerManager r0 = r9.jw
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L83
            if (r4 == 0) goto L83
            if (r3 == 0) goto L83
            if (r2 == 0) goto L83
            if (r6 != 0) goto L83
            r1 = 1
        L83:
            boolean r0 = r9.hK
            if (r0 == r1) goto L94
            if (r1 == 0) goto L8e
            long r2 = android.os.SystemClock.elapsedRealtime()
            goto L90
        L8e:
            r2 = -2
        L90:
            r9.q7 = r2
            r9.hK = r1
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wc0.v5():void");
    }

    public final long Hw() {
        if (this.q7 == -2 && this.AL.get() == null) {
            this.q7 = -3L;
        }
        return this.q7;
    }

    final void Zo(View view) {
        WeakReference<View> weakReference = this.AL;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            gn(view2);
        }
        this.AL = new WeakReference<>(view);
        if (view == null) {
            this.q7 = -3L;
            return;
        }
        if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
            VH(view);
        }
        view.addOnAttachStateChangeListener(this);
        this.q7 = -2L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j6(activity, 0);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        j6(activity, 4);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j6(activity, 0);
        v5();
        FH();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        j6(activity, 0);
        v5();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        v5();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        v5();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        v5();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.cT = -1;
        VH(view);
        v5();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.cT = -1;
        v5();
        FH();
        gn(view);
    }
}
