package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o1 implements com.google.android.gms.ads.internal.gmsg.b0<Object> {
    final /* synthetic */ n1 DW;
    private final /* synthetic */ nf j6;

    o1(n1 n1Var, nf nfVar) {
        this.DW = n1Var;
        this.j6 = nfVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, final Map<String, String> map) {
        cv cvVar = (cv) this.DW.j6.get();
        if (cvVar == null) {
            this.j6.g3("/loadHtml", this);
            return;
        }
        kw kwVarAF = cvVar.AF();
        final nf nfVar = this.j6;
        kwVarAF.J8(new lw(this, map, nfVar) { // from class: com.google.android.gms.internal.ads.p1
            private final o1 WB;
            private final nf jw;
            private final Map mb;

            {
                this.WB = this;
                this.mb = map;
                this.jw = nfVar;
            }

            @Override // com.google.android.gms.internal.ads.lw
            public final void j6(boolean z) throws JSONException {
                o1 o1Var = this.WB;
                Map map2 = this.mb;
                nf nfVar2 = this.jw;
                o1Var.DW.DW = (String) map2.get("id");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("messageType", "htmlLoaded");
                    jSONObject.put("id", o1Var.DW.DW);
                    nfVar2.j6("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    xp.Hw("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
        });
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            cvVar.loadData(str, "text/html", "UTF-8");
        } else {
            cvVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
