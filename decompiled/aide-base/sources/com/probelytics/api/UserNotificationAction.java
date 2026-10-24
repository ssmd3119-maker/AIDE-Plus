package com.probelytics.api;

import abcd.by;
import android.app.Activity;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class UserNotificationAction {
    public static final String CONTENT_ACTION_NAME = "__CONTENT";
    public static final String DELETE_ACTION_NAME = "__DELETE";
    private final Activity activity;
    private final String name;
    private final UserNotification notification;

    public UserNotificationAction(UserNotification userNotification, Activity activity, String str) {
        this.notification = userNotification;
        this.name = str;
        this.activity = activity;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public String getName() {
        return this.name;
    }

    public UserNotification getNotification() {
        return this.notification;
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
