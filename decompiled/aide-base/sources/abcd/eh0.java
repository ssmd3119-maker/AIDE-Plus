package abcd;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class eh0 {
    public static void DW(String str, StringBuffer stringBuffer) {
        String upperCase;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                upperCase = "\\f";
            } else if (cCharAt == '\r') {
                upperCase = "\\r";
            } else if (cCharAt == '\"') {
                upperCase = "\\\"";
            } else if (cCharAt == '/') {
                upperCase = "\\/";
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        upperCase = "\\b";
                        break;
                    case '\t':
                        upperCase = "\\t";
                        break;
                    case '\n':
                        upperCase = "\\n";
                        break;
                    default:
                        if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                            stringBuffer.append(cCharAt);
                            break;
                        } else {
                            String hexString = Integer.toHexString(cCharAt);
                            stringBuffer.append("\\u");
                            for (int i2 = 0; i2 < 4 - hexString.length(); i2++) {
                                stringBuffer.append('0');
                            }
                            upperCase = hexString.toUpperCase();
                            break;
                        }
                        break;
                }
            } else {
                upperCase = "\\\\";
            }
            stringBuffer.append(upperCase);
        }
    }

    public static Object FH(Reader reader) {
        try {
            return new gh0().v5(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object Hw(String str) {
        return FH(new StringReader(str));
    }

    public static String j6(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        DW(str, stringBuffer);
        return stringBuffer.toString();
    }

    public static String v5(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\"");
            stringBuffer.append(j6((String) obj));
            stringBuffer.append("\"");
            return stringBuffer.toString();
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            return (d.isInfinite() || d.isNaN()) ? "null" : obj.toString();
        }
        if (obj instanceof Float) {
            Float f = (Float) obj;
            return (f.isInfinite() || f.isNaN()) ? "null" : obj.toString();
        }
        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
            return obj instanceof ch0 ? ((ch0) obj).j6() : obj instanceof Map ? dh0.Hw((Map) obj) : obj instanceof List ? bh0.Hw((List) obj) : obj.toString();
        }
        return obj.toString();
    }
}
