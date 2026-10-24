package groovyjarjarantlr;

/* loaded from: classes.dex */
public class RuleRefElement extends AlternativeElement {
    protected String VH;
    protected String gn;
    protected String u7;

    @Override // groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.VH(i, this);
    }

    @Override // groovyjarjarantlr.GrammarElement
    public String toString() {
        if (this.gn == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(this.VH);
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        stringBuffer2.append(this.VH);
        stringBuffer2.append(this.gn);
        return stringBuffer2.toString();
    }

    @Override // groovyjarjarantlr.AlternativeElement
    public String v5() {
        return this.u7;
    }
}
