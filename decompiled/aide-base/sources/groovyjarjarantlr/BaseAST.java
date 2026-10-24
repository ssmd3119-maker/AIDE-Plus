package groovyjarjarantlr;

import groovyjarjarantlr.collections.AST;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class BaseAST implements AST, Serializable {
    private static String[] fY;
    private static boolean jw;
    protected BaseAST WB;
    protected BaseAST mb;

    public int DW() {
        BaseAST baseAST = this.WB;
        if (baseAST == null) {
            return 0;
        }
        int i = 1;
        while (true) {
            baseAST = baseAST.mb;
            if (baseAST == null) {
                return i;
            }
            i++;
        }
    }

    @Override // groovyjarjarantlr.collections.AST
    public void Mr(int i) {
    }

    @Override // groovyjarjarantlr.collections.AST
    public void U2(AST ast) {
        this.WB = (BaseAST) ast;
    }

    @Override // groovyjarjarantlr.collections.AST
    public int Zo() {
        return 0;
    }

    @Override // groovyjarjarantlr.collections.AST
    public AST getFirstChild() {
        return this.WB;
    }

    @Override // groovyjarjarantlr.collections.AST
    public int getLine() {
        return 0;
    }

    @Override // groovyjarjarantlr.collections.AST
    public AST getNextSibling() {
        return this.mb;
    }

    @Override // groovyjarjarantlr.collections.AST
    public String getText() {
        return "";
    }

    @Override // groovyjarjarantlr.collections.AST
    public int getType() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (!jw || getText() == null || getText().equalsIgnoreCase(fY[getType()]) || getText().equalsIgnoreCase(StringUtils.j6(fY[getType()], "\"", "\""))) {
            return getText();
        }
        stringBuffer.append('[');
        stringBuffer.append(getText());
        stringBuffer.append(",<");
        stringBuffer.append(fY[getType()]);
        stringBuffer.append(">]");
        return stringBuffer.toString();
    }

    @Override // groovyjarjarantlr.collections.AST
    public void tp(AST ast) {
        this.mb = (BaseAST) ast;
    }

    @Override // groovyjarjarantlr.collections.AST
    public void we(AST ast) {
        if (ast == null) {
            return;
        }
        BaseAST baseAST = this.WB;
        if (baseAST == null) {
            this.WB = (BaseAST) ast;
            return;
        }
        while (true) {
            BaseAST baseAST2 = baseAST.mb;
            if (baseAST2 == null) {
                baseAST.mb = (BaseAST) ast;
                return;
            }
            baseAST = baseAST2;
        }
    }
}
