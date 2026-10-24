package groovyjarjarantlr;

/* loaded from: classes.dex */
public class TokenWithIndex extends CommonToken {
    int k2;

    public void EQ(int i) {
        this.k2 = i;
    }

    @Override // groovyjarjarantlr.CommonToken, groovyjarjarantlr.Token
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(this.k2);
        stringBuffer.append(":\"");
        stringBuffer.append(j6());
        stringBuffer.append("\",<");
        stringBuffer.append(Hw());
        stringBuffer.append(">,line=");
        stringBuffer.append(this.jw);
        stringBuffer.append(",col=");
        stringBuffer.append(this.qp);
        stringBuffer.append("]\n");
        return stringBuffer.toString();
    }
}
