package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.f2;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.collections.FunctionOfIntInt;
import com.aide.codemodel.api.collections.HashtableOfInt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@cy(clazz = -10679326084040229L, container = -10679326084040229L, user = true)
/* loaded from: classes.dex */
public class b7 {

    @fy
    private static /* synthetic */ boolean U2;

    @gy
    private static /* synthetic */ boolean a8;

    @dy(field = 3666006068099380481L)
    private final JavaScriptLanguage DW;

    @dy(field = 1346330229664208080L)
    private int EQ;

    @dy(field = 1150687618937386467L)
    private SyntaxTree FH;

    @dy(field = 1153369157053746843L)
    private f2 Hw;

    @dy(field = 4531805095522547589L)
    private int J0;

    @dy(field = 481187888307259000L)
    private FunctionOfIntInt J8;

    @dy(field = -3302703187984346547L)
    private int Mr;

    @dy(field = 2569881517383701475L)
    private Map<JavaScriptFormatterOption, Integer> QX;

    @dy(field = -3691352991239246055L)
    private int VH;

    @dy(field = 6156966984217503879L)
    private FunctionOfIntInt Ws;

    @dy(field = 533050130754622740L)
    private Map<JavaScriptFormatterOption, Integer> XL;

    @dy(field = -4604401251186229077L)
    private int Zo;

    @dy(field = 2629974950909491731L)
    private HashtableOfInt<Tools.a> aM;

    @dy(field = -3705770524623935399L)
    private int gn;

    @dy(field = 3606091520296160L)
    private HashtableOfInt<Tools.a> j3;

    @dy(field = 1647981674864744112L)
    private final Model j6;

    @dy(field = -1884083857280719920L)
    private int tp;

    @dy(field = 1377917841996727304L)
    private int u7;

    @dy(field = -1840625908037127549L)
    private Set<? extends FormatOption> v5;

    @dy(field = 788384904320388131L)
    private int we;

    static {
        iy.Zo(b7.class);
    }

    @ey(method = -349976995060083507L)
    public b7(Model model, JavaScriptLanguage javaScriptLanguage) {
        try {
            if (U2) {
                iy.EQ(1867708413454879215L, null, model, javaScriptLanguage);
            }
            this.j6 = model;
            this.DW = javaScriptLanguage;
            this.aM = new HashtableOfInt<>();
            this.j3 = new HashtableOfInt<>();
            this.J8 = new FunctionOfIntInt();
            this.Ws = new FunctionOfIntInt();
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 1867708413454879215L, null, model, javaScriptLanguage);
            }
            throw th;
        }
    }

    @ey(method = 320680855218703743L)
    private void DW(int i, boolean z) {
        try {
            if (U2) {
                iy.EQ(-3821139309412378247L, this, new Integer(i), new Boolean(z));
            }
            if (this.FH.isSyntheticNode(i)) {
                return;
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            if (syntaxTag == 124 || syntaxTag == 125) {
                DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                    Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaScriptFormatterOption.FUNCTION_NEWLINE, z);
                }
                DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), z);
                return;
            }
            if (syntaxTag == 133) {
                for (int childCount = this.FH.getChildCount(i) - 1; childCount >= 1; childCount--) {
                    int childNode = this.FH.getChildNode(i, childCount);
                    if (!this.FH.isSyntheticNode(childNode)) {
                        int childNode2 = this.FH.getChildNode(i, childCount - 1);
                        if (this.FH.isSyntheticNode(childNode2)) {
                            childNode2 = this.FH.getChildNode(i, childCount - 2);
                        }
                        DW(childNode, z);
                        if (this.v5.contains(JavaScriptFormatterOption.STATEMENT_WRAP) && this.Hw.VH(this.FH, childNode) > this.VH) {
                            v5(childNode2, childNode, z);
                        }
                    }
                }
                return;
            }
            if (syntaxTag == 165) {
                int childCount2 = this.FH.getChildCount(i);
                FH(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaScriptFormatterOption.ARRAYARGUMENT_SPACE, z);
                for (int i2 = childCount2 - 2; i2 >= 2; i2 -= 2) {
                    DW(this.FH.getChildNode(i, i2), z);
                }
                FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaScriptFormatterOption.ARRAYARGUMENT_SPACE, z);
                FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.ARRAYMETHODCALL_SPACE, z);
                DW(this.FH.getChildNode(i, 0), z);
                return;
            }
            if (syntaxTag == 168) {
                FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaScriptFormatterOption.PAREN_SPACE, z);
                DW(this.FH.getChildNode(i, 1), z);
                FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.PAREN_SPACE, z);
                return;
            }
            if (syntaxTag == 172) {
                DW(this.FH.getChildNode(i, 2), z);
                if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) != 146) {
                    FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaScriptFormatterOption.BINARYOPERATOR_SPACE, z);
                } else {
                    FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaScriptFormatterOption.ASSIGNMENTOPERATOR_SPACE, z);
                }
                DW(this.FH.getChildNode(i, 1), z);
                if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) != 146) {
                    FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.BINARYOPERATOR_SPACE, z);
                } else {
                    FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.ASSIGNMENTOPERATOR_SPACE, z);
                }
                DW(this.FH.getChildNode(i, 0), z);
                return;
            }
            if (syntaxTag == 190) {
                if (this.FH.getChildCount(i) == 2) {
                    FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.PARAMETER_SPACE, z);
                    return;
                }
                FH(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaScriptFormatterOption.PARAMETER_SPACE, z);
                for (int childCount3 = this.FH.getChildCount(i) - 2; childCount3 >= 2; childCount3 -= 2) {
                    FH(this.FH.getChildNode(i, childCount3 - 1), this.FH.getChildNode(i, childCount3), JavaScriptFormatterOption.PARAMETERCOMMA_SPACE, z);
                }
                FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.PARAMETER_SPACE, z);
                return;
            }
            if (syntaxTag == 197) {
                if (this.FH.getChildCount(i) == 2) {
                    FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.ARGUMENT_SPACE, z);
                } else {
                    FH(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaScriptFormatterOption.ARGUMENT_SPACE, z);
                    int childCount4 = this.FH.getChildCount(i);
                    for (int i3 = childCount4 - 2; i3 >= 2; i3 -= 2) {
                        int childNode3 = this.FH.getChildNode(i, i3 - 1);
                        int childNode4 = this.FH.getChildNode(i, i3);
                        DW(childNode4, z);
                        FH(childNode3, childNode4, JavaScriptFormatterOption.ARGUMENTCOMMA_SPACE, z);
                    }
                    if (childCount4 >= 3) {
                        DW(this.FH.getChildNode(i, 1), z);
                    }
                    FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.ARGUMENT_SPACE, z);
                }
                FH(this.FH.getLeftSisterNode(i), i, JavaScriptFormatterOption.METHODCALL_SPACE, z);
                return;
            }
            switch (syntaxTag) {
                case 135:
                case 137:
                    break;
                case 136:
                    DW(this.FH.getChildNode(i, 6), z);
                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 133) {
                        Hw(this.FH.getChildNode(i, 5), this.FH.getChildNode(i, 6), JavaScriptFormatterOption.BLOCK_NEWLINE, z);
                    }
                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) == 133) {
                        Hw(this.FH.getChildNode(i, 4), this.FH.getChildNode(i, 5), JavaScriptFormatterOption.ELSE_NEWLINE, z);
                    }
                    DW(this.FH.getChildNode(i, 4), z);
                    if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) == 133) {
                        Hw(this.FH.getChildNode(i, 3), this.FH.getChildNode(i, 4), JavaScriptFormatterOption.BLOCK_NEWLINE, z);
                    }
                    FH(this.FH.getChildNode(i, 2), this.FH.getChildNode(i, 3), JavaScriptFormatterOption.CONDITION_SPACE, z);
                    DW(this.FH.getChildNode(i, 2), z);
                    FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaScriptFormatterOption.CONDITION_SPACE, z);
                    FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.KEYWORD_SPACE, z);
                    return;
                default:
                    switch (syntaxTag) {
                        case 147:
                            break;
                        case 148:
                            DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                            if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                                Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaScriptFormatterOption.BLOCK_NEWLINE, z);
                                return;
                            }
                            return;
                        case 149:
                            DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
                            if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                                Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaScriptFormatterOption.BLOCK_NEWLINE, z);
                            }
                            FH(this.FH.getChildNode(i, 4), this.FH.getChildNode(i, 5), JavaScriptFormatterOption.CONDITION_SPACE, z);
                            DW(this.FH.getChildNode(i, 4), z);
                            DW(this.FH.getChildNode(i, 3), z);
                            DW(this.FH.getChildNode(i, 2), z);
                            FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaScriptFormatterOption.CONDITION_SPACE, z);
                            FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.KEYWORD_SPACE, z);
                            return;
                        case 150:
                            for (int childCount5 = this.FH.getChildCount(i) - 1; childCount5 >= 1; childCount5--) {
                                DW(this.FH.getChildNode(i, childCount5), z);
                            }
                            Hw(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.BLOCK_NEWLINE, z);
                            return;
                        default:
                            for (int childCount6 = this.FH.getChildCount(i) - 1; childCount6 >= 0; childCount6--) {
                                DW(this.FH.getChildNode(i, childCount6), z);
                            }
                            return;
                    }
            }
            DW(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), z);
            if (this.FH.getSyntaxTag(this.FH.getChildNode(i, this.FH.getChildCount(i) - 1)) == 133) {
                Hw(this.FH.getChildNode(i, this.FH.getChildCount(i) - 2), this.FH.getChildNode(i, this.FH.getChildCount(i) - 1), JavaScriptFormatterOption.BLOCK_NEWLINE, z);
            }
            FH(this.FH.getChildNode(i, 2), this.FH.getChildNode(i, 3), JavaScriptFormatterOption.CONDITION_SPACE, z);
            DW(this.FH.getChildNode(i, 2), z);
            FH(this.FH.getChildNode(i, 1), this.FH.getChildNode(i, 2), JavaScriptFormatterOption.CONDITION_SPACE, z);
            FH(this.FH.getChildNode(i, 0), this.FH.getChildNode(i, 1), JavaScriptFormatterOption.KEYWORD_SPACE, z);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -3821139309412378247L, this, new Integer(i), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -5547081287132562240L)
    private void EQ(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        try {
            if (U2) {
                iy.EQ(-1679252202837954136L, this, new Integer(i), new Boolean(z));
            }
            if (this.FH.isSyntheticNode(i)) {
                return;
            }
            if (this.FH.getLanguage().getSyntax().tp(this.FH.getSyntaxTag(i))) {
                QX(i);
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            int i9 = -1;
            int i10 = 0;
            if (syntaxTag == 133) {
                if (J0(i)) {
                    int i11 = this.we;
                    this.we = -1;
                    int i12 = this.Ws.get(this.Hw.EQ(this.FH, i));
                    int childCount = this.FH.getChildCount(i);
                    if (this.v5.contains(JavaScriptFormatterOption.BRACE_INDENT)) {
                        this.tp += this.Zo;
                    }
                    EQ(this.FH.getChildNode(i, 0), z);
                    if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) == 147 && this.v5.contains(JavaScriptFormatterOption.CASELABEL_INDENT)) {
                        this.tp += this.Zo;
                    }
                    if (this.v5.contains(JavaScriptFormatterOption.BLOCK_INDENT)) {
                        this.tp += this.Zo;
                    }
                    int i13 = this.J0;
                    this.J0 = this.tp;
                    int i14 = 1;
                    int i15 = -1;
                    while (true) {
                        i2 = childCount - 1;
                        if (i14 >= i2) {
                            break;
                        }
                        int childNode = this.FH.getChildNode(i, i14);
                        int syntaxTag2 = this.FH.getSyntaxTag(childNode);
                        if (syntaxTag2 == 143 || syntaxTag2 == 144) {
                            if (z) {
                                i15 = this.Ws.get(this.Hw.EQ(this.FH, childNode));
                                aM(JavaScriptFormatterOption.CASELABEL_INDENT, i15, i12);
                            }
                            if (this.v5.contains(JavaScriptFormatterOption.CASE_INDENT)) {
                                this.tp -= this.Zo;
                            }
                            EQ(childNode, z);
                            if (this.v5.contains(JavaScriptFormatterOption.CASE_INDENT)) {
                                this.tp += this.Zo;
                            }
                        } else if (syntaxTag2 != 148) {
                            if (z) {
                                if (i15 != i9) {
                                    aM(JavaScriptFormatterOption.CASE_INDENT, this.Ws.get(this.Hw.EQ(this.FH, childNode)), i15);
                                    i15 = -1;
                                } else if (i14 == 1) {
                                    aM(JavaScriptFormatterOption.BLOCK_INDENT, this.Ws.get(this.Hw.EQ(this.FH, childNode)), i12);
                                }
                            }
                            EQ(childNode, z);
                        } else {
                            if (this.v5.contains(JavaScriptFormatterOption.LABELLEFT_INDENT)) {
                                int i16 = this.tp;
                                this.tp = 0;
                                QX(this.FH.getChildNode(childNode, 0));
                                this.tp = i16;
                            }
                            if (z) {
                                j3(JavaScriptFormatterOption.LABELLEFT_INDENT, this.Ws.get(this.Hw.EQ(this.FH, childNode)) == 0);
                            }
                            EQ(childNode, z);
                        }
                        i14++;
                        i9 = -1;
                    }
                    if (this.v5.contains(JavaScriptFormatterOption.BLOCK_INDENT)) {
                        this.tp -= this.Zo;
                    }
                    if (this.FH.getSyntaxTag(this.FH.getParentNode(i)) == 147 && this.v5.contains(JavaScriptFormatterOption.CASELABEL_INDENT)) {
                        this.tp -= this.Zo;
                    }
                    EQ(this.FH.getChildNode(i, i2), z);
                    this.J0 = i13;
                    if (this.v5.contains(JavaScriptFormatterOption.BRACE_INDENT)) {
                        this.tp -= this.Zo;
                    }
                    this.we = i11;
                    return;
                }
                return;
            }
            if (syntaxTag != 146) {
                int i17 = 4;
                if (syntaxTag != 149) {
                    if (syntaxTag == 190) {
                        int i18 = this.we;
                        this.we = -1;
                        QX(this.FH.getChildNode(i, 0));
                        if (this.v5.contains(JavaScriptFormatterOption.PARAMETER_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 0)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1))) {
                            int i19 = this.tp;
                            int iEQ = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 0));
                            this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 0)) - this.J8.get(iEQ)) + 1;
                            if (this.aM.Hw(iEQ)) {
                                this.tp += this.aM.v5(iEQ).j6;
                            }
                            int i20 = this.J0;
                            this.J0 = this.tp;
                            int childCount2 = this.FH.getChildCount(i);
                            while (true) {
                                i4 = childCount2 - 1;
                                if (i10 >= i4) {
                                    break;
                                }
                                EQ(this.FH.getChildNode(i, i10), z);
                                i10++;
                            }
                            EQ(this.FH.getChildNode(i, i4), z);
                            this.J0 = i20;
                            this.tp = i19;
                        } else {
                            int i21 = this.tp;
                            if (this.v5.contains(JavaScriptFormatterOption.NEXTLINE_INDENT)) {
                                this.tp += this.Zo;
                            }
                            int i22 = this.J0;
                            this.J0 = this.tp;
                            int childCount3 = this.FH.getChildCount(i);
                            while (true) {
                                i3 = childCount3 - 1;
                                if (i10 >= i3) {
                                    break;
                                }
                                EQ(this.FH.getChildNode(i, i10), z);
                                i10++;
                            }
                            this.J0 = i22;
                            this.tp = i21;
                            EQ(this.FH.getChildNode(i, i3), z);
                        }
                        this.we = i18;
                        return;
                    }
                    int i23 = 5;
                    if (syntaxTag == 211) {
                        EQ(this.FH.getChildNode(i, 0), z);
                        EQ(this.FH.getChildNode(i, 1), z);
                        if (this.v5.contains(JavaScriptFormatterOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 1)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 2))) {
                            int i24 = this.tp;
                            int iEQ2 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1));
                            this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 1)) - this.J8.get(iEQ2)) + 1;
                            if (this.aM.Hw(iEQ2)) {
                                this.tp += this.aM.v5(iEQ2).j6;
                            }
                            EQ(this.FH.getChildNode(i, 2), z);
                            EQ(this.FH.getChildNode(i, 3), z);
                            this.tp = i24;
                        } else {
                            int i25 = this.tp;
                            if (this.v5.contains(JavaScriptFormatterOption.NEXTLINE_INDENT)) {
                                this.tp += this.Zo;
                            }
                            EQ(this.FH.getChildNode(i, 2), z);
                            EQ(this.FH.getChildNode(i, 3), z);
                            this.tp = i25;
                        }
                        int childCount4 = this.FH.getChildCount(i);
                        while (true) {
                            i5 = childCount4 - 1;
                            if (i23 >= i5) {
                                break;
                            }
                            EQ(this.FH.getChildNode(i, i23), z);
                            i23++;
                        }
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i5)) != 133) {
                            this.tp += this.Zo;
                        }
                        EQ(this.FH.getChildNode(i, i5), z);
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i5)) != 133) {
                            this.tp -= this.Zo;
                            return;
                        }
                        return;
                    }
                    if (syntaxTag != 140) {
                        if (syntaxTag != 141 && syntaxTag != 151 && syntaxTag != 152) {
                            if (syntaxTag != 196) {
                                if (syntaxTag == 197) {
                                    int i26 = this.we;
                                    this.we = -1;
                                    QX(this.FH.getChildNode(i, 0));
                                    int childCount5 = this.FH.getChildCount(i);
                                    if (this.v5.contains(JavaScriptFormatterOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 0)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1))) {
                                        int i27 = this.tp;
                                        int iEQ3 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 0));
                                        this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 0)) - this.J8.get(iEQ3)) + 1;
                                        if (this.aM.Hw(iEQ3)) {
                                            this.tp += this.aM.v5(iEQ3).j6;
                                        }
                                        int i28 = this.J0;
                                        this.J0 = this.tp;
                                        while (true) {
                                            i8 = childCount5 - 1;
                                            if (i10 >= i8) {
                                                break;
                                            }
                                            EQ(this.FH.getChildNode(i, i10), z);
                                            i10++;
                                        }
                                        EQ(this.FH.getChildNode(i, i8), z);
                                        this.J0 = i28;
                                        this.tp = i27;
                                    } else {
                                        int i29 = this.tp;
                                        if (this.v5.contains(JavaScriptFormatterOption.NEXTLINE_INDENT)) {
                                            this.tp += this.Zo;
                                        }
                                        int i30 = this.J0;
                                        this.J0 = this.tp;
                                        while (true) {
                                            i7 = childCount5 - 1;
                                            if (i10 >= i7) {
                                                break;
                                            }
                                            EQ(this.FH.getChildNode(i, i10), z);
                                            i10++;
                                        }
                                        this.J0 = i30;
                                        this.tp = i29;
                                        EQ(this.FH.getChildNode(i, i7), z);
                                    }
                                    this.we = i26;
                                    return;
                                }
                                switch (syntaxTag) {
                                    case 135:
                                    case 137:
                                        break;
                                    case 136:
                                        EQ(this.FH.getChildNode(i, 0), z);
                                        EQ(this.FH.getChildNode(i, 1), z);
                                        if (this.v5.contains(JavaScriptFormatterOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 1)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 2))) {
                                            int i31 = this.tp;
                                            int iEQ4 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1));
                                            this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 1)) - this.J8.get(iEQ4)) + 1;
                                            if (this.aM.Hw(iEQ4)) {
                                                this.tp += this.aM.v5(iEQ4).j6;
                                            }
                                            EQ(this.FH.getChildNode(i, 2), z);
                                            EQ(this.FH.getChildNode(i, 3), z);
                                            this.tp = i31;
                                        } else {
                                            int i32 = this.tp;
                                            if (this.v5.contains(JavaScriptFormatterOption.NEXTLINE_INDENT)) {
                                                this.tp += this.Zo;
                                            }
                                            EQ(this.FH.getChildNode(i, 2), z);
                                            EQ(this.FH.getChildNode(i, 3), z);
                                            this.tp = i32;
                                        }
                                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) != 133) {
                                            this.tp += this.Zo;
                                        }
                                        EQ(this.FH.getChildNode(i, 4), z);
                                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 4)) != 133) {
                                            this.tp -= this.Zo;
                                        }
                                        EQ(this.FH.getChildNode(i, 5), z);
                                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) != 133 && this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) != 135 && this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) != 136) {
                                            this.tp += this.Zo;
                                        }
                                        EQ(this.FH.getChildNode(i, 6), z);
                                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 133 || this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 135 || this.FH.getSyntaxTag(this.FH.getChildNode(i, 6)) == 136) {
                                            return;
                                        }
                                        this.tp -= this.Zo;
                                        return;
                                    default:
                                        int childCount6 = this.FH.getChildCount(i);
                                        while (i10 < childCount6) {
                                            EQ(this.FH.getChildNode(i, i10), z);
                                            i10++;
                                        }
                                        return;
                                }
                            }
                        }
                    }
                    if (J0(i)) {
                        int i33 = this.we;
                        this.we = -1;
                        int i34 = this.Ws.get(this.Hw.EQ(this.FH, i));
                        int childCount7 = this.FH.getChildCount(i);
                        if (this.v5.contains(JavaScriptFormatterOption.BRACE_INDENT)) {
                            this.tp += this.Zo;
                        }
                        EQ(this.FH.getChildNode(i, 0), z);
                        if (this.v5.contains(JavaScriptFormatterOption.ARRAY_INDENT)) {
                            this.tp += this.Zo;
                        }
                        int i35 = this.J0;
                        this.J0 = this.tp;
                        while (true) {
                            i6 = childCount7 - 1;
                            if (i10 >= i6) {
                                break;
                            }
                            int childNode2 = this.FH.getChildNode(i, i10);
                            if (z) {
                                aM(JavaScriptFormatterOption.BLOCK_INDENT, this.Ws.get(this.Hw.EQ(this.FH, childNode2)), i34);
                            }
                            EQ(this.FH.getChildNode(i, i10), z);
                            i10++;
                        }
                        if (this.v5.contains(JavaScriptFormatterOption.ARRAY_INDENT)) {
                            this.tp -= this.Zo;
                        }
                        EQ(this.FH.getChildNode(i, i6), z);
                        this.J0 = i35;
                        if (this.v5.contains(JavaScriptFormatterOption.BRACE_INDENT)) {
                            this.tp -= this.Zo;
                        }
                        this.we = i33;
                        return;
                    }
                    return;
                }
                EQ(this.FH.getChildNode(i, 0), z);
                EQ(this.FH.getChildNode(i, 1), z);
                if (this.v5.contains(JavaScriptFormatterOption.ARGUMENT_INDENT) && this.Hw.u7(this.FH, this.FH.getChildNode(i, 1)) == this.Hw.EQ(this.FH, this.FH.getChildNode(i, 2))) {
                    int i36 = this.tp;
                    int iEQ5 = this.Hw.EQ(this.FH, this.FH.getChildNode(i, 1));
                    this.tp = (this.Hw.tp(this.FH, this.FH.getChildNode(i, 1)) - this.J8.get(iEQ5)) + 1;
                    if (this.aM.Hw(iEQ5)) {
                        this.tp += this.aM.v5(iEQ5).j6;
                    }
                    EQ(this.FH.getChildNode(i, 2), z);
                    EQ(this.FH.getChildNode(i, 3), z);
                    this.tp = i36;
                } else {
                    int i37 = this.tp;
                    if (this.v5.contains(JavaScriptFormatterOption.NEXTLINE_INDENT)) {
                        this.tp += this.Zo;
                    }
                    EQ(this.FH.getChildNode(i, 2), z);
                    EQ(this.FH.getChildNode(i, 3), z);
                    this.tp = i37;
                }
                int childCount8 = this.FH.getChildCount(i);
                while (true) {
                    int i38 = childCount8 - 1;
                    if (i17 >= i38) {
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i38)) != 133) {
                            this.tp += this.Zo;
                        }
                        EQ(this.FH.getChildNode(i, i38), z);
                        if (this.FH.getSyntaxTag(this.FH.getChildNode(i, i38)) != 133) {
                            this.tp -= this.Zo;
                            return;
                        }
                        return;
                    }
                    EQ(this.FH.getChildNode(i, i17), z);
                    i17++;
                }
            }
            int i39 = this.we;
            this.we = this.Hw.EQ(this.FH, i);
            int childCount9 = this.FH.getChildCount(i);
            while (i10 < childCount9) {
                EQ(this.FH.getChildNode(i, i10), z);
                i10++;
            }
            this.we = i39;
        } finally {
        }
    }

    @ey(method = -4405272607249062516L)
    private void FH(int i, int i2, JavaScriptFormatterOption javaScriptFormatterOption, boolean z) {
        try {
            if (U2) {
                iy.J0(1612510814553546600L, this, new Integer(i), new Integer(i2), javaScriptFormatterOption, new Boolean(z));
            }
            if (this.FH.getStartLine(i) != 0) {
                if (z) {
                    if (this.Hw.u7(this.FH, i) == this.Hw.EQ(this.FH, i2)) {
                        j3(javaScriptFormatterOption, this.Hw.VH(this.FH, i) != this.Hw.tp(this.FH, i2));
                        return;
                    }
                    return;
                }
                if (this.v5.contains(JavaScriptFormatterOption.ADJUST_SPACES)) {
                    if (this.v5.contains(javaScriptFormatterOption)) {
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
                iy.a8(th, 1612510814553546600L, this, new Integer(i), new Integer(i2), javaScriptFormatterOption, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 2657739843066845200L)
    private void Hw(int i, int i2, JavaScriptFormatterOption javaScriptFormatterOption, boolean z) {
        try {
            if (U2) {
                iy.J0(40914997162715184L, this, new Integer(i), new Integer(i2), javaScriptFormatterOption, new Boolean(z));
            }
            if (this.FH.getStartLine(i) != 0) {
                if (z) {
                    boolean z2 = true;
                    j3(javaScriptFormatterOption, this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2));
                    if (this.Hw.u7(this.FH, i) == this.Hw.EQ(this.FH, i2)) {
                        JavaScriptFormatterOption javaScriptFormatterOption2 = JavaScriptFormatterOption.BRACE_SPACE;
                        if (this.Hw.VH(this.FH, i) == this.Hw.tp(this.FH, i2)) {
                            z2 = false;
                        }
                        j3(javaScriptFormatterOption2, z2);
                        return;
                    }
                    return;
                }
                if (this.v5.contains(JavaScriptFormatterOption.ADJUST_NEWLINES)) {
                    if (this.v5.contains(javaScriptFormatterOption)) {
                        if (this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2) || this.Hw.u7(this.FH, i) < this.gn || this.Hw.u7(this.FH, i) > this.u7) {
                            return;
                        }
                        this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), "\n");
                        this.Hw.J8(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i));
                        return;
                    }
                    if (this.Hw.u7(this.FH, i) == this.Hw.EQ(this.FH, i2)) {
                        FH(i, i2, JavaScriptFormatterOption.BRACE_SPACE, z);
                        return;
                    }
                    if (this.Hw.EQ(this.FH, i) >= this.gn && this.Hw.u7(this.FH, i2) <= this.u7) {
                        this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.EQ(this.FH, i2), this.Hw.tp(this.FH, i2), "");
                        this.Hw.XL(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.EQ(this.FH, i2), this.Hw.tp(this.FH, i2));
                    }
                    if (!this.v5.contains(JavaScriptFormatterOption.BRACE_SPACE) || this.Hw.u7(this.FH, i) < this.gn || this.Hw.u7(this.FH, i) > this.u7) {
                        return;
                    }
                    this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), " ");
                    this.Hw.J0(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), " ");
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, 40914997162715184L, this, new Integer(i), new Integer(i2), javaScriptFormatterOption, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -4748277792653660580L)
    private boolean J0(int i) {
        try {
            if (U2) {
                iy.u7(-598721731447777520L, this, i);
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
                iy.j3(th, -598721731447777520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1741545535028204037L)
    private void QX(int i) {
        try {
            if (U2) {
                iy.u7(-1074299957601675693L, this, i);
            }
            int iEQ = this.Hw.EQ(this.FH, i);
            if (iEQ == 0 || iEQ == this.EQ) {
                return;
            }
            if (this.EQ > iEQ) {
                this.EQ = iEQ;
            }
            int i2 = 0;
            if (iEQ != this.we && this.we != -1 && this.v5.contains(JavaScriptFormatterOption.NEXTLINE_INDENT)) {
                i2 = this.Zo;
            }
            while (this.EQ < iEQ - 1) {
                int i3 = this.EQ + 1;
                this.EQ = i3;
                if (!this.aM.Hw(i3) || this.aM.v5(this.EQ).Hw > 101) {
                    this.aM.VH(this.EQ, new Tools.a(this.DW, this.J0 + i2, false, false, 1001));
                }
            }
            if (!this.aM.Hw(iEQ) || this.aM.v5(iEQ).Hw > 101) {
                this.aM.VH(iEQ, new Tools.a(this.DW, this.tp + i2, false, false, 101));
            }
            this.EQ = iEQ;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1074299957601675693L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 69835505097036952L)
    private void Zo(int i) {
        try {
            if (U2) {
                iy.u7(653471258532313796L, this, i);
            }
            if (this.FH.isSyntheticNode(i)) {
                return;
            }
            if (this.FH.getSyntaxTag(i) == 2) {
                int iEQ = this.Hw.EQ(this.FH, i);
                while (true) {
                    iEQ++;
                    if (iEQ > this.Hw.u7(this.FH, i)) {
                        break;
                    } else {
                        this.aM.VH(iEQ, new Tools.a(this.DW, 0, false, true, 0));
                    }
                }
            }
            int childCount = this.FH.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                Zo(this.FH.getChildNode(i, i2));
            }
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 653471258532313796L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1044646800388017021L)
    private void aM(JavaScriptFormatterOption javaScriptFormatterOption, int i, int i2) {
        try {
            if (U2) {
                iy.we(-2554783093324690965L, this, javaScriptFormatterOption, new Integer(i), new Integer(i2));
            }
            j3(javaScriptFormatterOption, i != i2);
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -2554783093324690965L, this, javaScriptFormatterOption, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 7775671066167225984L)
    private void j3(JavaScriptFormatterOption javaScriptFormatterOption, boolean z) {
        try {
            if (U2) {
                iy.EQ(2778726680070876700L, this, javaScriptFormatterOption, new Boolean(z));
            }
            if (z) {
                this.QX.put(javaScriptFormatterOption, Integer.valueOf(this.QX.get(javaScriptFormatterOption).intValue() + 1));
            } else {
                this.XL.put(javaScriptFormatterOption, Integer.valueOf(this.XL.get(javaScriptFormatterOption).intValue() + 1));
            }
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 2778726680070876700L, this, javaScriptFormatterOption, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 452055376369227399L)
    private void j6(FileEntry fileEntry) {
        try {
            if (U2) {
                iy.tp(7967856651298557629L, this, fileEntry);
            }
            if (this.gn == 1) {
                this.j3.gn(this.aM);
                return;
            }
            int iTp = tp(fileEntry.rN(this.Mr), this.FH.getRootNode());
            this.aM.j6.DW();
            while (this.aM.j6.j6()) {
                this.j3.VH(this.aM.j6.FH(), this.aM.j6.Hw().DW(iTp));
            }
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 7967856651298557629L, this, fileEntry);
            }
            throw th;
        }
    }

    @ey(method = 3055675736793395281L)
    private int tp(FunctionOfIntInt functionOfIntInt, int i) {
        int iEQ;
        try {
            if (U2) {
                iy.EQ(-2645902719953057385L, this, functionOfIntInt, new Integer(i));
            }
            if (!J0(i)) {
                return 0;
            }
            int childCount = this.FH.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                int iTp = tp(functionOfIntInt, this.FH.getChildNode(i, i2));
                if (iTp != 0) {
                    return iTp;
                }
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            if ((syntaxTag == 97 || syntaxTag == 133) && (iEQ = this.Hw.EQ(this.FH, i)) != 0 && iEQ < this.gn && this.aM.Hw(iEQ)) {
                return functionOfIntInt.get(iEQ) - this.aM.v5(iEQ).j6;
            }
            return 0;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -2645902719953057385L, this, functionOfIntInt, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3515780921699111147L)
    private void v5(int i, int i2, boolean z) {
        try {
            if (U2) {
                iy.we(205378760643297593L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            if (this.FH.getStartLine(i) == 0 || z || !this.v5.contains(JavaScriptFormatterOption.ADJUST_NEWLINES) || this.Hw.u7(this.FH, i) != this.Hw.EQ(this.FH, i2) || this.Hw.u7(this.FH, i) < this.gn || this.Hw.u7(this.FH, i) > this.u7) {
                return;
            }
            this.j6.refactoringCallback.nw(this.FH.getFile(), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i), "\n");
            this.Hw.J8(this.Hw.u7(this.FH, i), this.Hw.VH(this.FH, i));
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 205378760643297593L, this, new Integer(i), new Integer(i2), new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = 7286925888912535752L)
    private void we(int i) {
        try {
            if (U2) {
                iy.u7(6822909593585102380L, this, i);
            }
            if (this.FH.isSyntheticNode(i)) {
                return;
            }
            if (this.FH.getLanguage().getSyntax().tp(this.FH.getSyntaxTag(i))) {
                int iEQ = this.Hw.EQ(this.FH, i);
                int iTp = this.Hw.tp(this.FH, i);
                if (this.J8.get(iEQ) <= 0 || this.J8.get(iEQ) > iTp) {
                    this.J8.Zo(iEQ, iTp);
                }
            }
            int syntaxTag = this.FH.getSyntaxTag(i);
            int i2 = 0;
            if (syntaxTag != 133 && syntaxTag != 140 && syntaxTag != 196) {
                int childCount = this.FH.getChildCount(i);
                while (i2 < childCount) {
                    we(this.FH.getChildNode(i, i2));
                    i2++;
                }
                return;
            }
            if (J0(i)) {
                int childCount2 = this.FH.getChildCount(i);
                while (i2 < childCount2) {
                    we(this.FH.getChildNode(i, i2));
                    i2++;
                }
            }
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 6822909593585102380L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5604048420101354239L)
    public HashtableOfInt<Tools.a> J8(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (U2) {
                iy.J8(-1910860742740272813L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.v5 = this.j6.Ws().j6(syntaxTree.getLanguage());
            this.Zo = this.j6.Ws().DW(syntaxTree.getLanguage());
            this.VH = this.j6.Ws().VH;
            this.Mr = i3;
            this.gn = i;
            this.u7 = i2;
            this.FH = syntaxTree;
            this.Hw = f2Var;
            this.Ws = syntaxTree.getFile().rN(i3);
            this.J8.clear();
            we(syntaxTree.getRootNode());
            this.j3.FH();
            this.aM.FH();
            this.tp = 0;
            this.EQ = 0;
            this.we = -1;
            this.J0 = 0;
            EQ(syntaxTree.getRootNode(), false);
            Zo(syntaxTree.getRootNode());
            j6(syntaxTree.getFile());
            return this.j3;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, -1910860742740272813L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 2290399530150071175L)
    public void VH(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (U2) {
                iy.J0(5197963680966344313L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
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
                iy.a8(th, 5197963680966344313L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 455204441543621840L)
    public HashtableOfInt<Tools.a> Ws(SyntaxTree syntaxTree, f2 f2Var, int i, int i2, int i3) {
        try {
            if (!U2) {
                return null;
            }
            iy.J8(1114045685254033808L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            return null;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, 1114045685254033808L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -4831658002252275672L)
    public Set<? extends FormatOption> XL(SyntaxTree syntaxTree, int i) {
        try {
            if (U2) {
                iy.EQ(-7054485093702278540L, this, syntaxTree, new Integer(i));
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
            for (JavaScriptFormatterOption javaScriptFormatterOption : JavaScriptFormatterOption.values()) {
                this.QX.put(javaScriptFormatterOption, 0);
                this.XL.put(javaScriptFormatterOption, 0);
            }
            this.Ws = syntaxTree.getFile().rN(i);
            this.J8.clear();
            we(syntaxTree.getRootNode());
            this.aM.FH();
            this.tp = 0;
            this.EQ = 0;
            this.we = -1;
            this.J0 = 0;
            EQ(syntaxTree.getRootNode(), true);
            DW(syntaxTree.getRootNode(), true);
            HashSet hashSet = new HashSet(this.v5);
            for (JavaScriptFormatterOption javaScriptFormatterOption2 : JavaScriptFormatterOption.values()) {
                if (this.QX.get(javaScriptFormatterOption2).intValue() + this.XL.get(javaScriptFormatterOption2).intValue() > 0) {
                    if (this.QX.get(javaScriptFormatterOption2).intValue() > this.XL.get(javaScriptFormatterOption2).intValue()) {
                        hashSet.add(javaScriptFormatterOption2);
                    } else {
                        hashSet.remove(javaScriptFormatterOption2);
                    }
                }
            }
            return hashSet;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -7054485093702278540L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -340393878221205159L)
    public int[] gn(SyntaxTree syntaxTree, f2 f2Var, int i, int i2) {
        try {
            if (!U2) {
                return null;
            }
            iy.J0(-2447538495808312045L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            return null;
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -2447538495808312045L, this, syntaxTree, f2Var, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -431985601522914320L)
    public void u7(SyntaxTree syntaxTree, f2 f2Var, int i) {
        try {
            if (U2) {
                iy.we(-602990788589067280L, this, syntaxTree, f2Var, new Integer(i));
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
                iy.U2(th, -602990788589067280L, this, syntaxTree, f2Var, new Integer(i));
            }
            throw th;
        }
    }
}
