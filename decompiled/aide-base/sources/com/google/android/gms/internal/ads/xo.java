package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class xo {
    public static JSONObject DW(JSONObject jSONObject, String... strArr) {
        int i = 0;
        while (true) {
            if (i >= strArr.length - 1) {
                break;
            }
            if (jSONObject == null) {
                jSONObject = null;
                break;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            i++;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(strArr[strArr.length - 1]);
    }

    public static List<String> j6(JSONArray jSONArray, List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
