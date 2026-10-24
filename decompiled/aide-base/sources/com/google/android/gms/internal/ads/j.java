package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j extends e<String> {
    j(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ String EQ(JSONObject jSONObject) {
        return jSONObject.optString(j6(), J0());
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ String gn(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(j6(), J0());
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ void u7(SharedPreferences.Editor editor, String str) {
        editor.putString(j6(), str);
    }
}
