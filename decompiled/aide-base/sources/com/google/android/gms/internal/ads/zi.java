package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class zi extends bj {
    private final Context DW;
    private SharedPreferences FH;
    private final x8<JSONObject, JSONObject> Hw;
    private final Object j6 = new Object();

    public zi(Context context, x8<JSONObject, JSONObject> x8Var) {
        this.DW = context.getApplicationContext();
        this.Hw = x8Var;
    }

    final /* synthetic */ Void DW(JSONObject jSONObject) {
        p.DW(this.DW, 1, jSONObject);
        this.FH.edit().putLong("js_last_update", com.google.android.gms.ads.internal.w0.we().j6()).apply();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bj
    public final vq<Void> j6() throws JSONException {
        synchronized (this.j6) {
            if (this.FH == null) {
                this.FH = this.DW.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.w0.we().j6() - this.FH.getLong("js_last_update", 0L) < ((Long) cw0.v5().FH(p.b1)).longValue()) {
            return jq.J0(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbbi.gn().WB);
            jSONObject.put("mf", cw0.v5().FH(p.AR));
            jSONObject.put("cl", "221522000");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", DynamiteModule.FH(this.DW, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
            return jq.FH(this.Hw.DW(jSONObject), new fq(this) { // from class: com.google.android.gms.internal.ads.aj
                private final zi j6;

                {
                    this.j6 = this;
                }

                @Override // com.google.android.gms.internal.ads.fq
                public final Object j6(Object obj) {
                    return this.j6.DW((JSONObject) obj);
                }
            }, ar.DW);
        } catch (JSONException e) {
            xp.Hw("Unable to populate SDK Core Constants parameters.", e);
            return jq.J0(null);
        }
    }
}
