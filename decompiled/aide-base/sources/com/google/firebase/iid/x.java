package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x {
    private static final long Hw = TimeUnit.DAYS.toMillis(7);
    private final String DW;
    private final long FH;
    final String j6;

    private x(String str, String str2, long j) {
        this.j6 = str;
        this.DW = str2;
        this.FH = j;
    }

    static String DW(String str, String str2, long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(AppMeasurement.Param.TIMESTAMP, j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    static x FH(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new x(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new x(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(AppMeasurement.Param.TIMESTAMP));
        } catch (JSONException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    static String j6(x xVar) {
        if (xVar == null) {
            return null;
        }
        return xVar.j6;
    }

    final boolean Hw(String str) {
        return System.currentTimeMillis() > this.FH + Hw || !str.equals(this.DW);
    }
}
