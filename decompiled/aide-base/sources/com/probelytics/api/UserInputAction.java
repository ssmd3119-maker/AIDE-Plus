package com.probelytics.api;

import abcd.by;
import android.app.Activity;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class UserInputAction {
    private final boolean isBackKey;
    private final UserActionWindow window;

    public UserInputAction(UserActionWindow userActionWindow, boolean z) {
        this.window = userActionWindow;
        this.isBackKey = z;
    }

    public Activity getActivity() {
        return this.window.getActivity();
    }

    public UserActionWindow getWindow() {
        return this.window;
    }

    public boolean isBackKey() {
        return this.isBackKey;
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
