package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
/* loaded from: classes.dex */
public final class xr0 implements Application.ActivityLifecycleCallbacks {
    private Runnable AL;
    private Activity WB;
    private long hK;
    private Context mb;
    private final Object jw = new Object();
    private boolean fY = true;
    private boolean qp = false;

    @GuardedBy("mLock")
    private final List<zr0> k2 = new ArrayList();

    @GuardedBy("mLock")
    private final List<ns0> zh = new ArrayList();
    private boolean w9 = false;

    xr0() {
    }

    private final void FH(Activity activity) {
        synchronized (this.jw) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.WB = activity;
            }
        }
    }

    static /* synthetic */ boolean VH(xr0 xr0Var, boolean z) {
        xr0Var.fY = false;
        return false;
    }

    public final Context DW() {
        return this.mb;
    }

    public final void Zo(zr0 zr0Var) {
        synchronized (this.jw) {
            this.k2.add(zr0Var);
        }
    }

    public final Activity j6() {
        return this.WB;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.jw) {
            if (this.WB == null) {
                return;
            }
            if (this.WB.equals(activity)) {
                this.WB = null;
            }
            Iterator<ns0> it = this.zh.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().j6(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.w0.u7().v5(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    xp.Hw("", e);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        FH(activity);
        synchronized (this.jw) {
            Iterator<ns0> it = this.zh.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityPaused(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.w0.u7().v5(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    xp.Hw("", e);
                }
            }
        }
        this.qp = true;
        Runnable runnable = this.AL;
        if (runnable != null) {
            bn.gn.removeCallbacks(runnable);
        }
        Handler handler = bn.gn;
        yr0 yr0Var = new yr0(this);
        this.AL = yr0Var;
        handler.postDelayed(yr0Var, this.hK);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        FH(activity);
        this.qp = false;
        boolean z = !this.fY;
        this.fY = true;
        Runnable runnable = this.AL;
        if (runnable != null) {
            bn.gn.removeCallbacks(runnable);
        }
        synchronized (this.jw) {
            Iterator<ns0> it = this.zh.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityResumed(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.w0.u7().v5(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    xp.Hw("", e);
                }
            }
            if (z) {
                Iterator<zr0> it2 = this.k2.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().j6(true);
                    } catch (Exception e2) {
                        xp.Hw("", e2);
                    }
                }
            } else {
                xp.VH("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        FH(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void v5(Application application, Context context) {
        if (this.w9) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            FH((Activity) context);
        }
        this.mb = application;
        this.hK = ((Long) cw0.v5().FH(p.Ev)).longValue();
        this.w9 = true;
    }
}
