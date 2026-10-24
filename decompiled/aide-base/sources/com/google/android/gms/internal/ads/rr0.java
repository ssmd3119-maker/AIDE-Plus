package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public final class rr0 implements sr0 {
    private final /* synthetic */ Activity j6;

    rr0(kr0 kr0Var, Activity activity) {
        this.j6 = activity;
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void j6(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.j6);
    }
}
