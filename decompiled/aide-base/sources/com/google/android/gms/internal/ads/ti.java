package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.AppMeasurement;
import java.util.Arrays;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class ti {
    private final String DW;
    private final boolean FH;
    private final String Hw;
    private final boolean VH;
    private final int Zo;
    private final String gn;
    private final String j6;
    private final boolean u7;
    private String v5;

    public ti(JSONObject jSONObject) {
        this.v5 = jSONObject.optString("url");
        this.j6 = jSONObject.optString("base_uri");
        this.DW = jSONObject.optString("post_parameters");
        String strOptString = jSONObject.optString("drt_include");
        this.FH = strOptString != null && (strOptString.equals("1") || strOptString.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString(AppMeasurement.Param.TYPE);
        String strOptString2 = jSONObject.optString("errors");
        if (strOptString2 != null) {
            Arrays.asList(strOptString2.split(","));
        }
        this.Zo = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.Hw = jSONObject.optString("fetched_ad");
        this.VH = jSONObject.optBoolean("render_test_ad_label");
        if (jSONObject.optJSONObject("preprocessor_flags") == null) {
            new JSONObject();
        }
        this.gn = jSONObject.optString("analytics_query_ad_event_id");
        this.u7 = jSONObject.optBoolean("is_analytics_logging_enabled");
    }

    public final String DW() {
        return this.v5;
    }

    public final String FH() {
        return this.j6;
    }

    public final String Hw() {
        return this.DW;
    }

    public final boolean VH() {
        return this.VH;
    }

    public final String Zo() {
        return this.Hw;
    }

    public final String gn() {
        return this.gn;
    }

    public final int j6() {
        return this.Zo;
    }

    public final boolean u7() {
        return this.u7;
    }

    public final boolean v5() {
        return this.FH;
    }
}
