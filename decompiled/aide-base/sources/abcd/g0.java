package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.collections.HashtableOfInt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@cy(clazz = 4623504313553184192L, container = 4623504313553184192L, user = true)
/* loaded from: classes.dex */
public class g0 {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 2165053627403539509L)
    private final Model j6;

    static {
        iy.Zo(g0.class);
    }

    @ey(method = 328322253204813504L)
    public g0(Model model) {
        try {
            if (DW) {
                iy.tp(1093643930913013000L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 1093643930913013000L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 2205711860258173724L)
    private void Hw(FileEntry fileEntry, int i, int i2, int i3) {
        HashtableOfInt<Tools.a> hashtableOfIntJ6;
        try {
            if (DW) {
                iy.J0(4875290021673526260L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            HashtableOfInt<Tools.a> hashtableOfInt = new HashtableOfInt<>();
            List<SyntaxTree> listQX = this.j6.syntaxTreeSpace.QX(fileEntry);
            f2 f2Var = new f2();
            f2Var.j6(-1, i, 1, i, 1);
            f2Var.j6(-2, i2, 1, i2, 1);
            for (SyntaxTree syntaxTree : listQX) {
                if (syntaxTree.getLanguage().getTools() != null) {
                    f2Var.FH(syntaxTree);
                }
            }
            for (SyntaxTree syntaxTree2 : listQX) {
                if (syntaxTree2.getLanguage().getTools() != null) {
                    syntaxTree2.getLanguage().getTools().J8(syntaxTree2, f2Var, i, i2);
                }
            }
            i2 = f2Var.gn(-2);
            for (SyntaxTree syntaxTree3 : listQX) {
                if (syntaxTree3.getLanguage().getTools() != null && (hashtableOfIntJ6 = syntaxTree3.getLanguage().getTools().j6(syntaxTree3, f2Var, i, i2, i3)) != null) {
                    hashtableOfIntJ6.j6.DW();
                    while (hashtableOfIntJ6.j6.j6()) {
                        int iFH = hashtableOfIntJ6.j6.FH();
                        Tools.a aVarHw = hashtableOfIntJ6.j6.Hw();
                        if (hashtableOfInt.Hw(iFH)) {
                            hashtableOfInt.VH(iFH, hashtableOfInt.v5(iFH).j6(aVarHw, null));
                        } else {
                            hashtableOfInt.VH(iFH, aVarHw);
                        }
                    }
                }
            }
            v5(fileEntry, hashtableOfInt, i, i2, i3);
        } finally {
        }
    }

    @ey(method = -308408041934195649L)
    private SyntaxTree Zo(List<SyntaxTree> list, int i, int i2) {
        try {
            if (DW) {
                iy.we(-1841972438803934253L, this, list, new Integer(i), new Integer(i2));
            }
            int i3 = Integer.MAX_VALUE;
            Iterator<SyntaxTree> it = list.iterator();
            SyntaxTree syntaxTree = null;
            SyntaxTree syntaxTree2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SyntaxTree next = it.next();
                if (syntaxTree == null) {
                    syntaxTree = next;
                }
                int iZa = next.Za(i, i2);
                if (iZa == 0) {
                    syntaxTree2 = next;
                    break;
                }
                if (iZa < i3) {
                    syntaxTree2 = next;
                    i3 = iZa;
                }
            }
            return syntaxTree2 == null ? syntaxTree : syntaxTree2;
        } catch (Throwable th) {
            if (FH) {
                iy.U2(th, -1841972438803934253L, this, list, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1525024797307988541L)
    private void v5(FileEntry fileEntry, HashtableOfInt<Tools.a> hashtableOfInt, int i, int i2, int i3) {
        try {
            if (DW) {
                iy.J8(7007701000070846145L, this, fileEntry, hashtableOfInt, new Integer(i), new Integer(i2), new Integer(i3));
            }
            hashtableOfInt.j6.DW();
            while (hashtableOfInt.j6.j6()) {
                int iFH = hashtableOfInt.j6.FH();
                if (iFH >= i && iFH <= i2) {
                    Tools.a aVarHw = hashtableOfInt.j6.Hw();
                    if (aVarHw.j6 >= 0 && !aVarHw.FH && !aVarHw.DW) {
                        this.j6.refactoringCallback.gW(fileEntry, iFH, aVarHw.j6, i3);
                    }
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.lg(th, 7007701000070846145L, this, fileEntry, hashtableOfInt, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 371198258107584663L)
    public void DW(FileEntry fileEntry, int i, int i2, int i3) {
        try {
            if (DW) {
                iy.J0(-229764543857147541L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.j6.refactoringCallback.g3();
            Hw(fileEntry, i, i2, i3);
            this.j6.refactoringCallback.vJ();
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, -229764543857147541L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 1804211515265170473L)
    public void FH(FileEntry fileEntry, int i, int i2, int i3) {
        HashtableOfInt<Tools.a> hashtableOfIntNw;
        try {
            if (DW) {
                iy.J0(-2578818473466128019L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.j6.refactoringCallback.g3();
            HashtableOfInt<Tools.a> hashtableOfInt = new HashtableOfInt<>();
            f2 f2Var = new f2();
            for (SyntaxTree syntaxTree : this.j6.syntaxTreeSpace.QX(fileEntry)) {
                if (syntaxTree.getLanguage().getTools() != null && (hashtableOfIntNw = syntaxTree.getLanguage().getTools().nw(syntaxTree, f2Var, i, i2, i3)) != null) {
                    hashtableOfIntNw.j6.DW();
                    while (hashtableOfIntNw.j6.j6()) {
                        int iFH = hashtableOfIntNw.j6.FH();
                        Tools.a aVarHw = hashtableOfIntNw.j6.Hw();
                        if (hashtableOfInt.Hw(iFH)) {
                            hashtableOfInt.VH(iFH, hashtableOfInt.v5(iFH).j6(aVarHw, null));
                        } else {
                            hashtableOfInt.VH(iFH, aVarHw);
                        }
                    }
                }
            }
            v5(fileEntry, hashtableOfInt, i, i2, i3);
            this.j6.refactoringCallback.XL();
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, -2578818473466128019L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070 A[PHI: r2
      0x0070: PHI (r2v2 com.aide.codemodel.api.abstraction.Language) = 
      (r2v1 com.aide.codemodel.api.abstraction.Language)
      (r2v1 com.aide.codemodel.api.abstraction.Language)
      (r2v11 com.aide.codemodel.api.abstraction.Language)
      (r2v11 com.aide.codemodel.api.abstraction.Language)
     binds: [B:9:0x0045, B:11:0x004f, B:13:0x0061, B:15:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @abcd.ey(method = -753919870133457407L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void VH(com.aide.codemodel.api.FileEntry r18, int r19, int r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.g0.VH(com.aide.codemodel.api.FileEntry, int, int, int):void");
    }

    @ey(method = 390727058377288689L)
    public void gn(FileEntry fileEntry, int i, int i2, int i3) {
        Iterator<SyntaxTree> it;
        HashtableOfInt<Tools.a> hashtableOfInt;
        try {
            if (DW) {
                iy.J0(-1836941903673830371L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.j6.refactoringCallback.g3();
            int i4 = i + 1;
            List<SyntaxTree> listJ0 = fileEntry.j3(i4).trim().length() == 0 ? this.j6.syntaxTreeSpace.J0(fileEntry, i4, 1, "i;") : this.j6.syntaxTreeSpace.QX(fileEntry);
            f2 f2Var = new f2();
            f2Var.j6(-1, i4, 1, i4, 2);
            for (SyntaxTree syntaxTree : listJ0) {
                if (syntaxTree.getLanguage().getTools() != null) {
                    f2Var.FH(syntaxTree);
                }
            }
            SyntaxTree syntaxTreeZo = Zo(listJ0, i, i2 - 1);
            Language language = null;
            if (syntaxTreeZo != null && syntaxTreeZo.getLanguage().getTools() != null) {
                language = syntaxTreeZo.getLanguage();
                syntaxTreeZo.getLanguage().getTools().lg(syntaxTreeZo, f2Var, i, i2);
            }
            Language language2 = language;
            int iGn = f2Var.gn(-1);
            HashtableOfInt<Tools.a> hashtableOfInt2 = new HashtableOfInt<>();
            Iterator<SyntaxTree> it2 = listJ0.iterator();
            while (it2.hasNext()) {
                SyntaxTree next = it2.next();
                if (next.getLanguage().getTools() != null) {
                    it = it2;
                    hashtableOfInt = hashtableOfInt2;
                    HashtableOfInt<Tools.a> hashtableOfIntXL = next.getLanguage().getTools().XL(next, f2Var, i4, iGn, i3);
                    if (hashtableOfIntXL != null) {
                        hashtableOfIntXL.j6.DW();
                        while (hashtableOfIntXL.j6.j6()) {
                            int iFH = hashtableOfIntXL.j6.FH();
                            Tools.a aVarHw = hashtableOfIntXL.j6.Hw();
                            if (hashtableOfInt.Hw(iFH)) {
                                hashtableOfInt.VH(iFH, hashtableOfInt.v5(iFH).j6(aVarHw, language2));
                            } else {
                                hashtableOfInt.VH(iFH, aVarHw);
                            }
                        }
                    }
                } else {
                    it = it2;
                    hashtableOfInt = hashtableOfInt2;
                }
                hashtableOfInt2 = hashtableOfInt;
                it2 = it;
            }
            v5(fileEntry, hashtableOfInt2, i4, iGn, i3);
            this.j6.refactoringCallback.XL();
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, -1836941903673830371L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -475967152661060979L)
    public void j6(FileEntry fileEntry, int i, int i2, int i3) {
        try {
            if (DW) {
                iy.J0(2143644636162142817L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.j6.refactoringCallback.g3();
            Hw(fileEntry, i, i2, i3);
            this.j6.refactoringCallback.XL();
        } catch (Throwable th) {
            if (FH) {
                iy.a8(th, 2143644636162142817L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 25998653019884069L)
    public void u7(FileEntry fileEntry, int i) {
        Set<? extends FormatOption> setJ3;
        try {
            if (DW) {
                iy.EQ(5246843434886226929L, this, fileEntry, new Integer(i));
            }
            for (SyntaxTree syntaxTree : this.j6.syntaxTreeSpace.QX(fileEntry)) {
                if (syntaxTree.getLanguage().getTools() != null && (setJ3 = syntaxTree.getLanguage().getTools().j3(syntaxTree, i)) != null) {
                    this.j6.refactoringCallback.EQ(syntaxTree.getLanguage(), new HashSet(setJ3));
                }
            }
        } catch (Throwable th) {
            if (FH) {
                iy.Mr(th, 5246843434886226929L, this, fileEntry, new Integer(i));
            }
            throw th;
        }
    }
}
