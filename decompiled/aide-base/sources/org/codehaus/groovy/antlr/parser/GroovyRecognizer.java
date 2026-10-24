package org.codehaus.groovy.antlr.parser;

import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import groovyjarjarantlr.ASTFactory;
import groovyjarjarantlr.ASTPair;
import groovyjarjarantlr.CommonToken;
import groovyjarjarantlr.LLkParser;
import groovyjarjarantlr.MismatchedTokenException;
import groovyjarjarantlr.NoViableAltException;
import groovyjarjarantlr.RecognitionException;
import groovyjarjarantlr.SemanticException;
import groovyjarjarantlr.Token;
import groovyjarjarantlr.TokenStream;
import groovyjarjarantlr.TokenStreamException;
import groovyjarjarantlr.TokenStreamRecognitionException;
import groovyjarjarantlr.collections.AST;
import groovyjarjarantlr.collections.impl.ASTArray;
import groovyjarjarantlr.collections.impl.BitSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.codehaus.groovy.antlr.GroovySourceAST;
import org.codehaus.groovy.antlr.SourceBuffer;
import org.codehaus.groovy.antlr.SourceInfo;

/* loaded from: classes.dex */
public class GroovyRecognizer extends LLkParser implements GroovyTokenTypes {
    public static final BitSet AE;
    public static final BitSet AL;
    public static final BitSet An;
    public static final BitSet BR;
    public static final BitSet BT;
    public static final BitSet Bx;
    public static final BitSet CU;
    public static final BitSet Cz;
    public static final BitSet Eq;
    public static final BitSet Ev;
    public static final BitSet FN;
    public static final BitSet Gj;
    public static final BitSet I;
    public static final BitSet IS;
    public static final BitSet J0;
    public static final BitSet J8;
    public static final BitSet Jl;
    public static final BitSet Jm;
    public static final BitSet KD;
    public static final BitSet MP;
    public static final BitSet Mr;
    public static final BitSet Mz;
    public static final BitSet Nh;
    public static final BitSet OW;
    public static final BitSet Of;
    public static final BitSet P8;
    public static final BitSet PT;
    public static final BitSet Pa;
    public static final BitSet Q6;
    public static final BitSet QO;
    public static final BitSet QX;
    public static final BitSet Qq;
    public static final BitSet SI;
    public static final BitSet Sf;
    public static final BitSet U2;
    public static final BitSet WB;
    public static final BitSet Ws;
    public static final BitSet XG;
    public static final BitSet XL;
    public static final BitSet XX;
    public static final BitSet Xa;
    public static final BitSet Z1;
    public static final BitSet Za;
    public static final BitSet a5;
    public static final BitSet a8;
    public static final BitSet aM;
    public static final BitSet aX;
    public static final BitSet aj;
    public static final BitSet aq;
    public static final BitSet br;
    public static final BitSet cT;
    public static final BitSet ca;
    public static final BitSet cb;
    public static final BitSet ce;
    public static final BitSet cn;
    public static final BitSet dx;
    public static final BitSet e3;
    public static final BitSet e9;
    public static final BitSet eU;
    public static final BitSet ef;
    public static final BitSet ei;
    public static final BitSet er;
    public static final BitSet et;
    public static final BitSet fN;
    public static final BitSet fY;
    public static final BitSet g3;
    public static final BitSet gG;
    public static final BitSet gW;
    public static final BitSet hK;
    public static final BitSet hz;
    public static final BitSet iW;
    public static final BitSet j3;
    public static final BitSet jJ;
    public static final BitSet jO;
    public static final BitSet jw;
    public static final BitSet k2;
    public static final BitSet kQ;
    public static final BitSet kf;
    public static final BitSet ko;
    public static final BitSet lg;
    public static final BitSet lp;
    public static final BitSet mb;
    public static final BitSet n5;
    public static final BitSet nw;
    public static final BitSet oY;
    public static final BitSet oa;
    public static final BitSet oy;
    public static final BitSet pN;
    public static final BitSet pO;
    public static final BitSet q7;
    public static final BitSet qP;
    public static final BitSet qp;
    public static final BitSet rN;
    public static final BitSet ro;
    public static final BitSet sE;
    public static final BitSet sG;
    public static final BitSet sM;
    public static final BitSet sg;
    public static final BitSet sh;
    public static final BitSet sy;
    public static final BitSet vJ;
    public static final BitSet vy;
    public static final BitSet w9;
    public static final BitSet wc;
    public static final String[] we;
    public static final BitSet x9;
    public static final BitSet yO;
    public static final BitSet yS;
    public static final BitSet ye;
    public static final BitSet ys;
    public static final BitSet zh;
    private int EQ;
    private AST VH;
    List Zo;
    private int gn;
    private AST tp;
    private boolean u7;

    static {
        new GroovySourceAST();
        we = new String[]{"<0>", "EOF", "<2>", "NULL_TREE_LOOKAHEAD", "BLOCK", "MODIFIERS", "OBJBLOCK", "SLIST", "METHOD_DEF", "VARIABLE_DEF", "INSTANCE_INIT", "STATIC_INIT", "TYPE", "CLASS_DEF", "INTERFACE_DEF", "TRAIT_DEF", "PACKAGE_DEF", "ARRAY_DECLARATOR", "EXTENDS_CLAUSE", "IMPLEMENTS_CLAUSE", "PARAMETERS", "PARAMETER_DEF", "LABELED_STAT", "TYPECAST", "INDEX_OP", "POST_INC", "POST_DEC", "METHOD_CALL", "EXPR", "IMPORT", "UNARY_MINUS", "UNARY_PLUS", "CASE_GROUP", "ELIST", "FOR_INIT", "FOR_CONDITION", "FOR_ITERATOR", "EMPTY_STAT", "\"final\"", "\"abstract\"", "\"goto\"", "\"const\"", "\"do\"", "\"strictfp\"", "SUPER_CTOR_CALL", "CTOR_CALL", "CTOR_IDENT", "VARIABLE_PARAMETER_DEF", "STRING_CONSTRUCTOR", "STRING_CTOR_MIDDLE", "CLOSABLE_BLOCK", "IMPLICIT_PARAMETERS", "SELECT_SLOT", "DYNAMIC_MEMBER", "LABELED_ARG", "SPREAD_ARG", "SPREAD_MAP_ARG", "LIST_CONSTRUCTOR", "MAP_CONSTRUCTOR", "FOR_IN_ITERABLE", "STATIC_IMPORT", "ENUM_DEF", "ENUM_CONSTANT_DEF", "FOR_EACH_CLAUSE", "ANNOTATION_DEF", "ANNOTATIONS", "ANNOTATION", "ANNOTATION_MEMBER_VALUE_PAIR", "ANNOTATION_FIELD_DEF", "ANNOTATION_ARRAY_INIT", "TYPE_ARGUMENTS", "TYPE_ARGUMENT", "TYPE_PARAMETERS", "TYPE_PARAMETER", "WILDCARD_TYPE", "TYPE_UPPER_BOUNDS", "TYPE_LOWER_BOUNDS", "CLOSURE_LIST", "MULTICATCH", "MULTICATCH_TYPES", "a script header", "\"package\"", "\"import\"", "\"static\"", "\"def\"", "'['", "']'", "an identifier", "a string literal", "'<'", "'.'", "'('", "\"class\"", "\"interface\"", "\"enum\"", "\"trait\"", "'@'", "'?'", "\"extends\"", "\"super\"", "'>'", "','", "'>>'", "'>>>'", "\"void\"", "\"boolean\"", "\"byte\"", "\"char\"", "\"short\"", "\"int\"", "\"float\"", "\"long\"", "\"double\"", "'*'", "\"as\"", "\"private\"", "\"public\"", "\"protected\"", "\"transient\"", "\"native\"", "\"threadsafe\"", "\"synchronized\"", "\"volatile\"", "')'", "'='", "'&'", "'{'", "'}'", "';'", "\"default\"", "\"throws\"", "\"implements\"", "\"this\"", "'...'", "'|'", "'->'", "':'", "\"if\"", "\"else\"", "\"while\"", "\"switch\"", "\"for\"", "\"in\"", "\"return\"", "\"break\"", "\"continue\"", "\"throw\"", "\"assert\"", "'+'", "'-'", "\"case\"", "\"try\"", "\"finally\"", "\"catch\"", "'*.'", "'?.'", "'.&'", "\"false\"", "\"instanceof\"", "\"new\"", "\"null\"", "\"true\"", "'+='", "'-='", "'*='", "'/='", "'%='", "'>>='", "'>>>='", "'<<='", "'&='", "'^='", "'|='", "'**='", "'?:'", "'||'", "'&&'", "'^'", "'=~'", "'==~'", "'!='", "'=='", "'==='", "'!=='", "'<=>'", "'<='", "'>='", "'<<'", "'..'", "'..<'", "'++'", "'/'", "'%'", "'--'", "'**'", "'~'", "'!'", "STRING_CTOR_START", "a string literal end", "a numeric literal", "NUM_FLOAT", "NUM_LONG", "NUM_DOUBLE", "NUM_BIG_INT", "NUM_BIG_DECIMAL", "some newlines, whitespace or comments", "'$'", "whitespace", "a newline", "a single line comment", "a comment", "a string character", "a multiline regular expression literal", "a multiline dollar escaping regular expression literal", "a multiline regular expression literal end", "a multiline dollar escaping regular expression literal end", "ESCAPED_SLASH", "ESCAPED_DOLLAR", "a multiline regular expression character", "a multiline dollar escaping regular expression character", "an escape sequence", "a newline inside a string", "a hexadecimal digit", "a character", "a letter", "a digit", "a sequence of digits and underscores, bordered by digits", "a sequence of digits and underscores with maybe underscore starting", "an exponent", "a float or double suffix", "a big decimal suffix"};
        J0 = new BitSet(MP());
        J8 = new BitSet(Of());
        Ws = new BitSet(Od());
        QX = new BitSet(Ak());
        XL = new BitSet(uC());
        aM = new BitSet(cX());
        j3 = new BitSet(tR());
        Mr = new BitSet(Qs());
        U2 = new BitSet(IM());
        a8 = new BitSet(re());
        lg = new BitSet(PT());
        rN = new BitSet(PH());
        er = new BitSet(Yi());
        yS = new BitSet(GT());
        gW = new BitSet(Hl());
        BT = new BitSet(pl());
        vy = new BitSet(oh());
        P8 = new BitSet(Ej());
        ei = new BitSet(T6());
        nw = new BitSet(cc());
        SI = new BitSet(om());
        KD = new BitSet(wE());
        ro = new BitSet(d8());
        cn = new BitSet(N0());
        sh = new BitSet(eN());
        cb = new BitSet(zf());
        dx = new BitSet(fP());
        sG = new BitSet(b());
        ef = new BitSet(ba());
        Sf = new BitSet(u9());
        vJ = new BitSet(nl());
        g3 = new BitSet(ti());
        Mz = new BitSet(k1());
        I = new BitSet(iK());
        ca = new BitSet(fh());
        x9 = new BitSet(sv());
        Qq = new BitSet(HT());
        sy = new BitSet(oT());
        aj = new BitSet(hx());
        lp = new BitSet(qU());
        OW = new BitSet(ep());
        br = new BitSet(HO());
        XX = new BitSet(qI());
        kQ = new BitSet(DY());
        yO = new BitSet(tj());
        XG = new BitSet(pn());
        jJ = new BitSet(x6());
        wc = new BitSet(k4());
        et = new BitSet(RW());
        CU = new BitSet(Vq());
        Xa = new BitSet(ya());
        Eq = new BitSet(ir());
        hz = new BitSet(uD());
        aq = new BitSet(HE());
        FN = new BitSet(h2());
        jO = new BitSet(gy());
        oY = new BitSet(F3());
        ko = new BitSet(S4());
        Ev = new BitSet(tv());
        ye = new BitSet(gM());
        WB = new BitSet(ji());
        mb = new BitSet(ME());
        jw = new BitSet(C());
        fY = new BitSet(dH());
        qp = new BitSet(BN());
        k2 = new BitSet(jn());
        zh = new BitSet(DP());
        AL = new BitSet(ee());
        w9 = new BitSet(K3());
        hK = new BitSet(OM());
        cT = new BitSet(g0());
        q7 = new BitSet(fd());
        Z1 = new BitSet(Lx());
        n5 = new BitSet(wC());
        Q6 = new BitSet(hG());
        kf = new BitSet(s0());
        Jl = new BitSet(zg());
        iW = new BitSet(J1());
        eU = new BitSet(N2());
        e3 = new BitSet(NZ());
        sE = new BitSet(jg());
        sg = new BitSet(eQ());
        pO = new BitSet(BJ());
        fN = new BitSet(Sc());
        Gj = new BitSet(jD());
        Cz = new BitSet(UF());
        pN = new BitSet(rB());
        oy = new BitSet(CN());
        aX = new BitSet(oC());
        e9 = new BitSet(Dm());
        QO = new BitSet(TE());
        sM = new BitSet(df());
        a5 = new BitSet(p8());
        ys = new BitSet(Z3());
        IS = new BitSet(mu());
        gG = new BitSet(oP());
        Nh = new BitSet(LA());
        yu();
        e4();
        BR = new BitSet(jH());
        AE = new BitSet(b1());
        Za = new BitSet(AR());
        An = new BitSet(TI());
        Pa = new BitSet(ct());
        ce = new BitSet(Fd());
        Jm = new BitSet(Lz());
        Bx = new BitSet(sT());
        oa = new BitSet(E4());
        qP = new BitSet(xg());
        MP = new BitSet(hp());
        Of = new BitSet(GK());
        PT = new BitSet(dW());
    }

    protected GroovyRecognizer(TokenStream tokenStream, int i) {
        super(tokenStream, i);
        this.VH = null;
        this.gn = 1;
        this.u7 = false;
        this.tp = null;
        this.EQ = 0;
        this.DW = we;
        ef();
        this.Hw = new ASTFactory(VH());
    }

    private static final long[] AR() {
        return new long[]{17317308137472L, -4035226305573289984L, 4611686035137494975L, 16314, 0, 0, 0, 0};
    }

    private static final long[] Ak() {
        long[] jArr = new long[16];
        jArr[0] = -14;
        for (int i = 1; i <= 2; i++) {
            jArr[i] = -1;
        }
        jArr[3] = 549755813887L;
        return jArr;
    }

    private static final long[] BJ() {
        return new long[]{9620726743040L, 5186456860176678912L, 4611686034000805905L, 8122, 0, 0, 0, 0};
    }

    private static final long[] BN() {
        long[] jArr = new long[8];
        jArr[1] = -9223371895112466432L;
        jArr[2] = 1;
        jArr[3] = 8192;
        return jArr;
    }

    private boolean BR(Token token) {
        if (token == null || token.Hw() != 87) {
            return false;
        }
        String strJ6 = token.j6();
        return strJ6.length() > 0 && Character.isUpperCase(strJ6.charAt(0));
    }

    private boolean Bx(boolean z, String str, String str2) throws SemanticException {
        if (z) {
            return z;
        }
        oa(str, str2);
        throw null;
    }

    private static final long[] C() {
        long[] jArr = new long[8];
        jArr[1] = -9223371899415822336L;
        jArr[2] = 1;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] CN() {
        long[] jArr = new long[8];
        jArr[1] = 4612247903390400512L;
        jArr[2] = 4611686033999790096L;
        jArr[3] = 16314;
        return jArr;
    }

    private static final long[] DP() {
        long[] jArr = new long[8];
        jArr[1] = -4611685876013989888L;
        jArr[2] = 1;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] DY() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574770811296546816L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] Dm() {
        return new long[]{9620726743040L, 5186456860176678912L, 4611686034000805904L, 8122, 0, 0, 0, 0};
    }

    private static final long[] E4() {
        return new long[]{17317308137474L, -4362207232L, -469762081, 16319, 0, 0, 0, 0};
    }

    private static final long[] Ej() {
        return new long[]{9620726743040L, -4036915172651302912L, 4611686034009209521L, 16314, 0, 0, 0, 0};
    }

    private static final long[] F3() {
        return new long[]{9620726743042L, -4036915172550639616L, 4611686034013404691L, 16314, 0, 0, 0, 0};
    }

    private static final long[] Fd() {
        long[] jArr = new long[8];
        jArr[1] = 561850450182144L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] GK() {
        long[] jArr = new long[8];
        jArr[1] = 4612247903394594816L;
        jArr[2] = 4611686033999790096L;
        jArr[3] = 8122;
        return jArr;
    }

    private static final long[] GT() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574208957365092352L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] HE() {
        return new long[]{580267261558786L, -131072, -1, 16383, 0, 0, 0, 0};
    }

    private static final long[] HO() {
        long[] jArr = new long[8];
        jArr[1] = 4611686018563702784L;
        jArr[3] = 32;
        return jArr;
    }

    private static final long[] HT() {
        return new long[]{9620726743042L, -8072140335660269568L, 33, 8192, 0, 0, 0, 0};
    }

    private static final long[] Hl() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574770807907549184L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] IM() {
        long[] jArr = new long[8];
        jArr[2] = 1025;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] J1() {
        return new long[]{0, 111149056, 32, 0, 0, 0};
    }

    private static final long[] K3() {
        return new long[]{9620726743040L, 574770807270014976L, 0, 0};
    }

    private static final long[] LA() {
        return new long[]{17317308137472L, -3458765553202757632L, 4611686035607256767L, 16314, 0, 0, 0, 0};
    }

    private static final long[] Lx() {
        return new long[]{0, 34393292800L, 16, 0, 0, 0};
    }

    private static final long[] Lz() {
        return new long[]{17317308137474L, -563847702380544L, 4755801206033481695L, 16314, 0, 0, 0, 0};
    }

    private static final long[] ME() {
        long[] jArr = new long[8];
        jArr[1] = -8070450394674757632L;
        jArr[2] = 1;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] MP() {
        return new long[]{9620726743042L, 5186456864203472896L, 4611686034009209361L, 16314, 0, 0, 0, 0};
    }

    private static final long[] N0() {
        return new long[]{9620726743042L, -4036915172617748480L, 4611686034013404691L, 16314, 0, 0, 0, 0};
    }

    private static final long[] N2() {
        long[] jArr = new long[8];
        jArr[1] = 1729382394357612544L;
        jArr[2] = 128;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] NZ() {
        return new long[]{0, 109051904, 64, 0, 0, 0};
    }

    private boolean Nh(Token token) {
        AST ast = this.VH;
        if (ast == null || ast.getType() != 87) {
            return false;
        }
        String text = this.VH.getText();
        if (token == null || token.Hw() != 87) {
            return false;
        }
        return text.equals(token.j6());
    }

    private static final long[] OM() {
        long[] jArr = new long[8];
        jArr[1] = -4611686018427387904L;
        jArr[2] = 1;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] Od() {
        return new long[]{17317308137474L, -131072, 4755801206503243775L, 16314, 0, 0, 0, 0};
    }

    private static final long[] Of() {
        return new long[]{17317308137474L, -576460889742508032L, -1, 16319, 0, 0, 0, 0};
    }

    private static final long[] PH() {
        return new long[]{580267261558786L, -131072, -33, 16383, 0, 0, 0, 0};
    }

    private static final long[] PT() {
        return new long[]{2, Long.MIN_VALUE, 4195331, 8192, 0, 0, 0, 0};
    }

    private void Qk(boolean z, String str, String str2) {
        if (z) {
            return;
        }
        VD(str, str2);
        throw null;
    }

    private static final long[] Qs() {
        return new long[]{9620726743040L, -4036915073617756160L, 1, 8192, 0, 0, 0, 0};
    }

    private static final long[] RW() {
        return new long[]{17317308137472L, -1152921642045931520L, -70351564308481L, 16319, 0, 0, 0, 0};
    }

    private static final long[] S4() {
        long[] jArr = new long[8];
        jArr[1] = 4612248916866367488L;
        jArr[2] = 8;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] Sc() {
        return new long[]{17317308137472L, -137439084544L, -1, 16319, 0, 0, 0, 0};
    }

    private static final long[] T6() {
        return new long[]{9620726743040L, 5186456864203472896L, 4611686034009209360L, 8122, 0, 0, 0, 0};
    }

    private static final long[] TE() {
        return new long[]{0, 824633720832L, 4035225266123964416L, 0, 0, 0};
    }

    private static final long[] TI() {
        return new long[]{17317308137472L, 575896758406479872L, 16706960926L, 0, 0, 0};
    }

    private static final long[] UF() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574770807876091904L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] Vq() {
        return new long[]{17317308137472L, 575896758414868480L, 16706960926L, 0, 0, 0};
    }

    private static final long[] Yi() {
        return new long[]{9620726743040L, 574208956786278400L, 0, 0};
    }

    private static final long[] Z3() {
        long[] jArr = new long[8];
        jArr[1] = 4612247903390400512L;
        jArr[2] = 15569256464L;
        jArr[3] = 8096;
        return jArr;
    }

    private static final long[] b() {
        return new long[]{2, -8070450394808975360L, 4195331, 8192, 0, 0, 0, 0};
    }

    private static final long[] b1() {
        return new long[]{17317308137472L, 5187582776995348480L, 16706960926L, 8096, 0, 0, 0, 0};
    }

    private static final long[] ba() {
        long[] jArr = new long[8];
        jArr[1] = 8388608;
        jArr[2] = 4;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] cX() {
        return new long[]{9620726743040L, -4036915073080885248L, 1, 8192, 0, 0, 0, 0};
    }

    private static final long[] cc() {
        long[] jArr = new long[8];
        jArr[1] = 4612247903390400512L;
        jArr[2] = 4611686033999790096L;
        jArr[3] = 8122;
        return jArr;
    }

    private AST cn(AST ast, Object obj) {
        if ((ast instanceof GroovySourceAST) && (obj instanceof SourceInfo)) {
            SourceInfo sourceInfo = (SourceInfo) obj;
            GroovySourceAST groovySourceAST = (GroovySourceAST) ast;
            groovySourceAST.vy(sourceInfo.Zo());
            groovySourceAST.KD(sourceInfo.FH());
        }
        return ast;
    }

    private static final long[] ct() {
        return new long[]{0, 68753031168L, 432345564227584000L, 0, 0, 0};
    }

    private static final long[] d8() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574208960821198848L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] dH() {
        return new long[]{9620726743042L, -4036915069725442048L, 4195331, 8192, 0, 0, 0, 0};
    }

    private static final long[] dW() {
        return new long[]{17317308137472L, -131072, -1, 16319, 0, 0, 0, 0};
    }

    private static final long[] df() {
        return new long[]{-16, -4611686018427387905L, -1, 549755813887L, 0, 0, 0, 0};
    }

    private static final long[] e4() {
        return new long[]{17317308137474L, -576460752303554560L, -1, 16319, 0, 0, 0, 0};
    }

    private static final long[] eN() {
        return new long[]{0, 561850450182144L, 0, 0};
    }

    private static final long[] eQ() {
        return new long[]{9620726743040L, -2883993530504839168L, 4611686034009209521L, 16314, 0, 0, 0, 0};
    }

    private static final long[] ee() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574770807823663104L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] ep() {
        return new long[]{17317308137474L, -562949987106816L, 4755801206033481727L, 16314, 0, 0, 0, 0};
    }

    private static final long[] fP() {
        return new long[]{2, -8070450394674757632L, 4195331, 8192, 0, 0, 0, 0};
    }

    private static final long[] fd() {
        return new long[]{9620726743040L, -4036915172617748480L, 4611686034009209361L, 16314, 0, 0, 0, 0};
    }

    private static final long[] fh() {
        return new long[]{9620726743040L, 574770807288889344L, 0, 0};
    }

    private static final long[] g0() {
        return new long[]{9620726743040L, -4036915035178795008L, 4611686034009209361L, 16314, 0, 0, 0, 0};
    }

    private static final long[] gM() {
        return new long[]{9620726743040L, 574208956794667008L, 0, 0};
    }

    private static final long[] gy() {
        return new long[]{9620726743040L, -4036915207164395520L, 1, 8192, 0, 0, 0, 0};
    }

    private static final long[] h2() {
        long[] jArr = new long[8];
        jArr[1] = -4611685880308957184L;
        jArr[2] = 1;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] hG() {
        return new long[]{17317308137472L, -576460889742508032L, -1, 16319, 0, 0, 0, 0};
    }

    private static final long[] hp() {
        return new long[]{17317308137472L, 5188145731247931392L, 4611686035137494558L, 8122, 0, 0, 0, 0};
    }

    private static final long[] hx() {
        long[] jArr = new long[8];
        jArr[1] = 561859040116736L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] iK() {
        return new long[]{9620726743040L, 574770807355998208L, 0, 0};
    }

    private static final long[] ir() {
        long[] jArr = new long[8];
        jArr[1] = 4612247911980335104L;
        jArr[2] = 4611686033999790096L;
        jArr[3] = 16314;
        return jArr;
    }

    private static final long[] jD() {
        return new long[]{9620726743040L, 574770807876091904L, 16640, 8192, 0, 0, 0, 0};
    }

    private static final long[] jH() {
        return new long[]{17317308137472L, 5187582776995348480L, 4611686035137494558L, 16314, 0, 0, 0, 0};
    }

    private static final long[] jg() {
        return new long[]{274877906944L, 561854746198016L, 160, 8192, 0, 0, 0, 0};
    }

    private static final long[] ji() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574208957465755648L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] jn() {
        long[] jArr = new long[8];
        jArr[1] = 4303355904L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] k1() {
        return new long[]{2, 1729382394353418240L, 16641, 0, 0, 0};
    }

    private static final long[] k4() {
        long[] jArr = new long[8];
        jArr[1] = 4612247907685367808L;
        jArr[2] = 4611686033999790096L;
        jArr[3] = 8122;
        return jArr;
    }

    public static GroovyRecognizer make(GroovyLexer groovyLexer) {
        GroovyRecognizer groovyRecognizer = new GroovyRecognizer(groovyLexer.N0());
        groovyLexer.j3 = groovyRecognizer;
        groovyRecognizer.v5().Ws(GroovySourceAST.class);
        groovyRecognizer.Zo = new ArrayList();
        return groovyRecognizer;
    }

    private static final long[] mu() {
        return new long[]{17317308137474L, -3458765415763804160L, 4611686035607257023L, 16314, 0, 0, 0, 0};
    }

    private static final long[] nl() {
        return new long[]{9620726743040L, -4036915172651302912L, 4611686034009209361L, 16314, 0, 0, 0, 0};
    }

    private static final long[] oC() {
        return new long[]{2, -8646911147108204544L, 4195331, 8192, 0, 0, 0, 0};
    }

    private static final long[] oP() {
        long[] jArr = new long[8];
        jArr[1] = 4611686018630811648L;
        jArr[2] = 469762048;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] oT() {
        return new long[]{17317308137474L, -131072, -1, 16319, 0, 0, 0, 0};
    }

    private static final long[] oh() {
        long[] jArr = new long[8];
        jArr[0] = 9620726743040L;
        jArr[1] = 574770807892869120L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] om() {
        return new long[]{0, 545783808, 0, 0};
    }

    private static final long[] p8() {
        return new long[]{17317308137472L, 5187582776995348480L, 4611686035137494558L, 8122, 0, 0, 0, 0};
    }

    private static final long[] pl() {
        return new long[]{9620726743040L, 574770807236460544L, 0, 0};
    }

    private static final long[] pn() {
        long[] jArr = new long[8];
        jArr[0] = 2;
        jArr[1] = 799014912;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] qI() {
        long[] jArr = new long[16];
        jArr[0] = -16;
        jArr[1] = 4035225265983455231L;
        jArr[2] = -1;
        jArr[3] = 549755813791L;
        return jArr;
    }

    private static final long[] qU() {
        return new long[]{0, 893353197568L, 0, 0};
    }

    private static final long[] rB() {
        long[] jArr = new long[8];
        jArr[1] = 4611686018427387904L;
        jArr[2] = 16777216;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] re() {
        return new long[]{9620726743040L, 5186456864203472896L, 4611686034009210385L, 16314, 0, 0, 0, 0};
    }

    private static final long[] s0() {
        return new long[]{9620726743040L, 5186456864203472896L, 4611686034009209361L, 16314, 0, 0, 0, 0};
    }

    private static final long[] sT() {
        long[] jArr = new long[8];
        jArr[1] = 562949953421312L;
        jArr[2] = Long.MIN_VALUE;
        jArr[3] = 1;
        return jArr;
    }

    private static final long[] sv() {
        return new long[]{17317308137472L, 5764043533593739264L, 4611686035137494558L, 8122, 0, 0, 0, 0};
    }

    private static final long[] tR() {
        return new long[]{0, 8781824, 0, 0};
    }

    private static final long[] ti() {
        return new long[]{0, 111149056, 0, 0};
    }

    private static final long[] tj() {
        return new long[]{0, 561858805235712L, 0, 0};
    }

    private static final long[] tv() {
        return new long[]{9620726743040L, -2883992654331772928L, 9, 8192, 0, 0, 0, 0};
    }

    private static final long[] u9() {
        return new long[]{2, -4611686018427387904L, 4195331, 8192, 0, 0, 0, 0};
    }

    private static final long[] uC() {
        return new long[]{0, 4303749120L, 0, 0};
    }

    private static final long[] uD() {
        return new long[]{17317308137474L, -2306406865506009088L, 4611756386701803423L, 16314, 0, 0, 0, 0};
    }

    private static final long[] wC() {
        long[] jArr = new long[8];
        jArr[1] = 561859174334464L;
        jArr[3] = 8192;
        return jArr;
    }

    private static final long[] wE() {
        return new long[]{9620726743040L, 574208960812810240L, 0, 0};
    }

    private static final long[] x6() {
        return new long[]{9620726743040L, 574208952490262528L, 0, 0};
    }

    private static final long[] xg() {
        return new long[]{17317308137474L, -4295098368L, -33, 16319, 0, 0, 0, 0};
    }

    private static final long[] ya() {
        long[] jArr = new long[8];
        jArr[1] = 4612247903390400512L;
        jArr[2] = 4611756402743967760L;
        jArr[3] = 16314;
        return jArr;
    }

    private static final long[] yu() {
        return new long[]{9620726743042L, 5186456860176678912L, 4611686034000805904L, 8122, 0, 0, 0, 0};
    }

    private static final long[] zf() {
        return new long[]{0, 127926272, 0, 0};
    }

    private static final long[] zg() {
        return new long[]{17317308137474L, -3459328370112856064L, 4611686035137494943L, 16314, 0, 0, 0, 0};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AE() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.AE():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AL() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r13 = this;
            r0 = 0
            r13.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r13.DW(r1)
            r3 = 126(0x7e, float:1.77E-43)
            r13.u7(r3)
            int r3 = r13.j6(r1)
            r4 = 84
            r5 = 83
            r6 = 89
            r7 = 87
            r8 = 43
            r9 = 39
            r10 = 38
            r11 = 205(0xcd, float:2.87E-43)
            if (r3 == r10) goto L50
            if (r3 == r9) goto L50
            if (r3 == r8) goto L50
            if (r3 == r7) goto L50
            if (r3 == r6) goto L50
            if (r3 == r11) goto L5a
            if (r3 == r5) goto L50
            if (r3 == r4) goto L50
            switch(r3) {
                case 92: goto L50;
                case 93: goto L50;
                case 94: goto L50;
                case 95: goto L50;
                case 96: goto L50;
                default: goto L39;
            }
        L39:
            switch(r3) {
                case 104: goto L50;
                case 105: goto L50;
                case 106: goto L50;
                case 107: goto L50;
                case 108: goto L50;
                case 109: goto L50;
                case 110: goto L50;
                case 111: goto L50;
                case 112: goto L50;
                default: goto L3c;
            }
        L3c:
            switch(r3) {
                case 115: goto L50;
                case 116: goto L50;
                case 117: goto L50;
                case 118: goto L50;
                case 119: goto L50;
                case 120: goto L50;
                case 121: goto L50;
                case 122: goto L50;
                default: goto L3f;
            }
        L3f:
            switch(r3) {
                case 126: goto L50;
                case 127: goto L5a;
                case 128: goto L5a;
                default: goto L42;
            }
        L42:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r13.DW(r1)
            java.lang.String r2 = r13.Zo()
            r0.<init>(r1, r2)
            throw r0
        L50:
            r13.w9()
            groovyjarjarantlr.ASTFactory r3 = r13.Hw
            groovyjarjarantlr.collections.AST r12 = r13.FH
            r3.j6(r0, r12)
        L5a:
            int r3 = r13.j6(r1)
            r12 = 128(0x80, float:1.8E-43)
            if (r3 == r12) goto Lab
            int r3 = r13.j6(r1)
            if (r3 != r11) goto L69
            goto Lab
        L69:
            r3 = 127(0x7f, float:1.78E-43)
            r13.u7(r3)
            groovyjarjarantlr.ParserSharedInputState r3 = r13.j6
            int r3 = r3.DW
            if (r3 != 0) goto La6
            groovyjarjarantlr.collections.AST r3 = r0.j6
            groovyjarjarantlr.ASTFactory r4 = r13.Hw
            groovyjarjarantlr.collections.impl.ASTArray r5 = new groovyjarjarantlr.collections.impl.ASTArray
            r6 = 2
            r5.<init>(r6)
            r6 = 6
            groovyjarjarantlr.Token r1 = r13.DW(r1)
            java.lang.String r7 = "OBJBLOCK"
            groovyjarjarantlr.collections.AST r1 = r13.Ev(r6, r7, r2, r1)
            r5.j6(r1)
            r5.j6(r3)
            groovyjarjarantlr.collections.AST r1 = r4.we(r5)
            r0.j6 = r1
            if (r1 == 0) goto La1
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto La1
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        La1:
            r0.DW = r1
            r0.j6()
        La6:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r13.FH = r0
            return
        Lab:
            r13.be()
            int r3 = r13.j6(r1)
            if (r3 == r10) goto Ldc
            if (r3 == r9) goto Ldc
            if (r3 == r8) goto Ldc
            if (r3 == r7) goto Ldc
            if (r3 == r6) goto Ldc
            if (r3 == r11) goto L5a
            if (r3 == r5) goto Ldc
            if (r3 == r4) goto Ldc
            switch(r3) {
                case 92: goto Ldc;
                case 93: goto Ldc;
                case 94: goto Ldc;
                case 95: goto Ldc;
                case 96: goto Ldc;
                default: goto Lc5;
            }
        Lc5:
            switch(r3) {
                case 104: goto Ldc;
                case 105: goto Ldc;
                case 106: goto Ldc;
                case 107: goto Ldc;
                case 108: goto Ldc;
                case 109: goto Ldc;
                case 110: goto Ldc;
                case 111: goto Ldc;
                case 112: goto Ldc;
                default: goto Lc8;
            }
        Lc8:
            switch(r3) {
                case 115: goto Ldc;
                case 116: goto Ldc;
                case 117: goto Ldc;
                case 118: goto Ldc;
                case 119: goto Ldc;
                case 120: goto Ldc;
                case 121: goto Ldc;
                case 122: goto Ldc;
                default: goto Lcb;
            }
        Lcb:
            switch(r3) {
                case 126: goto Ldc;
                case 127: goto L5a;
                case 128: goto L5a;
                default: goto Lce;
            }
        Lce:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r13.DW(r1)
            java.lang.String r2 = r13.Zo()
            r0.<init>(r1, r2)
            throw r0
        Ldc:
            r13.w9()
            groovyjarjarantlr.ASTFactory r3 = r13.Hw
            groovyjarjarantlr.collections.AST r12 = r13.FH
            r3.j6(r0, r12)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.AL():void");
    }

    public final void Af() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        BT();
        AST ast = this.FH;
        u7(81);
        Cz();
        AST ast2 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(3);
            aSTArray.j6(Ev(16, "package", tokenDW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(ast2);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void An() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (j6(1) == 85 && MP.gn(j6(2))) {
            AST astV5 = this.Hw.v5(DW(1));
            u7(85);
            P8();
            AST ast2 = this.FH;
            this.Hw.j6(aSTPair, ast2);
            boolean z = this.j6.DW == 0 ? false | this.u7 : false;
            u7(86);
            if (this.j6.DW == 0) {
                int i = z ? 58 : 57;
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(2);
                aSTArray.j6(WB(i, "[", astV5, DW(1)));
                aSTArray.j6(ast2);
                AST astWe = aSTFactory.we(aSTArray);
                aSTPair.j6 = astWe;
                if (astWe != null && astWe.getFirstChild() != null) {
                    astWe = astWe.getFirstChild();
                }
                aSTPair.DW = astWe;
                aSTPair.j6();
            }
            ast = aSTPair.j6;
        } else {
            if (j6(1) != 85 || j6(2) != 136) {
                throw new NoViableAltException(DW(1), Zo());
            }
            AST astV52 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV52);
            u7(85);
            u7(136);
            u7(86);
            if (this.j6.DW == 0) {
                astV52.Mr(58);
            }
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void BT() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        if (XL.gn(j6(1)) && aM.gn(j6(2))) {
            gW();
            this.Hw.j6(aSTPair, this.FH);
        } else if (!j3.gn(j6(1)) || !Mr.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(65, "ANNOTATIONS", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void C1(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast2;
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        AST ast3 = this.VH;
        if (ast != null) {
            tokenOW.gn(ast.getLine());
            tokenOW.VH(ast.Zo());
        }
        u7(95);
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        Do();
        if (this.j6.DW == 0) {
            this.VH = astV5;
        }
        int iJ6 = j6(1);
        if (iJ6 == 89) {
            Y9();
            ast2 = this.FH;
            Do();
        } else {
            if (iJ6 != 98 && iJ6 != 126 && iJ6 != 131) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast2 = null;
        }
        Yd();
        AST ast4 = this.FH;
        oy();
        AST ast5 = this.FH;
        x9();
        AST ast6 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(7);
            aSTArray.j6(Ev(15, "TRAIT_DEF", tokenOW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(astV5);
            aSTArray.j6(ast2);
            aSTArray.j6(ast4);
            aSTArray.j6(ast5);
            aSTArray.j6(ast6);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        if (this.j6.DW == 0) {
            this.VH = ast3;
        }
        this.FH = astWe;
    }

    public final void CU() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        boolean z = false;
        if (j6(1) == 126 && vJ.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                u7(126);
                z = true;
            } catch (RecognitionException unused) {
            }
            we(iGn);
            this.j6.DW--;
        }
        if (z) {
            Eq();
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        } else {
            if (!ei.gn(j6(1)) || !J8.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
            Ed(1);
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void Cz() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        while (j6(1) == 90) {
            this.Hw.v5(DW(1));
            u7(90);
            Do();
            AST astV52 = this.Hw.v5(DW(1));
            u7(87);
            if (this.j6.DW == 0) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(3);
                aSTArray.j6(Ev(90, ".", tokenDW, DW(1)));
                aSTArray.j6(astV5);
                aSTArray.j6(astV52);
                astV5 = aSTFactory.we(aSTArray);
            }
        }
        if (this.j6.DW == 0) {
            aSTPair.j6 = astV5;
            if (astV5 != null && astV5.getFirstChild() != null) {
                astV5 = astV5.getFirstChild();
            }
            aSTPair.DW = astV5;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void D5(AST ast, AST ast2) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST astV5;
        AST ast3;
        boolean z;
        AST ast4;
        AST ast5;
        AST ast6;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        if (ast != null) {
            tokenOW.gn(ast.getLine());
            tokenOW.VH(ast.Zo());
        } else if (ast2 != null) {
            tokenOW.gn(ast2.getLine());
            tokenOW.VH(ast2.Zo());
        }
        if (j6(1) == 87 && sG.gn(j6(2))) {
            Za(ast, ast2, tokenOW);
            this.Hw.j6(aSTPair, this.FH);
            ast6 = aSTPair.j6;
        } else {
            if ((j6(1) != 87 && j6(1) != 88) || j6(2) != 91) {
                throw new NoViableAltException(DW(1), Zo());
            }
            int iJ6 = j6(1);
            if (iJ6 == 87) {
                astV5 = this.Hw.v5(DW(1));
                this.Hw.j6(aSTPair, astV5);
                u7(87);
                ast3 = null;
            } else {
                if (iJ6 != 88) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                AST astV52 = this.Hw.v5(DW(1));
                this.Hw.j6(aSTPair, astV52);
                u7(88);
                if (this.j6.DW == 0) {
                    astV52.Mr(87);
                }
                ast3 = astV52;
                astV5 = null;
            }
            u7(91);
            ik();
            AST ast7 = this.FH;
            u7(123);
            boolean z2 = false;
            if ((j6(1) == 130 || j6(1) == 205) && ef.gn(j6(2))) {
                int iGn = gn();
                this.j6.DW++;
                try {
                    Do();
                    u7(130);
                    z = true;
                } catch (RecognitionException unused) {
                    z = false;
                }
                we(iGn);
                this.j6.DW--;
            } else {
                z = false;
            }
            if (z) {
                gQ();
                ast4 = this.FH;
            } else {
                if (!Sf.gn(j6(1)) || !rN.gn(j6(2))) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                ast4 = null;
            }
            if ((j6(1) == 126 || j6(1) == 205) && vJ.gn(j6(2))) {
                int iGn2 = gn();
                this.j6.DW++;
                try {
                    Do();
                    u7(126);
                    z2 = true;
                } catch (RecognitionException unused2) {
                }
                we(iGn2);
                this.j6.DW--;
            }
            if (z2) {
                Sx();
                j7();
                ast5 = this.FH;
            } else {
                if (!lg.gn(j6(1)) || !rN.gn(j6(2))) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                ast5 = null;
            }
            if (this.j6.DW == 0) {
                if (ast3 != null) {
                    astV5 = ast3;
                }
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(7);
                aSTArray.j6(Ev(8, "METHOD_DEF", tokenOW, DW(1)));
                aSTArray.j6(ast);
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(2);
                aSTArray2.j6(Ev(12, "TYPE", tokenOW, DW(1)));
                aSTArray2.j6(ast2);
                aSTArray.j6(aSTFactory2.we(aSTArray2));
                aSTArray.j6(astV5);
                aSTArray.j6(ast7);
                aSTArray.j6(ast4);
                aSTArray.j6(ast5);
                AST astWe = aSTFactory.we(aSTArray);
                aSTPair.j6 = astWe;
                if (astWe != null && astWe.getFirstChild() != null) {
                    astWe = astWe.getFirstChild();
                }
                aSTPair.DW = astWe;
                aSTPair.j6();
            }
            ast6 = aSTPair.j6;
        }
        this.FH = ast6;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DV() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.DV():void");
    }

    public final void Do() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        if (j6(1) == 205 && Ws.gn(j6(2))) {
            u7(205);
        } else if (!Ws.gn(j6(1)) || !QX.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ed(int r17) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.Ed(int):void");
    }

    public final void Eq() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        j7();
        this.Hw.j6(aSTPair, this.FH);
        this.FH = aSTPair.j6;
    }

    public AST Ev(int i, String str, Token token, Token token2) {
        AST astYe = ye(i, str, this.Hw.v5(token));
        cn(astYe, token2);
        return astYe;
    }

    public final void FN() throws NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        switch (j6(1)) {
            case 199:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(199);
                ast = aSTPair.j6;
                break;
            case 200:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(200);
                ast = aSTPair.j6;
                break;
            case 201:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(201);
                ast = aSTPair.j6;
                break;
            case 202:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(202);
                ast = aSTPair.j6;
                break;
            case 203:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(203);
                ast = aSTPair.j6;
                break;
            case 204:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(204);
                ast = aSTPair.j6;
                break;
            default:
                throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = ast;
    }

    public final void Gj() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(153);
        u7(91);
        JT();
        AST ast = this.FH;
        u7(123);
        Sx();
        Eq();
        AST ast2 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(3);
            aSTArray.j6(Ev(153, "catch", tokenDW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(ast2);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void HU() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
        u7(124);
        Do();
        eU();
        this.Hw.j6(aSTPair, this.FH);
        this.FH = aSTPair.j6;
    }

    protected final void Hn() throws NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 100) {
            u7(100);
            if (this.j6.DW == 0) {
                this.EQ--;
            }
            ast = aSTPair.j6;
        } else if (iJ6 == 102) {
            u7(102);
            if (this.j6.DW == 0) {
                this.EQ -= 2;
            }
            ast = aSTPair.j6;
        } else {
            if (iJ6 != 103) {
                throw new NoViableAltException(DW(1), Zo());
            }
            u7(103);
            if (this.j6.DW == 0) {
                this.EQ -= 3;
            }
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void I() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        int i = 0;
        while (true) {
            if (j6(1) != 129 && j6(1) != 150) {
                break;
            }
            J8();
            this.Hw.j6(aSTPair, this.FH);
            i++;
        }
        if (i < 1) {
            throw new NoViableAltException(DW(1), Zo());
        }
        Mz();
        this.Hw.j6(aSTPair, this.FH);
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(32, "CASE_GROUP", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void I8() throws MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
        u7(87);
        this.FH = aSTPair.j6;
    }

    public final void IS() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        int iJ6 = j6(1);
        if (iJ6 == 98) {
            this.Hw.v5(DW(1));
            u7(98);
            Do();
            aj(true);
            this.Hw.j6(aSTPair, this.FH);
            while (j6(1) == 101) {
                u7(101);
                Do();
                aj(true);
                this.Hw.j6(aSTPair, this.FH);
            }
            Do();
        } else if (iJ6 != 126) {
            throw new NoViableAltException(DW(1), Zo());
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(18, "EXTENDS_CLAUSE", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void J8() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 129) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(ProxyTextView.INPUTTYPE_textPassword);
        } else {
            if (iJ6 != 150) {
                throw new NoViableAltException(DW(1), Zo());
            }
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(150);
            Jl(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        u7(136);
        Do();
        this.FH = aSTPair.j6;
    }

    public final void JT() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        Do();
        int iJ6 = j6(1);
        if (iJ6 == 38) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(38);
        } else if (iJ6 != 84 && iJ6 != 87 && iJ6 != 205) {
            throw new NoViableAltException(DW(1), Zo());
        }
        int iJ62 = j6(1);
        if (iJ62 == 84) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(84);
        } else if (iJ62 != 87 && iJ62 != 205) {
            throw new NoViableAltException(DW(1), Zo());
        }
        if ((j6(1) == 87 || j6(1) == 205) && e3.gn(j6(2))) {
            MX();
            ast = this.FH;
            this.Hw.j6(aSTPair, ast);
        } else if (j6(1) != 87 || j6(2) != 123) {
            throw new NoViableAltException(DW(1), Zo());
        }
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(3);
            aSTArray.j6(Ev(78, "MULTICATCH", tokenDW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(astV5);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void Jl(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        boolean z2 = false;
        if (j6(1) == 91 && sh.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                u7(91);
                np(true);
                u7(123);
                Jl(i);
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            AST astV5 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV5);
            u7(91);
            if (this.j6.DW == 0) {
                astV5.Mr(23);
            }
            np(true);
            this.Hw.j6(aSTPair, this.FH);
            u7(123);
            Jl(i);
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        } else {
            if (j6(1) == 91 && (j6(2) == 87 || j6(2) == 205)) {
                int iGn2 = gn();
                this.j6.DW++;
                try {
                    u7(91);
                    Do();
                    u7(87);
                    while (j6(1) == 101) {
                        u7(101);
                        Do();
                        u7(87);
                    }
                    u7(123);
                    u7(124);
                    z2 = true;
                } catch (RecognitionException unused2) {
                }
                we(iGn2);
                this.j6.DW--;
            }
            if (z2) {
                w2(i);
                AST firstChild = this.FH;
                this.Hw.j6(aSTPair, firstChild);
                if (this.j6.DW == 0) {
                    aSTPair.j6 = firstChild;
                    if (firstChild != null && firstChild.getFirstChild() != null) {
                        firstChild = firstChild.getFirstChild();
                    }
                    aSTPair.DW = firstChild;
                    aSTPair.j6();
                }
                ast = aSTPair.j6;
            } else {
                if (!nw.gn(j6(1)) || !sy.gn(j6(2))) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                KD(i);
                this.Hw.j6(aSTPair, this.FH);
                ast = aSTPair.j6;
            }
        }
        this.FH = ast;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void KD(int r4) throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.KD(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KM(int r11) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.KM(int):void");
    }

    public final void Lm() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 85 || iJ6 == 91 || iJ6 == 126) {
            int iJ62 = j6(1);
            if (iJ62 == 85) {
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(85);
            } else if (iJ62 == 91) {
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(91);
            } else {
                if (iJ62 != 126) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(126);
            }
        } else {
            if (iJ6 != 148 && iJ6 != 149) {
                throw new NoViableAltException(DW(1), Zo());
            }
            int iJ63 = j6(1);
            if (iJ63 == 148) {
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(148);
            } else {
                if (iJ63 != 149) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(149);
            }
        }
        this.FH = aSTPair.j6;
    }

    public final void MX() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        Do();
        aj(false);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 134) {
            u7(134);
            Do();
            aj(false);
            this.Hw.j6(aSTPair, this.FH);
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(79, "MULTICATCH_TYPES", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Mk() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.Mk():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Mr() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r14 = this;
            r0 = 0
            r14.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r14.DW(r1)
            r3 = 126(0x7e, float:1.77E-43)
            r14.u7(r3)
            int r3 = r14.j6(r1)
            r4 = 84
            r5 = 83
            r6 = 87
            r7 = 43
            r8 = 39
            r9 = 38
            r10 = 128(0x80, float:1.8E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 205(0xcd, float:2.87E-43)
            if (r3 == r9) goto L51
            if (r3 == r8) goto L51
            if (r3 == r7) goto L51
            if (r3 == r6) goto L51
            if (r3 == r12) goto L5b
            if (r3 == r5) goto L51
            if (r3 == r4) goto L51
            if (r3 == r11) goto L5b
            if (r3 == r10) goto L5b
            switch(r3) {
                case 92: goto L51;
                case 93: goto L51;
                case 94: goto L51;
                case 95: goto L51;
                case 96: goto L51;
                default: goto L3d;
            }
        L3d:
            switch(r3) {
                case 104: goto L51;
                case 105: goto L51;
                case 106: goto L51;
                case 107: goto L51;
                case 108: goto L51;
                case 109: goto L51;
                case 110: goto L51;
                case 111: goto L51;
                case 112: goto L51;
                default: goto L40;
            }
        L40:
            switch(r3) {
                case 115: goto L51;
                case 116: goto L51;
                case 117: goto L51;
                case 118: goto L51;
                case 119: goto L51;
                case 120: goto L51;
                case 121: goto L51;
                case 122: goto L51;
                default: goto L43;
            }
        L43:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r14.DW(r1)
            java.lang.String r2 = r14.Zo()
            r0.<init>(r1, r2)
            throw r0
        L51:
            r14.a8()
            groovyjarjarantlr.ASTFactory r3 = r14.Hw
            groovyjarjarantlr.collections.AST r13 = r14.FH
            r3.j6(r0, r13)
        L5b:
            int r3 = r14.j6(r1)
            if (r3 == r10) goto La8
            int r3 = r14.j6(r1)
            if (r3 != r12) goto L68
            goto La8
        L68:
            r14.u7(r11)
            groovyjarjarantlr.ParserSharedInputState r3 = r14.j6
            int r3 = r3.DW
            if (r3 != 0) goto La3
            groovyjarjarantlr.collections.AST r3 = r0.j6
            groovyjarjarantlr.ASTFactory r4 = r14.Hw
            groovyjarjarantlr.collections.impl.ASTArray r5 = new groovyjarjarantlr.collections.impl.ASTArray
            r6 = 2
            r5.<init>(r6)
            r6 = 6
            groovyjarjarantlr.Token r1 = r14.DW(r1)
            java.lang.String r7 = "OBJBLOCK"
            groovyjarjarantlr.collections.AST r1 = r14.Ev(r6, r7, r2, r1)
            r5.j6(r1)
            r5.j6(r3)
            groovyjarjarantlr.collections.AST r1 = r4.we(r5)
            r0.j6 = r1
            if (r1 == 0) goto L9e
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto L9e
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        L9e:
            r0.DW = r1
            r0.j6()
        La3:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r14.FH = r0
            return
        La8:
            r14.be()
            int r3 = r14.j6(r1)
            if (r3 == r9) goto Ld8
            if (r3 == r8) goto Ld8
            if (r3 == r7) goto Ld8
            if (r3 == r6) goto Ld8
            if (r3 == r12) goto L5b
            if (r3 == r5) goto Ld8
            if (r3 == r4) goto Ld8
            if (r3 == r11) goto L5b
            if (r3 == r10) goto L5b
            switch(r3) {
                case 92: goto Ld8;
                case 93: goto Ld8;
                case 94: goto Ld8;
                case 95: goto Ld8;
                case 96: goto Ld8;
                default: goto Lc4;
            }
        Lc4:
            switch(r3) {
                case 104: goto Ld8;
                case 105: goto Ld8;
                case 106: goto Ld8;
                case 107: goto Ld8;
                case 108: goto Ld8;
                case 109: goto Ld8;
                case 110: goto Ld8;
                case 111: goto Ld8;
                case 112: goto Ld8;
                default: goto Lc7;
            }
        Lc7:
            switch(r3) {
                case 115: goto Ld8;
                case 116: goto Ld8;
                case 117: goto Ld8;
                case 118: goto Ld8;
                case 119: goto Ld8;
                case 120: goto Ld8;
                case 121: goto Ld8;
                case 122: goto Ld8;
                default: goto Lca;
            }
        Lca:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r14.DW(r1)
            java.lang.String r2 = r14.Zo()
            r0.<init>(r1, r2)
            throw r0
        Ld8:
            r14.a8()
            groovyjarjarantlr.ASTFactory r3 = r14.Hw
            groovyjarjarantlr.collections.AST r13 = r14.FH
            r3.j6(r0, r13)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.Mr():void");
    }

    public final void Mz() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        Ed(136);
        this.Hw.j6(aSTPair, this.FH);
        while (true) {
            if (j6(1) != 128 && j6(1) != 205) {
                if (this.j6.DW == 0) {
                    AST ast = aSTPair.j6;
                    ASTFactory aSTFactory = this.Hw;
                    ASTArray aSTArray = new ASTArray(2);
                    aSTArray.j6(Ev(7, "SLIST", tokenDW, DW(1)));
                    aSTArray.j6(ast);
                    AST astWe = aSTFactory.we(aSTArray);
                    aSTPair.j6 = astWe;
                    if (astWe != null && astWe.getFirstChild() != null) {
                        astWe = astWe.getFirstChild();
                    }
                    aSTPair.DW = astWe;
                    aSTPair.j6();
                }
                this.FH = aSTPair.j6;
                return;
            }
            be();
            int iJ6 = j6(1);
            if (iJ6 != 38 && iJ6 != 39 && iJ6 != 87 && iJ6 != 88) {
                switch (iJ6) {
                    case 43:
                    case 99:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 132:
                    case 137:
                    case 157:
                    case 190:
                    case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                    case 195:
                    case 196:
                    case 197:
                    case 199:
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                    case 204:
                        break;
                    case 205:
                        continue;
                    default:
                        switch (iJ6) {
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                                break;
                            default:
                                switch (iJ6) {
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                        break;
                                    default:
                                        switch (iJ6) {
                                            case 115:
                                            case 116:
                                            case 117:
                                            case 118:
                                            case 119:
                                            case 120:
                                            case 121:
                                            case 122:
                                                break;
                                            default:
                                                switch (iJ6) {
                                                    case 126:
                                                        break;
                                                    case 127:
                                                    case 128:
                                                    case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                                                        continue;
                                                    default:
                                                        switch (iJ6) {
                                                            case 139:
                                                            case 140:
                                                            case 141:
                                                                break;
                                                            default:
                                                                switch (iJ6) {
                                                                    case 143:
                                                                    case 144:
                                                                    case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                                                                    case 146:
                                                                    case 147:
                                                                    case 148:
                                                                    case 149:
                                                                    case 151:
                                                                        break;
                                                                    case 150:
                                                                        continue;
                                                                    default:
                                                                        switch (iJ6) {
                                                                            case 159:
                                                                            case 160:
                                                                            case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                                                                                break;
                                                                            default:
                                                                                throw new NoViableAltException(DW(1), Zo());
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                }
                                                break;
                                        }
                                }
                        }
                }
            }
            Ed(this.gn);
            this.Hw.j6(aSTPair, this.FH);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NH() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r8 = this;
            r0 = 0
            r8.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 0
            r2 = 0
        La:
            r3 = 1
            int r4 = r8.j6(r3)
            r5 = 84
            if (r4 != r5) goto L21
            int r4 = r1 + 1
            if (r1 != 0) goto L20
            r8.u7(r5)
            r8.Do()
            r1 = r4
            goto L93
        L20:
            r1 = r4
        L21:
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.jJ
            int r5 = r8.j6(r3)
            boolean r4 = r4.gn(r5)
            if (r4 == 0) goto L3b
            r8.d5()
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.AST r4 = r8.FH
            r3.j6(r0, r4)
            r8.Do()
            goto L93
        L3b:
            int r4 = r8.j6(r3)
            r5 = 2
            r6 = 96
            if (r4 != r6) goto L78
            int r4 = r8.j6(r5)
            r7 = 93
            if (r4 != r7) goto L78
            groovyjarjarantlr.ParserSharedInputState r4 = r8.j6
            int r4 = r4.DW
            if (r4 != 0) goto L53
            goto L99
        L53:
            groovyjarjarantlr.ASTFactory r4 = r8.Hw
            groovyjarjarantlr.Token r5 = r8.DW(r3)
            groovyjarjarantlr.collections.AST r4 = r4.v5(r5)
            groovyjarjarantlr.ASTFactory r5 = r8.Hw
            r5.j6(r0, r4)
            r8.u7(r6)
            groovyjarjarantlr.ASTFactory r4 = r8.Hw
            groovyjarjarantlr.Token r3 = r8.DW(r3)
            groovyjarjarantlr.collections.AST r3 = r4.v5(r3)
            groovyjarjarantlr.ASTFactory r4 = r8.Hw
            r4.j6(r0, r3)
            r8.u7(r7)
            goto L93
        L78:
            int r4 = r8.j6(r3)
            if (r4 != r6) goto L97
            int r4 = r8.j6(r5)
            r5 = 87
            if (r4 != r5) goto L97
            r8.aM()
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.AST r4 = r8.FH
            r3.j6(r0, r4)
            r8.Do()
        L93:
            int r2 = r2 + 1
            goto La
        L97:
            if (r2 < r3) goto L9e
        L99:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r8.FH = r0
            return
        L9e:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r8.DW(r3)
            java.lang.String r2 = r8.Zo()
            r0.<init>(r1, r2)
            goto Lad
        Lac:
            throw r0
        Lad:
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.NH():void");
    }

    public final void Na() throws SemanticException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        this.Hw.v5(DW(1));
        u7(87);
        this.Hw.v5(DW(1));
        u7(90);
        while (j6(1) == 87 && j6(2) == 90) {
            this.Hw.v5(DW(1));
            u7(87);
            this.Hw.v5(DW(1));
            u7(90);
        }
        dz();
        this.FH = null;
    }

    public Token OW(Token token) {
        CommonToken commonToken = new CommonToken(token.Hw(), token.j6());
        commonToken.gn(token.FH());
        commonToken.VH(token.Zo());
        return commonToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(int r5) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r4 = this;
            r0 = 0
            r4.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r4.QX(r5)
            groovyjarjarantlr.ASTFactory r5 = r4.Hw
            groovyjarjarantlr.collections.AST r1 = r4.FH
            r5.j6(r0, r1)
        L12:
            groovyjarjarantlr.collections.impl.BitSet r5 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.QO
            r1 = 1
            int r2 = r4.j6(r1)
            boolean r5 = r5.gn(r2)
            if (r5 == 0) goto Lc8
            int r5 = r4.j6(r1)
            r2 = 103(0x67, float:1.44E-43)
            r3 = 102(0x66, float:1.43E-43)
            if (r5 == r3) goto L66
            if (r5 == r2) goto L66
            switch(r5) {
                case 187: goto L66;
                case 188: goto L51;
                case 189: goto L3c;
                default: goto L2e;
            }
        L2e:
            groovyjarjarantlr.NoViableAltException r5 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r0 = r4.DW(r1)
            java.lang.String r1 = r4.Zo()
            r5.<init>(r0, r1)
            throw r5
        L3c:
            groovyjarjarantlr.ASTFactory r5 = r4.Hw
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            groovyjarjarantlr.collections.AST r5 = r5.v5(r1)
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            r1.J8(r0, r5)
            r5 = 189(0xbd, float:2.65E-43)
            r4.u7(r5)
            goto Lb8
        L51:
            groovyjarjarantlr.ASTFactory r5 = r4.Hw
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            groovyjarjarantlr.collections.AST r5 = r5.v5(r1)
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            r1.J8(r0, r5)
            r5 = 188(0xbc, float:2.63E-43)
            r4.u7(r5)
            goto Lb8
        L66:
            int r5 = r4.j6(r1)
            if (r5 == r3) goto La6
            if (r5 == r2) goto L93
            r2 = 187(0xbb, float:2.62E-43)
            if (r5 != r2) goto L85
            groovyjarjarantlr.ASTFactory r5 = r4.Hw
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            groovyjarjarantlr.collections.AST r5 = r5.v5(r1)
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            r1.J8(r0, r5)
            r4.u7(r2)
            goto Lb8
        L85:
            groovyjarjarantlr.NoViableAltException r5 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r0 = r4.DW(r1)
            java.lang.String r1 = r4.Zo()
            r5.<init>(r0, r1)
            throw r5
        L93:
            groovyjarjarantlr.ASTFactory r5 = r4.Hw
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            groovyjarjarantlr.collections.AST r5 = r5.v5(r1)
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            r1.J8(r0, r5)
            r4.u7(r2)
            goto Lb8
        La6:
            groovyjarjarantlr.ASTFactory r5 = r4.Hw
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            groovyjarjarantlr.collections.AST r5 = r5.v5(r1)
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            r1.J8(r0, r5)
            r4.u7(r3)
        Lb8:
            r4.Do()
            r5 = 0
            r4.QX(r5)
            groovyjarjarantlr.ASTFactory r5 = r4.Hw
            groovyjarjarantlr.collections.AST r1 = r4.FH
            r5.j6(r0, r1)
            goto L12
        Lc8:
            groovyjarjarantlr.collections.AST r5 = r0.j6
            r4.FH = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.Oo(int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c1 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P8() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.P8():void");
    }

    public final void Pa(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        QO(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 176) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(176);
            Do();
            QO(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    public final void Q6(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        XL(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 177) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(ProxyTextView.INPUTTYPE_textFilter);
            Do();
            XL(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    public final void QO(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Q6(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 134) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(134);
            Do();
            Q6(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        r5.FH = r0.j6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QX(int r6) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r5 = this;
            r0 = 0
            r5.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r5.fp(r6)
            groovyjarjarantlr.ASTFactory r6 = r5.Hw
            groovyjarjarantlr.collections.AST r1 = r5.FH
            r6.j6(r0, r1)
        L12:
            r6 = 1
            int r1 = r5.j6(r6)
            r2 = 149(0x95, float:2.09E-43)
            r3 = 148(0x94, float:2.07E-43)
            if (r1 == r3) goto L23
            int r1 = r5.j6(r6)
            if (r1 != r2) goto L7a
        L23:
            groovyjarjarantlr.collections.impl.BitSet r1 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.oy
            r4 = 2
            int r4 = r5.j6(r4)
            boolean r1 = r1.gn(r4)
            if (r1 == 0) goto L7a
            int r1 = r5.j6(r6)
            if (r1 == r3) goto L59
            if (r1 != r2) goto L4b
            groovyjarjarantlr.ASTFactory r1 = r5.Hw
            groovyjarjarantlr.Token r6 = r5.DW(r6)
            groovyjarjarantlr.collections.AST r6 = r1.v5(r6)
            groovyjarjarantlr.ASTFactory r1 = r5.Hw
            r1.J8(r0, r6)
            r5.u7(r2)
            goto L6b
        L4b:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r6 = r5.DW(r6)
            java.lang.String r1 = r5.Zo()
            r0.<init>(r6, r1)
            throw r0
        L59:
            groovyjarjarantlr.ASTFactory r1 = r5.Hw
            groovyjarjarantlr.Token r6 = r5.DW(r6)
            groovyjarjarantlr.collections.AST r6 = r1.v5(r6)
            groovyjarjarantlr.ASTFactory r1 = r5.Hw
            r1.J8(r0, r6)
            r5.u7(r3)
        L6b:
            r5.Do()
            r6 = 0
            r5.fp(r6)
            groovyjarjarantlr.ASTFactory r6 = r5.Hw
            groovyjarjarantlr.collections.AST r1 = r5.FH
            r6.j6(r0, r1)
            goto L12
        L7a:
            groovyjarjarantlr.collections.AST r6 = r0.j6
            r5.FH = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.QX(int):void");
    }

    public final void Qq(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast2;
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        AST ast3 = this.VH;
        if (ast != null) {
            tokenOW.gn(ast.getLine());
            tokenOW.VH(ast.Zo());
        }
        u7(92);
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        Do();
        if (this.j6.DW == 0) {
            this.VH = astV5;
        }
        int iJ6 = j6(1);
        if (iJ6 == 89) {
            Y9();
            ast2 = this.FH;
            Do();
        } else {
            if (iJ6 != 98 && iJ6 != 126 && iJ6 != 131) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast2 = null;
        }
        Yd();
        AST ast4 = this.FH;
        oy();
        AST ast5 = this.FH;
        x9();
        AST ast6 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(7);
            aSTArray.j6(Ev(13, "CLASS_DEF", tokenOW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(astV5);
            aSTArray.j6(ast2);
            aSTArray.j6(ast4);
            aSTArray.j6(ast5);
            aSTArray.j6(ast6);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        if (this.j6.DW == 0) {
            this.VH = ast3;
        }
        this.FH = astWe;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SI() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r5 = this;
            r0 = 0
            r5.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r1 = 1
            int r2 = r5.j6(r1)
            r3 = 87
            if (r2 == r3) goto L5c
            r3 = 88
            if (r2 == r3) goto L4f
            r3 = 98
            if (r2 == r3) goto L4b
            r3 = 99
            if (r2 == r3) goto L4b
            switch(r2) {
                case 38: goto L4b;
                case 39: goto L4b;
                case 40: goto L4b;
                case 41: goto L4b;
                case 42: goto L4b;
                case 43: goto L4b;
                default: goto L20;
            }
        L20:
            switch(r2) {
                case 81: goto L4b;
                case 82: goto L4b;
                case 83: goto L4b;
                case 84: goto L4b;
                case 85: goto L47;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 91: goto L47;
                case 92: goto L4b;
                case 93: goto L4b;
                case 94: goto L4b;
                case 95: goto L4b;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 104: goto L4b;
                case 105: goto L4b;
                case 106: goto L4b;
                case 107: goto L4b;
                case 108: goto L4b;
                case 109: goto L4b;
                case 110: goto L4b;
                case 111: goto L4b;
                case 112: goto L4b;
                default: goto L29;
            }
        L29:
            switch(r2) {
                case 114: goto L4b;
                case 115: goto L4b;
                case 116: goto L4b;
                case 117: goto L4b;
                case 118: goto L4b;
                case 119: goto L4b;
                case 120: goto L4b;
                case 121: goto L4b;
                case 122: goto L4b;
                default: goto L2c;
            }
        L2c:
            switch(r2) {
                case 126: goto L47;
                case 137: goto L4b;
                case 138: goto L4b;
                case 139: goto L4b;
                case 140: goto L4b;
                case 141: goto L4b;
                case 142: goto L4b;
                case 143: goto L4b;
                case 144: goto L4b;
                case 145: goto L4b;
                case 146: goto L4b;
                case 147: goto L4b;
                case 157: goto L4b;
                case 158: goto L4b;
                case 159: goto L4b;
                case 160: goto L4b;
                case 161: goto L4b;
                case 197: goto L47;
                case 199: goto L43;
                case 200: goto L43;
                case 201: goto L43;
                case 202: goto L43;
                case 203: goto L43;
                case 204: goto L43;
                default: goto L2f;
            }
        L2f:
            switch(r2) {
                case 129: goto L4b;
                case 130: goto L4b;
                case 131: goto L4b;
                case 132: goto L4b;
                default: goto L32;
            }
        L32:
            switch(r2) {
                case 150: goto L4b;
                case 151: goto L4b;
                case 152: goto L4b;
                case 153: goto L4b;
                default: goto L35;
            }
        L35:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            java.lang.String r2 = r5.Zo()
            r0.<init>(r1, r2)
            throw r0
        L43:
            r5.FN()
            goto L68
        L47:
            r5.sh()
            goto L68
        L4b:
            r5.AE()
            goto L68
        L4f:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r4 = r5.DW(r1)
            r2.v5(r4)
            r5.u7(r3)
            goto L68
        L5c:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r4 = r5.DW(r1)
            r2.v5(r4)
            r5.u7(r3)
        L68:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r1 = 136(0x88, float:1.9E-43)
            r5.u7(r1)
            r5.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.SI():void");
    }

    public final void Sf() throws NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        switch (j6(1)) {
            case 104:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(104);
                ast = aSTPair.j6;
                break;
            case 105:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(105);
                ast = aSTPair.j6;
                break;
            case 106:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(106);
                ast = aSTPair.j6;
                break;
            case 107:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(107);
                ast = aSTPair.j6;
                break;
            case 108:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(108);
                ast = aSTPair.j6;
                break;
            case 109:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(109);
                ast = aSTPair.j6;
                break;
            case 110:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(110);
                ast = aSTPair.j6;
                break;
            case 111:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(111);
                ast = aSTPair.j6;
                break;
            case 112:
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(112);
                ast = aSTPair.j6;
                break;
            default:
                throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = ast;
    }

    public final void Sg(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Mk();
        AST firstChild = this.j6.DW == 0 ? this.FH : null;
        while (true) {
            boolean z2 = false;
            if (gG.gn(j6(1)) && Nh.gn(j6(2))) {
                int iGn = gn();
                this.j6.DW++;
                try {
                    uF();
                    z = true;
                } catch (RecognitionException unused) {
                    z = false;
                }
                we(iGn);
                this.j6.DW--;
            } else {
                z = false;
            }
            if (!z) {
                if ((j6(1) == 126 || j6(1) == 205) && P8.gn(j6(2)) && (i == 1 || i == 2)) {
                    int iGn2 = gn();
                    this.j6.DW++;
                    try {
                        Do();
                        u7(126);
                        z2 = true;
                    } catch (RecognitionException unused2) {
                    }
                    we(iGn2);
                    this.j6.DW--;
                }
                if (!z2) {
                    break;
                }
                Sx();
                vy(firstChild);
                AST ast = this.FH;
                if (this.j6.DW == 0) {
                    firstChild = ast;
                }
            } else {
                Do();
                TJ(firstChild);
                AST ast2 = this.FH;
                if (this.j6.DW == 0) {
                    firstChild = ast2;
                }
            }
        }
        if (this.j6.DW == 0) {
            this.tp = firstChild;
            aSTPair.j6 = firstChild;
            if (firstChild != null && firstChild.getFirstChild() != null) {
                firstChild = firstChild.getFirstChild();
            }
            aSTPair.DW = firstChild;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void St() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
        u7(87);
        AST astV5 = this.Hw.v5(DW(1));
        this.Hw.J8(aSTPair, astV5);
        u7(136);
        if (this.j6.DW == 0) {
            astV5.Mr(22);
        }
        Do();
        this.FH = aSTPair.j6;
    }

    public final void Sx() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        boolean z = false;
        if (kf.gn(j6(1)) && J8.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                u7(205);
                z = true;
            } catch (RecognitionException unused) {
            }
            we(iGn);
            this.j6.DW--;
        }
        if (z) {
            if (this.j6.DW == 0) {
                Ws("A newline at this point does not follow the Groovy Coding Conventions.", "Keep this statement on one line, or use curly braces to break across multiple lines.");
            }
        } else if (!kf.gn(j6(1)) || !J8.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        Do();
        this.FH = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[FALL_THROUGH, PHI: r0
      0x00df: PHI (r0v7 groovyjarjarantlr.collections.AST) = 
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v9 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
     binds: [B:42:0x00ab, B:44:0x00af, B:45:0x00b1, B:46:0x00b4, B:47:0x00b7, B:56:0x00da, B:48:0x00ba, B:49:0x00bd, B:50:0x00c0, B:51:0x00c3, B:52:0x00c6, B:53:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TJ(groovyjarjarantlr.collections.AST r9) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.TJ(groovyjarjarantlr.collections.AST):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tc() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r8 = this;
            r0 = 0
            r8.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r8.DW(r1)
            int r3 = r8.j6(r1)
            r4 = 87
            if (r3 == r4) goto L35
            r4 = 97
            if (r3 == r4) goto L2a
            switch(r3) {
                case 104: goto L35;
                case 105: goto L35;
                case 106: goto L35;
                case 107: goto L35;
                case 108: goto L35;
                case 109: goto L35;
                case 110: goto L35;
                case 111: goto L35;
                case 112: goto L35;
                default: goto L1c;
            }
        L1c:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r2 = r8.Zo()
            r0.<init>(r1, r2)
            throw r0
        L2a:
            r8.lz()
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.AST r4 = r8.FH
            r3.j6(r0, r4)
            goto L3f
        L35:
            r8.lJ()
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.AST r4 = r8.FH
            r3.j6(r0, r4)
        L3f:
            groovyjarjarantlr.ParserSharedInputState r3 = r8.j6
            int r3 = r3.DW
            if (r3 != 0) goto L78
            groovyjarjarantlr.collections.AST r3 = r0.j6
            groovyjarjarantlr.ASTFactory r4 = r8.Hw
            groovyjarjarantlr.collections.impl.ASTArray r5 = new groovyjarjarantlr.collections.impl.ASTArray
            r6 = 2
            r5.<init>(r6)
            r6 = 71
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r7 = "TYPE_ARGUMENT"
            groovyjarjarantlr.collections.AST r1 = r8.Ev(r6, r7, r2, r1)
            r5.j6(r1)
            r5.j6(r3)
            groovyjarjarantlr.collections.AST r1 = r4.we(r5)
            r0.j6 = r1
            if (r1 == 0) goto L73
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto L73
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        L73:
            r0.DW = r1
            r0.j6()
        L78:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r8.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.Tc():void");
    }

    public final void U2(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        if (ast != null) {
            tokenOW.gn(ast.getLine());
            tokenOW.VH(ast.Zo());
        }
        this.Hw.v5(DW(1));
        u7(96);
        u7(93);
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        Mr();
        AST ast2 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(4);
            aSTArray.j6(Ev(64, "ANNOTATION_DEF", tokenOW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(astV5);
            aSTArray.j6(ast2);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        this.FH = astWe;
    }

    public final void UI(AST ast, AST ast2) throws MismatchedTokenException {
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        I8();
        AST ast3 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(4);
            aSTArray.j6(Ev(9, "VARIABLE_DEF", tokenDW, DW(1)));
            aSTArray.j6(ast);
            ASTFactory aSTFactory2 = this.Hw;
            ASTArray aSTArray2 = new ASTArray(2);
            aSTArray2.j6(Ev(12, "TYPE", tokenDW, DW(1)));
            aSTArray2.j6(ast2);
            aSTArray.j6(aSTFactory2.we(aSTArray2));
            aSTArray.j6(ast3);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        this.FH = astWe;
    }

    public void VD(String str, String str2) {
        int iFH = Token.mb.FH();
        int iZo = Token.mb.Zo();
        try {
            Token tokenDW = DW(1);
            if (tokenDW != null) {
                iFH = tokenDW.FH();
                iZo = tokenDW.Zo();
            }
        } catch (TokenStreamException e) {
            if (e instanceof TokenStreamRecognitionException) {
                TokenStreamRecognitionException tokenStreamRecognitionException = (TokenStreamRecognitionException) e;
                iFH = tokenStreamRecognitionException.WB.DW();
                iZo = tokenStreamRecognitionException.WB.j6();
            }
        }
        throw new SemanticException(str + ";\n   solution: " + str2, Zo(), iFH, iZo);
    }

    public AST WB(int i, String str, AST ast, Token token) {
        AST astYe = ye(i, str, ast);
        cn(astYe, token);
        return astYe;
    }

    public final void Wo() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(98);
        Do();
        aj(true);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 125) {
            u7(125);
            Do();
            aj(true);
            this.Hw.j6(aSTPair, this.FH);
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(75, "TYPE_UPPER_BOUNDS", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public void Ws(String str, String str2) {
        Token tokenDW;
        try {
            tokenDW = DW(1);
        } catch (TokenStreamException unused) {
            tokenDW = null;
        }
        if (tokenDW == null) {
            tokenDW = Token.mb;
        }
        HashMap map = new HashMap();
        map.put("warning", str);
        map.put("solution", str2);
        map.put("filename", Zo());
        map.put("line", Integer.valueOf(tokenDW.FH()));
        map.put("column", Integer.valueOf(tokenDW.Zo()));
        this.Zo.add(map);
    }

    public final void Wv() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        new ArrayList();
        u7(151);
        Sx();
        Eq();
        AST ast2 = this.FH;
        AST astWe = null;
        while (true) {
            if ((j6(1) != 153 && j6(1) != 205) || ((j6(2) != 91 && j6(2) != 153) || (j6(1) == 205 && j6(2) == 91))) {
                break;
            }
            Do();
            Gj();
            AST ast3 = this.FH;
            if (this.j6.DW == 0) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(3);
                aSTArray.j6(null);
                aSTArray.j6(astWe);
                aSTArray.j6(ast3);
                astWe = aSTFactory.we(aSTArray);
            }
        }
        if ((j6(1) == 152 || j6(1) == 205) && pN.gn(j6(2))) {
            Do();
            e3();
            ast = this.FH;
        } else if (!lg.gn(j6(1)) || !rN.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory2 = this.Hw;
            ASTArray aSTArray2 = new ASTArray(4);
            aSTArray2.j6(Ev(151, "try", tokenDW, DW(1)));
            aSTArray2.j6(ast2);
            aSTArray2.j6(astWe);
            aSTArray2.j6(ast);
            AST astWe2 = aSTFactory2.we(aSTArray2);
            aSTPair.j6 = astWe2;
            if (astWe2 != null && astWe2.getFirstChild() != null) {
                astWe2 = astWe2.getFirstChild();
            }
            aSTPair.DW = astWe2;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void X7() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        int i = 0;
        while (true) {
            int iJ6 = j6(1);
            if (iJ6 == 38) {
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(38);
                Do();
            } else if (iJ6 == 96) {
                aM();
                this.Hw.j6(aSTPair, this.FH);
                Do();
            } else {
                if (j6(1) != 84) {
                    break;
                }
                int i2 = i + 1;
                if (i != 0) {
                    break;
                }
                u7(84);
                Do();
                i = i2;
            }
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(5, "MODIFIERS", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final boolean XF(boolean z) throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z2;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        if (BT.gn(j6(1)) && Cz.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
            } catch (RecognitionException unused) {
                z2 = false;
            }
            if (!z) {
                throw new SemanticException("allowDeclaration");
            }
            jw();
            z2 = true;
            we(iGn);
            this.j6.DW--;
        } else {
            z2 = false;
        }
        if (z2) {
            z = this.j6.DW == 0;
            dY();
            this.Hw.j6(aSTPair, this.FH);
        } else if (nw.gn(j6(1)) && sy.gn(j6(2))) {
            Jl(0);
            this.Hw.j6(aSTPair, this.FH);
        } else if (j6(1) >= 143 && j6(1) <= 147) {
            sG();
            this.Hw.j6(aSTPair, this.FH);
        } else {
            if (j6(1) != 96 || j6(2) != 87) {
                throw new NoViableAltException(DW(1), Zo());
            }
            aM();
            this.Hw.j6(aSTPair, this.FH);
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(28, "EXPR", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void XG() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.XG():void");
    }

    public final void XL(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        ez(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 125) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(125);
            Do();
            ez(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    public final void XX() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        br();
        this.Hw.j6(aSTPair, this.FH);
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y9() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.Y9():void");
    }

    public final void YM(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        KM(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 194) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(194);
            Do();
            m8(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void YZ(groovyjarjarantlr.collections.AST r10, groovyjarjarantlr.collections.AST r11, groovyjarjarantlr.Token r12) throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r9 = this;
            r0 = 0
            r9.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r9.I8()
            groovyjarjarantlr.collections.AST r2 = r9.FH
            r3 = 1
            int r4 = r9.j6(r3)
            if (r4 == r3) goto L43
            r5 = 101(0x65, float:1.42E-43)
            if (r4 == r5) goto L43
            r5 = 138(0x8a, float:1.93E-43)
            if (r4 == r5) goto L43
            r5 = 150(0x96, float:2.1E-43)
            if (r4 == r5) goto L43
            r5 = 205(0xcd, float:2.87E-43)
            if (r4 == r5) goto L43
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L43
            r5 = 124(0x7c, float:1.74E-43)
            if (r4 == r5) goto L3d
            switch(r4) {
                case 127: goto L43;
                case 128: goto L43;
                case 129: goto L43;
                default: goto L2f;
            }
        L2f:
            groovyjarjarantlr.NoViableAltException r10 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r11 = r9.DW(r3)
            java.lang.String r12 = r9.Zo()
            r10.<init>(r11, r12)
            throw r10
        L3d:
            r9.HU()
            groovyjarjarantlr.collections.AST r4 = r9.FH
            goto L44
        L43:
            r4 = r0
        L44:
            groovyjarjarantlr.ParserSharedInputState r5 = r9.j6
            int r5 = r5.DW
            if (r5 != 0) goto La4
            groovyjarjarantlr.ASTFactory r0 = r9.Hw
            groovyjarjarantlr.collections.impl.ASTArray r5 = new groovyjarjarantlr.collections.impl.ASTArray
            r6 = 5
            r5.<init>(r6)
            r6 = 9
            groovyjarjarantlr.Token r7 = r9.DW(r3)
            java.lang.String r8 = "VARIABLE_DEF"
            groovyjarjarantlr.collections.AST r6 = r9.Ev(r6, r8, r12, r7)
            r5.j6(r6)
            r5.j6(r10)
            groovyjarjarantlr.ASTFactory r10 = r9.Hw
            groovyjarjarantlr.collections.impl.ASTArray r6 = new groovyjarjarantlr.collections.impl.ASTArray
            r7 = 2
            r6.<init>(r7)
            r7 = 12
            groovyjarjarantlr.Token r3 = r9.DW(r3)
            java.lang.String r8 = "TYPE"
            groovyjarjarantlr.collections.AST r12 = r9.Ev(r7, r8, r12, r3)
            r6.j6(r12)
            r6.j6(r11)
            groovyjarjarantlr.collections.AST r10 = r10.we(r6)
            r5.j6(r10)
            r5.j6(r2)
            r5.j6(r4)
            groovyjarjarantlr.collections.AST r0 = r0.we(r5)
            r1.j6 = r0
            if (r0 == 0) goto L9e
            groovyjarjarantlr.collections.AST r10 = r0.getFirstChild()
            if (r10 == 0) goto L9e
            groovyjarjarantlr.collections.AST r10 = r0.getFirstChild()
            goto L9f
        L9e:
            r10 = r0
        L9f:
            r1.DW = r10
            r1.j6()
        La4:
            r9.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.YZ(groovyjarjarantlr.collections.AST, groovyjarjarantlr.collections.AST, groovyjarjarantlr.Token):void");
    }

    public final void Yd() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        int iJ6 = j6(1);
        if (iJ6 == 98) {
            u7(98);
            Do();
            aj(false);
            ast = this.FH;
            Do();
        } else {
            if (iJ6 != 126 && iJ6 != 131) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast = null;
        }
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(18, "EXTENDS_CLAUSE", tokenDW, DW(1)));
            aSTArray.j6(ast);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        this.FH = astWe;
    }

    public final void Z1(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        AST ast2 = this.VH;
        if (ast != null) {
            tokenOW.gn(ast.getLine());
            tokenOW.VH(ast.Zo());
        }
        u7(94);
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        if (this.j6.DW == 0) {
            this.VH = astV5;
        }
        Do();
        oy();
        AST ast3 = this.FH;
        Do();
        k2();
        AST ast4 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(5);
            aSTArray.j6(Ev(61, "ENUM_DEF", tokenOW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(astV5);
            aSTArray.j6(ast3);
            aSTArray.j6(ast4);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        if (this.j6.DW == 0) {
            this.VH = ast2;
        }
        this.FH = astWe;
    }

    public final void Za(AST ast, AST ast2, Token token) throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        YZ(v5().u7(ast), v5().u7(ast2), token);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 101) {
            u7(101);
            Do();
            if (this.j6.DW == 0) {
                token = DW(1);
            }
            YZ(v5().u7(ast), v5().u7(ast2), token);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a5() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r14 = this;
            r0 = 0
            r14.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r14.DW(r1)
            r3 = 126(0x7e, float:1.77E-43)
            r14.u7(r3)
            int r3 = r14.j6(r1)
            r4 = 84
            r5 = 83
            r6 = 87
            r7 = 43
            r8 = 39
            r9 = 38
            r10 = 128(0x80, float:1.8E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 205(0xcd, float:2.87E-43)
            if (r3 == r9) goto L51
            if (r3 == r8) goto L51
            if (r3 == r7) goto L51
            if (r3 == r6) goto L51
            if (r3 == r12) goto L5b
            if (r3 == r5) goto L51
            if (r3 == r4) goto L51
            if (r3 == r11) goto L5b
            if (r3 == r10) goto L5b
            switch(r3) {
                case 92: goto L51;
                case 93: goto L51;
                case 94: goto L51;
                case 95: goto L51;
                case 96: goto L51;
                default: goto L3d;
            }
        L3d:
            switch(r3) {
                case 104: goto L51;
                case 105: goto L51;
                case 106: goto L51;
                case 107: goto L51;
                case 108: goto L51;
                case 109: goto L51;
                case 110: goto L51;
                case 111: goto L51;
                case 112: goto L51;
                default: goto L40;
            }
        L40:
            switch(r3) {
                case 115: goto L51;
                case 116: goto L51;
                case 117: goto L51;
                case 118: goto L51;
                case 119: goto L51;
                case 120: goto L51;
                case 121: goto L51;
                case 122: goto L51;
                default: goto L43;
            }
        L43:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r14.DW(r1)
            java.lang.String r2 = r14.Zo()
            r0.<init>(r1, r2)
            throw r0
        L51:
            r14.gG()
            groovyjarjarantlr.ASTFactory r3 = r14.Hw
            groovyjarjarantlr.collections.AST r13 = r14.FH
            r3.j6(r0, r13)
        L5b:
            int r3 = r14.j6(r1)
            if (r3 == r10) goto La8
            int r3 = r14.j6(r1)
            if (r3 != r12) goto L68
            goto La8
        L68:
            r14.u7(r11)
            groovyjarjarantlr.ParserSharedInputState r3 = r14.j6
            int r3 = r3.DW
            if (r3 != 0) goto La3
            groovyjarjarantlr.collections.AST r3 = r0.j6
            groovyjarjarantlr.ASTFactory r4 = r14.Hw
            groovyjarjarantlr.collections.impl.ASTArray r5 = new groovyjarjarantlr.collections.impl.ASTArray
            r6 = 2
            r5.<init>(r6)
            r6 = 6
            groovyjarjarantlr.Token r1 = r14.DW(r1)
            java.lang.String r7 = "OBJBLOCK"
            groovyjarjarantlr.collections.AST r1 = r14.Ev(r6, r7, r2, r1)
            r5.j6(r1)
            r5.j6(r3)
            groovyjarjarantlr.collections.AST r1 = r4.we(r5)
            r0.j6 = r1
            if (r1 == 0) goto L9e
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto L9e
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        L9e:
            r0.DW = r1
            r0.j6()
        La3:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r14.FH = r0
            return
        La8:
            r14.be()
            int r3 = r14.j6(r1)
            if (r3 == r9) goto Ld8
            if (r3 == r8) goto Ld8
            if (r3 == r7) goto Ld8
            if (r3 == r6) goto Ld8
            if (r3 == r12) goto L5b
            if (r3 == r5) goto Ld8
            if (r3 == r4) goto Ld8
            if (r3 == r11) goto L5b
            if (r3 == r10) goto L5b
            switch(r3) {
                case 92: goto Ld8;
                case 93: goto Ld8;
                case 94: goto Ld8;
                case 95: goto Ld8;
                case 96: goto Ld8;
                default: goto Lc4;
            }
        Lc4:
            switch(r3) {
                case 104: goto Ld8;
                case 105: goto Ld8;
                case 106: goto Ld8;
                case 107: goto Ld8;
                case 108: goto Ld8;
                case 109: goto Ld8;
                case 110: goto Ld8;
                case 111: goto Ld8;
                case 112: goto Ld8;
                default: goto Lc7;
            }
        Lc7:
            switch(r3) {
                case 115: goto Ld8;
                case 116: goto Ld8;
                case 117: goto Ld8;
                case 118: goto Ld8;
                case 119: goto Ld8;
                case 120: goto Ld8;
                case 121: goto Ld8;
                case 122: goto Ld8;
                default: goto Lca;
            }
        Lca:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r14.DW(r1)
            java.lang.String r2 = r14.Zo()
            r0.<init>(r1, r2)
            throw r0
        Ld8:
            r14.gG()
            groovyjarjarantlr.ASTFactory r3 = r14.Hw
            groovyjarjarantlr.collections.AST r13 = r14.FH
            r3.j6(r0, r13)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.a5():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a8() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.a8():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aM() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r9 = this;
            r0 = 0
            r9.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r2 = 1
            groovyjarjarantlr.Token r3 = r9.DW(r2)
            r4 = 96
            r9.u7(r4)
            r9.Cz()
            groovyjarjarantlr.collections.AST r4 = r9.FH
            r9.Do()
            int r5 = r9.j6(r2)
            r6 = 2
            r7 = 91
            if (r5 != r7) goto L79
            groovyjarjarantlr.collections.impl.BitSet r5 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.x9
            int r8 = r9.j6(r6)
            boolean r5 = r5.gn(r8)
            if (r5 == 0) goto L79
            r9.u7(r7)
            int r5 = r9.j6(r2)
            r6 = 87
            if (r5 == r6) goto L6e
            r6 = 88
            if (r5 == r6) goto L6e
            r6 = 98
            if (r5 == r6) goto L6e
            r6 = 99
            if (r5 == r6) goto L6e
            switch(r5) {
                case 38: goto L6e;
                case 39: goto L6e;
                case 40: goto L6e;
                case 41: goto L6e;
                case 42: goto L6e;
                case 43: goto L6e;
                default: goto L49;
            }
        L49:
            switch(r5) {
                case 81: goto L6e;
                case 82: goto L6e;
                case 83: goto L6e;
                case 84: goto L6e;
                case 85: goto L6e;
                default: goto L4c;
            }
        L4c:
            switch(r5) {
                case 91: goto L6e;
                case 92: goto L6e;
                case 93: goto L6e;
                case 94: goto L6e;
                case 95: goto L6e;
                case 96: goto L6e;
                default: goto L4f;
            }
        L4f:
            switch(r5) {
                case 104: goto L6e;
                case 105: goto L6e;
                case 106: goto L6e;
                case 107: goto L6e;
                case 108: goto L6e;
                case 109: goto L6e;
                case 110: goto L6e;
                case 111: goto L6e;
                case 112: goto L6e;
                default: goto L52;
            }
        L52:
            switch(r5) {
                case 114: goto L6e;
                case 115: goto L6e;
                case 116: goto L6e;
                case 117: goto L6e;
                case 118: goto L6e;
                case 119: goto L6e;
                case 120: goto L6e;
                case 121: goto L6e;
                case 122: goto L6e;
                case 123: goto L6c;
                default: goto L55;
            }
        L55:
            switch(r5) {
                case 126: goto L6e;
                case 137: goto L6e;
                case 138: goto L6e;
                case 139: goto L6e;
                case 140: goto L6e;
                case 141: goto L6e;
                case 142: goto L6e;
                case 143: goto L6e;
                case 144: goto L6e;
                case 145: goto L6e;
                case 146: goto L6e;
                case 147: goto L6e;
                case 148: goto L6e;
                case 149: goto L6e;
                case 150: goto L6e;
                case 151: goto L6e;
                case 152: goto L6e;
                case 153: goto L6e;
                case 190: goto L6e;
                case 193: goto L6e;
                case 195: goto L6e;
                case 196: goto L6e;
                case 197: goto L6e;
                case 199: goto L6e;
                case 200: goto L6e;
                case 201: goto L6e;
                case 202: goto L6e;
                case 203: goto L6e;
                case 204: goto L6e;
                default: goto L58;
            }
        L58:
            switch(r5) {
                case 129: goto L6e;
                case 130: goto L6e;
                case 131: goto L6e;
                case 132: goto L6e;
                default: goto L5b;
            }
        L5b:
            switch(r5) {
                case 157: goto L6e;
                case 158: goto L6e;
                case 159: goto L6e;
                case 160: goto L6e;
                case 161: goto L6e;
                default: goto L5e;
            }
        L5e:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r9.DW(r2)
            java.lang.String r2 = r9.Zo()
            r0.<init>(r1, r2)
            throw r0
        L6c:
            r5 = r0
            goto L73
        L6e:
            r9.j3()
            groovyjarjarantlr.collections.AST r5 = r9.FH
        L73:
            r6 = 123(0x7b, float:1.72E-43)
            r9.u7(r6)
            goto L92
        L79:
            groovyjarjarantlr.collections.impl.BitSet r5 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.Qq
            int r7 = r9.j6(r2)
            boolean r5 = r5.gn(r7)
            if (r5 == 0) goto Ld1
            groovyjarjarantlr.collections.impl.BitSet r5 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.sy
            int r6 = r9.j6(r6)
            boolean r5 = r5.gn(r6)
            if (r5 == 0) goto Ld1
            r5 = r0
        L92:
            groovyjarjarantlr.ParserSharedInputState r6 = r9.j6
            int r6 = r6.DW
            if (r6 != 0) goto Lce
            groovyjarjarantlr.ASTFactory r0 = r9.Hw
            groovyjarjarantlr.collections.impl.ASTArray r6 = new groovyjarjarantlr.collections.impl.ASTArray
            r7 = 3
            r6.<init>(r7)
            r7 = 66
            groovyjarjarantlr.Token r2 = r9.DW(r2)
            java.lang.String r8 = "ANNOTATION"
            groovyjarjarantlr.collections.AST r2 = r9.Ev(r7, r8, r3, r2)
            r6.j6(r2)
            r6.j6(r4)
            r6.j6(r5)
            groovyjarjarantlr.collections.AST r0 = r0.we(r6)
            r1.j6 = r0
            if (r0 == 0) goto Lc8
            groovyjarjarantlr.collections.AST r2 = r0.getFirstChild()
            if (r2 == 0) goto Lc8
            groovyjarjarantlr.collections.AST r2 = r0.getFirstChild()
            goto Lc9
        Lc8:
            r2 = r0
        Lc9:
            r1.DW = r2
            r1.j6()
        Lce:
            r9.FH = r0
            return
        Ld1:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r9.DW(r2)
            java.lang.String r2 = r9.Zo()
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.aM():void");
    }

    public final void aX() {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(1);
            aSTArray.j6(Ev(51, "IMPLICIT_PARAMETERS", tokenDW, DW(1)));
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:15:0x006c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void aj(boolean r14) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.aj(boolean):void");
    }

    public final void aq() throws NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 88) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(88);
            ast = aSTPair.j6;
        } else if (iJ6 == 157) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(157);
            ast = aSTPair.j6;
        } else if (iJ6 == 160) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(160);
            ast = aSTPair.j6;
        } else if (iJ6 != 161) {
            switch (iJ6) {
                case 199:
                case 200:
                case 201:
                case 202:
                case 203:
                case 204:
                    FN();
                    this.Hw.j6(aSTPair, this.FH);
                    ast = aSTPair.j6;
                    break;
                default:
                    throw new NoViableAltException(DW(1), Zo());
            }
        } else {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(ProxyTextView.INPUTTYPE_textWebEditText);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void be() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 128) {
            u7(128);
            while (j6(1) == 205 && cn.gn(j6(2))) {
                u7(205);
            }
            if (this.j6.DW == 0) {
                this.gn = 128;
            }
        } else {
            if (iJ6 != 205) {
                throw new NoViableAltException(DW(1), Zo());
            }
            u7(205);
            if (this.j6.DW == 0) {
                this.gn = 205;
            }
            while (j6(1) == 128 && cn.gn(j6(2))) {
                u7(128);
                while (j6(1) == 205 && cn.gn(j6(2))) {
                    u7(205);
                }
                if (this.j6.DW == 0) {
                    this.gn = 128;
                }
            }
        }
        this.FH = null;
    }

    public final void br() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(126);
        Do();
        kQ(true);
        AST ast = this.FH;
        dx(1);
        AST ast2 = this.FH;
        u7(127);
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(3);
            aSTArray.j6(Ev(50, "{", tokenDW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(ast2);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0183, code lost:
    
        r16.FH = r1.j6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0187, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: RecognitionException -> 0x0080, FALL_THROUGH, TRY_LEAVE, TryCatch #1 {RecognitionException -> 0x0080, blocks: (B:8:0x0049, B:17:0x0060, B:18:0x0063, B:19:0x0066, B:20:0x0069, B:21:0x0076, B:22:0x0077, B:23:0x007b), top: B:85:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e A[Catch: RecognitionException -> 0x0113, FALL_THROUGH, TRY_LEAVE, TryCatch #0 {RecognitionException -> 0x0113, blocks: (B:43:0x00dc, B:52:0x00f3, B:53:0x00f6, B:54:0x00f9, B:55:0x00fc, B:56:0x0109, B:57:0x010a, B:58:0x010e), top: B:83:0x00dc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cT() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.cT():void");
    }

    public final void ca(int i) throws NoViableAltException {
        boolean z;
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (nw.gn(j6(1)) && J8.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                if (sM.gn(j6(1))) {
                    EQ(126);
                } else {
                    if (j6(1) != 126) {
                        throw new NoViableAltException(DW(1), Zo());
                    }
                    u7(126);
                    yO();
                }
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            if (nw.gn(j6(1)) && J8.gn(j6(2)) && i == 205) {
                if (this.j6.DW == 0) {
                    Ws("Expression statement looks like it may continue a previous statement", "Either remove the previous newline, or add an explicit semicolon ';'.");
                }
            } else if (!nw.gn(j6(1)) || !J8.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast = aSTPair.j6;
        } else if (nw.gn(j6(1)) && J8.gn(j6(2)) && i == 205) {
            if (this.j6.DW == 0) {
                Qk(false, "Ambiguous expression could be a parameterless closure expression, an isolated open code block, or it may continue a previous statement", "Add an explicit parameter list, e.g. {it -> ...}, or force it to be treated as an open block by giving it a label, e.g. L:{...}, and also either remove the previous newline, or add an explicit semicolon ';'");
            }
            ast = aSTPair.j6;
        } else {
            if (!nw.gn(j6(1)) || !J8.gn(j6(2)) || i == 205) {
                throw new NoViableAltException(DW(1), Zo());
            }
            if (this.j6.DW == 0) {
                Qk(false, "Ambiguous expression could be either a parameterless closure expression or an isolated open code block", "Add an explicit closure parameter list, e.g. {it -> ...}, or force it to be treated as an open block by giving it a label, e.g. L:{...}");
            }
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void cb() throws MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        while (true) {
            if (br.gn(j6(1))) {
                sh();
            } else {
                if (!XX.gn(j6(1))) {
                    this.FH = null;
                    return;
                }
                tp(XX);
            }
        }
    }

    public final void ce(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Pa(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 175) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(175);
            Do();
            Pa(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00de A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void compilationUnit() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.compilationUnit():void");
    }

    public final void cz() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        while (true) {
            int iJ6 = j6(1);
            if (iJ6 != 38 && iJ6 != 39 && iJ6 != 43 && iJ6 != 83) {
                if (iJ6 != 96) {
                    switch (iJ6) {
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                            break;
                        default:
                            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                            u7(84);
                            Do();
                            this.Hw.j6(aSTPair, this.FH);
                            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                            u7(91);
                            this.FH = aSTPair.j6;
                            return;
                    }
                } else {
                    aM();
                    this.Hw.j6(aSTPair, this.FH);
                    Do();
                    this.Hw.j6(aSTPair, this.FH);
                }
            }
            d5();
            this.Hw.j6(aSTPair, this.FH);
            Do();
            this.Hw.j6(aSTPair, this.FH);
        }
    }

    public final void d5() throws NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 38) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(38);
            ast = aSTPair.j6;
        } else if (iJ6 == 39) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(39);
            ast = aSTPair.j6;
        } else if (iJ6 == 43) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(43);
            ast = aSTPair.j6;
        } else if (iJ6 != 83) {
            switch (iJ6) {
                case 115:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(115);
                    ast = aSTPair.j6;
                    break;
                case 116:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(116);
                    ast = aSTPair.j6;
                    break;
                case 117:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(117);
                    ast = aSTPair.j6;
                    break;
                case 118:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(118);
                    ast = aSTPair.j6;
                    break;
                case 119:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(119);
                    ast = aSTPair.j6;
                    break;
                case 120:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(120);
                    ast = aSTPair.j6;
                    break;
                case 121:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(121);
                    ast = aSTPair.j6;
                    break;
                case 122:
                    this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                    u7(122);
                    ast = aSTPair.j6;
                    break;
                default:
                    throw new NoViableAltException(DW(1), Zo());
            }
        } else {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(83);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void dP() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST astWe;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(126);
        Do();
        kQ(false);
        AST ast = this.FH;
        dx(1);
        AST ast2 = this.FH;
        u7(127);
        if (this.j6.DW == 0) {
            if (ast == null) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(2);
                aSTArray.j6(Ev(7, "{", tokenDW, DW(1)));
                aSTArray.j6(ast2);
                astWe = aSTFactory.we(aSTArray);
            } else {
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(3);
                aSTArray2.j6(Ev(50, "{", tokenDW, DW(1)));
                aSTArray2.j6(ast);
                aSTArray2.j6(ast2);
                astWe = aSTFactory2.we(aSTArray2);
            }
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void dY() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        wT();
        AST firstChild = this.FH;
        if (this.j6.DW == 0) {
            aSTPair.j6 = firstChild;
            if (firstChild != null && firstChild.getFirstChild() != null) {
                firstChild = firstChild.getFirstChild();
            }
            aSTPair.DW = firstChild;
            aSTPair.j6();
        }
        int iJ6 = j6(1);
        if (iJ6 != 1 && iJ6 != 86 && iJ6 != 101 && iJ6 != 128 && iJ6 != 123) {
            if (iJ6 != 124) {
                throw new NoViableAltException(DW(1), Zo());
            }
            HU();
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[FALL_THROUGH, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dx(int r8) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r7 = this;
            r0 = 0
            r7.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            int r2 = r7.j6(r1)
            r3 = 88
            r4 = 87
            r5 = 39
            r6 = 38
            if (r2 == r6) goto L43
            if (r2 == r5) goto L43
            if (r2 == r4) goto L43
            if (r2 == r3) goto L43
            switch(r2) {
                case 1: goto L4d;
                case 43: goto L43;
                case 99: goto L43;
                case 104: goto L43;
                case 105: goto L43;
                case 106: goto L43;
                case 107: goto L43;
                case 108: goto L43;
                case 109: goto L43;
                case 110: goto L43;
                case 111: goto L43;
                case 112: goto L43;
                case 132: goto L43;
                case 137: goto L43;
                case 151: goto L43;
                case 157: goto L43;
                case 190: goto L43;
                case 193: goto L43;
                case 195: goto L43;
                case 196: goto L43;
                case 197: goto L43;
                case 199: goto L43;
                case 200: goto L43;
                case 201: goto L43;
                case 202: goto L43;
                case 203: goto L43;
                case 204: goto L43;
                case 205: goto L4d;
                default: goto L20;
            }
        L20:
            switch(r2) {
                case 82: goto L43;
                case 83: goto L43;
                case 84: goto L43;
                case 85: goto L43;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 91: goto L43;
                case 92: goto L43;
                case 93: goto L43;
                case 94: goto L43;
                case 95: goto L43;
                case 96: goto L43;
                default: goto L26;
            }
        L26:
            switch(r2) {
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
            switch(r2) {
                case 126: goto L43;
                case 127: goto L4d;
                case 128: goto L4d;
                default: goto L2c;
            }
        L2c:
            switch(r2) {
                case 139: goto L43;
                case 140: goto L43;
                case 141: goto L43;
                default: goto L2f;
            }
        L2f:
            switch(r2) {
                case 143: goto L43;
                case 144: goto L43;
                case 145: goto L43;
                case 146: goto L43;
                case 147: goto L43;
                case 148: goto L43;
                case 149: goto L43;
                default: goto L32;
            }
        L32:
            switch(r2) {
                case 159: goto L43;
                case 160: goto L43;
                case 161: goto L43;
                default: goto L35;
            }
        L35:
            groovyjarjarantlr.NoViableAltException r8 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r0 = r7.DW(r1)
            java.lang.String r1 = r7.Zo()
            r8.<init>(r0, r1)
            throw r8
        L43:
            r7.Ed(r8)
            groovyjarjarantlr.ASTFactory r8 = r7.Hw
            groovyjarjarantlr.collections.AST r2 = r7.FH
            r8.j6(r0, r2)
        L4d:
            int r8 = r7.j6(r1)
            r2 = 128(0x80, float:1.8E-43)
            if (r8 == r2) goto L63
            int r8 = r7.j6(r1)
            r2 = 205(0xcd, float:2.87E-43)
            if (r8 != r2) goto L5e
            goto L63
        L5e:
            groovyjarjarantlr.collections.AST r8 = r0.j6
            r7.FH = r8
            return
        L63:
            r7.be()
            int r8 = r7.j6(r1)
            if (r8 == r6) goto L98
            if (r8 == r5) goto L98
            if (r8 == r4) goto L98
            if (r8 == r3) goto L98
            switch(r8) {
                case 1: goto L4d;
                case 43: goto L98;
                case 99: goto L98;
                case 104: goto L98;
                case 105: goto L98;
                case 106: goto L98;
                case 107: goto L98;
                case 108: goto L98;
                case 109: goto L98;
                case 110: goto L98;
                case 111: goto L98;
                case 112: goto L98;
                case 132: goto L98;
                case 137: goto L98;
                case 151: goto L98;
                case 157: goto L98;
                case 190: goto L98;
                case 193: goto L98;
                case 195: goto L98;
                case 196: goto L98;
                case 197: goto L98;
                case 199: goto L98;
                case 200: goto L98;
                case 201: goto L98;
                case 202: goto L98;
                case 203: goto L98;
                case 204: goto L98;
                case 205: goto L4d;
                default: goto L75;
            }
        L75:
            switch(r8) {
                case 82: goto L98;
                case 83: goto L98;
                case 84: goto L98;
                case 85: goto L98;
                default: goto L78;
            }
        L78:
            switch(r8) {
                case 91: goto L98;
                case 92: goto L98;
                case 93: goto L98;
                case 94: goto L98;
                case 95: goto L98;
                case 96: goto L98;
                default: goto L7b;
            }
        L7b:
            switch(r8) {
                case 115: goto L98;
                case 116: goto L98;
                case 117: goto L98;
                case 118: goto L98;
                case 119: goto L98;
                case 120: goto L98;
                case 121: goto L98;
                case 122: goto L98;
                default: goto L7e;
            }
        L7e:
            switch(r8) {
                case 126: goto L98;
                case 127: goto L4d;
                case 128: goto L4d;
                default: goto L81;
            }
        L81:
            switch(r8) {
                case 139: goto L98;
                case 140: goto L98;
                case 141: goto L98;
                default: goto L84;
            }
        L84:
            switch(r8) {
                case 143: goto L98;
                case 144: goto L98;
                case 145: goto L98;
                case 146: goto L98;
                case 147: goto L98;
                case 148: goto L98;
                case 149: goto L98;
                default: goto L87;
            }
        L87:
            switch(r8) {
                case 159: goto L98;
                case 160: goto L98;
                case 161: goto L98;
                default: goto L8a;
            }
        L8a:
            groovyjarjarantlr.NoViableAltException r8 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r0 = r7.DW(r1)
            java.lang.String r1 = r7.Zo()
            r8.<init>(r0, r1)
            throw r8
        L98:
            int r8 = r7.gn
            r7.Ed(r8)
            groovyjarjarantlr.ASTFactory r8 = r7.Hw
            groovyjarjarantlr.collections.AST r2 = r7.FH
            r8.j6(r0, r2)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.dx(int):void");
    }

    public final void dz() throws SemanticException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (!BR(DW(1))) {
            throw new SemanticException("isUpperCase(LT(1))");
        }
        this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
        u7(87);
        this.FH = aSTPair.j6;
    }

    public final void e3() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(152);
        Sx();
        Eq();
        AST ast = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(152, "finally", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e9() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r9 = this;
            r0 = 0
            r9.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r9.DW(r1)
            r9.BT()
            groovyjarjarantlr.collections.AST r3 = r9.FH
            groovyjarjarantlr.ASTFactory r4 = r9.Hw
            r4.j6(r0, r3)
            r4 = 82
            r9.u7(r4)
            int r4 = r9.j6(r1)
            r5 = 83
            if (r4 == r5) goto L37
            r5 = 87
            if (r4 != r5) goto L29
            goto L42
        L29:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r9.DW(r1)
            java.lang.String r2 = r9.Zo()
            r0.<init>(r1, r2)
            throw r0
        L37:
            r9.u7(r5)
            groovyjarjarantlr.ParserSharedInputState r4 = r9.j6
            int r4 = r4.DW
            if (r4 != 0) goto L42
            r4 = 1
            goto L43
        L42:
            r4 = 0
        L43:
            r9.pN()
            groovyjarjarantlr.collections.AST r5 = r9.FH
            groovyjarjarantlr.ParserSharedInputState r6 = r9.j6
            int r6 = r6.DW
            if (r6 != 0) goto La5
            r6 = 3
            if (r4 == 0) goto L72
            groovyjarjarantlr.ASTFactory r4 = r9.Hw
            groovyjarjarantlr.collections.impl.ASTArray r7 = new groovyjarjarantlr.collections.impl.ASTArray
            r7.<init>(r6)
            r6 = 60
            groovyjarjarantlr.Token r1 = r9.DW(r1)
            java.lang.String r8 = "static_import"
            groovyjarjarantlr.collections.AST r1 = r9.Ev(r6, r8, r2, r1)
            r7.j6(r1)
            r7.j6(r3)
            r7.j6(r5)
            groovyjarjarantlr.collections.AST r1 = r4.we(r7)
            goto L92
        L72:
            groovyjarjarantlr.ASTFactory r4 = r9.Hw
            groovyjarjarantlr.collections.impl.ASTArray r7 = new groovyjarjarantlr.collections.impl.ASTArray
            r7.<init>(r6)
            r6 = 29
            groovyjarjarantlr.Token r1 = r9.DW(r1)
            java.lang.String r8 = "import"
            groovyjarjarantlr.collections.AST r1 = r9.Ev(r6, r8, r2, r1)
            r7.j6(r1)
            r7.j6(r3)
            r7.j6(r5)
            groovyjarjarantlr.collections.AST r1 = r4.we(r7)
        L92:
            r0.j6 = r1
            if (r1 == 0) goto La0
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto La0
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        La0:
            r0.DW = r1
            r0.j6()
        La5:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r9.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.e9():void");
    }

    public final void eU() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Jl(1);
        AST ast = this.FH;
        this.Hw.j6(aSTPair, ast);
        boolean z = this.j6.DW != 0 || ast == this.tp;
        if (Jl.gn(j6(1)) && aq.gn(j6(2)) && j6(1) != 138 && z) {
            et(ast);
            AST firstChild = this.FH;
            if (this.j6.DW == 0) {
                aSTPair.j6 = firstChild;
                if (firstChild != null && firstChild.getFirstChild() != null) {
                    firstChild = firstChild.getFirstChild();
                }
                aSTPair.DW = firstChild;
                aSTPair.j6();
            }
        } else if (!Jl.gn(j6(1)) || !aq.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = aSTPair.j6;
    }

    protected void ef() {
        this.v5 = null;
    }

    public final byte ei() throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        byte b;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (AE.gn(j6(1)) && Za.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                SI();
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            nw();
            this.Hw.j6(aSTPair, this.FH);
            AST astV5 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV5);
            u7(136);
            if (this.j6.DW == 0) {
                astV5.Mr(54);
            }
            b = this.j6.DW == 0 ? (byte) 1 : (byte) 0;
        } else if (j6(1) == 113) {
            AST astV52 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV52);
            u7(ProxyTextView.INPUTTYPE_textPostalAddress);
            if (this.j6.DW == 0) {
                astV52.Mr(55);
            }
            b = this.j6.DW == 0 ? (byte) 2 : (byte) 0;
            int iJ6 = j6(1);
            if (iJ6 != 38 && iJ6 != 39 && iJ6 != 43 && iJ6 != 91 && iJ6 != 96 && iJ6 != 99 && iJ6 != 126 && iJ6 != 132) {
                if (iJ6 == 136) {
                    u7(136);
                    if (this.j6.DW == 0) {
                        astV52.Mr(56);
                    }
                    if (this.j6.DW == 0) {
                        b = (byte) (b | 1);
                    }
                } else if (iJ6 != 157 && iJ6 != 190 && iJ6 != 193 && iJ6 != 87 && iJ6 != 88) {
                    switch (iJ6) {
                        case 83:
                        case 84:
                        case 85:
                            break;
                        default:
                            switch (iJ6) {
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                    break;
                                default:
                                    switch (iJ6) {
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                            break;
                                        default:
                                            switch (iJ6) {
                                                case 143:
                                                case 144:
                                                case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                                                case 146:
                                                case 147:
                                                case 148:
                                                case 149:
                                                    break;
                                                default:
                                                    switch (iJ6) {
                                                        case 159:
                                                        case 160:
                                                        case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                                                            break;
                                                        default:
                                                            switch (iJ6) {
                                                                case 195:
                                                                case 196:
                                                                case 197:
                                                                    break;
                                                                default:
                                                                    switch (iJ6) {
                                                                        case 199:
                                                                        case 200:
                                                                        case 201:
                                                                        case 202:
                                                                        case 203:
                                                                        case 204:
                                                                            break;
                                                                        default:
                                                                            throw new NoViableAltException(DW(1), Zo());
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
            }
        } else {
            if (!e9.gn(j6(1)) || !PT.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
        }
        XF(true);
        this.Hw.j6(aSTPair, this.FH);
        if (this.j6.DW == 0) {
            Qk(j6(1) != 136, "illegal colon after argument expression", "a complex label expression before a colon must be parenthesized");
        }
        this.FH = aSTPair.j6;
        return b;
    }

    public final void ek() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        AST ast2;
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        X7();
        AST ast3 = this.FH;
        boolean z = false;
        if (sh.gn(j6(1)) && iW.gn(j6(2))) {
            np(false);
            ast = this.FH;
        } else {
            if ((j6(1) != 87 && j6(1) != 133) || !eU.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast = null;
        }
        int iJ6 = j6(1);
        if (iJ6 != 87) {
            if (iJ6 != 133) {
                throw new NoViableAltException(DW(1), Zo());
            }
            u7(133);
            if (this.j6.DW == 0) {
                z = true;
            }
        }
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        int iJ62 = j6(1);
        if (iJ62 == 101 || iJ62 == 135 || iJ62 == 205 || iJ62 == 123) {
            ast2 = null;
        } else {
            if (iJ62 != 124) {
                throw new NoViableAltException(DW(1), Zo());
            }
            HU();
            ast2 = this.FH;
        }
        if (this.j6.DW == 0) {
            if (z) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(5);
                aSTArray.j6(Ev(47, "VARIABLE_PARAMETER_DEF", tokenDW, DW(1)));
                aSTArray.j6(ast3);
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(2);
                aSTArray2.j6(Ev(12, "TYPE", tokenDW, DW(1)));
                aSTArray2.j6(ast);
                aSTArray.j6(aSTFactory2.we(aSTArray2));
                aSTArray.j6(astV5);
                aSTArray.j6(ast2);
                astWe = aSTFactory.we(aSTArray);
            } else {
                ASTFactory aSTFactory3 = this.Hw;
                ASTArray aSTArray3 = new ASTArray(5);
                aSTArray3.j6(Ev(21, "PARAMETER_DEF", tokenDW, DW(1)));
                aSTArray3.j6(ast3);
                ASTFactory aSTFactory4 = this.Hw;
                ASTArray aSTArray4 = new ASTArray(2);
                aSTArray4.j6(Ev(12, "TYPE", tokenDW, DW(1)));
                aSTArray4.j6(ast);
                aSTArray3.j6(aSTFactory4.we(aSTArray4));
                aSTArray3.j6(astV5);
                aSTArray3.j6(ast2);
                astWe = aSTFactory3.we(aSTArray3);
            }
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        this.FH = astWe;
    }

    public final void el() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        int i = this.j6.DW == 0 ? this.EQ : 0;
        u7(89);
        if (this.j6.DW == 0) {
            this.EQ++;
        }
        Do();
        Tc();
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 101 && aj.gn(j6(2)) && (this.j6.DW != 0 || this.EQ == i + 1)) {
            u7(101);
            Do();
            Tc();
            this.Hw.j6(aSTPair, this.FH);
        }
        Do();
        if (lp.gn(j6(1)) && OW.gn(j6(2))) {
            Hn();
            this.Hw.j6(aSTPair, this.FH);
        } else if (!OW.gn(j6(1)) || !QX.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        boolean z = i != 0 || this.EQ == i;
        Bx(z, "Missing closing bracket '>' for generics types", "Please specify the missing bracket!");
        if (!z) {
            throw new SemanticException("matchGenericTypeBrackets(((currentLtLevel != 0) || ltCounter == currentLtLevel),\n        \"Missing closing bracket '>' for generics types\", \"Please specify the missing bracket!\")");
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(70, "TYPE_ARGUMENTS", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void er() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        lg();
        AST ast = this.FH;
        u7(124);
        Do();
        rN();
        AST ast2 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(3);
            aSTArray.j6(Ev(67, "ANNOTATION_MEMBER_VALUE_PAIR", tokenDW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(ast2);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        this.FH = astWe;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:27:0x0084
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Path cross not found for [B:21:0x0060, B:92:?], limit reached: 89 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00fa -> B:21:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x011f -> B:21:0x0060). Please report as a decompilation issue!!! */
    public final void et(groovyjarjarantlr.collections.AST r10) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.et(groovyjarjarantlr.collections.AST):void");
    }

    public final void ez(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        n5(i);
        this.Hw.j6(aSTPair, this.FH);
        while (true) {
            if (j6(1) != 178 && j6(1) != 179) {
                this.FH = aSTPair.j6;
                return;
            }
            int iJ6 = j6(1);
            if (iJ6 == 178) {
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(178);
            } else {
                if (iJ6 != 179) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(179);
            }
            Do();
            n5(0);
            this.Hw.j6(aSTPair, this.FH);
        }
    }

    public final void fD() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        if (er.gn(j6(1)) && kQ.gn(j6(2))) {
            NH();
            this.Hw.j6(aSTPair, this.FH);
        } else if (!yO.gn(j6(1)) || !XG.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(5, "MODIFIERS", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fN() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r5 = this;
            r0 = 0
            r5.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r1 = 0
        L9:
            r2 = 1
            int r3 = r5.j6(r2)
            r4 = 38
            if (r3 == r4) goto L58
            r4 = 39
            if (r3 == r4) goto L58
            r4 = 43
            if (r3 == r4) goto L58
            r4 = 96
            if (r3 == r4) goto L51
            r4 = 83
            if (r3 == r4) goto L58
            r4 = 84
            if (r3 == r4) goto L4a
            switch(r3) {
                case 115: goto L58;
                case 116: goto L58;
                case 117: goto L58;
                case 118: goto L58;
                case 119: goto L58;
                case 120: goto L58;
                case 121: goto L58;
                case 122: goto L58;
                default: goto L29;
            }
        L29:
            if (r1 < r2) goto L3c
            groovyjarjarantlr.ASTFactory r1 = r5.Hw
            groovyjarjarantlr.Token r2 = r5.DW(r2)
            r1.v5(r2)
            r1 = 89
            r5.u7(r1)
            r5.FH = r0
            return
        L3c:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r5.DW(r2)
            java.lang.String r2 = r5.Zo()
            r0.<init>(r1, r2)
            throw r0
        L4a:
            r5.u7(r4)
            r5.Do()
            goto L5e
        L51:
            r5.aM()
            r5.Do()
            goto L5e
        L58:
            r5.d5()
            r5.Do()
        L5e:
            int r1 = r1 + 1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.fN():void");
    }

    public final void fY(AST ast) throws MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (this.j6.DW == 0) {
            aSTPair.j6 = ast;
            aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
            aSTPair.j6();
        }
        while (j6(1) == 85 && j6(2) == 86) {
            u7(85);
            u7(86);
            if (this.j6.DW == 0) {
                AST ast2 = aSTPair.j6;
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(2);
                aSTArray.j6(WB(17, "[", ast, DW(1)));
                aSTArray.j6(ast2);
                AST astWe = aSTFactory.we(aSTArray);
                aSTPair.j6 = astWe;
                if (astWe != null && astWe.getFirstChild() != null) {
                    astWe = astWe.getFirstChild();
                }
                aSTPair.DW = astWe;
                aSTPair.j6();
            }
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a8 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fp(int r9) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.fp(int):void");
    }

    public final void fr(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Oo(i);
        this.Hw.j6(aSTPair, this.FH);
        if (Pa.gn(j6(1)) && oy.gn(j6(2))) {
            int iJ6 = j6(1);
            if (iJ6 == 89) {
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(89);
            } else if (iJ6 == 100) {
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(100);
            } else if (iJ6 == 142) {
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(142);
            } else if (iJ6 == 185) {
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(185);
            } else {
                if (iJ6 != 186) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(186);
            }
            Do();
            Oo(0);
            this.Hw.j6(aSTPair, this.FH);
        } else if (j6(1) == 158 && ce.gn(j6(2))) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(158);
            Do();
            np(true);
            this.Hw.j6(aSTPair, this.FH);
        } else if (j6(1) == 114 && ce.gn(j6(2))) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(114);
            Do();
            np(true);
            this.Hw.j6(aSTPair, this.FH);
        } else if (!Jm.gn(j6(1)) || !aq.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = aSTPair.j6;
    }

    public final void g3(boolean z) throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        Sf();
        fY(this.FH);
        this.Hw.j6(aSTPair, this.FH);
        if (this.j6.DW == 0) {
            AST firstChild = aSTPair.j6;
            if (z) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(2);
                aSTArray.j6(Ev(12, "TYPE", tokenDW, DW(1)));
                aSTArray.j6(firstChild);
                firstChild = aSTFactory.we(aSTArray);
            }
            aSTPair.j6 = firstChild;
            if (firstChild != null && firstChild.getFirstChild() != null) {
                firstChild = firstChild.getFirstChild();
            }
            aSTPair.DW = firstChild;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void gG() throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        boolean z2;
        AST ast;
        AST ast2 = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        boolean z3 = false;
        if (BT.gn(j6(1)) && vy.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                jw();
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            mb();
            ast = this.FH;
            if (this.j6.DW == 0) {
                aSTPair.j6 = ast;
                aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                aSTPair.j6();
                ast2 = ast;
            }
        } else {
            if (er.gn(j6(1)) && yS.gn(j6(2))) {
                int iGn2 = gn();
                this.j6.DW++;
                try {
                    fN();
                    z2 = true;
                } catch (RecognitionException unused2) {
                    z2 = false;
                }
                we(iGn2);
                this.j6.DW--;
            } else {
                z2 = false;
            }
            if (z2) {
                pO();
                ast = this.FH;
                if (this.j6.DW == 0) {
                    aSTPair.j6 = ast;
                    aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                    aSTPair.j6();
                    ast2 = ast;
                }
            } else {
                if (KD.gn(j6(1)) && ro.gn(j6(2))) {
                    int iGn3 = gn();
                    this.j6.DW++;
                    try {
                        yU();
                        z3 = true;
                    } catch (RecognitionException unused3) {
                    }
                    we(iGn3);
                    this.j6.DW--;
                }
                if (!z3) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                fD();
                kG(this.FH);
                ast = this.FH;
                if (this.j6.DW == 0) {
                    aSTPair.j6 = ast;
                    aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                    aSTPair.j6();
                    ast2 = ast;
                }
            }
        }
        this.FH = ast2;
    }

    public final void gQ() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Do();
        this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
        u7(130);
        Do();
        Cz();
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 101) {
            u7(101);
            Do();
            Cz();
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    public final void gW() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        while (true) {
            if (j6(1) == 96 && j6(2) == 93) {
                if (this.j6.DW == 0) {
                    break;
                }
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(96);
                this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
                u7(93);
            } else {
                if (j6(1) != 96 || j6(2) != 87) {
                    break;
                }
                aM();
                this.Hw.j6(aSTPair, this.FH);
                Do();
            }
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void hK(groovyjarjarantlr.collections.AST r17, groovyjarjarantlr.collections.AST r18, groovyjarjarantlr.collections.AST r19, groovyjarjarantlr.Token r20) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.hK(groovyjarjarantlr.collections.AST, groovyjarjarantlr.collections.AST, groovyjarjarantlr.collections.AST, groovyjarjarantlr.Token):void");
    }

    public final void hz(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        boolean z2;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        ce(i);
        this.Hw.j6(aSTPair, this.FH);
        if ((j6(1) == 174 || j6(1) == 205) && Xa.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                Do();
                u7(174);
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            Do();
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(174);
            Do();
            hz(0);
            this.Hw.j6(aSTPair, this.FH);
        } else {
            if ((j6(1) == 97 || j6(1) == 205) && Eq.gn(j6(2))) {
                int iGn2 = gn();
                this.j6.DW++;
                try {
                    Do();
                    u7(97);
                    z2 = true;
                } catch (RecognitionException unused2) {
                    z2 = false;
                }
                we(iGn2);
                this.j6.DW--;
            } else {
                z2 = false;
            }
            if (z2) {
                Do();
                this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                u7(97);
                Do();
                KD(0);
                this.Hw.j6(aSTPair, this.FH);
                Do();
                u7(136);
                Do();
                hz(0);
                this.Hw.j6(aSTPair, this.FH);
            } else if (!hz.gn(j6(1)) || !aq.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
        }
        this.FH = aSTPair.j6;
    }

    public final void iW(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        boolean z = false;
        if (nw.gn(j6(1)) && J8.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                Lm();
                z = true;
            } catch (RecognitionException unused) {
            }
            we(iGn);
            this.j6.DW--;
        }
        if (z) {
            ca(i);
            this.Hw.j6(aSTPair, this.FH);
        } else if (!nw.gn(j6(1)) || !J8.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        eU();
        AST ast = this.FH;
        this.Hw.j6(aSTPair, ast);
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(28, "EXPR", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ik() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r8 = this;
            r0 = 0
            r8.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r8.DW(r1)
            int r3 = r8.j6(r1)
            r4 = 38
            if (r3 == r4) goto L42
            r4 = 84
            if (r3 == r4) goto L42
            r4 = 87
            if (r3 == r4) goto L42
            r4 = 96
            if (r3 == r4) goto L42
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L65
            r4 = 133(0x85, float:1.86E-43)
            if (r3 == r4) goto L42
            r4 = 135(0x87, float:1.89E-43)
            if (r3 == r4) goto L65
            r4 = 205(0xcd, float:2.87E-43)
            if (r3 == r4) goto L65
            switch(r3) {
                case 104: goto L42;
                case 105: goto L42;
                case 106: goto L42;
                case 107: goto L42;
                case 108: goto L42;
                case 109: goto L42;
                case 110: goto L42;
                case 111: goto L42;
                case 112: goto L42;
                default: goto L34;
            }
        L34:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r2 = r8.Zo()
            r0.<init>(r1, r2)
            throw r0
        L42:
            r8.ek()
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.AST r4 = r8.FH
            r3.j6(r0, r4)
        L4c:
            int r3 = r8.j6(r1)
            r4 = 101(0x65, float:1.42E-43)
            if (r3 != r4) goto L65
            r8.u7(r4)
            r8.Do()
            r8.ek()
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.AST r4 = r8.FH
            r3.j6(r0, r4)
            goto L4c
        L65:
            groovyjarjarantlr.ParserSharedInputState r3 = r8.j6
            int r3 = r3.DW
            if (r3 != 0) goto L9e
            groovyjarjarantlr.collections.AST r3 = r0.j6
            groovyjarjarantlr.ASTFactory r4 = r8.Hw
            groovyjarjarantlr.collections.impl.ASTArray r5 = new groovyjarjarantlr.collections.impl.ASTArray
            r6 = 2
            r5.<init>(r6)
            r6 = 20
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r7 = "PARAMETERS"
            groovyjarjarantlr.collections.AST r1 = r8.Ev(r6, r7, r2, r1)
            r5.j6(r1)
            r5.j6(r3)
            groovyjarjarantlr.collections.AST r1 = r4.we(r5)
            r0.j6 = r1
            if (r1 == 0) goto L99
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto L99
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        L99:
            r0.DW = r1
            r0.j6()
        L9e:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r8.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.ik():void");
    }

    public final void j3() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (wc.gn(j6(1)) && et.gn(j6(2))) {
            rN();
            AST ast2 = this.FH;
            this.Hw.j6(aSTPair, ast2);
            if (this.j6.DW == 0) {
                Token token = new Token(87, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(1);
                aSTArray.j6(Ev(87, AppMeasurementSdk.ConditionalUserProperty.VALUE, token, token));
                AST astWe = aSTFactory.we(aSTArray);
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(3);
                aSTArray2.j6(Ev(67, "ANNOTATION_MEMBER_VALUE_PAIR", DW(1), DW(1)));
                aSTArray2.j6(astWe);
                aSTArray2.j6(ast2);
                AST astWe2 = aSTFactory2.we(aSTArray2);
                aSTPair.j6 = astWe2;
                if (astWe2 != null && astWe2.getFirstChild() != null) {
                    astWe2 = astWe2.getFirstChild();
                }
                aSTPair.DW = astWe2;
                aSTPair.j6();
            }
            ast = aSTPair.j6;
        } else {
            if (!CU.gn(j6(1)) || j6(2) != 124) {
                throw new NoViableAltException(DW(1), Zo());
            }
            yS();
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void j7() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(126);
        Do();
        dx(1);
        AST ast = this.FH;
        u7(127);
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(7, "{", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void jJ() throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (AE.gn(j6(1)) && Za.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                nw();
                u7(136);
                Do();
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            nw();
            this.Hw.j6(aSTPair, this.FH);
            AST astV5 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV5);
            u7(136);
            Do();
            Jl(0);
            this.Hw.j6(aSTPair, this.FH);
            if (this.j6.DW == 0) {
                astV5.Mr(54);
            }
            ast = aSTPair.j6;
        } else {
            if (!nw.gn(j6(1)) || !sy.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
            Jl(0);
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void jO() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        AST ast2;
        AST astWe;
        AST ast3 = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(126);
        Do();
        boolean z = false;
        if (Z1.gn(j6(1)) && n5.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                kf();
                z = true;
            } catch (RecognitionException unused) {
            }
            we(iGn);
            this.j6.DW--;
        }
        if (z) {
            kf();
            AST ast4 = this.FH;
            int iJ6 = j6(1);
            if (iJ6 == 127) {
                ast2 = null;
                ast3 = ast4;
                ast = null;
            } else {
                if (iJ6 != 128 && iJ6 != 205) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                be();
                dx(this.gn);
                ast2 = this.FH;
                ast = null;
                ast3 = ast4;
            }
        } else {
            if (!vJ.gn(j6(1)) || !Q6.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
            dx(1);
            ast = this.FH;
            ast2 = null;
        }
        u7(127);
        if (this.j6.DW == 0) {
            if (ast3 != null) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(3);
                aSTArray.j6(Ev(7, "{", tokenDW, DW(1)));
                aSTArray.j6(ast3);
                aSTArray.j6(ast2);
                astWe = aSTFactory.we(aSTArray);
            } else {
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(2);
                aSTArray2.j6(Ev(7, "{", tokenDW, DW(1)));
                aSTArray2.j6(ast);
                astWe = aSTFactory2.we(aSTArray2);
            }
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void jT(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Sg(i);
        this.Hw.j6(aSTPair, this.FH);
        if (j6(1) == 190 && oa.gn(j6(2))) {
            AST astV5 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV5);
            u7(190);
            if (this.j6.DW == 0) {
                astV5.Mr(25);
            }
        } else if (j6(1) == 193 && oa.gn(j6(2))) {
            AST astV52 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV52);
            u7(ProxyTextView.INPUTTYPE_textPhonetic);
            if (this.j6.DW == 0) {
                astV52.Mr(26);
            }
        } else if (!oa.gn(j6(1)) || !aq.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        throw new groovyjarjarantlr.NoViableAltException(DW(1), Zo());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r1 < 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r1 = j6(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r1 == 87) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if (r1 != 88) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        r11.Hw.v5(DW(1));
        u7(88);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        throw new groovyjarjarantlr.NoViableAltException(DW(1), Zo());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
    
        r11.Hw.v5(DW(1));
        u7(87);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
    
        r11.FH = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        throw new groovyjarjarantlr.NoViableAltException(DW(1), Zo());
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[LOOP:1: B:47:0x00a8->B:49:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[FALL_THROUGH, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jw() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.jw():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k2() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.k2():void");
    }

    protected final void kG(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast2;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        switch (j6(1)) {
            case 92:
                Qq(ast);
                AST firstChild = this.FH;
                this.Hw.j6(aSTPair, firstChild);
                if (this.j6.DW == 0) {
                    aSTPair.j6 = firstChild;
                    if (firstChild != null && firstChild.getFirstChild() != null) {
                        firstChild = firstChild.getFirstChild();
                    }
                    aSTPair.DW = firstChild;
                    aSTPair.j6();
                }
                ast2 = aSTPair.j6;
                break;
            case 93:
                ys(ast);
                AST firstChild2 = this.FH;
                this.Hw.j6(aSTPair, firstChild2);
                if (this.j6.DW == 0) {
                    aSTPair.j6 = firstChild2;
                    if (firstChild2 != null && firstChild2.getFirstChild() != null) {
                        firstChild2 = firstChild2.getFirstChild();
                    }
                    aSTPair.DW = firstChild2;
                    aSTPair.j6();
                }
                ast2 = aSTPair.j6;
                break;
            case 94:
                Z1(ast);
                AST firstChild3 = this.FH;
                this.Hw.j6(aSTPair, firstChild3);
                if (this.j6.DW == 0) {
                    aSTPair.j6 = firstChild3;
                    if (firstChild3 != null && firstChild3.getFirstChild() != null) {
                        firstChild3 = firstChild3.getFirstChild();
                    }
                    aSTPair.DW = firstChild3;
                    aSTPair.j6();
                }
                ast2 = aSTPair.j6;
                break;
            case 95:
                C1(ast);
                AST firstChild4 = this.FH;
                this.Hw.j6(aSTPair, firstChild4);
                if (this.j6.DW == 0) {
                    aSTPair.j6 = firstChild4;
                    if (firstChild4 != null && firstChild4.getFirstChild() != null) {
                        firstChild4 = firstChild4.getFirstChild();
                    }
                    aSTPair.DW = firstChild4;
                    aSTPair.j6();
                }
                ast2 = aSTPair.j6;
                break;
            case 96:
                U2(ast);
                AST firstChild5 = this.FH;
                this.Hw.j6(aSTPair, firstChild5);
                if (this.j6.DW == 0) {
                    aSTPair.j6 = firstChild5;
                    if (firstChild5 != null && firstChild5.getFirstChild() != null) {
                        firstChild5 = firstChild5.getFirstChild();
                    }
                    aSTPair.DW = firstChild5;
                    aSTPair.j6();
                }
                ast2 = aSTPair.j6;
                break;
            default:
                throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = ast2;
    }

    public final void kQ(boolean z) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        boolean z2 = false;
        if (sE.gn(j6(1)) && sg.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                ik();
                Do();
                u7(135);
                z2 = true;
            } catch (RecognitionException unused) {
            }
            we(iGn);
            this.j6.DW--;
        }
        if (z2) {
            ik();
            this.Hw.j6(aSTPair, this.FH);
            Do();
            u7(135);
            Do();
            ast = aSTPair.j6;
        } else if (vJ.gn(j6(1)) && aq.gn(j6(2)) && z) {
            aX();
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        } else {
            if (!vJ.gn(j6(1)) || !aq.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void kf() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 89) {
            el();
            this.Hw.j6(aSTPair, this.FH);
        } else if (iJ6 != 99 && iJ6 != 132) {
            throw new NoViableAltException(DW(1), Zo());
        }
        int iJ62 = j6(1);
        if (iJ62 == 99) {
            u7(99);
            AST astV5 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV5);
            u7(91);
            P8();
            this.Hw.j6(aSTPair, this.FH);
            u7(123);
            if (this.j6.DW == 0) {
                astV5.Mr(44);
            }
        } else {
            if (iJ62 != 132) {
                throw new NoViableAltException(DW(1), Zo());
            }
            u7(132);
            AST astV52 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV52);
            u7(91);
            P8();
            this.Hw.j6(aSTPair, this.FH);
            u7(123);
            if (this.j6.DW == 0) {
                astV52.Mr(45);
            }
        }
        this.FH = aSTPair.j6;
    }

    public final void ko() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        fD();
        Token tokenDW = DW(1);
        this.Hw.v5(tokenDW);
        u7(87);
        if (!Nh(tokenDW)) {
            throw new SemanticException("isConstructorIdent(id)");
        }
        Do();
        u7(91);
        this.FH = null;
    }

    public final void lJ() throws NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 != 87) {
            switch (iJ6) {
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                    vJ(true);
                    this.Hw.j6(aSTPair, this.FH);
                    ast = aSTPair.j6;
                    break;
                default:
                    throw new NoViableAltException(DW(1), Zo());
            }
        } else {
            lp(true);
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lg() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r4 = this;
            r0 = 0
            r4.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            int r2 = r4.j6(r1)
            r3 = 98
            if (r2 == r3) goto L55
            r3 = 99
            if (r2 == r3) goto L55
            switch(r2) {
                case 38: goto L55;
                case 39: goto L55;
                case 40: goto L55;
                case 41: goto L55;
                case 42: goto L55;
                case 43: goto L55;
                default: goto L18;
            }
        L18:
            switch(r2) {
                case 81: goto L55;
                case 82: goto L55;
                case 83: goto L55;
                case 84: goto L55;
                default: goto L1b;
            }
        L1b:
            switch(r2) {
                case 87: goto L3e;
                case 137: goto L55;
                case 138: goto L55;
                case 139: goto L55;
                case 140: goto L55;
                case 141: goto L55;
                case 142: goto L55;
                case 143: goto L55;
                case 144: goto L55;
                case 145: goto L55;
                case 146: goto L55;
                case 147: goto L55;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 92: goto L55;
                case 93: goto L55;
                case 94: goto L55;
                case 95: goto L55;
                default: goto L21;
            }
        L21:
            switch(r2) {
                case 104: goto L55;
                case 105: goto L55;
                case 106: goto L55;
                case 107: goto L55;
                case 108: goto L55;
                case 109: goto L55;
                case 110: goto L55;
                case 111: goto L55;
                case 112: goto L55;
                default: goto L24;
            }
        L24:
            switch(r2) {
                case 114: goto L55;
                case 115: goto L55;
                case 116: goto L55;
                case 117: goto L55;
                case 118: goto L55;
                case 119: goto L55;
                case 120: goto L55;
                case 121: goto L55;
                case 122: goto L55;
                default: goto L27;
            }
        L27:
            switch(r2) {
                case 129: goto L55;
                case 130: goto L55;
                case 131: goto L55;
                case 132: goto L55;
                default: goto L2a;
            }
        L2a:
            switch(r2) {
                case 150: goto L55;
                case 151: goto L55;
                case 152: goto L55;
                case 153: goto L55;
                default: goto L2d;
            }
        L2d:
            switch(r2) {
                case 157: goto L55;
                case 158: goto L55;
                case 159: goto L55;
                case 160: goto L55;
                case 161: goto L55;
                default: goto L30;
            }
        L30:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            java.lang.String r2 = r4.Zo()
            r0.<init>(r1, r2)
            throw r0
        L3e:
            groovyjarjarantlr.ASTFactory r2 = r4.Hw
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            groovyjarjarantlr.collections.AST r1 = r2.v5(r1)
            groovyjarjarantlr.ASTFactory r2 = r4.Hw
            r2.j6(r0, r1)
            r1 = 87
            r4.u7(r1)
            groovyjarjarantlr.collections.AST r0 = r0.j6
            goto L61
        L55:
            r4.AE()
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            groovyjarjarantlr.collections.AST r2 = r4.FH
            r1.j6(r0, r2)
            groovyjarjarantlr.collections.AST r0 = r0.j6
        L61:
            r4.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.lg():void");
    }

    public final void lj() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        NH();
        this.Hw.j6(aSTPair, this.FH);
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(5, "MODIFIERS", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void lp(boolean z) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        aj(false);
        fY(this.FH);
        this.Hw.j6(aSTPair, this.FH);
        if (this.j6.DW == 0) {
            AST firstChild = aSTPair.j6;
            if (z) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(2);
                aSTArray.j6(Ev(12, "TYPE", tokenDW, DW(1)));
                aSTArray.j6(firstChild);
                firstChild = aSTFactory.we(aSTArray);
            }
            aSTPair.j6 = firstChild;
            if (firstChild != null && firstChild.getFirstChild() != null) {
                firstChild = firstChild.getFirstChild();
            }
            aSTPair.DW = firstChild;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void lz() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
        u7(97);
        boolean z = false;
        if ((j6(1) == 98 || j6(1) == 99) && (j6(2) == 87 || j6(2) == 205)) {
            int iGn = gn();
            this.j6.DW++;
            try {
                int iJ6 = j6(1);
                if (iJ6 == 98) {
                    u7(98);
                } else {
                    if (iJ6 != 99) {
                        throw new NoViableAltException(DW(1), Zo());
                    }
                    u7(99);
                }
                z = true;
            } catch (RecognitionException unused) {
            }
            we(iGn);
            this.j6.DW--;
        }
        if (z) {
            yF();
            this.Hw.j6(aSTPair, this.FH);
        } else if (!OW.gn(j6(1)) || !QX.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        if (this.j6.DW == 0) {
            aSTPair.j6.Mr(74);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8(int r6) throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.m8(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mb() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r9 = this;
            r0 = 0
            r9.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r2 = 1
            int r3 = r9.j6(r2)
            r4 = 38
            r5 = 0
            r6 = 87
            if (r3 == r4) goto L65
            r4 = 39
            if (r3 == r4) goto L65
            r4 = 43
            if (r3 == r4) goto L65
            if (r3 == r6) goto L3e
            r4 = 96
            if (r3 == r4) goto L65
            r4 = 83
            if (r3 == r4) goto L65
            r4 = 84
            if (r3 == r4) goto L65
            switch(r3) {
                case 104: goto L3e;
                case 105: goto L3e;
                case 106: goto L3e;
                case 107: goto L3e;
                case 108: goto L3e;
                case 109: goto L3e;
                case 110: goto L3e;
                case 111: goto L3e;
                case 112: goto L3e;
                default: goto L2d;
            }
        L2d:
            switch(r3) {
                case 115: goto L65;
                case 116: goto L65;
                case 117: goto L65;
                case 118: goto L65;
                case 119: goto L65;
                case 120: goto L65;
                case 121: goto L65;
                case 122: goto L65;
                default: goto L30;
            }
        L30:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r9.DW(r2)
            java.lang.String r2 = r9.Zo()
            r0.<init>(r1, r2)
            throw r0
        L3e:
            r9.np(r5)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            r9.D5(r0, r2)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            groovyjarjarantlr.ParserSharedInputState r3 = r9.j6
            int r3 = r3.DW
            if (r3 != 0) goto Lc5
            r1.j6 = r2
            if (r2 == 0) goto L5d
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            if (r0 == 0) goto L5d
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            goto L5e
        L5d:
            r0 = r2
        L5e:
            r1.DW = r0
            r1.j6()
        L63:
            r0 = r2
            goto Lc5
        L65:
            r9.lj()
            groovyjarjarantlr.collections.AST r3 = r9.FH
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.sh
            int r7 = r9.j6(r2)
            boolean r4 = r4.gn(r7)
            r7 = 2
            if (r4 == 0) goto L89
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.cb
            int r8 = r9.j6(r7)
            boolean r4 = r4.gn(r8)
            if (r4 == 0) goto L89
            r9.np(r5)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            goto La4
        L89:
            int r4 = r9.j6(r2)
            if (r4 == r6) goto L97
            int r4 = r9.j6(r2)
            r5 = 88
            if (r4 != r5) goto Lc8
        L97:
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.dx
            int r5 = r9.j6(r7)
            boolean r4 = r4.gn(r5)
            if (r4 == 0) goto Lc8
            r2 = r0
        La4:
            r9.D5(r3, r2)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            groovyjarjarantlr.ParserSharedInputState r3 = r9.j6
            int r3 = r3.DW
            if (r3 != 0) goto Lc5
            r1.j6 = r2
            if (r2 == 0) goto Lbe
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            if (r0 == 0) goto Lbe
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            goto Lbf
        Lbe:
            r0 = r2
        Lbf:
            r1.DW = r0
            r1.j6()
            goto L63
        Lc5:
            r9.FH = r0
            return
        Lc8:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r9.DW(r2)
            java.lang.String r2 = r9.Zo()
            r0.<init>(r1, r2)
            goto Ld7
        Ld6:
            throw r0
        Ld7:
            goto Ld6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.mb():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mn() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r11 = this;
            r0 = 0
            r11.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r2 = 1
            groovyjarjarantlr.Token r3 = r11.DW(r2)
            groovyjarjarantlr.Token r3 = r11.OW(r3)
            r11.lj()
            groovyjarjarantlr.collections.AST r4 = r11.FH
            int r5 = r11.j6(r2)
            r6 = 87
            r7 = 0
            r8 = 91
            if (r5 == r6) goto L34
            if (r5 == r8) goto L39
            switch(r5) {
                case 104: goto L34;
                case 105: goto L34;
                case 106: goto L34;
                case 107: goto L34;
                case 108: goto L34;
                case 109: goto L34;
                case 110: goto L34;
                case 111: goto L34;
                case 112: goto L34;
                default: goto L26;
            }
        L26:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r11.DW(r2)
            java.lang.String r2 = r11.Zo()
            r0.<init>(r1, r2)
            throw r0
        L34:
            r11.np(r7)
            groovyjarjarantlr.collections.AST r0 = r11.FH
        L39:
            groovyjarjarantlr.ASTFactory r5 = r11.Hw
            groovyjarjarantlr.Token r6 = r11.DW(r2)
            groovyjarjarantlr.collections.AST r5 = r5.v5(r6)
            groovyjarjarantlr.ASTFactory r6 = r11.Hw
            r6.J8(r1, r5)
            r11.u7(r8)
            r11.Do()
            r11.q5(r4, r3)
            groovyjarjarantlr.ASTFactory r5 = r11.Hw
            groovyjarjarantlr.collections.AST r6 = r11.FH
            r5.j6(r1, r6)
            r5 = 123(0x7b, float:1.72E-43)
            r11.u7(r5)
            groovyjarjarantlr.ASTFactory r5 = r11.Hw
            groovyjarjarantlr.Token r6 = r11.DW(r2)
            groovyjarjarantlr.collections.AST r5 = r5.v5(r6)
            groovyjarjarantlr.ASTFactory r6 = r11.Hw
            r6.J8(r1, r5)
            r5 = 124(0x7c, float:1.74E-43)
            r11.u7(r5)
            r11.Do()
            r11.KD(r7)
            groovyjarjarantlr.ASTFactory r5 = r11.Hw
            groovyjarjarantlr.collections.AST r6 = r11.FH
            r5.j6(r1, r6)
            groovyjarjarantlr.ParserSharedInputState r5 = r11.j6
            int r5 = r5.DW
            if (r5 != 0) goto Ldb
            groovyjarjarantlr.collections.AST r5 = r1.j6
            groovyjarjarantlr.ASTFactory r6 = r11.Hw
            groovyjarjarantlr.collections.impl.ASTArray r7 = new groovyjarjarantlr.collections.impl.ASTArray
            r8 = 4
            r7.<init>(r8)
            r8 = 9
            groovyjarjarantlr.Token r9 = r11.DW(r2)
            java.lang.String r10 = "VARIABLE_DEF"
            groovyjarjarantlr.collections.AST r8 = r11.Ev(r8, r10, r3, r9)
            r7.j6(r8)
            r7.j6(r4)
            groovyjarjarantlr.ASTFactory r4 = r11.Hw
            groovyjarjarantlr.collections.impl.ASTArray r8 = new groovyjarjarantlr.collections.impl.ASTArray
            r9 = 2
            r8.<init>(r9)
            r9 = 12
            groovyjarjarantlr.Token r2 = r11.DW(r2)
            java.lang.String r10 = "TYPE"
            groovyjarjarantlr.collections.AST r2 = r11.Ev(r9, r10, r3, r2)
            r8.j6(r2)
            r8.j6(r0)
            groovyjarjarantlr.collections.AST r0 = r4.we(r8)
            r7.j6(r0)
            r7.j6(r5)
            groovyjarjarantlr.collections.AST r0 = r6.we(r7)
            r1.j6 = r0
            if (r0 == 0) goto Ld6
            groovyjarjarantlr.collections.AST r2 = r0.getFirstChild()
            if (r2 == 0) goto Ld6
            groovyjarjarantlr.collections.AST r0 = r0.getFirstChild()
        Ld6:
            r1.DW = r0
            r1.j6()
        Ldb:
            groovyjarjarantlr.collections.AST r0 = r1.j6
            r11.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.mn():void");
    }

    public final void mr() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        u7(89);
        u7(100);
        Do();
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(70, "TYPE_ARGUMENTS", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void n5(int i) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        fr(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) >= 180 && j6(1) <= 184) {
            switch (j6(1)) {
                case 180:
                    this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                    u7(180);
                    break;
                case 181:
                    this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                    u7(181);
                    break;
                case 182:
                    this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                    u7(182);
                    break;
                case 183:
                    this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                    u7(183);
                    break;
                case 184:
                    this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
                    u7(184);
                    break;
                default:
                    throw new NoViableAltException(DW(1), Zo());
            }
            Do();
            fr(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n8() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r8 = this;
            r0 = 0
            r8.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            r8.DW(r1)
            int r2 = r8.j6(r1)
            r3 = 99
            r4 = 98
            r5 = 88
            r6 = 87
            if (r2 == r6) goto L65
            if (r2 == r5) goto L65
            if (r2 == r4) goto L65
            if (r2 == r3) goto L65
            switch(r2) {
                case 38: goto L65;
                case 39: goto L65;
                case 40: goto L65;
                case 41: goto L65;
                case 42: goto L65;
                case 43: goto L65;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 81: goto L65;
                case 82: goto L65;
                case 83: goto L65;
                case 84: goto L65;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 91: goto L65;
                case 92: goto L65;
                case 93: goto L65;
                case 94: goto L65;
                case 95: goto L65;
                case 96: goto L46;
                default: goto L29;
            }
        L29:
            switch(r2) {
                case 104: goto L65;
                case 105: goto L65;
                case 106: goto L65;
                case 107: goto L65;
                case 108: goto L65;
                case 109: goto L65;
                case 110: goto L65;
                case 111: goto L65;
                case 112: goto L65;
                default: goto L2c;
            }
        L2c:
            switch(r2) {
                case 114: goto L65;
                case 115: goto L65;
                case 116: goto L65;
                case 117: goto L65;
                case 118: goto L65;
                case 119: goto L65;
                case 120: goto L65;
                case 121: goto L65;
                case 122: goto L65;
                default: goto L2f;
            }
        L2f:
            switch(r2) {
                case 126: goto L65;
                case 137: goto L65;
                case 138: goto L65;
                case 139: goto L65;
                case 140: goto L65;
                case 141: goto L65;
                case 142: goto L65;
                case 143: goto L65;
                case 144: goto L65;
                case 145: goto L65;
                case 146: goto L65;
                case 147: goto L65;
                case 157: goto L65;
                case 158: goto L65;
                case 159: goto L65;
                case 160: goto L65;
                case 161: goto L65;
                case 197: goto L65;
                default: goto L32;
            }
        L32:
            switch(r2) {
                case 129: goto L65;
                case 130: goto L65;
                case 131: goto L65;
                case 132: goto L65;
                default: goto L35;
            }
        L35:
            switch(r2) {
                case 150: goto L65;
                case 151: goto L65;
                case 152: goto L65;
                case 153: goto L65;
                default: goto L38;
            }
        L38:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r2 = r8.Zo()
            r0.<init>(r1, r2)
            throw r0
        L46:
            groovyjarjarantlr.Token r2 = r8.DW(r1)
            groovyjarjarantlr.ASTFactory r7 = r8.Hw
            groovyjarjarantlr.collections.AST r2 = r7.v5(r2)
            groovyjarjarantlr.ASTFactory r7 = r8.Hw
            r7.J8(r0, r2)
            r7 = 96
            r8.u7(r7)
            groovyjarjarantlr.ParserSharedInputState r7 = r8.j6
            int r7 = r7.DW
            if (r7 != 0) goto L65
            r7 = 52
            r2.Mr(r7)
        L65:
            int r2 = r8.j6(r1)
            if (r2 == r6) goto Ld4
            if (r2 == r5) goto Lb8
            if (r2 == r4) goto Lad
            if (r2 == r3) goto Lad
            switch(r2) {
                case 38: goto Lad;
                case 39: goto Lad;
                case 40: goto Lad;
                case 41: goto Lad;
                case 42: goto Lad;
                case 43: goto Lad;
                default: goto L74;
            }
        L74:
            switch(r2) {
                case 81: goto Lad;
                case 82: goto Lad;
                case 83: goto Lad;
                case 84: goto Lad;
                default: goto L77;
            }
        L77:
            switch(r2) {
                case 91: goto La2;
                case 92: goto Lad;
                case 93: goto Lad;
                case 94: goto Lad;
                case 95: goto Lad;
                default: goto L7a;
            }
        L7a:
            switch(r2) {
                case 104: goto Lad;
                case 105: goto Lad;
                case 106: goto Lad;
                case 107: goto Lad;
                case 108: goto Lad;
                case 109: goto Lad;
                case 110: goto Lad;
                case 111: goto Lad;
                case 112: goto Lad;
                default: goto L7d;
            }
        L7d:
            switch(r2) {
                case 114: goto Lad;
                case 115: goto Lad;
                case 116: goto Lad;
                case 117: goto Lad;
                case 118: goto Lad;
                case 119: goto Lad;
                case 120: goto Lad;
                case 121: goto Lad;
                case 122: goto Lad;
                default: goto L80;
            }
        L80:
            switch(r2) {
                case 126: goto L97;
                case 137: goto Lad;
                case 138: goto Lad;
                case 139: goto Lad;
                case 140: goto Lad;
                case 141: goto Lad;
                case 142: goto Lad;
                case 143: goto Lad;
                case 144: goto Lad;
                case 145: goto Lad;
                case 146: goto Lad;
                case 147: goto Lad;
                case 157: goto Lad;
                case 158: goto Lad;
                case 159: goto Lad;
                case 160: goto Lad;
                case 161: goto Lad;
                case 197: goto La2;
                default: goto L83;
            }
        L83:
            switch(r2) {
                case 129: goto Lad;
                case 130: goto Lad;
                case 131: goto Lad;
                case 132: goto Lad;
                default: goto L86;
            }
        L86:
            switch(r2) {
                case 150: goto Lad;
                case 151: goto Lad;
                case 152: goto Lad;
                case 153: goto Lad;
                default: goto L89;
            }
        L89:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r2 = r8.Zo()
            r0.<init>(r1, r2)
            throw r0
        L97:
            r8.j7()
            groovyjarjarantlr.ASTFactory r1 = r8.Hw
            groovyjarjarantlr.collections.AST r2 = r8.FH
            r1.j6(r0, r2)
            goto Le6
        La2:
            r8.qp()
            groovyjarjarantlr.ASTFactory r1 = r8.Hw
            groovyjarjarantlr.collections.AST r2 = r8.FH
            r1.j6(r0, r2)
            goto Le6
        Lad:
            r8.AE()
            groovyjarjarantlr.ASTFactory r1 = r8.Hw
            groovyjarjarantlr.collections.AST r2 = r8.FH
            r1.j6(r0, r2)
            goto Le6
        Lb8:
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            groovyjarjarantlr.ASTFactory r2 = r8.Hw
            groovyjarjarantlr.collections.AST r1 = r2.v5(r1)
            groovyjarjarantlr.ASTFactory r2 = r8.Hw
            r2.j6(r0, r1)
            r8.u7(r5)
            groovyjarjarantlr.ParserSharedInputState r2 = r8.j6
            int r2 = r2.DW
            if (r2 != 0) goto Le6
            r1.Mr(r6)
            goto Le6
        Ld4:
            groovyjarjarantlr.ASTFactory r2 = r8.Hw
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            groovyjarjarantlr.collections.AST r1 = r2.v5(r1)
            groovyjarjarantlr.ASTFactory r2 = r8.Hw
            r2.j6(r0, r1)
            r8.u7(r6)
        Le6:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r8.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.n8():void");
    }

    public final void np(boolean z) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 != 87) {
            switch (iJ6) {
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                    g3(z);
                    this.Hw.j6(aSTPair, this.FH);
                    ast = aSTPair.j6;
                    break;
                default:
                    throw new NoViableAltException(DW(1), Zo());
            }
        } else {
            lp(z);
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public final void nw() throws NoViableAltException, MismatchedTokenException {
        boolean z;
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        boolean z2 = false;
        if (j6(1) == 87 && j6(2) == 136) {
            int iGn = gn();
            this.j6.DW++;
            try {
                u7(87);
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            AST astV5 = this.Hw.v5(DW(1));
            this.Hw.j6(aSTPair, astV5);
            u7(87);
            if (this.j6.DW == 0) {
                astV5.Mr(88);
            }
            ast = aSTPair.j6;
        } else {
            if (An.gn(j6(1)) && j6(2) == 136) {
                int iGn2 = gn();
                this.j6.DW++;
                try {
                    AE();
                    z2 = true;
                } catch (RecognitionException unused2) {
                }
                we(iGn2);
                this.j6.DW--;
            }
            if (z2) {
                AE();
                AST ast2 = this.FH;
                this.Hw.j6(aSTPair, ast2);
                if (this.j6.DW == 0) {
                    ast2.Mr(88);
                }
                ast = aSTPair.j6;
            } else {
                if (!ys.gn(j6(1)) || !Za.gn(j6(2))) {
                    throw new NoViableAltException(DW(1), Zo());
                }
                Mk();
                this.Hw.j6(aSTPair, this.FH);
                ast = aSTPair.j6;
            }
        }
        this.FH = ast;
    }

    public final void oY(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast2 = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        if (ast != null) {
            tokenOW.gn(ast.getLine());
            tokenOW.VH(ast.Zo());
        }
        Token tokenDW = DW(1);
        this.Hw.j6(aSTPair, this.Hw.v5(tokenDW));
        u7(87);
        u7(91);
        ik();
        AST ast3 = this.FH;
        u7(123);
        boolean z = false;
        if ((j6(1) == 130 || j6(1) == 205) && ef.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                Do();
                u7(130);
                z = true;
            } catch (RecognitionException unused) {
            }
            we(iGn);
            this.j6.DW--;
        }
        if (z) {
            gQ();
            ast2 = this.FH;
        } else if ((j6(1) != 126 && j6(1) != 205) || !q7.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        Sx();
        if (this.j6.DW == 0) {
            Nh(tokenDW);
        }
        jO();
        AST ast4 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(5);
            aSTArray.j6(Ev(46, "CTOR_IDENT", tokenOW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(ast3);
            aSTArray.j6(ast2);
            aSTArray.j6(ast4);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public void oa(String str, String str2) throws SemanticException {
        int iFH = Token.mb.FH();
        int iZo = Token.mb.Zo();
        try {
            Token tokenDW = DW(1);
            if (tokenDW != null) {
                iFH = tokenDW.FH();
                iZo = tokenDW.Zo();
            }
        } catch (TokenStreamException e) {
            if (e instanceof TokenStreamRecognitionException) {
                TokenStreamRecognitionException tokenStreamRecognitionException = (TokenStreamRecognitionException) e;
                iFH = tokenStreamRecognitionException.WB.DW();
                iZo = tokenStreamRecognitionException.WB.j6();
            }
        }
        throw new SemanticException(str + ";\n   solution: " + str2, Zo(), iFH, iZo);
    }

    public final void oy() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        int iJ6 = j6(1);
        if (iJ6 != 126) {
            if (iJ6 == 131) {
                this.Hw.v5(DW(1));
                u7(131);
                Do();
                aj(true);
                this.Hw.j6(aSTPair, this.FH);
                while (j6(1) == 101) {
                    u7(101);
                    Do();
                    aj(true);
                    this.Hw.j6(aSTPair, this.FH);
                }
                Do();
            } else if (iJ6 != 205) {
                throw new NoViableAltException(DW(1), Zo());
            }
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(19, "IMPLEMENTS_CLAUSE", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void pN() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        while (j6(1) == 90 && (j6(2) == 87 || j6(2) == 205)) {
            this.Hw.v5(DW(1));
            u7(90);
            Do();
            AST astV52 = this.Hw.v5(DW(1));
            u7(87);
            if (this.j6.DW == 0) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(3);
                aSTArray.j6(Ev(90, ".", tokenDW, DW(1)));
                aSTArray.j6(astV5);
                aSTArray.j6(astV52);
                astV5 = aSTFactory.we(aSTArray);
            }
        }
        int iJ6 = j6(1);
        if (iJ6 != 1) {
            if (iJ6 == 90) {
                this.Hw.v5(DW(1));
                u7(90);
                Do();
                AST astV53 = this.Hw.v5(DW(1));
                u7(ProxyTextView.INPUTTYPE_textPostalAddress);
                if (this.j6.DW == 0) {
                    ASTFactory aSTFactory2 = this.Hw;
                    ASTArray aSTArray2 = new ASTArray(3);
                    aSTArray2.j6(Ev(90, ".", tokenDW, DW(1)));
                    aSTArray2.j6(astV5);
                    aSTArray2.j6(astV53);
                    astV5 = aSTFactory2.we(aSTArray2);
                }
            } else if (iJ6 == 114) {
                u7(114);
                Do();
                AST astV54 = this.Hw.v5(DW(1));
                u7(87);
                if (this.j6.DW == 0) {
                    ASTFactory aSTFactory3 = this.Hw;
                    ASTArray aSTArray3 = new ASTArray(3);
                    aSTArray3.j6(Ev(114, "as", tokenDW, DW(1)));
                    aSTArray3.j6(astV5);
                    aSTArray3.j6(astV54);
                    astV5 = aSTFactory3.we(aSTArray3);
                }
            } else if (iJ6 != 138 && iJ6 != 150 && iJ6 != 205) {
                switch (iJ6) {
                    case 127:
                    case 128:
                    case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                        break;
                    default:
                        throw new NoViableAltException(DW(1), Zo());
                }
            }
        }
        if (this.j6.DW == 0) {
            aSTPair.j6 = astV5;
            if (astV5 != null && astV5.getFirstChild() != null) {
                astV5 = astV5.getFirstChild();
            }
            aSTPair.DW = astV5;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void pO() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        lj();
        AST ast2 = this.FH;
        Y9();
        AST ast3 = this.FH;
        np(false);
        D5(ast2, this.FH);
        AST ast4 = this.FH;
        if (this.j6.DW == 0) {
            AST firstChild = ast4.getFirstChild();
            ast4.U2(ast3);
            ast3.tp(firstChild);
            aSTPair.j6 = ast4;
            aSTPair.DW = (ast4 == null || ast4.getFirstChild() == null) ? ast4 : ast4.getFirstChild();
            aSTPair.j6();
            ast = ast4;
        }
        this.FH = ast;
    }

    public final void ph() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
        u7(87);
        if (j6(1) == 98 && (j6(2) == 87 || j6(2) == 205)) {
            Wo();
            this.Hw.j6(aSTPair, this.FH);
        } else if (!ko.gn(j6(1)) || !Ev.gn(j6(2))) {
            throw new NoViableAltException(DW(1), Zo());
        }
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(73, "TYPE_PARAMETER", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void q5(AST ast, Token token) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast2;
        AST ast3 = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (sh.gn(j6(1)) && g3.gn(j6(2))) {
            np(false);
            ast2 = this.FH;
        } else {
            if (j6(1) != 87 || (j6(2) != 101 && j6(2) != 123)) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast2 = null;
        }
        UI(v5().u7(ast), ast2);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 101) {
            u7(101);
            Do();
            if (this.j6.DW == 0) {
                DW(1);
            }
            if (sh.gn(j6(1)) && g3.gn(j6(2))) {
                np(false);
                ast3 = this.FH;
            } else if (j6(1) != 87 || (j6(2) != 101 && j6(2) != 123)) {
                throw new NoViableAltException(DW(1), Zo());
            }
            UI(v5().u7(ast), ast3);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.q7():void");
    }

    public final void qP(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST astWe;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        u7(91);
        P8();
        AST ast2 = this.FH;
        u7(123);
        if (this.j6.DW == 0) {
            if (ast == null || ast.getFirstChild() == null) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(3);
                aSTArray.j6(WB(27, "(", ast, DW(1)));
                aSTArray.j6(ast);
                aSTArray.j6(ast2);
                astWe = aSTFactory.we(aSTArray);
            } else {
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(3);
                aSTArray2.j6(WB(27, "(", ast.getFirstChild(), DW(1)));
                aSTArray2.j6(ast);
                aSTArray2.j6(ast2);
                astWe = aSTFactory2.we(aSTArray2);
            }
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void qp() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        int iJ6 = j6(1);
        if (iJ6 == 91) {
            wa();
            AST ast = this.FH;
            if (this.j6.DW == 0) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(2);
                aSTArray.j6(Ev(28, "EXPR", tokenDW, DW(1)));
                aSTArray.j6(ast);
                AST astWe = aSTFactory.we(aSTArray);
                aSTPair.j6 = astWe;
                if (astWe != null && astWe.getFirstChild() != null) {
                    astWe = astWe.getFirstChild();
                }
                aSTPair.DW = astWe;
                aSTPair.j6();
            }
        } else {
            if (iJ6 != 197) {
                throw new NoViableAltException(DW(1), Zo());
            }
            un();
            this.Hw.j6(aSTPair, this.FH);
        }
        if (this.j6.DW == 0) {
            AST ast2 = aSTPair.j6;
            ASTFactory aSTFactory2 = this.Hw;
            ASTArray aSTArray2 = new ASTArray(2);
            aSTArray2.j6(Ev(53, "DYNAMIC_MEMBER", tokenDW, DW(1)));
            aSTArray2.j6(ast2);
            AST astWe2 = aSTFactory2.we(aSTArray2);
            aSTPair.j6 = astWe2;
            if (astWe2 != null && astWe2.getFirstChild() != null) {
                astWe2 = astWe2.getFirstChild();
            }
            aSTPair.DW = astWe2;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void rC(int i) throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        m8(i);
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 194) {
            this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
            u7(194);
            Do();
            m8(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0068 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rN() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r4 = this;
            r0 = 0
            r4.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            int r2 = r4.j6(r1)
            r3 = 85
            if (r2 == r3) goto L68
            r3 = 91
            if (r2 == r3) goto L68
            r3 = 96
            if (r2 == r3) goto L5b
            r3 = 99
            if (r2 == r3) goto L68
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 == r3) goto L68
            r3 = 132(0x84, float:1.85E-43)
            if (r2 == r3) goto L68
            r3 = 157(0x9d, float:2.2E-43)
            if (r2 == r3) goto L68
            r3 = 190(0xbe, float:2.66E-43)
            if (r2 == r3) goto L68
            r3 = 193(0xc1, float:2.7E-43)
            if (r2 == r3) goto L68
            r3 = 87
            if (r2 == r3) goto L68
            r3 = 88
            if (r2 == r3) goto L68
            r3 = 148(0x94, float:2.07E-43)
            if (r2 == r3) goto L68
            r3 = 149(0x95, float:2.09E-43)
            if (r2 == r3) goto L68
            switch(r2) {
                case 104: goto L68;
                case 105: goto L68;
                case 106: goto L68;
                case 107: goto L68;
                case 108: goto L68;
                case 109: goto L68;
                case 110: goto L68;
                case 111: goto L68;
                case 112: goto L68;
                default: goto L44;
            }
        L44:
            switch(r2) {
                case 159: goto L68;
                case 160: goto L68;
                case 161: goto L68;
                default: goto L47;
            }
        L47:
            switch(r2) {
                case 195: goto L68;
                case 196: goto L68;
                case 197: goto L68;
                default: goto L4a;
            }
        L4a:
            switch(r2) {
                case 199: goto L68;
                case 200: goto L68;
                case 201: goto L68;
                case 202: goto L68;
                case 203: goto L68;
                case 204: goto L68;
                default: goto L4d;
            }
        L4d:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r4.DW(r1)
            java.lang.String r2 = r4.Zo()
            r0.<init>(r1, r2)
            throw r0
        L5b:
            r4.aM()
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            groovyjarjarantlr.collections.AST r2 = r4.FH
            r1.j6(r0, r2)
            groovyjarjarantlr.collections.AST r0 = r0.j6
            goto L75
        L68:
            r1 = 0
            r4.hz(r1)
            groovyjarjarantlr.ASTFactory r1 = r4.Hw
            groovyjarjarantlr.collections.AST r2 = r4.FH
            r1.j6(r0, r2)
            groovyjarjarantlr.collections.AST r0 = r0.j6
        L75:
            r4.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.rN():void");
    }

    public final void ro() {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        hz(0);
        this.Hw.j6(aSTPair, this.FH);
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(28, "EXPR", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void sE() throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        AST ast = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        if (BT.gn(j6(1)) && Cz.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                jw();
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            wT();
            ast = this.FH;
            this.Hw.j6(aSTPair, ast);
        } else {
            if (j6(1) != 87 || (j6(2) != 136 && j6(2) != 142)) {
                throw new NoViableAltException(DW(1), Zo());
            }
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(87);
        }
        int iJ6 = j6(1);
        if (iJ6 == 136) {
            if (this.j6.DW == 0) {
                Ws("A colon at this point is legal Java but not recommended in Groovy.", "Use the 'in' keyword.");
                Qk(ast != null, "Java-style for-each statement requires a type declaration.", "Use the 'in' keyword, as for (x in y) {...}");
            }
            AST astV5 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV5);
            u7(136);
            if (this.j6.DW == 0) {
                astV5.Mr(59);
            }
            Jl(0);
            this.Hw.j6(aSTPair, this.FH);
        } else {
            if (iJ6 != 142) {
                throw new NoViableAltException(DW(1), Zo());
            }
            AST astV52 = this.Hw.v5(DW(1));
            this.Hw.J8(aSTPair, astV52);
            u7(142);
            if (this.j6.DW == 0) {
                astV52.Mr(59);
            }
            Oo(0);
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024d A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0252 A[FALL_THROUGH, PHI: r0
      0x0252: PHI (r0v1 groovyjarjarantlr.collections.AST) = 
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v6 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
      (r0v0 groovyjarjarantlr.collections.AST)
     binds: [B:89:0x020a, B:114:0x024d, B:94:0x0214, B:95:0x0216, B:98:0x021c, B:105:0x022a, B:107:0x0230, B:108:0x0233, B:111:0x023c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sG() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.sG():void");
    }

    public final void sM(AST ast) throws NoViableAltException, MismatchedTokenException {
        AST astWe;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        AST astV5 = this.Hw.v5(DW(1));
        this.Hw.j6(aSTPair, astV5);
        u7(85);
        P8();
        AST ast2 = this.FH;
        u7(86);
        if (this.j6.DW == 0) {
            if (ast == null || ast.getFirstChild() == null) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(4);
                aSTArray.j6(WB(24, "INDEX_OP", ast, DW(1)));
                aSTArray.j6(astV5);
                aSTArray.j6(ast);
                aSTArray.j6(ast2);
                astWe = aSTFactory.we(aSTArray);
            } else {
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(4);
                aSTArray2.j6(WB(24, "INDEX_OP", ast.getFirstChild(), DW(1)));
                aSTArray2.j6(astV5);
                aSTArray2.j6(ast);
                aSTArray2.j6(ast2);
                astWe = aSTFactory2.we(aSTArray2);
            }
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void sR() throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 != 87) {
            switch (iJ6) {
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                    Sf();
                    this.Hw.j6(aSTPair, this.FH);
                    ast = aSTPair.j6;
                    break;
                default:
                    throw new NoViableAltException(DW(1), Zo());
            }
        } else {
            aj(false);
            this.Hw.j6(aSTPair, this.FH);
            ast = aSTPair.j6;
        }
        this.FH = ast;
    }

    public void setSourceBuffer(SourceBuffer sourceBuffer) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: RecognitionException -> 0x00a6, FALL_THROUGH, TRY_LEAVE, TryCatch #0 {RecognitionException -> 0x00a6, blocks: (B:7:0x0048, B:30:0x0078, B:31:0x007b, B:32:0x007e, B:33:0x0081, B:34:0x0084, B:35:0x0087, B:36:0x008a, B:37:0x008d, B:38:0x009a, B:39:0x009b, B:40:0x009f), top: B:88:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sg() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.sg():void");
    }

    public final void sh() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 85) {
            this.Hw.v5(DW(1));
            u7(85);
            cb();
            this.Hw.v5(DW(1));
            u7(86);
        } else if (iJ6 == 91) {
            this.Hw.v5(DW(1));
            u7(91);
            cb();
            this.Hw.v5(DW(1));
            u7(123);
        } else if (iJ6 == 126) {
            this.Hw.v5(DW(1));
            u7(126);
            cb();
            this.Hw.v5(DW(1));
            u7(127);
        } else {
            if (iJ6 != 197) {
                throw new NoViableAltException(DW(1), Zo());
            }
            this.Hw.v5(DW(1));
            u7(197);
            cb();
            this.Hw.v5(DW(1));
            u7(198);
        }
        this.FH = null;
    }

    public final void sy() throws SemanticException, NoViableAltException, MismatchedTokenException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AST ast;
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        boolean z5 = false;
        if (ye.gn(j6(1)) && WB.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                ko();
                z = true;
            } catch (RecognitionException unused) {
                z = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z = false;
        }
        if (z) {
            fD();
            oY(this.FH);
            ast = this.FH;
            if (this.j6.DW == 0) {
                aSTPair.j6 = ast;
                aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                aSTPair.j6();
                astWe = ast;
            }
        } else {
            if (er.gn(j6(1)) && yS.gn(j6(2))) {
                int iGn2 = gn();
                this.j6.DW++;
                try {
                    fN();
                    z2 = true;
                } catch (RecognitionException unused2) {
                    z2 = false;
                }
                we(iGn2);
                this.j6.DW--;
            } else {
                z2 = false;
            }
            if (z2) {
                pO();
                ast = this.FH;
                if (this.j6.DW == 0) {
                    aSTPair.j6 = ast;
                    aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                    aSTPair.j6();
                    astWe = ast;
                }
            } else {
                if (er.gn(j6(1)) && gW.gn(j6(2))) {
                    int iGn3 = gn();
                    this.j6.DW++;
                    try {
                        cz();
                        z3 = true;
                    } catch (RecognitionException unused3) {
                        z3 = false;
                    }
                    we(iGn3);
                    this.j6.DW--;
                } else {
                    z3 = false;
                }
                if (z3) {
                    mn();
                    ast = this.FH;
                    if (this.j6.DW == 0) {
                        aSTPair.j6 = ast;
                        aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                        aSTPair.j6();
                        astWe = ast;
                    }
                } else {
                    if (BT.gn(j6(1)) && vy.gn(j6(2))) {
                        int iGn4 = gn();
                        this.j6.DW++;
                        try {
                            jw();
                            z4 = true;
                        } catch (RecognitionException unused4) {
                            z4 = false;
                        }
                        we(iGn4);
                        this.j6.DW--;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        mb();
                        ast = this.FH;
                        if (this.j6.DW == 0) {
                            aSTPair.j6 = ast;
                            aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                            aSTPair.j6();
                            astWe = ast;
                        }
                    } else {
                        if (KD.gn(j6(1)) && ro.gn(j6(2))) {
                            int iGn5 = gn();
                            this.j6.DW++;
                            try {
                                yU();
                                z5 = true;
                            } catch (RecognitionException unused5) {
                            }
                            we(iGn5);
                            this.j6.DW--;
                        }
                        if (z5) {
                            fD();
                            kG(this.FH);
                            ast = this.FH;
                            if (this.j6.DW == 0) {
                                aSTPair.j6 = ast;
                                aSTPair.DW = (ast == null || ast.getFirstChild() == null) ? ast : ast.getFirstChild();
                                aSTPair.j6();
                                astWe = ast;
                            }
                        } else if (j6(1) == 83 && (j6(2) == 126 || j6(2) == 205)) {
                            u7(83);
                            Do();
                            Eq();
                            AST ast2 = this.FH;
                            if (this.j6.DW == 0) {
                                ASTFactory aSTFactory = this.Hw;
                                ASTArray aSTArray = new ASTArray(2);
                                aSTArray.j6(Ev(11, "STATIC_INIT", tokenDW, DW(1)));
                                aSTArray.j6(ast2);
                                astWe = aSTFactory.we(aSTArray);
                                aSTPair.j6 = astWe;
                                aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
                                aSTPair.j6();
                            }
                        } else {
                            if (j6(1) != 126) {
                                throw new NoViableAltException(DW(1), Zo());
                            }
                            Eq();
                            AST ast3 = this.FH;
                            if (this.j6.DW == 0) {
                                ASTFactory aSTFactory2 = this.Hw;
                                ASTArray aSTArray2 = new ASTArray(2);
                                aSTArray2.j6(Ev(10, "INSTANCE_INIT", tokenDW, DW(1)));
                                aSTArray2.j6(ast3);
                                astWe = aSTFactory2.we(aSTArray2);
                                aSTPair.j6 = astWe;
                                aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
                                aSTPair.j6();
                            }
                        }
                    }
                }
            }
        }
        this.FH = astWe;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tn() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r7 = this;
            r0 = 0
            r7.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 0
            r2 = 0
        La:
            r3 = 1
            int r4 = r7.j6(r3)
            r5 = 85
            if (r4 != r5) goto L95
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.Of
            r6 = 2
            int r6 = r7.j6(r6)
            boolean r4 = r4.gn(r6)
            if (r4 == 0) goto L95
            groovyjarjarantlr.Token r4 = r7.DW(r3)
            groovyjarjarantlr.ASTFactory r6 = r7.Hw
            groovyjarjarantlr.collections.AST r4 = r6.v5(r4)
            groovyjarjarantlr.ASTFactory r6 = r7.Hw
            r6.J8(r0, r4)
            r7.u7(r5)
            groovyjarjarantlr.ParserSharedInputState r5 = r7.j6
            int r5 = r5.DW
            if (r5 != 0) goto L3d
            r5 = 17
            r4.Mr(r5)
        L3d:
            int r4 = r7.j6(r3)
            r5 = 91
            if (r4 == r5) goto L82
            r5 = 99
            if (r4 == r5) goto L82
            r5 = 126(0x7e, float:1.77E-43)
            if (r4 == r5) goto L82
            r5 = 132(0x84, float:1.85E-43)
            if (r4 == r5) goto L82
            r5 = 157(0x9d, float:2.2E-43)
            if (r4 == r5) goto L82
            r5 = 190(0xbe, float:2.66E-43)
            if (r4 == r5) goto L82
            r5 = 193(0xc1, float:2.7E-43)
            if (r4 == r5) goto L82
            r5 = 148(0x94, float:2.07E-43)
            if (r4 == r5) goto L82
            r5 = 149(0x95, float:2.09E-43)
            if (r4 == r5) goto L82
            switch(r4) {
                case 85: goto L82;
                case 86: goto L8c;
                case 87: goto L82;
                case 88: goto L82;
                default: goto L68;
            }
        L68:
            switch(r4) {
                case 104: goto L82;
                case 105: goto L82;
                case 106: goto L82;
                case 107: goto L82;
                case 108: goto L82;
                case 109: goto L82;
                case 110: goto L82;
                case 111: goto L82;
                case 112: goto L82;
                default: goto L6b;
            }
        L6b:
            switch(r4) {
                case 159: goto L82;
                case 160: goto L82;
                case 161: goto L82;
                default: goto L6e;
            }
        L6e:
            switch(r4) {
                case 195: goto L82;
                case 196: goto L82;
                case 197: goto L82;
                default: goto L71;
            }
        L71:
            switch(r4) {
                case 199: goto L82;
                case 200: goto L82;
                case 201: goto L82;
                case 202: goto L82;
                case 203: goto L82;
                case 204: goto L82;
                default: goto L74;
            }
        L74:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r7.DW(r3)
            java.lang.String r2 = r7.Zo()
            r0.<init>(r1, r2)
            throw r0
        L82:
            r7.Jl(r1)
            groovyjarjarantlr.ASTFactory r3 = r7.Hw
            groovyjarjarantlr.collections.AST r4 = r7.FH
            r3.j6(r0, r4)
        L8c:
            r3 = 86
            r7.u7(r3)
            int r2 = r2 + 1
            goto La
        L95:
            if (r2 < r3) goto L9c
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r7.FH = r0
            return
        L9c:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r7.DW(r3)
            java.lang.String r2 = r7.Zo()
            r0.<init>(r1, r2)
            goto Lab
        Laa:
            throw r0
        Lab:
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.tn():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uF() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r5 = this;
            r0 = 0
            r5.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r1 = 1
            int r2 = r5.j6(r1)
            r3 = 85
            if (r2 == r3) goto La0
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 == r3) goto L93
            r3 = 205(0xcd, float:2.87E-43)
            r4 = 90
            if (r2 == r3) goto L3f
            if (r2 == r4) goto L3f
            r3 = 91
            if (r2 == r3) goto L32
            switch(r2) {
                case 154: goto L3f;
                case 155: goto L3f;
                case 156: goto L3f;
                default: goto L24;
            }
        L24:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            java.lang.String r2 = r5.Zo()
            r0.<init>(r1, r2)
            throw r0
        L32:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r5.u7(r3)
            goto Lac
        L3f:
            r5.Do()
            int r2 = r5.j6(r1)
            if (r2 == r4) goto L86
            switch(r2) {
                case 154: goto L77;
                case 155: goto L68;
                case 156: goto L59;
                default: goto L4b;
            }
        L4b:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            java.lang.String r2 = r5.Zo()
            r0.<init>(r1, r2)
            throw r0
        L59:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r1 = 156(0x9c, float:2.19E-43)
            r5.u7(r1)
            goto Lac
        L68:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r1 = 155(0x9b, float:2.17E-43)
            r5.u7(r1)
            goto Lac
        L77:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r1 = 154(0x9a, float:2.16E-43)
            r5.u7(r1)
            goto Lac
        L86:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r5.u7(r4)
            goto Lac
        L93:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r5.u7(r3)
            goto Lac
        La0:
            groovyjarjarantlr.ASTFactory r2 = r5.Hw
            groovyjarjarantlr.Token r1 = r5.DW(r1)
            r2.v5(r1)
            r5.u7(r3)
        Lac:
            r5.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.uF():void");
    }

    public final void un() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        AST astV5 = this.Hw.v5(DW(1));
        this.Hw.j6(aSTPair, astV5);
        u7(197);
        if (this.j6.DW == 0) {
            astV5.Mr(88);
        }
        xt();
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 49) {
            AST astV52 = this.Hw.v5(DW(1));
            this.Hw.j6(aSTPair, astV52);
            u7(49);
            if (this.j6.DW == 0) {
                astV52.Mr(88);
            }
            xt();
            this.Hw.j6(aSTPair, this.FH);
        }
        AST astV53 = this.Hw.v5(DW(1));
        this.Hw.j6(aSTPair, astV53);
        u7(198);
        if (this.j6.DW == 0) {
            AST ast = aSTPair.j6;
            astV53.Mr(88);
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(48, "STRING_CONSTRUCTOR", tokenDW, DW(1)));
            aSTArray.j6(ast);
            AST astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void vJ(boolean z) throws NoViableAltException, MismatchedTokenException {
        boolean z2;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        Sf();
        AST ast = this.FH;
        if (OW.gn(j6(1)) && QX.gn(j6(2))) {
            int iGn = gn();
            this.j6.DW++;
            try {
                u7(85);
                z2 = true;
            } catch (RecognitionException unused) {
                z2 = false;
            }
            we(iGn);
            this.j6.DW--;
        } else {
            z2 = false;
        }
        if (z2) {
            fY(ast);
            this.Hw.j6(aSTPair, this.FH);
        } else {
            if (!OW.gn(j6(1)) || !QX.gn(j6(2))) {
                throw new NoViableAltException(DW(1), Zo());
            }
            if (this.j6.DW == 0) {
                Qk(false, "primitive type parameters not allowed here", "use the corresponding wrapper type, such as Integer for int");
            }
        }
        if (this.j6.DW == 0) {
            AST firstChild = aSTPair.j6;
            if (z) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(2);
                aSTArray.j6(Ev(12, "TYPE", tokenDW, DW(1)));
                aSTArray.j6(firstChild);
                firstChild = aSTFactory.we(aSTArray);
            }
            aSTPair.j6 = firstChild;
            if (firstChild != null && firstChild.getFirstChild() != null) {
                firstChild = firstChild.getFirstChild();
            }
            aSTPair.DW = firstChild;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void vy(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST astWe;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        br();
        AST ast2 = this.FH;
        if (this.j6.DW == 0) {
            if (ast == null || ast.getType() != 27) {
                ASTFactory aSTFactory = this.Hw;
                ASTArray aSTArray = new ASTArray(3);
                aSTArray.j6(WB(27, "{", ast, DW(1)));
                aSTArray.j6(ast);
                aSTArray.j6(ast2);
                astWe = aSTFactory.we(aSTArray);
            } else {
                ASTFactory aSTFactory2 = this.Hw;
                ASTArray aSTArray2 = new ASTArray(3);
                aSTArray2.j6(WB(27, "(", ast, DW(1)));
                aSTArray2.j6(ast.getFirstChild());
                aSTArray2.j6(ast2);
                astWe = aSTFactory2.we(aSTArray2);
            }
            aSTPair.j6 = astWe;
            if (astWe != null && astWe.getFirstChild() != null) {
                astWe = astWe.getFirstChild();
            }
            aSTPair.DW = astWe;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    public final void w2(int i) throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
        u7(91);
        Do();
        Za(null, null, tokenOW);
        this.Hw.j6(aSTPair, this.FH);
        u7(123);
        this.Hw.J8(aSTPair, this.Hw.v5(DW(1)));
        u7(124);
        Do();
        KD(i);
        this.Hw.j6(aSTPair, this.FH);
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w9() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.w9():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wT() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r9 = this;
            r0 = 0
            r9.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r2 = 1
            int r3 = r9.j6(r2)
            r4 = 38
            r5 = 0
            r6 = 87
            if (r3 == r4) goto L65
            r4 = 39
            if (r3 == r4) goto L65
            r4 = 43
            if (r3 == r4) goto L65
            if (r3 == r6) goto L3e
            r4 = 96
            if (r3 == r4) goto L65
            r4 = 83
            if (r3 == r4) goto L65
            r4 = 84
            if (r3 == r4) goto L65
            switch(r3) {
                case 104: goto L3e;
                case 105: goto L3e;
                case 106: goto L3e;
                case 107: goto L3e;
                case 108: goto L3e;
                case 109: goto L3e;
                case 110: goto L3e;
                case 111: goto L3e;
                case 112: goto L3e;
                default: goto L2d;
            }
        L2d:
            switch(r3) {
                case 115: goto L65;
                case 116: goto L65;
                case 117: goto L65;
                case 118: goto L65;
                case 119: goto L65;
                case 120: goto L65;
                case 121: goto L65;
                case 122: goto L65;
                default: goto L30;
            }
        L30:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r9.DW(r2)
            java.lang.String r2 = r9.Zo()
            r0.<init>(r1, r2)
            throw r0
        L3e:
            r9.np(r5)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            r9.UI(r0, r2)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            groovyjarjarantlr.ParserSharedInputState r3 = r9.j6
            int r3 = r3.DW
            if (r3 != 0) goto Lbd
            r1.j6 = r2
            if (r2 == 0) goto L5d
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            if (r0 == 0) goto L5d
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            goto L5e
        L5d:
            r0 = r2
        L5e:
            r1.DW = r0
            r1.j6()
        L63:
            r0 = r2
            goto Lbd
        L65:
            r9.lj()
            groovyjarjarantlr.collections.AST r3 = r9.FH
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.sh
            int r7 = r9.j6(r2)
            boolean r4 = r4.gn(r7)
            r7 = 2
            if (r4 == 0) goto L89
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.g3
            int r8 = r9.j6(r7)
            boolean r4 = r4.gn(r8)
            if (r4 == 0) goto L89
            r9.np(r5)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            goto L9c
        L89:
            int r4 = r9.j6(r2)
            if (r4 != r6) goto Lc0
            groovyjarjarantlr.collections.impl.BitSet r4 = org.codehaus.groovy.antlr.parser.GroovyRecognizer.Mz
            int r5 = r9.j6(r7)
            boolean r4 = r4.gn(r5)
            if (r4 == 0) goto Lc0
            r2 = r0
        L9c:
            r9.UI(r3, r2)
            groovyjarjarantlr.collections.AST r2 = r9.FH
            groovyjarjarantlr.ParserSharedInputState r3 = r9.j6
            int r3 = r3.DW
            if (r3 != 0) goto Lbd
            r1.j6 = r2
            if (r2 == 0) goto Lb6
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            if (r0 == 0) goto Lb6
            groovyjarjarantlr.collections.AST r0 = r2.getFirstChild()
            goto Lb7
        Lb6:
            r0 = r2
        Lb7:
            r1.DW = r0
            r1.j6()
            goto L63
        Lbd:
            r9.FH = r0
            return
        Lc0:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r9.DW(r2)
            java.lang.String r2 = r9.Zo()
            r0.<init>(r1, r2)
            goto Lcf
        Lce:
            throw r0
        Lcf:
            goto Lce
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.wT():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wa() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.wa():void");
    }

    public final void wc(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenDW = DW(1);
        jJ();
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 101 && BR.gn(j6(2))) {
            u7(101);
            Do();
            jJ();
            this.Hw.j6(aSTPair, this.FH);
        }
        if (this.j6.DW == 0) {
            AST ast2 = aSTPair.j6;
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(2);
            aSTArray.j6(Ev(33, "ELIST", tokenDW, DW(1)));
            aSTArray.j6(ast2);
            AST astWe = aSTFactory.we(aSTArray);
            ASTFactory aSTFactory2 = this.Hw;
            ASTArray aSTArray2 = new ASTArray(3);
            aSTArray2.j6(Ev(27, "<command>", tokenDW, DW(1)));
            aSTArray2.j6(ast);
            aSTArray2.j6(astWe);
            AST astWe2 = aSTFactory2.we(aSTArray2);
            aSTPair.j6 = astWe2;
            if (astWe2 != null && astWe2.getFirstChild() != null) {
                astWe2 = astWe2.getFirstChild();
            }
            aSTPair.DW = astWe2;
            aSTPair.j6();
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[PHI: r3
      0x0051: PHI (r3v9 groovyjarjarantlr.collections.AST) = (r3v7 groovyjarjarantlr.collections.AST), (r3v10 groovyjarjarantlr.collections.AST) binds: [B:33:0x00a1, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wu(int r9, groovyjarjarantlr.collections.AST r10) throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.wu(int, groovyjarjarantlr.collections.AST):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x9() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r12 = this;
            r0 = 0
            r12.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r12.DW(r1)
            r3 = 126(0x7e, float:1.77E-43)
            r12.u7(r3)
            int r3 = r12.j6(r1)
            r4 = 84
            r5 = 83
            r6 = 87
            r7 = 43
            r8 = 39
            r9 = 38
            r10 = 205(0xcd, float:2.87E-43)
            if (r3 == r9) goto L4c
            if (r3 == r8) goto L4c
            if (r3 == r7) goto L4c
            if (r3 == r6) goto L4c
            if (r3 == r10) goto L56
            if (r3 == r5) goto L4c
            if (r3 == r4) goto L4c
            switch(r3) {
                case 92: goto L4c;
                case 93: goto L4c;
                case 94: goto L4c;
                case 95: goto L4c;
                case 96: goto L4c;
                default: goto L35;
            }
        L35:
            switch(r3) {
                case 104: goto L4c;
                case 105: goto L4c;
                case 106: goto L4c;
                case 107: goto L4c;
                case 108: goto L4c;
                case 109: goto L4c;
                case 110: goto L4c;
                case 111: goto L4c;
                case 112: goto L4c;
                default: goto L38;
            }
        L38:
            switch(r3) {
                case 115: goto L4c;
                case 116: goto L4c;
                case 117: goto L4c;
                case 118: goto L4c;
                case 119: goto L4c;
                case 120: goto L4c;
                case 121: goto L4c;
                case 122: goto L4c;
                default: goto L3b;
            }
        L3b:
            switch(r3) {
                case 126: goto L4c;
                case 127: goto L56;
                case 128: goto L56;
                default: goto L3e;
            }
        L3e:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r12.DW(r1)
            java.lang.String r2 = r12.Zo()
            r0.<init>(r1, r2)
            throw r0
        L4c:
            r12.sy()
            groovyjarjarantlr.ASTFactory r3 = r12.Hw
            groovyjarjarantlr.collections.AST r11 = r12.FH
            r3.j6(r0, r11)
        L56:
            int r3 = r12.j6(r1)
            r11 = 128(0x80, float:1.8E-43)
            if (r3 == r11) goto La7
            int r3 = r12.j6(r1)
            if (r3 != r10) goto L65
            goto La7
        L65:
            r3 = 127(0x7f, float:1.78E-43)
            r12.u7(r3)
            groovyjarjarantlr.ParserSharedInputState r3 = r12.j6
            int r3 = r3.DW
            if (r3 != 0) goto La2
            groovyjarjarantlr.collections.AST r3 = r0.j6
            groovyjarjarantlr.ASTFactory r4 = r12.Hw
            groovyjarjarantlr.collections.impl.ASTArray r5 = new groovyjarjarantlr.collections.impl.ASTArray
            r6 = 2
            r5.<init>(r6)
            r6 = 6
            groovyjarjarantlr.Token r1 = r12.DW(r1)
            java.lang.String r7 = "OBJBLOCK"
            groovyjarjarantlr.collections.AST r1 = r12.Ev(r6, r7, r2, r1)
            r5.j6(r1)
            r5.j6(r3)
            groovyjarjarantlr.collections.AST r1 = r4.we(r5)
            r0.j6 = r1
            if (r1 == 0) goto L9d
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto L9d
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        L9d:
            r0.DW = r1
            r0.j6()
        La2:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r12.FH = r0
            return
        La7:
            r12.be()
            int r3 = r12.j6(r1)
            if (r3 == r9) goto Ld6
            if (r3 == r8) goto Ld6
            if (r3 == r7) goto Ld6
            if (r3 == r6) goto Ld6
            if (r3 == r10) goto L56
            if (r3 == r5) goto Ld6
            if (r3 == r4) goto Ld6
            switch(r3) {
                case 92: goto Ld6;
                case 93: goto Ld6;
                case 94: goto Ld6;
                case 95: goto Ld6;
                case 96: goto Ld6;
                default: goto Lbf;
            }
        Lbf:
            switch(r3) {
                case 104: goto Ld6;
                case 105: goto Ld6;
                case 106: goto Ld6;
                case 107: goto Ld6;
                case 108: goto Ld6;
                case 109: goto Ld6;
                case 110: goto Ld6;
                case 111: goto Ld6;
                case 112: goto Ld6;
                default: goto Lc2;
            }
        Lc2:
            switch(r3) {
                case 115: goto Ld6;
                case 116: goto Ld6;
                case 117: goto Ld6;
                case 118: goto Ld6;
                case 119: goto Ld6;
                case 120: goto Ld6;
                case 121: goto Ld6;
                case 122: goto Ld6;
                default: goto Lc5;
            }
        Lc5:
            switch(r3) {
                case 126: goto Ld6;
                case 127: goto L56;
                case 128: goto L56;
                default: goto Lc8;
            }
        Lc8:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r12.DW(r1)
            java.lang.String r2 = r12.Zo()
            r0.<init>(r1, r2)
            throw r0
        Ld6:
            r12.sy()
            groovyjarjarantlr.ASTFactory r3 = r12.Hw
            groovyjarjarantlr.collections.AST r11 = r12.FH
            r3.j6(r0, r11)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.x9():void");
    }

    public final void xt() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        int iJ6 = j6(1);
        if (iJ6 == 87) {
            Cz();
            this.Hw.j6(aSTPair, this.FH);
        } else if (iJ6 == 99) {
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(99);
        } else if (iJ6 == 126) {
            dP();
            this.Hw.j6(aSTPair, this.FH);
        } else {
            if (iJ6 != 132) {
                throw new NoViableAltException(DW(1), Zo());
            }
            this.Hw.j6(aSTPair, this.Hw.v5(DW(1)));
            u7(132);
        }
        this.FH = aSTPair.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yF() throws groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r8 = this;
            r0 = 0
            r8.FH = r0
            groovyjarjarantlr.ASTPair r0 = new groovyjarjarantlr.ASTPair
            r0.<init>()
            r1 = 1
            groovyjarjarantlr.Token r2 = r8.DW(r1)
            int r3 = r8.j6(r1)
            r4 = 98
            if (r3 == r4) goto L2b
            r4 = 99
            if (r3 != r4) goto L1d
            r8.u7(r4)
            goto L36
        L1d:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r2 = r8.Zo()
            r0.<init>(r1, r2)
            throw r0
        L2b:
            r8.u7(r4)
            groovyjarjarantlr.ParserSharedInputState r3 = r8.j6
            int r3 = r3.DW
            if (r3 != 0) goto L36
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            r8.Do()
            r8.aj(r1)
            groovyjarjarantlr.ASTFactory r4 = r8.Hw
            groovyjarjarantlr.collections.AST r5 = r8.FH
            r4.j6(r0, r5)
            r8.Do()
            groovyjarjarantlr.ParserSharedInputState r4 = r8.j6
            int r4 = r4.DW
            if (r4 != 0) goto La0
            groovyjarjarantlr.collections.AST r4 = r0.j6
            r5 = 2
            if (r3 == 0) goto L70
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.impl.ASTArray r6 = new groovyjarjarantlr.collections.impl.ASTArray
            r6.<init>(r5)
            r5 = 75
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r7 = "TYPE_UPPER_BOUNDS"
            groovyjarjarantlr.collections.AST r1 = r8.Ev(r5, r7, r2, r1)
            r6.j6(r1)
            r6.j6(r4)
            groovyjarjarantlr.collections.AST r1 = r3.we(r6)
            goto L8d
        L70:
            groovyjarjarantlr.ASTFactory r3 = r8.Hw
            groovyjarjarantlr.collections.impl.ASTArray r6 = new groovyjarjarantlr.collections.impl.ASTArray
            r6.<init>(r5)
            r5 = 76
            groovyjarjarantlr.Token r1 = r8.DW(r1)
            java.lang.String r7 = "TYPE_LOWER_BOUNDS"
            groovyjarjarantlr.collections.AST r1 = r8.Ev(r5, r7, r2, r1)
            r6.j6(r1)
            r6.j6(r4)
            groovyjarjarantlr.collections.AST r1 = r3.we(r6)
        L8d:
            r0.j6 = r1
            if (r1 == 0) goto L9b
            groovyjarjarantlr.collections.AST r2 = r1.getFirstChild()
            if (r2 == 0) goto L9b
            groovyjarjarantlr.collections.AST r1 = r1.getFirstChild()
        L9b:
            r0.DW = r1
            r0.j6()
        La0:
            groovyjarjarantlr.collections.AST r0 = r0.j6
            r8.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.yF():void");
    }

    public final void yO() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        Do();
        ik();
        Do();
        this.Hw.v5(DW(1));
        u7(135);
        this.FH = null;
    }

    public final void yS() throws SemanticException, NoViableAltException, MismatchedTokenException {
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        er();
        this.Hw.j6(aSTPair, this.FH);
        while (j6(1) == 101) {
            u7(101);
            Do();
            er();
            this.Hw.j6(aSTPair, this.FH);
        }
        this.FH = aSTPair.j6;
    }

    public final void yU() throws NoViableAltException, MismatchedTokenException {
        this.FH = null;
        new ASTPair();
        fD();
        switch (j6(1)) {
            case 92:
                u7(92);
                break;
            case 93:
                u7(93);
                break;
            case 94:
                u7(94);
                break;
            case 95:
                u7(95);
                break;
            case 96:
                this.Hw.v5(DW(1));
                u7(96);
                u7(93);
                break;
            default:
                throw new NoViableAltException(DW(1), Zo());
        }
        this.FH = null;
    }

    public AST ye(int i, String str, AST ast) {
        AST astHw = this.Hw.Hw(i, str);
        if (astHw != null && ast != null) {
            astHw.aM(ast);
            astHw.a8(i, str);
        }
        return astHw;
    }

    public final void ys(AST ast) throws SemanticException, NoViableAltException, MismatchedTokenException {
        AST ast2;
        AST astWe = null;
        this.FH = null;
        ASTPair aSTPair = new ASTPair();
        Token tokenOW = OW(DW(1));
        if (ast != null) {
            tokenOW.gn(ast.getLine());
            tokenOW.VH(ast.Zo());
        }
        u7(93);
        AST astV5 = this.Hw.v5(DW(1));
        u7(87);
        Do();
        int iJ6 = j6(1);
        if (iJ6 == 89) {
            Y9();
            ast2 = this.FH;
            Do();
        } else {
            if (iJ6 != 98 && iJ6 != 126) {
                throw new NoViableAltException(DW(1), Zo());
            }
            ast2 = null;
        }
        IS();
        AST ast3 = this.FH;
        a5();
        AST ast4 = this.FH;
        if (this.j6.DW == 0) {
            ASTFactory aSTFactory = this.Hw;
            ASTArray aSTArray = new ASTArray(6);
            aSTArray.j6(Ev(14, "INTERFACE_DEF", tokenOW, DW(1)));
            aSTArray.j6(ast);
            aSTArray.j6(astV5);
            aSTArray.j6(ast2);
            aSTArray.j6(ast3);
            aSTArray.j6(ast4);
            astWe = aSTFactory.we(aSTArray);
            aSTPair.j6 = astWe;
            aSTPair.DW = (astWe == null || astWe.getFirstChild() == null) ? astWe : astWe.getFirstChild();
            aSTPair.j6();
        }
        this.FH = astWe;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zh() throws groovyjarjarantlr.SemanticException, groovyjarjarantlr.NoViableAltException, groovyjarjarantlr.MismatchedTokenException {
        /*
            r11 = this;
            r0 = 0
            r11.FH = r0
            groovyjarjarantlr.ASTPair r1 = new groovyjarjarantlr.ASTPair
            r1.<init>()
            r2 = 1
            groovyjarjarantlr.Token r3 = r11.DW(r2)
            r11.BT()
            groovyjarjarantlr.collections.AST r4 = r11.FH
            groovyjarjarantlr.Token r5 = r11.DW(r2)
            groovyjarjarantlr.ASTFactory r6 = r11.Hw
            groovyjarjarantlr.collections.AST r5 = r6.v5(r5)
            r6 = 87
            r11.u7(r6)
            int r6 = r11.j6(r2)
            r7 = 205(0xcd, float:2.87E-43)
            r8 = 101(0x65, float:1.42E-43)
            r9 = 91
            if (r6 == r9) goto L44
            if (r6 == r8) goto L42
            if (r6 == r7) goto L42
            switch(r6) {
                case 126: goto L42;
                case 127: goto L42;
                case 128: goto L42;
                default: goto L34;
            }
        L34:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r11.DW(r2)
            java.lang.String r2 = r11.Zo()
            r0.<init>(r1, r2)
            throw r0
        L42:
            r6 = r0
            goto L51
        L44:
            r11.u7(r9)
            r11.P8()
            groovyjarjarantlr.collections.AST r6 = r11.FH
            r9 = 123(0x7b, float:1.72E-43)
            r11.u7(r9)
        L51:
            int r9 = r11.j6(r2)
            if (r9 == r8) goto L70
            if (r9 == r7) goto L70
            switch(r9) {
                case 126: goto L6a;
                case 127: goto L70;
                case 128: goto L70;
                default: goto L5c;
            }
        L5c:
            groovyjarjarantlr.NoViableAltException r0 = new groovyjarjarantlr.NoViableAltException
            groovyjarjarantlr.Token r1 = r11.DW(r2)
            java.lang.String r2 = r11.Zo()
            r0.<init>(r1, r2)
            throw r0
        L6a:
            r11.AL()
            groovyjarjarantlr.collections.AST r7 = r11.FH
            goto L71
        L70:
            r7 = r0
        L71:
            groovyjarjarantlr.ParserSharedInputState r8 = r11.j6
            int r8 = r8.DW
            if (r8 != 0) goto Lb3
            groovyjarjarantlr.ASTFactory r0 = r11.Hw
            groovyjarjarantlr.collections.impl.ASTArray r8 = new groovyjarjarantlr.collections.impl.ASTArray
            r9 = 5
            r8.<init>(r9)
            r9 = 62
            groovyjarjarantlr.Token r2 = r11.DW(r2)
            java.lang.String r10 = "ENUM_CONSTANT_DEF"
            groovyjarjarantlr.collections.AST r2 = r11.Ev(r9, r10, r3, r2)
            r8.j6(r2)
            r8.j6(r4)
            r8.j6(r5)
            r8.j6(r6)
            r8.j6(r7)
            groovyjarjarantlr.collections.AST r0 = r0.we(r8)
            r1.j6 = r0
            if (r0 == 0) goto Lad
            groovyjarjarantlr.collections.AST r2 = r0.getFirstChild()
            if (r2 == 0) goto Lad
            groovyjarjarantlr.collections.AST r2 = r0.getFirstChild()
            goto Lae
        Lad:
            r2 = r0
        Lae:
            r1.DW = r2
            r1.j6()
        Lb3:
            r11.FH = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.codehaus.groovy.antlr.parser.GroovyRecognizer.zh():void");
    }

    public GroovyRecognizer(TokenStream tokenStream) {
        this(tokenStream, 2);
    }
}
