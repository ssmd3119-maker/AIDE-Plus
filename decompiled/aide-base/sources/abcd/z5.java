package abcd;

import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.HashtableOfInt;
import com.aide.codemodel.language.java.JavaFormatOption;
import com.aide.codemodel.language.java.JavaLanguage;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@cy(clazz = -2142235186951076841L, container = -2142235186951076841L, user = true)
/* loaded from: classes.dex */
public class z5 {

    @fy
    private static /* synthetic */ boolean U2;

    @gy
    private static /* synthetic */ boolean a8;

    @dy(field = 1804238515854484983L)
    private final JavaLanguage DW;

    @dy(field = -450502823465208504L)
    private int EQ;

    @dy(field = 2757479533285735989L)
    private SyntaxTree FH;

    @dy(field = 2763086360931162961L)
    private f2 Hw;

    @dy(field = 2732585419725153035L)
    private int J0;

    @dy(field = 4377564825843933669L)
    private FunctionOfIntInt J8;

    @dy(field = -922559763791708685L)
    private int Mr;

    @dy(field = -893397314845877319L)
    private Map<JavaFormatOption, Integer> QX;

    @dy(field = 3781313615718414059L)
    private int VH;

    @dy(field = -1323653780277778752L)
    private FunctionOfIntInt Ws;

    @dy(field = -1268847300441778288L)
    private Map<JavaFormatOption, Integer> XL;

    @dy(field = 5128207937503326621L)
    private int Zo;

    @dy(field = -709145487088330335L)
    private HashtableOfInt<Tools.a> aM;

    @dy(field = 4348007467513383495L)
    private int gn;

    @dy(field = -34392445675113344L)
    private HashtableOfInt<Tools.a> j3;

    @dy(field = 2698173480135020172L)
    private final Model j6;

    @dy(field = 964677510641474308L)
    private int tp;

    @dy(field = 3785746627003779312L)
    private int u7;

    @dy(field = 567995254322942781L)
    private Set<? extends FormatOption> v5;

    @dy(field = 6901146407317745745L)
    private int we;

    static {
        iy.Zo(z5.class);
    }

    @ey(method = -559871771091535817L)
    public z5(Model model, JavaLanguage javaLanguage) {
        try {
            if (U2) {
                iy.EQ(301476730479655344L, null, model, javaLanguage);
            }
            this.j6 = model;
            this.DW = javaLanguage;
            this.aM = new HashtableOfInt<>();
            this.j3 = new HashtableOfInt<>();
            this.J8 = new FunctionOfIntInt();
            this.Ws = new FunctionOfIntInt();
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 301476730479655344L, null, model, javaLanguage);
            }
            throw th;
        }
    }

    @ey(method = 121831180298621325L)
    private void DW(int i, boolean z) {
        try {
            if (U2) {
                iy.EQ(304877649163214765L, this, new Integer(i), new Boolean(z));
            }
            if (this.FH.isSyntheticNode(i)) {
                return;
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            if (syntaxTag != 133) {
                if (syntaxTag != 140) {
                    if (syntaxTag == 165) {
                        int childCount = this.FH.getChildCount(i);
                        FH(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.ARRAYARGUMENT_SPACE, z);
                        for (int i2 = childCount - 2; i2 >= 2; i2 -= 2) {
                            DW(this.FH.getChildNode(i, i2), z);
                        }
                        FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.ARRAYARGUMENT_SPACE, z);
                        FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.ARRAYMETHODCALL_SPACE, z);
                        DW(this.FH.getChildNode(i, 0), z);
                        return;
                    }
                    if (syntaxTag == 168) {
                        FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.PAREN_SPACE, z);
                        DW(this.FH.getChildNode(i, 1), z);
                        FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.PAREN_SPACE, z);
                        return;
                    }
                    if (syntaxTag == 172) {
                        DW(this.FH.getChildNode(i, 2), z);
                        if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) != 146) {
                            FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.BINARYOPERATOR_SPACE, z);
                        } else {
                            FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.ASSIGNMENTOPERATOR_SPACE, z);
                        }
                        DW(this.FH.getChildNode(i, 1), z);
                        if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) != 146) {
                            FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.BINARYOPERATOR_SPACE, z);
                        } else {
                            FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.ASSIGNMENTOPERATOR_SPACE, z);
                        }
                        DW(this.FH.getChildNode(i, 0), z);
                        return;
                    }
                    if (syntaxTag == 190) {
                        if (this.FH.getChildCount(i) == 2) {
                            FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.PARAMETER_SPACE, z);
                            return;
                        }
                        FH(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.PARAMETER_SPACE, z);
                        for (int childCount2 = this.FH.getChildCount(i) - 2; childCount2 >= 2; childCount2 -= 2) {
                            FH(this.FH.getChildNode(i, childCount2 - 1), this.FH.getChildNode(i, childCount2), JavaFormatOption.PARAMETERCOMMA_SPACE, z);
                        }
                        FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.PARAMETER_SPACE, z);
                        return;
                    }
                    if (syntaxTag == 197) {
                        if (this.FH.getChildCount(i) == 2) {
                            FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.ARGUMENT_SPACE, z);
                        } else {
                            FH(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.ARGUMENT_SPACE, z);
                            int childCount3 = this.FH.getChildCount(i);
                            for (int i3 = childCount3 - 2; i3 >= 2; i3 -= 2) {
                                int childNode = this.FH.getChildNode(i, i3 - 1);
                                int childNode2 = this.FH.getChildNode(i, i3);
                                DW(childNode2, z);
                                FH(childNode, childNode2, JavaFormatOption.ARGUMENTCOMMA_SPACE, z);
                            }
                            if (childCount3 >= 3) {
                                DW(this.FH.getChildNode(i, 1), z);
                            }
                            FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.ARGUMENT_SPACE, z);
                        }
                        FH(this.FH.getLeftSisterNode(i), i, JavaFormatOption.METHODCALL_SPACE, z);
                        return;
                    }
                    if (syntaxTag == 211) {
                        DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                            Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.BLOCK_NEWLINE, z);
                        }
                        FH(this.FH.getChildNode(i, 8), this.FH.getChildNode(i, 9), JavaFormatOption.CONDITION_SPACE, z);
                        DW(this.FH.getChildNode(i, 8), z);
                        DW(this.FH.getChildNode(i, 7), z);
                        DW(this.FH.getChildNode(i, 6), z);
                        DW(this.FH.getChildNode(i, 5), z);
                        DW(this.FH.getChildNode(i, 4), z);
                        DW(this.FH.getChildNode(i, 3), z);
                        DW(this.FH.getChildNode(i, 2), z);
                        FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.CONDITION_SPACE, z);
                        FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.KEYWORD_SPACE, z);
                        return;
                    }
                    if (syntaxTag == 204) {
                        DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                            Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.BLOCK_NEWLINE, z);
                        }
                        FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.KEYWORD_SPACE, z);
                        Hw(this.FH.getLeftSisterNode(i), i, JavaFormatOption.CATCH_NEWLINE, z);
                        return;
                    }
                    if (syntaxTag == 205) {
                        DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                            Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.BLOCK_NEWLINE, z);
                        }
                        Hw(this.FH.getLeftSisterNode(i), i, JavaFormatOption.FINALLY_NEWLINE, z);
                        return;
                    }
                    if (syntaxTag != 220 && syntaxTag != 221 && syntaxTag != 227 && syntaxTag != 228) {
                        switch (syntaxTag) {
                            case 120:
                            case 121:
                                break;
                            case 122:
                                break;
                            case 123:
                                DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                                if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                                    Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.METHOD_NEWLINE, z);
                                }
                                DW(this.FH.getChildNode(i, 3), z);
                                FH(this.FH.getChildNode(i, 2), this.FH.getChildNode(i, 3), JavaFormatOption.METHODNAME_SPACE, z);
                                return;
                            case 124:
                                DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                                if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                                    Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.METHOD_NEWLINE, z);
                                }
                                DW(this.FH.getChildNode(i, 5), z);
                                FH(this.FH.getChildNode(i, 4), this.FH.getChildNode(i, 5), JavaFormatOption.METHODNAME_SPACE, z);
                                return;
                            default:
                                switch (syntaxTag) {
                                    case 135:
                                    case 137:
                                        break;
                                    case 136:
                                        DW(this.FH.getChildNode(i, 6), z);
                                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 133) {
                                            Hw(this.FH.getChildNode(i, 5), this.FH.getChildNode(i, 6), JavaFormatOption.BLOCK_NEWLINE, z);
                                        }
                                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) == 133) {
                                            Hw(this.FH.getChildNode(i, 4), this.FH.getChildNode(i, 5), JavaFormatOption.ELSE_NEWLINE, z);
                                        }
                                        DW(this.FH.getChildNode(i, 4), z);
                                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) == 133) {
                                            Hw(this.FH.getChildNode(i, 3), this.FH.getChildNode(i, 4), JavaFormatOption.BLOCK_NEWLINE, z);
                                        }
                                        FH(this.FH.getChildNode(i, 2), this.FH.getChildNode(i, 3), JavaFormatOption.CONDITION_SPACE, z);
                                        DW(this.FH.getChildNode(i, 2), z);
                                        FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.CONDITION_SPACE, z);
                                        FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.KEYWORD_SPACE, z);
                                        return;
                                    default:
                                        switch (syntaxTag) {
                                            case 147:
                                                break;
                                            case 148:
                                                DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                                                if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                                                    Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.BLOCK_NEWLINE, z);
                                                    return;
                                                }
                                                return;
                                            case 149:
                                                DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                                                if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                                                    Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.BLOCK_NEWLINE, z);
                                                }
                                                FH(this.FH.getChildNode(i, 4), this.FH.getChildNode(i, 5), JavaFormatOption.CONDITION_SPACE, z);
                                                DW(this.FH.getChildNode(i, 4), z);
                                                DW(this.FH.getChildNode(i, 3), z);
                                                DW(this.FH.getChildNode(i, 2), z);
                                                FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.CONDITION_SPACE, z);
                                                FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.KEYWORD_SPACE, z);
                                                return;
                                            case 150:
                                                for (int childCount4 = this.FH.getChildCount(i) - 1; childCount4 >= 1; childCount4--) {
                                                    DW(this.FH.getChildNode(i, childCount4), z);
                                                }
                                                Hw(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.BLOCK_NEWLINE, z);
                                                return;
                                            default:
                                                for (int childCount5 = this.FH.getChildCount(i) - 1; childCount5 >= 0; childCount5--) {
                                                    DW(this.FH.getChildNode(i, childCount5), z);
                                                }
                                                return;
                                        }
                                }
                        }
                    }
                    DW(this.FH.getChildNode(i, 6), z);
                    Hw(this.FH.getChildNode(i, 5), this.FH.getChildNode(i, 6), JavaFormatOption.TYPE_NEWLINE, z);
                    DW(this.FH.getChildNode(i, 5), z);
                    DW(this.FH.getChildNode(i, 4), z);
                    DW(this.FH.getChildNode(i, 3), z);
                    DW(this.FH.getChildNode(i, 2), z);
                    DW(this.FH.getChildNode(i, 1), z);
                    DW(this.FH.getChildNode(i, 0), z);
                    return;
                }
                DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                    Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaFormatOption.BLOCK_NEWLINE, z);
                }
                FH(this.FH.getChildNode(i, 2), this.FH.getChildNode(i, 3), JavaFormatOption.CONDITION_SPACE, z);
                DW(this.FH.getChildNode(i, 2), z);
                FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaFormatOption.CONDITION_SPACE, z);
                FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaFormatOption.KEYWORD_SPACE, z);
                return;
            }
            int syntaxTag2 = this.FH.getSyntaxTag(this.FH.getParentNode(i));
            if (syntaxTag2 == 220 || syntaxTag2 == 221) {
                return;
            }
            for (int childCount6 = this.FH.getChildCount(i) - 1; childCount6 >= 1; childCount6--) {
                int childNode3 = this.FH.getChildNode(i, childCount6);
                if (!this.FH.isSyntheticNode(childNode3)) {
                    int childNode4 = this.FH.getChildNode(i, childCount6 - 1);
                    if (this.FH.isSyntheticNode(childNode4)) {
                        childNode4 = this.FH.getChildNode(i, childCount6 - 2);
                    }
                    DW(childNode3, z);
                    if (this.v5.contains(JavaFormatOption.STATEMENT_WRAP) && this.Hw.VH(this.FH, childNode3) > this.VH) {
                        v5(childNode4, childNode3, z);
                    }
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 304877649163214765L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 7669264201467499424L)
    private void EQ(int i) {
        try {
            if (U2) {
                iy.u7(-1519722175641421500L, this, i);
            }
            if (this.FH.isSyntheticNode(i)) {
                return;
            }
            if (this.FH.getLanguage().getSyntax().tp(this.FH.getSyntaxTag(i))) {
                int iEQ = this.Hw.EQ(this.FH, i);
                int iTp = this.Hw.tp(this.FH, i);
                if (this.Ws.get(iEQ) <= 0 || this.Ws.get(iEQ) > iTp) {
                    this.Ws.Zo(iEQ, iTp);
                }
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            int i2 = 0;
            if (syntaxTag != 122 && syntaxTag != 133 && syntaxTag != 196) {
                int childCount = this.FH.getChildCount(i);
                while (i2 < childCount) {
                    EQ(this.FH.getChildNode(i, i2));
                    i2++;
                }
                return;
            }
            if (we(i)) {
                int childCount2 = this.FH.getChildCount(i);
                while (i2 < childCount2) {
                    EQ(this.FH.getChildNode(i, i2));
                    i2++;
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1519722175641421500L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2115493096909706052L)
    private void FH(int i, int i2, JavaFormatOption javaFormatOption, boolean z) {
        try {
            if (U2) {
                iy.J0(-2039302066201960704L, this, new Integer(i), new Integer(i2), javaFormatOption, new Boolean(z));
            }
            if (this.FH.getStartLine(i) != 0) {
                if (z) {
                    if (this.Hw.u7(this.FH, i) == this.Hw.EQ(this.FH, i2)) {
                        aM(javaFormatOption, this.Hw.VH(this.FH, i) != this.Hw.tp(this.FH, i2));
                        return;
                    }
                    return;
                }
                if (this.v5.contains(JavaFormatOption.ADJUST_SPACES)) {
                    if (this.v5.contains(javaFormatOption)) {
                        if (this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2) || this.Hw.VH(this.FH, i) != this.Hw.tp(this.FH, i2) || this.Hw.u7(this.FH, i) < this.gn || this.Hw.u7(this.FH, i) > this.u7) {
                            return;
                        }
                        this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), " ");
                        this.Hw.J0(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), " ");
                        return;
                    }
                    if (this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2) || this.Hw.VH(this.FH, i) == this.Hw.tp(this.FH, i2) || this.Hw.EQ(this.FH, i) < this.gn || this.Hw.u7(this.FH, i2) > this.u7) {
                        return;
                    }
                    this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.EQ(this.FH, i2), this.Hw.tp(this.FH, i2), "");
                    this.Hw.XL(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.EQ(this.FH, i2), this.Hw.tp(this.FH, i2));
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -2039302066201960704L, this, new Integer(i), new Integer(i2), javaFormatOption, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 1519808256323907376L)
    private void Hw(int i, int i2, JavaFormatOption javaFormatOption, boolean z) {
        try {
            if (U2) {
                iy.J0(1968136802279571300L, this, new Integer(i), new Integer(i2), javaFormatOption, new Boolean(z));
            }
            if (this.FH.getStartLine(i) != 0) {
                if (z) {
                    boolean z2 = true;
                    aM(javaFormatOption, this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2));
                    if (this.Hw.u7(this.FH, i) == this.Hw.EQ(this.FH, i2)) {
                        JavaFormatOption javaFormatOption2 = JavaFormatOption.BRACE_SPACE;
                        if (this.Hw.VH(this.FH, i) == this.Hw.tp(this.FH, i2)) {
                            z2 = false;
                        }
                        aM(javaFormatOption2, z2);
                        return;
                    }
                    return;
                }
                if (this.v5.contains(JavaFormatOption.ADJUST_NEWLINES)) {
                    if (this.v5.contains(javaFormatOption)) {
                        if (this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2) || this.Hw.u7(this.FH, i) < this.gn || this.Hw.u7(this.FH, i) > this.u7) {
                            return;
                        }
                        this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), "\n");
                        this.Hw.J8(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i));
                        return;
                    }
                    if (this.Hw.u7(this.FH, i) == this.Hw.EQ(this.FH, i2)) {
                        FH(i, i2, JavaFormatOption.BRACE_SPACE, z);
                        return;
                    }
                    if (this.Hw.EQ(this.FH, i) >= this.gn && this.Hw.u7(this.FH, i2) <= this.u7) {
                        this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.EQ(this.FH, i2), this.Hw.tp(this.FH, i2), "");
                        this.Hw.XL(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.EQ(this.FH, i2), this.Hw.tp(this.FH, i2));
                    }
                    if (!this.v5.contains(JavaFormatOption.BRACE_SPACE) || this.Hw.u7(this.FH, i) < this.gn || this.Hw.u7(this.FH, i) > this.u7) {
                        return;
                    }
                    this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), " ");
                    this.Hw.J0(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), " ");
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, 1968136802279571300L, this, new Integer(i), new Integer(i2), javaFormatOption, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 3086135915403129675L)
    private void Ws(int i) {
        try {
            if (U2) {
                iy.u7(-1778371442340711985L, this, i);
            }
            int iEQ = this.Hw.EQ(this.FH, i);
            if (iEQ == 0 || iEQ == this.EQ) {
                return;
            }
            if (this.EQ > iEQ) {
                this.EQ = iEQ;
            }
            int i2 = 0;
            if (iEQ != this.we && this.we != -1 && this.v5.contains(JavaFormatOption.NEXTLINE_INDENT)) {
                i2 = this.Zo;
            }
            while (this.EQ < iEQ - 1) {
                int i3 = this.EQ + 1;
                this.EQ = i3;
                if (!this.aM.Hw(i3) || this.aM.v5(this.EQ).Hw > 100) {
                    this.aM.VH(this.EQ, new Tools.a(this.DW, this.J0 + i2, false, false, 1000));
                }
            }
            if (!this.aM.Hw(iEQ) || this.aM.v5(iEQ).Hw > 100) {
                this.aM.VH(iEQ, new Tools.a(this.DW, this.tp + i2, false, false, 100));
            }
            this.EQ = iEQ;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1778371442340711985L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1142126610803816157L)
    private void XL(JavaFormatOption javaFormatOption, int i, int i2) {
        try {
            if (U2) {
                iy.we(-174275610266851875L, this, javaFormatOption, new Integer(i), new Integer(i2));
            }
            aM(javaFormatOption, i != i2);
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -174275610266851875L, this, javaFormatOption, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -8291722928403896464L)
    private void aM(JavaFormatOption javaFormatOption, boolean z) {
        try {
            if (U2) {
                iy.EQ(2641129166273235864L, this, javaFormatOption, new Boolean(z));
            }
            if (z) {
                this.QX.put(javaFormatOption, Integer.valueOf(this.QX.get(javaFormatOption).intValue() + 1));
            } else {
                this.XL.put(javaFormatOption, Integer.valueOf(this.XL.get(javaFormatOption).intValue() + 1));
            }
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 2641129166273235864L, this, javaFormatOption, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -136780142058573015L)
    private void j6(FileEntry fileEntry) {
        try {
            if (U2) {
                iy.tp(1016048718900666633L, this, fileEntry);
            }
            if (this.gn == 1) {
                this.j3.gn(this.aM);
                return;
            }
            int iU7 = u7(fileEntry.rN(this.Mr), this.FH.getRootNode());
            this.aM.j6.DW();
            while (this.aM.j6.j6()) {
                this.j3.VH(this.aM.j6.FH(), this.aM.j6.Hw().DW(iU7));
            }
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 1016048718900666633L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = -5710347466806024840L)
    private void tp(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        try {
            if (U2) {
                iy.EQ(-1924665059775607800L, this, new Integer(i), new Boolean(z));
            }
            if (this.FH.isSyntheticNode(i)) {
                return;
            }
            if (this.FH.getLanguage().getSyntax().tp(this.FH.getSyntaxTag(i))) {
                Ws(i);
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            int i10 = -1;
            int i11 = 0;
            int i12 = 1;
            if (syntaxTag == 122) {
                if (we(i)) {
                    int i13 = this.we;
                    this.we = -1;
                    int childCount = this.FH.getChildCount(i);
                    if (this.v5.contains(JavaFormatOption.BRACE_INDENT)) {
                        this.tp += this.Zo;
                    }
                    tp(this.FH.getChildNode(i, 0), z);
                    if (this.FH.getStartLine(this.FH.getChildNode(i, 0)) != 0) {
                        this.tp += this.Zo;
                    }
                    int i14 = this.J0;
                    this.J0 = this.tp;
                    int i15 = 1;
                    while (true) {
                        i2 = childCount - 1;
                        if (i15 >= i2) {
                            break;
                        }
                        tp(this.FH.getChildNode(i, i15), z);
                        i15++;
                    }
                    if (this.FH.getStartLine(this.FH.getChildNode(i, 0)) != 0) {
                        this.tp -= this.Zo;
                    }
                    tp(this.FH.getChildNode(i, i2), z);
                    this.J0 = i14;
                    if (this.v5.contains(JavaFormatOption.BRACE_INDENT)) {
                        this.tp -= this.Zo;
                    }
                    this.we = i13;
                    return;
                }
                return;
            }
            if (syntaxTag == 133) {
                if (we(i)) {
                    int i16 = this.we;
                    this.we = -1;
                    int childCount2 = this.FH.getChildCount(i);
                    if (this.v5.contains(JavaFormatOption.BRACE_INDENT)) {
                        this.tp += this.Zo;
                    }
                    tp(this.FH.getChildNode(i, 0), z);
                    if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) == 147 && this.v5.contains(JavaFormatOption.CASELABEL_INDENT)) {
                        this.tp += this.Zo;
                    }
                    if (this.v5.contains(JavaFormatOption.BLOCK_INDENT)) {
                        this.tp += this.Zo;
                    }
                    int i17 = this.J0;
                    this.J0 = this.tp;
                    int i18 = 1;
                    int i19 = -1;
                    while (true) {
                        i3 = childCount2 - 1;
                        if (i18 >= i3) {
                            break;
                        }
                        int childNode = this.FH.getChildNode(i, i18);
                        int syntaxTag2 = this.FH.getSyntaxTag(childNode);
                        if (syntaxTag2 == 143 || syntaxTag2 == 144) {
                            if (z) {
                                i19 = this.J8.get(this.Hw.EQ(this.FH, childNode));
                                XL(JavaFormatOption.CASELABEL_INDENT, i19, this.J8.get(this.Hw.EQ(this.FH, i)));
                            }
                            if (this.v5.contains(JavaFormatOption.CASE_INDENT)) {
                                this.tp -= this.Zo;
                            }
                            tp(childNode, z);
                            if (this.v5.contains(JavaFormatOption.CASE_INDENT)) {
                                this.tp += this.Zo;
                            }
                        } else if (syntaxTag2 != 148) {
                            if (z) {
                                if (i19 != i10) {
                                    XL(JavaFormatOption.CASE_INDENT, this.J8.get(this.Hw.EQ(this.FH, childNode)), i19);
                                    i19 = -1;
                                } else if (i18 == i12) {
                                    XL(JavaFormatOption.BLOCK_INDENT, this.J8.get(this.Hw.EQ(this.FH, childNode)), this.J8.get(this.Hw.EQ(this.FH, i)));
                                }
                            }
                            tp(childNode, z);
                        } else {
                            if (this.v5.contains(JavaFormatOption.LABELLEFT_INDENT)) {
                                int i20 = this.tp;
                                this.tp = 0;
                                Ws(this.FH.getChildNode(childNode, 0));
                                this.tp = i20;
                            }
                            if (z) {
                                aM(JavaFormatOption.LABELLEFT_INDENT, this.J8.get(this.Hw.EQ(this.FH, childNode)) == 0);
                            }
                            tp(childNode, z);
                        }
                        i18++;
                        i10 = -1;
                        i12 = 1;
                    }
                    if (this.v5.contains(JavaFormatOption.BLOCK_INDENT)) {
                        this.tp -= this.Zo;
                    }
                    if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) == 147 && this.v5.contains(JavaFormatOption.CASELABEL_INDENT)) {
                        this.tp -= this.Zo;
                    }
                    tp(this.FH.getChildNode(i, i3), z);
                    this.J0 = i17;
                    if (this.v5.contains(JavaFormatOption.BRACE_INDENT)) {
                        this.tp -= this.Zo;
                    }
                    this.we = i16;
                    return;
                }
                return;
            }
            if (syntaxTag != 141 && syntaxTag != 146) {
                int i21 = 4;
                int i22 = 3;
                if (syntaxTag != 149) {
                    if (syntaxTag != 151) {
                        if (syntaxTag == 190) {
                            int i23 = this.we;
                            this.we = -1;
                            Ws(this.FH.getChildNode(i, 0));
                            if (this.v5.contains(JavaFormatOption.PARAMETER_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 0)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1))) {
                                int i24 = this.tp;
                                int iEQ = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 0));
                                this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 0)) - this.Ws.get(iEQ)) + 1;
                                if (this.aM.Hw(iEQ)) {
                                    this.tp += this.aM.v5(iEQ).j6;
                                }
                                int i25 = this.J0;
                                this.J0 = this.tp;
                                int childCount3 = this.FH.getChildCount(i);
                                while (true) {
                                    i5 = childCount3 - 1;
                                    if (i11 >= i5) {
                                        break;
                                    }
                                    tp(this.FH.getChildNode(i, i11), z);
                                    i11++;
                                }
                                tp(this.FH.getChildNode(i, i5), z);
                                this.J0 = i25;
                                this.tp = i24;
                            } else {
                                int i26 = this.tp;
                                if (this.v5.contains(JavaFormatOption.NEXTLINE_INDENT)) {
                                    this.tp += this.Zo;
                                }
                                int i27 = this.J0;
                                this.J0 = this.tp;
                                int childCount4 = this.FH.getChildCount(i);
                                while (true) {
                                    i4 = childCount4 - 1;
                                    if (i11 >= i4) {
                                        break;
                                    }
                                    tp(this.FH.getChildNode(i, i11), z);
                                    i11++;
                                }
                                this.J0 = i27;
                                this.tp = i26;
                                tp(this.FH.getChildNode(i, i4), z);
                            }
                            this.we = i23;
                            return;
                        }
                        int i28 = 5;
                        if (syntaxTag == 211) {
                            tp(this.FH.getChildNode(i, 0), z);
                            tp(this.FH.getChildNode(i, 1), z);
                            if (this.v5.contains(JavaFormatOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 1)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 2))) {
                                int i29 = this.tp;
                                int iEQ2 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1));
                                this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 1)) - this.Ws.get(iEQ2)) + 1;
                                if (this.aM.Hw(iEQ2)) {
                                    this.tp += this.aM.v5(iEQ2).j6;
                                }
                                tp(this.FH.getChildNode(i, 2), z);
                                tp(this.FH.getChildNode(i, 3), z);
                                this.tp = i29;
                            } else {
                                int i30 = this.tp;
                                if (this.v5.contains(JavaFormatOption.NEXTLINE_INDENT)) {
                                    this.tp += this.Zo;
                                }
                                tp(this.FH.getChildNode(i, 2), z);
                                tp(this.FH.getChildNode(i, 3), z);
                                this.tp = i30;
                            }
                            int childCount5 = this.FH.getChildCount(i);
                            while (true) {
                                i6 = childCount5 - 1;
                                if (i28 >= i6) {
                                    break;
                                }
                                tp(this.FH.getChildNode(i, i28), z);
                                i28++;
                            }
                            if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i6)) != 133) {
                                this.tp += this.Zo;
                            }
                            tp(this.FH.getChildNode(i, i6), z);
                            if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i6)) != 133) {
                                this.tp -= this.Zo;
                                return;
                            }
                            return;
                        }
                        if (syntaxTag == 231) {
                            tp(this.FH.getChildNode(i, 0), z);
                            tp(this.FH.getChildNode(i, 1), z);
                            tp(this.FH.getChildNode(i, 2), z);
                            int i31 = this.tp;
                            int i32 = this.tp + this.Zo;
                            this.tp = i32;
                            int i33 = this.J0;
                            this.J0 = i32;
                            int childCount6 = this.FH.getChildCount(i);
                            while (true) {
                                int i34 = childCount6 - 1;
                                if (i22 >= i34) {
                                    this.J0 = i33;
                                    this.tp = i31;
                                    tp(this.FH.getChildNode(i, i34), z);
                                    return;
                                }
                                tp(this.FH.getChildNode(i, i22), z);
                                i22++;
                            }
                        } else {
                            if (syntaxTag == 196) {
                                if (we(i)) {
                                    int i35 = this.we;
                                    this.we = -1;
                                    int i36 = this.J8.get(this.Hw.EQ(this.FH, i));
                                    int childCount7 = this.FH.getChildCount(i);
                                    if (this.v5.contains(JavaFormatOption.BRACE_INDENT)) {
                                        this.tp += this.Zo;
                                    }
                                    tp(this.FH.getChildNode(i, 0), z);
                                    if (this.v5.contains(JavaFormatOption.ARRAY_INDENT)) {
                                        this.tp += this.Zo;
                                    }
                                    int i37 = this.J0;
                                    this.J0 = this.tp;
                                    while (true) {
                                        i7 = childCount7 - 1;
                                        if (i11 >= i7) {
                                            break;
                                        }
                                        int childNode2 = this.FH.getChildNode(i, i11);
                                        if (z) {
                                            XL(JavaFormatOption.BLOCK_INDENT, this.J8.get(this.Hw.EQ(this.FH, childNode2)), i36);
                                        }
                                        tp(this.FH.getChildNode(i, i11), z);
                                        i11++;
                                    }
                                    if (this.v5.contains(JavaFormatOption.ARRAY_INDENT)) {
                                        this.tp -= this.Zo;
                                    }
                                    tp(this.FH.getChildNode(i, i7), z);
                                    this.J0 = i37;
                                    if (this.v5.contains(JavaFormatOption.BRACE_INDENT)) {
                                        this.tp -= this.Zo;
                                    }
                                    this.we = i35;
                                    return;
                                }
                                return;
                            }
                            if (syntaxTag == 197) {
                                int i38 = this.we;
                                this.we = -1;
                                Ws(this.FH.getChildNode(i, 0));
                                int childCount8 = this.FH.getChildCount(i);
                                boolean z2 = false;
                                for (int i39 = 0; i39 < childCount8; i39++) {
                                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i39)) == 177) {
                                        z2 = true;
                                    }
                                }
                                if (!z2 && this.v5.contains(JavaFormatOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 0)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1))) {
                                    int i40 = this.tp;
                                    int iEQ3 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 0));
                                    this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 0)) - this.Ws.get(iEQ3)) + 1;
                                    if (this.aM.Hw(iEQ3)) {
                                        this.tp += this.aM.v5(iEQ3).j6;
                                    }
                                    int i41 = this.J0;
                                    this.J0 = this.tp;
                                    while (true) {
                                        i9 = childCount8 - 1;
                                        if (i11 >= i9) {
                                            break;
                                        }
                                        tp(this.FH.getChildNode(i, i11), z);
                                        i11++;
                                    }
                                    tp(this.FH.getChildNode(i, i9), z);
                                    this.J0 = i41;
                                    this.tp = i40;
                                } else {
                                    int i42 = this.tp;
                                    if (this.v5.contains(JavaFormatOption.NEXTLINE_INDENT)) {
                                        this.tp += this.Zo;
                                    }
                                    int i43 = this.J0;
                                    this.J0 = this.tp;
                                    while (true) {
                                        i8 = childCount8 - 1;
                                        if (i11 >= i8) {
                                            break;
                                        }
                                        tp(this.FH.getChildNode(i, i11), z);
                                        i11++;
                                    }
                                    this.J0 = i43;
                                    this.tp = i42;
                                    tp(this.FH.getChildNode(i, i8), z);
                                }
                                this.we = i38;
                                return;
                            }
                            switch (syntaxTag) {
                                case 135:
                                case 137:
                                    break;
                                case 136:
                                    tp(this.FH.getChildNode(i, 0), z);
                                    tp(this.FH.getChildNode(i, 1), z);
                                    if (this.v5.contains(JavaFormatOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 1)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 2))) {
                                        int i44 = this.tp;
                                        int iEQ4 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1));
                                        this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 1)) - this.Ws.get(iEQ4)) + 1;
                                        if (this.aM.Hw(iEQ4)) {
                                            this.tp += this.aM.v5(iEQ4).j6;
                                        }
                                        tp(this.FH.getChildNode(i, 2), z);
                                        tp(this.FH.getChildNode(i, 3), z);
                                        this.tp = i44;
                                    } else {
                                        int i45 = this.tp;
                                        if (this.v5.contains(JavaFormatOption.NEXTLINE_INDENT)) {
                                            this.tp += this.Zo;
                                        }
                                        tp(this.FH.getChildNode(i, 2), z);
                                        tp(this.FH.getChildNode(i, 3), z);
                                        this.tp = i45;
                                    }
                                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) != 133) {
                                        this.tp += this.Zo;
                                    }
                                    tp(this.FH.getChildNode(i, 4), z);
                                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) != 133) {
                                        this.tp -= this.Zo;
                                    }
                                    tp(this.FH.getChildNode(i, 5), z);
                                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) != 133 && this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) != 135 && this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) != 136) {
                                        this.tp += this.Zo;
                                    }
                                    tp(this.FH.getChildNode(i, 6), z);
                                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 133 || this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 135 || this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 136) {
                                        return;
                                    }
                                    this.tp -= this.Zo;
                                    return;
                                default:
                                    int childCount9 = this.FH.getChildCount(i);
                                    while (i11 < childCount9) {
                                        tp(this.FH.getChildNode(i, i11), z);
                                        i11++;
                                    }
                                    return;
                            }
                        }
                    }
                }
                tp(this.FH.getChildNode(i, 0), z);
                tp(this.FH.getChildNode(i, 1), z);
                if (this.v5.contains(JavaFormatOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 1)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 2))) {
                    int i46 = this.tp;
                    int iEQ5 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1));
                    this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 1)) - this.Ws.get(iEQ5)) + 1;
                    if (this.aM.Hw(iEQ5)) {
                        this.tp += this.aM.v5(iEQ5).j6;
                    }
                    tp(this.FH.getChildNode(i, 2), z);
                    tp(this.FH.getChildNode(i, 3), z);
                    this.tp = i46;
                } else {
                    int i47 = this.tp;
                    if (this.v5.contains(JavaFormatOption.NEXTLINE_INDENT)) {
                        this.tp += this.Zo;
                    }
                    tp(this.FH.getChildNode(i, 2), z);
                    tp(this.FH.getChildNode(i, 3), z);
                    this.tp = i47;
                }
                int childCount10 = this.FH.getChildCount(i);
                while (true) {
                    int i48 = childCount10 - 1;
                    if (i21 >= i48) {
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i48)) != 133) {
                            this.tp += this.Zo;
                        }
                        tp(this.FH.getChildNode(i, i48), z);
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i48)) != 133) {
                            this.tp -= this.Zo;
                            return;
                        }
                        return;
                    }
                    tp(this.FH.getChildNode(i, i21), z);
                    i21++;
                }
            }
            int i49 = this.we;
            this.we = this.Hw.EQ(this.FH, i);
            int childCount11 = this.FH.getChildCount(i);
            while (i11 < childCount11) {
                tp(this.FH.getChildNode(i, i11), z);
                i11++;
            }
            this.we = i49;
        } finally {
        }
    }

    @ey(method = 302854533229519767L)
    private int u7(FunctionOfIntInt functionOfIntInt, int i) {
        int iEQ;
        try {
            if (U2) {
                iy.EQ(2590540371236873667L, this, functionOfIntInt, new Integer(i));
            }
            if (!we(i)) {
                return 0;
            }
            int childCount = this.FH.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                int iU7 = u7(functionOfIntInt, this.FH.getChildNode(i, i2));
                if (iU7 != 0) {
                    return iU7;
                }
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            if ((syntaxTag == 123 || syntaxTag == 124 || syntaxTag == 126 || syntaxTag == 133) && (iEQ = this.Hw.EQ(this.FH, i)) != 0 && iEQ < this.gn && this.aM.Hw(iEQ)) {
                return functionOfIntInt.get(iEQ) - this.aM.v5(iEQ).j6;
            }
            return 0;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 2590540371236873667L, this, functionOfIntInt, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4092432132136399167L)
    private void v5(int i, int i2, boolean z) {
        try {
            if (U2) {
                iy.we(2476147827844563477L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            if (this.FH.getStartLine(i) == 0 || z || !this.v5.contains(JavaFormatOption.ADJUST_NEWLINES) || this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2) || this.Hw.u7(this.FH, i) < this.gn || this.Hw.u7(this.FH, i) > this.u7) {
                return;
            }
            this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), "\n");
            this.Hw.J8(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i));
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 2476147827844563477L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 4863758610257868488L)
    private boolean we(int i) {
        try {
            if (U2) {
                iy.u7(-6401753313898278520L, this, i);
            }
            if (this.u7 >= this.Hw.EQ(this.FH, i)) {
                if (this.gn > this.Hw.u7(this.FH, i)) {
                    if (this.Hw.u7(this.FH, i) == 0) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -6401753313898278520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3353976985415058189L)
    public HashtableOfInt<Tools.a> J0(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (U2) {
                iy.J8(5250920384456330039L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.Zo = this.j6.Ws().DW(syntaxTree.getLanguage());
            this.VH = this.j6.Ws().VH;
            this.Mr = i3;
            this.gn = i;
            this.u7 = i2;
            this.FH = syntaxTree;
            this.Hw = f2Var;
            this.J8 = syntaxTree.getFile().rN(i3);
            this.Ws.clear();
            EQ(syntaxTree.getRootNode());
            this.j3.FH();
            this.aM.FH();
            this.tp = 0;
            this.EQ = 0;
            this.we = -1;
            this.J0 = 0;
            tp(syntaxTree.getRootNode(), false);
            j6(syntaxTree.getFile());
            return this.j3;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, 5250920384456330039L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2504022215757628888L)
    public HashtableOfInt<Tools.a> J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (U2) {
                iy.J8(2714622222072934240L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            return J0(syntaxTree, f2Var, i, i2, i3);
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, 2714622222072934240L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3933005424588132864L)
    public Set<? extends FormatOption> QX(SyntaxTree syntaxTree, int i) {
        try {
            if (U2) {
                iy.EQ(-8037013851018277060L, this, syntaxTree, new Integer(i));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.Zo = this.j6.Ws().DW(syntaxTree.getLanguage());
            this.VH = this.j6.Ws().VH;
            this.Mr = i;
            this.gn = 1;
            this.u7 = 10000000;
            this.FH = syntaxTree;
            this.Hw = new f2();
            this.QX = new HashMap();
            this.XL = new HashMap();
            for (JavaFormatOption javaFormatOption : JavaFormatOption.values()) {
                this.QX.put(javaFormatOption, 0);
                this.XL.put(javaFormatOption, 0);
            }
            this.J8 = syntaxTree.getFile().rN(i);
            this.Ws.clear();
            EQ(syntaxTree.getRootNode());
            this.aM.FH();
            this.tp = 0;
            this.EQ = 0;
            this.we = -1;
            this.J0 = 0;
            tp(syntaxTree.getRootNode(), true);
            DW(syntaxTree.getRootNode(), true);
            HashSet hashSet = new HashSet(this.v5);
            for (JavaFormatOption javaFormatOption2 : JavaFormatOption.values()) {
                if (this.QX.get(javaFormatOption2).intValue() + this.XL.get(javaFormatOption2).intValue() > 0) {
                    if (this.QX.get(javaFormatOption2).intValue() > this.XL.get(javaFormatOption2).intValue()) {
                        hashSet.add(javaFormatOption2);
                    } else {
                        hashSet.remove(javaFormatOption2);
                    }
                }
            }
            return hashSet;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -8037013851018277060L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 909038153084711655L)
    public int[] VH(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (!U2) {
                return null;
            }
            iy.J0(3383989720246815015L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            return null;
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, 3383989720246815015L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -539498451321685095L)
    public void Zo(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (U2) {
                iy.J0(4364890256171228413L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.Zo = this.j6.Ws().DW(syntaxTree.getLanguage());
            this.VH = this.j6.Ws().VH;
            this.FH = syntaxTree;
            this.Hw = f2Var;
            this.gn = i;
            this.u7 = i2;
            DW(syntaxTree.getRootNode(), false);
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, 4364890256171228413L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -3810955052498211336L)
    public void gn(SyntaxTree syntaxTree, f2 f2Var, int i) {
        try {
            if (U2) {
                iy.we(-2645828870578097760L, this, syntaxTree, f2Var, new Integer(i));
            }
            if (syntaxTree.getFile().j3(i).endsWith("{")) {
                int i2 = i + 1;
                if (syntaxTree.getFile().U2(i2, 1).startsWith("}")) {
                    this.j6.refactoringCallback.a8(syntaxTree.getFile(), i2, 1, i2, 1, "\n");
                    f2Var.J8(i2, 1);
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -2645828870578097760L, this, syntaxTree, f2Var, new Integer(i));
            }
            throw th;
        }
    }
}
