package abcd;

import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.xml.XmlSyntax;
import com.aide.uidesigner.ProxyTextView;
import java.io.Reader;

@cy(clazz = 8418899895922204845L, container = 8418899895922204845L, user = true)
/* loaded from: classes.dex */
public class u7 {

    @gy
    private static /* synthetic */ boolean Mr;

    @fy
    private static /* synthetic */ boolean j3;

    @dy(field = 1571643321846463593L)
    private final int DW;

    @dy(field = -4846887365181061675L)
    private a EQ;

    @dy(field = -1849829459129416684L)
    private final int FH;

    @dy(field = -6252487207442271400L)
    private final SetOfInt Hw;

    @dy(field = 2247433047709683444L)
    private SyntaxTreeStyles J0;

    @dy(field = -300758109685059624L)
    private int J8;

    @dy(field = 2911025415609181605L)
    private int QX;

    @dy(field = -710345175178272984L)
    private final int VH;

    @dy(field = 2878394939659701721L)
    private int Ws;

    @dy(field = 1060054462740443400L)
    private int XL;

    @dy(field = 1305817826145397981L)
    private final int Zo;

    @dy(field = 1059508045725712875L)
    private int aM;

    @dy(field = -3189672023999135465L)
    private final int gn;

    @dy(field = -605836676627766555L)
    private final Model j6;

    @dy(field = 4513757746564893867L)
    private a tp;

    @dy(field = 3798262822425677067L)
    private final int u7;

    @dy(field = 690773223568391805L)
    private final SetOfInt v5;

    @dy(field = 686183526679702656L)
    private SyntaxTree we;

    @cy(clazz = 1678104539771105883L, container = 1678104539771105883L, user = true)
    private class a extends m4 {

        @fy
        private static /* synthetic */ boolean gn;

        @gy
        private static /* synthetic */ boolean u7;

        @dy(field = -205008454161611688L)
        @hy
        final /* synthetic */ u7 VH;

        static {
            iy.Zo(a.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @ey(method = 195223055223556800L)
        public a(u7 u7Var, Model model) {
            super(model);
            try {
                if (gn) {
                    iy.EQ(-700758593420853845L, null, u7Var, model);
                }
                this.VH = u7Var;
            } catch (Throwable th) {
                if (u7) {
                    iy.Mr(th, -700758593420853845L, null, u7Var, model);
                }
                throw th;
            }
        }

        @ey(method = -2407261037107001289L)
        public void aM(int i) {
            try {
                if (gn) {
                    iy.u7(786209216666555200L, this, i);
                }
                gn(this.VH.we.getStartLine(i), this.VH.we.getStartColumn(i));
            } catch (Throwable th) {
                if (u7) {
                    iy.j3(th, 786209216666555200L, this, new Integer(i));
                }
                throw th;
            }
        }

        @Override // abcd.m4
        @ey(method = 7767684443635707520L)
        public void gn(int i, int i2) {
            try {
                if (gn) {
                    iy.EQ(2276867497085088777L, this, new Integer(i), new Integer(i2));
                }
                j6(' ');
                super.gn(i, i2);
            } catch (Throwable th) {
                if (u7) {
                    iy.Mr(th, 2276867497085088777L, this, new Integer(i), new Integer(i2));
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(u7.class);
    }

    @ey(method = 351072448255820824L)
    public u7(Model model) {
        try {
            if (j3) {
                iy.tp(2443532447484760016L, null, model);
            }
            this.j6 = model;
            this.tp = new a(this, model);
            this.EQ = new a(this, model);
            this.DW = model.identifierSpace.get("RUNAT");
            this.FH = model.identifierSpace.get("SERVER");
            this.Zo = model.identifierSpace.get("SRC");
            this.VH = model.identifierSpace.get("SCRIPT");
            this.gn = model.identifierSpace.get("TYPE");
            this.u7 = model.identifierSpace.get("LANGUAGE");
            SetOfInt setOfInt = new SetOfInt();
            this.v5 = setOfInt;
            setOfInt.put(model.identifierSpace.QX(model.identifierSpace.get("onclientclick")));
            SetOfInt setOfInt2 = new SetOfInt();
            this.Hw = setOfInt2;
            setOfInt2.put(model.identifierSpace.QX(model.identifierSpace.get("onabort")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onblur")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onchange")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onclick")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("ondblclick")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onerror")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onfocus")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onkeydown")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onkeypress")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onkeyup")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onload")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onmousedown")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onmousemove")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onmouseout")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onmouseover")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onmouseup")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onreset")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onselect")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onsubmit")));
            this.Hw.put(model.identifierSpace.QX(model.identifierSpace.get("onunload")));
            this.J8 = model.identifierSpace.QX(model.identifierSpace.get("amp"));
            this.Ws = model.identifierSpace.QX(model.identifierSpace.get("apos"));
            this.QX = model.identifierSpace.QX(model.identifierSpace.get("quot"));
            this.XL = model.identifierSpace.QX(model.identifierSpace.get("lt"));
            this.aM = model.identifierSpace.QX(model.identifierSpace.get("gt"));
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 2443532447484760016L, null, model);
            }
            throw th;
        }
    }

    @ey(method = -1627691889289270420L)
    private boolean DW(String str, char[] cArr, int i, int i2) {
        try {
            if (j3) {
                iy.J0(1672158781486295648L, this, str, cArr, new Integer(i), new Integer(i2));
            }
            if (str.length() != i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                if (str.charAt(i3) != Character.toUpperCase(cArr[i + i3])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Mr) {
                iy.a8(th, 1672158781486295648L, this, str, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -6945427565123513151L)
    private void FH(int i) {
        try {
            if (j3) {
                iy.u7(6350250003306377871L, this, i);
            }
            this.EQ.u7();
            int childNode = this.we.getChildNode(i, this.we.getChildCount(i) - 1);
            int childNode2 = this.we.getChildNode(childNode, 0);
            int syntaxTag = this.we.getSyntaxTag(childNode2);
            if (syntaxTag != 16 && syntaxTag != 17) {
                if (syntaxTag == 26 || syntaxTag == 50) {
                    this.EQ.Zo(this.we.getIdentifier(childNode2));
                    return;
                }
                return;
            }
            for (int i2 = 1; i2 < this.we.getChildCount(childNode) - 1; i2++) {
                int childNode3 = this.we.getChildNode(childNode, i2);
                if (this.we.getSyntaxTag(childNode3) == 18) {
                    this.EQ.v5(this.we.getLiteralChars(childNode3), this.we.getLiteralOff(childNode3), this.we.getLiteralLen(childNode3));
                }
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 6350250003306377871L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6829137644255532375L)
    private boolean VH(int i) {
        int iWc;
        try {
            if (j3) {
                iy.u7(-5752117959810547003L, this, i);
            }
            if (v5(i)) {
                return false;
            }
            int childNode = this.we.getChildNode(i, 0);
            for (int i2 = 0; i2 < this.we.getChildCount(childNode); i2++) {
                int childNode2 = this.we.getChildNode(childNode, i2);
                if (this.we.getSyntaxTag(childNode2) == 203 && ((iWc = XmlSyntax.wc(this.we, childNode2)) == this.gn || iWc == this.u7)) {
                    FH(childNode2);
                    this.EQ.XL();
                    if (this.EQ.Ws("JAVASCRIPT") == -1) {
                        if (this.EQ.Ws("JSCRIPT") == -1) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -5752117959810547003L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2309602256825047424L)
    private boolean Zo(int i) {
        try {
            if (j3) {
                iy.u7(-5160248515142569492L, this, i);
            }
            for (int i2 = 0; i2 < this.we.getChildCount(i); i2++) {
                int childNode = this.we.getChildNode(i, i2);
                if (this.we.getSyntaxTag(childNode) == 203 && gn(childNode)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -5160248515142569492L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1684419406789324185L)
    private boolean gn(int i) {
        try {
            if (j3) {
                iy.u7(885093860892559929L, this, i);
            }
            if (XmlSyntax.wc(this.we, i) == this.DW) {
                int childNode = this.we.getChildNode(i, this.we.getChildCount(i) - 1);
                int childNode2 = this.we.getChildNode(childNode, 0);
                int syntaxTag = this.we.getSyntaxTag(childNode2);
                if (syntaxTag != 16 && syntaxTag != 17) {
                    return (syntaxTag == 26 || syntaxTag == 50) && this.j6.identifierSpace.QX(this.we.getIdentifier(childNode2)) == this.FH;
                }
                int childNode3 = this.we.getChildNode(childNode, 1);
                if (this.we.getSyntaxTag(childNode3) == 18 && this.we.getChildCount(childNode) == 3) {
                    return DW("SERVER", this.we.getLiteralChars(childNode3), this.we.getLiteralOff(childNode3), this.we.getLiteralLen(childNode3));
                }
            }
            return false;
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 885093860892559929L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2032841247737443133L)
    private void tp(int i) {
        boolean z;
        int i2;
        int i3;
        try {
            if (j3) {
                iy.u7(-1786827088088071801L, this, i);
            }
            if (this.we.isSyntheticNode(i)) {
                return;
            }
            int syntaxTag = this.we.getSyntaxTag(i);
            char c = '<';
            int i4 = 1;
            if (syntaxTag == 203) {
                int iWc = XmlSyntax.wc(this.we, i);
                if ((!this.Hw.contains(iWc) || v5(this.we.getParentNode(this.we.getParentNode(i)))) && !(this.v5.contains(iWc) && v5(this.we.getParentNode(this.we.getParentNode(i))))) {
                    return;
                }
                int childNode = this.we.getChildNode(i, this.we.getChildCount(i) - 1);
                if (this.J0 != null) {
                    this.J0.j6(46, 0, this.we.getStartLine(childNode), this.we.getStartColumn(childNode), this.we.getEndLine(childNode), this.we.getEndColumn(childNode));
                }
                int childCount = this.we.getChildCount(childNode);
                if (childCount == 1) {
                    int childNode2 = this.we.getChildNode(childNode, 0);
                    this.tp.aM(childNode2);
                    this.tp.Zo(this.we.getIdentifier(childNode2));
                } else {
                    for (int i5 = 1; i5 < childCount - 1; i5++) {
                        int childNode3 = this.we.getChildNode(childNode, i5);
                        int syntaxTag2 = this.we.getSyntaxTag(childNode3);
                        if (syntaxTag2 != 205) {
                            switch (syntaxTag2) {
                                case 16:
                                    this.tp.aM(childNode3);
                                    this.tp.Hw("'");
                                    break;
                                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                                    this.tp.aM(childNode3);
                                    this.tp.j6('\"');
                                    break;
                                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                                    this.tp.aM(childNode3);
                                    this.tp.v5(this.we.getLiteralChars(childNode3), this.we.getLiteralOff(childNode3), this.we.getLiteralLen(childNode3));
                                    break;
                            }
                        } else {
                            this.tp.aM(childNode3);
                            int iQX = this.j6.identifierSpace.QX(this.we.getIdentifier(this.we.getChildNode(childNode3, 1)));
                            if (iQX == this.XL) {
                                this.tp.j6('<');
                            } else if (iQX == this.aM) {
                                this.tp.j6('>');
                            } else if (iQX == this.QX) {
                                this.tp.j6('\"');
                            } else if (iQX == this.Ws) {
                                this.tp.Hw("'");
                            } else if (iQX == this.J8) {
                                this.tp.j6('&');
                            }
                        }
                    }
                }
                this.tp.VH();
                this.tp.j6('\n');
                this.tp.j6(';');
                return;
            }
            if (syntaxTag != 210) {
                int childCount2 = this.we.getChildCount(i);
                for (int i6 = 0; i6 < childCount2; i6++) {
                    tp(this.we.getChildNode(i, i6));
                }
                return;
            }
            int childNode4 = this.we.getChildNode(i, 0);
            if (this.j6.identifierSpace.QX(this.we.getIdentifier(this.we.getChildNode(this.we.getChildNode(childNode4, 1), 2))) != this.VH || !VH(i)) {
                int childCount3 = this.we.getChildCount(i);
                for (int i7 = 0; i7 < childCount3; i7++) {
                    tp(this.we.getChildNode(i, i7));
                }
                return;
            }
            for (int i8 = 0; i8 < this.we.getChildCount(childNode4); i8++) {
                int childNode5 = this.we.getChildNode(childNode4, i8);
                if (this.j6.identifierSpace.QX(this.we.getIdentifier(this.we.getChildNode(childNode5, 0))) == this.Zo) {
                    int childNode6 = this.we.getChildNode(childNode5, this.we.getChildCount(childNode5) - 1);
                    if (this.we.getChildCount(childNode6) == 3) {
                        int childNode7 = this.we.getChildNode(childNode6, 0);
                        int childNode8 = this.we.getChildNode(childNode6, 1);
                        int syntaxTag3 = this.we.getSyntaxTag(childNode7);
                        if (syntaxTag3 != 16) {
                            if (syntaxTag3 == 17 && this.we.getSyntaxTag(childNode8) == 18) {
                                this.tp.VH();
                                this.tp.Hw(":\"");
                                this.tp.Hw(this.we.getLiteralString(childNode8));
                                this.tp.Hw("\"");
                            }
                        } else if (this.we.getSyntaxTag(childNode8) == 18) {
                            this.tp.VH();
                            this.tp.Hw(":'");
                            this.tp.Hw(this.we.getLiteralString(childNode8));
                            this.tp.Hw("'");
                        }
                    }
                }
            }
            int childNode9 = this.we.getChildNode(i, 1);
            if (this.we.getChildCount(childNode9) > 0) {
                int i9 = 47;
                int i10 = 46;
                if (this.we.getSyntaxTag(this.we.getChildNode(childNode9, 0)) == 46 || this.we.getSyntaxTag(this.we.getChildNode(childNode9, 0)) == 47) {
                    int i11 = 0;
                    while (i11 < this.we.getChildCount(childNode9)) {
                        int childNode10 = this.we.getChildNode(childNode9, i11);
                        int syntaxTag4 = this.we.getSyntaxTag(childNode10);
                        if (syntaxTag4 == i10) {
                            char[] literalChars = this.we.getLiteralChars(childNode10);
                            int literalOff = this.we.getLiteralOff(childNode10);
                            int literalLen = (this.we.getLiteralLen(childNode10) + literalOff) - i4;
                            int i12 = literalOff;
                            while (i12 < literalLen && (literalChars[i12] == ' ' || literalChars[i12] == '\t' || literalChars[i12] == '\n')) {
                                i12++;
                            }
                            if (i12 >= literalLen || literalChars[i12] != c || (i12 = i12 + 1) >= literalLen || literalChars[i12] != '!' || (i12 = i12 + 1) >= literalLen || literalChars[i12] != '-' || (i12 = i12 + 1) >= literalLen || literalChars[i12] != '-') {
                                z = false;
                            } else {
                                i12++;
                                z = true;
                            }
                            int i13 = literalLen;
                            while (literalOff < i13 && (literalChars[i13] == ' ' || literalChars[i13] == '\t' || literalChars[i13] == '\n')) {
                                i13--;
                            }
                            if (literalOff < i13 && literalChars[i13] == '>' && literalOff < i13 - 1 && literalChars[i2] == '-' && literalOff < i2 - 1 && literalChars[i3] == '-') {
                                literalLen = i3 - 1;
                            }
                            this.tp.aM(childNode10);
                            if (z) {
                                while (literalOff < i12) {
                                    if (literalChars[literalOff] == '\n') {
                                        this.tp.j6('\n');
                                    } else {
                                        this.tp.j6(' ');
                                    }
                                    literalOff++;
                                }
                                literalOff = i12;
                            }
                            this.tp.v5(literalChars, literalOff, (literalLen - literalOff) + 1);
                        } else if (syntaxTag4 == i9) {
                            this.tp.Hw("</");
                        }
                        i11++;
                        c = '<';
                        i9 = 47;
                        i4 = 1;
                        i10 = 46;
                    }
                    this.tp.j6('\n');
                    this.tp.VH();
                }
            }
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, -1786827088088071801L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -864084618126226453L)
    private boolean v5(int i) {
        try {
            if (j3) {
                iy.u7(627860326559030829L, this, i);
            }
            return Zo(this.we.getChildNode(i, 0));
        } catch (Throwable th) {
            if (Mr) {
                iy.j3(th, 627860326559030829L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4566367502976034271L)
    public Reader Hw() {
        try {
            if (j3) {
                iy.gn(-1140241219720045001L, this);
            }
            return this.tp.J0();
        } catch (Throwable th) {
            if (Mr) {
                iy.aM(th, -1140241219720045001L, this);
            }
            throw th;
        }
    }

    @ey(method = 46867631637147984L)
    public void u7(SyntaxTree syntaxTree, SyntaxTreeStyles syntaxTreeStyles, boolean z) {
        try {
            if (j3) {
                iy.we(2026652101944933568L, this, syntaxTree, syntaxTreeStyles, new Boolean(z));
            }
            this.we = syntaxTree;
            this.J0 = syntaxTreeStyles;
            this.tp.u7();
            tp(syntaxTree.getRootNode());
            this.we = null;
            this.J0 = null;
        } catch (Throwable th) {
            if (Mr) {
                iy.U2(th, 2026652101944933568L, this, syntaxTree, syntaxTreeStyles, new Boolean(z));
            }
            throw th;
        }
    }
}
