package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@jg
/* loaded from: classes.dex */
public final class qp {
    private static boolean FH;
    private static boolean Hw;
    private final List<String> j6;
    private static Object DW = new Object();
    private static com.google.android.gms.common.util.e v5 = com.google.android.gms.common.util.h.Hw();
    private static final Set<String> Zo = new HashSet(Arrays.asList(new String[0]));

    public qp() {
        this(null);
    }

    static final /* synthetic */ void DW(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        FH(jsonWriter, map);
        jsonWriter.endObject();
    }

    static final /* synthetic */ void EQ(byte[] bArr, JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String strJ6 = com.google.android.gms.common.util.c.j6(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(strJ6);
        } else {
            String strLg = mp.lg(strJ6);
            if (strLg != null) {
                jsonWriter.name("bodydigest").value(strLg);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    private static void FH(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!Zo.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        xp.j6("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                    jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(key);
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    static final /* synthetic */ void Hw(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public static boolean J0() {
        boolean z;
        synchronized (DW) {
            z = FH;
        }
        return z;
    }

    public static void J8(boolean z) {
        synchronized (DW) {
            FH = true;
            Hw = z;
        }
    }

    private static synchronized void Mr(String str) {
        xp.gn("GMA Debug BEGIN");
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 4000;
            String strValueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
            xp.gn(strValueOf.length() != 0 ? "GMA Debug CONTENT ".concat(strValueOf) : new String("GMA Debug CONTENT "));
            i = i2;
        }
        xp.gn("GMA Debug FINISH");
    }

    private final void QX(final Map<String, ?> map, final int i) throws IOException {
        v5("onNetworkResponse", new wp(i, map) { // from class: com.google.android.gms.internal.ads.sp
            private final Map DW;
            private final int j6;

            {
                this.j6 = i;
                this.DW = map;
            }

            @Override // com.google.android.gms.internal.ads.wp
            public final void j6(JsonWriter jsonWriter) throws IOException {
                qp.DW(this.j6, this.DW, jsonWriter);
            }
        });
    }

    static final /* synthetic */ void VH(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        FH(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.c.j6(bArr));
        }
        jsonWriter.endObject();
    }

    private final void Ws(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) throws IOException {
        v5("onNetworkRequest", new wp(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.rp
            private final String DW;
            private final Map FH;
            private final byte[] Hw;
            private final String j6;

            {
                this.j6 = str;
                this.DW = str2;
                this.FH = map;
                this.Hw = bArr;
            }

            @Override // com.google.android.gms.internal.ads.wp
            public final void j6(JsonWriter jsonWriter) throws IOException {
                qp.VH(this.j6, this.DW, this.FH, this.Hw, jsonWriter);
            }
        });
    }

    public static boolean XL(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) cw0.v5().FH(p.sE)).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            xp.v5("Fail to determine debug setting.", e);
            return false;
        }
    }

    private final void j3(final String str) throws IOException {
        v5("onNetworkRequestError", new wp(str) { // from class: com.google.android.gms.internal.ads.vp
            private final String j6;

            {
                this.j6 = str;
            }

            @Override // com.google.android.gms.internal.ads.wp
            public final void j6(JsonWriter jsonWriter) throws IOException {
                qp.Hw(this.j6, jsonWriter);
            }
        });
    }

    public static boolean j6() {
        boolean z;
        synchronized (DW) {
            z = FH && Hw;
        }
        return z;
    }

    private final void v5(String str, wp wpVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(AppMeasurement.Param.TIMESTAMP).value(v5.j6());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.j6.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            wpVar.j6(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            xp.Hw("unable to log", e);
        }
        Mr(stringWriter.toString());
    }

    public static void we() {
        synchronized (DW) {
            FH = false;
            Hw = false;
            xp.u7("Ad debug logging enablement is out of date.");
        }
    }

    public final void U2(final byte[] bArr) throws IOException {
        v5("onNetworkResponseBody", new wp(bArr) { // from class: com.google.android.gms.internal.ads.up
            private final byte[] j6;

            {
                this.j6 = bArr;
            }

            @Override // com.google.android.gms.internal.ads.wp
            public final void j6(JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
                qp.EQ(this.j6, jsonWriter);
            }
        });
    }

    public final void Zo(String str, String str2, Map<String, ?> map, byte[] bArr) throws IOException {
        if (j6()) {
            Ws(str, str2, map, bArr);
        }
    }

    public final void aM(String str) throws IOException {
        if (j6() && str != null) {
            U2(str.getBytes());
        }
    }

    public final void gn(HttpURLConnection httpURLConnection, int i) {
        if (j6()) {
            String responseMessage = null;
            QX(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String strValueOf = String.valueOf(e.getMessage());
                    xp.u7(strValueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(strValueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                j3(responseMessage);
            }
        }
    }

    public final void tp(Map<String, ?> map, int i) throws IOException {
        if (j6()) {
            QX(map, i);
            if (i < 200 || i >= 300) {
                j3(null);
            }
        }
    }

    public final void u7(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (j6()) {
            Ws(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public qp(String str) {
        List<String> listAsList;
        if (j6()) {
            String string = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String strValueOf = String.valueOf(string);
                strArr[0] = strValueOf.length() != 0 ? "network_request_".concat(strValueOf) : new String("network_request_");
                listAsList = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String strValueOf2 = String.valueOf(str);
                strArr2[0] = strValueOf2.length() != 0 ? "ad_request_".concat(strValueOf2) : new String("ad_request_");
                String strValueOf3 = String.valueOf(string);
                strArr2[1] = strValueOf3.length() != 0 ? "network_request_".concat(strValueOf3) : new String("network_request_");
                listAsList = Arrays.asList(strArr2);
            }
        } else {
            listAsList = new ArrayList<>();
        }
        this.j6 = listAsList;
    }
}
