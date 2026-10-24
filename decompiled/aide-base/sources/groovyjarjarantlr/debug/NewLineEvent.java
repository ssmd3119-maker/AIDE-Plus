package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class NewLineEvent extends Event {
    private int mb;

    @Override // groovyjarjarantlr.debug.Event
    void FH(int i) {
        Hw(i);
    }

    void Hw(int i) {
        this.mb = i;
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("NewLineEvent [");
        stringBuffer.append(this.mb);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
