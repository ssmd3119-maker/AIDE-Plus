package groovyjarjarantlr;

/* loaded from: classes.dex */
public class WildcardElement extends GrammarAtom {
    protected String we;

    @Override // groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.we(i, this);
    }

    @Override // groovyjarjarantlr.GrammarAtom, groovyjarjarantlr.GrammarElement
    public String toString() {
        String string = " ";
        if (this.we != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(this.we);
            stringBuffer.append(":");
            string = stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(string);
        stringBuffer2.append(".");
        return stringBuffer2.toString();
    }

    @Override // groovyjarjarantlr.GrammarAtom, groovyjarjarantlr.AlternativeElement
    public String v5() {
        return this.we;
    }
}
