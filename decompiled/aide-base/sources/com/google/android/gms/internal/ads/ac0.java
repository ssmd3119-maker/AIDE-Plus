package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ac0 implements Application.ActivityLifecycleCallbacks {
    private final Application WB;
    private boolean jw = false;
    private final WeakReference<Application.ActivityLifecycleCallbacks> mb;

    public ac0(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.mb = new WeakReference<>(activityLifecycleCallbacks);
        this.WB = application;
    }

    private final void j6(jc0 jc0Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.mb.get();
            if (activityLifecycleCallbacks != null) {
                jc0Var.j6(activityLifecycleCallbacks);
            } else {
                if (this.jw) {
                    return;
                }
                this.WB.unregisterActivityLifecycleCallbacks(this);
                this.jw = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j6(new cc0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j6(new ic0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        j6(new fc0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j6(new ec0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j6(new hc0(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        j6(new dc0(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j6(new gc0(this, activity));
    }
}
