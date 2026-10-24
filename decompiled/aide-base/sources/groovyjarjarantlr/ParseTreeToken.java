package groovyjarjarantlr;

/* loaded from: classes.dex */
public class ParseTreeToken extends ParseTree {
    protected Token qp;

    public ParseTreeToken(Token token) {
        this.qp = token;
    }

    @Override // groovyjarjarantlr.BaseAST
    public String toString() {
        Token token = this.qp;
        return token != null ? token.j6() : "<missing token>";
    }
}
