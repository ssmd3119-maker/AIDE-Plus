package com.probelytics.api;

import abcd.by;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
public class UserNotification {
    private final Context context;
    private final Map<String, String> extras;
    private final String group;
    private final int id;

    public UserNotification(Context context, int i, String str, Map<String, String> map) {
        this.extras = map;
        this.context = context;
        this.id = i;
        this.group = str;
    }

    public boolean getBooleanExtra(String str) {
        return Boolean.parseBoolean(this.extras.get(str));
    }

    public Map<String, String> getExtras() {
        return this.extras;
    }

    public String getGroup() {
        return this.group;
    }

    public int getId() {
        return this.id;
    }

    public int getIntExtra(String str) {
        return Integer.parseInt(this.extras.get(str));
    }

    public String getStringExtra(String str) {
        return this.extras.get(str);
    }

    public boolean hasExtra(String str) {
        return this.extras.containsKey(str);
    }

    public String toString() {
        return by.j6().Zo(this);
    }
}
