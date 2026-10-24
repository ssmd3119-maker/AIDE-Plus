package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class of implements cf<v0> {
    private final boolean DW;
    private final boolean FH;
    private final boolean j6;

    public of(boolean z, boolean z2, boolean z3) {
        this.j6 = z;
        this.DW = z2;
        this.FH = z3;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final /* synthetic */ j1 j6(te teVar, JSONObject jSONObject) throws JSONException {
        String string;
        List<vq<u0>> listGn = teVar.gn(jSONObject, "images", false, this.j6, this.DW);
        vq<u0> vqVarZo = teVar.Zo(jSONObject, "app_icon", true, this.j6);
        vq<cv> vqVarJ0 = teVar.J0(jSONObject, "video");
        vq<p0> vqVarXL = teVar.XL(jSONObject);
        ArrayList arrayList = new ArrayList();
        Iterator<vq<u0>> it = listGn.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().get());
        }
        cv cvVarJ8 = te.J8(vqVarJ0);
        String string2 = jSONObject.getString("headline");
        if (this.FH) {
            Resources resourcesDW = com.google.android.gms.ads.internal.w0.u7().DW();
            string = resourcesDW != null ? resourcesDW.getString(abcd.mu.s7) : "Test Ad";
            if (string2 != null) {
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(string2).length());
                sb.append(string);
                sb.append(" : ");
                sb.append(string2);
                string2 = sb.toString();
                string = string2;
            }
        } else {
            string = string2;
        }
        return new v0(string, arrayList, jSONObject.getString("body"), vqVarZo.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString("price"), vqVarXL.get(), new Bundle(), cvVarJ8 != null ? cvVarJ8.CU() : null, cvVarJ8 != null ? cvVarJ8.getView() : null, null, null);
    }
}
