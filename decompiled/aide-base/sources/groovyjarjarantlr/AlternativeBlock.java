package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;

/* loaded from: classes.dex */
public class AlternativeBlock extends AlternativeElement {
    boolean EQ;
    protected String VH;
    protected Vector gn;
    protected int tp;
    protected String u7;

    @Override // groovyjarjarantlr.GrammarElement
    public Lookahead FH(int i) {
        return this.j6.j6.Hw(i, this);
    }

    public Alternative Zo(int i) {
        return (Alternative) this.gn.FH(i);
    }

    @Override // groovyjarjarantlr.GrammarElement
    public String toString() {
        String string = " (";
        if (this.VH != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" (");
            stringBuffer.append(this.VH);
            string = stringBuffer.toString();
        }
        for (int i = 0; i < this.gn.gn(); i++) {
            Alternative alternativeZo = Zo(i);
            Lookahead[] lookaheadArr = alternativeZo.Zo;
            int i2 = alternativeZo.VH;
            if (i2 != -1) {
                if (i2 == Integer.MAX_VALUE) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(string);
                    stringBuffer2.append("{?}:");
                    string = stringBuffer2.toString();
                } else {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(string);
                    stringBuffer3.append(" {");
                    String string2 = stringBuffer3.toString();
                    for (int i3 = 1; i3 <= i2; i3++) {
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append(string2);
                        stringBuffer4.append(lookaheadArr[i3].tp(",", this.j6.Hw.Hw()));
                        string2 = stringBuffer4.toString();
                        if (i3 < i2 && lookaheadArr[i3 + 1] != null) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append(string2);
                            stringBuffer5.append(";");
                            string2 = stringBuffer5.toString();
                        }
                    }
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append(string2);
                    stringBuffer6.append("}:");
                    string = stringBuffer6.toString();
                }
            }
            String str = alternativeZo.Hw;
            if (str != null) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(string);
                stringBuffer7.append(str);
                string = stringBuffer7.toString();
            }
            for (AlternativeElement alternativeElement = alternativeZo.j6; alternativeElement != null; alternativeElement = alternativeElement.Hw) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append(string);
                stringBuffer8.append(alternativeElement);
                string = stringBuffer8.toString();
            }
            if (i < this.gn.gn() - 1) {
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append(string);
                stringBuffer9.append(" |");
                string = stringBuffer9.toString();
            }
        }
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append(string);
        stringBuffer10.append(" )");
        return stringBuffer10.toString();
    }

    @Override // groovyjarjarantlr.AlternativeElement
    public String v5() {
        return this.u7;
    }
}
