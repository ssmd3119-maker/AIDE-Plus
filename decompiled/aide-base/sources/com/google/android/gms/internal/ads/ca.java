package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class ca {
    public static List<String> DW(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void FH(Context context, String str, yl ylVar, String str2, boolean z, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str3 = z ? "1" : "0";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strJ6 = j6(j6(j6(j6(j6(j6(j6(it.next(), "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", ylVar.j3.u7), "@gw_sdkver@", str), "@gw_sessid@", cw0.Zo()), "@gw_seqnum@", ylVar.tp), "@gw_adnetstatus@", ylVar.U2);
            t9 t9Var = ylVar.QX;
            if (t9Var != null) {
                strJ6 = j6(j6(strJ6, "@gw_adnetid@", t9Var.DW), "@gw_allocid@", ylVar.QX.Hw);
            }
            String strHw = rl.Hw(strJ6, context, ylVar.vJ);
            com.google.android.gms.ads.internal.w0.v5();
            bn.Mz(context, str, strHw);
        }
    }

    public static void Hw(Context context, String str, List<String> list, String str2, String str3, zzawd zzawdVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strZo = Zo(str2);
        String strZo2 = Zo(str3);
        long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strJ6 = j6(j6(j6(it.next(), "@gw_rwd_userid@", Uri.encode(strZo)), "@gw_rwd_custom_data@", Uri.encode(strZo2)), "@gw_tmstmp@", Long.toString(jJ6));
            if (zzawdVar != null) {
                strJ6 = j6(j6(strJ6, "@gw_rwd_itm@", Uri.encode(zzawdVar.WB)), "@gw_rwd_amt@", Integer.toString(zzawdVar.mb));
            }
            com.google.android.gms.ads.internal.w0.v5();
            bn.Mz(context, str, strJ6);
        }
    }

    private static String Zo(String str) {
        return (TextUtils.isEmpty(str) || !qp.j6()) ? str : "fakeForAdDebugLog";
    }

    private static String j6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static boolean v5(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(strArrSplit[0]);
            iArr[1] = Integer.parseInt(strArrSplit[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
