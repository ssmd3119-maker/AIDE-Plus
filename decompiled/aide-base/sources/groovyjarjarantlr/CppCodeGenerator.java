package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class CppCodeGenerator extends CodeGenerator {
    boolean Hw = false;
    Hashtable VH = new Hashtable();
    RuleBlock Zo;
    private Vector gn;
    String v5;
    protected static final String u7 = new String();
    private static String tp = "ANTLR_USE_NAMESPACE(antlr)";

    public CppCodeGenerator() {
        new Hashtable();
        new CppCharFormatter();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String DW(GrammarAtom grammarAtom, String str) {
        if (grammarAtom == null || grammarAtom.Zo() == null) {
            boolean zZo = str.indexOf(44) != -1 ? this.DW.Hw.Zo(str.substring(0, str.indexOf(44))) : false;
            if (this.Hw) {
                Grammar grammar = this.DW;
                if ((grammar instanceof TreeWalkerGrammar) && !grammar.Hw.Zo(str) && !zZo) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("astFactory->create(");
                    stringBuffer.append(tp);
                    stringBuffer.append("RefAST(");
                    stringBuffer.append(str);
                    stringBuffer.append("))");
                    return stringBuffer.toString();
                }
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("astFactory->create(");
            stringBuffer2.append(str);
            stringBuffer2.append(")");
            return stringBuffer2.toString();
        }
        this.gn.Zo(grammarAtom.gn());
        String str2 = (String) this.gn.FH(grammarAtom.gn());
        if (str2 == null || grammarAtom.Zo().equals(str2)) {
            this.gn.VH(grammarAtom.Zo(), grammarAtom.gn());
        } else {
            Tool tool = this.j6;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Attempt to redefine AST type for ");
            stringBuffer3.append(grammarAtom.VH());
            tool.Zo(stringBuffer3.toString(), this.DW.j6(), grammarAtom.DW(), grammarAtom.j6());
            Tool tool2 = this.j6;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(" from \"");
            stringBuffer4.append(str2);
            stringBuffer4.append("\" to \"");
            stringBuffer4.append(grammarAtom.Zo());
            stringBuffer4.append("\" sticking to \"");
            stringBuffer4.append(str2);
            stringBuffer4.append("\"");
            tool2.Zo(stringBuffer4.toString(), this.DW.j6(), grammarAtom.DW(), grammarAtom.j6());
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("astFactory->create(");
        stringBuffer5.append(str);
        stringBuffer5.append(")");
        return stringBuffer5.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String FH(Vector vector) {
        if (vector.gn() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.v5);
        stringBuffer2.append("(astFactory->make((new ");
        stringBuffer2.append(tp);
        stringBuffer2.append("ASTArray(");
        stringBuffer2.append(vector.gn());
        stringBuffer2.append("))");
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < vector.gn(); i++) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("->add(");
            stringBuffer3.append(vector.FH(i));
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append("))");
        return stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String VH(String str, ActionTransInfo actionTransInfo) {
        StringBuffer stringBuffer;
        if (this.Zo == null) {
            return str;
        }
        Grammar grammar = this.DW;
        boolean z = true;
        if (grammar instanceof TreeWalkerGrammar) {
            boolean z2 = !grammar.FH;
            if (str.length() <= 3 || str.lastIndexOf("_in") != str.length() - 3) {
                z = z2;
            } else {
                str = str.substring(0, str.length() - 3);
            }
        } else {
            z = false;
        }
        for (int i = 0; i < this.Zo.J8.gn(); i++) {
            if (((AlternativeElement) this.Zo.J8.FH(i)).v5().equals(str)) {
                if (z) {
                    return str;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str);
                stringBuffer2.append("_AST");
                return stringBuffer2.toString();
            }
        }
        String str2 = (String) this.VH.get(str);
        if (str2 == null) {
            if (str.equals(this.Zo.VH())) {
                if (z) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append(str);
                    stringBuffer.append("_AST_in");
                } else {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append(str);
                    stringBuffer.append("_AST");
                }
                str = stringBuffer.toString();
                if (actionTransInfo != null && !z) {
                    actionTransInfo.DW = str;
                }
            }
            return str;
        }
        if (str2 == u7) {
            Tool tool = this.j6;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Ambiguous reference to AST element ");
            stringBuffer3.append(str);
            stringBuffer3.append(" in rule ");
            stringBuffer3.append(this.Zo.VH());
            tool.j6(stringBuffer3.toString());
            return null;
        }
        if (!str2.equals(this.Zo.VH())) {
            if (!z) {
                return str2;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(str2);
            stringBuffer4.append("_in");
            return stringBuffer4.toString();
        }
        Tool tool2 = this.j6;
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("Ambiguous reference to AST element ");
        stringBuffer5.append(str);
        stringBuffer5.append(" in rule ");
        stringBuffer5.append(this.Zo.VH());
        tool2.j6(stringBuffer5.toString());
        return null;
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
        stringBuffer.append(tp);
        stringBuffer.append("RefAST(");
        stringBuffer.append(str);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
