package groovyjarjarantlr;

import groovyjarjarantlr.collections.AST;

/* loaded from: classes.dex */
public class NoViableAltException extends RecognitionException {
    public Token fY;
    public AST qp;

    public NoViableAltException(Token token, String str) {
        super("NoViableAlt", str, token.FH(), token.Zo());
        this.fY = token;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.fY != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unexpected token: ");
            stringBuffer.append(this.fY.j6());
            return stringBuffer.toString();
        }
        if (this.qp == TreeParser.j6) {
            return "unexpected end of subtree";
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("unexpected AST node: ");
        stringBuffer2.append(this.qp.toString());
        return stringBuffer2.toString();
    }
}
