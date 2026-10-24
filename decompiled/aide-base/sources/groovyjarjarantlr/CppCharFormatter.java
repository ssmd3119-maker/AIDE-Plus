package groovyjarjarantlr;

/* loaded from: classes.dex */
public class CppCharFormatter implements CharFormatter {
    CppCharFormatter() {
    }

    public String DW(int i, boolean z) {
        if (i == 9) {
            return "\\t";
        }
        if (i == 10) {
            return "\\n";
        }
        if (i == 13) {
            return "\\r";
        }
        if (i == 34) {
            return "\\\"";
        }
        if (i == 39) {
            return "\\'";
        }
        if (i == 92) {
            return "\\\\";
        }
        if (i >= 32 && i <= 126) {
            return String.valueOf((char) i);
        }
        if (i <= 255) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\\");
            stringBuffer.append(Integer.toString(i, 8));
            return stringBuffer.toString();
        }
        String string = Integer.toString(i, 16);
        while (string.length() < 4) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append('0');
            stringBuffer2.append(string);
            string = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("\\u");
        stringBuffer3.append(string);
        return stringBuffer3.toString();
    }

    @Override // groovyjarjarantlr.CharFormatter
    public String j6(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("0x");
        stringBuffer.append(Integer.toString(i, 16));
        String string = stringBuffer.toString();
        if (i < 0 || i > 126) {
            return string;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(string);
        stringBuffer2.append(" /* '");
        stringBuffer2.append(DW(i, true));
        stringBuffer2.append("' */ ");
        return stringBuffer2.toString();
    }
}
