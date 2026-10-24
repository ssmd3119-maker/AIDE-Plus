package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i extends e<Float> {
    i(int i, String str, Float f) {
        super(i, str, f, null);
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Float EQ(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(j6(), J0().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Float gn(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(j6(), J0().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ void u7(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(j6(), f.floatValue());
    }
}
