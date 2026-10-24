package groovyjarjarantlr.debug;

/* loaded from: classes.dex */
public class ParserMatchEvent extends GuessingEvent {
    public static int AL = 1;
    public static int cT = 5;
    public static int hK = 4;
    public static int w9 = 2;
    public static int zh;
    private boolean fY;
    private boolean jw;
    private int k2;
    private Object qp;

    void EQ(boolean z) {
        this.jw = z;
    }

    void J0(Object obj) {
        this.qp = obj;
    }

    void J8(String str) {
    }

    void QX(int i, int i2, Object obj, String str, int i3, boolean z, boolean z2) {
        super.Zo(i, i3);
        Ws(i2);
        J0(obj);
        EQ(z);
        we(z2);
        J8(str);
    }

    public Object VH() {
        return this.qp;
    }

    void Ws(int i) {
        this.k2 = i;
    }

    public int gn() {
        return this.k2;
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParserMatchEvent [");
        stringBuffer.append(tp() ? "ok," : "bad,");
        stringBuffer.append(u7() ? "NOT " : "");
        stringBuffer.append(j6() == zh ? "token," : "bitset,");
        stringBuffer.append(gn());
        stringBuffer.append(",");
        stringBuffer.append(VH());
        stringBuffer.append(",");
        stringBuffer.append(Hw());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public boolean tp() {
        return this.fY;
    }

    public boolean u7() {
        return this.jw;
    }

    void we(boolean z) {
        this.fY = z;
    }
}
