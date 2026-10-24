package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class au implements com.google.android.gms.ads.internal.gmsg.b0<ss> {
    private boolean j6;

    private static void DW(es esVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                esVar.gW(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                xp.u7(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            esVar.vy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            esVar.P8(Integer.parseInt(str3));
        }
        if (str4 != null) {
            esVar.ei(Integer.parseInt(str4));
        }
    }

    private static int j6(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            cw0.j6();
            return mp.j6(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            xp.u7(sb.toString());
            return i;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(ss ssVar, Map map) throws NumberFormatException {
        int i;
        ss ssVar2 = ssVar;
        String str = (String) map.get("action");
        if (str == null) {
            xp.u7("Action missing from video GMSG.");
            return;
        }
        if (xp.DW(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            xp.VH(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                xp.u7("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                ssVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                xp.u7("Invalid color parameter in video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                xp.u7("No MIME types specified for decoder properties inspection.");
                es.QX(ssVar2, "missingMimeTypes");
                return;
            }
            if (Build.VERSION.SDK_INT < 16) {
                xp.u7("Video decoder properties available on API versions >= 16.");
                es.QX(ssVar2, "deficientApiVersion");
                return;
            }
            HashMap map2 = new HashMap();
            for (String str4 : str3.split(",")) {
                map2.put(str4, kp.DW(str4.trim()));
            }
            es.XL(ssVar2, map2);
            return;
        }
        ks ksVarAX = ssVar2.aX();
        if (ksVarAX == null) {
            xp.u7("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = ssVar2.getContext();
            int iJ6 = j6(context, map, "x", 0);
            int iJ62 = j6(context, map, "y", 0);
            int iJ63 = j6(context, map, "w", -1);
            int iJ64 = j6(context, map, "h", -1);
            int iMin = Math.min(iJ63, ssVar2.IS() - iJ6);
            int iMin2 = Math.min(iJ64, ssVar2.sM() - iJ62);
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused2) {
                i = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ksVarAX.Hw() != null) {
                ksVarAX.v5(iJ6, iJ62, iMin, iMin2);
                return;
            }
            ksVarAX.FH(iJ6, iJ62, iMin, iMin2, i, z, new rs((String) map.get("flags")));
            es esVarHw = ksVarAX.Hw();
            if (esVarHw != null) {
                DW(esVarHw, map);
                return;
            }
            return;
        }
        sv svVarCU = ssVar2.CU();
        if (svVarCU != null) {
            if ("timeupdate".equals(str)) {
                String str5 = (String) map.get("currentTime");
                if (str5 == null) {
                    xp.u7("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                } else {
                    try {
                        svVarCU.nG(Float.parseFloat(str5));
                    } catch (NumberFormatException unused3) {
                        String strValueOf = String.valueOf(str5);
                        xp.u7(strValueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(strValueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    }
                }
            } else if ("skip".equals(str)) {
                svVarCU.UE();
            }
        }
        es esVarHw2 = ksVarAX.Hw();
        if (esVarHw2 == null) {
            es.er(ssVar2);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = ssVar2.getContext();
            int iJ65 = j6(context2, map, "x", 0);
            int iJ66 = j6(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iJ65, iJ66, 0);
            esVarHw2.SI(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str6 = (String) map.get("time");
            if (str6 == null) {
                xp.u7("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                esVarHw2.J0((int) (Float.parseFloat(str6) * 1000.0f));
                return;
            } catch (NumberFormatException unused4) {
                String strValueOf2 = String.valueOf(str6);
                xp.u7(strValueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(strValueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            esVarHw2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            esVarHw2.KD();
            return;
        }
        if ("loadControl".equals(str)) {
            DW(esVarHw2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                esVarHw2.aM();
                return;
            } else {
                esVarHw2.j3();
                return;
            }
        }
        if ("pause".equals(str)) {
            esVarHw2.EQ();
            return;
        }
        if ("play".equals(str)) {
            esVarHw2.we();
            return;
        }
        if ("show".equals(str)) {
            esVarHw2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            esVarHw2.nw((String) map.get("src"));
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = ssVar2.getContext();
            esVarHw2.J8(j6(context3, map, "dx", 0), j6(context3, map, "dy", 0));
            if (this.j6) {
                return;
            }
            ssVar2.AE();
            this.j6 = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                esVarHw2.Mr();
                return;
            } else {
                String strValueOf3 = String.valueOf(str);
                xp.u7(strValueOf3.length() != 0 ? "Unknown video action: ".concat(strValueOf3) : new String("Unknown video action: "));
                return;
            }
        }
        String str7 = (String) map.get("volume");
        if (str7 == null) {
            xp.u7("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            esVarHw2.setVolume(Float.parseFloat(str7));
        } catch (NumberFormatException unused5) {
            String strValueOf4 = String.valueOf(str7);
            xp.u7(strValueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(strValueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
