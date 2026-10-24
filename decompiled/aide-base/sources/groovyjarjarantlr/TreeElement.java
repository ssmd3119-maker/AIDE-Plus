package groovyjarjarantlr;

/* loaded from: classes.dex */
public class TreeElement extends AlternativeBlock {
    GrammarAtom we;

    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.j6(i, this);
    }

    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" #(");
        stringBuffer.append(this.we);
        String string = stringBuffer.toString();
        for (AlternativeElement alternativeElement = ((Alternative) this.gn.FH(0)).j6; alternativeElement != null; alternativeElement = alternativeElement.Hw) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            stringBuffer2.append(alternativeElement);
            string = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(string);
        stringBuffer3.append(" )");
        return stringBuffer3.toString();
    }
}
