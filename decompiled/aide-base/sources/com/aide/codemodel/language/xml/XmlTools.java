package com.aide.codemodel.language.xml;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.f2;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.w7;
import abcd.y7;
import abcd.z7;
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

@cy(clazz = 1010501436938537065L, container = 1010501436938537065L, user = true)
/* loaded from: classes.dex */
public class XmlTools implements Tools {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -1332211849537951909L)
    private final z7 DW;

    @dy(field = -3010890552775801696L)
    private final y7 FH;

    @dy(field = -503388224877062583L)
    private final w7 Hw;

    @dy(field = 102912974583382600L)
    private final Model j6;

    static {
        iy.Zo(XmlTools.class);
    }

    @ey(method = 883946881387392499L)
    public XmlTools(Model model, XmlLanguage xmlLanguage, boolean z) {
        try {
            if (v5) {
                iy.we(-1574519301101311920L, null, model, xmlLanguage, new Boolean(z));
            }
            this.j6 = model;
            this.DW = new z7(model, xmlLanguage);
            this.FH = new y7(model, xmlLanguage, z);
            this.Hw = new w7(model, xmlLanguage);
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -1574519301101311920L, null, model, xmlLanguage, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1849110850037684793L)
    private int Qq(String str) {
        try {
            if (v5) {
                iy.tp(1869820821095322120L, this, str);
            }
            int i = 0;
            while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            return i + 1;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 1869820821095322120L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -5341401720954772L)
    private void aj(SyntaxTree syntaxTree, int i) {
        try {
            if (v5) {
                iy.EQ(2366403061129824853L, this, syntaxTree, new Integer(i));
            }
            lp(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 1), syntaxTree.getChildNode(syntaxTree.getChildNode(i, 2), 1));
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 2366403061129824853L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -205019711792590435L)
    private void lp(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (v5) {
                iy.we(289467232685241160L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (syntaxTree.isSyntheticNode(i) || syntaxTree.isSyntheticNode(i2)) {
                return;
            }
            this.j6.tp.DW(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), syntaxTree.getStartLine(i2), syntaxTree.getStartColumn(i2), syntaxTree.getEndLine(i2), syntaxTree.getEndColumn(i2));
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 289467232685241160L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -603203008029866595L)
    private int sy(String str) {
        try {
            if (v5) {
                iy.tp(-472086351111739140L, this, str);
            }
            int length = str.length() - 1;
            while (length > 0) {
                if (!Character.isWhitespace(str.charAt(length))) {
                    break;
                }
                length--;
            }
            return length + 1;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -472086351111739140L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1935292057003135779L)
    public void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) {
        try {
            if (v5) {
                iy.QX(-478182998222750076L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.rN(th, -478182998222750076L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1876528946961052293L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(2517929480133794496L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            int iQq = Qq(fileEntry.j3(i));
            this.j6.refactoringCallback.nw(fileEntry, i, iQq, i, iQq, "<!--");
            int iSy = sy(fileEntry.j3(i2)) + 1;
            if (i == i2) {
                iSy += 4;
            }
            int i3 = iSy;
            this.j6.refactoringCallback.nw(fileEntry, i2, i3, i2, i3, "-->");
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 2517929480133794496L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -210262551515310173L)
    public String EQ(Namespace namespace) {
        try {
            if (!v5) {
                return null;
            }
            iy.tp(-2320507863624455712L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -2320507863624455712L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1820970197408715600L)
    public boolean FH(String str) {
        try {
            if (!v5) {
                return false;
            }
            iy.tp(-1454639518865758733L, this, str);
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -1454639518865758733L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -172196600892424800L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (v5) {
                iy.J0(711241113394162617L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 711241113394162617L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -697987332493010456L)
    public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(-1807382166699742947L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -1807382166699742947L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 42898433896070795L)
    public void J0(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(-3941912067738213900L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -3941912067738213900L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 850503756133767229L)
    public void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (v5) {
                iy.J0(6166254513527951040L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.DW.v5(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 6166254513527951040L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3423625244721236153L)
    public String KD(Namespace namespace) {
        try {
            if (!v5) {
                return null;
            }
            iy.tp(-1670892993668847816L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -1670892993668847816L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1538128047908935252L)
    public void Mr(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(961919751465946021L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 961919751465946021L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 26074865959995440L)
    public String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf) {
        try {
            if (!v5) {
                return null;
            }
            iy.we(7770089407291155249L, this, syntaxTree, mapOf, setOf);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 7770089407291155249L, this, syntaxTree, mapOf, setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2667032265719758321L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(-3943172402235690720L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -3943172402235690720L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -549618688145959687L)
    public boolean QX(FileEntry fileEntry, int i, int i2) {
        try {
            if (!v5) {
                return false;
            }
            iy.we(164711689744161792L, this, fileEntry, new Integer(i), new Integer(i2));
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 164711689744161792L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 6040358655584040628L)
    public void SI(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(-474093140711396373L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -474093140711396373L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 7394975738996654347L)
    public void Sf(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (v5) {
                iy.we(-1922970941579436048L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iPa = syntaxTree.Pa(i, i2 - 1);
            if (iPa != -1) {
                int syntaxTag = syntaxTree.getSyntaxTag(iPa);
                if (syntaxTag != 7) {
                    if (syntaxTag != 8) {
                        if (syntaxTag != 11) {
                            if (syntaxTag != 12) {
                                if (syntaxTag == 25 || syntaxTag == 49) {
                                    int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(iPa));
                                    int syntaxTag2 = syntaxTree.getSyntaxTag(parentNode);
                                    if (syntaxTag2 == 200) {
                                        aj(syntaxTree, syntaxTree.getParentNode(parentNode));
                                        return;
                                    } else if (syntaxTag2 == 207) {
                                        aj(syntaxTree, syntaxTree.getParentNode(parentNode));
                                        return;
                                    }
                                } else if (syntaxTag != 76) {
                                    if (syntaxTag != 100) {
                                        switch (syntaxTag) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    lp(syntaxTree, iPa, syntaxTree.getChildNode(syntaxTree.getParentNode(iPa), 0));
                    return;
                }
                lp(syntaxTree, iPa, syntaxTree.getChildNode(syntaxTree.getParentNode(iPa), syntaxTree.getChildCount(r1) - 1));
                return;
            }
            this.j6.tp.FH(syntaxTree.getFile());
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -1922970941579436048L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -43198577290465440L)
    public boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (v5) {
                iy.QX(673448448851259525L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.rN(th, 673448448851259525L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2669549799577149896L)
    public void VH(FileEntry fileEntry) {
        try {
            if (v5) {
                iy.tp(489926657373165753L, this, fileEntry);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 489926657373165753L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -948992896901749640L)
    public String Ws() {
        try {
            if (!v5) {
                return "";
            }
            iy.gn(-193302768788419601L, this);
            return "";
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -193302768788419601L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 380036968820665415L)
    public HashtableOfInt<Tools.a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (v5) {
                iy.J8(6193409928459745912L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.J0(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 6193409928459745912L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 214053975399753776L)
    public void Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(1937374321911848967L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 1937374321911848967L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1035640015185759440L)
    public void a8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (v5) {
                iy.J8(175451714998947989L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 175451714998947989L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1915276579839177275L)
    public String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2) {
        try {
            if (!v5) {
                return null;
            }
            iy.J8(-5063898020577652512L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -5063898020577652512L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1857745155074430240L)
    public String ca(Namespace namespace) {
        try {
            if (!v5) {
                return null;
            }
            iy.tp(587188576794522675L, this, namespace);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 587188576794522675L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 932825605355784000L)
    public String cb(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (!v5) {
                return null;
            }
            iy.J0(1174241279949807279L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 1174241279949807279L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -957246043705995520L)
    public void cn(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(4588557452633736513L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            String strJ3 = fileEntry.j3(i2);
            if (strJ3.trim().endsWith("-->")) {
                int iSy = sy(strJ3);
                this.j6.refactoringCallback.nw(fileEntry, i2, iSy - 2, i2, iSy + 1, "");
            }
            String strJ32 = fileEntry.j3(i);
            if (strJ32.trim().startsWith("<!--")) {
                int iQq = Qq(strJ32);
                this.j6.refactoringCallback.nw(fileEntry, i, iQq, i, iQq + 4, "");
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 4588557452633736513L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1424110521107083377L)
    public void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) {
        try {
            if (v5) {
                iy.QX(-1806681135341169032L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.rN(th, -1806681135341169032L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 290705001482214000L)
    public String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf) {
        try {
            if (!v5) {
                return null;
            }
            iy.EQ(1302591888364909185L, this, syntaxTree, mapOf);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 1302591888364909185L, this, syntaxTree, mapOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 20700770702123435L)
    public String ei(String str, String str2) {
        try {
            if (!v5) {
                return null;
            }
            iy.EQ(-1508917702694676332L, this, str, str2);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, -1508917702694676332L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4187378338475526656L)
    public void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (v5) {
                iy.J8(389169130374868327L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.FH.J8(syntaxTree, i, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 389169130374868327L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 798800699461541531L)
    public void g3(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(-110986418908970752L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, -110986418908970752L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2326812980610753624L)
    public void gW(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (v5) {
                iy.J0(-689291171790965577L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, -689291171790965577L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -58893939509177463L)
    public void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) {
        try {
            if (v5) {
                iy.QX(5752809181914140160L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.rN(th, 5752809181914140160L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -8447035395833887728L)
    public Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i) {
        try {
            if (v5) {
                iy.EQ(432655876143943519L, this, syntaxTree, new Integer(i));
            }
            return this.DW.QX(syntaxTree, i);
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 432655876143943519L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3351302122152298281L)
    public HashtableOfInt<Tools.a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (v5) {
                iy.J8(-2491723192358478388L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.EQ(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -2491723192358478388L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -767545810677393845L)
    public void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (v5) {
                iy.J0(2551865586770273140L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 2551865586770273140L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3178642003810158888L)
    public HashtableOfInt<Tools.a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (v5) {
                iy.J8(-595394456226193827L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.J8(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, -595394456226193827L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1050824880808639112L)
    public void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) throws Throwable {
        int i5;
        try {
            if (v5) {
                iy.QX(303297395368493435L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            i5 = 6;
            try {
                this.Hw.FH(fileEntry, fileEntry2, i, i2, i3, i4);
            } catch (Throwable th) {
                th = th;
                if (Zo) {
                    Object[] objArr = new Object[i5];
                    objArr[0] = fileEntry;
                    objArr[1] = fileEntry2;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = new Integer(i3);
                    objArr[5] = new Integer(i4);
                    iy.rN(th, 303297395368493435L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i5 = 6;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4699296146883237552L)
    public void ro(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (v5) {
                iy.J8(2882729295617150265L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 2882729295617150265L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 806193065571415259L)
    public void sG(FileEntry fileEntry, String str) {
        try {
            if (v5) {
                iy.EQ(4810940132383529120L, this, fileEntry, str);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.Mr(th, 4810940132383529120L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -825742011188314467L)
    public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) {
        try {
            if (v5) {
                iy.QX(-1027558388378482368L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.rN(th, -1027558388378482368L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4565195334714288281L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(2812181874164000208L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 2812181874164000208L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 72907893810149585L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(7185132023099642640L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 7185132023099642640L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -200784898361836957L)
    public int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (v5) {
                iy.J0(3093121321746811992L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            return this.DW.Zo(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 3093121321746811992L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2840716618265864548L)
    public String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf) {
        try {
            if (!v5) {
                return null;
            }
            iy.J0(604909140766229025L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.a8(th, 604909140766229025L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 7371643825471659648L)
    public void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (v5) {
                iy.QX(-367586317134423465L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.rN(th, -367586317134423465L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -221080045737326908L)
    public void we(FileEntry fileEntry, int i, int i2) {
        try {
            if (v5) {
                iy.we(389873193327982233L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.U2(th, 389873193327982233L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5377772060070500945L)
    public void x9(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (v5) {
                iy.J8(3941994839119065900L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 3941994839119065900L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 307561860626465197L)
    public void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (v5) {
                iy.J8(6349940832521391900L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            this.FH.Ws(syntaxTree, i, i2, i3, z);
        } catch (Throwable th) {
            if (Zo) {
                iy.lg(th, 6349940832521391900L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
