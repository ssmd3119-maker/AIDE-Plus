package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class MessageEvent extends Event {
    public static int jw;
    private String mb;

    public String Hw() {
        return this.mb;
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParserMessageEvent [");
        stringBuffer.append(j6() == jw ? "warning," : "error,");
        stringBuffer.append(Hw());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
