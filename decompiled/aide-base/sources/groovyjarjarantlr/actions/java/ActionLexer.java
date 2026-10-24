package groovyjarjarantlr.actions.java;

import com.aide.uidesigner.ProxyTextView;
import groovyjarjarantlr.ActionTransInfo;
import groovyjarjarantlr.CharScanner;
import groovyjarjarantlr.CharStreamException;
import groovyjarjarantlr.CharStreamIOException;
import groovyjarjarantlr.CodeGenerator;
import groovyjarjarantlr.MismatchedCharException;
import groovyjarjarantlr.NoViableAltForCharException;
import groovyjarjarantlr.RecognitionException;
import groovyjarjarantlr.RuleBlock;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.TokenStream;
import groovyjarjarantlr.TokenStreamException;
import groovyjarjarantlr.TokenStreamIOException;
import groovyjarjarantlr.TokenStreamRecognitionException;
import groovyjarjarantlr.Tool;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class ActionLexer extends CharScanner implements ActionLexerTokenTypes, TokenStream {
    protected RuleBlock EQ;
    private Tool J0;
    ActionTransInfo J8;
    protected CodeGenerator we;
    public static final BitSet Ws = new BitSet(kQ());
    public static final BitSet QX = new BitSet(yO());
    public static final BitSet XL = new BitSet(jO());
    public static final BitSet aM = new BitSet(jw());
    public static final BitSet j3 = new BitSet(fY());
    public static final BitSet Mr = new BitSet(qp());
    public static final BitSet U2 = new BitSet(k2());
    public static final BitSet a8 = new BitSet(zh());
    public static final BitSet lg = new BitSet(AL());
    public static final BitSet rN = new BitSet(w9());
    public static final BitSet er = new BitSet(XG());
    public static final BitSet yS = new BitSet(jJ());
    public static final BitSet gW = new BitSet(wc());
    public static final BitSet BT = new BitSet(et());
    public static final BitSet vy = new BitSet(CU());
    public static final BitSet P8 = new BitSet(Xa());
    public static final BitSet ei = new BitSet(Eq());
    public static final BitSet nw = new BitSet(hz());
    public static final BitSet SI = new BitSet(aq());
    public static final BitSet KD = new BitSet(FN());
    public static final BitSet ro = new BitSet(oY());
    public static final BitSet cn = new BitSet(ko());
    public static final BitSet sh = new BitSet(Ev());
    public static final BitSet cb = new BitSet(ye());
    public static final BitSet dx = new BitSet(WB());
    public static final BitSet sG = new BitSet(mb());

    private static final long[] AL() {
        long[] jArr = new long[8];
        jArr[0] = -549755813896L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] CU() {
        return new long[]{287952805300282880L, 576460746129407998L, 0, 0, 0};
    }

    private static final long[] Eq() {
        return new long[]{2306051920717948416L, 536870912, 0, 0, 0};
    }

    private static final long[] Ev() {
        return new long[]{287960536241415680L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] FN() {
        return new long[]{189120294954496L, 0, 0, 0, 0};
    }

    private static final long[] WB() {
        return new long[]{288228817078593024L, 576460746532061182L, 0, 0, 0};
    }

    private static final long[] XG() {
        return new long[]{287950056521213440L, 576460746129407998L, 0, 0, 0};
    }

    private static final long[] Xa() {
        return new long[]{2305843013508670976L, 0, 0, 0, 0};
    }

    private static final long[] aq() {
        return new long[]{1151051235328L, 576460746129407998L, 0, 0, 0};
    }

    private static final long[] et() {
        return new long[]{2306123388973753856L, 671088640, 0, 0, 0};
    }

    private static final long[] fY() {
        return new long[]{4294977024L, 0, 0, 0, 0};
    }

    private static final long[] hz() {
        return new long[]{208911504254464L, 536870912, 0, 0, 0};
    }

    private static final long[] jJ() {
        return new long[]{287958332923183104L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] jO() {
        long[] jArr = new long[8];
        jArr[0] = -141407503262728L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] jw() {
        return new long[]{0, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] k2() {
        return new long[]{287959436729787904L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] kQ() {
        long[] jArr = new long[8];
        jArr[0] = -103079215112L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] ko() {
        return new long[]{288049596683265536L, 576460746666278910L, 0, 0, 0};
    }

    private static final long[] mb() {
        return new long[]{288158448334415360L, 576460746532061182L, 0, 0, 0};
    }

    private static final long[] oY() {
        return new long[]{288139722277004800L, 576460746129407998L, 0, 0, 0};
    }

    private static final long[] qp() {
        return new long[]{1103806604800L, 0, 0, 0, 0};
    }

    private static final long[] w9() {
        return new long[]{287948901175001088L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] wc() {
        return new long[]{287978128427460096L, 576460746532061182L, 0, 0, 0};
    }

    private static final long[] yO() {
        long[] jArr = new long[8];
        jArr[0] = -145135534866440L;
        for (int i = 1; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] ye() {
        return new long[]{287958337218160128L, 576460745995190270L, 0, 0, 0};
    }

    private static final long[] zh() {
        long[] jArr = new long[8];
        jArr[0] = -17179869192L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 3; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    protected final void I(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\"');
        while (true) {
            if (DW(1) != '\\') {
                if (!a8.gn(DW(1))) {
                    break;
                } else {
                    Ws('\"');
                }
            } else {
                dx(false);
            }
        }
        we('\"');
        if (z) {
            tokenTp = tp(23);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void KD(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '\"' && DW(2) >= 3 && DW(2) <= 255 && DW(3) >= 3 && DW(3) <= 255) {
            I(false);
        } else if (SI.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255) {
            OW(false);
        } else {
            if (DW(1) < '0' || DW(1) > '9') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            Sf(false);
        }
        if (z) {
            tokenTp = tp(11);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void Mz(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("//");
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
            tokenTp = tp(20);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void OW(boolean r9) throws groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.actions.java.ActionLexer.OW(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void Qq(boolean r6) throws groovyjarjarantlr.NoViableAltForCharException, groovyjarjarantlr.MismatchedCharException {
        /*
            r5 = this;
            groovyjarjarantlr.ANTLRStringBuffer r0 = r5.j6
            int r0 = r0.Hw()
            r1 = 1
            char r2 = r5.DW(r1)
            r3 = 34
            r4 = 0
            if (r2 == r3) goto L53
            r3 = 36
            if (r2 == r3) goto L4f
            r3 = 39
            if (r2 == r3) goto L4b
            r3 = 43
            if (r2 == r3) goto L47
            r3 = 95
            if (r2 == r3) goto L43
            switch(r2) {
                case 48: goto L3f;
                case 49: goto L3f;
                case 50: goto L3f;
                case 51: goto L3f;
                case 52: goto L3f;
                case 53: goto L3f;
                case 54: goto L3f;
                case 55: goto L3f;
                case 56: goto L3f;
                case 57: goto L3f;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 65: goto L43;
                case 66: goto L43;
                case 67: goto L43;
                case 68: goto L43;
                case 69: goto L43;
                case 70: goto L43;
                case 71: goto L43;
                case 72: goto L43;
                case 73: goto L43;
                case 74: goto L43;
                case 75: goto L43;
                case 76: goto L43;
                case 77: goto L43;
                case 78: goto L43;
                case 79: goto L43;
                case 80: goto L43;
                case 81: goto L43;
                case 82: goto L43;
                case 83: goto L43;
                case 84: goto L43;
                case 85: goto L43;
                case 86: goto L43;
                case 87: goto L43;
                case 88: goto L43;
                case 89: goto L43;
                case 90: goto L43;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 97: goto L43;
                case 98: goto L43;
                case 99: goto L43;
                case 100: goto L43;
                case 101: goto L43;
                case 102: goto L43;
                case 103: goto L43;
                case 104: goto L43;
                case 105: goto L43;
                case 106: goto L43;
                case 107: goto L43;
                case 108: goto L43;
                case 109: goto L43;
                case 110: goto L43;
                case 111: goto L43;
                case 112: goto L43;
                case 113: goto L43;
                case 114: goto L43;
                case 115: goto L43;
                case 116: goto L43;
                case 117: goto L43;
                case 118: goto L43;
                case 119: goto L43;
                case 120: goto L43;
                case 121: goto L43;
                case 122: goto L43;
                default: goto L29;
            }
        L29:
            groovyjarjarantlr.NoViableAltForCharException r6 = new groovyjarjarantlr.NoViableAltForCharException
            char r0 = r5.DW(r1)
            java.lang.String r1 = r5.VH()
            int r2 = r5.gn()
            int r3 = r5.Zo()
            r6.<init>(r0, r1, r2, r3)
            throw r6
        L3f:
            r5.vJ(r4)
            goto L56
        L43:
            r5.sy(r4)
            goto L56
        L47:
            r5.we(r3)
            goto L56
        L4b:
            r5.cn(r4)
            goto L56
        L4f:
            r5.aj(r4)
            goto L56
        L53:
            r5.I(r4)
        L56:
            if (r6 == 0) goto L74
            r6 = 14
            groovyjarjarantlr.Token r6 = r5.tp(r6)
            java.lang.String r1 = new java.lang.String
            groovyjarjarantlr.ANTLRStringBuffer r2 = r5.j6
            char[] r2 = r2.FH()
            groovyjarjarantlr.ANTLRStringBuffer r3 = r5.j6
            int r3 = r3.Hw()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r6.u7(r1)
            goto L75
        L74:
            r6 = 0
        L75:
            r5.gn = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.actions.java.ActionLexer.Qq(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0207 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void SI(boolean r17) throws groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.actions.java.ActionLexer.SI(boolean):void");
    }

    protected final void Sf(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 0;
        while (DW(1) >= '0' && DW(1) <= '9') {
            cb(false);
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(26);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void XX(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 0;
        while (true) {
            if (DW(1) != '\r' || DW(2) != '\n') {
                if (DW(1) != ' ') {
                    if (DW(1) != '\t') {
                        if (DW(1) != '\r') {
                            if (DW(1) != '\n') {
                                break;
                            }
                            we('\n');
                            XL();
                        } else {
                            we('\r');
                            XL();
                        }
                    } else {
                        we('\t');
                    }
                } else {
                    we(' ');
                }
            } else {
                we('\r');
                we('\n');
                XL();
            }
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(28);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void aj(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token token;
        Token tokenTp;
        Token token2;
        int iHw = this.j6.Hw();
        if (DW(1) == '$' && DW(2) == 'F' && DW(3) == 'O') {
            J8("$FOLLOW");
            if (!Mr.gn(DW(1)) || !U2.gn(DW(2)) || DW(3) < 3 || DW(3) > 255) {
                token2 = null;
            } else {
                char cDW = DW(1);
                if (cDW == '\t' || cDW == '\n' || cDW == '\r' || cDW == ' ') {
                    XX(false);
                } else if (cDW != '(') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                we('(');
                x9(true);
                token2 = this.gn;
                we(')');
            }
            String strVH = this.EQ.VH();
            if (token2 != null) {
                strVH = token2.j6();
            }
            String strZo = this.we.Zo(strVH, 1);
            if (strZo == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("$FOLLOW(");
                stringBuffer.append(strVH);
                stringBuffer.append(")");
                stringBuffer.append(": unknown rule or bad lookahead computation");
                hK(stringBuffer.toString());
            } else {
                this.j6.v5(iHw);
                this.j6.DW(strZo);
            }
        } else if (DW(1) == '$' && DW(2) == 'F' && DW(3) == 'I') {
            J8("$FIRST");
            if (!Mr.gn(DW(1)) || !U2.gn(DW(2)) || DW(3) < 3 || DW(3) > 255) {
                token = null;
            } else {
                char cDW2 = DW(1);
                if (cDW2 == '\t' || cDW2 == '\n' || cDW2 == '\r' || cDW2 == ' ') {
                    XX(false);
                } else if (cDW2 != '(') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                we('(');
                x9(true);
                token = this.gn;
                we(')');
            }
            String strVH2 = this.EQ.VH();
            if (token != null) {
                strVH2 = token.j6();
            }
            String strV5 = this.we.v5(strVH2, 1);
            if (strV5 == null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("$FIRST(");
                stringBuffer2.append(strVH2);
                stringBuffer2.append(")");
                stringBuffer2.append(": unknown rule or bad lookahead computation");
                hK(stringBuffer2.toString());
            } else {
                this.j6.v5(iHw);
                this.j6.DW(strV5);
            }
        } else if (DW(1) == '$' && DW(2) == 'a') {
            J8("$append");
            char cDW3 = DW(1);
            if (cDW3 == '\t' || cDW3 == '\n' || cDW3 == '\r' || cDW3 == ' ') {
                XX(false);
            } else if (cDW3 != '(') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('(');
            x9(true);
            Token token3 = this.gn;
            we(')');
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("text.append(");
            stringBuffer3.append(token3.j6());
            stringBuffer3.append(")");
            String string = stringBuffer3.toString();
            this.j6.v5(iHw);
            this.j6.DW(string);
        } else if (DW(1) == '$' && DW(2) == 's') {
            J8("$set");
            if (DW(1) == 'T' && DW(2) == 'e') {
                J8("Text");
                char cDW4 = DW(1);
                if (cDW4 == '\t' || cDW4 == '\n' || cDW4 == '\r' || cDW4 == ' ') {
                    XX(false);
                } else if (cDW4 != '(') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                we('(');
                x9(true);
                Token token4 = this.gn;
                we(')');
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("text.setLength(_begin); text.append(");
                stringBuffer4.append(token4.j6());
                stringBuffer4.append(")");
                String string2 = stringBuffer4.toString();
                this.j6.v5(iHw);
                this.j6.DW(string2);
            } else if (DW(1) == 'T' && DW(2) == 'o') {
                J8("Token");
                char cDW5 = DW(1);
                if (cDW5 == '\t' || cDW5 == '\n' || cDW5 == '\r' || cDW5 == ' ') {
                    XX(false);
                } else if (cDW5 != '(') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                we('(');
                x9(true);
                Token token5 = this.gn;
                we(')');
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("_token = ");
                stringBuffer5.append(token5.j6());
                String string3 = stringBuffer5.toString();
                this.j6.v5(iHw);
                this.j6.DW(string3);
            } else {
                if (DW(1) != 'T' || DW(2) != 'y') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                J8("Type");
                char cDW6 = DW(1);
                if (cDW6 == '\t' || cDW6 == '\n' || cDW6 == '\r' || cDW6 == ' ') {
                    XX(false);
                } else if (cDW6 != '(') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                we('(');
                x9(true);
                Token token6 = this.gn;
                we(')');
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("_ttype = ");
                stringBuffer6.append(token6.j6());
                String string4 = stringBuffer6.toString();
                this.j6.v5(iHw);
                this.j6.DW(string4);
            }
        } else {
            if (DW(1) != '$' || DW(2) != 'g') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            J8("$getText");
            this.j6.v5(iHw);
            this.j6.DW("new String(text.getBuffer(),_begin,text.length()-_begin)");
        }
        if (z) {
            tokenTp = tp(7);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void br(boolean z) throws MismatchedCharException {
        Token tokenTp;
        ActionTransInfo actionTransInfo;
        int iHw = this.j6.Hw();
        we('=');
        if (DW(1) != '=' && (actionTransInfo = this.J8) != null && actionTransInfo.DW != null) {
            actionTransInfo.j6 = true;
        }
        if (z) {
            tokenTp = tp(18);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ca(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == '\n') {
            we('\n');
            XL();
        } else if (cDW == '\"') {
            I(false);
        } else if (cDW == '\'') {
            cn(false);
        } else if (DW(1) == '/' && (DW(2) == '*' || DW(2) == '/')) {
            sh(false);
        } else if (DW(1) == '\r' && DW(2) == '\n') {
            J8("\r\n");
            XL();
        } else if (DW(1) == '/' && QX.gn(DW(2))) {
            we('/');
            J0(QX);
        } else if (DW(1) == '\r') {
            we('\r');
            XL();
        } else {
            if (!XL.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            J0(XL);
        }
        if (z) {
            tokenTp = tp(5);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void cb(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        QX('0', '9');
        if (z) {
            tokenTp = tp(25);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void cn(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\'');
        if (DW(1) == '\\') {
            dx(false);
        } else {
            if (!lg.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            Ws('\'');
        }
        we('\'');
        if (z) {
            tokenTp = tp(22);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void dx(boolean z) throws MismatchedCharException, NoViableAltForCharException {
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
        } else if (cDW != 't') {
            switch (cDW) {
                case '0':
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                case '2':
                case '3':
                    QX('0', '3');
                    if (DW(1) >= '0' && DW(1) <= '9' && DW(2) >= 3 && DW(2) <= 255) {
                        cb(false);
                        if (DW(1) >= '0' && DW(1) <= '9' && DW(2) >= 3 && DW(2) <= 255) {
                            cb(false);
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
                        cb(false);
                        break;
                    } else if (DW(1) < 3 || DW(1) > 255) {
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                    }
                    break;
                default:
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
        } else {
            we('t');
        }
        if (z) {
            tokenTp = tp(24);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean ef(boolean r17) throws groovyjarjarantlr.NoViableAltForCharException, groovyjarjarantlr.MismatchedCharException {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.actions.java.ActionLexer.ef(boolean):boolean");
    }

    public final void ei(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 0;
        while (true) {
            char cDW = DW(1);
            if (cDW == '#') {
                ro(false);
            } else if (cDW == '$') {
                aj(false);
            } else if (!Ws.gn(DW(1))) {
                break;
            } else {
                ca(false);
            }
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(4);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void g3(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("/*");
        while (true) {
            if (DW(1) == '*' && DW(2) == '/') {
                break;
            }
            if (DW(1) == '\r' && DW(2) == '\n' && DW(3) >= 3 && DW(3) <= 255) {
                we('\r');
                we('\n');
                XL();
            } else if (DW(1) == '\r' && DW(2) >= 3 && DW(2) <= 255 && DW(3) >= 3 && DW(3) <= 255) {
                we('\r');
                XL();
            } else if (DW(1) == '\n' && DW(2) >= 3 && DW(2) <= 255 && DW(3) >= 3 && DW(3) <= 255) {
                we('\n');
                XL();
            } else if (DW(1) < 3 || DW(1) > 255 || DW(2) < 3 || DW(2) > 255 || DW(3) < 3 || DW(3) > 255) {
                break;
            } else {
                Ws((char) 65535);
            }
        }
        J8("*/");
        if (z) {
            tokenTp = tp(21);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public void hK(String str) {
        this.J0.DW(str, VH(), gn(), Zo());
    }

    @Override // groovyjarjarantlr.TokenStream
    public Token j6() throws TokenStreamException, NoViableAltForCharException {
        do {
            j3();
            try {
                try {
                    if (DW(1) >= 3 && DW(1) <= 255) {
                        ei(true);
                    } else {
                        if (DW(1) != 65535) {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                        P8();
                        this.gn = tp(1);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void lp(boolean r17) throws groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: groovyjarjarantlr.actions.java.ActionLexer.lp(boolean):void");
    }

    protected final void nw(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        char c = 255;
        if (cDW != '\'') {
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
                    vJ(false);
                    break;
                default:
                    if (SI.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255 && DW(3) >= 3 && DW(3) <= 255) {
                        OW(false);
                        break;
                    } else {
                        if (DW(1) != '\"' || DW(2) < 3 || DW(2) > 255 || DW(3) < 3 || DW(3) > 255) {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                        I(false);
                        break;
                    }
                    break;
            }
        } else {
            cn(false);
        }
        for (int i = 2; KD.gn(DW(1)) && ro.gn(DW(i)) && DW(3) >= 3 && DW(3) <= c; i = 2) {
            char cDW2 = DW(1);
            if (cDW2 == '\t' || cDW2 == '\n' || cDW2 == '\r' || cDW2 == ' ') {
                XX(false);
            } else if (cDW2 != '-' && cDW2 != '/' && cDW2 != '*' && cDW2 != '+') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            char cDW3 = DW(1);
            if (cDW3 == '*') {
                we('*');
            } else if (cDW3 == '+') {
                we('+');
            } else if (cDW3 == '-') {
                we('-');
            } else {
                if (cDW3 != '/') {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                we('/');
            }
            char cDW4 = DW(1);
            if (cDW4 == '\t' || cDW4 == '\n' || cDW4 == '\r' || cDW4 == ' ') {
                XX(false);
            } else if (cDW4 != '_' && cDW4 != '\"' && cDW4 != '#' && cDW4 != '\'' && cDW4 != '(') {
                switch (cDW4) {
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
                        continue;
                    default:
                        switch (cDW4) {
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
                            case '[':
                                continue;
                            default:
                                switch (cDW4) {
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
                                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                }
                        }
                }
            }
            nw(false);
            c = 255;
        }
        if (z) {
            tokenTp = tp(16);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ro(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '#' && DW(2) == '(') {
            int iHw2 = this.j6.Hw();
            we('#');
            this.j6.v5(iHw2);
            lp(true);
        } else if (DW(1) == '#' && aM.gn(DW(2))) {
            int iHw3 = this.j6.Hw();
            we('#');
            this.j6.v5(iHw3);
            sG(true);
            String strVH = this.we.VH(this.gn.j6(), this.J8);
            if (strVH != null) {
                this.j6.v5(iHw);
                this.j6.DW(strVH);
            }
            if (j3.gn(DW(1))) {
                XX(false);
            }
            if (DW(1) == '=') {
                br(false);
            }
        } else if (DW(1) == '#' && DW(2) == '[') {
            int iHw4 = this.j6.Hw();
            we('#');
            this.j6.v5(iHw4);
            SI(true);
        } else {
            if (DW(1) != '#' || DW(2) != '#') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            J8("##");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.EQ.VH());
            stringBuffer.append("_AST");
            String string = stringBuffer.toString();
            this.j6.v5(iHw);
            this.j6.DW(string);
            ActionTransInfo actionTransInfo = this.J8;
            if (actionTransInfo != null) {
                actionTransInfo.DW = string;
            }
            if (j3.gn(DW(1))) {
                XX(false);
            }
            if (DW(1) == '=') {
                br(false);
            }
        }
        if (z) {
            tokenTp = tp(6);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void sG(boolean z) throws NoViableAltForCharException, MismatchedCharException {
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
        while (rN.gn(DW(1))) {
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
                                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                }
                        }
                }
            } else {
                we('_');
            }
        }
        if (z) {
            tokenTp = tp(17);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void sh(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '/' && DW(2) == '/') {
            Mz(false);
        } else {
            if (DW(1) != '/' || DW(2) != '*') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            g3(false);
        }
        if (z) {
            tokenTp = tp(19);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void sy(boolean z) throws NoViableAltForCharException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        sG(true);
        if (j3.gn(DW(1)) && cn.gn(DW(2))) {
            int iHw2 = this.j6.Hw();
            XX(false);
            this.j6.v5(iHw2);
        } else if (!cn.gn(DW(1))) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        char cDW = DW(1);
        if (cDW != '\t' && cDW != '\n' && cDW != '\r' && cDW != ' ' && cDW != '\"' && cDW != '$') {
            if (cDW == '.') {
                we('.');
                sy(false);
            } else if (cDW != ']' && cDW != '_' && cDW != '+' && cDW != ',') {
                switch (cDW) {
                    case '\'':
                    case ')':
                        break;
                    case '(':
                        we('(');
                        if (j3.gn(DW(1)) && sh.gn(DW(2)) && DW(3) >= 3 && DW(3) <= 255) {
                            int iHw3 = this.j6.Hw();
                            XX(false);
                            this.j6.v5(iHw3);
                        } else if (!sh.gn(DW(1)) || DW(2) < 3 || DW(2) > 255) {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                        while (cb.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255 && DW(3) >= 3 && DW(3) <= 255) {
                            x9(false);
                            while (DW(1) == ',') {
                                we(',');
                                x9(false);
                            }
                        }
                        char cDW2 = DW(1);
                        if (cDW2 == '\t' || cDW2 == '\n' || cDW2 == '\r' || cDW2 == ' ') {
                            int iHw4 = this.j6.Hw();
                            XX(false);
                            this.j6.v5(iHw4);
                        } else if (cDW2 != ')') {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                        we(')');
                        break;
                    default:
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
                                        break;
                                    case '[':
                                        int i = 0;
                                        while (DW(1) == '[') {
                                            we('[');
                                            if (j3.gn(DW(1)) && cb.gn(DW(2)) && DW(3) >= 3 && DW(3) <= 255) {
                                                int iHw5 = this.j6.Hw();
                                                XX(false);
                                                this.j6.v5(iHw5);
                                            } else if (!cb.gn(DW(1)) || DW(2) < 3 || DW(2) > 255 || DW(3) < 3 || DW(3) > 255) {
                                                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                            }
                                            x9(false);
                                            char cDW3 = DW(1);
                                            if (cDW3 == '\t' || cDW3 == '\n' || cDW3 == '\r' || cDW3 == ' ') {
                                                int iHw6 = this.j6.Hw();
                                                XX(false);
                                                this.j6.v5(iHw6);
                                            } else if (cDW3 != ']') {
                                                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                            }
                                            we(']');
                                            i++;
                                        }
                                        if (i < 1) {
                                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                        }
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
                                                break;
                                            default:
                                                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                        }
                                }
                        }
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

    protected final void vJ(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 0;
        while (DW(1) >= '0' && DW(1) <= '9' && dx.gn(DW(2))) {
            cb(false);
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (DW(1) == 'L' && sG.gn(DW(2))) {
            we('L');
        } else if (DW(1) == 'l' && sG.gn(DW(2))) {
            we('l');
        } else if (DW(1) == '.') {
            we('.');
            while (DW(1) >= '0' && DW(1) <= '9' && sG.gn(DW(2))) {
                cb(false);
            }
        } else if (!sG.gn(DW(1))) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(27);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void x9(boolean z) throws NoViableAltForCharException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == '\t' || cDW == '\n' || cDW == '\r' || cDW == ' ') {
            XX(false);
        } else if (cDW != '\"' && cDW != '$' && cDW != '\'' && cDW != '+' && cDW != '_') {
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
                                    break;
                                default:
                                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                            }
                    }
            }
        }
        int i = 0;
        while (yS.gn(DW(1)) && DW(2) >= 3 && DW(2) <= 255) {
            Qq(false);
            if (j3.gn(DW(1)) && gW.gn(DW(2))) {
                XX(false);
            } else if (!gW.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(13);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }
}
