package groovyjarjarantlr.preprocessor;

import groovyjarjarantlr.collections.impl.IndexedVector;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class Rule {
    protected String DW;
    protected String FH;
    protected String Hw;
    protected IndexedVector VH;
    protected String Zo;
    protected String gn;
    protected String j6;
    protected boolean tp;
    protected Grammar u7;
    protected String v5;

    public boolean j6() {
        return this.tp;
    }

    public String toString() {
        String string;
        String string2 = "";
        if (this.Hw == null) {
            string = "";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("returns ");
            stringBuffer.append(this.Hw);
            string = stringBuffer.toString();
        }
        String str = this.FH;
        if (str == null) {
            str = "";
        }
        String str2 = j6() ? "!" : "";
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("");
        if (this.gn != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(this.gn);
            stringBuffer3.append(" ");
            string2 = stringBuffer3.toString();
        }
        stringBuffer2.append(string2);
        String string3 = stringBuffer2.toString();
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(string3);
        stringBuffer4.append(this.j6);
        stringBuffer4.append(str2);
        stringBuffer4.append(str);
        stringBuffer4.append(" ");
        stringBuffer4.append(string);
        stringBuffer4.append(this.v5);
        String string4 = stringBuffer4.toString();
        if (this.VH != null) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(string4);
            stringBuffer5.append(System.getProperty("line.separator"));
            stringBuffer5.append("options {");
            stringBuffer5.append(System.getProperty("line.separator"));
            String string5 = stringBuffer5.toString();
            Enumeration enumerationDW = this.VH.DW();
            while (enumerationDW.hasMoreElements()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append(string5);
                stringBuffer6.append((Option) enumerationDW.nextElement());
                stringBuffer6.append(System.getProperty("line.separator"));
                string5 = stringBuffer6.toString();
            }
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(string5);
            stringBuffer7.append("}");
            stringBuffer7.append(System.getProperty("line.separator"));
            string4 = stringBuffer7.toString();
        }
        if (this.Zo != null) {
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append(string4);
            stringBuffer8.append(this.Zo);
            stringBuffer8.append(System.getProperty("line.separator"));
            string4 = stringBuffer8.toString();
        }
        StringBuffer stringBuffer9 = new StringBuffer();
        stringBuffer9.append(string4);
        stringBuffer9.append(this.DW);
        return stringBuffer9.toString();
    }
}
