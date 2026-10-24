package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class CSharpCodeGenerator extends CodeGenerator {
    protected static final String gn = new String();
    boolean Hw = false;
    Hashtable VH = new Hashtable();
    RuleBlock Zo;
    String v5;

    public CSharpCodeGenerator() {
        new Hashtable();
        new CSharpCharFormatter();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String DW(GrammarAtom grammarAtom, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("astFactory.create(");
        stringBuffer.append(str);
        stringBuffer.append(")");
        String string = stringBuffer.toString();
        if (grammarAtom == null) {
            return tp(str);
        }
        if (grammarAtom.Zo() == null) {
            if (!this.Hw) {
                return string;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("(");
            stringBuffer2.append(this.v5);
            stringBuffer2.append(") ");
            stringBuffer2.append(string);
            return stringBuffer2.toString();
        }
        TokenSymbol tokenSymbolJ6 = this.DW.Hw.j6(grammarAtom.VH());
        if (tokenSymbolJ6 == null || tokenSymbolJ6.j6() != grammarAtom.Zo()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("(");
            stringBuffer3.append(grammarAtom.Zo());
            stringBuffer3.append(") astFactory.create(");
            stringBuffer3.append(str);
            stringBuffer3.append(", \"");
            stringBuffer3.append(grammarAtom.Zo());
            stringBuffer3.append("\")");
            return stringBuffer3.toString();
        }
        if (tokenSymbolJ6 == null || tokenSymbolJ6.j6() == null) {
            return string;
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append("(");
        stringBuffer4.append(tokenSymbolJ6.j6());
        stringBuffer4.append(") ");
        stringBuffer4.append(string);
        return stringBuffer4.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String FH(Vector vector) {
        if (vector.gn() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("(");
        stringBuffer2.append(this.v5);
        stringBuffer2.append(") astFactory.make(");
        stringBuffer.append(stringBuffer2.toString());
        stringBuffer.append(vector.FH(0));
        for (int i = 1; i < vector.gn(); i++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(", ");
            stringBuffer3.append(vector.FH(i));
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    protected String Hw(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("tokenSet_");
        stringBuffer.append(i);
        stringBuffer.append("_");
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
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.CSharpCodeGenerator.VH(java.lang.String, groovyjarjarantlr.ActionTransInfo):java.lang.String");
    }

    public String tp(String str) {
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("astFactory.create(");
        stringBuffer.append(str);
        stringBuffer.append(")");
        String string = stringBuffer.toString();
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            str.substring(iIndexOf + 1, str.length()).indexOf(44);
            str = strSubstring;
        }
        TokenSymbol tokenSymbolJ6 = this.DW.Hw.j6(str);
        if (tokenSymbolJ6 != null && tokenSymbolJ6.j6() != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("(");
            stringBuffer2.append(tokenSymbolJ6.j6());
            stringBuffer2.append(") ");
            stringBuffer2.append(string);
            return stringBuffer2.toString();
        }
        if (!this.Hw) {
            return string;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("(");
        stringBuffer3.append(this.v5);
        stringBuffer3.append(") ");
        stringBuffer3.append(string);
        return stringBuffer3.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String u7(String str) {
        if (!this.Hw) {
            return str;
        }
        Grammar grammar = this.DW;
        if ((!(grammar instanceof TreeWalkerGrammar) && !(grammar instanceof ParserGrammar)) || this.DW.Hw.Zo(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(AST)");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
