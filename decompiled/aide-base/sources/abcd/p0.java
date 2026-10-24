package abcd;

import com.aide.codemodel.AIDEModel;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.EntitySpace;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.FileSpace;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.SyntaxTreeSpace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.collections.ListOf;
import com.aide.codemodel.api.collections.MapOfInt;
import com.aide.codemodel.api.collections.SetOf;
import com.aide.codemodel.api.collections.SetOfInt;
import java.util.ArrayList;
import java.util.List;

@cy(clazz = -8075721511325089440L, container = -8075721511325089440L, user = true)
/* loaded from: classes.dex */
public class p0 {

    @gy
    private static /* synthetic */ boolean QX;

    @fy
    private static /* synthetic */ boolean Ws;

    @dy(field = 2326818592217785200L)
    private final IdentifierSpace DW;

    @dy(field = -3366133172909931468L)
    private String EQ;

    @dy(field = 2677620294488691777L)
    private final SyntaxTreeSpace FH;

    @dy(field = 2628749178781277360L)
    private final EntitySpace Hw;

    @dy(field = -584590942924543737L)
    private SetOf<Type> J0;

    @dy(field = -2474596082746932144L)
    private f2 J8;

    @dy(field = -429313593341747520L)
    private List<String> VH;

    @dy(field = -982624242370357020L)
    private List<Integer> Zo;

    @dy(field = 2694841808568492375L)
    private ListOf<Type> gn;

    @dy(field = 2381348423946480339L)
    private final AIDEModel j6;

    @dy(field = -1046356514698422964L)
    private List<String> tp;

    @dy(field = 2402197741577571804L)
    private List<String> u7;

    @dy(field = 2215794071023842216L)
    private final k0 v5;

    @dy(field = -854554980507410560L)
    private SetOf<Entity> we;

    @cy(clazz = -1111625722208306091L, container = -1111625722208306091L, user = true)
    public class a {

        @fy
        private static /* synthetic */ boolean VH;

        @gy
        private static /* synthetic */ boolean gn;

        @dy(field = -2633000368375640760L)
        public boolean DW;

        @dy(field = 1854208469828479419L)
        public int FH;

        @dy(field = 2630727868643557263L)
        public int Hw;

        @dy(field = -937372318074398388L)
        public int Zo;

        @dy(field = 3476537537216988985L)
        public boolean j6;

        @dy(field = 2029174244754107424L)
        public int v5;

        static {
            iy.Zo(a.class);
        }

        @ey(method = -3413374068322390095L)
        public a(p0 p0Var, boolean z, boolean z2, int i, int i2, int i3, int i4) {
            try {
                if (VH) {
                    iy.QX(-3696156566717374512L, null, new Object[]{p0Var, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                }
                this.j6 = z;
                this.DW = z2;
                this.FH = i;
                this.Hw = i2;
                this.v5 = i3;
                this.Zo = i4;
            } catch (Throwable th) {
                if (gn) {
                    iy.rN(th, -3696156566717374512L, null, new Object[]{p0Var, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                }
                throw th;
            }
        }
    }

    static {
        iy.Zo(p0.class);
    }

    @ey(method = -126012448403813600L)
    public p0(AIDEModel aIDEModel) {
        try {
            if (Ws) {
                iy.tp(5211523720598092236L, null, aIDEModel);
            }
            this.J8 = new f2();
            this.j6 = aIDEModel;
            this.DW = aIDEModel.identifierSpace;
            FileSpace fileSpace = aIDEModel.fileSpace;
            this.FH = aIDEModel.syntaxTreeSpace;
            this.Hw = aIDEModel.entitySpace;
            this.v5 = aIDEModel.vy;
            this.we = new SetOf<>(this.Hw);
            this.J0 = new SetOf<>(this.Hw);
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 5211523720598092236L, null, aIDEModel);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @abcd.ey(method = -5189006505198687840L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean DW(com.aide.codemodel.api.SyntaxTree r9, int r10, com.aide.codemodel.api.collections.SetOf<com.aide.codemodel.api.Member> r11) {
        /*
            r8 = this;
            boolean r0 = abcd.p0.Ws     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L14
            r1 = 2199487000992350052(0x1e8625c6263cff64, double:1.2307167785853171E-161)
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L2f
            r3 = r8
            r4 = r9
            r6 = r11
            abcd.iy.we(r1, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
        L14:
            int r0 = r9.sh(r10)     // Catch: java.lang.Throwable -> L2f
            switch(r0) {
                case 20: goto L1d;
                case 21: goto L1b;
                case 22: goto L1d;
                case 23: goto L1d;
                case 24: goto L1d;
                case 25: goto L1d;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L2f
        L1b:
            r9 = 0
            return r9
        L1d:
            com.aide.codemodel.api.Entity r0 = r9.getAttrReferenceEntity(r10)     // Catch: java.lang.Throwable -> L2f
            com.aide.codemodel.api.Member r0 = (com.aide.codemodel.api.Member) r0     // Catch: java.lang.Throwable -> L2f
            com.aide.codemodel.api.abstraction.Language r1 = r9.getLanguage()     // Catch: java.lang.Throwable -> L2f
            r1.getSyntax()     // Catch: java.lang.Throwable -> L2f
            boolean r9 = r11.contains(r0)     // Catch: java.lang.Throwable -> L2f
            return r9
        L2f:
            r0 = move-exception
            boolean r1 = abcd.p0.QX
            if (r1 == 0) goto L45
            r2 = 2199487000992350052(0x1e8625c6263cff64, double:1.2307167785853171E-161)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r10)
            r1 = r0
            r4 = r8
            r5 = r9
            r7 = r11
            abcd.iy.U2(r1, r2, r4, r5, r6, r7)
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.p0.DW(com.aide.codemodel.api.SyntaxTree, int, com.aide.codemodel.api.collections.SetOf):boolean");
    }

    @ey(method = 62029800934737664L)
    private void EQ(SyntaxTree syntaxTree, int i, int i2, int i3, SetOf<Member> setOf) {
        try {
            if (Ws) {
                iy.J8(-4505441298597139716L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), setOf);
            }
            int childCount = syntaxTree.getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                EQ(syntaxTree, syntaxTree.getChildNode(i, i4), i2, i3, setOf);
            }
            if (syntaxTree.isMethodDeclarationNode(i)) {
                try {
                    Member memberJw = this.Hw.jw(syntaxTree.getFile(), syntaxTree.getLanguage(), syntaxTree.getDeclarationNumber(i));
                    if (!memberJw.iW() && this.DW.QX(memberJw.getIdentifier()) == this.DW.QX(i2) && memberJw.oY() == i3) {
                        setOf.put(memberJw);
                    }
                } catch (e4 unused) {
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.lg(th, -4505441298597139716L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), setOf);
            }
            throw th;
        }
    }

    @ey(method = 8275430472257644696L)
    private boolean FH(SyntaxTree syntaxTree, int i, SetOf<Member> setOf) {
        try {
            if (Ws) {
                iy.we(-1372277226642863208L, this, syntaxTree, new Integer(i), setOf);
            }
            int iSh = syntaxTree.sh(i);
            if (iSh == 19 || iSh == 21) {
                return setOf.contains((Member) syntaxTree.getAttrReferenceEntity(i));
            }
            return false;
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, -1372277226642863208L, this, syntaxTree, new Integer(i), setOf);
            }
            throw th;
        }
    }

    @ey(method = 916172007072580328L)
    private void Hw(SyntaxTree syntaxTree, int i, int i2, SetOf<Member> setOf, boolean z) {
        int iEr;
        int iEr2;
        Syntax syntax;
        int i3;
        int i4;
        int i5;
        int i6;
        try {
            if (Ws) {
                iy.J8(-912755489152295448L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, new Boolean(z));
            }
            Syntax syntax2 = syntaxTree.getLanguage().getSyntax();
            int iVy = syntax2.vy(syntaxTree, i);
            int iMr = syntax2.Mr(syntaxTree, i);
            int iFH = syntax2.FH(syntaxTree, i);
            if (iFH == 0) {
                iEr2 = iVy;
                iEr = iMr;
            } else {
                iEr = syntax2.er(syntaxTree, i, iFH - 1);
                iEr2 = syntax2.er(syntaxTree, i, 0);
            }
            int i7 = -1;
            if (!f4.j6 || syntaxTree.getStartLine(i) == syntaxTree.getEndLine(i)) {
                Syntax syntax3 = syntax2;
                this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.u7(syntaxTree, iEr), this.J8.VH(syntaxTree, iEr), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), "");
                this.J8.XL(this.J8.u7(syntaxTree, iEr), this.J8.VH(syntaxTree, iEr), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy));
                for (int i8 = 0; i8 < this.Zo.size(); i8++) {
                    if (this.Zo.get(i8).intValue() != -1) {
                        int iIntValue = this.Zo.get(i8).intValue();
                        if (iIntValue < iFH) {
                            if (i8 > 0) {
                                this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), ", ");
                                this.J8.we(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), 2);
                            }
                            Syntax syntax4 = syntax3;
                            int iEr3 = syntax4.er(syntaxTree, i, iIntValue);
                            syntax3 = syntax4;
                            Zo(syntaxTree, iEr3, i2, setOf, false);
                            this.j6.refactoringCallback.vy(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iEr3), this.J8.tp(syntaxTree, iEr3), this.J8.u7(syntaxTree, iEr3), this.J8.VH(syntaxTree, iEr3), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy));
                            this.J8.Ws(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iEr3), this.J8.tp(syntaxTree, iEr3), this.J8.u7(syntaxTree, iEr3), this.J8.VH(syntaxTree, iEr3));
                        }
                    } else {
                        if (i8 > 0) {
                            this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), ", ");
                            this.J8.we(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), 2);
                        }
                        String strJ0 = this.tp.get(i8);
                        if (strJ0.length() == 0) {
                            strJ0 = J0(syntaxTree, (Type) this.gn.v5(i8));
                        }
                        this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), strJ0);
                        this.J8.we(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), strJ0.length());
                    }
                }
                this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.u7(syntaxTree, iMr), this.J8.VH(syntaxTree, iMr), this.J8.u7(syntaxTree, iEr), this.J8.VH(syntaxTree, iEr), "");
                this.J8.XL(this.J8.u7(syntaxTree, iMr), this.J8.VH(syntaxTree, iMr), this.J8.u7(syntaxTree, iEr), this.J8.VH(syntaxTree, iEr));
                if (z) {
                    this.j6.refactoringCallback.Sf(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartLine(i));
                    return;
                }
                return;
            }
            int i9 = 0;
            while (i9 < this.Zo.size()) {
                if (this.Zo.get(i9).intValue() != i7) {
                    int iIntValue2 = this.Zo.get(i9).intValue();
                    if (iIntValue2 < iFH) {
                        if (i9 > 0) {
                            this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), ",\n");
                            i6 = i9;
                            this.J8.we(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), 1);
                            this.J8.J8(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy));
                        } else {
                            i6 = i9;
                        }
                        int iEr4 = syntax2.er(syntaxTree, i, iIntValue2);
                        i5 = i6;
                        syntax = syntax2;
                        i4 = iEr2;
                        Zo(syntaxTree, iEr4, i2, setOf, false);
                        this.j6.refactoringCallback.vy(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iEr4), this.J8.tp(syntaxTree, iEr4), this.J8.u7(syntaxTree, iEr4), this.J8.VH(syntaxTree, iEr4), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy));
                        this.J8.Ws(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iEr4), this.J8.tp(syntaxTree, iEr4), this.J8.u7(syntaxTree, iEr4), this.J8.VH(syntaxTree, iEr4));
                    } else {
                        syntax = syntax2;
                        i5 = i9;
                        i4 = iEr2;
                    }
                    i3 = i5;
                } else {
                    syntax = syntax2;
                    i3 = i9;
                    i4 = iEr2;
                    if (i3 > 0) {
                        this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), ",\n");
                        this.J8.we(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), 1);
                        this.J8.J8(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy));
                    }
                    String strJ02 = this.tp.get(i3);
                    if (strJ02.length() == 0) {
                        strJ02 = J0(syntaxTree, (Type) this.gn.v5(i3));
                    }
                    this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), strJ02);
                    this.J8.we(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), strJ02.length());
                }
                i9 = i3 + 1;
                iEr2 = i4;
                syntax2 = syntax;
                i7 = -1;
            }
            if (syntaxTree.getEndLine(iMr) != syntaxTree.getStartLine(iEr2)) {
                this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy), "\n");
                this.J8.J8(this.J8.EQ(syntaxTree, iVy), this.J8.tp(syntaxTree, iVy));
            }
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), this.J8.u7(syntaxTree, iMr), this.J8.VH(syntaxTree, iMr), this.J8.u7(syntaxTree, iEr), this.J8.VH(syntaxTree, iEr), "");
            this.J8.XL(this.J8.u7(syntaxTree, iMr), this.J8.VH(syntaxTree, iMr), this.J8.u7(syntaxTree, iEr), this.J8.VH(syntaxTree, iEr));
            if (z) {
                this.j6.refactoringCallback.Sf(syntaxTree.getFile(), syntaxTree.getStartLine(i), this.J8.EQ(syntaxTree, iVy));
            }
        } catch (Throwable th) {
            if (QX) {
                iy.lg(th, -912755489152295448L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -544131331629638155L)
    private String J0(SyntaxTree syntaxTree, Type type) {
        try {
            if (Ws) {
                iy.EQ(4106149542491843229L, this, syntaxTree, type);
            }
            return syntaxTree.getLanguage().getCodeRenderer().v5(type);
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, 4106149542491843229L, this, syntaxTree, type);
            }
            throw th;
        }
    }

    @ey(method = -2300638885012683600L)
    private Member J8(FileEntry fileEntry, int i, int i2) {
        try {
            if (Ws) {
                iy.we(-282318359989584100L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i, i2);
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
                if (syntaxTreeZo.sh(iJO) == 19) {
                    return (Member) syntaxTreeZo.getAttrReferenceEntity(iJO);
                }
            }
            int iCz = syntaxTreeZo.Cz(i, i2);
            if (iCz != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iCz);
                if (syntaxTreeZo.sh(iCz) == 19) {
                    return (Member) syntaxTreeZo.getAttrReferenceEntity(iCz);
                }
            }
            int argumentsNodeAt = syntaxTreeZo.getArgumentsNodeAt(i, i2);
            if (argumentsNodeAt != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, argumentsNodeAt);
                if (syntaxTreeZo.sh(argumentsNodeAt) == 20) {
                    return (Member) syntaxTreeZo.getAttrReferenceEntity(argumentsNodeAt);
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, -282318359989584100L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2205607818076637355L)
    private void VH(SetOf<Member> setOf) {
        try {
            if (Ws) {
                iy.tp(5182994169493264765L, this, setOf);
            }
            SetOfInt setOfInt = new SetOfInt();
            int identifier = ((Member) setOf.Zo()).getIdentifier();
            setOfInt.put(identifier);
            this.v5.J0(setOfInt);
            while (true) {
                FileEntry fileEntryXL = this.v5.XL();
                if (fileEntryXL == null) {
                    return;
                }
                this.EQ = "";
                this.we.clear();
                for (SyntaxTree syntaxTree : this.FH.VH(fileEntryXL)) {
                    if (((Member) setOf.Zo()).iW()) {
                        syntaxTree.getLanguage().getCodeAnalyzer().FH(syntaxTree);
                    } else {
                        syntaxTree.getLanguage().getCodeAnalyzer().analyzeEveryIdentifiers(syntaxTree, setOfInt);
                    }
                    Zo(syntaxTree, syntaxTree.getRootNode(), identifier, setOf, true);
                    this.FH.releaseSyntaxTree(syntaxTree);
                    if (this.EQ.length() > 0) {
                        int importEndLine = syntaxTree.getImportEndLine();
                        int iWB = syntaxTree.WB();
                        this.j6.refactoringCallback.nw(fileEntryXL, importEndLine, iWB, importEndLine, iWB, this.EQ);
                    }
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 5182994169493264765L, this, setOf);
            }
            throw th;
        }
    }

    @ey(method = 207469054448228139L)
    private int Ws(FileEntry fileEntry, int i, int i2) {
        try {
            if (Ws) {
                iy.we(3171247089474580611L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i, i2);
            Syntax syntax = syntaxTreeZo.getLanguage().getSyntax();
            int iJO = syntaxTreeZo.jO(i, i2);
            if (iJO != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iJO);
                if (syntaxTreeZo.sh(iJO) == 19) {
                    return ((Member) syntaxTreeZo.getAttrReferenceEntity(iJO)).oY();
                }
            }
            int iCz = syntaxTreeZo.Cz(i, i2);
            if (iCz != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iCz);
                if (syntaxTreeZo.sh(iCz) == 19) {
                    Member member = (Member) syntaxTreeZo.getAttrReferenceEntity(iCz);
                    int iWe = syntax.we(syntaxTreeZo, iCz);
                    if (member.getFile().vJ() && iWe > 0) {
                        return iWe;
                    }
                }
            }
            int argumentsNodeAt = syntaxTreeZo.getArgumentsNodeAt(i, i2);
            if (argumentsNodeAt != -1) {
                syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, argumentsNodeAt);
                if (syntaxTreeZo.sh(argumentsNodeAt) == 20) {
                    Member member2 = (Member) syntaxTreeZo.getAttrReferenceEntity(argumentsNodeAt);
                    int iFH = syntax.FH(syntaxTreeZo, argumentsNodeAt);
                    if (member2.getFile().vJ() && iFH > 0) {
                        return iFH;
                    }
                }
            }
            throw new e4();
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, 3171247089474580611L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1069845787814452675L)
    private void XL(SyntaxTree syntaxTree, int i) {
        try {
            if (Ws) {
                iy.EQ(2902606229318116447L, this, syntaxTree, new Integer(i));
            }
            int childCount = syntaxTree.getChildCount(i) - 1;
            for (int i2 = childCount; i2 >= 0; i2--) {
                XL(syntaxTree, syntaxTree.getChildNode(i, i2));
            }
            if (syntaxTree.isArgumentsNode(i)) {
                while (childCount >= 0) {
                    this.J8.DW(syntaxTree, syntaxTree.getChildNode(i, childCount));
                    childCount--;
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, 2902606229318116447L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3820892293233770229L)
    private void Zo(SyntaxTree syntaxTree, int i, int i2, SetOf<Member> setOf, boolean z) {
        try {
            if (Ws) {
                iy.J8(-681249539412497097L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, new Boolean(z));
            }
            if (!syntaxTree.isArgumentsNode(i) || syntaxTree.isSyntheticNode(i)) {
                if (syntaxTree.isParameters(i) && !syntaxTree.isSyntheticNode(i)) {
                    int childCount = syntaxTree.getChildCount(i);
                    while (true) {
                        childCount--;
                        if (childCount < 0) {
                            break;
                        } else {
                            Zo(syntaxTree, syntaxTree.getChildNode(i, childCount), i2, setOf, z);
                        }
                    }
                    if (FH(syntaxTree, i, setOf)) {
                        v5(syntaxTree, i);
                        return;
                    }
                    return;
                }
                if (syntaxTree.isBlockNode(i)) {
                    this.J8.Zo();
                }
                int childCount2 = syntaxTree.getChildCount(i);
                while (true) {
                    childCount2--;
                    if (childCount2 < 0) {
                        return;
                    } else {
                        Zo(syntaxTree, syntaxTree.getChildNode(i, childCount2), i2, setOf, z);
                    }
                }
            } else if (DW(syntaxTree, i, setOf)) {
                XL(syntaxTree, i);
                Hw(syntaxTree, i, i2, setOf, z);
            } else {
                int childCount3 = syntaxTree.getChildCount(i);
                while (true) {
                    childCount3--;
                    if (childCount3 < 0) {
                        return;
                    } else {
                        Zo(syntaxTree, syntaxTree.getChildNode(i, childCount3), i2, setOf, z);
                    }
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.lg(th, -681249539412497097L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -2964894662412893880L)
    private void gn(SetOf<Member> setOf) {
        try {
            if (Ws) {
                iy.tp(1711579482606329280L, this, setOf);
            }
            setOf.DEFAULT_ITERATOR.init();
            while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                Member member = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                if (!member.getFile().vJ()) {
                    j6("There is an overridden method, which is defined outside the project.", member.getFile(), member.Ws(), member.QX());
                }
                MapOfInt<Member> mapOfIntE3 = member.getEnclosingClassType().e3();
                mapOfIntE3.DEFAULT_ITERATOR.init(((Member) setOf.Zo()).getIdentifier());
                while (mapOfIntE3.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) mapOfIntE3.DEFAULT_ITERATOR.nextValue();
                    if (!setOf.contains(member2) && member2.oY() == this.Zo.size()) {
                        j6("There already is a method with that name.", member2.getFile(), member2.Ws(), member2.QX());
                    }
                }
            }
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, 1711579482606329280L, this, setOf);
            }
            throw th;
        }
    }

    @ey(method = 4519375013590068725L)
    private void j6(String str, FileEntry fileEntry, int i, int i2) {
        try {
            if (Ws) {
                iy.J0(-3975228639470775843L, this, str, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.er(fileEntry.getPathString() + ":" + i + ":" + i2 + "\n    " + str);
        } catch (Throwable th) {
            if (QX) {
                iy.a8(th, -3975228639470775843L, this, str, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 4997576440953975405L)
    private SetOf<Member> tp(int i, int i2) {
        try {
            if (Ws) {
                iy.EQ(-1801951743663256475L, this, new Integer(i), new Integer(i2));
            }
            SetOf<Member> setOf = new SetOf<>(this.Hw);
            this.v5.J8(i);
            while (true) {
                FileEntry fileEntryAM = this.v5.aM();
                if (fileEntryAM == null || this.j6.stopCallback.et()) {
                    break;
                }
                for (SyntaxTree syntaxTree : this.FH.VH(fileEntryAM)) {
                    EQ(syntaxTree, syntaxTree.getRootNode(), i, i2, setOf);
                    this.FH.releaseSyntaxTree(syntaxTree);
                }
            }
            return setOf;
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, -1801951743663256475L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 6453976922022178679L)
    private void v5(SyntaxTree syntaxTree, int i) {
        int i2;
        int i3;
        int i4;
        try {
            if (Ws) {
                iy.EQ(-4266146934738540901L, this, syntaxTree, new Integer(i));
            }
            Syntax syntax = syntaxTree.getLanguage().getSyntax();
            int iWs = syntax.Ws(syntaxTree, i);
            int iXL = syntax.XL(syntaxTree, i);
            int iWe = syntax.we(syntaxTree, i);
            int startLine = syntaxTree.getStartLine(iWs);
            int startColumn = syntaxTree.getStartColumn(iWs);
            int size = this.Zo.size() - 1;
            while (size >= 0) {
                if (this.Zo.get(size).intValue() != -1) {
                    int iIntValue = this.Zo.get(size).intValue();
                    if (iIntValue < iWe) {
                        int iBr = syntax.br(syntaxTree, i, iIntValue);
                        this.j6.refactoringCallback.vy(syntaxTree.getFile(), syntaxTree.getStartLine(iBr), syntaxTree.getStartColumn(iBr), syntaxTree.getEndLine(iBr), syntaxTree.getEndColumn(iBr), startLine, startColumn);
                    }
                    i4 = size;
                    i2 = startColumn;
                    i3 = startLine;
                } else {
                    Type type = (Type) this.gn.v5(size);
                    if (type != null) {
                        this.j6.refactoringCallback.nw(syntaxTree.getFile(), startLine, startColumn, startLine, startColumn, syntaxTree.getLanguage().getTools().ei(syntaxTree.getLanguage().getTools().cb(syntaxTree, startLine, startColumn, type), this.u7.get(size)));
                        this.J0.clear();
                        this.J0.put(type);
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.EQ);
                        i2 = startColumn;
                        i3 = startLine;
                        sb.append(syntaxTree.getLanguage().getTools().aM(syntaxTree, startLine, startColumn, this.J0, this.we));
                        this.EQ = sb.toString();
                        i4 = size;
                    } else {
                        int i5 = size;
                        i2 = startColumn;
                        i3 = startLine;
                        i4 = i5;
                        this.j6.refactoringCallback.nw(syntaxTree.getFile(), i3, i2, i3, i2, syntaxTree.getLanguage().getTools().ei(this.VH.get(i5), this.u7.get(i5)));
                    }
                }
                if (i4 > 0) {
                    String str = ",";
                    if (f4.j6 && syntaxTree.getStartLine(i) != syntaxTree.getEndLine(i)) {
                        str = ",\n";
                    }
                    this.j6.refactoringCallback.nw(syntaxTree.getFile(), i3, i2, i3, i2, str);
                }
                size = i4 - 1;
                startColumn = i2;
                startLine = i3;
            }
            this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getEndLine(iXL), syntaxTree.getEndColumn(iXL), startLine, startColumn, "");
            if (!f4.j6 || syntaxTree.getStartLine(i) == syntaxTree.getEndLine(i)) {
                this.j6.refactoringCallback.Sf(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartLine(i));
            } else {
                this.j6.refactoringCallback.Sf(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartLine(i) + this.Zo.size());
            }
        } catch (Throwable th) {
            if (QX) {
                iy.Mr(th, -4266146934738540901L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 901991196876186219L)
    private SetOf<Member> we(Member member) {
        try {
            if (Ws) {
                iy.tp(-3022317945949491581L, this, member);
            }
            SetOf<Member> setOfTp = tp(member.getIdentifier(), member.oY());
            SetOf setOf = new SetOf(this.Hw);
            setOf.put(member);
            SetOf<Member> setOf2 = new SetOf<>(this.Hw);
            while (true) {
                setOf.DEFAULT_ITERATOR.init();
                while (setOf.DEFAULT_ITERATOR.hasMoreElements()) {
                    Member member2 = (Member) setOf.DEFAULT_ITERATOR.nextKey();
                    setOf2.put(member2);
                    setOf2.u7(member2.jO());
                    setOfTp.DEFAULT_ITERATOR.init();
                    while (setOfTp.DEFAULT_ITERATOR.hasMoreElements()) {
                        Member member3 = (Member) setOfTp.DEFAULT_ITERATOR.nextKey();
                        if (member3.OW().contains(member2)) {
                            setOf2.put(member3);
                        }
                    }
                }
                if (setOf.J0() == setOf2.J0()) {
                    return setOf2;
                }
                setOf.clear();
                setOf.u7(setOf2);
            }
        } catch (Throwable th) {
            if (QX) {
                iy.j3(th, -3022317945949491581L, this, member);
            }
            throw th;
        }
    }

    @ey(method = -3386589953964764859L)
    public List<a> QX(FileEntry fileEntry, int i, int i2) throws Throwable {
        int i3 = i;
        int i4 = i2;
        try {
            if (Ws) {
                iy.we(-2576900324577897815L, this, fileEntry, new Integer(i3), new Integer(i4));
            }
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i3, i4);
            if (syntaxTreeZo != null) {
                Syntax syntax = syntaxTreeZo.getLanguage().getSyntax();
                int iCz = syntaxTreeZo.Cz(i3, i4);
                if (iCz != -1) {
                    syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, iCz);
                    if (syntaxTreeZo.sh(iCz) == 19) {
                        Member member = (Member) syntaxTreeZo.getAttrReferenceEntity(iCz);
                        int iWe = syntax.we(syntaxTreeZo, iCz);
                        if (!member.getFile().vJ() || iWe <= 0) {
                            this.FH.releaseSyntaxTree(syntaxTreeZo);
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        int iWs = syntax.Ws(syntaxTreeZo, iCz);
                        int iXL = syntax.XL(syntaxTreeZo, iCz);
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new a(this, false, false, syntaxTreeZo.getStartLine(iXL), syntaxTreeZo.getStartColumn(iXL), syntaxTreeZo.getStartLine(syntax.br(syntaxTreeZo, iCz, 0)), syntaxTreeZo.getStartColumn(syntax.br(syntaxTreeZo, iCz, 0))));
                        int i5 = 0;
                        while (i5 < iWe) {
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new a(this, syntaxTreeZo.containsPositionExt(syntax.br(syntaxTreeZo, iCz, i5), i3, i4), true, syntaxTreeZo.getStartLine(syntax.br(syntaxTreeZo, iCz, i5)), syntaxTreeZo.getStartColumn(syntax.br(syntaxTreeZo, iCz, i5)), syntaxTreeZo.getEndLine(syntax.br(syntaxTreeZo, iCz, i5)), syntaxTreeZo.getEndColumn(syntax.br(syntaxTreeZo, iCz, i5))));
                            if (i5 < iWe - 1) {
                                int i6 = i5 + 1;
                                arrayList3.add(new a(this, false, false, syntaxTreeZo.getEndLine(syntax.br(syntaxTreeZo, iCz, i5)), syntaxTreeZo.getEndColumn(syntax.br(syntaxTreeZo, iCz, i5)), syntaxTreeZo.getStartLine(syntax.br(syntaxTreeZo, iCz, i6)), syntaxTreeZo.getStartColumn(syntax.br(syntaxTreeZo, iCz, i6))));
                            }
                            i5++;
                            i4 = i2;
                            arrayList2 = arrayList3;
                            i3 = i;
                        }
                        ArrayList arrayList4 = arrayList2;
                        int i7 = iWe - 1;
                        arrayList4.add(new a(this, false, false, syntaxTreeZo.getEndLine(syntax.br(syntaxTreeZo, iCz, i7)), syntaxTreeZo.getEndColumn(syntax.br(syntaxTreeZo, iCz, i7)), syntaxTreeZo.getEndLine(iWs), syntaxTreeZo.getEndColumn(iWs)));
                        this.FH.releaseSyntaxTree(syntaxTreeZo);
                        return arrayList4;
                    }
                } else {
                    i3 = i;
                    i4 = i2;
                }
                int argumentsNodeAt = syntaxTreeZo.getArgumentsNodeAt(i3, i4);
                try {
                    if (argumentsNodeAt != -1) {
                        syntaxTreeZo.getLanguage().getCodeAnalyzer().VH(syntaxTreeZo, argumentsNodeAt);
                        if (syntaxTreeZo.sh(argumentsNodeAt) == 20) {
                            Member member2 = (Member) syntaxTreeZo.getAttrReferenceEntity(argumentsNodeAt);
                            int iFH = syntax.FH(syntaxTreeZo, argumentsNodeAt);
                            if (!member2.getFile().vJ() || iFH <= 0) {
                                this.FH.releaseSyntaxTree(syntaxTreeZo);
                                return null;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            int iVy = syntax.vy(syntaxTreeZo, argumentsNodeAt);
                            int iMr = syntax.Mr(syntaxTreeZo, argumentsNodeAt);
                            try {
                                arrayList5.add(new a(this, false, false, syntaxTreeZo.getStartLine(iMr), syntaxTreeZo.getStartColumn(iMr), syntaxTreeZo.getStartLine(syntax.er(syntaxTreeZo, argumentsNodeAt, 0)), syntaxTreeZo.getStartColumn(syntax.er(syntaxTreeZo, argumentsNodeAt, 0))));
                                int i8 = 0;
                                while (i8 < iFH) {
                                    int i9 = i8;
                                    arrayList5.add(new a(this, syntaxTreeZo.containsPositionExt(syntax.er(syntaxTreeZo, argumentsNodeAt, i8), i3, i4), true, syntaxTreeZo.getStartLine(syntax.er(syntaxTreeZo, argumentsNodeAt, i8)), syntaxTreeZo.getStartColumn(syntax.er(syntaxTreeZo, argumentsNodeAt, i8)), syntaxTreeZo.getEndLine(syntax.er(syntaxTreeZo, argumentsNodeAt, i8)), syntaxTreeZo.getEndColumn(syntax.er(syntaxTreeZo, argumentsNodeAt, i8))));
                                    if (i9 < iFH - 1) {
                                        int i10 = i9 + 1;
                                        arrayList5.add(new a(this, false, false, syntaxTreeZo.getEndLine(syntax.er(syntaxTreeZo, argumentsNodeAt, i9)), syntaxTreeZo.getEndColumn(syntax.er(syntaxTreeZo, argumentsNodeAt, i9)), syntaxTreeZo.getStartLine(syntax.er(syntaxTreeZo, argumentsNodeAt, i10)), syntaxTreeZo.getStartColumn(syntax.er(syntaxTreeZo, argumentsNodeAt, i10))));
                                    }
                                    i8 = i9 + 1;
                                    i3 = i;
                                    i4 = i2;
                                }
                                int i11 = iFH - 1;
                                arrayList5.add(new a(this, false, false, syntaxTreeZo.getEndLine(syntax.er(syntaxTreeZo, argumentsNodeAt, i11)), syntaxTreeZo.getEndColumn(syntax.er(syntaxTreeZo, argumentsNodeAt, i11)), syntaxTreeZo.getEndLine(iVy), syntaxTreeZo.getEndColumn(iVy)));
                                this.FH.releaseSyntaxTree(syntaxTreeZo);
                                return arrayList5;
                            } catch (Throwable th) {
                                th = th;
                                if (QX) {
                                    iy.U2(th, -2576900324577897815L, this, fileEntry, new Integer(i), new Integer(i2));
                                }
                                throw th;
                            }
                        }
                    }
                    this.FH.releaseSyntaxTree(syntaxTreeZo);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @ey(method = -4006358752112274441L)
    public void aM(FileEntry fileEntry, int i, int i2, int i3, Type type) throws Throwable {
        try {
            if (Ws) {
                iy.J8(971998533851612623L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTreeZo = this.j6.syntaxTreeSpace.Zo(fileEntry, i, i2);
            int methodNodeAt = syntaxTreeZo.getMethodNodeAt(i, i2, i, i2);
            try {
                if (methodNodeAt != -1) {
                    try {
                        Member memberJw = this.Hw.jw(fileEntry, syntaxTreeZo.getLanguage(), syntaxTreeZo.getDeclarationNumber(methodNodeAt));
                        this.Zo = new ArrayList();
                        this.u7 = new ArrayList();
                        this.VH = new ArrayList();
                        this.gn = new ListOf<>(this.j6.entitySpace);
                        this.tp = new ArrayList();
                        this.Zo.add(-1);
                        this.VH.add(type.getNameString());
                        try {
                            this.gn.j6(type);
                            this.u7.add(this.DW.getString(i3));
                            this.tp.add("");
                            int iOY = memberJw.oY();
                            for (int i4 = 0; i4 < iOY; i4++) {
                                this.Zo.add(Integer.valueOf(i4));
                                this.VH.add(memberJw.qp(i4).getNameString());
                                this.gn.j6(memberJw.qp(i4));
                                this.u7.add(this.DW.getString(memberJw.CU(i4)));
                                this.tp.add("");
                            }
                            this.j6.refactoringCallback.ei(fileEntry, memberJw.Ws(), memberJw.QX(), this.Zo, this.VH, this.u7, this.tp);
                            this.FH.releaseSyntaxTree(syntaxTreeZo);
                            return;
                        } catch (e4 unused) {
                        }
                    } catch (e4 unused2) {
                    }
                }
                this.FH.releaseSyntaxTree(syntaxTreeZo);
            } catch (Throwable th) {
                th = th;
                if (QX) {
                    iy.lg(th, 971998533851612623L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = -124264002402376980L)
    public void j3(FileEntry fileEntry, int i, int i2) {
        try {
            if (Ws) {
                iy.we(-3371071649755175424L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.g3();
            try {
                Member memberJ8 = J8(fileEntry, i, i2);
                if (!memberJ8.getFile().vJ()) {
                    this.j6.refactoringCallback.ef("This method is defined outside of the project.");
                    return;
                }
                this.Zo = new ArrayList();
                this.u7 = new ArrayList();
                this.VH = new ArrayList();
                this.gn = new ListOf<>(this.j6.entitySpace);
                this.tp = new ArrayList();
                int iOY = memberJ8.oY();
                for (int i3 = 0; i3 < iOY; i3++) {
                    this.Zo.add(Integer.valueOf(i3));
                    this.VH.add(memberJ8.qp(i3).getNameString());
                    this.gn.j6(memberJ8.qp(i3));
                    this.u7.add(this.DW.getString(memberJ8.CU(i3)));
                    this.tp.add("");
                }
                this.j6.refactoringCallback.ei(fileEntry, i, i2, this.Zo, this.VH, this.u7, this.tp);
            } catch (e4 unused) {
                this.j6.refactoringCallback.ef("Select a method.");
            }
        } catch (Throwable th) {
            if (QX) {
                iy.U2(th, -3371071649755175424L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -157510506631962527L)
    public void u7(FileEntry fileEntry, int i, int i2, List<Integer> list, List<String> list2, List<String> list3, List<String> list4) {
        try {
            if (Ws) {
                iy.QX(4783841684688196701L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), list, list2, list3, list4});
            }
            this.Zo = list;
            this.u7 = list3;
            this.gn = new ListOf<>(this.j6.entitySpace, list2.size());
            this.VH = list2;
            this.tp = list4;
            this.j6.refactoringCallback.g3();
            if (list2 != null) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    String str = list2.get(i3);
                    SyntaxTree syntaxTreeWs = this.j6.syntaxTreeSpace.Ws(fileEntry, i, i2);
                    if (syntaxTreeWs != null) {
                        try {
                            this.gn.u7(i3, syntaxTreeWs.getLanguage().getCodeAnalyzer().analyzeTypeName(syntaxTreeWs, i, i2, str));
                        } catch (e4 unused) {
                        }
                        this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTreeWs);
                    }
                }
            }
            try {
                Member memberJ8 = J8(fileEntry, i, i2);
                int iWs = Ws(fileEntry, i, i2);
                if (iWs < memberJ8.oY()) {
                    while (iWs < memberJ8.oY()) {
                        if (!list.contains(Integer.valueOf(iWs))) {
                            list.add(Integer.valueOf(iWs));
                        }
                        iWs++;
                    }
                }
                if (memberJ8.iW()) {
                    SetOf<Member> setOf = new SetOf<>(this.Hw);
                    setOf.put(memberJ8);
                    VH(setOf);
                } else {
                    SetOf<Member> setOfWe = we(memberJ8);
                    gn(setOfWe);
                    VH(setOfWe);
                }
            } catch (e4 unused2) {
            }
            this.j6.refactoringCallback.KD();
        } catch (Throwable th) {
            if (QX) {
                iy.rN(th, 4783841684688196701L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), list, list2, list3, list4});
            }
            throw th;
        }
    }
}
