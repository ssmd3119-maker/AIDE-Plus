package abcd;

import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.language.java.JSharpCommentsLanguage;
import com.aide.codemodel.language.java.JavaFormatterOption;

@cy(clazz = 1198773388653793404L, container = 1198773388653793404L, user = true)
/* loaded from: classes.dex */
public class d6 {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 3646569781482663420L)
    private final JSharpCommentsLanguage DW;

    @dy(field = -1094960060084231040L)
    private f2 FH;

    @dy(field = -1093312924671528484L)
    private SyntaxTree Hw;

    @dy(field = -3665336254781189320L)
    private HashtableOfInt<Tools.a> VH;

    @dy(field = 3672382060584830280L)
    private int Zo;

    @dy(field = -490477962811800083L)
    private final Model j6;

    @dy(field = 3349971541120703273L)
    private int v5;

    static {
        iy.Zo(d6.class);
    }

    @ey(method = 273793131781238789L)
    public d6(Model model, JSharpCommentsLanguage jSharpCommentsLanguage) {
        try {
            if (gn) {
                iy.EQ(-1589211564975914648L, null, model, jSharpCommentsLanguage);
            }
            this.VH = new HashtableOfInt<>();
            this.j6 = model;
            this.DW = jSharpCommentsLanguage;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -1589211564975914648L, null, model, jSharpCommentsLanguage);
            }
            throw th;
        }
    }

    @ey(method = -5225413038766018560L)
    private void DW(int i) {
        try {
            if (gn) {
                iy.u7(-3681792564575668365L, this, i);
            }
            if (FH(i)) {
                if (this.Hw.getSyntaxTag(i) == 1 && this.FH.tp(this.Hw, i) == 1) {
                    this.VH.VH(this.FH.EQ(this.Hw, i), new Tools.a(this.DW, 0, false, true, 500));
                } else if (this.Hw.getSyntaxTag(i) == 2) {
                    for (int iEQ = this.FH.EQ(this.Hw, i) + 1; iEQ <= this.FH.u7(this.Hw, i); iEQ++) {
                        this.VH.VH(iEQ, new Tools.a(this.DW, 1, true, false, 500));
                    }
                }
                int childCount = this.Hw.getChildCount(i);
                for (int i2 = 0; i2 < childCount; i2++) {
                    DW(this.Hw.getChildNode(i, i2));
                }
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -3681792564575668365L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2336643795374403365L)
    private boolean FH(int i) {
        try {
            if (gn) {
                iy.u7(4801981957426580808L, this, i);
            }
            if (this.v5 >= this.FH.EQ(this.Hw, i)) {
                return this.Zo <= this.FH.u7(this.Hw, i);
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 4801981957426580808L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7186047661396698663L)
    public HashtableOfInt<Tools.a> Hw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (gn) {
                iy.J0(2240228302073082000L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.Zo = i;
            this.v5 = i2;
            this.FH = f2Var;
            this.Hw = syntaxTree;
            this.VH.FH();
            DW(syntaxTree.getRootNode());
            return this.VH;
        } catch (Throwable th) {
            if (u7) {
                iy.a8(th, 2240228302073082000L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1192917070315049156L)
    public void j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        int iPa;
        try {
            if (gn) {
                iy.J0(2428330856546380175L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            if (this.j6.Ws().j6(syntaxTree.getLanguage()).contains(JavaFormatterOption.AUTO_INSERT_JAVADOC_ASTERISK_ONTYPE) && (iPa = syntaxTree.Pa(i, i2)) != -1 && syntaxTree.getSyntaxTag(iPa) == 2) {
                int i3 = i + 1;
                this.j6.refactoringCallback.nw(syntaxTree.getFile(), i3, 1, i3, 1, "* ");
            }
        } catch (Throwable th) {
            if (u7) {
                iy.a8(th, 2428330856546380175L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1637532823710597072L)
    public HashtableOfInt<Tools.a> v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (gn) {
                iy.J0(-966570108892484235L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            return Hw(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (u7) {
                iy.a8(th, -966570108892484235L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
