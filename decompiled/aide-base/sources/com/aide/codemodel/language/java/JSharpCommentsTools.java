package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.d6;
import abcd.dy;
import abcd.ey;
import abcd.f2;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.callback.TemplateEvaluatorCallback;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.codemodel.api.collections.MapOf;
import com.aide.codemodel.api.collections.SetOf;
import java.util.List;
import java.util.Set;

@cy(clazz = 1749859680854032800L, container = 1749859680854032800L, user = true)
/* loaded from: classes.dex */
public class JSharpCommentsTools implements Tools {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -3850479752689420925L)
    private final d6 DW;

    @dy(field = 9261757548233744L)
    private final Model j6;

    static {
        iy.Zo(JSharpCommentsTools.class);
    }

    @ey(method = -774895550289410000L)
    public JSharpCommentsTools(Model model, JSharpCommentsLanguage jSharpCommentsLanguage) {
        try {
            if (FH) {
                iy.EQ(-3888784245042688509L, null, model, jSharpCommentsLanguage);
            }
            this.j6 = model;
            this.DW = new d6(model, jSharpCommentsLanguage);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -3888784245042688509L, null, model, jSharpCommentsLanguage);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4923902595029280681L)
    public void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) {
        try {
            if (FH) {
                iy.QX(-1035878725387793952L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -1035878725387793952L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5081619862286893591L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(349919608242488064L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            for (int i3 = i; i3 <= i2; i3++) {
                this.j6.refactoringCallback.nw(fileEntry, i3, 1, i3, 1, "//");
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 349919608242488064L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -6125838688374337263L)
    public String EQ(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(-5788246595223769056L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5788246595223769056L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4413264235580129556L)
    public boolean FH(String str) {
        try {
            if (!FH) {
                return false;
            }
            iy.tp(2104270309234241741L, this, str);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 2104270309234241741L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 752396920535263476L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (FH) {
                iy.J0(-5646722769824326137L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -5646722769824326137L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 116789414735215820L)
    public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(1556219909011975035L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 1556219909011975035L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1098184464882740129L)
    public void J0(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(1050444214111233920L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1050444214111233920L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 8204975459465118499L)
    public void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (FH) {
                iy.J0(-1715157369665574120L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -1715157369665574120L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2480797704751964595L)
    public String KD(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(1435738872970039872L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1435738872970039872L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2453407849779561080L)
    public void Mr(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(920875325466833943L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 920875325466833943L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 447300520644515536L)
    public String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.we(-1593734627797292129L, this, syntaxTree, mapOf, setOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -1593734627797292129L, this, syntaxTree, mapOf, setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -6466589852486494835L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(2415367035764316720L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 2415367035764316720L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 990303423561836495L)
    public boolean QX(FileEntry fileEntry, int i, int i2) {
        try {
            if (!FH) {
                return false;
            }
            iy.we(-108753809321780280L, this, fileEntry, new Integer(i), new Integer(i2));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -108753809321780280L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3760640822526838472L)
    public void SI(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(4923482112551890521L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 4923482112551890521L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5059113752081387867L)
    public void Sf(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (FH) {
                iy.we(3839028558851341380L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 3839028558851341380L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1162730332618340376L)
    public boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (FH) {
                iy.QX(2611948453713172155L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 2611948453713172155L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1054067777523216668L)
    public void VH(FileEntry fileEntry) {
        try {
            if (FH) {
                iy.tp(-3155736057310881681L, this, fileEntry);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3155736057310881681L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1250836740994794240L)
    public String Ws() {
        try {
            if (!FH) {
                return "";
            }
            iy.gn(-438333092683494267L, this);
            return "";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -438333092683494267L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 94626344183984781L)
    public HashtableOfInt<Tools.a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (FH) {
                iy.J8(4921277141324755008L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.Hw(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 4921277141324755008L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -709365003865844400L)
    public void Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-440916657378119975L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -440916657378119975L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -413856151325673060L)
    public void a8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (FH) {
                iy.J8(-961918608885703701L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -961918608885703701L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3565659152407581083L)
    public String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2) {
        try {
            if (!FH) {
                return null;
            }
            iy.J8(-360809338002029432L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -360809338002029432L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1767157259367701376L)
    public String ca(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(-1243217042885874415L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1243217042885874415L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1606817424791203896L)
    public String cb(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(-7657182064467333527L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -7657182064467333527L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5823238084139879452L)
    public void cn(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(4063788174787413439L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            List<String> listA8 = fileEntry.a8();
            for (int i3 = i; i3 <= Math.min(listA8.size() - 1, i2); i3++) {
                String str = listA8.get(i3);
                if (str.trim().startsWith("//")) {
                    int iIndexOf = str.indexOf("//") + 1;
                    this.j6.refactoringCallback.nw(fileEntry, i3, iIndexOf, i3, iIndexOf + 2, "");
                }
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 4063788174787413439L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 257566734017769897L)
    public void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) {
        try {
            if (FH) {
                iy.QX(7904415388375894188L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 7904415388375894188L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 111903359531777424L)
    public String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(-6746913509335782673L, this, syntaxTree, mapOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -6746913509335782673L, this, syntaxTree, mapOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 340366903188061617L)
    public String ei(String str, String str2) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(3944837746859296304L, this, str, str2);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3944837746859296304L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 631994982479224584L)
    public void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (FH) {
                iy.J8(3769784026069913553L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.j6.codeCompleterCallback.a8(fileEntry, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 3769784026069913553L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1416558201120075709L)
    public void g3(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(830244550125556000L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 830244550125556000L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3133290230172044800L)
    public void gW(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (FH) {
                iy.J0(-731892448682011923L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -731892448682011923L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -626305054001561825L)
    public void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) {
        try {
            if (FH) {
                iy.QX(-6122227723495732728L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -6122227723495732728L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4686291481361430512L)
    public Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(197016206532340497L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 197016206532340497L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4541886588119248125L)
    public HashtableOfInt<Tools.a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (FH) {
                iy.J8(1081425006338382568L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.Hw(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 1081425006338382568L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3860158260541272481L)
    public void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (FH) {
                iy.J0(-255916903688630976L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.DW.j6(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -255916903688630976L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2526121767069445248L)
    public HashtableOfInt<Tools.a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (FH) {
                iy.J8(-2865684552687841417L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.v5(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -2865684552687841417L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1578165527414941184L)
    public void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.QX(692689069043781057L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 692689069043781057L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 6015547719206831376L)
    public void ro(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (FH) {
                iy.J8(1474489465296773575L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 1474489465296773575L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1565683514503277715L)
    public void sG(FileEntry fileEntry, String str) {
        try {
            if (FH) {
                iy.EQ(-6465567812375713840L, this, fileEntry, str);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -6465567812375713840L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -673577484280602909L)
    public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) {
        try {
            if (FH) {
                iy.QX(6361552239453919756L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 6361552239453919756L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2467523278552911897L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(1396938891089973024L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 1396938891089973024L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 45887166268793603L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(5535776785837833232L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 5535776785837833232L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 469158655796854165L)
    public int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(2622595860375386516L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 2622595860375386516L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3826404621598503624L)
    public String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(-1257707483400736005L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -1257707483400736005L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2061758702168040L)
    public void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (FH) {
                iy.QX(-140976700004241055L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -140976700004241055L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4126265146123934176L)
    public void we(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(541267478251366827L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 541267478251366827L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 84906443653571901L)
    public void x9(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(-4125062304101570400L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -4125062304101570400L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1098322565410180159L)
    public void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (FH) {
                iy.J8(-7005442665192127128L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -7005442665192127128L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
