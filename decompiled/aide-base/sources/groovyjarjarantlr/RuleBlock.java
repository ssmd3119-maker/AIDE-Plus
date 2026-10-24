package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;

/* loaded from: classes.dex */
public class RuleBlock extends AlternativeBlock {
    protected RuleEndElement J0;
    Vector J8;
    protected Lookahead[] QX;
    protected boolean[] Ws;
    protected String we;

    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.tp(i, this);
    }

    public String VH() {
        return this.we;
    }

    @Override // groovyjarjarantlr.AlternativeBlock, groovyjarjarantlr.GrammarElement
    public String toString() {
        Lookahead[] lookaheadArr = this.J0.u7;
        int i = this.j6.VH;
        String str = " FOLLOW={";
        boolean z = true;
        for (int i2 = 1; i2 <= i; i2++) {
            if (lookaheadArr[i2] != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(lookaheadArr[i2].tp(",", this.j6.Hw.Hw()));
                String string = stringBuffer.toString();
                if (i2 < i && lookaheadArr[i2 + 1] != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(string);
                    stringBuffer2.append(";");
                    string = stringBuffer2.toString();
                }
                str = string;
                z = false;
            }
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);
        stringBuffer3.append("}");
        String string2 = stringBuffer3.toString();
        if (z) {
            string2 = "";
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(this.we);
        stringBuffer4.append(": ");
        stringBuffer4.append(super.toString());
        stringBuffer4.append(" ;");
        stringBuffer4.append(string2);
        return stringBuffer4.toString();
    }
}
