package groovyjarjarantlr;

import groovyjarjarantlr.collections.AST;

/* loaded from: classes.dex */
public class CommonASTWithHiddenTokens extends CommonAST {
    protected CommonHiddenStreamToken AL;
    protected CommonHiddenStreamToken zh;

    public CommonHiddenStreamToken BT() {
        return this.zh;
    }

    @Override // groovyjarjarantlr.CommonAST, groovyjarjarantlr.collections.AST
    public void J0(Token token) {
        CommonHiddenStreamToken commonHiddenStreamToken = (CommonHiddenStreamToken) token;
        super.J0(commonHiddenStreamToken);
        this.zh = commonHiddenStreamToken.we();
        this.AL = commonHiddenStreamToken.EQ();
    }

    @Override // groovyjarjarantlr.CommonAST, groovyjarjarantlr.collections.AST
    public void aM(AST ast) {
        CommonASTWithHiddenTokens commonASTWithHiddenTokens = (CommonASTWithHiddenTokens) ast;
        this.zh = commonASTWithHiddenTokens.BT();
        this.AL = commonASTWithHiddenTokens.yS();
        super.aM(ast);
    }

    public CommonHiddenStreamToken yS() {
        return this.AL;
    }
}
