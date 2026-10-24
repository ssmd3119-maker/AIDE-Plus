package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class InputBufferEvent extends Event {
    int jw;
    char mb;

    public char Hw() {
        return this.mb;
    }

    void VH(int i) {
        this.jw = i;
    }

    void Zo(char c) {
        this.mb = c;
    }

    void gn(int i, char c, int i2) {
        super.FH(i);
        Zo(c);
        VH(i2);
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CharBufferEvent [");
        stringBuffer.append(j6() == 0 ? "CONSUME, " : "LA, ");
        stringBuffer.append(Hw());
        stringBuffer.append(",");
        stringBuffer.append(v5());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public int v5() {
        return this.jw;
    }
}
