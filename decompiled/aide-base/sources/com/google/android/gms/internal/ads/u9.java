package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class u9 {
    public final long DW;
    public final String EQ;
    public final List<String> FH;
    public final List<String> Hw;
    public final int J0;
    public final long J8;
    public int Mr;
    public final boolean QX;
    public boolean U2;
    public final List<String> VH;
    public final boolean Ws;
    public final boolean XL;
    public final List<String> Zo;
    public final boolean aM;
    public final boolean gn;
    public int j3;
    public final List<t9> j6;
    public final long tp;
    public final String u7;
    public final List<String> v5;
    public final int we;

    public u9(List<t9> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.j6 = list;
        this.DW = j;
        this.FH = list2;
        this.Hw = list3;
        this.v5 = list4;
        this.Zo = list5;
        this.VH = list6;
        this.gn = z;
        this.u7 = str;
        this.tp = -1L;
        this.j3 = 0;
        this.Mr = 1;
        this.EQ = null;
        this.we = 0;
        this.J0 = -1;
        this.J8 = -1L;
        this.Ws = false;
        this.QX = false;
        this.XL = false;
        this.aM = false;
        this.U2 = false;
    }

    public u9(String str) {
        this(new JSONObject(str));
    }

    public u9(JSONObject jSONObject) throws JSONException {
        if (xp.DW(2)) {
            String strValueOf = String.valueOf(jSONObject.toString(2));
            sm.we(strValueOf.length() != 0 ? "Mediation Response JSON: ".concat(strValueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                t9 t9Var = new t9(jSONArray.getJSONObject(i2));
                boolean z = true;
                if (t9Var.j6()) {
                    this.U2 = true;
                }
                arrayList.add(t9Var);
                if (i < 0) {
                    Iterator<String> it = t9Var.FH.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.j3 = i;
        this.Mr = jSONArray.length();
        this.j6 = Collections.unmodifiableList(arrayList);
        this.u7 = jSONObject.optString("qdata");
        this.J0 = jSONObject.optInt("fs_model_type", -1);
        this.J8 = jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            this.DW = jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.w0.er();
            this.FH = ca.DW(jSONObjectOptJSONObject, "click_urls");
            com.google.android.gms.ads.internal.w0.er();
            this.Hw = ca.DW(jSONObjectOptJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.w0.er();
            this.v5 = ca.DW(jSONObjectOptJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.w0.er();
            this.Zo = ca.DW(jSONObjectOptJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.w0.er();
            this.VH = ca.DW(jSONObjectOptJSONObject, "remote_ping_urls");
            this.gn = jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            long jOptLong = jSONObjectOptJSONObject.optLong("refresh", -1L);
            this.tp = jOptLong > 0 ? 1000 * jOptLong : -1L;
            zzawd zzawdVarGn = zzawd.gn(jSONObjectOptJSONObject.optJSONArray("rewards"));
            if (zzawdVarGn == null) {
                this.EQ = null;
                this.we = 0;
            } else {
                this.EQ = zzawdVarGn.WB;
                this.we = zzawdVarGn.mb;
            }
            this.Ws = jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            this.QX = jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.XL = jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.aM = jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.DW = -1L;
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
        this.Zo = null;
        this.VH = null;
        this.tp = -1L;
        this.EQ = null;
        this.we = 0;
        this.Ws = false;
        this.gn = false;
        this.QX = false;
        this.XL = false;
        this.aM = false;
    }
}
