package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class hp implements Callable<String> {
    private final /* synthetic */ Context DW;
    private final /* synthetic */ Context j6;

    hp(fp fpVar, Context context, Context context2) {
        this.j6 = context;
        this.DW = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.j6 != null) {
            sm.we("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.j6.getSharedPreferences("admob_user_agent", 0);
        } else {
            sm.we("Attempting to read user agent from local cache.");
            sharedPreferences = this.DW.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            sm.we("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.DW);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                sm.we("Persisting user agent.");
            }
        }
        return string;
    }
}
