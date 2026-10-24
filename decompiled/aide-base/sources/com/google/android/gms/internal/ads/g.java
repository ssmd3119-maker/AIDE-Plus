package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends e<Integer> {
    g(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Integer EQ(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(j6(), J0().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Integer gn(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(j6(), J0().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ void u7(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(j6(), num.intValue());
    }
}
