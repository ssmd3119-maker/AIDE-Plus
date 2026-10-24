package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class t9 {
    public final String DW;
    public final String EQ;
    public final List<String> FH;
    public final String Hw;
    public final List<String> J0;
    public final List<String> J8;
    private final String Mr;
    public final String QX;
    public final long U2;
    public final List<String> VH;
    public final String Ws;
    public final String XL;
    public final List<String> Zo;
    public final List<String> aM;
    public final List<String> gn;
    public final String j3;
    public final String j6;
    public final List<String> tp;
    public final List<String> u7;
    public final String v5;
    public final List<String> we;

    public t9(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, List<String> list9, String str10, List<String> list10, String str11, long j) {
        this.j6 = str;
        this.DW = null;
        this.FH = list;
        this.Hw = null;
        this.v5 = null;
        this.Zo = list2;
        this.VH = list3;
        this.gn = list4;
        this.u7 = list5;
        this.EQ = str5;
        this.we = list6;
        this.J0 = list7;
        this.J8 = list8;
        this.Ws = null;
        this.QX = null;
        this.XL = null;
        this.aM = null;
        this.j3 = null;
        this.tp = list10;
        this.Mr = null;
        this.U2 = -1L;
    }

    public final boolean DW() {
        return "native".equalsIgnoreCase(this.Mr);
    }

    public final boolean j6() {
        return "banner".equalsIgnoreCase(this.Mr);
    }

    public t9(JSONObject jSONObject) throws JSONException {
        List<String> listDW;
        this.DW = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.FH = Collections.unmodifiableList(arrayList);
        this.Hw = jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.w0.er();
        this.Zo = ca.DW(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.w0.er();
        this.VH = ca.DW(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.w0.er();
        this.gn = ca.DW(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.w0.er();
        this.tp = ca.DW(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.w0.er();
        this.we = ca.DW(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.w0.er();
        this.J8 = ca.DW(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.w0.er();
        this.J0 = ca.DW(jSONObject, "video_reward_urls");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            com.google.android.gms.ads.internal.w0.er();
            listDW = ca.DW(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listDW = null;
        }
        this.u7 = listDW;
        this.j6 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.EQ = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.v5 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.Ws = jSONObject.optString("html_template", null);
        this.QX = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.XL = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        com.google.android.gms.ads.internal.w0.er();
        this.aM = ca.DW(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.j3 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.Mr = jSONObject.optString("response_type", null);
        this.U2 = jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
