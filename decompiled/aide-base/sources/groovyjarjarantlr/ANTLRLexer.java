package groovyjarjarantlr;

import com.aide.uidesigner.ProxyTextView;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class ANTLRLexer extends CharScanner implements ANTLRTokenTypes, TokenStream {
    public static final BitSet EQ = new BitSet(jO());
    public static final BitSet we = new BitSet(oY());
    public static final BitSet J0 = new BitSet(ko());
    public static final BitSet J8 = new BitSet(Ev());
    public static final BitSet Ws = new BitSet(ye());

    static {
        WB();
    }

    private static final long[] Ev() {
        long[] jArr = new long[8];
        jArr[0] = -566935692296L;
        jArr[1] = -671088641;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] WB() {
        return new long[]{4294977024L, 0, 0, 0, 0};
    }

    private static final long[] jO() {
        long[] jArr = new long[8];
        jArr[0] = -9224;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] ko() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] oY() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] ye() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    public final void CU(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        QX('A', 'Z');
        while (true) {
            char cDW = DW(1);
            if (cDW != '_') {
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
                                        int iGW = gW(24);
                                        if (!z || iGW == -1) {
                                            tokenTp = null;
                                        } else {
                                            tokenTp = tp(iGW);
                                            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
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

    public final void Eq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('.');
        if (z) {
            tokenTp = tp(50);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void FN(boolean z) throws NoViableAltForCharException, MismatchedCharException {
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
            tokenTp = tp(58);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void I(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        int i;
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("/*");
        if (DW(1) == '*' && DW(2) >= 3 && DW(2) <= 255 && DW(2) != '/') {
            we('*');
            i = 8;
        } else {
            if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            i = 55;
        }
        while (true) {
            if (DW(1) == '*' && DW(2) == '/') {
                break;
            }
            if (DW(1) == '\r' && DW(2) == '\n') {
                we('\r');
                we('\n');
                XL();
            } else if (DW(1) == '\r' && DW(2) >= 3 && DW(2) <= 255) {
                we('\r');
                XL();
            } else if (EQ.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255) {
                J0(EQ);
            } else {
                if (DW(1) != '\n') {
                    break;
                }
                we('\n');
                XL();
            }
        }
        J8("*/");
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    public final void KD(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('!');
        if (z) {
            tokenTp = tp(33);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Mz(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('(');
        if (z) {
            tokenTp = tp(27);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void OW(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('?');
        if (z) {
            tokenTp = tp(45);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Qq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('~');
        if (z) {
            tokenTp = tp(42);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void SI(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('=');
        if (z) {
            tokenTp = tp(15);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Sf(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("=>");
        if (z) {
            tokenTp = tp(48);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void XG(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(';');
        if (z) {
            tokenTp = tp(16);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void XX(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('}');
        if (z) {
            tokenTp = tp(17);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Xa(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("#(");
        if (z) {
            tokenTp = tp(44);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void aj(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('|');
        if (z) {
            tokenTp = tp(21);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void aq(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        while (true) {
            char cDW = DW(1);
            if (cDW == '\t' || cDW == '\n' || cDW == '\r' || cDW == ' ') {
                hz(false);
            } else if (cDW != '/') {
                break;
            } else {
                sG(false);
            }
        }
        if (z) {
            tokenTp = tp(61);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void br(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("..");
        if (z) {
            tokenTp = tp(22);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ca(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('{');
        while (DW(1) != '}') {
            if ((DW(1) == '\n' || DW(1) == '\r') && DW(2) >= 3 && DW(2) <= 255) {
                if (DW(1) == '\r' && DW(2) == '\n') {
                    we('\r');
                    we('\n');
                    XL();
                } else if (DW(1) == '\r' && DW(2) >= 3 && DW(2) <= 255) {
                    we('\r');
                    XL();
                } else {
                    if (DW(1) != '\n') {
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                    }
                    we('\n');
                    XL();
                }
            } else if (DW(1) == '{' && DW(2) >= 3 && DW(2) <= 255) {
                ca(false);
            } else if (DW(1) == '\'' && Ws.gn(DW(2))) {
                cn(false);
            } else if (DW(1) == '/' && (DW(2) == '*' || DW(2) == '/')) {
                sG(false);
            } else if (DW(1) == '\"' && DW(2) >= 3 && DW(2) <= 255) {
                et(false);
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        we('}');
        if (z) {
            tokenTp = tp(60);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cb(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(':');
        if (z) {
            tokenTp = tp(36);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cn(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\'');
        if (DW(1) == '\\') {
            ef(false);
        } else {
            if (!we.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            Ws('\'');
        }
        we('\'');
        if (z) {
            tokenTp = tp(19);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void dx(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(',');
        if (z) {
            tokenTp = tp(38);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ef(boolean z) throws MismatchedCharException, NoViableAltForCharException {
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
        } else if (cDW == 'f') {
            we('f');
        } else if (cDW == 'n') {
            we('n');
        } else if (cDW == 'r') {
            we('r');
        } else if (cDW == 'w') {
            we('w');
        } else if (cDW == 'a') {
            we('a');
        } else if (cDW == 'b') {
            we('b');
        } else if (cDW == 't') {
            we('t');
        } else if (cDW != 'u') {
            switch (cDW) {
                case '0':
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                case '2':
                case '3':
                    QX('0', '3');
                    if (DW(1) >= '0' && DW(1) <= '7' && DW(2) >= 3 && DW(2) <= 255) {
                        QX('0', '7');
                        if (DW(1) >= '0' && DW(1) <= '7' && DW(2) >= 3 && DW(2) <= 255) {
                            QX('0', '7');
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
                    if (DW(1) >= '0' && DW(1) <= '7' && DW(2) >= 3 && DW(2) <= 255) {
                        QX('0', '7');
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
            FN(false);
            FN(false);
            FN(false);
            FN(false);
        }
        if (z) {
            tokenTp = tp(56);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ei(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        int i;
        int iHw = this.j6.Hw();
        int iGn = gn();
        int iZo = Zo();
        ca(false);
        if (DW(1) == '?') {
            we('?');
            i = 43;
        } else {
            i = 7;
        }
        if (i == 7) {
            rN(StringUtils.j6(u7(), "{", "}"));
        } else {
            rN(StringUtils.j6(u7(), "{", "}?"));
        }
        CommonToken commonToken = new CommonToken(i, new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        commonToken.gn(iGn);
        commonToken.VH(iZo);
        this.gn = commonToken;
    }

    public final void et(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\"');
        while (true) {
            if (DW(1) != '\\') {
                if (!J0.gn(DW(1))) {
                    break;
                } else {
                    Ws('\"');
                }
            } else {
                ef(false);
            }
        }
        we('\"');
        if (z) {
            tokenTp = tp(6);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final int g3(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        QX('a', 'z');
        while (true) {
            char cDW = DW(1);
            if (cDW != '_') {
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
                                        int iGW = gW(41);
                                        if (z) {
                                            tokenTp = tp(62);
                                            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
                                        } else {
                                            tokenTp = null;
                                        }
                                        this.gn = tokenTp;
                                        return iGW;
                                }
                        }
                }
            } else {
                we('_');
            }
        }
    }

    public final void hz(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        this.j6.Hw();
        char cDW = DW(1);
        if (cDW == '\t') {
            we('\t');
        } else if (cDW == '\n') {
            we('\n');
            XL();
        } else if (cDW == ' ') {
            we(' ');
        } else if (DW(1) == '\r' && DW(2) == '\n') {
            we('\r');
            we('\n');
            XL();
        } else {
            if (DW(1) != '\r') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('\r');
            XL();
        }
        this.gn = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9 A[Catch: CharStreamException -> 0x0110, RecognitionException -> 0x0112, TryCatch #1 {RecognitionException -> 0x0112, blocks: (B:3:0x0004, B:15:0x0020, B:16:0x0023, B:17:0x0026, B:18:0x0029, B:19:0x002c, B:20:0x002f, B:22:0x0038, B:24:0x003e, B:66:0x00fc, B:69:0x0102, B:25:0x0043, B:27:0x004b, B:29:0x0051, B:30:0x0056, B:32:0x005c, B:33:0x0061, B:35:0x0067, B:36:0x006c, B:38:0x0075, B:39:0x0080, B:40:0x0095, B:41:0x0096, B:42:0x009b, B:43:0x00a0, B:44:0x00a5, B:45:0x00a9, B:46:0x00ad, B:47:0x00b1, B:48:0x00b5, B:49:0x00b9, B:50:0x00bd, B:51:0x00c1, B:52:0x00c5, B:53:0x00c9, B:54:0x00cd, B:55:0x00d1, B:56:0x00d5, B:57:0x00d9, B:58:0x00dd, B:59:0x00e1, B:60:0x00e5, B:61:0x00e9, B:62:0x00ed, B:63:0x00f1, B:64:0x00f5, B:65:0x00f9), top: B:83:0x0004, outer: #0 }] */
    @Override // groovyjarjarantlr.TokenStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public groovyjarjarantlr.Token j6() throws groovyjarjarantlr.TokenStreamException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.ANTLRLexer.j6():groovyjarjarantlr.Token");
    }

    protected final void jJ(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("//");
        while (EQ.gn(DW(1))) {
            J0(EQ);
        }
        if (DW(1) == '\r' && DW(2) == '\n') {
            we('\r');
            we('\n');
        } else if (DW(1) == '\r') {
            we('\r');
        } else {
            if (DW(1) != '\n') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('\n');
        }
        XL();
        if (z) {
            tokenTp = tp(54);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void kQ(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(')');
        if (z) {
            tokenTp = tp(28);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void lp(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('+');
        if (z) {
            tokenTp = tp(47);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void nw(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        x9(false);
        rN(StringUtils.j6(u7(), "[", "]"));
        if (z) {
            tokenTp = tp(34);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ro(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('^');
        if (z) {
            tokenTp = tp(49);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sG(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        int iHw;
        Token tokenTp;
        int iHw2 = this.j6.Hw();
        if (DW(1) == '/' && DW(2) == '/') {
            jJ(false);
            iHw = 53;
        } else {
            if (DW(1) != '/' || DW(2) != '*') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            I(true);
            iHw = this.gn.Hw();
        }
        if (iHw != 8) {
            iHw = -1;
        }
        if (!z || iHw == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(iHw);
            tokenTp.u7(new String(this.j6.FH(), iHw2, this.j6.Hw() - iHw2));
        }
        this.gn = tokenTp;
    }

    public final void sh(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('>');
        if (z) {
            tokenTp = tp(26);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sy(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('<');
        if (z) {
            tokenTp = tp(25);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void vJ(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 0;
        while (DW(1) >= '0' && DW(1) <= '9') {
            QX('0', '9');
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(20);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void wc(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('*');
        if (z) {
            tokenTp = tp(46);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void x9(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('[');
        while (true) {
            char cDW = DW(1);
            if (cDW == '\n') {
                we('\n');
                XL();
            } else if (cDW == '\"') {
                et(false);
            } else if (cDW == '\'') {
                cn(false);
            } else if (cDW == '[') {
                x9(false);
            } else if (DW(1) == '\r' && DW(2) == '\n') {
                we('\r');
                we('\n');
                XL();
            } else if (DW(1) == '\r' && DW(2) >= 3 && DW(2) <= 255) {
                we('\r');
                XL();
            } else if (!J8.gn(DW(1))) {
                break;
            } else {
                Ws(']');
            }
        }
        we(']');
        if (z) {
            tokenTp = tp(59);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void yO(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int iG3 = g3(false);
        if (iG3 == 51) {
            aq(false);
            if (DW(1) == '{') {
                we('{');
                iG3 = 14;
            }
        } else if (iG3 == 4) {
            aq(false);
            if (DW(1) == '{') {
                we('{');
                iG3 = 23;
            }
        }
        if (!z || iG3 == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(iG3);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }
}
