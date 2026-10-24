package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.f2;
import abcd.f7;
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

@cy(clazz = -857798532658097740L, container = -857798532658097740L, user = true)
/* loaded from: classes.dex */
public class JavaScriptCommentsTools implements Tools {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 1381555221109728091L)
    private final f7 DW;

    @dy(field = 568404940693527312L)
    private final Model j6;

    static {
        iy.Zo(JavaScriptCommentsTools.class);
    }

    @ey(method = 6903291413442884087L)
    public JavaScriptCommentsTools(Model model, JavaScriptCommentsLanguage javaScriptCommentsLanguage) {
        try {
            if (FH) {
                iy.EQ(2662848768878641383L, null, model, javaScriptCommentsLanguage);
            }
            this.j6 = model;
            this.DW = new f7(model, javaScriptCommentsLanguage);
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 2662848768878641383L, null, model, javaScriptCommentsLanguage);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1884227981770301597L)
    public void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) {
        try {
            if (FH) {
                iy.QX(-260473180073222144L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -260473180073222144L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3023548199442978323L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-3142346099228762400L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            for (int i3 = i; i3 <= i2; i3++) {
                this.j6.refactoringCallback.nw(fileEntry, i3, 1, i3, 1, "//");
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -3142346099228762400L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -799109807231797413L)
    public String EQ(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(-2292972518207487600L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -2292972518207487600L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2943480986133191192L)
    public boolean FH(String str) {
        try {
            if (!FH) {
                return false;
            }
            iy.tp(1258788561460622643L, this, str);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1258788561460622643L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3707650452218584424L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (FH) {
                iy.J0(4699400854240495473L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 4699400854240495473L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -21048217510164624L)
    public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(1555077529978430205L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 1555077529978430205L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2949657446514090389L)
    public void J0(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(2205071228402722944L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 2205071228402722944L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4849879443518792291L)
    public void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (FH) {
                iy.J0(2440738996763923956L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 2440738996763923956L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2378549183628919375L)
    public String KD(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(-374228919169039440L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -374228919169039440L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2943852168276226100L)
    public void Mr(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-394546488747149431L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -394546488747149431L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -717380743987060736L)
    public String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.we(260599747559030765L, this, syntaxTree, mapOf, setOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 260599747559030765L, this, syntaxTree, mapOf, setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5610694222812581111L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(4527910638403601928L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 4527910638403601928L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -29515125618363575L)
    public boolean QX(FileEntry fileEntry, int i, int i2) {
        try {
            if (!FH) {
                return false;
            }
            iy.we(-175604648275483956L, this, fileEntry, new Integer(i), new Integer(i2));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -175604648275483956L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -7885717608600212780L)
    public void SI(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(-4135009200813783513L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -4135009200813783513L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5280184615056025875L)
    public void Sf(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (FH) {
                iy.we(5496068381559964488L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 5496068381559964488L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4341195810998234048L)
    public boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (FH) {
                iy.QX(-1971796633214259159L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -1971796633214259159L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -905795970720816912L)
    public void VH(FileEntry fileEntry) {
        try {
            if (FH) {
                iy.tp(-459564483177463023L, this, fileEntry);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -459564483177463023L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 791169296500117744L)
    public String Ws() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-347784501017078225L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -347784501017078225L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -623265926864680113L)
    public HashtableOfInt<Tools.a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (FH) {
                iy.J8(6858030146740938480L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.Hw(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 6858030146740938480L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4300566606277049856L)
    public void Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(7792731537992331355L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 7792731537992331355L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1079136862252321384L)
    public void a8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (FH) {
                iy.J8(56388989274131941L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 56388989274131941L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5874914676884218619L)
    public String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2) {
        try {
            if (!FH) {
                return null;
            }
            iy.J8(643918855617722052L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 643918855617722052L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1847769176183264568L)
    public String ca(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(333070663348972395L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 333070663348972395L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -492361178035769328L)
    public String cb(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(-35865479978108221L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -35865479978108221L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5967063110568253720L)
    public void cn(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-2921191166131190839L, this, fileEntry, new Integer(i), new Integer(i2));
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
                iy.U2(th, -2921191166131190839L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 406368556716957639L)
    public void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) {
        try {
            if (FH) {
                iy.QX(514405037999471112L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 514405037999471112L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 33953503500415744L)
    public String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(-8409618419542026723L, this, syntaxTree, mapOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -8409618419542026723L, this, syntaxTree, mapOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2611081927479221L)
    public String ei(String str, String str2) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(1652307894451329408L, this, str, str2);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1652307894451329408L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4926855238799812784L)
    public void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (FH) {
                iy.J8(-5088948103357395925L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.j6.codeCompleterCallback.a8(fileEntry, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -5088948103357395925L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1552856401504742085L)
    public void g3(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-656387035979091956L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -656387035979091956L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 794722682389926960L)
    public void gW(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (FH) {
                iy.J0(-68123470886690841L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -68123470886690841L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4658388497090146585L)
    public void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) {
        try {
            if (FH) {
                iy.QX(-4598320566836522772L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -4598320566836522772L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4637555804058034176L)
    public Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(5594293009263998851L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 5594293009263998851L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 945234451888234375L)
    public HashtableOfInt<Tools.a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (FH) {
                iy.J8(4021197879830818336L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.Hw(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 4021197879830818336L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4086941860965120811L)
    public void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (FH) {
                iy.J0(-1062599156501344384L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.DW.j6(syntaxTree, f2Var, i);
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -1062599156501344384L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3168067159953033360L)
    public HashtableOfInt<Tools.a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (FH) {
                iy.J8(-1051778192815009275L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.v5(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -1051778192815009275L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1877942979453095024L)
    public void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.QX(-1283257035408767773L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -1283257035408767773L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4756232688019518592L)
    public void ro(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (FH) {
                iy.J8(2538764962017166181L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 2538764962017166181L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5199177287289079227L)
    public void sG(FileEntry fileEntry, String str) {
        try {
            if (FH) {
                iy.EQ(930042766240757708L, this, fileEntry, str);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 930042766240757708L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 18183204850202613L)
    public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) {
        try {
            if (FH) {
                iy.QX(2123311774058055000L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 2123311774058055000L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2632704386616377225L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(2157639681277701612L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 2157639681277701612L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -522281001395306263L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(-1955338289724757080L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -1955338289724757080L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 117288696611266827L)
    public int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(959246328396122112L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 959246328396122112L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1125688614142182892L)
    public String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(3663932536661489133L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 3663932536661489133L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3781704879503348976L)
    public void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (FH) {
                iy.QX(2969653215507633531L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 2969653215507633531L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1401488034317119540L)
    public void we(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(307875245350495749L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 307875245350495749L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2706684598085070625L)
    public void x9(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(380116852492566912L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 380116852492566912L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -680843417982461811L)
    public void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (FH) {
                iy.J8(-2176341338786848080L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -2176341338786848080L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
