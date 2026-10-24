package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.e7;
import abcd.ey;
import abcd.f2;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.z6;
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

@cy(clazz = -1746908269108261097L, container = -1746908269108261097L, user = true)
/* loaded from: classes.dex */
public class JavaScriptTools implements Tools {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 586123705704863292L)
    private final b7 DW;

    @dy(field = -1010306849032678961L)
    private final a7 FH;

    @dy(field = 1569334924748306505L)
    private final e7 Hw;

    @dy(field = 2211396431627647025L)
    private final Model j6;

    @dy(field = -2835134424045992860L)
    private final JavaScriptLanguage v5;

    static {
        iy.Zo(JavaScriptTools.class);
    }

    @ey(method = -4922846568499344576L)
    public JavaScriptTools(Model model, JavaScriptLanguage javaScriptLanguage) {
        try {
            if (Zo) {
                iy.EQ(6752878278837625440L, null, model, javaScriptLanguage);
            }
            this.j6 = model;
            this.v5 = javaScriptLanguage;
            this.DW = new b7(model, javaScriptLanguage);
            this.FH = new a7(model, javaScriptLanguage);
            this.Hw = new e7(model, javaScriptLanguage);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 6752878278837625440L, null, model, javaScriptLanguage);
            }
            throw th;
        }
    }

    @ey(method = -1260117075517335720L)
    private void Qq(SyntaxTree syntaxTree, int i, int i2, int i3) {
        try {
            if (Zo) {
                iy.J0(2387190396034308720L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            for (int childCount = syntaxTree.getChildCount(i) - 1; childCount >= 0; childCount--) {
                Qq(syntaxTree, syntaxTree.getChildNode(i, childCount), i2, i3);
            }
            if (syntaxTree.getSyntaxTag(i) == 1 && syntaxTree.sh(i) == 2 && i2 == syntaxTree.getAttrReferenceNode(i) && !syntaxTree.isEnclosingNode(i3, i)) {
                this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), "");
                this.j6.refactoringCallback.vy(syntaxTree.getFile(), syntaxTree.getStartLine(i3), syntaxTree.getStartColumn(i3), syntaxTree.getEndLine(i3), syntaxTree.getEndColumn(i3), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 2387190396034308720L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 943069662754721184L)
    private void sy(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-1655959385345363280L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            if (syntaxTree.isSyntheticNode(i) || syntaxTree.isSyntheticNode(i2)) {
                return;
            }
            this.j6.tp.DW(syntaxTree.getFile(), syntaxTree.getStartLine(i), syntaxTree.getStartColumn(i), syntaxTree.getEndLine(i), syntaxTree.getEndColumn(i), syntaxTree.getStartLine(i2), syntaxTree.getStartColumn(i2), syntaxTree.getEndLine(i2), syntaxTree.getEndColumn(i2));
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -1655959385345363280L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -166315153219123144L)
    public void BT(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type, int[] iArr, Type[] typeArr, int[] iArr2) {
        try {
            if (Zo) {
                iy.QX(740089789484348784L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, 740089789484348784L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type, iArr, typeArr, iArr2});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -86703390908409984L)
    public void DW(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-3190079053397284608L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            for (int i3 = i; i3 <= i2; i3++) {
                this.j6.refactoringCallback.nw(fileEntry, i3, 1, i3, 1, "//");
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -3190079053397284608L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5364356986343365696L)
    public String EQ(Namespace namespace) {
        try {
            if (!Zo) {
                return "";
            }
            iy.tp(7255442918658956800L, this, namespace);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 7255442918658956800L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2454445931889019603L)
    public boolean FH(String str) {
        try {
            if (!Zo) {
                return false;
            }
            iy.tp(1046010827749662729L, this, str);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1046010827749662729L, this, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -257968078632021289L)
    public void Hw(FileEntry fileEntry, int i, int i2, boolean z) {
        try {
            if (Zo) {
                iy.J0(3591060429796722187L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            this.FH.EQ(fileEntry, i, i2);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 3591060429796722187L, this, fileEntry, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -7128752199556250661L)
    public void I(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (Zo) {
                iy.J8(1316040582088569551L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 1316040582088569551L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5955947287038286200L)
    public void J0(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(1539021562424658320L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 1539021562424658320L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4311290296034572320L)
    public void J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (Zo) {
                iy.J0(-1345993313241251680L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.DW.VH(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -1345993313241251680L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 319300304290487600L)
    public String KD(Namespace namespace) {
        try {
            if (!Zo) {
                return "";
            }
            iy.tp(-1283126332718464000L, this, namespace);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1283126332718464000L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -2304503727062380321L)
    public void Mr(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-2379785290808620357L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.v5);
            int iJO = syntaxTree.jO(i, i2);
            if (iJO != -1) {
                ((z6) syntaxTree.getLanguage().getCodeAnalyzer()).Hw(syntaxTree, syntaxTree.getIdentifier(iJO));
                int iSh = syntaxTree.sh(iJO);
                if (iSh == 1 || iSh == 2) {
                    int attrReferenceNode = syntaxTree.getAttrReferenceNode(iJO);
                    if (syntaxTree.sh(attrReferenceNode) == 1 && syntaxTree.getChildCount(syntaxTree.getParentNode(attrReferenceNode)) == 3) {
                        Qq(syntaxTree, syntaxTree.getRootNode(), attrReferenceNode, syntaxTree.getChildNode(syntaxTree.getParentNode(attrReferenceNode), 2));
                        this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                        int parentNode = syntaxTree.getParentNode(syntaxTree.getParentNode(attrReferenceNode));
                        this.j6.refactoringCallback.nw(syntaxTree.getFile(), syntaxTree.getEndLine(syntaxTree.getLeftSisterNode(parentNode)), syntaxTree.getEndColumn(syntaxTree.getLeftSisterNode(parentNode)), syntaxTree.getEndLine(parentNode), syntaxTree.getEndColumn(parentNode), "");
                        this.j6.refactoringCallback.x9();
                        return;
                    }
                }
            }
            this.j6.refactoringCallback.QX("Select an initialized variable.");
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -2379785290808620357L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2090886818313070743L)
    public String Mz(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf, SetOf<Namespace> setOf) {
        try {
            if (!Zo) {
                return "";
            }
            iy.we(-1997813390105103237L, this, syntaxTree, mapOf, setOf);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -1997813390105103237L, this, syntaxTree, mapOf, setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 4393217940331974144L)
    public void P8(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-2230472361396952000L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -2230472361396952000L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1148244897363235200L)
    public boolean QX(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-858291588516705920L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            this.FH.tp(fileEntry, i, i2);
            return true;
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -858291588516705920L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -4824395178668625711L)
    public void SI(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (Zo) {
                iy.J8(2019323158984070069L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            this.j6.refactoringCallback.g3();
            SyntaxTree syntaxTree = this.j6.syntaxTreeSpace.getSyntaxTree(fileEntry, this.v5);
            int readExpressionNodeAt = syntaxTree.getReadExpressionNodeAt(i, i2, i3, i4);
            int iX9 = syntaxTree.x9(i, i2, i3, i4);
            if (readExpressionNodeAt == -1) {
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.QX("Select an expression to be extracted.");
                return;
            }
            if (iX9 == -1) {
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.QX("Select an expression inside a block to be extracted.");
                return;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(readExpressionNodeAt)) == 146) {
                this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
                this.j6.refactoringCallback.QX("Select an expression to be extracted.");
                return;
            }
            int iCU = ((JavaScriptSyntax) syntaxTree.getLanguage().getSyntax()).CU(syntaxTree, readExpressionNodeAt);
            String string = iCU != -1 ? this.j6.identifierSpace.getString(iCU) : "v";
            this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getEndLine(readExpressionNodeAt), syntaxTree.getEndColumn(readExpressionNodeAt), syntaxTree.getEndLine(readExpressionNodeAt), syntaxTree.getEndColumn(readExpressionNodeAt), ";\n");
            this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getStartLine(readExpressionNodeAt), syntaxTree.getStartColumn(readExpressionNodeAt), syntaxTree.getStartLine(readExpressionNodeAt), syntaxTree.getStartColumn(readExpressionNodeAt), string);
            this.j6.refactoringCallback.U2(fileEntry, syntaxTree.getStartLine(readExpressionNodeAt), string.length() + syntaxTree.getStartColumn(readExpressionNodeAt), syntaxTree.getEndLine(readExpressionNodeAt) + 1, 1, syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9));
            this.j6.refactoringCallback.nw(fileEntry, syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9), syntaxTree.getStartLine(iX9), syntaxTree.getStartColumn(iX9), "var " + string + " = ");
            this.j6.refactoringCallback.Sf(fileEntry, syntaxTree.getStartLine(iX9), syntaxTree.getEndLine(readExpressionNodeAt) + 1);
            this.j6.syntaxTreeSpace.releaseSyntaxTree(syntaxTree);
            this.j6.refactoringCallback.J0();
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 2019323158984070069L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 7406270291564980660L)
    public void Sf(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (Zo) {
                iy.we(3876282783682184780L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            int iPa = syntaxTree.Pa(i, i2 - 1);
            if (iPa != -1) {
                int syntaxTag = syntaxTree.getSyntaxTag(iPa);
                if (syntaxTag != 54 && syntaxTag != 55 && syntaxTag != 63 && syntaxTag != 80) {
                    switch (syntaxTag) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            int parentNode = syntaxTree.getParentNode(iPa);
                            int syntaxTag2 = syntaxTree.getSyntaxTag(parentNode);
                            if (syntaxTag2 != 133) {
                                if (syntaxTag2 == 145) {
                                    sy(syntaxTree, syntaxTree.getChildNode(parentNode, 3), syntaxTree.getChildNode(parentNode, 5));
                                    return;
                                }
                                if (syntaxTag2 == 149) {
                                    sy(syntaxTree, syntaxTree.getChildNode(parentNode, 1), syntaxTree.getChildNode(parentNode, 5));
                                    return;
                                }
                                if (syntaxTag2 == 168) {
                                    sy(syntaxTree, syntaxTree.getChildNode(parentNode, 0), syntaxTree.getChildNode(parentNode, 2));
                                    return;
                                }
                                if (syntaxTag2 != 190 && syntaxTag2 != 197) {
                                    if (syntaxTag2 == 211) {
                                        sy(syntaxTree, syntaxTree.getChildNode(parentNode, 1), syntaxTree.getChildNode(parentNode, 9));
                                        return;
                                    } else {
                                        switch (syntaxTag2) {
                                            case 135:
                                            case 136:
                                            case 137:
                                                sy(syntaxTree, syntaxTree.getChildNode(parentNode, 1), syntaxTree.getChildNode(parentNode, 3));
                                                return;
                                        }
                                    }
                                }
                            }
                            sy(syntaxTree, syntaxTree.getChildNode(parentNode, 0), syntaxTree.getChildNode(parentNode, syntaxTree.getChildCount(parentNode) - 1));
                            return;
                    }
                }
                int parentNode2 = syntaxTree.getParentNode(iPa);
                int syntaxTag3 = syntaxTree.getSyntaxTag(parentNode2);
                if (syntaxTag3 == 136) {
                    sy(syntaxTree, syntaxTree.getChildNode(parentNode2, 0), syntaxTree.getChildNode(parentNode2, 5));
                    return;
                } else if (syntaxTag3 == 145) {
                    sy(syntaxTree, syntaxTree.getChildNode(parentNode2, 0), syntaxTree.getChildNode(parentNode2, 2));
                    return;
                }
            }
            this.j6.tp.FH(syntaxTree.getFile());
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 3876282783682184780L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1862302281433340995L)
    public boolean U2(Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (Zo) {
                iy.QX(-559156285408167369L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -559156285408167369L, this, new Object[]{member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 997488121885720575L)
    public void VH(FileEntry fileEntry) {
        try {
            if (Zo) {
                iy.tp(-2346395616716181981L, this, fileEntry);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2346395616716181981L, this, fileEntry);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 506822901064907685L)
    public String Ws() {
        try {
            if (!Zo) {
                return "i;";
            }
            iy.gn(536424241231723625L, this);
            return "i;";
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 536424241231723625L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -88601036855126224L)
    public HashtableOfInt<Tools.a> XL(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (Zo) {
                iy.J8(157837846169245312L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.J8(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 157837846169245312L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -5528838958636885375L)
    public void Zo(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(7830022798767608285L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 7830022798767608285L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1087701436813857237L)
    public void a8(FileEntry fileEntry, int i, int i2, int i3, Type type) {
        try {
            if (Zo) {
                iy.J8(-1354470684201238481L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -1354470684201238481L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 3526899366077424432L)
    public String aM(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf, SetOf<Entity> setOf2) {
        try {
            if (!Zo) {
                return "";
            }
            iy.J8(5737170986655159056L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 5737170986655159056L, this, syntaxTree, new Integer(i), new Integer(i2), setOf, setOf2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -485457953762026655L)
    public String ca(Namespace namespace) {
        try {
            if (!Zo) {
                return "";
            }
            iy.tp(-1417074203090646795L, this, namespace);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1417074203090646795L, this, namespace);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -126143422652961775L)
    public String cb(SyntaxTree syntaxTree, int i, int i2, Type type) {
        try {
            if (!Zo) {
                return "";
            }
            iy.J0(208111508962793181L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 208111508962793181L, this, syntaxTree, new Integer(i), new Integer(i2), type);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2182891050476761007L)
    public void cn(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(4540631770660034243L, this, fileEntry, new Integer(i), new Integer(i2));
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
            if (VH) {
                iy.U2(th, 4540631770660034243L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -18689170555567796L)
    public void dx(TemplateEvaluatorCallback templateEvaluatorCallback, FileEntry fileEntry, int i, int i2, String str, List<String> list) throws Throwable {
        int i3;
        try {
            if (Zo) {
                iy.QX(-56063119727975868L, this, new Object[]{templateEvaluatorCallback, fileEntry, new Integer(i), new Integer(i2), str, list});
            }
            i3 = 6;
            try {
                this.Hw.DW(templateEvaluatorCallback, fileEntry, i, i2, str, list);
            } catch (Throwable th) {
                th = th;
                if (VH) {
                    Object[] objArr = new Object[i3];
                    objArr[0] = templateEvaluatorCallback;
                    objArr[1] = fileEntry;
                    objArr[2] = new Integer(i);
                    objArr[3] = new Integer(i2);
                    objArr[4] = str;
                    objArr[5] = list;
                    iy.rN(th, -56063119727975868L, this, objArr);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i3 = 6;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -383002730652182361L)
    public String ef(SyntaxTree syntaxTree, MapOf<ClassType, Entity> mapOf) {
        try {
            if (!Zo) {
                return "";
            }
            iy.EQ(202686234465042699L, this, syntaxTree, mapOf);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 202686234465042699L, this, syntaxTree, mapOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3995459398737487640L)
    public String ei(String str, String str2) {
        try {
            if (!Zo) {
                return "";
            }
            iy.EQ(-1332938948718663200L, this, str, str2);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -1332938948718663200L, this, str, str2);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1650368692990098087L)
    public void er(SyntaxTree syntaxTree, FileEntry fileEntry, Language language, int i, int i2) {
        try {
            if (Zo) {
                iy.J8(-2705221672961538171L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            this.FH.gn(syntaxTree, i, i2);
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -2705221672961538171L, this, syntaxTree, fileEntry, language, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -809352394649232296L)
    public void g3(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-1540152466885528L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -1540152466885528L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1298817658734480531L)
    public void gW(FileEntry fileEntry, int i, int i2, Member member) {
        try {
            if (Zo) {
                iy.J0(1279946528904626737L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, 1279946528904626737L, this, fileEntry, new Integer(i), new Integer(i2), member);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 6404755571809340928L)
    public void gn(FileEntry fileEntry, int i, int i2, String str, int i3, int i4, boolean z) {
        try {
            if (Zo) {
                iy.QX(-3724715148954193408L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -3724715148954193408L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3), new Integer(i4), new Boolean(z)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -936744387414930215L)
    public Set<? extends FormatOption> j3(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(3667939632032461365L, this, syntaxTree, new Integer(i));
            }
            return this.DW.XL(syntaxTree, i);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3667939632032461365L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 1977282885582721200L)
    public HashtableOfInt<Tools.a> j6(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (Zo) {
                iy.J8(-5046510548718595320L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.J8(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -5046510548718595320L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 731547267757648440L)
    public void lg(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (Zo) {
                iy.J0(-3612864334691850800L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.DW.u7(syntaxTree, f2Var, i);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -3612864334691850800L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -3086756808883350681L)
    public HashtableOfInt<Tools.a> nw(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (Zo) {
                iy.J8(-3505714581185295069L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            return this.DW.Ws(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, -3505714581185295069L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -648131538541879183L)
    public void rN(FileEntry fileEntry, FileEntry fileEntry2, int i, int i2, int i3, int i4) {
        try {
            if (Zo) {
                iy.QX(593669360602729141L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, 593669360602729141L, this, new Object[]{fileEntry, fileEntry2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -670568117702873825L)
    public void ro(FileEntry fileEntry, int i, int i2, String str, int i3) {
        try {
            if (Zo) {
                iy.J8(1281464180919585795L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 1281464180919585795L, this, fileEntry, new Integer(i), new Integer(i2), str, new Integer(i3));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 687286854337971528L)
    public void sG(FileEntry fileEntry, String str) {
        try {
            if (Zo) {
                iy.EQ(6787263569271218488L, this, fileEntry, str);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 6787263569271218488L, this, fileEntry, str);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1143457182796914948L)
    public void sh(FileEntry fileEntry, int i, int i2, int i3, int i4, Type type) {
        try {
            if (Zo) {
                iy.QX(-8634959709042470044L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -8634959709042470044L, this, new Object[]{fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), type});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2147928627223873400L)
    public void tp(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (Zo) {
                iy.J8(1343750161007147880L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 1343750161007147880L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -237578462067530688L)
    public void u7(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (Zo) {
                iy.J8(132884449616467552L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 132884449616467552L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -1988389662062223196L)
    public int[] v5(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (Zo) {
                iy.J0(-2655247474405854612L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            return this.DW.gn(syntaxTree, f2Var, i, i2);
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -2655247474405854612L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 5381719400194481235L)
    public String vJ(SyntaxTree syntaxTree, int i, int i2, SetOf<? extends Type> setOf) {
        try {
            if (!Zo) {
                return "";
            }
            iy.J0(-1878749276182591489L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            return "";
        } catch (Throwable th) {
            if (VH) {
                iy.a8(th, -1878749276182591489L, this, syntaxTree, new Integer(i), new Integer(i2), setOf);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = -6791119102467886935L)
    public void vy(FileEntry fileEntry, Member member, ListOfInt listOfInt, ListOfInt listOfInt2, ListOfInt listOfInt3, ListOfInt listOfInt4, ListOfInt listOfInt5) {
        try {
            if (Zo) {
                iy.QX(-2613481256835929835L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
        } catch (Throwable th) {
            if (VH) {
                iy.rN(th, -2613481256835929835L, this, new Object[]{fileEntry, member, listOfInt, listOfInt2, listOfInt3, listOfInt4, listOfInt5});
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 728568793021255875L)
    public void we(FileEntry fileEntry, int i, int i2) {
        try {
            if (Zo) {
                iy.we(-2297764570678322625L, this, fileEntry, new Integer(i), new Integer(i2));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, -2297764570678322625L, this, fileEntry, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 107972550648314344L)
    public void x9(FileEntry fileEntry, int i, int i2, int i3, int i4) {
        try {
            if (Zo) {
                iy.J8(7413023253911892304L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 7413023253911892304L, this, fileEntry, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Tools
    @ey(method = 2314593737462823984L)
    public void yS(SyntaxTree syntaxTree, int i, int i2, int i3, boolean z) {
        try {
            if (Zo) {
                iy.J8(6943821563868351912L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            this.FH.we(syntaxTree, i, i2, i3, z);
        } catch (Throwable th) {
            if (VH) {
                iy.lg(th, 6943821563868351912L, this, syntaxTree, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z));
            }
            throw th;
        }
    }
}
