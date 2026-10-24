package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xf implements com.google.android.gms.ads.internal.gmsg.b0<cv> {
    private final /* synthetic */ fr DW;
    private final /* synthetic */ rf FH;
    private final /* synthetic */ cv j6;

    xf(rf rfVar, cv cvVar, fr frVar) {
        this.FH = rfVar;
        this.j6 = cvVar;
        this.DW = frVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) {
        JSONObject jSONObject;
        boolean z;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str);
                z = true;
            } else {
                jSONObject = new JSONObject(str2);
                z = false;
            }
            if (this.FH.gn.equals(jSONObject.optString("ads_id", ""))) {
                this.j6.g3("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                this.DW.FH(jSONObject2);
            }
        } catch (Throwable th) {
            xp.Hw("Error while preprocessing json.", th);
            this.DW.Hw(th);
        }
    }
}
