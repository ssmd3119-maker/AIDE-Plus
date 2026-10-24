package com.probelytics.api;

import abcd.by;
import android.app.Activity;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class UserTouchAction {
    public static final int CLICK_KIND = 7;
    public static final int ITEM_CLICK_KIND = 6;
    public static final int ITEM_LONG_PRESS_KIND = 3;
    public static final int LONG_PRESS_KIND = 4;
    public static final int LONG_TAP_KIND = 2;
    public static final int MENU_ITEM_SELECT_KIND = 5;
    public static final int SWIPE_KIND = 1;
    public static final int TAP_KIND = 0;
    private final int kind;
    private final UserActionWidget widget;
    private final UserActionWindow window;
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;

    public UserTouchAction(UserActionWindow userActionWindow, UserActionWidget userActionWidget, int i, int i2, int i3, int i4, int i5) {
        this.window = userActionWindow;
        this.kind = i;
        this.x1 = i2;
        this.y1 = i3;
        this.x2 = i4;
        this.y2 = i5;
        this.widget = userActionWidget;
    }

    public Activity getActivity() {
        return this.window.getActivity();
    }

    public Class<?> getActivityClass() {
        if (getActivity() != null) {
            return getActivity().getClass();
        }
        return null;
    }

    public int getKind() {
        return this.kind;
    }

    public UserActionWidget getWidget() {
        return this.widget;
    }

    public UserActionWindow getWindow() {
        return this.window;
    }

    public int getX1() {
        return this.x1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY1() {
        return this.y1;
    }

    public int getY2() {
        return this.y2;
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
