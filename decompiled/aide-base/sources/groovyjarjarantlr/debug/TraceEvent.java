package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class TraceEvent extends GuessingEvent {
    public static int fY;
    private int jw;

    public int VH() {
        return this.jw;
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParserTraceEvent [");
        stringBuffer.append(j6() == fY ? "enter," : "exit,");
        stringBuffer.append(VH());
        stringBuffer.append(",");
        stringBuffer.append(Hw());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
