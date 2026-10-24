package groovyjarjarantlr;

/* loaded from: classes.dex */
public class SynPredBlock extends AlternativeBlock {
    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.v5(i, this);
    }

    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("=>");
        return stringBuffer.toString();
    }
}
