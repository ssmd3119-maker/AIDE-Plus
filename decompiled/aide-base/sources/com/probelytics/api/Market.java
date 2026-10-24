package com.probelytics.api;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class Market {
    private final String packageName;

    public Market(String str) {
        this.packageName = str;
    }

    public String getPackageName() {
        return this.packageName;
    }
}
