package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public final class gc0 implements jc0 {
    private final /* synthetic */ Activity j6;

    gc0(ac0 ac0Var, Activity activity) {
        this.j6 = activity;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void j6(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.j6);
    }
}
