package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class qf implements cf<z0> {
    private final boolean j6;

    public qf(boolean z) {
        this.j6 = z;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final /* synthetic */ j1 j6(te teVar, JSONObject jSONObject) throws JSONException {
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        SimpleArrayMap simpleArrayMap2 = new SimpleArrayMap();
        vq<p0> vqVarXL = teVar.XL(jSONObject);
        vq<cv> vqVarJ0 = teVar.J0(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(AppMeasurement.Param.TYPE);
            if ("string".equals(string)) {
                simpleArrayMap2.put(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                simpleArrayMap.put(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), teVar.u7(jSONObject2, "image_value", this.j6));
            } else {
                String strValueOf = String.valueOf(string);
                xp.u7(strValueOf.length() != 0 ? "Unknown custom asset type: ".concat(strValueOf) : new String("Unknown custom asset type: "));
            }
        }
        cv cvVarJ8 = te.J8(vqVarJ0);
        String string2 = jSONObject.getString("custom_template_id");
        SimpleArrayMap simpleArrayMap3 = new SimpleArrayMap();
        for (int i2 = 0; i2 < simpleArrayMap.size(); i2++) {
            simpleArrayMap3.put(simpleArrayMap.keyAt(i2), ((Future) simpleArrayMap.valueAt(i2)).get());
        }
        return new z0(string2, simpleArrayMap3, simpleArrayMap2, vqVarXL.get(), cvVarJ8 != null ? cvVarJ8.CU() : null, cvVarJ8 != null ? cvVarJ8.getView() : null);
    }
}
