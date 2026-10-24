package com.probelytics.api;

import abcd.by;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class UserActionWindow {
    public static final int ACTIVITY_TYPE = 0;
    public static final int DIALOG_TYPE = 1;
    public static final int OVERLAY_TYPE = 3;
    public static final int POPUP_TYPE = 2;
    public static final int TOAST_TYPE = 4;
    private final Activity activity;
    private final int type;
    private final View windowView;

    public UserActionWindow(Activity activity, int i, View view) {
        this.activity = activity;
        this.type = i;
        this.windowView = view;
        by.j6().Zo(this);
    }

    public Activity getActivity() {
        return this.activity;
    }

    public Context getContext() {
        return this.windowView.getContext();
    }

    public int getHeight() {
        return this.windowView.getHeight();
    }

    public int getIMEHeight() {
        return by.j6().DW();
    }

    public int getType() {
        return this.type;
    }

    public int getWidth() {
        return this.windowView.getWidth();
    }

    public View getWindowView() {
        return this.windowView;
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
