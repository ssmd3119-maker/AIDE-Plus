package com.aide.ui;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.aide.codemodel.language.java.JavaFormatOption;
import com.aide.codemodel.language.js.JavaScriptFormatterOption;
import com.aide.common.AndroidHelper;
import com.aide.ui.util.FileSystem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@cy(clazz = 480679063369465845L, container = 480679063369465845L, user = true)
/* loaded from: classes.dex */
public class AppPreferences {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 3417054187342388200L)
    private static Context j6;

    static {
        iy.Zo(AppPreferences.class);
    }

    @ey(method = 340362443967218884L)
    public AppPreferences() {
        try {
            if (DW) {
                iy.gn(-3306790757542697732L, null);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3306790757542697732L, null);
            }
            throw th;
        }
    }

    @ey(method = -1869347681092417419L)
    public static boolean BT() {
        try {
            if (DW) {
                iy.gn(-1866735274213651336L, null);
            }
            if (ServiceContainer.isTrainerMode()) {
                return true;
            }
            return XL().getBoolean("light_theme", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -1866735274213651336L, null);
            }
            throw th;
        }
    }

    @ey(method = 428882227489321760L)
    public static boolean DW() {
        try {
            if (DW) {
                iy.gn(-3777844239107300655L, null);
            }
            return XL().getBoolean("complete_after_letter", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3777844239107300655L, null);
            }
            throw th;
        }
    }

    @ey(method = -2848717320906728661L)
    public static int EQ() {
        try {
            if (DW) {
                iy.gn(-2718147785048677520L, null);
            }
            try {
                return Integer.parseInt(XL().getString("editor_font_size", ""));
            } catch (NumberFormatException unused) {
                return tp(j6);
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -2718147785048677520L, null);
            }
            throw th;
        }
    }

    @ey(method = 7159417927607222272L)
    public static boolean FH() {
        try {
            if (DW) {
                iy.gn(6979242308255709779L, null);
            }
            return XL().getBoolean("complete_all_types", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 6979242308255709779L, null);
            }
            throw th;
        }
    }

    @ey(method = -5179756731701274975L)
    public static int Hw() {
        try {
            if (DW) {
                iy.gn(4401739661892457984L, null);
            }
            if (ServiceContainer.isTrainerMode()) {
                return 5;
            }
            try {
                return Integer.parseInt(XL().getString("autosafe_time", "-1"));
            } catch (NumberFormatException unused) {
                return -1;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 4401739661892457984L, null);
            }
            throw th;
        }
    }

    @ey(method = -4729359459734883960L)
    public static void I(String str) {
        try {
            if (DW) {
                iy.tp(-3023428463941171305L, null, str);
            }
            SharedPreferences.Editor editorEdit = XL().edit();
            editorEdit.putString("user_keystore", str);
            editorEdit.commit();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -3023428463941171305L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -673513822968029277L)
    public static boolean J0() {
        try {
            if (DW) {
                iy.gn(-179801648103059120L, null);
            }
            return XL().getBoolean("optimze_dex", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -179801648103059120L, null);
            }
            throw th;
        }
    }

    @ey(method = -4706691925374527025L)
    public static boolean J8() {
        try {
            if (DW) {
                iy.gn(1929840242518963776L, null);
            }
            return XL().getBoolean("trainer_sound", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1929840242518963776L, null);
            }
            throw th;
        }
    }

    @ey(method = 1060937947407885945L)
    public static String KD() {
        try {
            if (DW) {
                iy.gn(1847300521903980000L, null);
            }
            return XL().getString("local_doc_dir_path", null);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 1847300521903980000L, null);
            }
            throw th;
        }
    }

    @ey(method = 1985822474814128761L)
    public static boolean Mr() {
        try {
            if (DW) {
                iy.gn(-430656149389117224L, null);
            }
            return XL().getBoolean("git_keep_ssh_session_info", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -430656149389117224L, null);
            }
            throw th;
        }
    }

    @ey(method = 3179138770964900268L)
    public static void Mz(String str) {
        try {
            if (DW) {
                iy.tp(2018674844428176585L, null, str);
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(j6);
            SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
            Set<String> stringSet = defaultSharedPreferences.getStringSet("intel_libs_warned_projects", new HashSet());
            stringSet.add(str);
            editorEdit.putStringSet("intel_libs_warned_projects", stringSet);
            editorEdit.commit();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 2018674844428176585L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 4233882768948200355L)
    public static String OW() {
        try {
            if (DW) {
                iy.gn(-385192645559649280L, null);
            }
            return XL().getBoolean("use_user_keystore", false) ? XL().getString("user_keystore", "").trim() : "";
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -385192645559649280L, null);
            }
            throw th;
        }
    }

    @ey(method = 597768083889163492L)
    public static int P8() {
        try {
            if (DW) {
                iy.gn(-2237108322076730267L, null);
            }
            try {
                return Integer.parseInt(XL().getString("java_indentation_size", "4"));
            } catch (NumberFormatException unused) {
                return 4;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -2237108322076730267L, null);
            }
            throw th;
        }
    }

    @ey(method = -6027112760048198939L)
    public static boolean QX() {
        try {
            if (DW) {
                iy.gn(2173117525636686720L, null);
            }
            return XL().getBoolean("force_soft_keyboard", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 2173117525636686720L, null);
            }
            throw th;
        }
    }

    @ey(method = -4956669460071810768L)
    public static boolean Qq() {
        try {
            if (DW) {
                iy.gn(-4503613780028743347L, null);
            }
            return XL().getBoolean("editor_tabs", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -4503613780028743347L, null);
            }
            throw th;
        }
    }

    @ey(method = 3633551816970084768L)
    public static String SI() {
        try {
            if (DW) {
                iy.gn(940932671106983727L, null);
            }
            return XL().getString("app_language", "default");
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 940932671106983727L, null);
            }
            throw th;
        }
    }

    @ey(method = -7267651012245310173L)
    public static void Sf(String str, List<String> list) {
        try {
            if (DW) {
                iy.EQ(-301007177741209940L, null, str, list);
            }
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(j6).edit();
            if ("Java".equals(str)) {
                for (JavaFormatOption javaFormatOption : JavaFormatOption.values()) {
                    editorEdit.putBoolean(javaFormatOption.FH(), list.contains(javaFormatOption.getName()));
                }
            }
            if ("JavaScript".equals(str)) {
                for (JavaScriptFormatterOption javaScriptFormatterOption : JavaScriptFormatterOption.values()) {
                    editorEdit.putBoolean(javaScriptFormatterOption.FH(), list.contains(javaScriptFormatterOption.getName()));
                }
            }
            editorEdit.commit();
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -301007177741209940L, null, str, list);
            }
            throw th;
        }
    }

    @ey(method = 676518350690139307L)
    public static String U2() {
        try {
            if (DW) {
                iy.gn(254784319546006012L, null);
            }
            return XL().getString("git_user_email", "");
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 254784319546006012L, null);
            }
            throw th;
        }
    }

    @ey(method = -1066608141141005181L)
    public static int VH() {
        try {
            if (DW) {
                iy.gn(5107163184652813356L, null);
            }
            try {
                return Integer.parseInt(XL().getString("cpp_indentation_size", "4"));
            } catch (NumberFormatException unused) {
                return 4;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 5107163184652813356L, null);
            }
            throw th;
        }
    }

    @ey(method = -4393246167342375360L)
    public static boolean Ws() {
        try {
            if (DW) {
                iy.gn(2196232330926342261L, null);
            }
            return XL().getBoolean("trainer_voice", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 2196232330926342261L, null);
            }
            throw th;
        }
    }

    @ey(method = 5534343383408724303L)
    private static SharedPreferences XL() {
        try {
            if (DW) {
                iy.gn(467253668715616776L, null);
            }
            return aM(j6);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 467253668715616776L, null);
            }
            throw th;
        }
    }

    @ey(method = 3753192514202800245L)
    public static int XX() {
        try {
            if (DW) {
                iy.gn(-4297796710664064520L, null);
            }
            try {
                return Integer.parseInt(XL().getString("xml_indentation_size", "4"));
            } catch (NumberFormatException unused) {
                return 4;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -4297796710664064520L, null);
            }
            throw th;
        }
    }

    @ey(method = 7859192512368425413L)
    public static Map<String, List<String>> Zo() {
        try {
            if (DW) {
                iy.gn(7588154889979986512L, null);
            }
            HashMap map = new HashMap();
            map.put("Java", vy());
            map.put("JavaScript", ei());
            return map;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 7588154889979986512L, null);
            }
            throw th;
        }
    }

    @ey(method = 3949889118447329640L)
    public static String a8() {
        try {
            if (DW) {
                iy.gn(-246558571514946033L, null);
            }
            return XL().getString("git_user_name", "");
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -246558571514946033L, null);
            }
            throw th;
        }
    }

    @ey(method = 534994003005623856L)
    private static SharedPreferences aM(Context context) {
        try {
            if (DW) {
                iy.tp(52723629260042395L, null, context);
            }
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 52723629260042395L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 1343392937639170125L)
    public static void aj(Context context, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            if (DW) {
                iy.EQ(-2237353505197559952L, null, context, onSharedPreferenceChangeListener);
            }
            aM(j6).unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, -2237353505197559952L, null, context, onSharedPreferenceChangeListener);
            }
            throw th;
        }
    }

    @ey(method = -7822679433083749888L)
    public static String br() {
        try {
            if (DW) {
                iy.gn(-6116185992377498525L, null);
            }
            return XL().getString("user_m2repositories", "");
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -6116185992377498525L, null);
            }
            throw th;
        }
    }

    @ey(method = 254548155915934735L)
    public static void ca(String str) {
        try {
            if (DW) {
                iy.tp(-1554192697156476832L, null, str);
            }
            SharedPreferences.Editor editorEdit = XL().edit();
            editorEdit.putString("local_doc_dir_path", str);
            editorEdit.commit();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -1554192697156476832L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 291914403522131588L)
    public static void cb(Context context, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            if (DW) {
                iy.EQ(149547865968935471L, null, context, onSharedPreferenceChangeListener);
            }
            aM(j6).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 149547865968935471L, null, context, onSharedPreferenceChangeListener);
            }
            throw th;
        }
    }

    @ey(method = -4353442362637104360L)
    public static int cn() {
        try {
            if (DW) {
                iy.gn(-3085243704335756051L, null);
            }
            try {
                return Integer.parseInt(XL().getString("max_single_imports", "0"));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3085243704335756051L, null);
            }
            throw th;
        }
    }

    @ey(method = 1598417589753622215L)
    public static boolean dx() {
        try {
            if (DW) {
                iy.gn(-1043557988735804048L, null);
            }
            return XL().getBoolean("run_as_root", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -1043557988735804048L, null);
            }
            throw th;
        }
    }

    @ey(method = -6089072766143038245L)
    public static boolean ef(Context context) {
        try {
            if (DW) {
                iy.tp(-5239206207633216000L, null, context);
            }
            return aM(context).getBoolean("send_analytics_data", true);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -5239206207633216000L, null, context);
            }
            throw th;
        }
    }

    @ey(method = -2872068297637142460L)
    public static List<String> ei() {
        try {
            if (DW) {
                iy.gn(-1201739983827008737L, null);
            }
            ArrayList arrayList = new ArrayList();
            for (JavaScriptFormatterOption javaScriptFormatterOption : JavaScriptFormatterOption.values()) {
                if (XL().getBoolean(javaScriptFormatterOption.FH(), false)) {
                    arrayList.add(javaScriptFormatterOption.name());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -1201739983827008737L, null);
            }
            throw th;
        }
    }

    @ey(method = 555124338130667325L)
    public static Map<String, Integer> er() {
        try {
            if (DW) {
                iy.gn(-3530845519441695840L, null);
            }
            HashMap map = new HashMap();
            map.put("Java", Integer.valueOf(P8()));
            map.put("JavaScript", Integer.valueOf(nw()));
            map.put("XML", Integer.valueOf(XX()));
            map.put("HTML", Integer.valueOf(rN()));
            return map;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3530845519441695840L, null);
            }
            throw th;
        }
    }

    @ey(method = -494093938830497175L)
    public static void g3(boolean z) {
        try {
            if (DW) {
                iy.Ws(-1566447609235003872L, null, z);
            }
            SharedPreferences.Editor editorEdit = XL().edit();
            editorEdit.putBoolean("trainer_voice", z);
            editorEdit.commit();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -1566447609235003872L, null, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -6522204248409605196L)
    public static boolean gW() {
        try {
            if (DW) {
                iy.gn(378799975405072375L, null);
            }
            return XL().getBoolean("use_spaces_for_tabs", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 378799975405072375L, null);
            }
            throw th;
        }
    }

    @ey(method = -6494375844498834695L)
    public static String getUserAndroidJar() {
        try {
            if (DW) {
                iy.gn(394558037932236720L, null);
            }
            return XL().getString("user_androidjar", "");
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 394558037932236720L, null);
            }
            throw th;
        }
    }

    @ey(method = -617091160571535077L)
    public static boolean gn() {
        try {
            if (DW) {
                iy.gn(-141058983325704852L, null);
            }
            return XL().getBoolean("git_create_for_projects", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -141058983325704852L, null);
            }
            throw th;
        }
    }

    @ey(method = -5269092590449458848L)
    public static String j3() {
        try {
            if (DW) {
                iy.gn(4263462807678454935L, null);
            }
            return XL().getString("git_dot_ssh_dir", "");
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 4263462807678454935L, null);
            }
            throw th;
        }
    }

    @ey(method = -4554798246842927111L)
    public static boolean j6() {
        try {
            if (DW) {
                iy.gn(-3261086782531761064L, null);
            }
            return XL().getBoolean("complete_after_dot", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3261086782531761064L, null);
            }
            throw th;
        }
    }

    @ey(method = 444583545111537236L)
    public static boolean lg(String str) {
        try {
            if (DW) {
                iy.tp(385582699326382839L, null, str);
            }
            return XL().getStringSet("intel_libs_warned_projects", Collections.emptySet()).contains(str);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 385582699326382839L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 1096530238425105963L)
    public static int nw() {
        try {
            if (DW) {
                iy.gn(-658339769779281096L, null);
            }
            try {
                return Integer.parseInt(XL().getString("js_indentation_size", "4"));
            } catch (NumberFormatException unused) {
                return 4;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -658339769779281096L, null);
            }
            throw th;
        }
    }

    @ey(method = 766538080620244935L)
    public static int rN() {
        try {
            if (DW) {
                iy.gn(-2107437416648218704L, null);
            }
            try {
                return Integer.parseInt(XL().getString("html_indentation_size", "2"));
            } catch (NumberFormatException unused) {
                return 2;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -2107437416648218704L, null);
            }
            throw th;
        }
    }

    @ey(method = 4783745944755911996L)
    public static int ro() {
        try {
            if (!DW) {
                return 1000;
            }
            iy.gn(3679176581644527315L, null);
            return 1000;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 3679176581644527315L, null);
            }
            throw th;
        }
    }

    @ey(method = 1198782065645015800L)
    public static boolean sG() {
        try {
            if (DW) {
                iy.gn(-3284377389251581129L, null);
            }
            return XL().getBoolean("send_analytics_data", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3284377389251581129L, null);
            }
            throw th;
        }
    }

    @ey(method = 1463140160028692655L)
    public static void saveUserAndroidJar(String str) {
        try {
            if (DW) {
                iy.tp(34090245869341544L, null, str);
            }
            SharedPreferences.Editor editorEdit = XL().edit();
            editorEdit.putString("user_androidjar", str);
            editorEdit.commit();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 34090245869341544L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 36492108843157957L)
    public static boolean sh() {
        try {
            if (DW) {
                iy.gn(7462582116003675684L, null);
            }
            return XL().getBoolean("native_build_parallel", false);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 7462582116003675684L, null);
            }
            throw th;
        }
    }

    @ey(method = 3785642468948563608L)
    public static int sy() {
        try {
            if (DW) {
                iy.gn(2374018288218094375L, null);
            }
            try {
                return Integer.parseInt(XL().getString("tabsize", "4"));
            } catch (NumberFormatException unused) {
                return 4;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, 2374018288218094375L, null);
            }
            throw th;
        }
    }

    @ey(method = -649079287232705280L)
    private static int tp(Context context) {
        try {
            if (DW) {
                iy.tp(-1102431900638387781L, null, context);
            }
            return AndroidHelper.DW(context, 14);
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -1102431900638387781L, null, context);
            }
            throw th;
        }
    }

    @ey(method = 2829591367392370425L)
    public static int u7() {
        try {
            if (DW) {
                iy.gn(-5073543638064685608L, null);
            }
            try {
                return Integer.parseInt(XL().getString("css_indentation_size", "2"));
            } catch (NumberFormatException unused) {
                return 2;
            }
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -5073543638064685608L, null);
            }
            throw th;
        }
    }

    @ey(method = -6512167404198813248L)
    public static boolean v5() {
        try {
            if (DW) {
                iy.gn(-4584856093610713047L, null);
            }
            return XL().getBoolean("auto_sync_dropbox", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -4584856093610713047L, null);
            }
            throw th;
        }
    }

    @ey(method = 1112545519823647728L)
    public static void vJ(boolean z) {
        try {
            if (DW) {
                iy.Ws(-7596170990134917183L, null, z);
            }
            SharedPreferences.Editor editorEdit = XL().edit();
            editorEdit.putBoolean("trainer_sound", z);
            editorEdit.commit();
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -7596170990134917183L, null, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 103964311646812617L)
    public static List<String> vy() {
        try {
            if (DW) {
                iy.gn(-23443534234028304L, null);
            }
            ArrayList arrayList = new ArrayList();
            for (JavaFormatOption javaFormatOption : JavaFormatOption.values()) {
                if (XL().getBoolean(javaFormatOption.FH(), false)) {
                    arrayList.add(javaFormatOption.name());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -23443534234028304L, null);
            }
            throw th;
        }
    }

    @ey(method = 5100496470407662065L)
    public static boolean we() {
        try {
            if (DW) {
                iy.gn(-3073219316032118856L, null);
            }
            return XL().getBoolean("browser_swipe", true);
        } catch (Throwable th) {
            if (FH) {
                iy.aM(th, -3073219316032118856L, null);
            }
            throw th;
        }
    }

    @ey(method = -730472834748774425L)
    public static boolean yS(Context context) {
        try {
            if (DW) {
                iy.tp(-1758713947606532160L, null, context);
            }
            j6 = context;
            boolean z = false;
            PreferenceManager.setDefaultValues(context, 2131755012, false);
            PreferenceManager.setDefaultValues(context, 2131755014, false);
            PreferenceManager.setDefaultValues(context, 2131755017, false);
            PreferenceManager.setDefaultValues(context, 2131755015, false);
            PreferenceManager.setDefaultValues(context, 2131755011, false);
            PreferenceManager.setDefaultValues(context, 2131755013, false);
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
            for (JavaFormatOption javaFormatOption : JavaFormatOption.values()) {
                if (!defaultSharedPreferences.contains(javaFormatOption.FH())) {
                    editorEdit.putBoolean(javaFormatOption.FH(), JavaFormatOption.j6().contains(javaFormatOption));
                }
            }
            for (JavaScriptFormatterOption javaScriptFormatterOption : JavaScriptFormatterOption.values()) {
                if (!defaultSharedPreferences.contains(javaScriptFormatterOption.FH())) {
                    editorEdit.putBoolean(javaScriptFormatterOption.FH(), JavaScriptFormatterOption.j6().contains(javaScriptFormatterOption));
                }
            }
            if (!defaultSharedPreferences.contains("git_dot_ssh_dir")) {
                editorEdit.putString("git_dot_ssh_dir", new File(FileSystem.vy(), ".ssh").getPath());
            }
            if (!defaultSharedPreferences.contains("editor_font_size")) {
                editorEdit.putString("editor_font_size", tp(context) + "");
                z = true;
            }
            if (!defaultSharedPreferences.contains("editor_tabs")) {
                editorEdit.putBoolean("editor_tabs", true);
            }
            editorEdit.commit();
            return z;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -1758713947606532160L, null, context);
            }
            throw th;
        }
    }
}
