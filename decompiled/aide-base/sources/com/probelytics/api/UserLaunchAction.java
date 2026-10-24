package com.probelytics.api;

import android.app.Activity;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class UserLaunchAction {
    private final Activity activity;

    public UserLaunchAction(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity() {
        return this.activity;
    }
}
