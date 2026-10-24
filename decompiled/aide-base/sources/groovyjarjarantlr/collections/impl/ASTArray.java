package groovyjarjarantlr.collections.impl;

import groovyjarjarantlr.collections.AST;

/* loaded from: classes.dex */
public class ASTArray {
    public AST[] DW;
    public int j6 = 0;

    public ASTArray(int i) {
        this.DW = new AST[i];
    }

    public ASTArray j6(AST ast) {
        AST[] astArr = this.DW;
        int i = this.j6;
        this.j6 = i + 1;
        astArr[i] = ast;
        return this;
    }
}
