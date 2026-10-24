package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class e7 {
    public static void DW(d7 d7Var, String str, Map map) {
        try {
            d7Var.j6(str, com.google.android.gms.ads.internal.w0.v5().CU(map));
        } catch (JSONException unused) {
            xp.u7("Could not convert parameters to JSON.");
        }
    }

    public static void FH(d7 d7Var, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        d7Var.we(str, jSONObject.toString());
    }

    public static void Hw(d7 d7Var, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        xp.VH(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        d7Var.DW(sb.toString());
    }

    public static void j6(d7 d7Var, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        d7Var.DW(sb.toString());
    }
}
