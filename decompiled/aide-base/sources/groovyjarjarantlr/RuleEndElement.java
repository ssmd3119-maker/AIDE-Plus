package groovyjarjarantlr;

/* loaded from: classes.dex */
public class RuleEndElement extends BlockEndElement {
    protected boolean tp;
    protected Lookahead[] u7;

    @Override // groovyjarjarantlr.BlockEndElement, groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.Ws(i, this);
    }

    @Override // groovyjarjarantlr.BlockEndElement, groovyjarjarantlr.GrammarElement
    public String toString() {
        return "";
    }
}
