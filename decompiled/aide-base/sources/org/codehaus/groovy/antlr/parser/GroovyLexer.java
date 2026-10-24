package org.codehaus.groovy.antlr.parser;

import com.aide.uidesigner.ProxyTextView;
import groovyjarjarantlr.ANTLRHashString;
import groovyjarjarantlr.CharBuffer;
import groovyjarjarantlr.CharScanner;
import groovyjarjarantlr.CharStreamException;
import groovyjarjarantlr.CharStreamIOException;
import groovyjarjarantlr.InputBuffer;
import groovyjarjarantlr.LexerSharedInputState;
import groovyjarjarantlr.MismatchedCharException;
import groovyjarjarantlr.NoViableAltForCharException;
import groovyjarjarantlr.RecognitionException;
import groovyjarjarantlr.SemanticException;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.TokenStream;
import groovyjarjarantlr.TokenStreamException;
import groovyjarjarantlr.TokenStreamIOException;
import groovyjarjarantlr.TokenStreamRecognitionException;
import groovyjarjarantlr.collections.impl.BitSet;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Hashtable;
import org.codehaus.groovy.antlr.GroovySourceToken;

/* loaded from: classes.dex */
public class GroovyLexer extends CharScanner implements GroovyTokenTypes, TokenStream {
    private boolean EQ;
    private boolean J0;
    protected int J8;
    protected int QX;
    protected int Ws;
    protected ArrayList XL;
    protected int aM;
    protected GroovyRecognizer j3;
    private boolean we;
    public static final BitSet Mr = new BitSet(xg());
    public static final BitSet U2 = new BitSet(hp());
    public static final BitSet a8 = new BitSet(pl());
    public static final BitSet lg = new BitSet(oh());
    public static final BitSet rN = new BitSet(Ej());
    public static final BitSet er = new BitSet(T6());
    public static final BitSet yS = new BitSet(cc());
    public static final BitSet gW = new BitSet(Od());
    public static final BitSet BT = new BitSet(om());
    public static final BitSet vy = new BitSet(wE());
    public static final BitSet P8 = new BitSet(PH());
    public static final BitSet ei = new BitSet(GK());
    public static final BitSet nw = new BitSet(dW());
    public static final BitSet SI = new BitSet(Yi());
    public static final BitSet KD = new BitSet(GT());
    public static final BitSet ro = new BitSet(Hl());

    public GroovyLexer(Reader reader) {
        this(new CharBuffer(reader));
    }

    private static final long[] Ej() {
        long[] jArr = new long[2048];
        jArr[0] = -635655169025L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] GK() {
        long[] jArr = new long[2048];
        jArr[0] = -140806207841281L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] GT() {
        long[] jArr = new long[1025];
        jArr[0] = 287948901175001088L;
        jArr[1] = 541165879422L;
        return jArr;
    }

    private static final long[] Hl() {
        long[] jArr = new long[2048];
        jArr[0] = -70368744177665L;
        for (int i = 1; i <= 1023; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] Od() {
        long[] jArr = new long[2048];
        jArr[0] = -4398046511105L;
        for (int i = 1; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] PH() {
        long[] jArr = new long[2048];
        jArr[0] = -68719476737L;
        for (int i = 1; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] T6() {
        long[] jArr = new long[2048];
        jArr[0] = -17179869185L;
        for (int i = 1; i <= 1023; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] Yi() {
        long[] jArr = new long[1025];
        jArr[0] = 287948901175001088L;
        jArr[1] = 543313363070L;
        return jArr;
    }

    protected static boolean cb(int i) {
        if (i == 98 || i == 99) {
            return true;
        }
        switch (i) {
            case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
            case 82:
            case 83:
            case 84:
                return true;
            default:
                switch (i) {
                    case 86:
                    case 87:
                    case 88:
                        return true;
                    default:
                        switch (i) {
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                                return true;
                            default:
                                switch (i) {
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 114:
                                            case 115:
                                            case 116:
                                            case 117:
                                            case 118:
                                            case 119:
                                            case 120:
                                            case 121:
                                            case 122:
                                            case 123:
                                                return true;
                                            default:
                                                switch (i) {
                                                    case 127:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                    case 140:
                                                    case 141:
                                                    case 142:
                                                    case 143:
                                                    case 144:
                                                    case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                                                    case 146:
                                                    case 147:
                                                    case 190:
                                                    case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                                                    case 198:
                                                    case 199:
                                                    case 200:
                                                    case 201:
                                                    case 202:
                                                    case 203:
                                                    case 204:
                                                        return true;
                                                    default:
                                                        switch (i) {
                                                            case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                                            case 130:
                                                            case 131:
                                                            case 132:
                                                                return true;
                                                            default:
                                                                switch (i) {
                                                                    case 150:
                                                                    case 151:
                                                                    case 152:
                                                                    case 153:
                                                                        return true;
                                                                    default:
                                                                        switch (i) {
                                                                            case 157:
                                                                            case 158:
                                                                            case 159:
                                                                            case 160:
                                                                            case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                                                                                return true;
                                                                            default:
                                                                                return false;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static final long[] cc() {
        long[] jArr = new long[2048];
        jArr[0] = -145135534866433L;
        for (int i = 1; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] dW() {
        long[] jArr = new long[2560];
        jArr[1] = 576460745995190270L;
        jArr[3] = -36028797027352577L;
        for (int i = 4; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private void fP(boolean z, String str, String str2) throws SemanticException {
        GroovyRecognizer groovyRecognizer;
        if (!z && (groovyRecognizer = this.j3) != null) {
            groovyRecognizer.VD(str, str2);
            throw null;
        }
        if (z) {
            return;
        }
        throw new SemanticException(str + ";\n   solution: " + str2, VH(), this.tp.DW(), this.tp.j6());
    }

    private static final long[] hp() {
        long[] jArr = new long[2048];
        jArr[0] = -9217;
        for (int i = 1; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] oh() {
        long[] jArr = new long[2048];
        jArr[0] = -549755813889L;
        for (int i = 1; i <= 1023; i++) {
            jArr[i] = -1;
        }
        return jArr;
    }

    private static final long[] om() {
        long[] jArr = new long[2048];
        jArr[0] = -145204254343169L;
        for (int i = 1; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] pl() {
        long[] jArr = new long[2048];
        jArr[0] = -4398046520321L;
        for (int i = 1; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] wE() {
        long[] jArr = new long[2048];
        jArr[0] = -145204254352385L;
        jArr[1] = -268435457;
        for (int i = 2; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    private static final long[] xg() {
        long[] jArr = new long[2560];
        jArr[0] = 68719476736L;
        jArr[1] = 576460745995190270L;
        jArr[3] = -36028797027352577L;
        for (int i = 4; i <= 1022; i++) {
            jArr[i] = -1;
        }
        jArr[1023] = Long.MAX_VALUE;
        return jArr;
    }

    public final void AE(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("==~");
        if (z) {
            tokenTp = tp(179);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void AL(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('[');
        if (this.tp.VH == 0) {
            this.J8++;
        }
        if (z) {
            tokenTp = tp(85);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void AR(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("**=");
        if (z) {
            tokenTp = tp(173);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void An(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(';');
        if (z) {
            tokenTp = tp(128);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void BR(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("=~");
        if (z) {
            tokenTp = tp(178);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Bx(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("//");
        while (U2.gn(DW(1))) {
            J0(U2);
        }
        int i = (this.tp.VH != 0 || this.J0) ? ProxyTextView.INPUTTYPE_textWebEmailAddress : -1;
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int CU(boolean r12, boolean r13) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyLexer.CU(boolean, boolean):int");
    }

    protected final void Cz(boolean z, boolean z2) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '\r' && DW(2) == '\n') {
            int iHw2 = this.j6.Hw();
            J8("\r\n");
            this.j6.v5(iHw2);
        } else if (DW(1) == '\r') {
            int iHw3 = this.j6.Hw();
            we('\r');
            this.j6.v5(iHw3);
        } else {
            if (DW(1) != '\n') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            int iHw4 = this.j6.Hw();
            we('\n');
            this.j6.v5(iHw4);
        }
        if (this.tp.VH == 0) {
            d8(z2);
        }
        if (z) {
            tokenTp = tp(208);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void E4(boolean z) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 0;
        while (true) {
            if (DW(1) != '\\' || (DW(2) != '\n' && DW(2) != '\r')) {
                if (DW(1) != ' ') {
                    if (DW(1) != '\t') {
                        if (DW(1) != '\f') {
                            break;
                        } else {
                            we('\f');
                        }
                    } else {
                        we('\t');
                    }
                } else {
                    we(' ');
                }
            } else {
                we('\\');
                Cz(false, false);
            }
            i++;
        }
        if (i < 1) {
            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
        }
        int i2 = (this.tp.VH != 0 || this.J0) ? 207 : -1;
        if (!z || i2 == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i2);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    protected final void Eq(boolean z) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == '\n' || cDW == '\r') {
            Lz(false, true);
        } else if (cDW == '/') {
            we('/');
        } else if (DW(1) == '\\' && ((DW(2) == '\n' || DW(2) == '\r') && DW(3) >= 0 && DW(3) <= 65534)) {
            int iHw2 = this.j6.Hw();
            we('\\');
            this.j6.v5(iHw2);
            int iHw3 = this.j6.Hw();
            Cz(false, false);
            this.j6.v5(iHw3);
        } else if (DW(1) == '\\' && DW(2) >= 0 && DW(2) <= 65534 && DW(2) != '\n' && DW(2) != '\r') {
            we('\\');
        } else {
            if (!ei.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            J0(ei);
        }
        if (z) {
            tokenTp = tp(219);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void Ev(boolean z) throws MismatchedCharException, NoViableAltForCharException {
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
        } else if (cDW2 == '-') {
            we('-');
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
                    break;
                default:
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
        }
        while (true) {
            if (DW(1) >= '0' && DW(1) <= '9' && (DW(2) == '0' || DW(2) == '1' || DW(2) == '2' || DW(2) == '3' || DW(2) == '4' || DW(2) == '5' || DW(2) == '6' || DW(2) == '7' || DW(2) == '8' || DW(2) == '9' || DW(2) == '_')) {
                QX('0', '9');
            } else {
                if (DW(1) != '_') {
                    QX('0', '9');
                    if (z) {
                        tokenTp = tp(228);
                        tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
                    } else {
                        tokenTp = null;
                    }
                    this.gn = tokenTp;
                    return;
                }
                we('_');
            }
        }
    }

    public final void FN(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("==");
        if (z) {
            tokenTp = tp(181);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fd(boolean r17) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyLexer.Fd(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[Catch: RecognitionException -> 0x00ff, TryCatch #0 {RecognitionException -> 0x00ff, blocks: (B:48:0x00ca, B:50:0x00d3, B:51:0x00d6, B:52:0x00d9, B:53:0x00ee, B:54:0x00ef, B:55:0x00f3, B:56:0x00f7), top: B:321:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3 A[Catch: RecognitionException -> 0x00ff, TryCatch #0 {RecognitionException -> 0x00ff, blocks: (B:48:0x00ca, B:50:0x00d3, B:51:0x00d6, B:52:0x00d9, B:53:0x00ee, B:54:0x00ef, B:55:0x00f3, B:56:0x00f7), top: B:321:0x00ca }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gj(boolean r17) throws groovyjarjarantlr.NoViableAltForCharException, groovyjarjarantlr.MismatchedCharException {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyLexer.Gj(boolean):void");
    }

    public final void I(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("|=");
        if (z) {
            tokenTp = tp(172);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final int IS(boolean z, boolean z2) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        while (true) {
            if (DW(1) != '$' || !gW.gn(DW(2)) || sh()) {
                if (!BT.gn(DW(1))) {
                    break;
                }
                Nh(false);
            } else {
                we('$');
            }
        }
        char cDW = DW(1);
        if (cDW == '$') {
            int iHw2 = this.j6.Hw();
            we('$');
            this.j6.v5(iHw2);
            if (this.tp.VH == 0) {
                i = z2 ? 197 : 49;
                this.QX = 6;
            }
        } else {
            if (cDW != '/') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            int iHw3 = this.j6.Hw();
            we('/');
            this.j6.v5(iHw3);
            if (this.tp.VH == 0) {
                i = z2 ? 88 : 198;
                this.Ws--;
            }
        }
        int i = this.tp.VH == 0 ? i : 214;
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
        return i;
    }

    public final void Jl(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('-');
        if (z) {
            tokenTp = tp(149);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Jm(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("<<=");
        if (z) {
            tokenTp = tp(169);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected boolean KD() {
        return !cb(this.aM);
    }

    protected final void Lz(boolean z, boolean z2) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (this.tp.VH == 0 && !z2) {
            throw new MismatchedCharException('\n', '\n', true, (CharScanner) this);
        }
        Cz(false, false);
        if (this.tp.VH == 0) {
            this.j6.v5(iHw);
            this.j6.j6('\n');
        }
        if (z) {
            tokenTp = tp(221);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void MP(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>=");
        if (z) {
            tokenTp = tp(167);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Mz(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('|');
        if (z) {
            tokenTp = tp(134);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public TokenStream N0() {
        return new TokenStream() { // from class: org.codehaus.groovy.antlr.parser.GroovyLexer.1
            @Override // groovyjarjarantlr.TokenStream
            public Token j6() throws TokenStreamException, NoViableAltForCharException {
                GroovyLexer groovyLexer = GroovyLexer.this;
                int i = groovyLexer.QX;
                if (i < 8) {
                    Token tokenJ6 = groovyLexer.j6();
                    int iHw = tokenJ6.Hw();
                    if (GroovyLexer.this.J0) {
                        switch (iHw) {
                            case 207:
                            case 208:
                            case ProxyTextView.INPUTTYPE_textWebEmailAddress /* 209 */:
                            case 210:
                                iHw = GroovyLexer.this.aM;
                                break;
                        }
                    }
                    GroovyLexer.this.aM = iHw;
                    return tokenJ6;
                }
                int i2 = i & 3;
                groovyLexer.QX = 0;
                groovyLexer.j3();
                try {
                    if (i2 == 0) {
                        GroovyLexer.this.ct(true, false, false);
                    } else if (i2 == 1) {
                        GroovyLexer.this.ct(true, false, true);
                    } else if (i2 == 2) {
                        GroovyLexer.this.IS(true, false);
                    } else {
                        if (i2 != 3) {
                            throw new AssertionError(false);
                        }
                        GroovyLexer.this.CU(true, false);
                    }
                    GroovyLexer.this.aM = ((CharScanner) GroovyLexer.this).gn.Hw();
                    return ((CharScanner) GroovyLexer.this).gn;
                } catch (CharStreamException e) {
                    if (e instanceof CharStreamIOException) {
                        throw new TokenStreamIOException(((CharStreamIOException) e).WB);
                    }
                    throw new TokenStreamException(e.getMessage());
                } catch (RecognitionException e2) {
                    throw new TokenStreamRecognitionException(e2);
                }
            }
        };
    }

    protected final void Nh(boolean z) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (DW(1) == '\\' && DW(2) == '/' && DW(3) >= 0 && DW(3) <= 65534) {
            we('\\');
            we('/');
            if (this.tp.VH == 0) {
                this.j6.v5(iHw);
                this.j6.j6('/');
            }
        } else if (DW(1) == '\\' && ((DW(2) == '\n' || DW(2) == '\r') && DW(3) >= 0 && DW(3) <= 65534)) {
            int iHw2 = this.j6.Hw();
            we('\\');
            this.j6.v5(iHw2);
            int iHw3 = this.j6.Hw();
            Cz(false, false);
            this.j6.v5(iHw3);
        } else if (DW(1) == '\\' && DW(2) >= 0 && DW(2) <= 65534 && DW(2) != '/' && DW(2) != '\n' && DW(2) != '\r') {
            we('\\');
        } else if (vy.gn(DW(1))) {
            J0(vy);
        } else {
            if (DW(1) != '\n' && DW(1) != '\r') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            Lz(false, true);
        }
        while (DW(1) == '*') {
            we('*');
        }
        if (z) {
            tokenTp = tp(218);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void OW(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(',');
        if (z) {
            tokenTp = tp(101);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Of(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('*');
        if (z) {
            tokenTp = tp(ProxyTextView.INPUTTYPE_textPostalAddress);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void PT(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("*=");
        if (z) {
            tokenTp = tp(164);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Pa(boolean z) throws SemanticException, MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (gn() != 1 || Zo() != 1) {
            throw new SemanticException("getLine() == 1 && getColumn() == 1");
        }
        J8("#!");
        while (U2.gn(DW(1))) {
            J0(U2);
        }
        int i = (this.tp.VH != 0 || this.J0) ? 80 : -1;
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    public final void Q6(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('<');
        if (z) {
            tokenTp = tp(89);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void QO(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("..<");
        if (z) {
            tokenTp = tp(189);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Qq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('^');
        if (z) {
            tokenTp = tp(ProxyTextView.INPUTTYPE_textFilter);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Sf(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("&=");
        if (z) {
            tokenTp = tp(170);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void TI(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J0(rN);
        if (z) {
            tokenTp = tp(211);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void WB(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">=");
        if (z) {
            tokenTp = tp(186);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void XG(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        while (true) {
            if (DW(1) >= '0' && DW(1) <= '9' && (DW(2) == '0' || DW(2) == '1' || DW(2) == '2' || DW(2) == '3' || DW(2) == '4' || DW(2) == '5' || DW(2) == '6' || DW(2) == '7' || DW(2) == '8' || DW(2) == '9' || DW(2) == '_')) {
                kQ(false);
            } else if (DW(1) != '_') {
                break;
            } else {
                we('_');
            }
        }
        kQ(false);
        if (z) {
            tokenTp = tp(227);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void XX(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("--");
        if (z) {
            tokenTp = tp(ProxyTextView.INPUTTYPE_textPhonetic);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Xa(boolean z) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        if (!KD()) {
            throw new SemanticException("allowRegexpLiteral()");
        }
        int iHw2 = this.j6.Hw();
        J8("$/");
        this.j6.v5(iHw2);
        int iCU = 0;
        if (DW(1) == '$' && DW(2) >= 0 && DW(2) <= 65534 && !sh()) {
            we('$');
            iCU = CU(false, true);
        } else if (P8.gn(DW(1))) {
            Eq(false);
            iCU = CU(false, true);
        } else {
            if (DW(1) != '$') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            int iHw3 = this.j6.Hw();
            we('$');
            this.j6.v5(iHw3);
            if (this.tp.VH == 0) {
                iCU = 197;
                this.QX = 7;
            }
        }
        if (this.tp.VH != 0) {
            iCU = 213;
        }
        if (!z || iCU == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(iCU);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    public final void Z1(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("||");
        if (z) {
            tokenTp = tp(175);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void Za(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(')');
        if (this.tp.VH == 0) {
            this.J8--;
        }
        if (z) {
            tokenTp = tp(123);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void a5(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(']');
        if (this.tp.VH == 0) {
            this.J8--;
        }
        if (z) {
            tokenTp = tp(86);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void aX(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("+=");
        if (z) {
            tokenTp = tp(162);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void aj(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("->");
        if (z) {
            tokenTp = tp(135);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void aq(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("?:");
        if (z) {
            tokenTp = tp(174);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected void b(boolean z) {
        if (this.QX != 0) {
            this.QX = (z ? 8 : 4) + (this.QX & 3);
        }
    }

    public final void b1(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("**");
        if (z) {
            tokenTp = tp(194);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void br(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("<=>");
        if (z) {
            tokenTp = tp(184);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void cT(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW != '_') {
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
                            switch (cDW) {
                                case 192:
                                case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                                case 194:
                                case 195:
                                case 196:
                                case 197:
                                case 198:
                                case 199:
                                case 200:
                                case 201:
                                case 202:
                                case 203:
                                case 204:
                                case 205:
                                case 206:
                                case 207:
                                case 208:
                                case ProxyTextView.INPUTTYPE_textWebEmailAddress /* 209 */:
                                case 210:
                                case 211:
                                case 212:
                                case 213:
                                case 214:
                                    QX((char) 192, (char) 214);
                                    break;
                                default:
                                    switch (cDW) {
                                        case 216:
                                        case 217:
                                        case 218:
                                        case 219:
                                        case 220:
                                        case 221:
                                        case 222:
                                        case 223:
                                        case 224:
                                        case ProxyTextView.INPUTTYPE_textWebPassword /* 225 */:
                                        case 226:
                                        case 227:
                                        case 228:
                                        case 229:
                                        case 230:
                                        case 231:
                                        case 232:
                                        case 233:
                                        case 234:
                                        case 235:
                                        case 236:
                                        case 237:
                                        case 238:
                                        case 239:
                                        case 240:
                                        case 241:
                                        case 242:
                                        case 243:
                                        case 244:
                                        case 245:
                                        case 246:
                                            QX((char) 216, (char) 246);
                                            break;
                                        default:
                                            switch (cDW) {
                                                case 248:
                                                case 249:
                                                case 250:
                                                case 251:
                                                case 252:
                                                case 253:
                                                case 254:
                                                case 255:
                                                    QX((char) 248, (char) 255);
                                                    break;
                                                default:
                                                    if (DW(1) >= 256 && DW(1) <= 65534) {
                                                        QX((char) 256, (char) 65534);
                                                        break;
                                                    } else {
                                                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                                                    }
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            we('_');
        }
        if (z) {
            tokenTp = tp(224);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ca(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>>");
        if (z) {
            tokenTp = tp(103);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ce(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("<<");
        if (z) {
            tokenTp = tp(187);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected boolean cn() {
        return DW(1) == '$' && DW(2) == '/';
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int ct(boolean r12, boolean r13, boolean r14) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyLexer.ct(boolean, boolean, boolean):int");
    }

    protected void d8(boolean z) throws SemanticException {
        int i;
        if (z && (i = this.Ws) > 0) {
            fP(i == 0, "end of line reached within a simple string 'x' or \"x\" or /x/", "for multi-line literals, use triple quotes '''x''' or \"\"\"x\"\"\" or /x/ or $/x/$");
            this.Ws = 0;
        }
        XL();
    }

    public final void dx(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('=');
        if (z) {
            tokenTp = tp(124);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void e3(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('%');
        if (z) {
            tokenTp = tp(192);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void e9(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('?');
        if (z) {
            tokenTp = tp(97);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected void eN() {
        int size = this.XL.size();
        if (size == 0) {
            return;
        }
        int iIntValue = ((Integer) this.XL.remove(size - 1)).intValue();
        this.J8 = iIntValue / 16;
        this.QX = iIntValue % 16;
    }

    public final void eU(boolean z) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        boolean z2;
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("/*");
        while (true) {
            if (DW(1) != '*' || DW(2) < 0 || DW(2) > 65534 || DW(3) < 0 || DW(3) > 65534) {
                z2 = false;
            } else {
                int iEQ = EQ();
                this.tp.VH++;
                try {
                    we('*');
                    Ws('/');
                    z2 = true;
                } catch (RecognitionException unused) {
                    z2 = false;
                }
                Mr(iEQ);
                this.tp.VH--;
            }
            if (!z2) {
                if (DW(1) != '\n' && DW(1) != '\r') {
                    if (!a8.gn(DW(1))) {
                        break;
                    } else {
                        J0(a8);
                    }
                } else {
                    Cz(false, true);
                }
            } else {
                we('*');
            }
        }
        J8("*/");
        int i = (this.tp.VH != 0 || this.J0) ? 210 : -1;
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    public final void ef(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('&');
        if (z) {
            tokenTp = tp(125);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    @Override // groovyjarjarantlr.CharScanner
    public void er(String str) {
    }

    protected final void et(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('$');
        if (z) {
            tokenTp = tp(206);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void fN(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("!==");
        if (z) {
            tokenTp = tp(183);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void fY(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int i;
        int i2;
        int iHw = this.j6.Hw();
        if (Mr.gn(DW(1)) && this.QX == 0) {
            if (DW(1) == '$') {
                et(false);
            } else {
                if (!nw.gn(DW(1))) {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                cT(false);
            }
            while (true) {
                char cDW = DW(1);
                if (cDW != '$') {
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
                            kQ(false);
                            continue;
                        default:
                            if (!nw.gn(DW(1))) {
                                break;
                            } else {
                                cT(false);
                                break;
                            }
                    }
                } else {
                    et(false);
                }
            }
        } else {
            if (!nw.gn(DW(1))) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            cT(false);
            while (true) {
                if (nw.gn(DW(1))) {
                    cT(false);
                } else if (DW(1) < '0' || DW(1) > '9') {
                    break;
                } else {
                    kQ(false);
                }
            }
        }
        if (this.tp.VH == 0) {
            if (this.QX != 0) {
                if (DW(1) == '.' && DW(2) != '$' && Character.isJavaIdentifierStart(DW(2))) {
                    b(false);
                } else {
                    b(true);
                }
            }
            int iGW = gW(87);
            if ((iGW == 114 || iGW == 84 || iGW == 142 || iGW == 95) && (DW(1) == '.' || (i = this.aM) == 90 || i == 81)) {
                iGW = 87;
            }
            if (iGW == 81 && (DW(1) == '.' || (i2 = this.aM) == 90 || i2 == 82 || (DW(1) == ')' && this.aM == 91))) {
                iGW = 87;
            }
            i = (iGW == 83 && DW(1) == '.') ? 87 : iGW;
            if (this.EQ && "assert".equals(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw))) {
                i = 147;
            }
            if (this.we && "enum".equals(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw))) {
                i = 94;
            }
        }
        if (!z || i == -1) {
            tokenTp = null;
        } else {
            tokenTp = tp(i);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        }
        this.gn = tokenTp;
    }

    public final void g3(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('~');
        if (z) {
            tokenTp = tp(195);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gG(boolean r8) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyLexer.gG(boolean):void");
    }

    public final void hK(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("<=");
        if (z) {
            tokenTp = tp(185);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void hz(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('.');
        if (z) {
            tokenTp = tp(90);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void iW(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("-=");
        if (z) {
            tokenTp = tp(163);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Removed duplicated region for block: B:319:0x046a A[Catch: CharStreamException -> 0x0489, RecognitionException -> 0x048b, TryCatch #0 {RecognitionException -> 0x048b, blocks: (B:4:0x0006, B:26:0x0036, B:27:0x0039, B:28:0x003c, B:29:0x003f, B:31:0x004b, B:33:0x0051, B:35:0x0057, B:37:0x005e, B:322:0x0475, B:325:0x047b, B:38:0x0063, B:40:0x006b, B:42:0x0071, B:44:0x0077, B:45:0x007c, B:47:0x0082, B:49:0x0088, B:51:0x008e, B:52:0x0093, B:54:0x009b, B:56:0x00a1, B:58:0x00a7, B:59:0x00ac, B:61:0x00b2, B:63:0x00b8, B:65:0x00be, B:66:0x00c3, B:68:0x00c9, B:70:0x00cf, B:72:0x00d5, B:73:0x00da, B:75:0x00e0, B:77:0x00e6, B:79:0x00ec, B:80:0x00f1, B:82:0x00f9, B:84:0x00ff, B:86:0x0105, B:87:0x010a, B:89:0x0110, B:91:0x0116, B:93:0x011c, B:94:0x0121, B:96:0x0127, B:98:0x012d, B:100:0x0133, B:101:0x0138, B:103:0x0140, B:105:0x0146, B:107:0x014c, B:108:0x0151, B:110:0x0157, B:112:0x015d, B:113:0x0162, B:115:0x0168, B:117:0x016e, B:118:0x0173, B:120:0x017b, B:122:0x0181, B:123:0x0186, B:125:0x018c, B:127:0x0192, B:128:0x0197, B:130:0x019f, B:132:0x01a5, B:133:0x01aa, B:135:0x01b0, B:137:0x01b6, B:138:0x01bb, B:140:0x01c1, B:142:0x01c7, B:143:0x01cc, B:145:0x01d4, B:147:0x01da, B:148:0x01df, B:150:0x01e5, B:152:0x01eb, B:153:0x01f0, B:155:0x01f6, B:157:0x01fc, B:158:0x0201, B:160:0x0207, B:162:0x020d, B:163:0x0212, B:165:0x0218, B:167:0x021e, B:168:0x0223, B:170:0x022b, B:172:0x0231, B:173:0x0236, B:175:0x023e, B:177:0x0244, B:178:0x0249, B:180:0x024f, B:182:0x0255, B:183:0x025a, B:185:0x0262, B:187:0x0268, B:188:0x026d, B:190:0x0273, B:192:0x0279, B:193:0x027e, B:195:0x0284, B:197:0x028a, B:198:0x028f, B:200:0x0295, B:202:0x029b, B:203:0x02a0, B:205:0x02a8, B:207:0x02ae, B:208:0x02b3, B:210:0x02b9, B:212:0x02c1, B:213:0x02c6, B:215:0x02cc, B:217:0x02d2, B:218:0x02d7, B:220:0x02dd, B:222:0x02e3, B:223:0x02e8, B:225:0x02ee, B:227:0x02f4, B:228:0x02f9, B:230:0x02ff, B:232:0x0305, B:233:0x030a, B:235:0x0312, B:237:0x0318, B:238:0x031d, B:240:0x0323, B:242:0x0329, B:243:0x032e, B:245:0x0336, B:247:0x033c, B:249:0x0342, B:250:0x0347, B:252:0x034d, B:253:0x0352, B:255:0x0358, B:256:0x035d, B:258:0x0363, B:259:0x0368, B:261:0x036e, B:262:0x0373, B:264:0x0379, B:265:0x037e, B:267:0x0384, B:268:0x0389, B:270:0x038f, B:271:0x0394, B:273:0x039a, B:274:0x039f, B:276:0x03a5, B:277:0x03aa, B:279:0x03b2, B:280:0x03b7, B:282:0x03bf, B:283:0x03c4, B:285:0x03cc, B:286:0x03d1, B:288:0x03d7, B:289:0x03dc, B:291:0x03e4, B:293:0x03ea, B:295:0x03f0, B:296:0x03f5, B:298:0x03fb, B:299:0x0400, B:301:0x040c, B:302:0x0411, B:304:0x041a, B:305:0x0424, B:306:0x0439, B:307:0x043a, B:308:0x043e, B:309:0x0442, B:310:0x0446, B:311:0x044a, B:312:0x044e, B:313:0x0452, B:314:0x0456, B:315:0x045a, B:316:0x045e, B:317:0x0462, B:318:0x0466, B:319:0x046a, B:320:0x046e, B:321:0x0472), top: B:339:0x0006, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x046e A[Catch: CharStreamException -> 0x0489, RecognitionException -> 0x048b, TryCatch #0 {RecognitionException -> 0x048b, blocks: (B:4:0x0006, B:26:0x0036, B:27:0x0039, B:28:0x003c, B:29:0x003f, B:31:0x004b, B:33:0x0051, B:35:0x0057, B:37:0x005e, B:322:0x0475, B:325:0x047b, B:38:0x0063, B:40:0x006b, B:42:0x0071, B:44:0x0077, B:45:0x007c, B:47:0x0082, B:49:0x0088, B:51:0x008e, B:52:0x0093, B:54:0x009b, B:56:0x00a1, B:58:0x00a7, B:59:0x00ac, B:61:0x00b2, B:63:0x00b8, B:65:0x00be, B:66:0x00c3, B:68:0x00c9, B:70:0x00cf, B:72:0x00d5, B:73:0x00da, B:75:0x00e0, B:77:0x00e6, B:79:0x00ec, B:80:0x00f1, B:82:0x00f9, B:84:0x00ff, B:86:0x0105, B:87:0x010a, B:89:0x0110, B:91:0x0116, B:93:0x011c, B:94:0x0121, B:96:0x0127, B:98:0x012d, B:100:0x0133, B:101:0x0138, B:103:0x0140, B:105:0x0146, B:107:0x014c, B:108:0x0151, B:110:0x0157, B:112:0x015d, B:113:0x0162, B:115:0x0168, B:117:0x016e, B:118:0x0173, B:120:0x017b, B:122:0x0181, B:123:0x0186, B:125:0x018c, B:127:0x0192, B:128:0x0197, B:130:0x019f, B:132:0x01a5, B:133:0x01aa, B:135:0x01b0, B:137:0x01b6, B:138:0x01bb, B:140:0x01c1, B:142:0x01c7, B:143:0x01cc, B:145:0x01d4, B:147:0x01da, B:148:0x01df, B:150:0x01e5, B:152:0x01eb, B:153:0x01f0, B:155:0x01f6, B:157:0x01fc, B:158:0x0201, B:160:0x0207, B:162:0x020d, B:163:0x0212, B:165:0x0218, B:167:0x021e, B:168:0x0223, B:170:0x022b, B:172:0x0231, B:173:0x0236, B:175:0x023e, B:177:0x0244, B:178:0x0249, B:180:0x024f, B:182:0x0255, B:183:0x025a, B:185:0x0262, B:187:0x0268, B:188:0x026d, B:190:0x0273, B:192:0x0279, B:193:0x027e, B:195:0x0284, B:197:0x028a, B:198:0x028f, B:200:0x0295, B:202:0x029b, B:203:0x02a0, B:205:0x02a8, B:207:0x02ae, B:208:0x02b3, B:210:0x02b9, B:212:0x02c1, B:213:0x02c6, B:215:0x02cc, B:217:0x02d2, B:218:0x02d7, B:220:0x02dd, B:222:0x02e3, B:223:0x02e8, B:225:0x02ee, B:227:0x02f4, B:228:0x02f9, B:230:0x02ff, B:232:0x0305, B:233:0x030a, B:235:0x0312, B:237:0x0318, B:238:0x031d, B:240:0x0323, B:242:0x0329, B:243:0x032e, B:245:0x0336, B:247:0x033c, B:249:0x0342, B:250:0x0347, B:252:0x034d, B:253:0x0352, B:255:0x0358, B:256:0x035d, B:258:0x0363, B:259:0x0368, B:261:0x036e, B:262:0x0373, B:264:0x0379, B:265:0x037e, B:267:0x0384, B:268:0x0389, B:270:0x038f, B:271:0x0394, B:273:0x039a, B:274:0x039f, B:276:0x03a5, B:277:0x03aa, B:279:0x03b2, B:280:0x03b7, B:282:0x03bf, B:283:0x03c4, B:285:0x03cc, B:286:0x03d1, B:288:0x03d7, B:289:0x03dc, B:291:0x03e4, B:293:0x03ea, B:295:0x03f0, B:296:0x03f5, B:298:0x03fb, B:299:0x0400, B:301:0x040c, B:302:0x0411, B:304:0x041a, B:305:0x0424, B:306:0x0439, B:307:0x043a, B:308:0x043e, B:309:0x0442, B:310:0x0446, B:311:0x044a, B:312:0x044e, B:313:0x0452, B:314:0x0456, B:315:0x045a, B:316:0x045e, B:317:0x0462, B:318:0x0466, B:319:0x046a, B:320:0x046e, B:321:0x0472), top: B:339:0x0006, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0472 A[Catch: CharStreamException -> 0x0489, RecognitionException -> 0x048b, TryCatch #0 {RecognitionException -> 0x048b, blocks: (B:4:0x0006, B:26:0x0036, B:27:0x0039, B:28:0x003c, B:29:0x003f, B:31:0x004b, B:33:0x0051, B:35:0x0057, B:37:0x005e, B:322:0x0475, B:325:0x047b, B:38:0x0063, B:40:0x006b, B:42:0x0071, B:44:0x0077, B:45:0x007c, B:47:0x0082, B:49:0x0088, B:51:0x008e, B:52:0x0093, B:54:0x009b, B:56:0x00a1, B:58:0x00a7, B:59:0x00ac, B:61:0x00b2, B:63:0x00b8, B:65:0x00be, B:66:0x00c3, B:68:0x00c9, B:70:0x00cf, B:72:0x00d5, B:73:0x00da, B:75:0x00e0, B:77:0x00e6, B:79:0x00ec, B:80:0x00f1, B:82:0x00f9, B:84:0x00ff, B:86:0x0105, B:87:0x010a, B:89:0x0110, B:91:0x0116, B:93:0x011c, B:94:0x0121, B:96:0x0127, B:98:0x012d, B:100:0x0133, B:101:0x0138, B:103:0x0140, B:105:0x0146, B:107:0x014c, B:108:0x0151, B:110:0x0157, B:112:0x015d, B:113:0x0162, B:115:0x0168, B:117:0x016e, B:118:0x0173, B:120:0x017b, B:122:0x0181, B:123:0x0186, B:125:0x018c, B:127:0x0192, B:128:0x0197, B:130:0x019f, B:132:0x01a5, B:133:0x01aa, B:135:0x01b0, B:137:0x01b6, B:138:0x01bb, B:140:0x01c1, B:142:0x01c7, B:143:0x01cc, B:145:0x01d4, B:147:0x01da, B:148:0x01df, B:150:0x01e5, B:152:0x01eb, B:153:0x01f0, B:155:0x01f6, B:157:0x01fc, B:158:0x0201, B:160:0x0207, B:162:0x020d, B:163:0x0212, B:165:0x0218, B:167:0x021e, B:168:0x0223, B:170:0x022b, B:172:0x0231, B:173:0x0236, B:175:0x023e, B:177:0x0244, B:178:0x0249, B:180:0x024f, B:182:0x0255, B:183:0x025a, B:185:0x0262, B:187:0x0268, B:188:0x026d, B:190:0x0273, B:192:0x0279, B:193:0x027e, B:195:0x0284, B:197:0x028a, B:198:0x028f, B:200:0x0295, B:202:0x029b, B:203:0x02a0, B:205:0x02a8, B:207:0x02ae, B:208:0x02b3, B:210:0x02b9, B:212:0x02c1, B:213:0x02c6, B:215:0x02cc, B:217:0x02d2, B:218:0x02d7, B:220:0x02dd, B:222:0x02e3, B:223:0x02e8, B:225:0x02ee, B:227:0x02f4, B:228:0x02f9, B:230:0x02ff, B:232:0x0305, B:233:0x030a, B:235:0x0312, B:237:0x0318, B:238:0x031d, B:240:0x0323, B:242:0x0329, B:243:0x032e, B:245:0x0336, B:247:0x033c, B:249:0x0342, B:250:0x0347, B:252:0x034d, B:253:0x0352, B:255:0x0358, B:256:0x035d, B:258:0x0363, B:259:0x0368, B:261:0x036e, B:262:0x0373, B:264:0x0379, B:265:0x037e, B:267:0x0384, B:268:0x0389, B:270:0x038f, B:271:0x0394, B:273:0x039a, B:274:0x039f, B:276:0x03a5, B:277:0x03aa, B:279:0x03b2, B:280:0x03b7, B:282:0x03bf, B:283:0x03c4, B:285:0x03cc, B:286:0x03d1, B:288:0x03d7, B:289:0x03dc, B:291:0x03e4, B:293:0x03ea, B:295:0x03f0, B:296:0x03f5, B:298:0x03fb, B:299:0x0400, B:301:0x040c, B:302:0x0411, B:304:0x041a, B:305:0x0424, B:306:0x0439, B:307:0x043a, B:308:0x043e, B:309:0x0442, B:310:0x0446, B:311:0x044a, B:312:0x044e, B:313:0x0452, B:314:0x0456, B:315:0x045a, B:316:0x045e, B:317:0x0462, B:318:0x0466, B:319:0x046a, B:320:0x046e, B:321:0x0472), top: B:339:0x0006, outer: #1 }] */
    @Override // groovyjarjarantlr.TokenStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public groovyjarjarantlr.Token j6() throws groovyjarjarantlr.TokenStreamException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyLexer.j6():groovyjarjarantlr.Token");
    }

    protected final void jJ(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('/');
        if (z) {
            tokenTp = tp(191);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void jO(boolean z) throws SemanticException, MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        int i = 1;
        if (DW(1) != '\\') {
            if (DW(i) == '\\' || !(DW(2) == '\n' || DW(2) == '\r')) {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            int iHw2 = this.j6.Hw();
            we('\\');
            this.j6.v5(iHw2);
            int iHw3 = this.j6.Hw();
            Cz(false, false);
            this.j6.v5(iHw3);
        } else {
            if (DW(2) != '\"' && DW(2) != '$' && DW(2) != '\'' && DW(2) != '0' && DW(2) != '1' && DW(2) != '2' && DW(2) != '3' && DW(2) != '4' && DW(2) != '5' && DW(2) != '6' && DW(2) != '7' && DW(2) != '\\' && DW(2) != 'b' && DW(2) != 'f' && DW(2) != 'n' && DW(2) != 'r' && DW(2) != 't' && DW(2) != 'u') {
                i = 1;
                if (DW(i) == '\\') {
                }
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            int iHw4 = this.j6.Hw();
            we('\\');
            this.j6.v5(iHw4);
            char cDW = DW(1);
            if (cDW == '\"') {
                we('\"');
            } else if (cDW == '$') {
                we('$');
            } else if (cDW == '\'') {
                we('\'');
            } else if (cDW == '\\') {
                we('\\');
            } else if (cDW == 'b') {
                we('b');
                if (this.tp.VH == 0) {
                    this.j6.v5(iHw);
                    this.j6.DW("\b");
                }
            } else if (cDW == 'f') {
                we('f');
                if (this.tp.VH == 0) {
                    this.j6.v5(iHw);
                    this.j6.DW("\f");
                }
            } else if (cDW == 'n') {
                we('n');
                if (this.tp.VH == 0) {
                    this.j6.v5(iHw);
                    this.j6.DW("\n");
                }
            } else if (cDW == 'r') {
                we('r');
                if (this.tp.VH == 0) {
                    this.j6.v5(iHw);
                    this.j6.DW("\r");
                }
            } else if (cDW == 't') {
                we('t');
                if (this.tp.VH == 0) {
                    this.j6.v5(iHw);
                    this.j6.DW("\t");
                }
            } else if (cDW != 'u') {
                switch (cDW) {
                    case '0':
                    case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    case '2':
                    case '3':
                        QX('0', '3');
                        if (DW(1) >= '0' && DW(1) <= '7' && DW(2) >= 0 && DW(2) <= 65534) {
                            QX('0', '7');
                            if (DW(1) >= '0' && DW(1) <= '7' && DW(2) >= 0 && DW(2) <= 65534) {
                                QX('0', '7');
                            } else if (DW(1) < 0 || DW(1) > 65534) {
                                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                            }
                        } else if (DW(1) < 0 || DW(1) > 65534) {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                        if (this.tp.VH == 0) {
                            char c = (char) Integer.parseInt(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw), 8);
                            this.j6.v5(iHw);
                            this.j6.j6(c);
                            break;
                        }
                        break;
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        QX('4', '7');
                        if (DW(1) >= '0' && DW(1) <= '7' && DW(2) >= 0 && DW(2) <= 65534) {
                            QX('0', '7');
                        } else if (DW(1) < 0 || DW(1) > 65534) {
                            throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                        }
                        if (this.tp.VH == 0) {
                            char c2 = (char) Integer.parseInt(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw), 8);
                            this.j6.v5(iHw);
                            this.j6.j6(c2);
                            break;
                        }
                        break;
                    default:
                        throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
            } else {
                int i2 = 0;
                while (DW(1) == 'u') {
                    we('u');
                    i2++;
                }
                if (i2 < 1) {
                    throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
                }
                if (this.tp.VH == 0) {
                    this.j6.v5(iHw);
                    this.j6.DW("");
                }
                jw(false);
                jw(false);
                jw(false);
                jw(false);
                if (this.tp.VH == 0) {
                    char c3 = (char) Integer.parseInt(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw), 16);
                    this.j6.v5(iHw);
                    this.j6.j6(c3);
                }
            }
        }
        if (z) {
            tokenTp = tp(220);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void jw(boolean z) throws NoViableAltForCharException, MismatchedCharException {
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
            tokenTp = tp(222);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void k2(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("++");
        if (z) {
            tokenTp = tp(190);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void kQ(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        QX('0', '9');
        if (z) {
            tokenTp = tp(ProxyTextView.INPUTTYPE_textWebPassword);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void kf(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(".&");
        if (z) {
            tokenTp = tp(156);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ko(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('$');
        we('/');
        if (this.tp.VH == 0) {
            this.j6.v5(iHw);
            this.j6.j6('/');
        }
        if (z) {
            tokenTp = tp(216);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void lp(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we(':');
        if (z) {
            tokenTp = tp(136);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void mb(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">");
        if (z) {
            tokenTp = tp(100);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void n5(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('(');
        if (this.tp.VH == 0) {
            this.J8++;
        }
        if (z) {
            tokenTp = tp(91);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void oY(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('$');
        we('$');
        if (this.tp.VH == 0) {
            this.j6.v5(iHw);
            this.j6.j6('$');
        }
        if (z) {
            tokenTp = tp(217);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void oa(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("*.");
        if (z) {
            tokenTp = tp(154);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void oy(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('+');
        if (z) {
            tokenTp = tp(148);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void pN(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("?.");
        if (z) {
            tokenTp = tp(155);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void pO(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("!=");
        if (z) {
            tokenTp = tp(180);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void q7(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('!');
        if (z) {
            tokenTp = tp(196);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void qP(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>");
        if (z) {
            tokenTp = tp(102);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void qp(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("===");
        if (z) {
            tokenTp = tp(182);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected boolean ro() {
        return DW(1) == '$' && DW(2) == '$';
    }

    public final void sE(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("%=");
        if (z) {
            tokenTp = tp(166);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sG(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('@');
        if (z) {
            tokenTp = tp(96);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sM(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("..");
        if (z) {
            tokenTp = tp(188);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void sT(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("...");
        if (z) {
            tokenTp = tp(133);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sg(boolean r14) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.MismatchedCharException, groovyjarjarantlr.NoViableAltForCharException {
        /*
            r13 = this;
            groovyjarjarantlr.ANTLRStringBuffer r0 = r13.j6
            int r0 = r0.Hw()
            r1 = 0
            r2 = 1
            r13.Cz(r1, r2)
            char r3 = r13.DW(r2)
            r4 = 92
            r5 = 32
            r6 = 13
            r7 = 12
            r8 = 10
            r9 = 9
            r10 = 47
            if (r3 == r9) goto L43
            char r3 = r13.DW(r2)
            if (r3 == r8) goto L43
            char r3 = r13.DW(r2)
            if (r3 == r7) goto L43
            char r3 = r13.DW(r2)
            if (r3 == r6) goto L43
            char r3 = r13.DW(r2)
            if (r3 == r5) goto L43
            char r3 = r13.DW(r2)
            if (r3 == r10) goto L43
            char r3 = r13.DW(r2)
            if (r3 != r4) goto L9e
        L43:
            boolean r3 = r13.J0
            if (r3 != 0) goto L9e
            r3 = 0
        L48:
            char r11 = r13.DW(r2)
            if (r11 == r9) goto L98
            if (r11 == r8) goto L94
            if (r11 == r7) goto L98
            if (r11 == r6) goto L94
            if (r11 == r5) goto L98
            if (r11 == r4) goto L98
            char r11 = r13.DW(r2)
            r12 = 2
            if (r11 != r10) goto L69
            char r11 = r13.DW(r12)
            if (r11 != r10) goto L69
            r13.Bx(r1)
            goto L9b
        L69:
            char r11 = r13.DW(r2)
            if (r11 != r10) goto L7b
            char r11 = r13.DW(r12)
            r12 = 42
            if (r11 != r12) goto L7b
            r13.eU(r1)
            goto L9b
        L7b:
            if (r3 < r2) goto L7e
            goto L9e
        L7e:
            groovyjarjarantlr.NoViableAltForCharException r14 = new groovyjarjarantlr.NoViableAltForCharException
            char r0 = r13.DW(r2)
            java.lang.String r1 = r13.VH()
            int r2 = r13.gn()
            int r3 = r13.Zo()
            r14.<init>(r0, r1, r2, r3)
            throw r14
        L94:
            r13.Cz(r1, r2)
            goto L9b
        L98:
            r13.E4(r1)
        L9b:
            int r3 = r3 + 1
            goto L48
        L9e:
            groovyjarjarantlr.LexerSharedInputState r1 = r13.tp
            int r1 = r1.VH
            r2 = -1
            if (r1 != 0) goto Lbc
            boolean r1 = r13.J0
            if (r1 == 0) goto Laa
            goto Lbc
        Laa:
            int r1 = r13.J8
            if (r1 == 0) goto Lb0
            r1 = -1
            goto Lbe
        Lb0:
            groovyjarjarantlr.ANTLRStringBuffer r1 = r13.j6
            r1.v5(r0)
            groovyjarjarantlr.ANTLRStringBuffer r1 = r13.j6
            java.lang.String r3 = "<newline>"
            r1.DW(r3)
        Lbc:
            r1 = 205(0xcd, float:2.87E-43)
        Lbe:
            if (r14 == 0) goto Ldc
            if (r1 == r2) goto Ldc
            groovyjarjarantlr.Token r14 = r13.tp(r1)
            java.lang.String r1 = new java.lang.String
            groovyjarjarantlr.ANTLRStringBuffer r2 = r13.j6
            char[] r2 = r2.FH()
            groovyjarjarantlr.ANTLRStringBuffer r3 = r13.j6
            int r3 = r3.Hw()
            int r3 = r3 - r0
            r1.<init>(r2, r0, r3)
            r14.u7(r1)
            goto Ldd
        Ldc:
            r14 = 0
        Ldd:
            r13.gn = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyLexer.sg(boolean):void");
    }

    protected boolean sh() {
        if (DW(1) != '$') {
            return false;
        }
        char cDW = DW(2);
        if (cDW == '*') {
            cDW = DW(3);
        }
        if (cDW != '{') {
            return cDW != '$' && Character.isJavaIdentifierStart(cDW);
        }
        return true;
    }

    public final void sy(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("^=");
        if (z) {
            tokenTp = tp(171);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    @Override // groovyjarjarantlr.CharScanner
    protected Token tp(int i) {
        GroovySourceToken groovySourceToken = new GroovySourceToken(i);
        groovySourceToken.VH(this.tp.FH());
        groovySourceToken.gn(this.tp.Hw());
        groovySourceToken.EQ(this.tp.j6());
        groovySourceToken.we(this.tp.DW());
        return groovySourceToken;
    }

    protected final void vJ(boolean z) throws MismatchedCharException, NoViableAltForCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        char cDW = DW(1);
        if (cDW == 'G') {
            we('G');
        } else {
            if (cDW != 'g') {
                throw new NoViableAltForCharException(DW(1), VH(), gn(), Zo());
            }
            we('g');
        }
        if (z) {
            tokenTp = tp(230);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void w9(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('{');
        if (this.tp.VH == 0) {
            zf();
        }
        if (z) {
            tokenTp = tp(126);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void wc(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("/=");
        if (z) {
            tokenTp = tp(165);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void x9(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8(">>>=");
        if (z) {
            tokenTp = tp(168);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void yO(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        kQ(false);
        if (DW(1) == '0' || DW(1) == '1' || DW(1) == '2' || DW(1) == '3' || DW(1) == '4' || DW(1) == '5' || DW(1) == '6' || DW(1) == '7' || DW(1) == '8' || DW(1) == '9' || DW(1) == '_') {
            XG(false);
        }
        if (z) {
            tokenTp = tp(226);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected final void ye(boolean z) throws MismatchedCharException, NoViableAltForCharException {
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
            tokenTp = tp(229);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public final void ys(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        we('}');
        if (this.tp.VH == 0) {
            eN();
            if (this.QX != 0) {
                b(true);
            }
        }
        if (z) {
            tokenTp = tp(127);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    protected void zf() {
        this.XL.add(Integer.valueOf((this.J8 * 16) + this.QX));
        this.J8 = 0;
        this.QX = 0;
    }

    public final void zh(boolean z) throws MismatchedCharException {
        Token tokenTp;
        int iHw = this.j6.Hw();
        J8("&&");
        if (z) {
            tokenTp = tp(176);
            tokenTp.u7(new String(this.j6.FH(), iHw, this.j6.Hw() - iHw));
        } else {
            tokenTp = null;
        }
        this.gn = tokenTp;
    }

    public GroovyLexer(InputBuffer inputBuffer) {
        this(new LexerSharedInputState(inputBuffer));
    }

    public GroovyLexer(LexerSharedInputState lexerSharedInputState) {
        super(lexerSharedInputState);
        this.EQ = true;
        this.we = true;
        this.J0 = false;
        lg(1);
        this.J8 = 0;
        this.Ws = 0;
        this.QX = 0;
        this.XL = new ArrayList();
        this.aM = 1;
        this.v5 = true;
        U2(true);
        Hashtable hashtable = new Hashtable();
        this.Zo = hashtable;
        hashtable.put(new ANTLRHashString("byte", this), new Integer(106));
        this.Zo.put(new ANTLRHashString("public", this), new Integer(116));
        this.Zo.put(new ANTLRHashString("trait", this), new Integer(95));
        this.Zo.put(new ANTLRHashString("case", this), new Integer(150));
        this.Zo.put(new ANTLRHashString("short", this), new Integer(108));
        this.Zo.put(new ANTLRHashString("break", this), new Integer(144));
        this.Zo.put(new ANTLRHashString("while", this), new Integer(139));
        this.Zo.put(new ANTLRHashString("new", this), new Integer(159));
        this.Zo.put(new ANTLRHashString("instanceof", this), new Integer(158));
        this.Zo.put(new ANTLRHashString("implements", this), new Integer(131));
        this.Zo.put(new ANTLRHashString("synchronized", this), new Integer(121));
        this.Zo.put(new ANTLRHashString("const", this), new Integer(41));
        this.Zo.put(new ANTLRHashString("float", this), new Integer(110));
        this.Zo.put(new ANTLRHashString("package", this), new Integer(81));
        this.Zo.put(new ANTLRHashString("return", this), new Integer(143));
        this.Zo.put(new ANTLRHashString("throw", this), new Integer(146));
        this.Zo.put(new ANTLRHashString("null", this), new Integer(160));
        this.Zo.put(new ANTLRHashString("def", this), new Integer(84));
        this.Zo.put(new ANTLRHashString("threadsafe", this), new Integer(120));
        this.Zo.put(new ANTLRHashString("protected", this), new Integer(117));
        this.Zo.put(new ANTLRHashString("class", this), new Integer(92));
        this.Zo.put(new ANTLRHashString("throws", this), new Integer(130));
        this.Zo.put(new ANTLRHashString("do", this), new Integer(42));
        this.Zo.put(new ANTLRHashString("strictfp", this), new Integer(43));
        this.Zo.put(new ANTLRHashString("super", this), new Integer(99));
        this.Zo.put(new ANTLRHashString("transient", this), new Integer(118));
        this.Zo.put(new ANTLRHashString("native", this), new Integer(119));
        this.Zo.put(new ANTLRHashString("interface", this), new Integer(93));
        this.Zo.put(new ANTLRHashString("final", this), new Integer(38));
        this.Zo.put(new ANTLRHashString("if", this), new Integer(137));
        this.Zo.put(new ANTLRHashString("double", this), new Integer(112));
        this.Zo.put(new ANTLRHashString("volatile", this), new Integer(122));
        this.Zo.put(new ANTLRHashString("as", this), new Integer(114));
        this.Zo.put(new ANTLRHashString("assert", this), new Integer(147));
        this.Zo.put(new ANTLRHashString("catch", this), new Integer(153));
        this.Zo.put(new ANTLRHashString("try", this), new Integer(151));
        this.Zo.put(new ANTLRHashString("goto", this), new Integer(40));
        this.Zo.put(new ANTLRHashString("enum", this), new Integer(94));
        this.Zo.put(new ANTLRHashString("int", this), new Integer(109));
        this.Zo.put(new ANTLRHashString("for", this), new Integer(141));
        this.Zo.put(new ANTLRHashString("extends", this), new Integer(98));
        this.Zo.put(new ANTLRHashString("boolean", this), new Integer(105));
        this.Zo.put(new ANTLRHashString("char", this), new Integer(107));
        this.Zo.put(new ANTLRHashString("private", this), new Integer(115));
        this.Zo.put(new ANTLRHashString("default", this), new Integer(ProxyTextView.INPUTTYPE_textPassword));
        this.Zo.put(new ANTLRHashString("false", this), new Integer(157));
        this.Zo.put(new ANTLRHashString("this", this), new Integer(132));
        this.Zo.put(new ANTLRHashString("static", this), new Integer(83));
        this.Zo.put(new ANTLRHashString("abstract", this), new Integer(39));
        this.Zo.put(new ANTLRHashString("continue", this), new Integer(ProxyTextView.INPUTTYPE_textVisiblePassword));
        this.Zo.put(new ANTLRHashString("finally", this), new Integer(152));
        this.Zo.put(new ANTLRHashString("else", this), new Integer(138));
        this.Zo.put(new ANTLRHashString("import", this), new Integer(82));
        this.Zo.put(new ANTLRHashString("in", this), new Integer(142));
        this.Zo.put(new ANTLRHashString("void", this), new Integer(104));
        this.Zo.put(new ANTLRHashString("switch", this), new Integer(140));
        this.Zo.put(new ANTLRHashString("true", this), new Integer(ProxyTextView.INPUTTYPE_textWebEditText));
        this.Zo.put(new ANTLRHashString("long", this), new Integer(111));
    }
}
