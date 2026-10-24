package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class hc0 implements jc0 {
    private final /* synthetic */ Bundle DW;
    private final /* synthetic */ Activity j6;

    hc0(ac0 ac0Var, Activity activity, Bundle bundle) {
        this.j6 = activity;
        this.DW = bundle;
    }

    @Override // com.google.android.gms.internal.ads.jc0
    public final void j6(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.j6, this.DW);
    }
}
