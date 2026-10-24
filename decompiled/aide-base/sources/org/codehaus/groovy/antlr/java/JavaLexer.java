package org.codehaus.groovy.antlr.java;

import com.aide.uidesigner.ProxyTextView;
import groovyjarjarantlr.CharScanner;
import groovyjarjarantlr.MismatchedCharException;
import groovyjarjarantlr.NoViableAltForCharException;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.TokenStream;
import groovyjarjarantlr.TokenStreamException;
import groovyjarjarantlr.collections.impl.BitSet;

/* loaded from: classes.dex */
public class JavaLexer extends CharScanner implements JavaTokenTypes, TokenStream {
    protected int EQ;
    private boolean J0;
    private boolean J8;
    private boolean Ws;
    protected int we;
    public static final BitSet QX = new BitSet(Jl());
    public static final BitSet XL = new BitSet(iW());
    public static final BitSet aM = new BitSet(eU());
    public static final BitSet j3 = new BitSet(e3());
    public static final BitSet Mr = new BitSet(sE());
    public static final BitSet U2 = new BitSet(sg());

    /* renamed from: org.codehaus.groovy.antlr.java.JavaLexer$1, reason: invalid class name */
    public class AnonymousClass1 implements TokenStream {
        final /* synthetic */ JavaLexer j6;

        @Override // groovyjarjarantlr.TokenStream
        public Token j6() throws TokenStreamException, NoViableAltForCharException {
            JavaLexer javaLexer = this.j6;
            if (javaLexer.EQ >= 8) {
                javaLexer.EQ = 0;
                javaLexer.j3();
            }
            Token tokenJ6 = this.j6.j6();
            int iHw = tokenJ6.Hw();
            if (this.j6.Ws) {
                switch (iHw) {
                    case 165:
                    case 166:
                    case 167:
                        iHw = this.j6.we;
                        break;
                }
            }
            this.j6.we = iHw;
            return tokenJ6;
        }
    }

    private static final long[] Jl() {
        long[] jArr = new long[2048];
        jArr[0] = -9224;
        for (int i = 1; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] e3() {
        long[] jArr = new long[2048];
        jArr[0] = -9224;
        for (int i = 1; i <= 1023; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] eU() {
        long[] jArr = new long[2048];
        jArr[0] = -549755823112L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 1023; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] iW() {
        long[] jArr = new long[2048];
        jArr[0] = -4398046520328L;
        for (int i = 1; i <= 1023; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] sE() {
        long[] jArr = new long[2048];
        jArr[0] = -17179878408L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 1023; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] sg() {
        long[] jArr = new long[1025];
        jArr[0] = 287948901175001088L;
        jArr[1] = 541165879422L;
        return jArr;
    }

    public final void AL(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("<<");
        if (z) {
            tokenTp = tp(146);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void CU(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('!');
        if (z) {
            tokenTp = tp(154);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Eq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('(');
        if (z) {
            tokenTp = tp(96);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Ev(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("!=");
        if (z) {
            tokenTp = tp(141);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void FN(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("-=");
        if (z) {
            tokenTp = tp(127);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void I(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("--");
        if (z) {
            tokenTp = tp(152);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void KD(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('&');
        if (z) {
            tokenTp = tp(104);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Mz(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(',');
        if (z) {
            tokenTp = tp(73);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void OW(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">=");
        if (z) {
            tokenTp = tp(144);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Q6(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\"');
        while (true) {
            if (DW(1) != '\\') {
                if (!Mr.gn(DW(1))) {
                    break;
                } else {
                    J0(Mr);
                }
            } else {
                sy(false);
            }
        }
        we('\"');
        if (z) {
            tokenTp = tp(ProxyTextView.INPUTTYPE_textWebEditText);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Qq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("==");
        if (z) {
            tokenTp = tp(142);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void SI(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('@');
        if (z) {
            tokenTp = tp(95);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Sf(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("^=");
        if (z) {
            tokenTp = tp(135);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void WB(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('+');
        if (z) {
            tokenTp = tp(147);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void XG(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("&&");
        if (z) {
            tokenTp = tp(138);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void XX(boolean z) throws NoViableAltForCharException, MismatchedCharException {
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
            tokenTp = tp(169);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Xa(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("||");
        if (z) {
            tokenTp = tp(137);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Z1(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('*');
        if (z) {
            tokenTp = tp(86);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void aj(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == 'E') {
            we('E');
        } else {
            if (cDW != 'e') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('e');
        }
        char cDW2 = DW(1);
        if (cDW2 == '+') {
            we('+');
        } else if (cDW2 != '-') {
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
                    break;
                default:
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
        } else {
            we('-');
        }
        int i = 0;
        while (DW(1) >= '0' && DW(1) <= '9') {
            QX('0', '9');
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        if (z) {
            tokenTp = tp(171);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void aq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('-');
        if (z) {
            tokenTp = tp(148);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void br(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">");
        if (z) {
            tokenTp = tp(74);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cT(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>");
        if (z) {
            tokenTp = tp(75);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ca(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('/');
        if (z) {
            tokenTp = tp(149);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cb(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("|=");
        if (z) {
            tokenTp = tp(136);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void cn(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('~');
        if (z) {
            tokenTp = tp(153);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void dx(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>>");
        if (z) {
            tokenTp = tp(76);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ef(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('^');
        if (z) {
            tokenTp = tp(140);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void et(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("<=");
        if (z) {
            tokenTp = tp(143);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void fY(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(']');
        if (z) {
            tokenTp = tp(66);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void g3(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(':');
        if (z) {
            tokenTp = tp(110);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void hK(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("//");
        while (QX.gn(DW(1))) {
            J0(QX);
        }
        int i = this.tp.VH == 0 ? -1 : 166;
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    public final void hz(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('<');
        if (z) {
            tokenTp = tp(72);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f6 A[Catch: CharStreamException -> 0x031d, RecognitionException -> 0x031f, TryCatch #0 {RecognitionException -> 0x031f, blocks: (B:3:0x0004, B:29:0x003c, B:30:0x003f, B:31:0x0042, B:32:0x0045, B:33:0x0048, B:35:0x0054, B:37:0x005a, B:39:0x0060, B:41:0x0067, B:221:0x0309, B:224:0x030f, B:42:0x006c, B:44:0x0072, B:46:0x0078, B:48:0x007e, B:49:0x0083, B:51:0x0089, B:53:0x008f, B:55:0x0095, B:56:0x009a, B:58:0x00a2, B:60:0x00a8, B:62:0x00ae, B:63:0x00b3, B:65:0x00b9, B:67:0x00bf, B:68:0x00c4, B:70:0x00cc, B:72:0x00d2, B:73:0x00d7, B:75:0x00df, B:77:0x00e5, B:78:0x00ea, B:80:0x00f2, B:82:0x00f8, B:83:0x00fd, B:85:0x0103, B:87:0x0109, B:88:0x010e, B:90:0x0116, B:92:0x011c, B:93:0x0121, B:95:0x0127, B:97:0x012d, B:98:0x0132, B:100:0x013a, B:102:0x0140, B:103:0x0145, B:105:0x014d, B:107:0x0153, B:108:0x0158, B:110:0x015e, B:112:0x0164, B:113:0x0169, B:115:0x016f, B:117:0x0175, B:118:0x017a, B:120:0x0180, B:122:0x0186, B:123:0x018b, B:125:0x0191, B:127:0x0197, B:128:0x019c, B:130:0x01a4, B:132:0x01aa, B:133:0x01af, B:135:0x01b7, B:137:0x01bd, B:138:0x01c2, B:140:0x01c8, B:142:0x01ce, B:143:0x01d3, B:145:0x01db, B:147:0x01e1, B:148:0x01e6, B:150:0x01ec, B:152:0x01f2, B:153:0x01f7, B:155:0x01fd, B:157:0x0203, B:158:0x0208, B:160:0x020e, B:162:0x0214, B:163:0x0219, B:165:0x021f, B:166:0x0224, B:168:0x022a, B:169:0x022f, B:171:0x0235, B:172:0x023a, B:174:0x0240, B:175:0x0245, B:177:0x024b, B:178:0x0250, B:180:0x0256, B:181:0x025b, B:183:0x0261, B:184:0x0266, B:186:0x026c, B:187:0x0271, B:189:0x0277, B:190:0x027c, B:192:0x0282, B:193:0x0287, B:195:0x028d, B:196:0x0292, B:198:0x0298, B:199:0x029d, B:201:0x02a6, B:202:0x02b0, B:203:0x02c5, B:204:0x02c6, B:205:0x02ca, B:206:0x02ce, B:207:0x02d2, B:208:0x02d6, B:209:0x02da, B:210:0x02de, B:211:0x02e2, B:212:0x02e6, B:213:0x02ea, B:214:0x02ee, B:215:0x02f2, B:216:0x02f6, B:217:0x02fa, B:218:0x02fe, B:219:0x0302, B:220:0x0306), top: B:238:0x0004, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02fe A[Catch: CharStreamException -> 0x031d, RecognitionException -> 0x031f, TryCatch #0 {RecognitionException -> 0x031f, blocks: (B:3:0x0004, B:29:0x003c, B:30:0x003f, B:31:0x0042, B:32:0x0045, B:33:0x0048, B:35:0x0054, B:37:0x005a, B:39:0x0060, B:41:0x0067, B:221:0x0309, B:224:0x030f, B:42:0x006c, B:44:0x0072, B:46:0x0078, B:48:0x007e, B:49:0x0083, B:51:0x0089, B:53:0x008f, B:55:0x0095, B:56:0x009a, B:58:0x00a2, B:60:0x00a8, B:62:0x00ae, B:63:0x00b3, B:65:0x00b9, B:67:0x00bf, B:68:0x00c4, B:70:0x00cc, B:72:0x00d2, B:73:0x00d7, B:75:0x00df, B:77:0x00e5, B:78:0x00ea, B:80:0x00f2, B:82:0x00f8, B:83:0x00fd, B:85:0x0103, B:87:0x0109, B:88:0x010e, B:90:0x0116, B:92:0x011c, B:93:0x0121, B:95:0x0127, B:97:0x012d, B:98:0x0132, B:100:0x013a, B:102:0x0140, B:103:0x0145, B:105:0x014d, B:107:0x0153, B:108:0x0158, B:110:0x015e, B:112:0x0164, B:113:0x0169, B:115:0x016f, B:117:0x0175, B:118:0x017a, B:120:0x0180, B:122:0x0186, B:123:0x018b, B:125:0x0191, B:127:0x0197, B:128:0x019c, B:130:0x01a4, B:132:0x01aa, B:133:0x01af, B:135:0x01b7, B:137:0x01bd, B:138:0x01c2, B:140:0x01c8, B:142:0x01ce, B:143:0x01d3, B:145:0x01db, B:147:0x01e1, B:148:0x01e6, B:150:0x01ec, B:152:0x01f2, B:153:0x01f7, B:155:0x01fd, B:157:0x0203, B:158:0x0208, B:160:0x020e, B:162:0x0214, B:163:0x0219, B:165:0x021f, B:166:0x0224, B:168:0x022a, B:169:0x022f, B:171:0x0235, B:172:0x023a, B:174:0x0240, B:175:0x0245, B:177:0x024b, B:178:0x0250, B:180:0x0256, B:181:0x025b, B:183:0x0261, B:184:0x0266, B:186:0x026c, B:187:0x0271, B:189:0x0277, B:190:0x027c, B:192:0x0282, B:193:0x0287, B:195:0x028d, B:196:0x0292, B:198:0x0298, B:199:0x029d, B:201:0x02a6, B:202:0x02b0, B:203:0x02c5, B:204:0x02c6, B:205:0x02ca, B:206:0x02ce, B:207:0x02d2, B:208:0x02d6, B:209:0x02da, B:210:0x02de, B:211:0x02e2, B:212:0x02e6, B:213:0x02ea, B:214:0x02ee, B:215:0x02f2, B:216:0x02f6, B:217:0x02fa, B:218:0x02fe, B:219:0x0302, B:220:0x0306), top: B:238:0x0004, outer: #1 }] */
    @Override // groovyjarjarantlr.TokenStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public groovyjarjarantlr.Token j6() throws groovyjarjarantlr.TokenStreamException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.java.JavaLexer.j6():groovyjarjarantlr.Token");
    }

    public final void jJ(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('[');
        if (z) {
            tokenTp = tp(65);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void jO(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("/*");
        while (true) {
            if (DW(1) == '\r' && DW(2) == '\n' && DW(3) >= 3 && DW(3) <= 65535 && DW(4) >= 3 && DW(4) <= 65535) {
                we('\r');
                we('\n');
                if (this.tp.VH == 0) {
                    XL();
                }
            } else if (DW(1) == '*' && DW(2) >= 3 && DW(2) <= 65535 && DW(3) >= 3 && DW(3) <= 65535 && DW(2) != '/') {
                we('*');
            } else if (DW(1) == '\r' && DW(2) >= 3 && DW(2) <= 65535 && DW(3) >= 3 && DW(3) <= 65535) {
                we('\r');
                if (this.tp.VH == 0) {
                    XL();
                }
            } else if (DW(1) != '\n') {
                if (!XL.gn(DW(1))) {
                    break;
                } else {
                    J0(XL);
                }
            } else {
                we('\n');
                if (this.tp.VH == 0) {
                    XL();
                }
            }
        }
        J8("*/");
        int i = this.tp.VH == 0 ? -1 : 167;
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    public final void jw(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('?');
        if (z) {
            tokenTp = tp(69);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void k2(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(')');
        if (z) {
            tokenTp = tp(97);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void kQ(boolean z) throws NoViableAltForCharException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == '$') {
            we('$');
        } else if (cDW != '_') {
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
        } else {
            we('_');
        }
        while (true) {
            char cDW2 = DW(1);
            if (cDW2 == '$') {
                we('$');
            } else if (cDW2 != '_') {
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
                                        int i = 67;
                                        if (this.tp.VH == 0) {
                                            if (this.J0 && "assert".equals(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw))) {
                                                i = 120;
                                            }
                                            if (this.J8 && "enum".equals(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw))) {
                                                i = 103;
                                            }
                                        }
                                        int iGW = gW(i);
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kf(boolean r8) throws groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            r7 = this;
            groovyjarjarantlr.ANTLRStringBuffer r0 = r7.j6
            int r0 = r0.Hw()
            r1 = 0
        L7:
            r2 = 1
            char r3 = r7.DW(r2)
            r4 = 9
            if (r3 == r4) goto Lb3
            r4 = 13
            r5 = 10
            if (r3 == r5) goto L6d
            r6 = 12
            if (r3 == r6) goto L69
            if (r3 == r4) goto L6d
            r4 = 32
            if (r3 == r4) goto L65
            if (r1 < r2) goto L4f
            groovyjarjarantlr.LexerSharedInputState r1 = r7.tp
            int r1 = r1.VH
            r2 = -1
            if (r1 != 0) goto L2b
            r1 = -1
            goto L2d
        L2b:
            r1 = 165(0xa5, float:2.31E-43)
        L2d:
            if (r8 == 0) goto L4b
            if (r1 == r2) goto L4b
            groovyjarjarantlr.Token r8 = r7.tp(r1)
            java.lang.String r1 = new java.lang.String
            groovyjarjarantlr.ANTLRStringBuffer r2 = r7.j6
            char[] r2 = r2.FH()
            groovyjarjarantlr.ANTLRStringBuffer r3 = r7.j6
            int r3 = r3.Hw()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r8.u7(r1)
            goto L4c
        L4b:
            r8 = 0
        L4c:
            r7.gn = r8
            return
        L4f:
            groovyjarjarantlr.NoViableAltForCharException r8 = new groovyjarjarantlr.NoViableAltForCharException
            char r0 = r7.DW(r2)
            java.lang.String r1 = r7.VH()
            int r2 = r7.gn()
            int r3 = r7.Zo()
            r8.<init>(r0, r1, r2, r3)
            throw r8
        L65:
            r7.we(r4)
            goto Lb6
        L69:
            r7.we(r6)
            goto Lb6
        L6d:
            char r3 = r7.DW(r2)
            if (r3 != r4) goto L80
            r3 = 2
            char r3 = r7.DW(r3)
            if (r3 != r5) goto L80
            java.lang.String r2 = "\r\n"
            r7.J8(r2)
            goto L93
        L80:
            char r3 = r7.DW(r2)
            if (r3 != r4) goto L8a
            r7.we(r4)
            goto L93
        L8a:
            char r3 = r7.DW(r2)
            if (r3 != r5) goto L9d
            r7.we(r5)
        L93:
            groovyjarjarantlr.LexerSharedInputState r2 = r7.tp
            int r2 = r2.VH
            if (r2 != 0) goto Lb6
            r7.XL()
            goto Lb6
        L9d:
            groovyjarjarantlr.NoViableAltForCharException r8 = new groovyjarjarantlr.NoViableAltForCharException
            char r0 = r7.DW(r2)
            java.lang.String r1 = r7.VH()
            int r2 = r7.gn()
            int r3 = r7.Zo()
            r8.<init>(r0, r1, r2, r3)
            throw r8
        Lb3:
            r7.we(r4)
        Lb6:
            int r1 = r1 + 1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.java.JavaLexer.kf(boolean):void");
    }

    public final void ko(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("%=");
        if (z) {
            tokenTp = tp(130);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void lp(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == 'D') {
            we('D');
        } else if (cDW == 'F') {
            we('F');
        } else if (cDW == 'd') {
            we('d');
        } else {
            if (cDW != 'f') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('f');
        }
        if (z) {
            tokenTp = tp(172);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void mb(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("+=");
        if (z) {
            tokenTp = tp(126);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void n5(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("*=");
        if (z) {
            tokenTp = tp(128);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void nw(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('=');
        if (z) {
            tokenTp = tp(98);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void oY(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('%');
        if (z) {
            tokenTp = tp(150);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void q7(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>=");
        if (z) {
            tokenTp = tp(131);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void qp(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('}');
        if (z) {
            tokenTp = tp(100);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ro(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("&=");
        if (z) {
            tokenTp = tp(134);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sG(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>>=");
        if (z) {
            tokenTp = tp(132);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sh(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('|');
        if (z) {
            tokenTp = tp(139);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void sy(boolean z) throws MismatchedCharException, NoViableAltForCharException {
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
                    if (DW(1) >= '0' && DW(1) <= '7' && j3.gn(DW(2))) {
                        QX('0', '7');
                        if (DW(1) >= '0' && DW(1) <= '7' && j3.gn(DW(2))) {
                            QX('0', '7');
                            break;
                        } else if (!j3.gn(DW(1))) {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                    } else if (!j3.gn(DW(1))) {
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                    }
                    break;
                case '4':
                case '5':
                case '6':
                case '7':
                    QX('4', '7');
                    if (DW(1) >= '0' && DW(1) <= '7' && j3.gn(DW(2))) {
                        QX('0', '7');
                        break;
                    } else if (!j3.gn(DW(1))) {
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                    }
                    break;
                default:
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
        } else {
            int i = 0;
            while (DW(1) == 'u') {
                we('u');
                i++;
            }
            if (i < 1) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            XX(false);
            XX(false);
            XX(false);
            XX(false);
        }
        if (z) {
            tokenTp = tp(168);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void vJ(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('\'');
        if (DW(1) == '\\') {
            sy(false);
        } else {
            if (!aM.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            J0(aM);
        }
        we('\'');
        if (z) {
            tokenTp = tp(160);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void w9(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("<<=");
        if (z) {
            tokenTp = tp(133);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void wc(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('{');
        if (z) {
            tokenTp = tp(99);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void x9(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("/=");
        if (z) {
            tokenTp = tp(ProxyTextView.INPUTTYPE_textPassword);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void yO(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("++");
        if (z) {
            tokenTp = tp(151);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd A[Catch: RecognitionException -> 0x0100, TryCatch #0 {RecognitionException -> 0x0100, blocks: (B:34:0x00a7, B:36:0x00ad, B:38:0x00b3, B:40:0x00bb, B:42:0x00c1, B:43:0x00c4, B:44:0x00c7, B:45:0x00dc, B:46:0x00dd, B:47:0x00e1, B:48:0x00e5, B:50:0x00ea, B:51:0x00ff), top: B:224:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1 A[Catch: RecognitionException -> 0x0100, TryCatch #0 {RecognitionException -> 0x0100, blocks: (B:34:0x00a7, B:36:0x00ad, B:38:0x00b3, B:40:0x00bb, B:42:0x00c1, B:43:0x00c4, B:44:0x00c7, B:45:0x00dc, B:46:0x00dd, B:47:0x00e1, B:48:0x00e5, B:50:0x00ea, B:51:0x00ff), top: B:224:0x00a7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ye(boolean r18) throws groovyjarjarantlr.NoViableAltForCharException, groovyjarjarantlr.MismatchedCharException {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.java.JavaLexer.ye(boolean):void");
    }

    public final void zh(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(';');
        if (z) {
            tokenTp = tp(62);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }
}
