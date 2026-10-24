package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class JavaCodeGenerator extends CodeGenerator {
    protected static final String VH = new String();
    String Hw;
    Hashtable Zo = new Hashtable();
    RuleBlock v5;

    public JavaCodeGenerator() {
        new Hashtable();
        new JavaCharFormatter();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String DW(GrammarAtom grammarAtom, String str) {
        if (grammarAtom == null || grammarAtom.Zo() == null) {
            return tp(str);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        stringBuffer.append(grammarAtom.Zo());
        stringBuffer.append(")");
        stringBuffer.append("astFactory.create(");
        stringBuffer.append(str);
        stringBuffer.append(",\"");
        stringBuffer.append(grammarAtom.Zo());
        stringBuffer.append("\")");
        return stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String FH(Vector vector) {
        if (vector.gn() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("(");
        stringBuffer2.append(this.Hw);
        stringBuffer2.append(")astFactory.make( (new ASTArray(");
        stringBuffer2.append(vector.gn());
        stringBuffer2.append("))");
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < vector.gn(); i++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(".add(");
            stringBuffer3.append(vector.FH(i));
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // groovyjarjarantlr.CodeGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String VH(java.lang.String r7, groovyjarjarantlr.ActionTransInfo r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.JavaCodeGenerator.VH(java.lang.String, groovyjarjarantlr.ActionTransInfo):java.lang.String");
    }

    public String tp(String str) {
        if (str == null) {
            str = "";
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ',') {
                i++;
            }
        }
        if (i >= 2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("(");
            stringBuffer.append(this.Hw);
            stringBuffer.append(")astFactory.create(");
            stringBuffer.append(str);
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
        int iIndexOf = str.indexOf(44);
        str.lastIndexOf(44);
        TokenSymbol tokenSymbolJ6 = this.DW.Hw.j6(i > 0 ? str.substring(0, iIndexOf) : str);
        if (tokenSymbolJ6 != null) {
            String strJ6 = tokenSymbolJ6.j6();
            String str2 = i == 0 ? ",\"\"" : "";
            if (strJ6 != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("(");
                stringBuffer2.append(strJ6);
                stringBuffer2.append(")");
                stringBuffer2.append("astFactory.create(");
                stringBuffer2.append(str);
                stringBuffer2.append(str2);
                stringBuffer2.append(",\"");
                stringBuffer2.append(strJ6);
                stringBuffer2.append("\")");
                return stringBuffer2.toString();
            }
        }
        if (this.Hw.equals("AST")) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("astFactory.create(");
            stringBuffer3.append(str);
            stringBuffer3.append(")");
            return stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("(");
        stringBuffer4.append(this.Hw);
        stringBuffer4.append(")");
        stringBuffer4.append("astFactory.create(");
        stringBuffer4.append(str);
        stringBuffer4.append(")");
        return stringBuffer4.toString();
    }
}
