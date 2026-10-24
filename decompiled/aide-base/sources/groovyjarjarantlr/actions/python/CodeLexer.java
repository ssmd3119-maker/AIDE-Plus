package groovyjarjarantlr.actions.python;

import groovyjarjarantlr.CharScanner;
import groovyjarjarantlr.CharStreamException;
import groovyjarjarantlr.CharStreamIOException;
import groovyjarjarantlr.MismatchedCharException;
import groovyjarjarantlr.NoViableAltForCharException;
import groovyjarjarantlr.RecognitionException;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.TokenStream;
import groovyjarjarantlr.TokenStreamException;
import groovyjarjarantlr.TokenStreamIOException;
import groovyjarjarantlr.TokenStreamRecognitionException;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class CodeLexer extends CharScanner implements CodeLexerTokenTypes, TokenStream {
    public static final BitSet EQ = new BitSet(sh());
    public static final BitSet we = new BitSet(cb());

    private static final long[] cb() {
        long[] jArr = new long[8];
        jArr[0] = -140737488364552L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] sh() {
        long[] jArr = new long[8];
        jArr[0] = -145135534866440L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    protected final void KD(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int iHw2 = this.j6.Hw();
        J8("/*");
        this.j6.v5(iHw2);
        this.j6.DW("#");
        while (true) {
            if (DW(1) == '*' && DW(2) == '/') {
                break;
            }
            if (DW(1) == '\r' && DW(2) == '\n') {
                we('\r');
                we('\n');
                int iHw3 = this.j6.Hw();
                SI(false);
                this.j6.v5(iHw3);
                XL();
                this.j6.DW("# ");
            } else if (DW(1) == '\r' && DW(2) >= 3 && DW(2) <= 255) {
                we('\r');
                int iHw4 = this.j6.Hw();
                SI(false);
                this.j6.v5(iHw4);
                XL();
                this.j6.DW("# ");
            } else if (DW(1) == '\n' && DW(2) >= 3 && DW(2) <= 255) {
                we('\n');
                int iHw5 = this.j6.Hw();
                SI(false);
                this.j6.v5(iHw5);
                XL();
                this.j6.DW("# ");
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        this.j6.DW("\n");
        int iHw6 = this.j6.Hw();
        J8("*/");
        this.j6.v5(iHw6);
        if (z) {
            tokenTp = tp(9);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void SI(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        while (true) {
            if (DW(1) == ' ' && DW(2) >= 3 && DW(2) <= 255) {
                we(' ');
            } else if (DW(1) != '\t' || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                we('\t');
            }
        }
        if (z) {
            tokenTp = tp(8);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void cn(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '/' && (DW(2) == '*' || DW(2) == '/')) {
            nw(false);
        } else if (DW(1) == '\r' && DW(2) == '\n') {
            J8("\r\n");
            XL();
        } else if (DW(1) == '/' && EQ.gn(DW(2))) {
            we('/');
            J0(EQ);
        } else if (DW(1) == '\r') {
            we('\r');
            XL();
        } else if (DW(1) == '\n') {
            we('\n');
            XL();
        } else {
            if (!we.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            J0(we);
        }
        if (z) {
            tokenTp = tp(5);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ei(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        while (DW(1) >= 3 && DW(1) <= 255) {
            cn(false);
        }
        if (z) {
            tokenTp = tp(4);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    @Override // groovyjarjarantlr.TokenStream
    public Token j6() throws TokenStreamException {
        do {
            j3();
            try {
                try {
                    ei(true);
                } catch (RecognitionException e) {
                    throw new TokenStreamRecognitionException(e);
                }
            } catch (CharStreamException e2) {
                if (e2 instanceof CharStreamIOException) {
                    throw new TokenStreamIOException(((CharStreamIOException) e2).WB);
                }
                throw new TokenStreamException(e2.getMessage());
            }
        } while (this.gn == null);
        this.gn.tp(this.gn.Hw());
        return this.gn;
    }

    protected final void nw(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '/' && DW(2) == '/') {
            ro(false);
        } else {
            if (DW(1) != '/' || DW(2) != '*') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            KD(false);
        }
        if (z) {
            tokenTp = tp(6);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ro(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int iHw2 = this.j6.Hw();
        J8("//");
        this.j6.v5(iHw2);
        this.j6.DW("#");
        while (DW(1) != '\n' && DW(1) != '\r' && DW(1) >= 3 && DW(1) <= 255 && DW(2) >= 3 && DW(2) <= 255) {
            Ws((char) 65535);
        }
        if (DW(1) == '\r' && DW(2) == '\n') {
            J8("\r\n");
        } else if (DW(1) == '\n') {
            we('\n');
        } else {
            if (DW(1) != '\r') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('\r');
        }
        XL();
        if (z) {
            tokenTp = tp(7);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }
}
