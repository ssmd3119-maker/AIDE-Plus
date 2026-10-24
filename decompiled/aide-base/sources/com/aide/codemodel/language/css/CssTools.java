package com.aide.codemodel.language.css;

import abcd.cy;
import abcd.d5;
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

@cy(clazz = -1897070760985813343L, container = -1897070760985813343L, user = true)
/* loaded from: classes.dex */
public class CssTools implements Tools {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -2358020518023131367L)
    private final d5 DW;

    @dy(field = 101261082156606831L)
    private final Model j6;

    static {
        iy.Zo(CssTools.class);
    }

    @ey(method = -418789613362815484L)
    public CssTools(Model model) {
        try {
            if (FH) {
                iy.tp(-1405037767202019711L, null, model);
            }
            this.j6 = model;
            this.DW = new d5(model);
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1405037767202019711L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4172328330213087096L)
    public void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) {
        try {
            if (FH) {
                iy.QX(447616927163393319L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 447616927163393319L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2183462742285643856L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-1644537627151780095L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -1644537627151780095L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1546435539376747056L)
    public String EQ(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(-7899211388632694425L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -7899211388632694425L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1216345513038752825L)
    public boolean FH(String str) {
        try {
            if (!FH) {
                return false;
            }
            iy.tp(3389463548178577960L, this, str);
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 3389463548178577960L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -186245022569475797L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (FH) {
                iy.J0(-5335651512772658792L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -5335651512772658792L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -592697476515754273L)
    public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(-7717533666089343776L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -7717533666089343776L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2547665407308983288L)
    public void J0(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(1435901655692487087L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1435901655692487087L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4976902793657657064L)
    public void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (FH) {
                iy.J0(-135189995289852447L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -135189995289852447L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3732870887237204064L)
    public String KD(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(-3206872834565102341L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -3206872834565102341L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1831079828302762947L)
    public void Mr(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(1846503874015522180L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1846503874015522180L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 44571471593281875L)
    public String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.we(-7016953326647686240L, this, syntaxTree, mapOf, setOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -7016953326647686240L, this, syntaxTree, mapOf, setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3596238169909531200L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-3984678182654886125L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -3984678182654886125L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1960404705731661480L)
    public boolean QX(FileEntry fileEntry, int i, int i2) {
        try {
            if (!FH) {
                return false;
            }
            iy.we(-790710988147249251L, this, fileEntry, new Integer(i), new Integer(i2));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -790710988147249251L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 7467744705093270381L)
    public void SI(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(-6240153930421903716L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -6240153930421903716L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 8151692023302332076L)
    public void Sf(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (FH) {
                iy.we(-443328691379179945L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -443328691379179945L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5609981635364583425L)
    public boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (FH) {
                iy.QX(-1371600632439773120L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -1371600632439773120L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1219297156335622019L)
    public void VH(FileEntry fileEntry) {
        try {
            if (FH) {
                iy.tp(715414258777968000L, this, fileEntry);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 715414258777968000L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1206189742121480103L)
    public String Ws() {
        try {
            if (!FH) {
                return "";
            }
            iy.gn(-426740642238844440L, this);
            return "";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -426740642238844440L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1264150827748579040L)
    public HashtableOfInt<Tools.a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (!FH) {
                return null;
            }
            iy.J8(-222532215054241925L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -222532215054241925L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -52530624115732635L)
    public void Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-6772912376507768192L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -6772912376507768192L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2208954298058385825L)
    public void a8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (FH) {
                iy.J8(-631693478344010664L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -631693478344010664L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2880429755982202760L)
    public String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2) {
        try {
            if (!FH) {
                return null;
            }
            iy.J8(-3367554046295715255L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -3367554046295715255L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -397275837214316491L)
    public String ca(Namespace namespace) {
        try {
            if (!FH) {
                return null;
            }
            iy.tp(22157014240495552L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 22157014240495552L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -971372390167037595L)
    public String cb(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(681727597848125024L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 681727597848125024L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5645136194079120445L)
    public void cn(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(6007873798189626648L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 6007873798189626648L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 945967833889678068L)
    public void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) {
        try {
            if (FH) {
                iy.QX(-170590785705863621L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -170590785705863621L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 342300469771565859L)
    public String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(1101205867552352L, this, syntaxTree, mapOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 1101205867552352L, this, syntaxTree, mapOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 163126718339762072L)
    public String ei(String str, String str2) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(627009773580041583L, this, str, str2);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 627009773580041583L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1403316422859221805L)
    public void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (FH) {
                iy.J8(-1873908563102996544L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.DW.Hw(syntaxTree, fileEntry, language, i, i2);
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -1873908563102996544L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2353846971117184736L)
    public void g3(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(1063445193921403495L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, 1063445193921403495L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2683423344695205825L)
    public void gW(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (FH) {
                iy.J0(225842857061091400L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 225842857061091400L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2793812285481320L)
    public void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) {
        try {
            if (FH) {
                iy.QX(1721321155412017965L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, 1721321155412017965L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5893642617660968605L)
    public Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i) {
        try {
            if (!FH) {
                return null;
            }
            iy.EQ(3014099391190462176L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, 3014099391190462176L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5805988150306429904L)
    public HashtableOfInt<Tools.a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (!FH) {
                return null;
            }
            iy.J8(-4343833797132731269L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -4343833797132731269L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3032280273460620984L)
    public void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (FH) {
                iy.J0(-2921040224430508305L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, -2921040224430508305L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4836557751905881949L)
    public HashtableOfInt<Tools.a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (!FH) {
                return null;
            }
            iy.J8(-2386498796928339416L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -2386498796928339416L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -540820680228525163L)
    public void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.QX(-706213570215566792L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -706213570215566792L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -556323303298137733L)
    public void ro(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (FH) {
                iy.J8(-1337478901846090432L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -1337478901846090432L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -873912637053935696L)
    public void sG(FileEntry fileEntry, String str) {
        try {
            if (FH) {
                iy.EQ(-602510462540419257L, this, fileEntry, str);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.Mr(th, -602510462540419257L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -524100608442506844L)
    public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) {
        try {
            if (FH) {
                iy.QX(-3716082833911446447L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -3716082833911446447L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -835571637379941984L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(1648635110378261517L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 1648635110378261517L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1192961495446875360L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(-80286768063979155L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -80286768063979155L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -22240403838556884L)
    public int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(1421262090309082175L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 1421262090309082175L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2389735693259622921L)
    public String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf) {
        try {
            if (!FH) {
                return null;
            }
            iy.J0(963691313790331116L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.a8(th, 963691313790331116L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 7613514057787744509L)
    public void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (FH) {
                iy.QX(-6042224757474249472L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.rN(th, -6042224757474249472L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1103047397983914633L)
    public void we(FileEntry fileEntry, int i, int i2) {
        try {
            if (FH) {
                iy.we(-2420875079480693700L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.U2(th, -2420875079480693700L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3897077695748171784L)
    public void x9(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (FH) {
                iy.J8(-1350665895408958205L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, -1350665895408958205L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 150781188106115952L)
    public void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (FH) {
                iy.J8(2206165018638776377L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.lg(th, 2206165018638776377L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
