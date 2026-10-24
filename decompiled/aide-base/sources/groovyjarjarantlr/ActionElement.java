package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ActionElement extends AlternativeElement {
    protected String VH;
    protected boolean gn;

    @Override // groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.J0(i, this);
    }

    @Override // groovyjarjarantlr.GrammarElement
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" ");
        stringBuffer.append(this.VH);
        stringBuffer.append(this.gn ? "?" : "");
        return stringBuffer.toString();
    }
}
