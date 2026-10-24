package com.probelytics.api;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public class AppInfo {
    private final String applicationId;
    private final boolean hasMySignature;
    private final Market market;

    public AppInfo(Market market, String str, boolean z) {
        this.market = market;
        this.applicationId = str;
        this.hasMySignature = z;
    }

    private boolean isSystemApp() {
        return this.applicationId.startsWith("com.google.") || this.applicationId.startsWith("android.") || this.applicationId.startsWith("androidx.");
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public Market getMarket() {
        return this.market;
    }

    public boolean hasMySignature() {
        return this.hasMySignature && !isSystemApp();
    }
}
