package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class ri {
    private String DW;
    private String FH;
    private List<String> Hw;
    private boolean KD;
    private List<String> P8;
    private zzawo SI;
    private String VH;
    private String Zo;
    private String cb;
    private boolean cn;
    private final zzasi dx;
    private boolean ei;
    private List<String> er;
    private zzaso gW;
    private List<String> gn;
    private String j6;
    private zzawd lg;
    private String nw;
    private List<String> rN;
    private boolean ro;
    private boolean sh;
    private List<String> u7;
    private String v5;
    private String vy;
    private List<String> we;
    private long tp = -1;
    private boolean EQ = false;
    private long J0 = -1;
    private int J8 = -1;
    private boolean Ws = false;
    private boolean QX = false;
    private boolean XL = false;
    private boolean aM = true;
    private boolean j3 = true;
    private String Mr = "";
    private boolean U2 = false;
    private boolean a8 = false;
    private boolean yS = false;
    private boolean BT = false;

    public ri(zzasi zzasiVar, String str) {
        this.DW = str;
        this.dx = zzasiVar;
    }

    private static String DW(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static long Hw(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        String str2 = list.get(0);
        try {
            return (long) (Float.parseFloat(str2) * 1000.0f);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
            sb.append("Could not parse float from ");
            sb.append(str);
            sb.append(" header: ");
            sb.append(str2);
            xp.u7(sb.toString());
            return -1L;
        }
    }

    private static boolean Zo(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf(list.get(0)).booleanValue();
    }

    private static List<String> v5(Map<String, List<String>> map, String str) {
        String str2;
        List<String> list = map.get(str);
        if (list == null || list.isEmpty() || (str2 = list.get(0)) == null) {
            return null;
        }
        return Arrays.asList(str2.trim().split("\\s+"));
    }

    public final void FH(String str, Map<String, List<String>> map, String str2) {
        this.FH = str2;
        VH(map);
    }

    public final void VH(Map<String, List<String>> map) {
        this.j6 = DW(map, "X-Afma-Ad-Size");
        this.nw = DW(map, "X-Afma-Ad-Slot-Size");
        List<String> listV5 = v5(map, "X-Afma-Click-Tracking-Urls");
        if (listV5 != null) {
            this.Hw = listV5;
        }
        this.v5 = DW(map, "X-Afma-Debug-Signals");
        List<String> list = map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.Zo = list.get(0);
        }
        List<String> listV52 = v5(map, "X-Afma-Tracking-Urls");
        if (listV52 != null) {
            this.gn = listV52;
        }
        List<String> listV53 = v5(map, "X-Afma-Downloaded-Impression-Urls");
        if (listV53 != null) {
            this.u7 = listV53;
        }
        long jHw = Hw(map, "X-Afma-Interstitial-Timeout");
        if (jHw != -1) {
            this.tp = jHw;
        }
        this.EQ |= Zo(map, "X-Afma-Mediation");
        List<String> listV54 = v5(map, "X-Afma-Manual-Tracking-Urls");
        if (listV54 != null) {
            this.we = listV54;
        }
        long jHw2 = Hw(map, "X-Afma-Refresh-Rate");
        if (jHw2 != -1) {
            this.J0 = jHw2;
        }
        List<String> list2 = map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.J8 = com.google.android.gms.ads.internal.w0.VH().a8();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.J8 = com.google.android.gms.ads.internal.w0.VH().U2();
            }
        }
        this.VH = DW(map, "X-Afma-ActiveView");
        List<String> list3 = map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.XL = Boolean.valueOf(list3.get(0)).booleanValue();
        }
        this.Ws |= Zo(map, "X-Afma-Custom-Rendering-Allowed");
        this.QX = "native".equals(DW(map, "X-Afma-Ad-Format"));
        List<String> list4 = map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.aM = Boolean.valueOf(list4.get(0)).booleanValue();
        }
        List<String> list5 = map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.j3 = Boolean.valueOf(list5.get(0)).booleanValue();
        }
        List<String> list6 = map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.Mr = list6.get(0);
        }
        String strDW = DW(map, "X-Afma-Fluid");
        if (strDW != null && strDW.equals("height")) {
            this.U2 = true;
        }
        this.a8 = "native_express".equals(DW(map, "X-Afma-Ad-Format"));
        this.lg = zzawd.EQ(DW(map, "X-Afma-Rewards"));
        if (this.rN == null) {
            this.rN = v5(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.er == null) {
            this.er = v5(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.yS |= Zo(map, "X-Afma-Use-Displayed-Impression");
        this.BT |= Zo(map, "X-Afma-Auto-Collect-Location");
        this.vy = DW(map, "Set-Cookie");
        String strDW2 = DW(map, "X-Afma-Auto-Protection-Configuration");
        if (strDW2 == null || TextUtils.isEmpty(strDW2)) {
            Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            builderBuildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.Zo)) {
                builderBuildUpon.appendQueryParameter("debugDialog", this.Zo);
            }
            String string = builderBuildUpon.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 31);
            sb.append(string);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.gW = new zzaso(true, Arrays.asList(sb.toString()));
        } else {
            try {
                this.gW = zzaso.gn(new JSONObject(strDW2));
            } catch (JSONException e) {
                xp.v5("Error parsing configuration JSON", e);
                this.gW = new zzaso();
            }
        }
        List<String> listV55 = v5(map, "X-Afma-Remote-Ping-Urls");
        if (listV55 != null) {
            this.P8 = listV55;
        }
        String strDW3 = DW(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(strDW3)) {
            try {
                this.SI = zzawo.gn(new JSONObject(strDW3));
            } catch (JSONException e2) {
                xp.v5("Error parsing safe browsing header", e2);
            }
        }
        this.ei |= Zo(map, "X-Afma-Render-In-Browser");
        String strDW4 = DW(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(strDW4)) {
            try {
                this.KD = new JSONObject(strDW4).getBoolean("never_pool");
            } catch (JSONException e3) {
                xp.v5("Error parsing interstitial pool header", e3);
            }
        }
        this.ro = Zo(map, "X-Afma-Custom-Close-Blocked");
        this.cn = Zo(map, "X-Afma-Enable-Omid");
        this.sh = Zo(map, "X-Afma-Disable-Closable-Area");
        this.cb = DW(map, "X-Afma-Omid-Settings");
    }

    public final zzasm j6(long j, ti tiVar) {
        String str;
        int i;
        zzasi zzasiVar = this.dx;
        String str2 = this.DW;
        String str3 = this.FH;
        List<String> list = this.Hw;
        List<String> list2 = this.gn;
        long j2 = this.tp;
        boolean z = this.EQ;
        List<String> list3 = this.we;
        long j3 = this.J0;
        int i2 = this.J8;
        String str4 = this.j6;
        String str5 = this.Zo;
        String str6 = this.VH;
        boolean z2 = this.Ws;
        boolean z3 = this.QX;
        boolean z4 = this.XL;
        boolean z5 = this.aM;
        String str7 = this.Mr;
        boolean z6 = this.U2;
        boolean z7 = this.a8;
        zzawd zzawdVar = this.lg;
        List<String> list4 = this.rN;
        List<String> list5 = this.er;
        boolean z8 = this.yS;
        zzaso zzasoVar = this.gW;
        boolean z9 = this.BT;
        String str8 = this.vy;
        List<String> list6 = this.P8;
        boolean z10 = this.ei;
        String str9 = this.nw;
        zzawo zzawoVar = this.SI;
        String str10 = this.v5;
        boolean z11 = this.j3;
        boolean z12 = this.KD;
        boolean z13 = this.ro;
        if (tiVar.VH()) {
            str = str4;
            i = 2;
        } else {
            str = str4;
            i = 1;
        }
        return new zzasm(zzasiVar, str2, str3, list, list2, j2, z, -1L, list3, j3, i2, str, j, str5, str6, z2, z3, z4, z5, false, str7, z6, z7, zzawdVar, list4, list5, z8, zzasoVar, z9, str8, list6, z10, str9, zzawoVar, str10, z11, z12, z13, i, this.cn, this.u7, this.sh, this.cb, tiVar.gn(), tiVar.u7());
    }
}
