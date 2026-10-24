package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class g0 implements b0<Object> {
    private final HashMap<String, fr<JSONObject>> j6 = new HashMap<>();

    public final void DW(String str) {
        fr<JSONObject> frVar = this.j6.get(str);
        if (frVar == null) {
            xp.j6("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!frVar.isDone()) {
            frVar.cancel(true);
        }
        this.j6.remove(str);
    }

    public final Future<JSONObject> j6(String str) {
        fr<JSONObject> frVar = new fr<>();
        this.j6.put(str, frVar);
        return frVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        xp.VH("Received ad from the cache.");
        fr<JSONObject> frVar = this.j6.get(str);
        try {
            if (frVar == null) {
                xp.j6("Could not find the ad request for the corresponding ad response.");
            } else {
                frVar.FH(new JSONObject(str2));
            }
        } catch (JSONException e) {
            xp.Hw("Failed constructing JSON object from value passed from javascript", e);
            frVar.FH(null);
        } finally {
            this.j6.remove(str);
        }
    }
}
