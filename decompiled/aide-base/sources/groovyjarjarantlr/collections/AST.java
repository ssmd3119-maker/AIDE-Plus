package groovyjarjarantlr.collections;

import groovyjarjarantlr.Token;

/* loaded from: classes.dex */
public interface AST {
    void J0(Token token);

    void Mr(int i);

    void U2(AST ast);

    int Zo();

    void a8(int i, String str);

    void aM(AST ast);

    AST getFirstChild();

    int getLine();

    AST getNextSibling();

    String getText();

    int getType();

    void tp(AST ast);

    void we(AST ast);
}
