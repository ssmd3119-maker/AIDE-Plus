package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class qi {
    private static List<String> DW(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    public static JSONObject FH(Context context, ji jiVar) {
        HashMap map;
        zzasi zzasiVar;
        Location location;
        zzasi zzasiVar2;
        String strJ6;
        boolean zDW;
        int i;
        int i2;
        zzasi zzasiVar3 = jiVar.u7;
        Location location2 = jiVar.Hw;
        ui uiVar = jiVar.tp;
        Bundle bundle = jiVar.j6;
        JSONObject jSONObject = jiVar.EQ;
        try {
            HashMap map2 = new HashMap();
            map2.put("extra_caps", cw0.v5().FH(p.PT));
            if (jiVar.FH.size() > 0) {
                map2.put("eid", TextUtils.join(",", jiVar.FH));
            }
            if (zzasiVar3.mb != null) {
                map2.put("ad_pos", zzasiVar3.mb);
            }
            zzwb zzwbVar = zzasiVar3.jw;
            nm.j6();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            if (zzwbVar.mb != -1) {
                map = map2;
                map.put("cust_age", simpleDateFormat.format(new Date(zzwbVar.mb)));
            } else {
                map = map2;
            }
            if (zzwbVar.jw != null) {
                map.put("extras", zzwbVar.jw);
            }
            if (zzwbVar.fY != -1) {
                map.put("cust_gender", Integer.valueOf(zzwbVar.fY));
            }
            if (zzwbVar.qp != null) {
                map.put("kw", zzwbVar.qp);
            }
            if (zzwbVar.zh != -1) {
                map.put("tag_for_child_directed_treatment", Integer.valueOf(zzwbVar.zh));
            }
            if (zzwbVar.k2) {
                map.put("test_request", Boolean.TRUE);
            }
            if (zzwbVar.WB >= 2) {
                if (zzwbVar.AL) {
                    map.put("d_imp_hdr", 1);
                }
                if (!TextUtils.isEmpty(zzwbVar.w9)) {
                    map.put("ppid", zzwbVar.w9);
                }
            }
            if (zzwbVar.WB >= 3 && zzwbVar.q7 != null) {
                map.put("url", zzwbVar.q7);
            }
            if (zzwbVar.WB >= 5) {
                if (zzwbVar.n5 != null) {
                    map.put("custom_targeting", zzwbVar.n5);
                }
                if (zzwbVar.Q6 != null) {
                    map.put("category_exclusions", zzwbVar.Q6);
                }
                if (zzwbVar.kf != null) {
                    map.put("request_agent", zzwbVar.kf);
                }
            }
            if (zzwbVar.WB >= 6 && zzwbVar.Jl != null) {
                map.put("request_pkg", zzwbVar.Jl);
            }
            if (zzwbVar.WB >= 7) {
                map.put("is_designed_for_families", Boolean.valueOf(zzwbVar.iW));
            }
            if (zzwbVar.WB >= 8) {
                if (zzwbVar.e3 != -1) {
                    map.put("tag_for_under_age_of_consent", Integer.valueOf(zzwbVar.e3));
                }
                if (zzwbVar.sE != null) {
                    map.put("max_ad_content_rating", zzwbVar.sE);
                }
            }
            if (zzasiVar3.fY.zh != null) {
                zzwf[] zzwfVarArr = zzasiVar3.fY.zh;
                int length = zzwfVarArr.length;
                int i3 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i3 < length) {
                    int i4 = length;
                    zzwf zzwfVar = zzwfVarArr[i3];
                    zzwf[] zzwfVarArr2 = zzwfVarArr;
                    if (!zzwfVar.w9 && !z) {
                        map.put("format", zzwfVar.WB);
                        z = true;
                    }
                    if (zzwfVar.w9 && !z2) {
                        map.put("fluid", "height");
                        z2 = true;
                    }
                    if (z && z2) {
                        break;
                    }
                    i3++;
                    length = i4;
                    zzwfVarArr = zzwfVarArr2;
                }
            } else {
                map.put("format", zzasiVar3.fY.WB);
                if (zzasiVar3.fY.w9) {
                    map.put("fluid", "height");
                }
            }
            if (zzasiVar3.fY.qp == -1) {
                map.put("smart_w", "full");
            }
            if (zzasiVar3.fY.mb == -2) {
                map.put("smart_h", "auto");
            }
            if (zzasiVar3.fY.zh != null) {
                StringBuilder sb = new StringBuilder();
                zzwf[] zzwfVarArr3 = zzasiVar3.fY.zh;
                int length2 = zzwfVarArr3.length;
                boolean z3 = false;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length2;
                    zzwf zzwfVar2 = zzwfVarArr3[i5];
                    zzwf[] zzwfVarArr4 = zzwfVarArr3;
                    if (zzwfVar2.w9) {
                        z3 = true;
                    } else {
                        if (sb.length() != 0) {
                            sb.append("|");
                        }
                        sb.append(zzwfVar2.qp == -1 ? (int) (zzwfVar2.k2 / uiVar.Mr) : zzwfVar2.qp);
                        sb.append("x");
                        sb.append(zzwfVar2.mb == -2 ? (int) (zzwfVar2.jw / uiVar.Mr) : zzwfVar2.mb);
                    }
                    i5++;
                    length2 = i6;
                    zzwfVarArr3 = zzwfVarArr4;
                }
                if (z3) {
                    if (sb.length() != 0) {
                        i2 = 0;
                        sb.insert(0, "|");
                    } else {
                        i2 = 0;
                    }
                    sb.insert(i2, "320x50");
                }
                map.put("sz", sb);
            }
            if (zzasiVar3.Z1 != 0) {
                map.put("native_version", Integer.valueOf(zzasiVar3.Z1));
                map.put("native_templates", zzasiVar3.n5);
                zzacp zzacpVar = zzasiVar3.Gj;
                String str = "any";
                if (zzacpVar != null && (i = zzacpVar.jw) != 0) {
                    str = i != 1 ? i != 2 ? "not_set" : "landscape" : "portrait";
                }
                map.put("native_image_orientation", str);
                zzacp zzacpVar2 = zzasiVar3.Gj;
                map.put("native_multiple_images", Boolean.valueOf(zzacpVar2 != null && zzacpVar2.fY));
                if (!zzasiVar3.Cz.isEmpty()) {
                    map.put("native_custom_templates", zzasiVar3.Cz);
                }
                if (zzasiVar3.WB >= 24) {
                    map.put("max_num_ads", Integer.valueOf(zzasiVar3.b1));
                }
                if (!TextUtils.isEmpty(zzasiVar3.Of)) {
                    try {
                        map.put("native_advanced_settings", new JSONArray(zzasiVar3.Of));
                    } catch (JSONException e) {
                        xp.v5("Problem creating json from native advanced settings", e);
                    }
                }
            }
            if (zzasiVar3.MP != null && zzasiVar3.MP.size() > 0) {
                for (Integer num : zzasiVar3.MP) {
                    if (num.intValue() == 2) {
                        map.put("iba", Boolean.TRUE);
                    } else if (num.intValue() == 1) {
                        map.put("ina", Boolean.TRUE);
                    }
                }
            }
            if (zzasiVar3.fY.hK) {
                map.put("ene", Boolean.TRUE);
            }
            if (zzasiVar3.An != null) {
                map.put("is_icon_ad", Boolean.TRUE);
                map.put("icon_ad_expansion_behavior", Integer.valueOf(zzasiVar3.An.WB));
            }
            if (zzasiVar3.sT != null) {
                zzafz zzafzVar = zzasiVar3.sT;
                int i7 = zzafzVar.WB;
                String str2 = "l";
                if (i7 != 1) {
                    if (i7 != 2) {
                        int i8 = zzafzVar.WB;
                        StringBuilder sb2 = new StringBuilder(52);
                        sb2.append("Instream ad video aspect ratio ");
                        sb2.append(i8);
                        sb2.append(" is wrong.");
                        xp.j6(sb2.toString());
                    } else {
                        str2 = "p";
                    }
                }
                map.put("ia_var", str2);
                map.put("instr", Boolean.TRUE);
            }
            map.put("slotname", zzasiVar3.qp);
            map.put("pn", zzasiVar3.k2.packageName);
            if (zzasiVar3.zh != null) {
                map.put("vc", Integer.valueOf(zzasiVar3.zh.versionCode));
            }
            map.put("ms", jiVar.VH);
            map.put("seq_num", zzasiVar3.w9);
            map.put("session_id", zzasiVar3.hK);
            map.put("js", zzasiVar3.cT.WB);
            Bundle bundle2 = zzasiVar3.AE;
            Bundle bundle3 = jiVar.DW;
            map.put("am", Integer.valueOf(uiVar.j6));
            map.put("cog", v5(uiVar.DW));
            map.put("coh", v5(uiVar.FH));
            if (!TextUtils.isEmpty(uiVar.Hw)) {
                map.put("carrier", uiVar.Hw);
            }
            map.put("gl", uiVar.v5);
            if (uiVar.Zo) {
                map.put("simulator", 1);
            }
            map.put("is_latchsky", Boolean.valueOf(uiVar.VH));
            if (uiVar.gn) {
                map.put("is_sidewinder", 1);
            }
            map.put("ma", v5(uiVar.u7));
            map.put("sp", v5(uiVar.tp));
            map.put("hl", uiVar.EQ);
            if (!TextUtils.isEmpty(uiVar.we)) {
                map.put("mv", uiVar.we);
            }
            map.put("muv", Integer.valueOf(uiVar.J8));
            if (uiVar.Ws != -2) {
                map.put("cnt", Integer.valueOf(uiVar.Ws));
            }
            map.put("gnt", Integer.valueOf(uiVar.QX));
            map.put("pt", Integer.valueOf(uiVar.XL));
            map.put("rm", Integer.valueOf(uiVar.aM));
            map.put("riv", Integer.valueOf(uiVar.j3));
            Bundle bundle4 = new Bundle();
            bundle4.putString("build_build", uiVar.gW);
            bundle4.putString("build_device", uiVar.BT);
            Bundle bundle5 = new Bundle();
            bundle5.putBoolean("is_charging", uiVar.rN);
            bundle5.putDouble("battery_level", uiVar.lg);
            bundle4.putBundle("battery", bundle5);
            Bundle bundle6 = new Bundle();
            bundle6.putInt("active_network_state", uiVar.yS);
            bundle6.putBoolean("active_network_metered", uiVar.er);
            bundle4.putBundle("network", bundle6);
            Bundle bundle7 = new Bundle();
            bundle7.putBoolean("is_browser_custom_tabs_capable", uiVar.vy);
            bundle4.putBundle("browser", bundle7);
            if (bundle2 != null) {
                Bundle bundle8 = new Bundle();
                zzasiVar = zzasiVar3;
                location = location2;
                bundle8.putString("runtime_free", Long.toString(bundle2.getLong("runtime_free_memory", -1L)));
                bundle8.putString("runtime_max", Long.toString(bundle2.getLong("runtime_max_memory", -1L)));
                bundle8.putString("runtime_total", Long.toString(bundle2.getLong("runtime_total_memory", -1L)));
                bundle8.putString("web_view_count", Integer.toString(bundle2.getInt("web_view_count", 0)));
                Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) bundle2.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle8.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle8.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle8.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle8.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle8.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle8.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle8.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle8.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle8.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle4.putBundle("android_mem_info", bundle8);
            } else {
                zzasiVar = zzasiVar3;
                location = location2;
            }
            Bundle bundle9 = new Bundle();
            bundle9.putBundle("parental_controls", bundle3);
            if (!TextUtils.isEmpty(uiVar.J0)) {
                bundle9.putString("package_version", uiVar.J0);
            }
            bundle4.putBundle("play_store", bundle9);
            map.put("device", bundle4);
            Bundle bundle10 = new Bundle();
            bundle10.putString("doritos", jiVar.v5);
            bundle10.putString("doritos_v2", jiVar.Zo);
            if (((Boolean) cw0.v5().FH(p.WB)).booleanValue()) {
                if (jiVar.gn != null) {
                    strJ6 = jiVar.gn.j6();
                    zDW = jiVar.gn.DW();
                } else {
                    strJ6 = null;
                    zDW = false;
                }
                if (TextUtils.isEmpty(strJ6)) {
                    cw0.j6();
                    bundle10.putString("pdid", mp.QX(context));
                    bundle10.putString("pdidtype", "ssaid");
                } else {
                    bundle10.putString("rdid", strJ6);
                    bundle10.putBoolean("is_lat", zDW);
                    bundle10.putString("idtype", "adid");
                }
            }
            map.put("pii", bundle10);
            map.put("platform", Build.MANUFACTURER);
            map.put("submodel", Build.MODEL);
            if (location != null) {
                Hw(map, location);
                zzasiVar2 = zzasiVar;
            } else {
                zzasiVar2 = zzasiVar;
                if (zzasiVar2.jw.WB >= 2 && zzasiVar2.jw.cT != null) {
                    Hw(map, zzasiVar2.jw.cT);
                }
            }
            if (zzasiVar2.WB >= 2) {
                map.put("quality_signals", zzasiVar2.q7);
            }
            if (zzasiVar2.WB >= 4 && zzasiVar2.kf) {
                map.put("forceHttps", Boolean.valueOf(zzasiVar2.kf));
            }
            if (bundle != null) {
                map.put("content_info", bundle);
            }
            if (zzasiVar2.WB >= 5) {
                map.put("u_sd", Float.valueOf(zzasiVar2.eU));
                map.put("sh", Integer.valueOf(zzasiVar2.iW));
                map.put("sw", Integer.valueOf(zzasiVar2.Jl));
            } else {
                map.put("u_sd", Float.valueOf(uiVar.Mr));
                map.put("sh", Integer.valueOf(uiVar.a8));
                map.put("sw", Integer.valueOf(uiVar.U2));
            }
            if (zzasiVar2.WB >= 6) {
                if (!TextUtils.isEmpty(zzasiVar2.e3)) {
                    try {
                        map.put("view_hierarchy", new JSONObject(zzasiVar2.e3));
                    } catch (JSONException e2) {
                        xp.v5("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                map.put("correlation_id", Long.valueOf(zzasiVar2.sE));
            }
            if (zzasiVar2.WB >= 7) {
                map.put("request_id", zzasiVar2.sg);
            }
            if (zzasiVar2.WB >= 12 && !TextUtils.isEmpty(zzasiVar2.oy)) {
                map.put("anchor", zzasiVar2.oy);
            }
            if (zzasiVar2.WB >= 13) {
                map.put("android_app_volume", Float.valueOf(zzasiVar2.aX));
            }
            if (zzasiVar2.WB >= 18) {
                map.put("android_app_muted", Boolean.valueOf(zzasiVar2.IS));
            }
            if (zzasiVar2.WB >= 14 && zzasiVar2.e9 > 0) {
                map.put("target_api", Integer.valueOf(zzasiVar2.e9));
            }
            if (zzasiVar2.WB >= 15) {
                map.put("scroll_index", Integer.valueOf(zzasiVar2.QO == -1 ? -1 : zzasiVar2.QO));
            }
            if (zzasiVar2.WB >= 16) {
                map.put("_activity_context", Boolean.valueOf(zzasiVar2.sM));
            }
            if (zzasiVar2.WB >= 18) {
                if (!TextUtils.isEmpty(zzasiVar2.gG)) {
                    try {
                        map.put("app_settings", new JSONObject(zzasiVar2.gG));
                    } catch (JSONException e3) {
                        xp.v5("Problem creating json from app settings", e3);
                    }
                }
                map.put("render_in_browser", Boolean.valueOf(zzasiVar2.Nh));
            }
            if (zzasiVar2.WB >= 18) {
                map.put("android_num_video_cache_tasks", Integer.valueOf(zzasiVar2.BR));
            }
            zzbbi zzbbiVar = zzasiVar2.cT;
            boolean z4 = zzasiVar2.AR;
            boolean z5 = jiVar.we;
            boolean z6 = zzasiVar2.ct;
            Bundle bundle11 = new Bundle();
            Bundle bundle12 = new Bundle();
            bundle12.putString("cl", "221522000");
            bundle12.putString("rapid_rc", "dev");
            bundle12.putString("rapid_rollup", "HEAD");
            bundle11.putBundle("build_meta", bundle12);
            bundle11.putString("mf", Boolean.toString(((Boolean) cw0.v5().FH(p.AR)).booleanValue()));
            bundle11.putBoolean("instant_app", z4);
            bundle11.putBoolean("lite", zzbbiVar.qp);
            bundle11.putBoolean("local_service", z5);
            bundle11.putBoolean("is_privileged_process", z6);
            bundle11.putInt("container_version", 12451009);
            map.put("sdk_env", bundle11);
            map.put("cache_state", jSONObject);
            if (zzasiVar2.WB >= 19) {
                map.put("gct", zzasiVar2.Za);
            }
            if (zzasiVar2.WB >= 21 && zzasiVar2.Pa) {
                map.put("de", "1");
            }
            if (((Boolean) cw0.v5().FH(p.zh)).booleanValue()) {
                String str3 = zzasiVar2.fY.WB;
                boolean z7 = str3.equals("interstitial_mb") || str3.equals("reward_mb");
                Bundle bundle13 = zzasiVar2.ce;
                boolean z8 = bundle13 != null;
                if (z7 && z8) {
                    Bundle bundle14 = new Bundle();
                    bundle14.putBundle("interstitial_pool", bundle13);
                    map.put("counters", bundle14);
                }
            }
            if (zzasiVar2.Jm != null) {
                map.put("gmp_app_id", zzasiVar2.Jm);
            }
            if (zzasiVar2.Bx == null) {
                map.put("fbs_aiid", "");
            } else if ("TIME_OUT".equals(zzasiVar2.Bx)) {
                map.put("sai_timeout", cw0.v5().FH(p.XG));
            } else {
                map.put("fbs_aiid", zzasiVar2.Bx);
            }
            if (zzasiVar2.oa != null) {
                map.put("fbs_aeid", zzasiVar2.oa);
            }
            if (zzasiVar2.E4 != null) {
                map.put("apm_id_origin", zzasiVar2.E4);
            }
            if (zzasiVar2.WB >= 24) {
                map.put("disable_ml", Boolean.valueOf(zzasiVar2.TI));
            }
            String str4 = (String) cw0.v5().FH(p.P8);
            if (str4 != null && !str4.isEmpty()) {
                if (Build.VERSION.SDK_INT >= ((Integer) cw0.v5().FH(p.ei)).intValue()) {
                    HashMap map3 = new HashMap();
                    for (String str5 : str4.split(",")) {
                        map3.put(str5, kp.DW(str5));
                    }
                    map.put("video_decoders", map3);
                }
            }
            if (((Boolean) cw0.v5().FH(p.gy)).booleanValue()) {
                map.put("omid_v", com.google.android.gms.ads.internal.w0.a8().j6(context));
            }
            if (zzasiVar2.Fd != null && !zzasiVar2.Fd.isEmpty()) {
                map.put("android_permissions", zzasiVar2.Fd);
            }
            if (zzasiVar2.Lz != null) {
                map.put("consent_string", zzasiVar2.Lz);
            }
            if (zzasiVar2.Lz != null) {
                map.put("iab_consent_info", zzasiVar2.xg);
            }
            if (xp.DW(2)) {
                String strValueOf = String.valueOf(com.google.android.gms.ads.internal.w0.v5().CU(map).toString(2));
                sm.we(strValueOf.length() != 0 ? "Ad Request JSON: ".concat(strValueOf) : new String("Ad Request JSON: "));
            }
            return com.google.android.gms.ads.internal.w0.v5().CU(map);
        } catch (JSONException e4) {
            String strValueOf2 = String.valueOf(e4.getMessage());
            xp.u7(strValueOf2.length() != 0 ? "Problem serializing ad request to JSON: ".concat(strValueOf2) : new String("Problem serializing ad request to JSON: "));
            return null;
        }
    }

    private static void Hw(HashMap<String, Object> map, Location location) {
        HashMap map2 = new HashMap();
        Float fValueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long lValueOf = Long.valueOf(location.getTime() * 1000);
        Long lValueOf2 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long lValueOf3 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        map2.put("radius", fValueOf);
        map2.put("lat", lValueOf2);
        map2.put("long", lValueOf3);
        map2.put("time", lValueOf);
        map.put("uule", map2);
    }

    private static JSONArray VH(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static JSONObject Zo(zzasm zzasmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = zzasmVar.jw;
        if (str != null) {
            jSONObject.put("ad_base_url", str);
        }
        String str2 = zzasmVar.n5;
        if (str2 != null) {
            jSONObject.put("ad_size", str2);
        }
        jSONObject.put("native", zzasmVar.sE);
        if (zzasmVar.sE) {
            jSONObject.put("ad_json", zzasmVar.fY);
        } else {
            jSONObject.put("ad_html", zzasmVar.fY);
        }
        String str3 = zzasmVar.kf;
        if (str3 != null) {
            jSONObject.put("debug_dialog", str3);
        }
        String str4 = zzasmVar.An;
        if (str4 != null) {
            jSONObject.put("debug_signals", str4);
        }
        long j = zzasmVar.AL;
        if (j != -1) {
            double d = j;
            Double.isNaN(d);
            jSONObject.put("interstitial_timeout", d / 1000.0d);
        }
        if (zzasmVar.Z1 == com.google.android.gms.ads.internal.w0.VH().a8()) {
            jSONObject.put("orientation", "portrait");
        } else if (zzasmVar.Z1 == com.google.android.gms.ads.internal.w0.VH().U2()) {
            jSONObject.put("orientation", "landscape");
        }
        List<String> list = zzasmVar.qp;
        if (list != null) {
            jSONObject.put("click_urls", VH(list));
        }
        List<String> list2 = zzasmVar.zh;
        if (list2 != null) {
            jSONObject.put("impression_urls", VH(list2));
        }
        List<String> list3 = zzasmVar.MP;
        if (list3 != null) {
            jSONObject.put("downloaded_impression_urls", VH(list3));
        }
        List<String> list4 = zzasmVar.cT;
        if (list4 != null) {
            jSONObject.put("manual_impression_urls", VH(list4));
        }
        String str5 = zzasmVar.eU;
        if (str5 != null) {
            jSONObject.put("active_view", str5);
        }
        jSONObject.put("ad_is_javascript", zzasmVar.Jl);
        String str6 = zzasmVar.iW;
        if (str6 != null) {
            jSONObject.put("ad_passback_url", str6);
        }
        jSONObject.put("mediation", zzasmVar.w9);
        jSONObject.put("custom_render_allowed", zzasmVar.e3);
        jSONObject.put("content_url_opted_out", zzasmVar.pO);
        jSONObject.put("content_vertical_opted_out", zzasmVar.Pa);
        jSONObject.put("prefetch", zzasmVar.fN);
        long j2 = zzasmVar.q7;
        if (j2 != -1) {
            jSONObject.put("refresh_interval_milliseconds", j2);
        }
        long j3 = zzasmVar.hK;
        if (j3 != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", j3);
        }
        if (!TextUtils.isEmpty(zzasmVar.pN)) {
            jSONObject.put("gws_query_id", zzasmVar.pN);
        }
        jSONObject.put("fluid", zzasmVar.oy ? "height" : "");
        jSONObject.put("native_express", zzasmVar.aX);
        List<String> list5 = zzasmVar.QO;
        if (list5 != null) {
            jSONObject.put("video_start_urls", VH(list5));
        }
        List<String> list6 = zzasmVar.sM;
        if (list6 != null) {
            jSONObject.put("video_complete_urls", VH(list6));
        }
        zzawd zzawdVar = zzasmVar.e9;
        if (zzawdVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rb_type", zzawdVar.WB);
            jSONObject2.put("rb_amount", zzawdVar.mb);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("rewards", jSONArray);
        }
        jSONObject.put("use_displayed_impression", zzasmVar.a5);
        jSONObject.put("auto_protection_configuration", zzasmVar.ys);
        jSONObject.put("render_in_browser", zzasmVar.BR);
        jSONObject.put("disable_closable_area", zzasmVar.Of);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[Catch: JSONException -> 0x0295, TryCatch #0 {JSONException -> 0x0295, blocks: (B:3:0x0007, B:5:0x0029, B:9:0x0032, B:11:0x003a, B:13:0x0042, B:15:0x004a, B:17:0x0052, B:18:0x0056, B:20:0x006a, B:22:0x007b, B:24:0x008a, B:30:0x00a8, B:32:0x00ae, B:34:0x00b4, B:38:0x00e1, B:40:0x00e7, B:45:0x00f5, B:46:0x00fa, B:51:0x0108, B:52:0x010d, B:57:0x011b, B:59:0x0124, B:64:0x0132, B:67:0x013d, B:69:0x0141, B:70:0x0145, B:72:0x014d, B:74:0x0153, B:76:0x0161, B:78:0x016c, B:80:0x022b, B:84:0x0238, B:62:0x012e, B:55:0x0117, B:49:0x0104, B:43:0x00f1, B:26:0x0095, B:28:0x009d), top: B:93:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[Catch: JSONException -> 0x0295, TryCatch #0 {JSONException -> 0x0295, blocks: (B:3:0x0007, B:5:0x0029, B:9:0x0032, B:11:0x003a, B:13:0x0042, B:15:0x004a, B:17:0x0052, B:18:0x0056, B:20:0x006a, B:22:0x007b, B:24:0x008a, B:30:0x00a8, B:32:0x00ae, B:34:0x00b4, B:38:0x00e1, B:40:0x00e7, B:45:0x00f5, B:46:0x00fa, B:51:0x0108, B:52:0x010d, B:57:0x011b, B:59:0x0124, B:64:0x0132, B:67:0x013d, B:69:0x0141, B:70:0x0145, B:72:0x014d, B:74:0x0153, B:76:0x0161, B:78:0x016c, B:80:0x022b, B:84:0x0238, B:62:0x012e, B:55:0x0117, B:49:0x0104, B:43:0x00f1, B:26:0x0095, B:28:0x009d), top: B:93:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151 A[PHI: r18
      0x0151: PHI (r18v2 int) = (r18v1 int), (r18v4 int) binds: [B:66:0x013b, B:71:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzasm j6(android.content.Context r57, com.google.android.gms.internal.ads.zzasi r58, java.lang.String r59) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qi.j6(android.content.Context, com.google.android.gms.internal.ads.zzasi, java.lang.String):com.google.android.gms.internal.ads.zzasm");
    }

    private static Integer v5(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }
}
