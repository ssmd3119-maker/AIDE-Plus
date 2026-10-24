package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.IdentifierSpace;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.uidesigner.ProxyTextView;
import com.probelytics.api.UserTouchAction;

@cy(clazz = -789709533267558225L, container = -789709533267558225L, user = true)
/* loaded from: classes.dex */
public class JavaSyntax implements Syntax {

    @dy(field = -766261726006327840L)
    private static boolean[] DW;

    @dy(field = -3815812179883980809L)
    private static boolean[] FH;

    @dy(field = 3716671915140475032L)
    private static boolean[] Hw;

    @dy(field = -7726468665170625L)
    private static boolean[] VH;

    @dy(field = -2626390924936039008L)
    private static boolean[] Zo;

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 843310004004003932L)
    private static boolean[] v5;

    @dy(field = 2322336588669151872L)
    private final IdentifierSpace j6;

    static {
        try {
            iy.Zo(JavaSyntax.class);
            if (gn) {
                iy.gn(-803720488964487216L, null);
            }
            boolean[] zArr = new boolean[400];
            DW = zArr;
            zArr[123] = true;
            zArr[124] = true;
            zArr[194] = true;
            zArr[208] = true;
            boolean[] zArr2 = new boolean[400];
            FH = zArr2;
            zArr2[66] = true;
            zArr2[68] = true;
            zArr2[74] = true;
            zArr2[2] = true;
            zArr2[3] = true;
            zArr2[4] = true;
            zArr2[5] = true;
            zArr2[6] = true;
            zArr2[7] = true;
            zArr2[155] = true;
            zArr2[156] = true;
            zArr2[157] = true;
            zArr2[159] = true;
            zArr2[161] = true;
            zArr2[162] = true;
            zArr2[163] = true;
            zArr2[164] = true;
            zArr2[165] = true;
            zArr2[166] = true;
            zArr2[178] = true;
            zArr2[167] = true;
            zArr2[168] = true;
            zArr2[169] = true;
            zArr2[170] = true;
            zArr2[171] = true;
            zArr2[172] = true;
            zArr2[173] = true;
            zArr2[175] = true;
            zArr2[176] = true;
            zArr2[177] = true;
            boolean[] zArr3 = new boolean[400];
            Hw = zArr3;
            zArr3[146] = true;
            zArr3[151] = true;
            zArr3[140] = true;
            zArr3[135] = true;
            zArr3[137] = true;
            zArr3[136] = true;
            zArr3[211] = true;
            zArr3[145] = true;
            zArr3[148] = true;
            zArr3[138] = true;
            zArr3[139] = true;
            zArr3[146] = true;
            zArr3[142] = true;
            zArr3[141] = true;
            zArr3[209] = true;
            zArr3[150] = true;
            zArr3[149] = true;
            zArr3[147] = true;
            zArr3[133] = true;
            zArr3[212] = true;
            boolean[] zArr4 = new boolean[400];
            v5 = zArr4;
            zArr4[177] = true;
            zArr4[227] = true;
            zArr4[228] = true;
            zArr4[221] = true;
            zArr4[120] = true;
            zArr4[220] = true;
            zArr4[121] = true;
            zArr4[128] = true;
            zArr4[222] = true;
            zArr4[129] = true;
            zArr4[245] = true;
            zArr4[246] = true;
            boolean[] zArr5 = new boolean[400];
            Zo = zArr5;
            zArr5[1] = true;
            zArr5[180] = true;
            zArr5[155] = true;
            zArr5[156] = true;
            zArr5[157] = true;
            zArr5[159] = true;
            zArr5[161] = true;
            zArr5[162] = true;
            zArr5[163] = true;
            zArr5[164] = true;
            zArr5[165] = true;
            zArr5[166] = true;
            zArr5[178] = true;
            zArr5[167] = true;
            zArr5[168] = true;
            zArr5[169] = true;
            zArr5[170] = true;
            zArr5[171] = true;
            zArr5[172] = true;
            zArr5[173] = true;
            zArr5[175] = true;
            zArr5[176] = true;
            zArr5[177] = true;
            zArr5[2] = true;
            zArr5[3] = true;
            zArr5[4] = true;
            zArr5[5] = true;
            zArr5[6] = true;
            zArr5[7] = true;
            zArr5[74] = true;
            zArr5[68] = true;
            zArr5[66] = true;
            boolean[] zArr6 = new boolean[400];
            VH = zArr6;
            zArr6[161] = true;
            zArr6[159] = true;
            zArr6[168] = true;
            zArr6[169] = true;
            zArr6[170] = true;
            zArr6[172] = true;
            zArr6[3] = true;
            zArr6[4] = true;
            zArr6[5] = true;
            zArr6[6] = true;
            zArr6[7] = true;
            zArr6[74] = true;
            zArr6[68] = true;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -803720488964487216L, null);
            }
            throw th;
        }
    }

    @ey(method = -59402103158874344L)
    public JavaSyntax(IdentifierSpace identifierSpace) {
        try {
            if (gn) {
                iy.tp(-7182477463575926980L, null, identifierSpace);
            }
            this.j6 = identifierSpace;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7182477463575926980L, null, identifierSpace);
            }
            throw th;
        }
    }

    @ey(method = 3172471498108888L)
    public int CU(int i) {
        try {
            if (gn) {
                iy.u7(-4602202077950822863L, this, i);
            }
            switch (i) {
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    return 6;
                case 19:
                    return 2;
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 22:
                case 23:
                case 24:
                case 26:
                case 28:
                case 29:
                case 31:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                case 34:
                case 37:
                case 40:
                case 43:
                case 47:
                default:
                    return 13;
                case 21:
                    return 3;
                case 25:
                    return 12;
                case 27:
                    return 3;
                case 30:
                case 32:
                    return 2;
                case 35:
                    return 6;
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                    return 8;
                case 38:
                    return 9;
                case 39:
                    return 11;
                case 41:
                    return 7;
                case 42:
                    return 10;
                case 44:
                case 45:
                    return 5;
                case 46:
                    return 4;
                case 48:
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    return 5;
                case 50:
                case 51:
                    return 4;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -4602202077950822863L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 527350946309433000L)
    public int EQ(SyntaxTree syntaxTree, int i) {
        int childCount;
        try {
            if (gn) {
                iy.EQ(-8795138285253200355L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.hasRightSisterNode(i) && (childCount = syntaxTree.getChildCount(syntaxTree.getRightSisterNode(i))) != 0) {
                return (childCount - 1) / 2;
            }
            return 0;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -8795138285253200355L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -268237067875058117L)
    public String Eq(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(6685705976958383616L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0));
            if (syntaxTag == 57) {
                return "int";
            }
            if (syntaxTag == 60) {
                return "byte";
            }
            if (syntaxTag == 62) {
                return "char";
            }
            if (syntaxTag == 65) {
                return "long";
            }
            if (syntaxTag == 69) {
                return "void";
            }
            if (syntaxTag == 81) {
                return "double";
            }
            if (syntaxTag == 89) {
                return "boolean";
            }
            if (syntaxTag == 114) {
                return "ubyte";
            }
            if (syntaxTag == 76) {
                return "float";
            }
            if (syntaxTag == 77) {
                return "short";
            }
            String str = "";
            int childCount = syntaxTree.getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2 += 3) {
                if (str.length() != 0) {
                    str = str + ".";
                }
                str = str + syntaxTree.getIdentifierString(syntaxTree.getChildNode(i, i2));
                int childNode = syntaxTree.getChildNode(i, i2 + 1);
                if (syntaxTree.getChildCount(childNode) > 0) {
                    String str2 = str + "<";
                    int childCount2 = syntaxTree.getChildCount(childNode);
                    for (int i3 = 1; i3 < childCount2; i3 += 4) {
                        if (!str2.endsWith("<")) {
                            str2 = str2 + ", ";
                        }
                        int childNode2 = syntaxTree.getChildNode(childNode, 1);
                        if (syntaxTree.getChildCount(childNode2) == 1) {
                            str2 = str2 + "?";
                        } else if (syntaxTree.getChildCount(childNode2) == 2) {
                            int syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode2, 1));
                            if (syntaxTag2 == 78) {
                                str2 = str2 + "? super " + Eq(syntaxTree, syntaxTree.getChildNode(childNode, i3 + 1));
                            } else if (syntaxTag2 == 91) {
                                str2 = str2 + "? extends " + Eq(syntaxTree, syntaxTree.getChildNode(childNode, i3 + 1));
                            }
                        } else {
                            str2 = str2 + Eq(syntaxTree, syntaxTree.getChildNode(childNode, i3 + 1));
                        }
                        for (int i4 = 0; i4 < syntaxTree.getChildCount(syntaxTree.getChildNode(childNode, i3 + 2)) / 3; i4++) {
                            str2 = str2 + "[]";
                        }
                    }
                    str = str2 + ">";
                }
            }
            return str;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 6685705976958383616L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5009758523722537200L)
    public int FH(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(1291342326826398155L, this, syntaxTree, new Integer(i));
            }
            return (syntaxTree.getChildCount(i) - 1) / 2;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 1291342326826398155L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 187202835775287792L)
    public boolean FN(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-7499769329048452177L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(i) != 176 || syntaxTree.getChildCount(i) != 4) {
                return false;
            }
            int childNode = syntaxTree.getChildNode(i, 2);
            if (syntaxTree.getSyntaxTag(childNode) != 180 || syntaxTree.getChildCount(childNode) < 2) {
                return false;
            }
            return syntaxTree.getChildCount(syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 1)) == 2;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -7499769329048452177L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3268929756414978192L)
    public boolean I(int i) {
        try {
            if (!gn) {
                return false;
            }
            iy.u7(-1817458674073514097L, this, i);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1817458674073514097L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -790731944668027817L)
    public boolean KD(int i) {
        try {
            if (gn) {
                iy.u7(-345564194756180484L, this, i);
            }
            return i == 146;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -345564194756180484L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5874122487793335381L)
    public int Mr(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(3061679844605937768L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, 0);
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 3061679844605937768L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3938735207915766360L)
    public int OW(SyntaxTree syntaxTree, int i) {
        try {
            if (!gn) {
                return 0;
            }
            iy.EQ(256407154017623187L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 256407154017623187L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2481101544840481659L)
    public boolean QX(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-615743148858454392L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i));
            if (syntaxTag != 120 && syntaxTag != 121 && syntaxTag != 124) {
                if (syntaxTag == 180) {
                    int syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(i)));
                    if (syntaxTag2 != 124 && syntaxTag2 != 126) {
                        switch (syntaxTag2) {
                            case 191:
                            case 192:
                            case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                                break;
                            default:
                                return false;
                        }
                    }
                } else if (syntaxTag != 194 && syntaxTag != 128 && syntaxTag != 129 && syntaxTag != 227 && syntaxTag != 228 && syntaxTag != 245 && syntaxTag != 246) {
                    switch (syntaxTag) {
                        case 220:
                        case 221:
                        case 222:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -615743148858454392L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4223792219835891696L)
    public boolean Sf(SyntaxTree syntaxTree, int i) {
        try {
            if (!gn) {
                return false;
            }
            iy.EQ(2161167668785129653L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 2161167668785129653L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2526710308886964800L)
    public boolean U2(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-562711563219756467L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 161;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -562711563219756467L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -607322155906603153L)
    public boolean VH(int i) {
        try {
            if (gn) {
                iy.u7(972669358065874700L, this, i);
            }
            return Hw[i];
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 972669358065874700L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 384037471383412200L)
    public int Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(1860649562735665947L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 1860649562735665947L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1912813289414734097L)
    public int XG(SyntaxTree syntaxTree) {
        try {
            if (gn) {
                iy.tp(3738091045822041024L, this, syntaxTree);
            }
            return syntaxTree.getStartLine(syntaxTree.getChildNode(syntaxTree.getRootNode(), 1));
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3738091045822041024L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -495228711192908967L)
    public int XL(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-3017562284729053080L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, 0);
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -3017562284729053080L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3192957259064559235L)
    public int Xa(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-5166369331134790980L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            int iXa = syntaxTag != 1 ? syntaxTag != 165 ? syntaxTag != 176 ? -1 : Xa(syntaxTree, syntaxTree.getChildNode(i, 2)) : Xa(syntaxTree, syntaxTree.getChildNode(i, 0)) : syntaxTree.getIdentifier(i);
            if (iXa == -1) {
                int childCount = syntaxTree.getChildCount(i) - 1;
                while (true) {
                    if (childCount < 0) {
                        break;
                    }
                    int childNode = syntaxTree.getChildNode(i, childCount);
                    if (syntaxTree.getSyntaxTag(childNode) == 1) {
                        iXa = syntaxTree.getIdentifier(childNode);
                        break;
                    }
                    childCount--;
                }
            }
            if (iXa == -1) {
                for (int childCount2 = syntaxTree.getChildCount(i) - 1; childCount2 >= 0; childCount2--) {
                    iXa = Xa(syntaxTree, syntaxTree.getChildNode(i, childCount2));
                    if (iXa != -1) {
                        break;
                    }
                }
            }
            if (iXa == -1) {
                return iXa;
            }
            String string = this.j6.getString(iXa);
            if ((string.startsWith("get") || string.startsWith("set")) && string.length() > 3) {
                return this.j6.get(string.substring(3, 4).toLowerCase() + string.substring(4, string.length()));
            }
            if (string.length() <= 0) {
                return iXa;
            }
            return this.j6.get(string.substring(0, 1).toLowerCase() + string.substring(1, string.length()));
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -5166369331134790980L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1554498463621606880L)
    public boolean Zo(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(160765802720348563L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i));
            if (syntaxTag == 120 || syntaxTag == 121 || syntaxTag == 123 || syntaxTag == 124 || syntaxTag == 128 || syntaxTag == 129 || syntaxTag == 191 || syntaxTag == 194 || syntaxTag == 200 || syntaxTag == 208 || syntaxTag == 211 || syntaxTag == 227 || syntaxTag == 228 || syntaxTag == 245 || syntaxTag == 246) {
                return true;
            }
            switch (syntaxTag) {
                case 220:
                case 221:
                case 222:
                    return true;
                default:
                    return false;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 160765802720348563L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2367584085333797876L)
    public String aq(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(3227467067479847621L, this, syntaxTree, new Integer(i));
            }
            int i2 = 0;
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 200) {
                String strEq = Eq(syntaxTree, syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 1));
                while (i2 < (syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1)) / 3) + (syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 2)) / 3)) {
                    strEq = strEq + "[]";
                    i2++;
                }
                return strEq;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 191) {
                String strEq2 = Eq(syntaxTree, syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1));
                while (i2 < (syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 2)) / 3) + (syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 4)) / 3)) {
                    strEq2 = strEq2 + "[]";
                    i2++;
                }
                return strEq2;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 204) {
                return Eq(syntaxTree, syntaxTree.getChildNode(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 3), 0));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 211) {
                return "";
            }
            String strEq3 = Eq(syntaxTree, syntaxTree.getChildNode(syntaxTree.getParentNode(i), 3));
            while (i2 < syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 4)) / 3) {
                strEq3 = strEq3 + "[]";
                i2++;
            }
            return strEq3;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 3227467067479847621L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 148929505783770612L)
    public int br(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (gn) {
                iy.we(-2736316811731914375L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            return syntaxTree.getChildNode(i, (i2 * 2) + 1);
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -2736316811731914375L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3361283993883329325L)
    public boolean ca(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-2048503997555160540L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 172 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1)) == 17) {
                if (syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0) == i) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -2048503997555160540L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -520301908924072053L)
    public String cb(SyntaxTree syntaxTree, int i) {
        try {
            if (!gn) {
                return null;
            }
            iy.EQ(7115849772218685780L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 7115849772218685780L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5165694316087433283L)
    public boolean ef(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(5809949069371269752L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0) != i) {
                return false;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 180 && syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 156) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 161) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 5809949069371269752L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1556120105346123860L)
    public int er(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (gn) {
                iy.we(-709030144566665215L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            return syntaxTree.getChildNode(i, (i2 * 2) + 1);
        } catch (Throwable th) {
            if (u7) {
                iy.U2(th, -709030144566665215L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1193018892098013020L)
    public int et(int i) {
        try {
            if (gn) {
                iy.u7(2280499437393928143L, this, i);
            }
            switch (i) {
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    return 22;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    return 9;
                case 19:
                    return 3;
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    return 28;
                case 21:
                    return 1;
                case 22:
                    return 24;
                case 23:
                    return 29;
                case 24:
                    return 20;
                case 25:
                case 26:
                default:
                    return 0;
                case 27:
                    return 2;
                case 28:
                    return 23;
                case 29:
                    return 26;
                case 30:
                    return 5;
                case 31:
                    return 25;
                case 32:
                    return 4;
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                    return 27;
                case 34:
                    return 21;
                case 35:
                    return 10;
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                    return 8;
                case 37:
                    return 30;
                case 38:
                    return 6;
                case 39:
                    return 15;
                case 40:
                    return 31;
                case 41:
                    return 7;
                case 42:
                    return 16;
                case 43:
                    return 32;
                case 44:
                    return 11;
                case 45:
                    return 12;
                case 46:
                    return 17;
                case 47:
                    return 33;
                case 48:
                    return 13;
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    return 14;
                case 50:
                    return 18;
                case 51:
                    return 19;
                case 52:
                    return 34;
                case 53:
                    return 35;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2280499437393928143L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -25299542857085440L)
    public boolean g3(int i) {
        try {
            if (!gn) {
                return false;
            }
            iy.u7(2385076400356273295L, this, i);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2385076400356273295L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 6491422550501408760L)
    public int getImportEndLine(SyntaxTree syntaxTree) {
        int syntaxTag;
        try {
            if (gn) {
                iy.tp(-4976563817274264585L, this, syntaxTree);
            }
            int childCount = syntaxTree.getChildCount(syntaxTree.getRootNode());
            int childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), 0);
            int endLine = syntaxTree.getChildCount(childNode) == 0 ? 1 : syntaxTree.getEndLine(childNode);
            if (syntaxTree.getChildCount(childNode) != 0) {
                syntaxTree.getEndColumn(childNode);
            }
            for (int i = 1; i < childCount; i++) {
                if (!syntaxTree.isSyntheticNode(syntaxTree.getChildNode(syntaxTree.getRootNode(), i)) && ((syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getRootNode(), i))) == 213 || syntaxTag == 214 || syntaxTag == 225 || syntaxTag == 226)) {
                    int endLine2 = syntaxTree.getEndLine(syntaxTree.getChildNode(syntaxTree.getRootNode(), i));
                    syntaxTree.getEndColumn(syntaxTree.getChildNode(syntaxTree.getRootNode(), i));
                    endLine = endLine2;
                }
            }
            return endLine;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -4976563817274264585L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2856854619670791956L)
    public ListOfInt getImportNodePairs(SyntaxTree syntaxTree) {
        int syntaxTag;
        try {
            if (gn) {
                iy.tp(2867176530514841237L, this, syntaxTree);
            }
            ListOfInt listOfInt = new ListOfInt();
            int childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), 1);
            listOfInt.add(childNode);
            int childCount = syntaxTree.getChildCount(syntaxTree.getRootNode());
            for (int i = 1; i < childCount; i++) {
                if (!syntaxTree.isSyntheticNode(syntaxTree.getChildNode(syntaxTree.getRootNode(), i)) && ((syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getRootNode(), i))) == 213 || syntaxTag == 214 || syntaxTag == 225 || syntaxTag == 226)) {
                    childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), i);
                }
            }
            listOfInt.add(childNode);
            return syntaxTree.isSyntheticNode(listOfInt.get(1)) ? new ListOfInt() : listOfInt;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2867176530514841237L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -582065094852425936L)
    public ListOfInt getNamespaceNodePairs(SyntaxTree syntaxTree) {
        try {
            if (gn) {
                iy.tp(-7996360167877636585L, this, syntaxTree);
            }
            ListOfInt listOfInt = new ListOfInt();
            listOfInt.add(syntaxTree.getChildNode(syntaxTree.getRootNode(), 0));
            listOfInt.add(syntaxTree.getChildNode(syntaxTree.getRootNode(), 0));
            return listOfInt;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7996360167877636585L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2195266421616133727L)
    public String getString(int i) {
        try {
            if (gn) {
                iy.u7(1428886992592896000L, this, i);
            }
            switch (i) {
                case 1:
                    return "IDENTIFIER";
                case 2:
                    return "STRING_LITERAL";
                case 3:
                    return "CHAR_LITERAL";
                case 4:
                    return "INT_LITERAL";
                case 5:
                    return "LONG_LITERAL";
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                    return "FLOAT_LITERAL";
                case UserTouchAction.CLICK_KIND /* 7 */:
                    return "DOUBLE_LITERAL";
                case 8:
                    return "{";
                case 9:
                    return "}";
                case 10:
                    return "[";
                case 11:
                    return "]";
                case 12:
                    return "(";
                case 13:
                    return ")";
                case 14:
                    return ";";
                case 15:
                    return ",";
                case 16:
                    return ".";
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    return "=";
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    return "==";
                case 19:
                    return "/";
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    return "/=";
                case 21:
                    return "+";
                case 22:
                    return "++";
                case 23:
                    return "+=";
                case 24:
                    return "~";
                case 25:
                    return "?";
                case 26:
                    return ":";
                case 27:
                    return "-";
                case 28:
                    return "--";
                case 29:
                    return "-=";
                case 30:
                    return "*";
                case 31:
                    return "*=";
                case 32:
                    return "%";
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                    return "%=";
                case 34:
                    return "!";
                case 35:
                    return "!=";
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                    return "^";
                case 37:
                    return "^=";
                case 38:
                    return "|";
                case 39:
                    return "||";
                case 40:
                    return "|=";
                case 41:
                    return "&";
                case 42:
                    return "&&";
                case 43:
                    return "&=";
                case 44:
                    return "<";
                case 45:
                    return "<=";
                case 46:
                    return "<<";
                case 47:
                    return "<<=";
                case 48:
                    return ">";
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                    return ">=";
                case 50:
                    return ">>";
                case 51:
                    return ">>>";
                case 52:
                    return ">>=";
                case 53:
                    return ">>>=";
                case 54:
                    return "do";
                case 55:
                    return "if";
                case 56:
                    return "for";
                case 57:
                    return "int";
                case 58:
                    return "new";
                case 59:
                    return "try";
                case 60:
                    return "byte";
                case 61:
                    return "case";
                case 62:
                    return "char";
                case 63:
                    return "else";
                case 64:
                    return "goto";
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                    return "long";
                case 66:
                    return "null";
                case 67:
                    return "this";
                case 68:
                    return "true";
                case 69:
                    return "void";
                case 70:
                    return "break";
                case 71:
                    return "catch";
                case 72:
                    return "class";
                case 73:
                    return "const";
                case 74:
                    return "false";
                case 75:
                    return "final";
                case 76:
                    return "float";
                case 77:
                    return "short";
                case 78:
                    return "super";
                case 79:
                    return "throw";
                case 80:
                    return "while";
                case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                    return "double";
                case 82:
                    return "import";
                case 83:
                    return "native";
                case 84:
                    return "public";
                case 85:
                    return "return";
                case 86:
                    return "static";
                case 87:
                    return "switch";
                case 88:
                    return "throws";
                case 89:
                    return "boolean";
                case 90:
                    return "default";
                case 91:
                    return "extends";
                case 92:
                    return "finally";
                case 93:
                    return "package";
                case 94:
                    return "private";
                case 95:
                    return "abstract";
                case 96:
                    return "continue";
                case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                    return "strictfp";
                case 98:
                    return "volatile";
                case 99:
                    return "interface";
                case 100:
                    return "protected";
                case 101:
                    return "transient";
                case 102:
                    return "implements";
                case 103:
                    return "instanceof";
                case 104:
                    return "synchronized";
                case 105:
                    return "assert";
                case 106:
                    return "deprecated";
                case 107:
                    return "enum";
                case 108:
                    return "...";
                case 109:
                    return "since 1.1";
                case 110:
                    return "since 1.2";
                case 111:
                    return "since 1.3";
                case 112:
                    return "since 1.4";
                case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                    return "since 1.5";
                case 114:
                    return "ubyte";
                case 115:
                    return "@";
                case 116:
                case 117:
                case 125:
                case 130:
                case 131:
                case 132:
                case 152:
                case 153:
                case 154:
                case 158:
                case 160:
                case 174:
                case 179:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                case 187:
                case 188:
                case 189:
                case 215:
                case 217:
                case 218:
                case 219:
                case 229:
                case 233:
                case 234:
                case 235:
                case 236:
                case 237:
                case 238:
                case 239:
                case 241:
                case 242:
                case 243:
                case 244:
                default:
                    return "";
                case 118:
                    return "delegate";
                case 119:
                    return "multicast";
                case 120:
                    return "CLASS_DECLARATION";
                case 121:
                    return "INTERFACE_DECLARATION";
                case 122:
                    return "BODY";
                case 123:
                    return "CONSTRUCTOR";
                case 124:
                    return "METHOD";
                case 126:
                    return "FIELDS";
                case 127:
                    return "INITIALIZER";
                case 128:
                    return "LOCAL_CLASS_DECLARATION";
                case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                    return "LOCAL_INTERFACE_DECLARATION";
                case 133:
                    return "BLOCK";
                case 134:
                    return "EMPTY_STATEMENT";
                case 135:
                    return "IF_STATEMENT";
                case 136:
                    return "IFELSE_STATEMENT";
                case 137:
                    return "WHILE_STATEMENT";
                case 138:
                    return "BREAK_STATEMENT";
                case 139:
                    return "CONTINUE_STATEMENT";
                case 140:
                    return "SYNCHRONIZED_STATEMENT";
                case 141:
                    return "RETURN_STATEMENT";
                case 142:
                    return "THROW_STATEMENT";
                case 143:
                    return "CASE_LABEL";
                case 144:
                    return "DEFAULT_LABEL";
                case ProxyTextView.INPUTTYPE_textVisiblePassword /* 145 */:
                    return "DO_STATEMENT";
                case 146:
                    return "EXPRESSION_STATEMENT";
                case 147:
                    return "SWITCH_STATEMENT";
                case 148:
                    return "LABELED_STATEMENT";
                case 149:
                    return "FOR_STATEMENT";
                case 150:
                    return "TRY_STATEMENT";
                case 151:
                    return "VARIABLE_DECLARATION";
                case 155:
                    return "METHOD_INVOCATION";
                case 156:
                    return "NAME_METHOD_INVOCATION";
                case 157:
                    return "SUPER_METHOD_INVOCATION";
                case 159:
                    return "FIELD_ACCESS";
                case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                    return "NAME_FIELD_ACCESS";
                case 162:
                    return "SUPER_FIELD_ACCESS";
                case 163:
                    return "THIS_CONSTRUCTOR_INVOCATION";
                case 164:
                    return "SUPER_CONSTRUCTOR_INVOCATION";
                case 165:
                    return "ARRAY_ACCESS";
                case 166:
                    return "THIS_LITERAL";
                case 167:
                    return "CLASS_LITERAL";
                case 168:
                    return "PARENTHESIZED_EXPRESSION";
                case 169:
                    return "CAST_EXPRESSION";
                case 170:
                    return "PREFIX_EXPRESSION";
                case 171:
                    return "POSTFIX_EXPRESSION";
                case 172:
                    return "INFIX_EXPRESSION";
                case 173:
                    return "INSTANCEOF_EXPRESSION";
                case 175:
                    return "ARRAY_CREATION";
                case 176:
                    return "OBJECT_CREATION";
                case ProxyTextView.INPUTTYPE_textFilter /* 177 */:
                    return "ANONYMOUS_CLASS_CREATION";
                case 178:
                    return "STRING_LITERAL_LIST";
                case 180:
                    return "TYPE_NAME";
                case 190:
                    return "PARAMETERS";
                case 191:
                    return "PARAMETER";
                case 192:
                    return "EXTENDS_CLAUSE";
                case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                    return "IMPLEMENTS_CLAUSE";
                case 194:
                    return "FIELD";
                case 195:
                    return "THROWS_CLAUSE";
                case 196:
                    return "ARRAY";
                case 197:
                    return "ARGUMENTS";
                case 198:
                    return "ARRAY_BRACKETS";
                case 199:
                    return "MODIFIERS";
                case 200:
                    return "VARIABLE";
                case 201:
                    return "FOR_INIT_CLAUSE";
                case 202:
                    return "FOR_UPDATE_CLAUSE";
                case 203:
                    return "FOR_CONDITION_CLAUSE";
                case 204:
                    return "CATCH_CLAUSE";
                case 205:
                    return "FINALLY_CLAUSE";
                case 206:
                    return "TYPE_ARGUMENTS";
                case 207:
                    return "TYPE_PARAMETERS";
                case 208:
                    return "TYPE_PARAMETER";
                case ProxyTextView.INPUTTYPE_textWebEmailAddress /* 209 */:
                    return "ASSERT_STATEMENT";
                case 210:
                    return "CONDITIONAL_OPERATOR";
                case 211:
                    return "FOREACH_STATEMENT";
                case 212:
                    return "TRY_WITH_STATEMENT";
                case 213:
                case 214:
                    return "STATIC_IMPORT_DECLARATION";
                case 216:
                    return "CATCH_TYPE";
                case 220:
                    return "ENUM_DECLARATION";
                case 221:
                    return "MEMBER_ENUM_DECLARATION";
                case 222:
                    return "LOCAL_ENUM_DECLARATION";
                case 223:
                    return "COMPILATIONUNIT";
                case 224:
                    return "PACKAGE_DECLARATION";
                case ProxyTextView.INPUTTYPE_textWebPassword /* 225 */:
                    return "IMPORT_DECLARATION";
                case 226:
                    return "IMPORTONDEMAND_DECLARATION";
                case 227:
                    return "MEMBER_CLASS_DECLARATION";
                case 228:
                    return "MEMBER_INTERFACE_DECLARATION";
                case 230:
                    return "VARIANCE_MODIFIERS";
                case 231:
                    return "ATTRIBUTE";
                case 232:
                    return "DEFAULT_ATTRIBUTE_VALUE";
                case 240:
                    return "ARRAY_DIMS";
                case 245:
                    return "DELEGATE_DECLARATION";
                case 246:
                    return "MEMBER_DELEGATE_DECLARATION";
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 1428886992592896000L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2371609574365309413L)
    public int getTokenLength(int i) {
        try {
            if (gn) {
                iy.u7(-2294477145176660256L, this, i);
            }
            if (i == 107) {
                return 4;
            }
            if (i == 108) {
                return 3;
            }
            if (i == 114) {
                return 5;
            }
            if (i == 118) {
                return 8;
            }
            if (i == 119) {
                return 9;
            }
            switch (i) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                    return 1;
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    return 2;
                case 19:
                    return 1;
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                    return 2;
                case 21:
                    return 1;
                case 22:
                case 23:
                    return 2;
                case 24:
                case 25:
                case 26:
                case 27:
                    return 1;
                case 28:
                case 29:
                    return 2;
                case 30:
                    return 1;
                case 31:
                    return 2;
                case 32:
                    return 1;
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                    return 2;
                case 34:
                    return 1;
                case 35:
                    return 2;
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                    return 1;
                case 37:
                    return 2;
                case 38:
                    return 1;
                case 39:
                case 40:
                    return 2;
                case 41:
                    return 1;
                case 42:
                case 43:
                    return 2;
                case 44:
                    return 1;
                case 45:
                case 46:
                    return 2;
                case 47:
                    return 3;
                case 48:
                    return 1;
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                case 50:
                    return 2;
                case 51:
                case 52:
                    return 3;
                case 53:
                    return 4;
                case 54:
                case 55:
                    return 2;
                case 56:
                case 57:
                case 58:
                case 59:
                    return 3;
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                case 66:
                case 67:
                case 68:
                case 69:
                    return 4;
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                    return 5;
                case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                    return 6;
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                    return 7;
                case 95:
                case 96:
                case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                case 98:
                    return 8;
                case 99:
                case 100:
                case 101:
                    return 9;
                case 102:
                case 103:
                    return 10;
                case 104:
                    return 12;
                default:
                    return 0;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -2294477145176660256L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 537317086665131487L)
    public int gn(SyntaxTree syntaxTree) {
        try {
            if (gn) {
                iy.tp(7282609662194702040L, this, syntaxTree);
            }
            return syntaxTree.getStartColumn(syntaxTree.getChildNode(syntaxTree.getRootNode(), 1));
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 7282609662194702040L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2015390338625846700L)
    public boolean hasAttrDAIndex(int i) {
        try {
            if (gn) {
                iy.u7(-2332207882551578267L, this, i);
            }
            return i == 1;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -2332207882551578267L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1387439412690485728L)
    public boolean hasAttrTarget(int i) {
        try {
            if (gn) {
                iy.u7(3448994614304440147L, this, i);
            }
            return i == 138 || i == 139;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3448994614304440147L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3211908099886056375L)
    public boolean hasAttrType(int i) {
        try {
            if (gn) {
                iy.u7(-1559908313144017284L, this, i);
            }
            return Zo[i];
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1559908313144017284L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4199009174019414180L)
    public boolean hasAttrValue(int i) {
        try {
            if (gn) {
                iy.u7(-2729560651516391567L, this, i);
            }
            return VH[i];
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -2729560651516391567L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 379942805692448285L)
    public boolean hasAttrVariableSlot(int i) {
        try {
            if (gn) {
                iy.u7(-5721349951815438544L, this, i);
            }
            return i == 1 || i == 127 || i == 140 || i == 147 || i == 167 || i == 205 || i == 123 || i == 124 || i == 211 || i == 212;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -5721349951815438544L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5186143496410095064L)
    public String hz(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-3148048826344552509L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0)) == 1 ? syntaxTree.getIdentifierString(syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 2)) : getString(syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, 0)));
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -3148048826344552509L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3329502218426046720L)
    public boolean isArguments(int i) {
        try {
            if (gn) {
                iy.u7(-1570671474132458745L, this, i);
            }
            return i == 197;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1570671474132458745L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 26286524800564411L)
    public boolean isBlock(int i) {
        try {
            if (gn) {
                iy.u7(-237765237375153216L, this, i);
            }
            return i == 133;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -237765237375153216L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4246348040628484096L)
    public boolean isBooleanLiteral(int i) {
        try {
            if (gn) {
                iy.u7(-796237689757785431L, this, i);
            }
            if (i == 66 || i == 68 || i == 74) {
                return true;
            }
            return isLiteral(i);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -796237689757785431L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 345487703609046225L)
    public boolean isChangedExpressionNode(SyntaxTree syntaxTree, int i) {
        int syntaxTag;
        int syntaxTag2;
        try {
            if (gn) {
                iy.EQ(4678253865621346740L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 172 && syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0) == i && ((syntaxTag2 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1))) == 17 || syntaxTag2 == 20 || syntaxTag2 == 23 || syntaxTag2 == 29 || syntaxTag2 == 31 || syntaxTag2 == 33 || syntaxTag2 == 37 || syntaxTag2 == 40 || syntaxTag2 == 43 || syntaxTag2 == 47 || syntaxTag2 == 52 || syntaxTag2 == 53)) {
                return true;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 171 && ((syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1))) == 22 || syntaxTag == 28)) {
                return true;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 170) {
                int syntaxTag3 = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0));
                if (syntaxTag3 == 22 || syntaxTag3 == 28) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 4678253865621346740L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2877994708216161592L)
    public boolean isClassBody(int i) {
        try {
            if (gn) {
                iy.u7(-748991540700744943L, this, i);
            }
            return i == 122;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -748991540700744943L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6491842618792952304L)
    public boolean isClassDeclaration(int i) {
        try {
            if (gn) {
                iy.u7(-301525158079274421L, this, i);
            }
            return v5[i];
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -301525158079274421L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1086561583712175456L)
    public boolean isComment(int i) {
        try {
            if (!gn) {
                return false;
            }
            iy.u7(-3376769234247686101L, this, i);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -3376769234247686101L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1066371360998069232L)
    public boolean isDocComment(int i) {
        try {
            if (!gn) {
                return false;
            }
            iy.u7(5807579562603601455L, this, i);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 5807579562603601455L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 579298356953112300L)
    public boolean isExpression(int i) {
        try {
            if (gn) {
                iy.u7(953331863396014741L, this, i);
            }
            return FH[i];
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 953331863396014741L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4798242125490536696L)
    public boolean isFieldDeclaration(int i) {
        try {
            if (gn) {
                iy.u7(-4624886835518612761L, this, i);
            }
            return i == 194;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -4624886835518612761L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2583352117854910477L)
    public boolean isIdentifier(int i) {
        try {
            if (gn) {
                iy.u7(-1491210191453838640L, this, i);
            }
            return i == 1;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1491210191453838640L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1775144123726566983L)
    public boolean isLiteral(int i) {
        try {
            if (gn) {
                iy.u7(1154627450318226908L, this, i);
            }
            return i <= 7 && i >= 2;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 1154627450318226908L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -8458670705773464368L)
    public boolean isMemberDeclaration(int i) {
        try {
            if (gn) {
                iy.u7(2142006621261830765L, this, i);
            }
            return DW[i];
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2142006621261830765L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4256709153997567275L)
    public boolean isMethodDeclaration(int i) {
        try {
            if (gn) {
                iy.u7(-2337273932275490208L, this, i);
            }
            return i == 123 || i == 124;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -2337273932275490208L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5770765865855273745L)
    public boolean isOperator(int i) {
        try {
            if (gn) {
                iy.u7(-1924513173017565432L, this, i);
            }
            switch (i) {
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                case 19:
                case ProxyTextView.INPUTTYPE_date /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case ProxyTextView.INPUTTYPE_textEmailAddress /* 33 */:
                case 34:
                case 35:
                case ProxyTextView.INPUTTYPE_time /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                case 50:
                case 51:
                case 52:
                case 53:
                    return true;
                case 25:
                case 26:
                default:
                    return false;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -1924513173017565432L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -560825893293559232L)
    public boolean isParameters(int i) {
        try {
            if (gn) {
                iy.u7(60079217372803515L, this, i);
            }
            return i == 190;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 60079217372803515L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -92190663037880936L)
    public boolean isSeparator(int i) {
        try {
            if (gn) {
                iy.u7(882546743102153275L, this, i);
            }
            if (i == 26) {
                return true;
            }
            switch (i) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    return true;
                default:
                    return false;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 882546743102153275L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4155207430829041504L)
    public boolean isToken(int i) {
        try {
            if (gn) {
                iy.u7(-945023211379171917L, this, i);
            }
            switch (i) {
                case 54:
                case 55:
                case 56:
                case 58:
                case 59:
                case 61:
                case 63:
                case 64:
                case 66:
                case 67:
                case 68:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 78:
                case 79:
                case 80:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case ProxyTextView.INPUTTYPE_textPersonName /* 97 */:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 118:
                case 119:
                    return true;
                case 57:
                case 60:
                case 62:
                case ProxyTextView.INPUTTYPE_textShortMessage /* 65 */:
                case 69:
                case 76:
                case 77:
                case ProxyTextView.INPUTTYPE_textLongMessage /* 81 */:
                case 89:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                case 114:
                case 115:
                case 116:
                case 117:
                default:
                    return false;
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -945023211379171917L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5425819227598060675L)
    public boolean isTypeIdentifier(int i) {
        try {
            if (gn) {
                iy.u7(3910323940464110400L, this, i);
            }
            return i == 57 || i == 60 || i == 62 || i == 65 || i == 69 || i == 81 || i == 89 || i == 114 || i == 76 || i == 77;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3910323940464110400L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -480748169677659312L)
    public String jJ(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(36814161716191685L, this, syntaxTree, new Integer(i));
            }
            String str = "";
            for (int i2 = 0; i2 < syntaxTree.getChildCount(i); i2++) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(i, i2)) == 10) {
                    str = str + "[]";
                }
            }
            return str;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 36814161716191685L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1946625209438614341L)
    public boolean jO(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-2640766919367787700L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 200) {
                return syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 191 ? syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0)) != 0 : syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 204 ? syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 2)) != 0 : syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 211 && syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 2)) != 0;
            }
            int childNode = syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 0);
            if (syntaxTree.getChildCount(childNode) != 0) {
                int childCount = syntaxTree.getChildCount(childNode);
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode, i2)) == 75) {
                        return true;
                    }
                }
            }
            return syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)))) == 212;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -2640766919367787700L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6121794151447677360L)
    public int lg(SyntaxTree syntaxTree) {
        int syntaxTag;
        try {
            if (gn) {
                iy.tp(36877119066699639L, this, syntaxTree);
            }
            int childCount = syntaxTree.getChildCount(syntaxTree.getRootNode());
            int childNode = syntaxTree.getChildNode(syntaxTree.getRootNode(), 0);
            if (syntaxTree.getChildCount(childNode) != 0) {
                syntaxTree.getEndLine(childNode);
            }
            int endColumn = syntaxTree.getChildCount(childNode) == 0 ? 1 : syntaxTree.getEndColumn(childNode);
            for (int i = 1; i < childCount; i++) {
                if (!syntaxTree.isSyntheticNode(syntaxTree.getChildNode(syntaxTree.getRootNode(), i)) && ((syntaxTag = syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getRootNode(), i))) == 213 || syntaxTag == 214 || syntaxTag == 225 || syntaxTag == 226)) {
                    syntaxTree.getEndLine(syntaxTree.getChildNode(syntaxTree.getRootNode(), i));
                    endColumn = syntaxTree.getEndColumn(syntaxTree.getChildNode(syntaxTree.getRootNode(), i));
                }
            }
            return endColumn;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 36877119066699639L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -5685024382358028060L)
    public boolean oY(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-293982439511966415L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 200) {
                int childNode = syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 0);
                if (syntaxTree.getChildCount(childNode) != 0 && syntaxTree.getChildCount(syntaxTree.getParentNode(i)) > 2) {
                    int childCount = syntaxTree.getChildCount(childNode);
                    for (int i2 = 0; i2 < childCount; i2++) {
                        if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode, i2)) == 75) {
                            return true;
                        }
                    }
                }
                return syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)))) == 212;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 191) {
                return syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 204 && syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 2)) != 0;
            }
            int childNode2 = syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0);
            int childCount2 = syntaxTree.getChildCount(childNode2);
            for (int i3 = 0; i3 < childCount2; i3++) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getChildNode(childNode2, i3)) == 75) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -293982439511966415L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -208115459337018432L)
    public int ro(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-2051638361280220575L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getParentNode(i);
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -2051638361280220575L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -697708337312041440L)
    public String sh(SyntaxTree syntaxTree, int i) {
        try {
            if (!gn) {
                return null;
            }
            iy.EQ(-8124940985036152285L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -8124940985036152285L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 759737305206536489L)
    public boolean tp(int i) {
        try {
            if (gn) {
                iy.u7(-85350929204765072L, this, i);
            }
            return i < 120;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -85350929204765072L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4608297469619581344L)
    public int vy(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(876428565591771885L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 876428565591771885L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1344644864574649760L)
    public String wc(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(-248616932531108325L, this, syntaxTree, new Integer(i));
            }
            String strEq = "";
            if (syntaxTree.getSyntaxTag(i) == 194) {
                strEq = Eq(syntaxTree, syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1));
                for (int i2 = 0; i2 < (syntaxTree.getChildCount(syntaxTree.getChildNode(i, 1)) / 3) + (syntaxTree.getChildCount(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 2)) / 3); i2++) {
                    strEq = strEq + "[]";
                }
            }
            return strEq;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -248616932531108325L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 8374807732403760L)
    public int we(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(2104959149204011265L, this, syntaxTree, new Integer(i));
            }
            return (syntaxTree.getChildCount(i) - 1) / 2;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 2104959149204011265L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 368492762502393592L)
    public boolean x9(SyntaxTree syntaxTree, int i) {
        try {
            if (gn) {
                iy.EQ(1722536750614912199L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0) == i) {
                return false;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 180 && syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 156) {
                if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 161) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 1722536750614912199L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5114885919115561565L)
    public boolean yS(int i) {
        try {
            if (!gn) {
                return false;
            }
            iy.u7(-3373811618999096912L, this, i);
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -3373811618999096912L, this, new Integer(i));
            }
            throw th;
        }
    }
}
