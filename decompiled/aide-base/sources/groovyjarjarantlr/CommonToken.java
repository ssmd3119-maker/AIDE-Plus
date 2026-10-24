package groovyjarjarantlr;

/* loaded from: classes.dex */
public class CommonToken extends Token {
    protected String fY;
    protected int jw;
    protected int qp;

    public CommonToken() {
        this.fY = null;
    }

    @Override // groovyjarjarantlr.Token
    public int FH() {
        return this.jw;
    }

    @Override // groovyjarjarantlr.Token
    public void VH(int i) {
        this.qp = i;
    }

    @Override // groovyjarjarantlr.Token
    public int Zo() {
        return this.qp;
    }

    @Override // groovyjarjarantlr.Token
    public void gn(int i) {
        this.jw = i;
    }

    @Override // groovyjarjarantlr.Token
    public String j6() {
        return this.fY;
    }

    @Override // groovyjarjarantlr.Token
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[\"");
        stringBuffer.append(j6());
        stringBuffer.append("\",<");
        stringBuffer.append(this.WB);
        stringBuffer.append(">,line=");
        stringBuffer.append(this.jw);
        stringBuffer.append(",col=");
        stringBuffer.append(this.qp);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.Token
    public void u7(String str) {
        this.fY = str;
    }

    public CommonToken(int i, String str) {
        this.fY = null;
        this.WB = i;
        u7(str);
    }

    public CommonToken(String str) {
        this.fY = null;
        this.fY = str;
    }
}
