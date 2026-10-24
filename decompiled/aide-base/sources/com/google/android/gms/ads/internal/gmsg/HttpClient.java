package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.u6;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zm;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@jg
@KeepName
/* loaded from: classes.dex */
public class HttpClient implements b0<u6> {
    private final Context mContext;
    private final zzbbi zzbob;

    @jg
    static class a {
        private final String DW;
        private final String j6;

        public a(String str, String str2) {
            this.j6 = str;
            this.DW = str2;
        }

        public final String DW() {
            return this.DW;
        }

        public final String j6() {
            return this.j6;
        }
    }

    @jg
    static class b {
        private final URL DW;
        private final ArrayList<a> FH;
        private final String Hw;
        private final String j6;

        b(String str, URL url, ArrayList<a> arrayList, String str2) {
            this.j6 = str;
            this.DW = url;
            this.FH = arrayList;
            this.Hw = str2;
        }

        public final URL DW() {
            return this.DW;
        }

        public final ArrayList<a> FH() {
            return this.FH;
        }

        public final String Hw() {
            return this.Hw;
        }

        public final String j6() {
            return this.j6;
        }
    }

    @jg
    class c {
        private final boolean DW;
        private final String FH;
        private final d j6;

        public c(HttpClient httpClient, boolean z, d dVar, String str) {
            this.DW = z;
            this.j6 = dVar;
            this.FH = str;
        }

        public final boolean DW() {
            return this.DW;
        }

        public final d FH() {
            return this.j6;
        }

        public final String j6() {
            return this.FH;
        }
    }

    @jg
    static class d {
        private final int DW;
        private final List<a> FH;
        private final String Hw;
        private final String j6;

        d(String str, int i, List<a> list, String str2) {
            this.j6 = str;
            this.DW = i;
            this.FH = list;
            this.Hw = str2;
        }

        public final int DW() {
            return this.DW;
        }

        public final String FH() {
            return this.j6;
        }

        public final Iterable<a> Hw() {
            return this.FH;
        }

        public final String j6() {
            return this.Hw;
        }
    }

    public HttpClient(Context context, zzbbi zzbbiVar) {
        this.mContext = context;
        this.zzbob = zzbbiVar;
    }

    private static JSONObject zza(d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.FH());
            if (dVar.j6() != null) {
                jSONObject.put("body", dVar.j6());
            }
            JSONArray jSONArray = new JSONArray();
            for (a aVar : dVar.Hw()) {
                jSONArray.put(new JSONObject().put("key", aVar.j6()).put(AppMeasurementSdk.ConditionalUserProperty.VALUE, aVar.DW()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.DW());
        } catch (JSONException e) {
            xp.Hw("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    private static b zzc(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("http_request_id");
        String strOptString2 = jSONObject.optString("url");
        URL url = null;
        String strOptString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(strOptString2);
        } catch (MalformedURLException e) {
            xp.Hw("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("headers");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new a(jSONObjectOptJSONObject.optString("key"), jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE)));
            }
        }
        return new b(strOptString, url, arrayList, strOptString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) throws Throwable {
        JSONObject jSONObject2 = new JSONObject();
        String strOptString = "";
        try {
            strOptString = jSONObject.optString("http_request_id");
            c cVarZza = zza(zzc(jSONObject));
            if (cVarZza.DW()) {
                jSONObject2.put("response", zza(cVarZza.FH()));
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("response", new JSONObject().put("http_request_id", strOptString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", cVarZza.j6());
            }
        } catch (Exception e) {
            xp.Hw("Error executing http request.", e);
            try {
                jSONObject2.put("response", new JSONObject().put("http_request_id", strOptString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", e.toString());
            } catch (JSONException e2) {
                xp.Hw("Error executing http request.", e2);
            }
        }
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.c zza(com.google.android.gms.ads.internal.gmsg.HttpClient.b r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$b):com.google.android.gms.ads.internal.gmsg.HttpClient$c");
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(u6 u6Var, Map map) {
        zm.DW(new c0(this, map, u6Var));
    }
}
