package groovyjarjarantlr;

/* loaded from: classes.dex */
public class TokenRangeElement extends AlternativeElement {
    protected String EQ;
    String VH;
    protected int gn;
    protected String tp;
    protected int u7;

    @Override // groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.DW(i, this);
    }

    @Override // groovyjarjarantlr.GrammarElement
    public String toString() {
        if (this.VH == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(this.tp);
            stringBuffer.append("..");
            stringBuffer.append(this.EQ);
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        stringBuffer2.append(this.VH);
        stringBuffer2.append(":");
        stringBuffer2.append(this.tp);
        stringBuffer2.append("..");
        stringBuffer2.append(this.EQ);
        return stringBuffer2.toString();
    }

    @Override // groovyjarjarantlr.AlternativeElement
    public String v5() {
        return this.VH;
    }
}
