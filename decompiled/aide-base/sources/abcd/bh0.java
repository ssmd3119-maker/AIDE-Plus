package abcd;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bh0 extends ArrayList implements List, ch0 {
    public static String Hw(List list) {
        if (list == null) {
            return "null";
        }
        boolean z = true;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        for (Object obj : list) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            if (obj == null) {
                stringBuffer.append("null");
            } else {
                stringBuffer.append(eh0.v5(obj));
            }
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // abcd.ch0
    public String j6() {
        return Hw(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return j6();
    }
}
