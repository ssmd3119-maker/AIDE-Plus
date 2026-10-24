package abcd;

import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.language.js.JavaScriptCommentsLanguage;

@cy(clazz = -2703697804603003920L, container = -2703697804603003920L, user = true)
/* loaded from: classes.dex */
public class f7 {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 2011471918534782900L)
    private final JavaScriptCommentsLanguage DW;

    @dy(field = 755347233176752928L)
    private f2 FH;

    @dy(field = 753311917621712820L)
    private SyntaxTree Hw;

    @dy(field = -4988026741785052704L)
    private HashtableOfInt<Tools.a> VH;

    @dy(field = -781074591771632360L)
    private int Zo;

    @dy(field = -1805587259379774695L)
    private final Model j6;

    @dy(field = 101932898480002413L)
    private int v5;

    static {
        iy.Zo(f7.class);
    }

    @ey(method = -2847414383310143360L)
    public f7(Model model, JavaScriptCommentsLanguage javaScriptCommentsLanguage) {
        try {
            if (gn) {
                iy.EQ(-1647102518606091432L, null, model, javaScriptCommentsLanguage);
            }
            this.VH = new HashtableOfInt<>();
            this.j6 = model;
            this.DW = javaScriptCommentsLanguage;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -1647102518606091432L, null, model, javaScriptCommentsLanguage);
            }
            throw th;
        }
    }

    @ey(method = -1016309731784130680L)
    private void DW(int i) {
        try {
            if (gn) {
                iy.u7(2251361560231559007L, this, i);
            }
            if (FH(i)) {
                if (this.Hw.getSyntaxTag(i) == 1 && this.FH.tp(this.Hw, i) == 1) {
                    this.VH.VH(this.FH.EQ(this.Hw, i), new Tools.a(this.DW, 0, false, true, 0));
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
                iy.j3(th, 2251361560231559007L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3103885818968235105L)
    private boolean FH(int i) {
        try {
            if (gn) {
                iy.u7(-616957933189789440L, this, i);
            }
            if (this.v5 >= this.FH.EQ(this.Hw, i)) {
                return this.Zo <= this.FH.u7(this.Hw, i);
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -616957933189789440L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5899019556363071523L)
    public HashtableOfInt<Tools.a> Hw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (gn) {
                iy.J0(-6732093250469963664L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
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
                iy.a8(th, -6732093250469963664L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -901204715390220497L)
    public void j6(SyntaxTree syntaxTree, f2 f2Var, int i) {
        try {
            if (gn) {
                iy.we(129983723363196080L, this, syntaxTree, f2Var, new Integer(i));
            }
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, 129983723363196080L, this, syntaxTree, f2Var, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -414476192423598912L)
    public HashtableOfInt<Tools.a> v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (gn) {
                iy.J0(410491501691004981L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            return Hw(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (u7) {
                iy.a8(th, 410491501691004981L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }
}
