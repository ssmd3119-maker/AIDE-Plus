package groovyjarjarantlr;

import com.aide.uidesigner.ProxyTextView;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class ANTLRTokdefLexer extends CharScanner implements ANTLRTokdefParserTokenTypes, TokenStream {
    public static final BitSet EQ = new BitSet(vJ());
    public static final BitSet we = new BitSet(g3());
    public static final BitSet J0 = new BitSet(Mz());
    public static final BitSet J8 = new BitSet(I());

    private static final long[] I() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] Mz() {
        long[] jArr = new long[8];
        jArr[0] = -4398046512136L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] g3() {
        long[] jArr = new long[8];
        jArr[0] = -140737488355336L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] vJ() {
        long[] jArr = new long[8];
        jArr[0] = -9224;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    public final void KD(boolean z) throws NoViableAltForCharException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        switch (cDW) {
            case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                QX('A', 'Z');
                break;
            default:
                switch (cDW) {
                    case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        QX('a', 'z');
                        break;
                    default:
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
        }
        while (true) {
            char cDW2 = DW(1);
            if (cDW2 != '_') {
                switch (cDW2) {
                    case '0':
                    case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        QX('0', '9');
                        break;
                    default:
                        switch (cDW2) {
                            case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                                QX('A', 'Z');
                                break;
                            default:
                                switch (cDW2) {
                                    case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                        QX('a', 'z');
                                        break;
                                    default:
                                        if (z) {
                                            tokenTp = tp(4);
                                            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
                                        } else {
                                            tokenTp = null;
                                        }
                                        this.gn = tokenTp;
                                        return;
                                }
                        }
                }
            } else {
                we('_');
            }
        }
    }

    protected final void SI(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\\');
        char cDW = DW(1);
        if (cDW == '\"') {
            we('\"');
        } else if (cDW == '\'') {
            we('\'');
        } else if (cDW == '\\') {
            we('\\');
        } else if (cDW == 'b') {
            we('b');
        } else if (cDW == 'f') {
            we('f');
        } else if (cDW == 'n') {
            we('n');
        } else if (cDW == 'r') {
            we('r');
        } else if (cDW == 't') {
            we('t');
        } else if (cDW != 'u') {
            switch (cDW) {
                case '0':
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                case '2':
                case '3':
                    QX('0', '3');
                    if (DW(1) >= '0' && DW(1) <= '9' && DW(2) >= 3 && DW(2) <= 255) {
                        nw(false);
                        if (DW(1) >= '0' && DW(1) <= '9' && DW(2) >= 3 && DW(2) <= 255) {
                            nw(false);
                            break;
                        } else if (DW(1) < 3 || DW(1) > 255) {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                    } else if (DW(1) < 3 || DW(1) > 255) {
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                    }
                    break;
                case '4':
                case '5':
                case '6':
                case '7':
                    QX('4', '7');
                    if (DW(1) >= '0' && DW(1) <= '9' && DW(2) >= 3 && DW(2) <= 255) {
                        nw(false);
                        break;
                    } else if (DW(1) < 3 || DW(1) > 255) {
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                    }
                    break;
                default:
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
        } else {
            we('u');
            Sf(false);
            Sf(false);
            Sf(false);
            Sf(false);
        }
        if (z) {
            tokenTp = tp(13);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void Sf(boolean z) throws NoViableAltForCharException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        switch (cDW) {
            case '0':
            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                QX('0', '9');
                break;
            default:
                switch (cDW) {
                    case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                        QX('A', 'F');
                        break;
                    default:
                        switch (cDW) {
                            case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                QX('a', 'f');
                                break;
                            default:
                                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                }
        }
        if (z) {
            tokenTp = tp(15);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cb(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(')');
        if (z) {
            tokenTp = tp(8);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cn(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('(');
        if (z) {
            tokenTp = tp(7);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void dx(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        this.j6.Hw();
        J8("//");
        while (EQ.gn(DW(1))) {
            J0(EQ);
        }
        char cDW = DW(1);
        if (cDW == '\n') {
            we('\n');
        } else {
            if (cDW != '\r') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('\r');
            if (DW(1) == '\n') {
                we('\n');
            }
        }
        XL();
        this.gn = null;
    }

    public final void ef(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        this.j6.Hw();
        char cDW = DW(1);
        if (cDW == '\t') {
            we('\t');
        } else if (cDW == '\n') {
            we('\n');
            XL();
        } else if (cDW == '\r') {
            we('\r');
            if (DW(1) == '\n') {
                we('\n');
            }
            XL();
        } else {
            if (cDW != ' ') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we(' ');
        }
        this.gn = null;
    }

    public final void ei(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('=');
        if (z) {
            tokenTp = tp(6);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    @Override // groovyjarjarantlr.TokenStream
    public Token j6() throws TokenStreamException, NoViableAltForCharException {
        do {
            j3();
            try {
                try {
                    char cDW = DW(1);
                    if (cDW == '\t' || cDW == '\n' || cDW == '\r' || cDW == ' ') {
                        ef(true);
                    } else if (cDW == '\"') {
                        sG(true);
                    } else if (cDW == '=') {
                        ei(true);
                    } else if (cDW == '(') {
                        cn(true);
                    } else if (cDW != ')') {
                        switch (cDW) {
                            case '0':
                            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                ro(true);
                                break;
                            default:
                                switch (cDW) {
                                    default:
                                        switch (cDW) {
                                            case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                                            case 'b':
                                            case 'c':
                                            case 'd':
                                            case 'e':
                                            case 'f':
                                            case 'g':
                                            case 'h':
                                            case 'i':
                                            case 'j':
                                            case 'k':
                                            case 'l':
                                            case 'm':
                                            case 'n':
                                            case 'o':
                                            case 'p':
                                            case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                                            case 'r':
                                            case 's':
                                            case 't':
                                            case 'u':
                                            case 'v':
                                            case 'w':
                                            case 'x':
                                            case 'y':
                                            case 'z':
                                                break;
                                            default:
                                                if (DW(1) != '/' || DW(2) != '/') {
                                                    if (DW(1) == '/' && DW(2) == '*') {
                                                        sh(true);
                                                        break;
                                                    } else {
                                                        if (DW(1) != 65535) {
                                                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                                        }
                                                        P8();
                                                        this.gn = tp(1);
                                                        break;
                                                    }
                                                } else {
                                                    dx(true);
                                                    break;
                                                }
                                                break;
                                        }
                                    case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                        KD(true);
                                        break;
                                }
                        }
                    } else {
                        cb(true);
                    }
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

    protected final void nw(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        QX('0', '9');
        if (z) {
            tokenTp = tp(14);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ro(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 0;
        while (DW(1) >= '0' && DW(1) <= '9') {
            nw(false);
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(9);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sG(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\"');
        while (true) {
            if (DW(1) != '\\') {
                if (!J8.gn(DW(1))) {
                    break;
                } else {
                    Ws('\"');
                }
            } else {
                SI(false);
            }
        }
        we('\"');
        if (z) {
            tokenTp = tp(5);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sh(boolean z) throws MismatchedCharException {
        this.j6.Hw();
        J8("/*");
        while (true) {
            if (DW(1) == '*' && we.gn(DW(2))) {
                we('*');
                Ws('/');
            } else if (DW(1) == '\n') {
                we('\n');
                XL();
            } else {
                if (!J0.gn(DW(1))) {
                    J8("*/");
                    this.gn = null;
                    return;
                }
                Ws('*');
            }
        }
    }
}
