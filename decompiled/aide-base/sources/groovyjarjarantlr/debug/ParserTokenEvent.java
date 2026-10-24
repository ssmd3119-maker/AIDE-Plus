package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class ParserTokenEvent extends Event {
    public static int fY = 0;
    public static int qp = 1;
    private int jw;
    private int mb;

    public int Hw() {
        return this.jw;
    }

    void VH(int i) {
        this.mb = i;
    }

    void Zo(int i) {
        this.jw = i;
    }

    void gn(int i, int i2, int i3) {
        super.FH(i);
        Zo(i2);
        VH(i3);
    }

    @Override // java.util.EventObject
    public String toString() {
        if (j6() != fY) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ParserTokenEvent [consume,1,");
            stringBuffer.append(v5());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("ParserTokenEvent [LA,");
        stringBuffer2.append(Hw());
        stringBuffer2.append(",");
        stringBuffer2.append(v5());
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    public int v5() {
        return this.mb;
    }
}
