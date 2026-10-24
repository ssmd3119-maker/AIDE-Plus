package abcd;

import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class tz {
    public static void DW(String str) {
        HashSet hashSet = new HashSet(we());
        hashSet.add(str);
        rN(hashSet);
    }

    private static boolean EQ(String str, boolean z) {
        return J8().getBoolean(str, z);
    }

    public static boolean FH() {
        boolean zEQ = EQ("is_first_run", true);
        if (zEQ) {
            Mr("is_first_run", false);
        }
        return zEQ;
    }

    public static void Hw(mz mzVar) {
        Mr("is_event_defined_" + mzVar.FH(), true);
    }

    private static long J0(String str, long j) {
        return J8().getLong(str, j);
    }

    private static SharedPreferences J8() {
        return d00.Zo();
    }

    private static void Mr(String str, boolean z) {
        J8().edit().putBoolean(str, z).commit();
    }

    private static Set<String> QX(String str) {
        return J8().getStringSet(str, new HashSet());
    }

    private static void U2(String str, long j) {
        J8().edit().putLong(str, j).commit();
    }

    public static boolean VH(String str) {
        boolean zEQ = EQ("onMarketClick_" + str, true);
        if (zEQ) {
            Mr("onMarketClick_" + str, false);
        }
        return zEQ;
    }

    public static File Ws() {
        return d00.v5(iy.DW(), "probes_" + by.j6().J8());
    }

    public static boolean XL(String str) {
        return QX("apps_with_my_signature").contains(str);
    }

    public static boolean Zo(String str) {
        boolean zEQ = EQ("onInstall_" + str, true);
        if (zEQ) {
            Mr("onInstall_" + str, false);
        }
        return zEQ;
    }

    private static void a8(String str, Set<String> set) {
        J8().edit().putStringSet(str, set).commit();
    }

    public static boolean aM(mz mzVar) {
        return EQ("is_event_defined_" + mzVar.FH(), false);
    }

    public static void er(boolean z) {
        Mr("is_developer", z);
    }

    public static boolean gn(String str) {
        boolean zEQ = EQ("onMarketImpression_" + str, true);
        if (zEQ) {
            Mr("onMarketImpression_" + str, false);
        }
        return zEQ;
    }

    public static boolean j3() {
        return EQ("is_developer", false);
    }

    public static void j6(Set<String> set) {
        HashSet hashSet = new HashSet(QX("apps_with_my_signature"));
        hashSet.addAll(set);
        a8("apps_with_my_signature", hashSet);
    }

    public static void lg(String str) {
        HashSet hashSet = new HashSet(we());
        hashSet.remove(str);
        rN(hashSet);
    }

    public static void rN(Set<String> set) {
        a8("installed_apps", set);
    }

    public static boolean tp(String str) {
        if (J0("onUpdate_" + str, -1L) == by.j6().lg()) {
            return false;
        }
        U2("onUpdate_" + str, by.j6().lg());
        return true;
    }

    public static boolean u7(String str, long j, String str2) {
        boolean zEQ = EQ("onOtherAppInstall_" + str + "_" + j + "_" + str2, true);
        if (zEQ) {
            Mr("onOtherAppInstall_" + str + "_" + j + "_" + str2, false);
        }
        return zEQ;
    }

    public static boolean v5(String str, long j, String str2) {
        boolean zEQ = EQ("onInAppPurchase_" + str + "_" + j + "_" + str2, true);
        if (zEQ) {
            Mr("onInAppPurchase_" + str + "_" + j + "_" + str2, false);
        }
        return zEQ;
    }

    public static Set<String> we() {
        return QX("installed_apps");
    }
}
