package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class a implements b0<Object> {
    private final i j6;

    public a(i iVar) {
        this.j6 = iVar;
    }

    private static Bundle j6(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else {
                        String strValueOf = String.valueOf(next);
                        xp.u7(strValueOf.length() != 0 ? "Unsupported type for key:".concat(strValueOf) : new String("Unsupported type for key:"));
                    }
                }
            }
            return bundle;
        } catch (JSONException e) {
            xp.Hw("Failed to convert ad metadata to JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) throws JSONException {
        if (this.j6 == null) {
            return;
        }
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            xp.gn("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleJ6 = j6(map.get("info"));
        if (bundleJ6 == null) {
            xp.j6("Failed to convert ad metadata to Bundle.");
        } else {
            this.j6.HT(str, bundleJ6);
        }
    }
}
