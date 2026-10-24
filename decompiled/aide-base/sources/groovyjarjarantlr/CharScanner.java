package groovyjarjarantlr;

import groovyjarjarantlr.collections.impl.BitSet;
import java.io.PrintStream;
import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class CharScanner implements TokenStream {
    protected boolean DW;
    protected Class FH;
    protected boolean Hw;
    protected int VH;
    protected Hashtable Zo;
    protected Token gn;
    protected ANTLRStringBuffer j6;
    protected LexerSharedInputState tp;
    protected ANTLRHashString u7;
    protected boolean v5;

    public CharScanner() {
        this.DW = true;
        this.Hw = true;
        this.v5 = true;
        this.VH = 8;
        this.gn = null;
        this.j6 = new ANTLRStringBuffer();
        this.u7 = new ANTLRHashString(this);
        er("groovyjarjarantlr.CommonToken");
    }

    public int BT(String str, int i) {
        Integer num = (Integer) this.Zo.get(new ANTLRHashString(str, this));
        return num != null ? num.intValue() : i;
    }

    public char DW(int i) {
        return this.Hw ? this.tp.v5.j6(i) : vy(this.tp.v5.j6(i));
    }

    public int EQ() {
        return this.tp.v5.Hw();
    }

    public void FH(char c) {
        if (this.DW) {
            this.j6.j6(c);
        }
    }

    public void Hw() {
        if (this.tp.VH == 0) {
            char cDW = DW(1);
            if (this.Hw) {
                FH(cDW);
            } else {
                FH(this.tp.v5.j6(1));
            }
            if (cDW == '\t') {
                yS();
            } else {
                this.tp.j6++;
            }
        }
        this.tp.v5.DW();
    }

    public void J0(BitSet bitSet) throws MismatchedCharException {
        if (!bitSet.gn(DW(1))) {
            throw new MismatchedCharException(DW(1), bitSet, false, this);
        }
        Hw();
    }

    public void J8(String str) throws MismatchedCharException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (DW(1) != str.charAt(i)) {
                throw new MismatchedCharException(DW(1), str.charAt(i), false, this);
            }
            Hw();
        }
    }

    public void Mr(int i) {
        this.tp.v5.v5(i);
    }

    public void P8() {
    }

    public void QX(char c, char c2) throws MismatchedCharException {
        if (DW(1) < c || DW(1) > c2) {
            throw new MismatchedCharException(DW(1), c, c2, false, this);
        }
        Hw();
    }

    public void U2(boolean z) {
        this.Hw = z;
    }

    public String VH() {
        return this.tp.Zo;
    }

    public void Ws(char c) throws MismatchedCharException {
        if (DW(1) == c) {
            throw new MismatchedCharException(DW(1), c, true, this);
        }
        Hw();
    }

    public void XL() {
        LexerSharedInputState lexerSharedInputState = this.tp;
        lexerSharedInputState.DW++;
        lexerSharedInputState.j6 = 1;
    }

    public int Zo() {
        return this.tp.j6;
    }

    public void a8(int i) {
        this.tp.j6 = i;
    }

    public void aM(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CharScanner; panic: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
        Utils.j6(str);
        throw null;
    }

    public void er(String str) {
        try {
            this.FH = Utils.DW(str);
        } catch (ClassNotFoundException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ClassNotFoundException: ");
            stringBuffer.append(str);
            aM(stringBuffer.toString());
            throw null;
        }
    }

    public int gW(int i) {
        this.u7.FH(this.j6.FH(), this.j6.Hw());
        Integer num = (Integer) this.Zo.get(this.u7);
        return num != null ? num.intValue() : i;
    }

    public int gn() {
        return this.tp.DW;
    }

    public void j3() {
        this.j6.v5(0);
        LexerSharedInputState lexerSharedInputState = this.tp;
        lexerSharedInputState.FH = lexerSharedInputState.j6;
        lexerSharedInputState.Hw = lexerSharedInputState.DW;
    }

    public void lg(int i) {
        this.VH = i;
    }

    public void rN(String str) {
        j3();
        this.j6.DW(str);
    }

    protected Token tp(int i) {
        try {
            Token token = (Token) this.FH.newInstance();
            token.tp(i);
            token.VH(this.tp.FH);
            token.gn(this.tp.Hw);
            return token;
        } catch (IllegalAccessException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Token class is not accessible");
            stringBuffer.append(this.FH);
            aM(stringBuffer.toString());
            throw null;
        } catch (InstantiationException unused2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("can't instantiate token: ");
            stringBuffer2.append(this.FH);
            aM(stringBuffer2.toString());
            throw null;
        }
    }

    public String u7() {
        return this.j6.toString();
    }

    public final boolean v5() {
        return this.v5;
    }

    public char vy(char c) {
        return Character.toLowerCase(c);
    }

    public void we(char c) throws MismatchedCharException {
        if (DW(1) != c) {
            throw new MismatchedCharException(DW(1), c, false, this);
        }
        Hw();
    }

    public void yS() {
        int iZo = Zo() - 1;
        int i = this.VH;
        a8((((iZo / i) + 1) * i) + 1);
    }

    public CharScanner(LexerSharedInputState lexerSharedInputState) {
        this();
        this.tp = lexerSharedInputState;
    }
}
