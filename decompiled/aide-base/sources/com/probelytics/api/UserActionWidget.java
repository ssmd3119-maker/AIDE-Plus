package com.probelytics.api;

import abcd.by;
import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class UserActionWidget {
    private final int itemPosition;
    private final View itemView;
    private final View view;

    public UserActionWidget(View view, int i, View view2) {
        this.view = view;
        this.itemView = view2;
        this.itemPosition = i;
    }

    public Context getContext() {
        return this.view.getContext();
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    public View getItemView() {
        return this.itemView;
    }

    public View getView() {
        return this.view;
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
