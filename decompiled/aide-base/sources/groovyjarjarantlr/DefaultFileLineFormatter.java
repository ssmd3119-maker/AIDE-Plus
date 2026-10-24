package groovyjarjarantlr;

/* loaded from: classes.dex */
public class DefaultFileLineFormatter extends FileLineFormatter {
    @Override // groovyjarjarantlr.FileLineFormatter
    public String j6(String str, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append(":");
            stringBuffer.append(stringBuffer2.toString());
        }
        if (i != -1) {
            if (str == null) {
                stringBuffer.append("line ");
            }
            stringBuffer.append(i);
            if (i2 != -1) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(":");
                stringBuffer3.append(i2);
                stringBuffer.append(stringBuffer3.toString());
            }
            stringBuffer.append(":");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
