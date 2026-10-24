package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class rs {
    public final int DW;
    public final int FH;
    public final int Hw;
    public final int VH;
    public final int Zo;
    public final int gn;
    public final boolean j6;
    public final boolean tp;
    public final boolean u7;
    public final String v5;

    public rs(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.j6 = j6(jSONObject, "aggressive_media_codec_release", p.BT);
        this.DW = DW(jSONObject, "byte_buffer_precache_limit", p.J0);
        this.FH = DW(jSONObject, "exo_cache_buffer_size", p.QX);
        this.Hw = DW(jSONObject, "exo_connect_timeout_millis", p.u7);
        this.v5 = Hw(jSONObject, "exo_player_version", p.gn);
        this.Zo = DW(jSONObject, "exo_read_timeout_millis", p.tp);
        this.VH = DW(jSONObject, "load_check_interval_bytes", p.EQ);
        this.gn = DW(jSONObject, "player_precache_limit", p.we);
        this.u7 = j6(jSONObject, "use_cache_data_source", p.u9);
        this.tp = FH(jSONObject, "use_dash", false);
    }

    private static int DW(JSONObject jSONObject, String str, e<Integer> eVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) cw0.v5().FH(eVar)).intValue();
    }

    private static boolean FH(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    private static String Hw(JSONObject jSONObject, String str, e<String> eVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) cw0.v5().FH(eVar);
    }

    private static boolean j6(JSONObject jSONObject, String str, e<Boolean> eVar) {
        return FH(jSONObject, str, ((Boolean) cw0.v5().FH(eVar)).booleanValue());
    }
}
