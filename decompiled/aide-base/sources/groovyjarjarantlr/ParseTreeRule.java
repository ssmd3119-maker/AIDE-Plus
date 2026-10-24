package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ParseTreeRule extends ParseTree {
    protected int k2;
    protected String qp;

    @Override // groovyjarjarantlr.BaseAST
    public String toString() {
        if (this.k2 == -1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('<');
            stringBuffer.append(this.qp);
            stringBuffer.append('>');
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append('<');
        stringBuffer2.append(this.qp);
        stringBuffer2.append("[");
        stringBuffer2.append(this.k2);
        stringBuffer2.append("]>");
        return stringBuffer2.toString();
    }
}
