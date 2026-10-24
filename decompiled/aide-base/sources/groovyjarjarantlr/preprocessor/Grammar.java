package groovyjarjarantlr.preprocessor;

import groovyjarjarantlr.collections.impl.IndexedVector;

/* loaded from: classes.dex */
public class Grammar {
    protected String DW;
    protected String FH;
    protected IndexedVector Hw;
    protected String VH;
    protected String Zo;
    protected String gn;
    protected String j6;
    protected String u7;
    protected IndexedVector v5;

    public String j6() {
        return this.j6;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(10000);
        String str = this.VH;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (this.DW == null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("class ");
            stringBuffer2.append(this.j6);
            stringBuffer2.append(";");
            return stringBuffer2.toString();
        }
        if (this.u7 != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("class ");
            stringBuffer3.append(this.j6);
            stringBuffer3.append(" extends ");
            stringBuffer3.append(this.u7);
            stringBuffer3.append(";");
            stringBuffer.append(stringBuffer3.toString());
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("class ");
            stringBuffer4.append(this.j6);
            stringBuffer4.append(" extends ");
            stringBuffer4.append(this.FH);
            stringBuffer4.append(";");
            stringBuffer.append(stringBuffer4.toString());
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(System.getProperty("line.separator"));
        stringBuffer5.append(System.getProperty("line.separator"));
        stringBuffer.append(stringBuffer5.toString());
        IndexedVector indexedVector = this.v5;
        if (indexedVector != null) {
            stringBuffer.append(Hierarchy.j6(indexedVector));
        }
        if (this.Zo != null) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(this.Zo);
            stringBuffer6.append("\n");
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.gn != null) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(this.gn);
            stringBuffer7.append(System.getProperty("line.separator"));
            stringBuffer.append(stringBuffer7.toString());
        }
        for (int i = 0; i < this.Hw.FH(); i++) {
            Rule rule = (Rule) this.Hw.j6(i);
            if (!j6().equals(rule.u7.j6())) {
                StringBuffer stringBuffer8 = new StringBuffer();
                stringBuffer8.append("// inherited from grammar ");
                stringBuffer8.append(rule.u7.j6());
                stringBuffer8.append(System.getProperty("line.separator"));
                stringBuffer.append(stringBuffer8.toString());
            }
            StringBuffer stringBuffer9 = new StringBuffer();
            stringBuffer9.append(rule);
            stringBuffer9.append(System.getProperty("line.separator"));
            stringBuffer9.append(System.getProperty("line.separator"));
            stringBuffer.append(stringBuffer9.toString());
        }
        return stringBuffer.toString();
    }
}
