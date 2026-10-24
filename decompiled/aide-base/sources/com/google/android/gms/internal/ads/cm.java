package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class cm {
    private final List<String> DW = new ArrayList();
    private final List<String> FH = new ArrayList();
    private final Map<String, u9> Hw = new HashMap();
    private JSONObject VH;
    private String Zo;
    private boolean gn;
    private final long j6;
    private String v5;

    public cm(String str, long j) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        this.gn = false;
        this.Zo = str;
        this.j6 = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.VH = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.gn = false;
                xp.u7("App settings could not be fetched successfully.");
                return;
            }
            this.gn = true;
            this.v5 = this.VH.optString("app_id");
            JSONArray jSONArrayOptJSONArray = this.VH.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.FH.add(strOptString2);
                        } else if ("rewarded".equalsIgnoreCase(strOptString) && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.Hw.put(strOptString2, new u9(jSONObjectOptJSONObject));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = this.VH.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    this.DW.add(jSONArrayOptJSONArray2.optString(i2));
                }
            }
        } catch (JSONException e) {
            xp.v5("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final boolean DW() {
        return this.gn;
    }

    public final String FH() {
        return this.Zo;
    }

    public final String Hw() {
        return this.v5;
    }

    public final long j6() {
        return this.j6;
    }

    public final Map<String, u9> v5() {
        return this.Hw;
    }
}
