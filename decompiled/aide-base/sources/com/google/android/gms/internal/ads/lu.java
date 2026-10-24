package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class lu implements com.google.android.gms.ads.internal.gmsg.b0<ss> {
    private static Integer j6(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            xp.u7(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(ss ssVar, Map map) {
        fu fuVarJ6;
        ss ssVar2 = ssVar;
        if (xp.DW(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String strValueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(strValueOf);
            xp.VH(sb.toString());
        }
        com.google.android.gms.ads.internal.w0.vy();
        if (map.containsKey("abort")) {
            if (eu.v5(ssVar2)) {
                return;
            }
            xp.u7("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        if (str == null) {
            cu cuVarVH = eu.VH(ssVar2);
            if (cuVarVH == null) {
                xp.u7("Precache must specify a source.");
                return;
            }
            fuVarJ6 = cuVarVH.qp;
        } else {
            if (eu.VH(ssVar2) != null) {
                xp.u7("Precache task is already running.");
                return;
            }
            if (ssVar2.fY() == null) {
                xp.u7("Precache requires a dependency provider.");
                return;
            }
            rs rsVar = new rs((String) map.get("flags"));
            Integer numJ6 = j6(map, "player");
            if (numJ6 == null) {
                numJ6 = 0;
            }
            fuVarJ6 = ssVar2.fY().j6.j6(ssVar2, numJ6.intValue(), null, rsVar);
            new cu(ssVar2, fuVarJ6, str).VH();
        }
        Integer numJ62 = j6(map, "minBufferMs");
        if (numJ62 != null) {
            fuVarJ6.QX(numJ62.intValue());
        }
        Integer numJ63 = j6(map, "maxBufferMs");
        if (numJ63 != null) {
            fuVarJ6.aM(numJ63.intValue());
        }
        Integer numJ64 = j6(map, "bufferForPlaybackMs");
        if (numJ64 != null) {
            fuVarJ6.j3(numJ64.intValue());
        }
        Integer numJ65 = j6(map, "bufferForPlaybackAfterRebufferMs");
        if (numJ65 != null) {
            fuVarJ6.Mr(numJ65.intValue());
        }
    }
}
