package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ZeroOrMoreBlock extends BlockWithImpliedExitPath {
    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.QX(i, this);
    }

    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("*");
        return stringBuffer.toString();
    }
}
