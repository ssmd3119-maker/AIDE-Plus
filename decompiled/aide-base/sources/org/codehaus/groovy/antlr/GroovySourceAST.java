package org.codehaus.groovy.antlr;

import groovyjarjarantlr.CommonAST;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.collections.AST;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class GroovySourceAST extends CommonAST implements Comparable, SourceInfo {
    private int AL;
    private int hK;
    private int w9;
    private int zh;

    public GroovySourceAST BT(int i) {
        for (AST firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getType() == i) {
                return (GroovySourceAST) firstChild;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // groovyjarjarantlr.CommonAST, groovyjarjarantlr.collections.AST
    public void J0(Token token) {
        super.J0(token);
        this.zh = token.FH();
        this.AL = token.Zo();
        if (token instanceof SourceInfo) {
            SourceInfo sourceInfo = (SourceInfo) token;
            this.w9 = sourceInfo.XL();
            this.hK = sourceInfo.rN();
        }
    }

    public void KD(int i) {
        this.w9 = i;
    }

    @Override // org.codehaus.groovy.antlr.SourceInfo
    public int XL() {
        return this.w9;
    }

    @Override // groovyjarjarantlr.BaseAST, groovyjarjarantlr.collections.AST
    public int Zo() {
        return this.AL;
    }

    @Override // groovyjarjarantlr.CommonAST, groovyjarjarantlr.collections.AST
    public void aM(AST ast) {
        super.aM(ast);
        this.zh = ast.getLine();
        this.AL = ast.Zo();
        if (ast instanceof GroovySourceAST) {
            GroovySourceAST groovySourceAST = (GroovySourceAST) ast;
            this.w9 = groovySourceAST.XL();
            this.hK = groovySourceAST.rN();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == null || !(obj instanceof AST)) {
            return 0;
        }
        AST ast = (AST) obj;
        if (getLine() < ast.getLine()) {
            return -1;
        }
        if (getLine() > ast.getLine()) {
            return 1;
        }
        if (Zo() < ast.Zo()) {
            return -1;
        }
        return Zo() > ast.Zo() ? 1 : 0;
    }

    @Override // groovyjarjarantlr.BaseAST, groovyjarjarantlr.collections.AST
    public int getLine() {
        return this.zh;
    }

    @Override // org.codehaus.groovy.antlr.SourceInfo
    public int rN() {
        return this.hK;
    }

    public void vy(int i) {
        this.hK = i;
    }

    public GroovySourceAST yS(int i) {
        ArrayList arrayList = new ArrayList();
        for (AST firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            arrayList.add(firstChild);
        }
        try {
            return (GroovySourceAST) arrayList.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
