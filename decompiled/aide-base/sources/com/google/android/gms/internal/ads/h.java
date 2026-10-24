package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends e<Long> {
    h(int i, String str, Long l) {
        super(i, str, l, null);
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Long EQ(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(j6(), J0().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ Long gn(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(j6(), J0().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.e
    public final /* synthetic */ void u7(SharedPreferences.Editor editor, Long l) {
        editor.putLong(j6(), l.longValue());
    }
}
