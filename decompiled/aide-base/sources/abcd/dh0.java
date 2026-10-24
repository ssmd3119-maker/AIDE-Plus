package abcd;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class dh0 extends HashMap implements Map, ch0 {
    private static String FH(String str, Object obj, StringBuffer stringBuffer) {
        stringBuffer.append('\"');
        if (str == null) {
            stringBuffer.append("null");
        } else {
            eh0.DW(str, stringBuffer);
        }
        stringBuffer.append('\"');
        stringBuffer.append(':');
        stringBuffer.append(eh0.v5(obj));
        return stringBuffer.toString();
    }

    public static String Hw(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        stringBuffer.append('{');
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            FH(String.valueOf(entry.getKey()), entry.getValue(), stringBuffer);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // abcd.ch0
    public String j6() {
        return Hw(this);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return j6();
    }
}
