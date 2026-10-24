package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends e<Boolean> {
    f(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Boolean EQ(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(j6(), J0().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Boolean gn(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(j6(), J0().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ void u7(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(j6(), bool.booleanValue());
    }
}
