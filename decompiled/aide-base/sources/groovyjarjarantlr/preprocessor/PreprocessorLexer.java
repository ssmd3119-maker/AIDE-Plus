package groovyjarjarantlr.preprocessor;

import com.aide.uidesigner.ProxyTextView;
import groovyjarjarantlr.CharScanner;
import groovyjarjarantlr.MismatchedCharException;
import groovyjarjarantlr.NoViableAltForCharException;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.TokenStream;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class PreprocessorLexer extends CharScanner implements PreprocessorTokenTypes, TokenStream {
    public static final BitSet EQ = new BitSet(yO());
    public static final BitSet we = new BitSet(XG());
    public static final BitSet J0 = new BitSet(wc());
    public static final BitSet J8 = new BitSet(et());
    public static final BitSet Ws = new BitSet(CU());
    public static final BitSet QX = new BitSet(Xa());
    public static final BitSet XL = new BitSet(Eq());
    public static final BitSet aM = new BitSet(hz());
    public static final BitSet j3 = new BitSet(aq());
    public static final BitSet Mr = new BitSet(FN());
    public static final BitSet U2 = new BitSet(jJ());

    private static final long[] CU() {
        return new long[]{4294977024L, 1152921504606846976L, 0, 0, 0};
    }

    private static final long[] Eq() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] FN() {
        return new long[]{140758963201536L, 576460752303423488L, 0, 0, 0};
    }

    private static final long[] XG() {
        return new long[]{4294977024L, 0, 0, 0, 0};
    }

    private static final long[] Xa() {
        long[] jArr = new long[8];
        jArr[0] = -576605355262354440L;
        jArr[1] = -576460752303423489L;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] aq() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] et() {
        long[] jArr = new long[8];
        jArr[0] = -576462951326679048L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] hz() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] jJ() {
        return new long[]{140741783332352L, 576460752303423488L, 0, 0, 0};
    }

    private static final long[] wc() {
        long[] jArr = new long[8];
        jArr[0] = -2199023255560L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] yO() {
        long[] jArr = new long[8];
        jArr[0] = -576460752303423496L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    protected final void I(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("/*");
        while (true) {
            if (DW(1) == '*' && DW(2) == '/') {
                break;
            }
            if ((DW(1) == '\n' || DW(1) == '\r') && DW(2) >= 3 && DW(2) <= 255) {
                ca(false);
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        J8("*/");
        if (z) {
            tokenTp = tp(37);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void KD(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int iHw2 = this.j6.Hw();
        we('=');
        this.j6.v5(iHw2);
        while (DW(1) != ';') {
            if (DW(1) == '\"' && DW(2) >= 3 && DW(2) <= 255) {
                OW(false);
            } else if (DW(1) == '\'' && XL.gn(DW(2))) {
                cn(false);
            } else if ((DW(1) == '\n' || DW(1) == '\r') && DW(2) >= 3 && DW(2) <= 255) {
                ca(false);
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        we(';');
        if (z) {
            tokenTp = tp(14);
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
            tokenTp = tp(29);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void OW(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\"');
        while (true) {
            if (DW(1) != '\\') {
                if (!aM.gn(DW(1))) {
                    break;
                } else {
                    Ws('\"');
                }
            } else {
                Sf(false);
            }
        }
        we('\"');
        if (z) {
            tokenTp = tp(39);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Qq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(')');
        if (z) {
            tokenTp = tp(30);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void SI(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('[');
        while (DW(1) != ']') {
            if (DW(1) == '[' && DW(2) >= 3 && DW(2) <= 255) {
                SI(false);
            } else if ((DW(1) == '\n' || DW(1) == '\r') && DW(2) >= 3 && DW(2) <= 255) {
                ca(false);
            } else if (DW(1) == '\'' && XL.gn(DW(2))) {
                cn(false);
            } else if (DW(1) == '\"' && DW(2) >= 3 && DW(2) <= 255) {
                OW(false);
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        we(']');
        if (z) {
            tokenTp = tp(20);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void Sf(boolean z) throws MismatchedCharException, NoViableAltForCharException {
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
                    if (DW(1) >= '0' && DW(1) <= '9' && DW(2) >= 3 && DW(2) <= 255) {
                        sG(false);
                        if (DW(1) >= '0' && DW(1) <= '9' && DW(2) >= 3 && DW(2) <= 255) {
                            sG(false);
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
                        sG(false);
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
            kQ(false);
            kQ(false);
            kQ(false);
            kQ(false);
        }
        if (z) {
            tokenTp = tp(40);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void XX(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        this.j6.Hw();
        int i = 0;
        while (true) {
            if (DW(1) != ' ') {
                if (DW(1) != '\t') {
                    if (DW(1) != '\n' && DW(1) != '\r') {
                        break;
                    } else {
                        ca(false);
                    }
                } else {
                    we('\t');
                }
            } else {
                we(' ');
            }
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        this.gn = null;
    }

    public final void aj(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(';');
        if (z) {
            tokenTp = tp(11);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void br(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('(');
        if (we.gn(DW(1)) && EQ.gn(DW(2))) {
            XX(false);
        } else if (!EQ.gn(DW(1))) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        nw(false);
        while (Ws.gn(DW(1)) && EQ.gn(DW(2))) {
            char cDW = DW(1);
            if (cDW == '\t' || cDW == '\n' || cDW == '\r' || cDW == ' ') {
                XX(false);
            } else if (cDW != '|') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('|');
            if (we.gn(DW(1)) && EQ.gn(DW(2))) {
                XX(false);
            } else if (!EQ.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            nw(false);
        }
        char cDW2 = DW(1);
        if (cDW2 == '\t' || cDW2 == '\n' || cDW2 == '\r' || cDW2 == ' ') {
            XX(false);
        } else if (cDW2 != ')') {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        we(')');
        if (DW(1) == '=' && DW(2) == '>') {
            J8("=>");
        } else if (DW(1) == '*') {
            we('*');
        } else if (DW(1) == '+') {
            we('+');
        } else if (DW(1) == '?') {
            we('?');
        }
        if (z) {
            tokenTp = tp(6);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ca(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '\r' && DW(2) == '\n') {
            we('\r');
            we('\n');
            XL();
        } else if (DW(1) == '\r') {
            we('\r');
            XL();
        } else {
            if (DW(1) != '\n') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('\n');
            XL();
        }
        if (z) {
            tokenTp = tp(34);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cb(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        this.j6.Hw();
        if (DW(1) == '/' && DW(2) == '/') {
            lp(false);
        } else {
            if (DW(1) != '/' || DW(2) != '*') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            I(false);
        }
        this.gn = null;
    }

    public final void cn(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\'');
        if (DW(1) == '\\') {
            Sf(false);
        } else {
            if (!j3.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            Ws('\'');
        }
        we('\'');
        if (z) {
            tokenTp = tp(38);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void dx(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('{');
        while (DW(1) != '}') {
            if ((DW(1) == '\n' || DW(1) == '\r') && DW(2) >= 3 && DW(2) <= 255) {
                ca(false);
            } else if (DW(1) == '\"' && DW(2) >= 3 && DW(2) <= 255) {
                OW(false);
            } else if (DW(1) == '\'' && XL.gn(DW(2))) {
                cn(false);
            } else if (DW(1) == '/' && (DW(2) == '*' || DW(2) == '/')) {
                cb(false);
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        we('}');
        if (z) {
            tokenTp = tp(32);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ef(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == '\n' || cDW == '\r') {
            ca(false);
        } else if (cDW == '\"') {
            OW(false);
        } else if (cDW == '/') {
            cb(false);
        } else if (cDW == '{') {
            ei(false);
        } else if (cDW == '\'') {
            cn(false);
        } else if (cDW == '(') {
            br(false);
        } else {
            if (!QX.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            J0(QX);
        }
        if (z) {
            tokenTp = tp(28);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ei(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('{');
        while (DW(1) != '}') {
            if ((DW(1) == '\n' || DW(1) == '\r') && DW(2) >= 3 && DW(2) <= 255) {
                ca(false);
            } else if (DW(1) == '{' && DW(2) >= 3 && DW(2) <= 255) {
                ei(false);
            } else if (DW(1) == '\'' && XL.gn(DW(2))) {
                cn(false);
            } else if (DW(1) == '/' && (DW(2) == '*' || DW(2) == '/')) {
                cb(false);
            } else if (DW(1) == '\"' && DW(2) >= 3 && DW(2) <= 255) {
                OW(false);
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        we('}');
        if (z) {
            tokenTp = tp(7);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void g3(boolean z) throws NoViableAltForCharException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        vJ(true);
        Token token = this.gn;
        int iHw2 = token.Hw();
        if (Mr.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255 && token.j6().equals("header")) {
            if (we.gn(DW(1)) && Mr.gn(DW(2))) {
                XX(false);
            } else if (!Mr.gn(DW(1)) || DW(2) < 3 || DW(2) > 255) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            char cDW = DW(1);
            if (cDW != '\t' && cDW != '\n' && cDW != '\r' && cDW != ' ') {
                if (cDW == '\"') {
                    OW(false);
                } else if (cDW != '/' && cDW != '{') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
            }
            while (true) {
                char cDW2 = DW(1);
                if (cDW2 == '\t' || cDW2 == '\n' || cDW2 == '\r' || cDW2 == ' ') {
                    XX(false);
                } else if (cDW2 != '/') {
                    break;
                } else {
                    cb(false);
                }
            }
            ei(false);
            iHw2 = 5;
        } else if (U2.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255 && token.j6().equals("tokens")) {
            while (true) {
                char cDW3 = DW(1);
                if (cDW3 == '\t' || cDW3 == '\n' || cDW3 == '\r' || cDW3 == ' ') {
                    XX(false);
                } else if (cDW3 != '/') {
                    break;
                } else {
                    cb(false);
                }
            }
            dx(false);
            iHw2 = 12;
        } else if (U2.gn(DW(1)) && token.j6().equals("options")) {
            while (true) {
                char cDW4 = DW(1);
                if (cDW4 == '\t' || cDW4 == '\n' || cDW4 == '\r' || cDW4 == ' ') {
                    XX(false);
                } else if (cDW4 != '/') {
                    break;
                } else {
                    cb(false);
                }
            }
            we('{');
            iHw2 = 13;
        }
        if (!z || iHw2 == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(iHw2);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab A[Catch: CharStreamException -> 0x00de, RecognitionException -> 0x00e0, TryCatch #0 {RecognitionException -> 0x00e0, blocks: (B:3:0x0004, B:27:0x0038, B:28:0x003b, B:29:0x003e, B:30:0x0041, B:32:0x0049, B:34:0x0056, B:57:0x00c6, B:60:0x00cc, B:35:0x005b, B:37:0x0061, B:38:0x0066, B:40:0x006f, B:41:0x0079, B:42:0x008e, B:43:0x008f, B:44:0x0093, B:45:0x0097, B:46:0x009b, B:47:0x009f, B:48:0x00a3, B:49:0x00a7, B:50:0x00ab, B:51:0x00af, B:52:0x00b3, B:53:0x00b7, B:54:0x00bb, B:55:0x00bf, B:56:0x00c3), top: B:74:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[Catch: CharStreamException -> 0x00de, RecognitionException -> 0x00e0, TryCatch #0 {RecognitionException -> 0x00e0, blocks: (B:3:0x0004, B:27:0x0038, B:28:0x003b, B:29:0x003e, B:30:0x0041, B:32:0x0049, B:34:0x0056, B:57:0x00c6, B:60:0x00cc, B:35:0x005b, B:37:0x0061, B:38:0x0066, B:40:0x006f, B:41:0x0079, B:42:0x008e, B:43:0x008f, B:44:0x0093, B:45:0x0097, B:46:0x009b, B:47:0x009f, B:48:0x00a3, B:49:0x00a7, B:50:0x00ab, B:51:0x00af, B:52:0x00b3, B:53:0x00b7, B:54:0x00bb, B:55:0x00bf, B:56:0x00c3), top: B:74:0x0004, outer: #1 }] */
    @Override // groovyjarjarantlr.TokenStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public groovyjarjarantlr.Token j6() throws groovyjarjarantlr.TokenStreamException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.preprocessor.PreprocessorLexer.j6():groovyjarjarantlr.Token");
    }

    protected final void kQ(boolean z) throws NoViableAltForCharException, MismatchedCharException {
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
            tokenTp = tp(42);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void lp(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("//");
        while (DW(1) != '\n' && DW(1) != '\r' && DW(1) >= 3 && DW(1) <= 255 && DW(2) >= 3 && DW(2) <= 255) {
            Ws((char) 65535);
        }
        ca(false);
        if (z) {
            tokenTp = tp(36);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void nw(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        while (J8.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255) {
            ef(false);
        }
        if (z) {
            tokenTp = tp(27);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ro(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('!');
        if (z) {
            tokenTp = tp(19);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void sG(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        QX('0', '9');
        if (z) {
            tokenTp = tp(41);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sh(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(',');
        if (z) {
            tokenTp = tp(24);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sy(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(':');
        if (we.gn(DW(1)) && J0.gn(DW(2))) {
            int iHw2 = this.j6.Hw();
            XX(false);
            this.j6.v5(iHw2);
        } else if (!J0.gn(DW(1))) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        nw(false);
        char cDW = DW(1);
        if (cDW == '\t' || cDW == '\n' || cDW == '\r' || cDW == ' ') {
            int iHw3 = this.j6.Hw();
            XX(false);
            this.j6.v5(iHw3);
        } else if (cDW != ';' && cDW != '|') {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        while (DW(1) == '|') {
            we('|');
            if (we.gn(DW(1)) && J0.gn(DW(2))) {
                int iHw4 = this.j6.Hw();
                XX(false);
                this.j6.v5(iHw4);
            } else if (!J0.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            nw(false);
            char cDW2 = DW(1);
            if (cDW2 == '\t' || cDW2 == '\n' || cDW2 == '\r' || cDW2 == ' ') {
                int iHw5 = this.j6.Hw();
                XX(false);
                this.j6.v5(iHw5);
            } else if (cDW2 != ';' && cDW2 != '|') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
        }
        we(';');
        if (z) {
            tokenTp = tp(22);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void vJ(boolean z) throws NoViableAltForCharException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        switch (DW(1)) {
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
            case '[':
            case '\\':
            case ']':
            case '^':
            case '`':
            default:
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            case '_':
                we('_');
                break;
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
        }
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
                                        int iBT = BT(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw), 9);
                                        if (!z || iBT == -1) {
                                            tokenTp = null;
                                        } else {
                                            tokenTp = tp(iBT);
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

    public final void x9(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('}');
        if (z) {
            tokenTp = tp(15);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }
}
