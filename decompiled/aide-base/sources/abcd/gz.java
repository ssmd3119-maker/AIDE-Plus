package abcd;

import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gz {
    public long DW;
    public String EQ;
    public String FH;
    public String Hw;
    public long J0;
    public long J8;
    public String VH;
    public String Zo;
    public String gn;
    public jy j6;
    public String tp;
    public String u7;
    public int v5;
    public long we;

    public gz() {
    }

    private JSONObject DW(StackTraceElement stackTraceElement) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("className", stackTraceElement.getClassName());
        jSONObject.put("methodName", stackTraceElement.getMethodName());
        jSONObject.put("fileName", stackTraceElement.getFileName());
        jSONObject.put("line", stackTraceElement.getLineNumber());
        return jSONObject;
    }

    private JSONObject FH(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("exceptionClassName", th.getClass().getName());
        jSONObject.put("message", th.getMessage());
        JSONArray jSONArray = new JSONArray();
        if (th.getStackTrace() != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(DW(stackTraceElement));
            }
        }
        jSONObject.put("stackTrace", jSONArray);
        if (th.getCause() != null) {
            jSONObject.put("cause", FH(th.getCause()));
        }
        return jSONObject;
    }

    private String Hw(ky kyVar) throws JSONException {
        if (kyVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceWidth", kyVar.j6);
        jSONObject.put("deviceHeight", kyVar.DW);
        jSONObject.put("imeHeight", kyVar.FH);
        jSONObject.put("isWatch", kyVar.Hw);
        jSONObject.put("pressedBackKey", kyVar.v5);
        jSONObject.put("pressedKey", kyVar.Zo);
        jSONObject.put("touchX", kyVar.VH);
        jSONObject.put("touchY", kyVar.gn);
        jSONObject.put("touchX2", kyVar.u7);
        jSONObject.put("touchY2", kyVar.tp);
        JSONArray jSONArray = new JSONArray();
        for (ly lyVar : kyVar.EQ) {
            if (lyVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", lyVar.j6);
                jSONObject2.put("y", lyVar.DW);
                jSONObject2.put("width", lyVar.FH);
                jSONObject2.put("height", lyVar.Hw);
                jSONObject2.put("fill", lyVar.v5);
                jSONObject2.put("text", lyVar.Zo);
                jSONObject2.put("textAlignTop", lyVar.VH);
                jSONArray.put(jSONObject2);
            } else {
                jSONArray.put((Object) null);
            }
        }
        jSONObject.put("widgets", jSONArray);
        return jSONObject.toString();
    }

    private String v5(Throwable th, Pair<Throwable, StackTraceElement> pair) throws JSONException {
        if (th == null) {
            return null;
        }
        JSONObject jSONObjectFH = FH(th);
        if (pair != null) {
            jSONObjectFH.putOpt("exceptionRootLocation", DW((StackTraceElement) pair.second));
            jSONObjectFH.putOpt("exceptionRootClassName", ((Throwable) pair.first).getClass().getName());
        }
        return jSONObjectFH.toString();
    }

    public JSONObject j6() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long j = this.DW;
        jSONObject.putOpt("timestampMicros", j == 0 ? null : Long.toString(j));
        jSONObject.putOpt("variantName", this.Hw);
        jSONObject.putOpt("appVersionCode", Integer.valueOf(this.v5));
        jSONObject.putOpt("applicationId", this.FH);
        jSONObject.putOpt("deviceId", this.Zo);
        jSONObject.putOpt("sessionId", this.VH);
        jSONObject.putOpt("eventId", this.gn);
        jSONObject.putOpt("processName", this.tp);
        jSONObject.putOpt("eventName", this.u7);
        jSONObject.putOpt("propertyEventId", this.EQ);
        long j2 = this.we;
        jSONObject.putOpt("propertyEventTimestamp", j2 < 0 ? null : Long.toString(j2));
        long j3 = this.J0;
        jSONObject.putOpt("recordingStartTimestamp", j3 < 0 ? null : Long.toString(j3));
        jSONObject.putOpt("probesTimestamp", Long.toString(this.J8));
        if (!this.j6.DW.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("params", jSONArray);
            for (Map.Entry<String, hz> entry : this.j6.DW.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                hz value = entry.getValue();
                JSONObject jSONObject3 = new JSONObject();
                String str = value.j6;
                if (str != null) {
                    jSONObject3.put("stringValue", str);
                } else {
                    Long l = value.DW;
                    if (l != null) {
                        jSONObject3.put("longValue", l);
                    } else {
                        Double d = value.FH;
                        if (d != null) {
                            jSONObject3.put("doubleValue", d);
                        } else {
                            Boolean bool = value.Hw;
                            if (bool != null) {
                                jSONObject3.put("booleanValue", bool);
                            }
                        }
                    }
                }
                jSONObject2.put("key", entry.getKey());
                jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject3);
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.putOpt("summary", this.j6.j6);
        jSONObject.putOpt("isAudienceProperty", Boolean.valueOf(this.j6.EQ));
        jSONObject.putOpt("isUserAction", Boolean.valueOf(this.j6.FH));
        jSONObject.putOpt("isScreenView", Boolean.valueOf(this.j6.Hw));
        jSONObject.putOpt("isInstall", Boolean.valueOf(this.j6.u7));
        jSONObject.putOpt("isOutcome", Boolean.valueOf(this.j6.tp));
        jy jyVar = this.j6;
        jSONObject.putOpt("revenueMicros", jyVar.v5 != null ? Long.valueOf(jyVar.Zo) : null);
        jSONObject.putOpt("revenueCurrency", this.j6.v5);
        jSONObject.putOpt("isCrash", Boolean.valueOf(this.j6.gn));
        jSONObject.putOpt("isFatalCrash", Boolean.valueOf(this.j6.VH));
        jy jyVar2 = this.j6;
        jSONObject.putOpt("exception", v5(jyVar2.J8, jyVar2.Ws));
        jSONObject.putOpt("uiScene", Hw(this.j6.J0));
        return jSONObject;
    }

    public gz(jy jyVar) {
        this.j6 = jyVar;
    }

    public gz(String str, String str2, jy jyVar, long j, long j2, CharSequence charSequence, int i, CharSequence charSequence2, String str3, String str4, String str5, String str6, long j3, long j4) {
        this.j6 = jyVar;
        this.DW = j;
        this.J8 = j2;
        this.FH = charSequence2.toString();
        this.v5 = i;
        this.Hw = charSequence.toString();
        this.Zo = str3;
        this.VH = str4;
        this.tp = str5;
        this.u7 = str2;
        this.gn = str;
        this.EQ = str6;
        this.we = j3;
        this.J0 = j4;
    }
}
