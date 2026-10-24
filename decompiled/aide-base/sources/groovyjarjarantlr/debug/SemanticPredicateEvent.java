package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class SemanticPredicateEvent extends GuessingEvent {
    private boolean fY;
    private int jw;

    public int VH() {
        return this.jw;
    }

    public boolean gn() {
        return this.fY;
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SemanticPredicateEvent [");
        stringBuffer.append(VH());
        stringBuffer.append(",");
        stringBuffer.append(gn());
        stringBuffer.append(",");
        stringBuffer.append(Hw());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
