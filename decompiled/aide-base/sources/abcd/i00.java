package abcd;

import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class i00 {
    static g00 j6 = new j00();
    static Map<String, h00> DW = new TreeMap();

    public static h00 j6(String str) {
        h00 h00Var = DW.get(str);
        if (h00Var != null) {
            return h00Var;
        }
        h00 h00VarJ6 = j6.j6(str);
        DW.put(str, h00VarJ6);
        return h00VarJ6;
    }
}
