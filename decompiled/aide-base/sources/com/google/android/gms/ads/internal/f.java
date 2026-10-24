package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.eq;
import com.google.android.gms.internal.ads.jq;
import com.google.android.gms.internal.ads.vq;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements eq {
    static final eq j6 = new f();

    private f() {
    }

    @Override // com.google.android.gms.internal.ads.eq
    public final vq j6(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            w0.u7().a8().FH(jSONObject.getString("appSettingsJson"));
        }
        return jq.J0(null);
    }
}
