package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final a qp = new a();
    private final AtomicBoolean WB = new AtomicBoolean();
    private final AtomicBoolean mb = new AtomicBoolean();

    @GuardedBy("sInstance")
    private final ArrayList<InterfaceC0109a> jw = new ArrayList<>();

    @GuardedBy("sInstance")
    private boolean fY = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0109a {
        void j6(boolean z);
    }

    private a() {
    }

    public static a DW() {
        return qp;
    }

    public static void FH(Application application) {
        synchronized (qp) {
            if (!qp.fY) {
                application.registerActivityLifecycleCallbacks(qp);
                application.registerComponentCallbacks(qp);
                qp.fY = true;
            }
        }
    }

    private final void v5(boolean z) {
        synchronized (qp) {
            ArrayList<InterfaceC0109a> arrayList = this.jw;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                InterfaceC0109a interfaceC0109a = arrayList.get(i);
                i++;
                interfaceC0109a.j6(z);
            }
        }
    }

    public final boolean Hw() {
        return this.WB.get();
    }

    @TargetApi(16)
    public final boolean Zo(boolean z) {
        if (!this.mb.get()) {
            if (!com.google.android.gms.common.util.o.FH()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.mb.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.WB.set(true);
            }
        }
        return Hw();
    }

    public final void j6(InterfaceC0109a interfaceC0109a) {
        synchronized (qp) {
            this.jw.add(interfaceC0109a);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.WB.compareAndSet(true, false);
        this.mb.set(true);
        if (zCompareAndSet) {
            v5(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.WB.compareAndSet(true, false);
        this.mb.set(true);
        if (zCompareAndSet) {
            v5(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.WB.compareAndSet(false, true)) {
            this.mb.set(true);
            v5(true);
        }
    }
}
