package groovyjarjarantlr;

/* loaded from: classes.dex */
public class Token implements Cloneable {
    public static Token mb = new Token(0, "<no text>");
    protected int WB;

    public Token() {
        this.WB = 0;
    }

    public int FH() {
        return 0;
    }

    public int Hw() {
        return this.WB;
    }

    public void VH(int i) {
    }

    public int Zo() {
        return 0;
    }

    public void gn(int i) {
    }

    public String j6() {
        return "<no text>";
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[\"");
        stringBuffer.append(j6());
        stringBuffer.append("\",<");
        stringBuffer.append(Hw());
        stringBuffer.append(">]");
        return stringBuffer.toString();
    }

    public void tp(int i) {
        this.WB = i;
    }

    public void u7(String str) {
    }

    public Token(int i) {
        this.WB = 0;
        this.WB = i;
    }

    public Token(int i, String str) {
        this.WB = 0;
        this.WB = i;
        u7(str);
    }
}
