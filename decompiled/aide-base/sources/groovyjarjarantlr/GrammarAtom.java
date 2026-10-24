package groovyjarjarantlr;

/* loaded from: classes.dex */
public abstract class GrammarAtom extends AlternativeElement {
    protected String EQ;
    protected String VH;
    protected String gn;
    protected boolean tp;
    protected int u7;

    public String VH() {
        return this.gn;
    }

    public String Zo() {
        return this.EQ;
    }

    public int gn() {
        return this.u7;
    }

    @Override // groovyjarjarantlr.GrammarElement
    public String toString() {
        String string = " ";
        if (this.VH != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(this.VH);
            stringBuffer.append(":");
            string = stringBuffer.toString();
        }
        if (this.tp) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            stringBuffer2.append("~");
            string = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(string);
        stringBuffer3.append(this.gn);
        return stringBuffer3.toString();
    }

    @Override // groovyjarjarantlr.AlternativeElement
    public String v5() {
        return this.VH;
    }
}
