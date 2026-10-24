package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.LexerHelper;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOfIntInt;
import com.aide.codemodel.api.collections.SetOfInt;
import com.aide.codemodel.language.dtd.DtdCodeModel;
import com.aide.codemodel.language.dtd.DtdLanguage;
import com.aide.uidesigner.ProxyTextView;
import java.io.IOException;
import java.io.Reader;
import java.util.Stack;

@cy(clazz = 1645658335839072429L, container = 1645658335839072429L, user = true)
/* loaded from: classes.dex */
public class s5 {

    @fy
    private static /* synthetic */ boolean U2;

    @gy
    private static /* synthetic */ boolean a8;

    @dy(field = -1379887973445208704L)
    private final DtdCodeModel DW;

    @dy(field = 2950923252298344000L)
    private m4 EQ;

    @dy(field = 3186069684178241168L)
    private final DtdLanguage FH;

    @dy(field = -2498300467354106976L)
    private final LexerHelper Hw;

    @dy(field = 1835978810898461640L)
    private FileEntry J0;

    @dy(field = 1168964835758235360L)
    private int J8;

    @dy(field = 3666947349170944524L)
    private final int Mr;

    @dy(field = -2290593140938531800L)
    private Stack<SyntaxTreeStyles> QX;

    @dy(field = 5715333578594550555L)
    private m4 VH;

    @dy(field = -981546643568891181L)
    private int Ws;

    @dy(field = -3672978972624429975L)
    private ListOfInt XL;

    @dy(field = -214418488316655425L)
    private MapOfIntInt Zo;

    @dy(field = 7593648557367770656L)
    private SetOfInt aM;

    @dy(field = 4852211851470981033L)
    private m4 gn;

    @dy(field = 4322222562127244544L)
    private final int j3;

    @dy(field = -1274944753166766477L)
    private final Model j6;

    @dy(field = 538281524243305744L)
    private SyntaxTreeStyles tp;

    @dy(field = 2185655573522842080L)
    private MapOfIntInt u7;

    @dy(field = -515696218427979123L)
    private MapOfIntInt v5;

    @dy(field = 904468633724424375L)
    private boolean we;

    static {
        iy.Zo(s5.class);
    }

    @ey(method = 119093966381147600L)
    public s5(Model model, DtdCodeModel dtdCodeModel, DtdLanguage dtdLanguage, LexerHelper lexerHelper) {
        try {
            if (U2) {
                iy.J0(-1980843366420964L, null, model, dtdCodeModel, dtdLanguage, lexerHelper);
            }
            this.v5 = new MapOfIntInt();
            this.Zo = new MapOfIntInt();
            this.u7 = new MapOfIntInt();
            this.QX = new Stack<>();
            this.XL = new ListOfInt();
            this.aM = new SetOfInt();
            this.j6 = model;
            this.DW = dtdCodeModel;
            this.FH = dtdLanguage;
            this.Hw = lexerHelper;
            this.VH = new m4(model);
            this.gn = new m4(model);
            this.j3 = model.identifierSpace.get("PUBLIC");
            this.Mr = model.identifierSpace.get("SYSTEM");
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -1980843366420964L, null, model, dtdCodeModel, dtdLanguage, lexerHelper);
            }
            throw th;
        }
    }

    @ey(method = -698483007455698575L)
    private void DW() {
        try {
            if (U2) {
                iy.gn(-30818981803751712L, this);
            }
            while (true) {
                int i = this.Ws;
                if (i != 10) {
                    switch (i) {
                        case 15:
                        case 16:
                        case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                            break;
                        default:
                            return;
                    }
                }
                FH();
            }
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -30818981803751712L, this);
            }
            throw th;
        }
    }

    @ey(method = 264975297347668943L)
    private void EQ() {
        try {
            if (U2) {
                iy.gn(4598918972695297684L, this);
            }
            FH();
            DW();
            if (this.Ws != 20) {
                return;
            }
            FH();
            DW();
            if (this.Ws != 30) {
                return;
            }
            int iZo = Zo();
            FH();
            DW();
            if (this.v5.v5(iZo)) {
                return;
            }
            int i = this.Ws;
            if (i == 18 || i == 19) {
                we();
                int iQX = this.gn.QX();
                int iQX2 = this.VH.QX();
                this.gn.DW(this.VH);
                this.v5.tp(iZo, iQX);
                this.Zo.tp(iZo, iQX2);
                return;
            }
            if (i != 30) {
                return;
            }
            int iQX3 = this.j6.identifierSpace.QX(Zo());
            if (iQX3 == this.j3) {
                J0(iZo);
            } else if (iQX3 == this.Mr) {
                J8(iZo);
            }
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 4598918972695297684L, this);
            }
            throw th;
        }
    }

    @ey(method = 3575175322468781120L)
    private void FH() {
        try {
            if (U2) {
                iy.gn(2871843084652504017L, this);
            }
            if (this.Ws != 53) {
                this.EQ.gn(this.tp.startLines[this.J8], this.tp.startColumns[this.J8]);
                if (this.FH.getSyntax().isLiteral(this.Ws)) {
                    int i = this.tp.DW[this.J8];
                    this.EQ.v5(this.tp.VH, this.tp.Zo(i), this.tp.v5(i));
                } else if (this.FH.getSyntax().isIdentifier(this.Ws)) {
                    this.EQ.Zo(this.tp.DW[this.J8]);
                } else {
                    this.EQ.Hw(this.FH.getSyntax().getString(this.Ws));
                }
            } else {
                this.EQ.VH();
                this.EQ.j6(' ');
            }
            u7();
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 2871843084652504017L, this);
            }
            throw th;
        }
    }

    @ey(method = -2318981205003732959L)
    private void Hw(SyntaxTreeStyles syntaxTreeStyles, FileEntry fileEntry) {
        try {
            if (U2) {
                iy.EQ(291918650772542080L, this, syntaxTreeStyles, fileEntry);
            }
            if (fileEntry != null) {
                if (this.aM.contains(fileEntry.getId())) {
                    return;
                } else {
                    this.aM.put(fileEntry.getId());
                }
            }
            this.QX.push(syntaxTreeStyles);
            this.XL.push(this.J8);
            this.J8 = 0;
            this.tp = syntaxTreeStyles;
            this.Ws = syntaxTreeStyles.syntaxTags[0];
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 291918650772542080L, this, syntaxTreeStyles, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 1430572230969917952L)
    private void J0(int i) {
        try {
            if (U2) {
                iy.u7(1836832866615680263L, this, i);
            }
            FH();
            DW();
            we();
            this.u7.tp(i, this.VH.tp());
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 1836832866615680263L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3540769546110442596L)
    private void J8(int i) {
        try {
            if (U2) {
                iy.u7(-2233162283488428645L, this, i);
            }
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -2233162283488428645L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1852117768025086199L)
    private boolean VH() {
        try {
            if (U2) {
                iy.gn(1001224240193872440L, this);
            }
            if (this.J8 + 2 < this.tp.syntaxTags.length && this.tp.syntaxTags[this.J8] == 28) {
                return this.tp.syntaxTags[this.J8 + 1] == 31;
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 1001224240193872440L, this);
            }
            throw th;
        }
    }

    @ey(method = 2160622699262751864L)
    private int Zo() {
        try {
            if (U2) {
                iy.gn(-2663329325226276121L, this);
            }
            return this.tp.DW[this.J8];
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -2663329325226276121L, this);
            }
            throw th;
        }
    }

    @ey(method = 423204499124816772L)
    private boolean gn() {
        try {
            if (U2) {
                iy.gn(2286973958722302935L, this);
            }
            if (this.J8 + 2 < this.tp.syntaxTags.length && this.tp.syntaxTags[this.J8] == 20) {
                return this.tp.syntaxTags[this.J8 + 1] == 30;
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 2286973958722302935L, this);
            }
            throw th;
        }
    }

    @ey(method = -3867643441623534528L)
    private void j6() {
        try {
            if (U2) {
                iy.gn(-2867467889617733025L, this);
            }
            int i = 0;
            while (this.Ws != 0) {
                int i2 = this.Ws;
                if (i2 == 46) {
                    i++;
                    FH();
                } else if (i2 != 48) {
                    FH();
                } else if (i <= 0) {
                    return;
                } else {
                    i--;
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -2867467889617733025L, this);
            }
            throw th;
        }
    }

    @ey(method = -393117477212837685L)
    private void tp() {
        try {
            if (U2) {
                iy.gn(-54902336466370744L, this);
            }
            FH();
            DW();
            if (!gn()) {
                if (this.Ws == 45) {
                    FH();
                    j6();
                    return;
                }
                return;
            }
            int i = this.tp.DW[this.J8 + 1];
            if (this.v5.v5(i) && this.gn.J8("IGNORE", this.v5.VH(i))) {
                this.EQ.VH();
                this.EQ.Hw("IGNORE");
                u7();
                u7();
                u7();
                j6();
            }
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -54902336466370744L, this);
            }
            throw th;
        }
    }

    @ey(method = 2165129093489588288L)
    private void u7() {
        try {
            if (U2) {
                iy.gn(-73803891699004359L, this);
            }
            int i = this.J8 + 1;
            this.J8 = i;
            if (i < this.tp.syntaxTags.length) {
                this.Ws = this.tp.syntaxTags[i];
            }
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -73803891699004359L, this);
            }
            throw th;
        }
    }

    @ey(method = -30465325086594515L)
    private void v5(String str) {
        try {
            if (U2) {
                iy.tp(-1323242104035106908L, this, str);
            }
            if (this.we) {
                this.j6.errorTable.j3(this.J0, this.FH, this.tp.startLines[this.J8], this.tp.startColumns[this.J8], this.tp.endLines[this.J8], this.tp.endColumns[this.J8], str, 0);
            }
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1323242104035106908L, this, str);
            }
            throw th;
        }
    }

    @ey(method = 173606057789017565L)
    private void we() {
        try {
            if (U2) {
                iy.gn(-2388708786036301848L, this);
            }
            int i = this.Ws;
            FH();
            this.VH.u7();
            while (this.Ws != i) {
                switch (this.Ws) {
                    case 27:
                        int iZo = Zo();
                        this.VH.v5(this.tp.VH, this.tp.Zo(iZo), this.tp.v5(iZo));
                        FH();
                        break;
                    case 28:
                        if (!VH()) {
                            FH();
                            break;
                        } else {
                            u7();
                            int iZo2 = Zo();
                            if (this.v5.v5(iZo2)) {
                                int iVH = this.v5.VH(iZo2);
                                int iVH2 = this.Zo.VH(iZo2);
                                this.VH.FH(this.gn, iVH, iVH2);
                                this.EQ.VH();
                                this.EQ.FH(this.gn, iVH, iVH2);
                            } else {
                                v5("Unknown entity: " + this.j6.identifierSpace.getString(iZo2));
                            }
                            u7();
                            u7();
                            break;
                        }
                    case 29:
                    case 31:
                        FH();
                        break;
                    case 30:
                    default:
                        return;
                }
            }
            FH();
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -2388708786036301848L, this);
            }
            throw th;
        }
    }

    @ey(method = 168520137192286705L)
    public void Ws(FileEntry fileEntry, SyntaxTreeStyles syntaxTreeStyles, m4 m4Var, boolean z) throws Throwable {
        try {
            if (U2) {
                iy.J0(7542143445228125952L, this, fileEntry, syntaxTreeStyles, m4Var, new Boolean(z));
            }
            this.EQ = m4Var;
            this.we = z;
            this.J0 = fileEntry;
            try {
                Hw(syntaxTreeStyles, fileEntry);
                this.v5.clear();
                this.Zo.clear();
                this.gn.u7();
                this.u7.clear();
                while (true) {
                    int i = this.Ws;
                    if (i == 0) {
                        if (this.QX.size() <= 1) {
                            break;
                        }
                        this.QX.pop();
                        this.J8 = this.XL.pop();
                        this.tp = this.QX.peek();
                        u7();
                        if (this.Ws == 21) {
                            u7();
                        }
                    } else if (i == 11) {
                        EQ();
                    } else if (i != 20) {
                        if (i != 28) {
                            if (i != 46) {
                                FH();
                            } else {
                                tp();
                            }
                        } else if (VH()) {
                            u7();
                            int iZo = Zo();
                            if (this.v5.v5(iZo)) {
                                int iVH = this.v5.VH(iZo);
                                int iVH2 = this.Zo.VH(iZo);
                                m4Var.VH();
                                m4Var.FH(this.gn, iVH, iVH2);
                            } else {
                                v5("Unknown entity: " + this.j6.identifierSpace.getString(iZo));
                            }
                            u7();
                            if (this.Ws == 29) {
                                u7();
                            }
                        } else {
                            FH();
                        }
                    } else if (gn()) {
                        u7();
                        int iZo2 = Zo();
                        if (this.v5.v5(iZo2)) {
                            int iVH3 = this.v5.VH(iZo2);
                            int iVH4 = this.Zo.VH(iZo2);
                            m4Var.VH();
                            m4Var.j6(' ');
                            m4Var.FH(this.gn, iVH3, iVH4);
                            m4Var.j6(' ');
                        } else if (this.u7.v5(iZo2)) {
                            try {
                                int iVH5 = this.u7.VH(iZo2);
                                Reader readerA8 = this.DW.a8(this.j6.identifierSpace.getString(iVH5));
                                FileEntry fileEntryMr = this.DW.Mr(this.j6.identifierSpace.getString(iVH5));
                                if (readerA8 != null) {
                                    SyntaxTreeStyles syntaxTreeStylesMakeSyntaxTreeStyles = this.j6.U2.makeSyntaxTreeStyles();
                                    this.Hw.FH(fileEntryMr, readerA8, false, true, syntaxTreeStylesMakeSyntaxTreeStyles, true, Integer.MAX_VALUE);
                                    Hw(syntaxTreeStylesMakeSyntaxTreeStyles, fileEntryMr);
                                } else {
                                    v5("Public entity not found: " + this.j6.identifierSpace.getString(iVH5));
                                }
                            } catch (IOException unused) {
                            }
                        } else {
                            v5("Unknown entity: " + this.j6.identifierSpace.getString(iZo2));
                        }
                        u7();
                        if (this.Ws == 21) {
                            u7();
                        }
                    } else {
                        FH();
                    }
                }
                this.tp = null;
                this.EQ = null;
                this.J0 = null;
                while (this.QX.size() > 1) {
                    this.j6.U2.DW(this.QX.pop());
                }
                this.QX.setSize(0);
                this.XL.u7(0);
                this.aM.clear();
            } catch (Throwable th) {
                th = th;
                if (a8) {
                    iy.a8(th, 7542143445228125952L, this, fileEntry, syntaxTreeStyles, m4Var, new Boolean(z));
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
