package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.Vector;

/* loaded from: classes.dex */
public class DocBookCodeGenerator extends CodeGenerator {
    public DocBookCodeGenerator() {
        new JavaCharFormatter();
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String DW(GrammarAtom grammarAtom, String str) {
        return null;
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String FH(Vector vector) {
        return null;
    }

    @Override // groovyjarjarantlr.CodeGenerator
    public String VH(String str, ActionTransInfo actionTransInfo) {
        return str;
    }
}
