package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;

/* loaded from: classes.dex */
public class DiagnosticCodeGenerator extends CodeGenerator {
    public DiagnosticCodeGenerator() {
        new JavaCharFormatter();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String DW(GrammarAtom grammarAtom, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(str);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String FH(Vector vector) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("***Create an AST from a vector here***");
        stringBuffer.append(System.getProperty("line.separator"));
        return stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String VH(String str, ActionTransInfo actionTransInfo) {
        return str;
    }
}
