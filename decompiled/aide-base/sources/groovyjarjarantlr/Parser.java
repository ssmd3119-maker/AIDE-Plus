package groovyjarjarantlr;

import groovyjarjarantlr.collections.AST;
import groovyjarjarantlr.collections.impl.BitSet;
import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class Parser {
    protected String[] DW;
    protected AST FH;
    protected ASTFactory Hw;
    protected ParserSharedInputState j6;
    protected Hashtable v5;

    public Parser() {
        this(new ParserSharedInputState());
    }

    public abstract Token DW(int i);

    public void EQ(int i) throws MismatchedTokenException {
        if (j6(1) == i) {
            throw new MismatchedTokenException(this.DW, DW(1), i, true, Zo());
        }
        FH();
    }

    public abstract void FH();

    public void J0(TokenBuffer tokenBuffer) {
        this.j6.j6 = tokenBuffer;
    }

    public Hashtable VH() {
        return this.v5;
    }

    public String Zo() {
        return this.j6.FH;
    }

    public AST getAST() {
        return this.FH;
    }

    public int gn() {
        return this.j6.j6.v5();
    }

    public abstract int j6(int i);

    public void tp(BitSet bitSet) throws MismatchedTokenException {
        if (!bitSet.gn(j6(1))) {
            throw new MismatchedTokenException(this.DW, DW(1), bitSet, false, Zo());
        }
        FH();
    }

    public void u7(int i) throws MismatchedTokenException {
        if (j6(1) != i) {
            throw new MismatchedTokenException(this.DW, DW(1), i, false, Zo());
        }
        FH();
    }

    public ASTFactory v5() {
        return this.Hw;
    }

    public void we(int i) {
        this.j6.j6.Zo(i);
    }

    public Parser(ParserSharedInputState parserSharedInputState) {
        this.Hw = null;
        this.v5 = null;
        this.j6 = parserSharedInputState;
    }
}
