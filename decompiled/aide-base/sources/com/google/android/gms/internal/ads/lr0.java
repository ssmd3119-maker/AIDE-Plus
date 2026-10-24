package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class lr0 implements sr0 {
    private final /* synthetic */ Bundle DW;
    private final /* synthetic */ Activity j6;

    lr0(kr0 kr0Var, Activity activity, Bundle bundle) {
        this.j6 = activity;
        this.DW = bundle;
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void j6(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.j6, this.DW);
    }
}
