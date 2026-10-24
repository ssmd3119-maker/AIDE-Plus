package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class se implements cf<t0> {
    @Override // com.google.android.gms.internal.ads.cf
    public final /* synthetic */ j1 j6(te teVar, JSONObject jSONObject) {
        JSONObject jSONObjectDW = xo.DW(jSONObject, "html_containers", "instream");
        cv cvVarJ8 = te.J8(jSONObjectDW == null ? teVar.J0(jSONObject, "video") : teVar.v5(jSONObjectDW.optString("base_url"), jSONObjectDW.optString("html"), true));
        if (cvVarJ8 != null) {
            return new t0(cvVarJ8);
        }
        xp.u7("Can not get video view for instream ad.");
        return null;
    }
}
