package groovyjarjarantlr;

import groovyjarjarantlr.collections.AST;

/* loaded from: classes.dex */
public class CommonAST extends BaseAST {
    String k2;
    int qp = 0;

    @Override // groovyjarjarantlr.collections.AST
    public void J0(Token token) {
        v5(token.j6());
        Mr(token.Hw());
    }

    @Override // groovyjarjarantlr.BaseAST, groovyjarjarantlr.collections.AST
    public void Mr(int i) {
        this.qp = i;
    }

    @Override // groovyjarjarantlr.collections.AST
    public void a8(int i, String str) {
        Mr(i);
        v5(str);
    }

    @Override // groovyjarjarantlr.collections.AST
    public void aM(AST ast) {
        v5(ast.getText());
        Mr(ast.getType());
    }

    @Override // groovyjarjarantlr.BaseAST, groovyjarjarantlr.collections.AST
    public String getText() {
        return this.k2;
    }

    @Override // groovyjarjarantlr.BaseAST, groovyjarjarantlr.collections.AST
    public int getType() {
        return this.qp;
    }

    public void v5(String str) {
        this.k2 = str;
    }
}
