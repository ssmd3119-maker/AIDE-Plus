package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class gp implements Callable<String> {
    private final /* synthetic */ Context j6;

    gp(fp fpVar, Context context) {
        this.j6 = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences = this.j6.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            sm.we("User agent is already initialized on Google Play Services.");
            return string;
        }
        sm.we("User agent is not initialized on Google Play Services. Initializing.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.j6);
        com.google.android.gms.common.util.r.j6(this.j6, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
