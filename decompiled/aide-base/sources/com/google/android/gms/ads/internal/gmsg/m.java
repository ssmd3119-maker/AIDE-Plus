package com.google.android.gms.ads.internal.gmsg;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.au;
import com.google.android.gms.internal.ads.bu;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jw;
import com.google.android.gms.internal.ads.rl;
import com.google.android.gms.internal.ads.ss;
import com.google.android.gms.internal.ads.u6;
import com.google.android.gms.internal.ads.vb0;
import com.google.android.gms.internal.ads.wb0;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zv;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class m {
    public static final b0<cv> j6 = n.j6;
    public static final b0<cv> DW = o.j6;
    public static final b0<cv> FH = p.j6;
    public static final b0<cv> Hw = new s();
    public static final b0<cv> v5 = new t();
    public static final b0<cv> Zo = q.j6;
    public static final b0<Object> VH = new u();
    public static final b0<cv> gn = new v();
    public static final b0<cv> u7 = r.j6;
    public static final b0<cv> tp = new w();
    public static final b0<cv> EQ = new x();
    public static final b0<ss> we = new au();
    public static final b0<ss> J0 = new bu();
    public static final b0<cv> J8 = new l();
    public static final e Ws = new e();
    public static final b0<cv> QX = new y();
    public static final b0<cv> XL = new z();
    public static final b0<cv> aM = new a0();

    static final /* synthetic */ void DW(zv zvVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            xp.u7("URL missing from httpTrack GMSG.");
        } else {
            new ap(zvVar.getContext(), ((iw) zvVar).sy().WB, str).u7();
        }
    }

    static final /* synthetic */ void FH(hw hwVar, Map map) throws NumberFormatException {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            vb0 vb0VarPO = hwVar.pO();
            if (vb0VarPO != null) {
                vb0VarPO.Zo().Hw(i, i2, i3);
            }
        } catch (NumberFormatException unused) {
            xp.u7("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void Hw(zv zvVar, Map map) throws JSONException, URISyntaxException {
        PackageManager packageManager = zvVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        Intent uri = null;
                        if (!TextUtils.isEmpty(strOptString7)) {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                String strValueOf = String.valueOf(strOptString7);
                                xp.Hw(strValueOf.length() != 0 ? "Error parsing the url: ".concat(strValueOf) : new String("Error parsing the url: "), e);
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(strOptString, packageManager.resolveActivity(uri, 65536) != null);
                        } catch (JSONException e2) {
                            xp.Hw("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        xp.Hw("Error parsing the intent data.", e3);
                    }
                }
                ((u6) zvVar).j6("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((u6) zvVar).j6("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((u6) zvVar).j6("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void j6(u6 u6Var, Map map) throws wb0 {
        String str = (String) map.get("u");
        if (str == null) {
            xp.u7("URL missing from click GMSG.");
            return;
        }
        Uri uriDW = Uri.parse(str);
        try {
            vb0 vb0VarPO = ((hw) u6Var).pO();
            if (vb0VarPO != null && vb0VarPO.VH(uriDW)) {
                uriDW = vb0VarPO.DW(uriDW, ((zv) u6Var).getContext(), ((jw) u6Var).getView(), ((zv) u6Var).dx());
            }
        } catch (wb0 unused) {
            String strValueOf = String.valueOf(str);
            xp.u7(strValueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf) : new String("Unable to append parameter to URL: "));
        }
        zv zvVar = (zv) u6Var;
        new ap(zvVar.getContext(), ((iw) u6Var).sy().WB, rl.DW(uriDW, zvVar.getContext())).u7();
    }

    static final /* synthetic */ void v5(zv zvVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            xp.u7("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zvVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                z = false;
            }
            map2.put(str2, Boolean.valueOf(z));
        }
        ((u6) zvVar).v5("openableURLs", map2);
    }
}
