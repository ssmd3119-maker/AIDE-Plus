package abcd;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class rz {
    private static Map<String, wz> j6 = new HashMap();

    private static wz DW(String str) {
        wz wzVar = j6.get(str);
        if (wzVar != null) {
            return wzVar;
        }
        wz wzVar2 = new wz(new File(d00.FH(iy.DW()), str));
        j6.put(str, wzVar2);
        return wzVar2;
    }

    public static boolean FH(my myVar, String str) {
        wz wzVarDW = DW("has_changed_" + myVar.FH().FH());
        if (wzVarDW.j6() && j6(wzVarDW.DW(), str)) {
            return false;
        }
        wzVarDW.v5(str);
        return true;
    }

    public static void Hw(boolean z) {
        DW("optin").FH(Long.toString(z ? Long.MAX_VALUE : 0L));
    }

    public static void VH(boolean z) {
        DW("optin").v5(Long.toString(z ? Long.MAX_VALUE : System.currentTimeMillis() + 10000));
    }

    public static boolean Zo() {
        String strDW = DW("optin").DW();
        return strDW == null || Long.parseLong(strDW) >= System.currentTimeMillis();
    }

    private static boolean j6(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean v5() {
        String strDW = DW("optin").DW();
        return strDW == null || Long.parseLong(strDW) == Long.MAX_VALUE;
    }
}
