package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s1 implements com.google.android.gms.ads.internal.gmsg.b0<Object> {
    private final /* synthetic */ n1 DW;
    private final /* synthetic */ nf j6;

    s1(n1 n1Var, nf nfVar) {
        this.DW = n1Var;
        this.j6 = nfVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.DW.DW);
            this.j6.j6("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            xp.Hw("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
