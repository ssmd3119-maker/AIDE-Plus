package org.codehaus.groovy.syntax;

import org.codehaus.groovy.GroovyBugError;

/* loaded from: classes.dex */
public class Token extends CSTNode {
    public static final Token Zo = new Token();
    private int DW;
    private String FH;
    private int Hw;
    private int j6;
    private int v5;

    static {
        new Token(-1, "", -1, -1);
    }

    public Token(int i, String str, int i2, int i3) {
        this.j6 = 0;
        this.DW = 0;
        this.FH = "";
        this.Hw = -1;
        this.v5 = -1;
        this.j6 = i;
        this.DW = i;
        this.FH = str;
        this.Hw = i2;
        this.v5 = i3;
    }

    public static Token QX(String str, int i, int i2) {
        return new Token(Types.VH(str), str, i, i2);
    }

    public static Token Ws(int i, int i2, int i3) {
        return new Token(i, Types.v5(i), i2, i3);
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public CSTNode DW(int i) {
        if (i <= 0) {
            return this;
        }
        throw new GroovyBugError("attempt to access Token element other than root");
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public Token Hw() {
        return this;
    }

    public String J0() {
        return this.FH;
    }

    public int J8() {
        return this.j6;
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public int VH() {
        return this.Hw;
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public int Zo() {
        return this.v5;
    }

    @Override // org.codehaus.groovy.syntax.CSTNode
    public int u7() {
        return 1;
    }

    public int we() {
        return this.DW;
    }

    private Token() {
        this.j6 = 0;
        this.DW = 0;
        this.FH = "";
        this.Hw = -1;
        this.v5 = -1;
    }
}
