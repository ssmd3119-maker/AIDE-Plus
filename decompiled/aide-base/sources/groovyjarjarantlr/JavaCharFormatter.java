package groovyjarjarantlr;

/* loaded from: classes.dex */
public class JavaCharFormatter implements CharFormatter {
    JavaCharFormatter() {
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
            return z ? "\"" : "\\\"";
        }
        if (i == 39) {
            return z ? "\\'" : "'";
        }
        if (i == 92) {
            return "\\\\";
        }
        if (i >= 32 && i <= 126) {
            return String.valueOf((char) i);
        }
        if (i >= 0 && i <= 15) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\\u000");
            stringBuffer.append(Integer.toString(i, 16));
            return stringBuffer.toString();
        }
        if (16 <= i && i <= 255) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("\\u00");
            stringBuffer2.append(Integer.toString(i, 16));
            return stringBuffer2.toString();
        }
        if (256 > i || i > 4095) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("\\u");
            stringBuffer3.append(Integer.toString(i, 16));
            return stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("\\u0");
        stringBuffer4.append(Integer.toString(i, 16));
        return stringBuffer4.toString();
    }

    @Override // groovyjarjarantlr.CharFormatter
    public String j6(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("'");
        stringBuffer.append(DW(i, true));
        stringBuffer.append("'");
        return stringBuffer.toString();
    }
}
