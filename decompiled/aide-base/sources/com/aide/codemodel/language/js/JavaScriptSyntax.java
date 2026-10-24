package com.aide.codemodel.language.js;

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

@cy(clazz = -2088593262831169985L, container = -2088593262831169985L, user = true)
/* loaded from: classes.dex */
public class JavaScriptSyntax implements Syntax {

    @dy(field = 1859675966757715139L)
    private static boolean[] DW;

    @dy(field = 1395666637067839992L)
    private static boolean[] FH;

    @dy(field = -3699963168285823632L)
    private static boolean[] Hw;

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = -7732774988093671677L)
    private static boolean[] v5;

    @dy(field = -1928540470721400000L)
    private final IdentifierSpace j6;

    static {
        try {
            iy.Zo(JavaScriptSyntax.class);
            if (Zo) {
                iy.gn(1494492603892293148L, null);
            }
            boolean[] zArr = new boolean[400];
            DW = zArr;
            zArr[66] = true;
            zArr[68] = true;
            zArr[74] = true;
            zArr[2] = true;
            zArr[3] = true;
            zArr[4] = true;
            zArr[5] = true;
            zArr[6] = true;
            zArr[7] = true;
            zArr[159] = true;
            zArr[161] = true;
            zArr[165] = true;
            zArr[196] = true;
            zArr[166] = true;
            zArr[168] = true;
            zArr[178] = true;
            zArr[170] = true;
            zArr[171] = true;
            zArr[172] = true;
            zArr[175] = true;
            zArr[177] = true;
            zArr[173] = true;
            zArr[163] = true;
            zArr[164] = true;
            zArr[176] = true;
            boolean[] zArr2 = new boolean[400];
            FH = zArr2;
            zArr2[146] = true;
            zArr2[151] = true;
            zArr2[135] = true;
            zArr2[137] = true;
            zArr2[136] = true;
            zArr2[211] = true;
            zArr2[212] = true;
            zArr2[145] = true;
            zArr2[148] = true;
            zArr2[138] = true;
            zArr2[139] = true;
            zArr2[146] = true;
            zArr2[142] = true;
            zArr2[141] = true;
            zArr2[150] = true;
            zArr2[149] = true;
            zArr2[147] = true;
            zArr2[133] = true;
            boolean[] zArr3 = new boolean[400];
            Hw = zArr3;
            zArr3[1] = true;
            zArr3[159] = true;
            zArr3[161] = true;
            zArr3[165] = true;
            zArr3[166] = true;
            zArr3[168] = true;
            zArr3[178] = true;
            zArr3[170] = true;
            zArr3[171] = true;
            zArr3[172] = true;
            zArr3[175] = true;
            zArr3[177] = true;
            zArr3[176] = true;
            zArr3[2] = true;
            zArr3[3] = true;
            zArr3[4] = true;
            zArr3[5] = true;
            zArr3[6] = true;
            zArr3[7] = true;
            zArr3[74] = true;
            zArr3[68] = true;
            zArr3[66] = true;
            boolean[] zArr4 = new boolean[400];
            v5 = zArr4;
            zArr4[161] = true;
            zArr4[159] = true;
            zArr4[168] = true;
            zArr4[178] = true;
            zArr4[170] = true;
            zArr4[172] = true;
            zArr4[3] = true;
            zArr4[4] = true;
            zArr4[5] = true;
            zArr4[6] = true;
            zArr4[7] = true;
            zArr4[74] = true;
            zArr4[68] = true;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 1494492603892293148L, null);
            }
            throw th;
        }
    }

    @ey(method = 4343926538774908800L)
    public JavaScriptSyntax(IdentifierSpace identifierSpace) {
        try {
            if (Zo) {
                iy.tp(4162295284856170749L, null, identifierSpace);
            }
            this.j6 = identifierSpace;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 4162295284856170749L, null, identifierSpace);
            }
            throw th;
        }
    }

    @ey(method = -4313794100264523057L)
    public int CU(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-5847275299774708184L, this, syntaxTree, new Integer(i));
            }
            int syntaxTag = syntaxTree.getSyntaxTag(i);
            int iCU = syntaxTag != 1 ? (syntaxTag == 165 || syntaxTag == 175) ? CU(syntaxTree, syntaxTree.getChildNode(i, 0)) : syntaxTag != 176 ? -1 : CU(syntaxTree, syntaxTree.getChildNode(i, 2)) : syntaxTree.getIdentifier(i);
            if (iCU == -1) {
                int childCount = syntaxTree.getChildCount(i) - 1;
                while (true) {
                    if (childCount < 0) {
                        break;
                    }
                    int childNode = syntaxTree.getChildNode(i, childCount);
                    if (syntaxTree.getSyntaxTag(childNode) == 1) {
                        iCU = syntaxTree.getIdentifier(childNode);
                        break;
                    }
                    childCount--;
                }
            }
            if (iCU == -1) {
                for (int childCount2 = syntaxTree.getChildCount(i) - 1; childCount2 >= 0; childCount2--) {
                    iCU = CU(syntaxTree, syntaxTree.getChildNode(i, childCount2));
                    if (iCU != -1) {
                        break;
                    }
                }
            }
            if (iCU == -1) {
                return iCU;
            }
            String string = this.j6.getString(iCU);
            if ((string.startsWith("get") || string.startsWith("set")) && string.length() > 3) {
                return this.j6.get(string.substring(3, 4).toLowerCase() + string.substring(4, string.length()));
            }
            if (string.length() <= 0) {
                return iCU;
            }
            return this.j6.get(string.substring(0, 1).toLowerCase() + string.substring(1, string.length()));
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -5847275299774708184L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 872484738371805580L)
    public int EQ(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return 0;
            }
            iy.EQ(-6987534865988889L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -6987534865988889L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -532285517856375248L)
    public boolean Eq(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-209159202950094953L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 140 && syntaxTree.getSyntaxTag(syntaxTree.getRightSisterNode(syntaxTree.getRightSisterNode(i))) == 124) {
                return true;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 159 && syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(i))) == 172 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 2)) == 124 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 1)) == 17) {
                if (syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 0) == syntaxTree.getParentNode(i)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -209159202950094953L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3399649084547694720L)
    public int FH(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(1322596080001526885L, this, syntaxTree, new Integer(i));
            }
            return (syntaxTree.getChildCount(i) - 1) / 2;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 1322596080001526885L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4730390455629056892L)
    public boolean I(int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.u7(-920357265023249571L, this, i);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -920357265023249571L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -664872540845355915L)
    public boolean KD(int i) {
        try {
            if (Zo) {
                iy.u7(-731603112064915896L, this, i);
            }
            return i == 146;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -731603112064915896L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5492770345935652045L)
    public int Mr(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(3350147533152951360L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, 0);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3350147533152951360L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1005363117311785248L)
    public int OW(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return 0;
            }
            iy.EQ(-3214440499782834747L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -3214440499782834747L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1054788269493384993L)
    public boolean QX(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.EQ(-804731280879365996L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -804731280879365996L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5443179998391331420L)
    public boolean Sf(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.EQ(-2839243617306696985L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -2839243617306696985L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2067239826657499680L)
    public boolean U2(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.EQ(-611083425243632005L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -611083425243632005L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2469569948436009741L)
    public boolean VH(int i) {
        try {
            if (Zo) {
                iy.u7(-423699524893871800L, this, i);
            }
            return FH[i];
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -423699524893871800L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -7674706786449894976L)
    public int Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-4827784104402630067L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -4827784104402630067L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6212233979287338159L)
    public int XG(SyntaxTree syntaxTree) {
        try {
            if (!Zo) {
                return 1;
            }
            iy.tp(4947239867353008192L, this, syntaxTree);
            return 1;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 4947239867353008192L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 240840168899522403L)
    public int XL(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(5779410398029520964L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, 0);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 5779410398029520964L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -110362012819887540L)
    public boolean Xa(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(3292222845126064757L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 140 && syntaxTree.getSyntaxTag(syntaxTree.getRightSisterNode(syntaxTree.getRightSisterNode(i))) != 124) {
                return true;
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 159 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0)) == 166 && syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(i))) == 172 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 2)) != 124 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 1)) == 17) {
                if (syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 0) == syntaxTree.getParentNode(i)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 3292222845126064757L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -636249655522723212L)
    public boolean Zo(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(323457124722471025L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 125 || syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 207 || Xa(syntaxTree, i)) {
                return true;
            }
            return Eq(syntaxTree, i);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 323457124722471025L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 6568584166965313080L)
    public int br(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (Zo) {
                iy.we(1995007594305934603L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            return syntaxTree.getChildNode(i, (i2 * 2) + 1);
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 1995007594305934603L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4904497988878601497L)
    public boolean ca(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(1158379247705872720L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 172 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1)) == 17) {
                if (syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0) == i) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 1158379247705872720L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -189125691361445423L)
    public String cb(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return null;
            }
            iy.EQ(-3671889848827011600L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -3671889848827011600L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4096769028802126697L)
    public boolean ef(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.EQ(2140577075116590460L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 2140577075116590460L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3179625141519201360L)
    public int er(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (Zo) {
                iy.we(2489920861423115483L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            return syntaxTree.getChildNode(i, (i2 * 2) + 1);
        } catch (Throwable th) {
            if (VH) {
                iy.U2(th, 2489920861423115483L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -7211719778567815296L)
    public int et(int i) {
        try {
            if (Zo) {
                iy.u7(-4053091841064739625L, this, i);
            }
            int i2 = 6;
            if (i == 18) {
                return 6;
            }
            if (i == 19) {
                return 2;
            }
            if (i == 21) {
                return 3;
            }
            if (i == 25) {
                return 12;
            }
            if (i == 27) {
                return 3;
            }
            if (i == 30 || i == 32) {
                return 2;
            }
            if (i == 35) {
                return 6;
            }
            if (i == 36) {
                return 8;
            }
            if (i == 38) {
                return 9;
            }
            if (i == 39) {
                return 11;
            }
            if (i == 41) {
                return 7;
            }
            if (i == 42) {
                return 10;
            }
            if (i != 115 && i != 116) {
                i2 = 5;
                switch (i) {
                    case 44:
                    case 45:
                        break;
                    case 46:
                        return 4;
                    default:
                        switch (i) {
                            case 48:
                            case ProxyTextView.INPUTTYPE_textEmailSubject /* 49 */:
                                return 5;
                            case 50:
                            case 51:
                                return 4;
                            default:
                                return 13;
                        }
                }
            }
            return i2;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -4053091841064739625L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4500891193743881560L)
    public boolean g3(int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.u7(3942776953144383873L, this, i);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 3942776953144383873L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1101868110251944960L)
    public int getImportEndLine(SyntaxTree syntaxTree) {
        try {
            if (!Zo) {
                return 0;
            }
            iy.tp(-4302041217555656335L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -4302041217555656335L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -7074981049973882192L)
    public ListOfInt getImportNodePairs(SyntaxTree syntaxTree) {
        try {
            if (!Zo) {
                return null;
            }
            iy.tp(4019927217104827695L, this, syntaxTree);
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 4019927217104827695L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -423176537169342960L)
    public ListOfInt getNamespaceNodePairs(SyntaxTree syntaxTree) {
        try {
            if (Zo) {
                iy.tp(-309101360583753135L, this, syntaxTree);
            }
            return new ListOfInt();
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -309101360583753135L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2124338435205760473L)
    public String getString(int i) {
        try {
            if (Zo) {
                iy.u7(1515616511480543184L, this, i);
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
                    return "function";
                case 98:
                    return "var";
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
                    return "typeof";
                case 106:
                    return "with";
                case 107:
                    return "label";
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                case 117:
                case 120:
                case 121:
                case 122:
                case 123:
                case 126:
                case 127:
                case 128:
                case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                case 130:
                case 131:
                case 132:
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 160:
                case 162:
                case 167:
                case 169:
                case 174:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                case 187:
                case 188:
                case 189:
                case 192:
                case ProxyTextView.INPUTTYPE_textPhonetic /* 193 */:
                case 194:
                case 195:
                case 198:
                case 206:
                case 208:
                case ProxyTextView.INPUTTYPE_textWebEmailAddress /* 209 */:
                case 214:
                case 215:
                case 216:
                case 217:
                case 218:
                case 219:
                case 220:
                case 221:
                case 222:
                default:
                    return "";
                case 114:
                    return "in";
                case 115:
                    return "===";
                case 116:
                    return "!==";
                case 118:
                    return "delete";
                case 119:
                    return "debugger";
                case 124:
                    return "FUNCTION_DECLARATION";
                case 125:
                    return "GLOBAL_FUNCTION_DECLARATION";
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
                    return "OBJECT";
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
                case 152:
                    return "GLOBAL_VARIABLE_DECLARATION";
                case 159:
                    return "MEMBER_ACCESS";
                case ProxyTextView.INPUTTYPE_textWebEditText /* 161 */:
                    return "VARIABLE_ACCESS";
                case 163:
                    return "DELETE_EXPRESSION";
                case 164:
                    return "VOID_EXPRESSION";
                case 165:
                    return "ARRAY_ACCESS";
                case 166:
                    return "THIS_LITERAL";
                case 168:
                    return "PARENTHESIZED_EXPRESSION";
                case 170:
                    return "PREFIX_EXPRESSION";
                case 171:
                    return "POSTFIX_EXPRESSION";
                case 172:
                    return "INFIX_EXPRESSION";
                case 173:
                    return "TYPEOF_EXPRESSION";
                case 175:
                    return "INVOCATION";
                case 176:
                    return "OBJECT_CREATION";
                case ProxyTextView.INPUTTYPE_textFilter /* 177 */:
                    return "INSTANCEOF_EXPRESSION";
                case 178:
                    return "COMMA_EXPRESSION";
                case 190:
                    return "PARAMETERS";
                case 191:
                    return "PARAMETER";
                case 196:
                    return "ARRAY";
                case 197:
                    return "ARGUMENTS";
                case 199:
                    return "DUMMY";
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
                case 207:
                    return "GLOBAL_VARIABLE";
                case 210:
                    return "CONDITIONAL_OPERATOR";
                case 211:
                    return "FOREACH_STATEMENT";
                case 212:
                    return "WITH_STATEMENT";
                case 213:
                    return "INCLUDE_STATEMENT";
                case 223:
                    return "COMPILATIONUNIT";
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1515616511480543184L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1959940081870646019L)
    public int getTokenLength(int i) {
        try {
            if (Zo) {
                iy.u7(-3962535060604795008L, this, i);
            }
            if (i == 118) {
                return 6;
            }
            if (i == 119) {
                return 8;
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
                    return 8;
                case 98:
                    return 3;
                case 99:
                case 100:
                case 101:
                    return 9;
                case 102:
                case 103:
                    return 10;
                case 104:
                    return 12;
                case 105:
                    return 6;
                case 106:
                    return 4;
                case 107:
                    return 5;
                default:
                    switch (i) {
                        case 114:
                            return 2;
                        case 115:
                        case 116:
                            return 3;
                        default:
                            return 0;
                    }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3962535060604795008L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -199408006573993259L)
    public int gn(SyntaxTree syntaxTree) {
        try {
            if (!Zo) {
                return 1;
            }
            iy.tp(-2971244178475197940L, this, syntaxTree);
            return 1;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2971244178475197940L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1633165480096424288L)
    public boolean hasAttrDAIndex(int i) {
        try {
            if (Zo) {
                iy.u7(-3928564772372044593L, this, i);
            }
            return i == 1;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3928564772372044593L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3098144532213851472L)
    public boolean hasAttrTarget(int i) {
        try {
            if (Zo) {
                iy.u7(-3295880274973237227L, this, i);
            }
            return i == 138 || i == 139;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3295880274973237227L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -738599675854698171L)
    public boolean hasAttrType(int i) {
        try {
            if (Zo) {
                iy.u7(2726413958231482680L, this, i);
            }
            return Hw[i];
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2726413958231482680L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2260686262340297192L)
    public boolean hasAttrValue(int i) {
        try {
            if (Zo) {
                iy.u7(-701033320832170477L, this, i);
            }
            return v5[i];
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -701033320832170477L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -8389843299697628849L)
    public boolean hasAttrVariableSlot(int i) {
        try {
            if (Zo) {
                iy.u7(-5265133619131720164L, this, i);
            }
            return i == 1 || i == 147 || i == 205 || i == 211;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -5265133619131720164L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -711700882282837368L)
    public boolean isArguments(int i) {
        try {
            if (Zo) {
                iy.u7(2837752184150579145L, this, i);
            }
            return i == 197;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2837752184150579145L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 545815381959326885L)
    public boolean isBlock(int i) {
        try {
            if (Zo) {
                iy.u7(-484402000024321848L, this, i);
            }
            return i == 133;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -484402000024321848L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3725630130144230280L)
    public boolean isBooleanLiteral(int i) {
        try {
            if (Zo) {
                iy.u7(-2348670575707803113L, this, i);
            }
            if (i == 66 || i == 68 || i == 74) {
                return true;
            }
            return isLiteral(i);
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2348670575707803113L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6447179360677635101L)
    public boolean isChangedExpressionNode(SyntaxTree syntaxTree, int i) {
        int syntaxTag;
        int syntaxTag2;
        try {
            if (Zo) {
                iy.EQ(-2408157751431171480L, this, syntaxTree, new Integer(i));
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
            if (VH) {
                iy.Mr(th, -2408157751431171480L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 242628937447228500L)
    public boolean isClassBody(int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.u7(-2286108730900526581L, this, i);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2286108730900526581L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5181597413865666596L)
    public boolean isClassDeclaration(int i) {
        try {
            if (Zo) {
                iy.u7(669225543053408825L, this, i);
            }
            return i == 223;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 669225543053408825L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 747662315565041860L)
    public boolean isComment(int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.u7(4612343145786475209L, this, i);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 4612343145786475209L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4359422952908560032L)
    public boolean isDocComment(int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.u7(532495803803993225L, this, i);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 532495803803993225L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1172614697193669392L)
    public boolean isExpression(int i) {
        try {
            if (Zo) {
                iy.u7(3512445570233335151L, this, i);
            }
            return DW[i];
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 3512445570233335151L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 325775743421160192L)
    public boolean isFieldDeclaration(int i) {
        try {
            if (Zo) {
                iy.u7(-3909813335214267327L, this, i);
            }
            return i == 207;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -3909813335214267327L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3820685524813964737L)
    public boolean isIdentifier(int i) {
        try {
            if (Zo) {
                iy.u7(699620711509465924L, this, i);
            }
            return i == 1;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 699620711509465924L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1746242243878627061L)
    public boolean isLiteral(int i) {
        try {
            if (Zo) {
                iy.u7(1194686738772318680L, this, i);
            }
            return i <= 7 && i >= 2;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1194686738772318680L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 277273772608505248L)
    public boolean isMemberDeclaration(int i) {
        try {
            if (Zo) {
                iy.u7(3001923855707405475L, this, i);
            }
            return i == 125 || i == 207;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 3001923855707405475L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4665430142192254707L)
    public boolean isMethodDeclaration(int i) {
        try {
            if (Zo) {
                iy.u7(-1705595920659966816L, this, i);
            }
            return i == 125;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -1705595920659966816L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4301913117358266777L)
    public boolean isOperator(int i) {
        try {
            if (Zo) {
                iy.u7(862634187548211120L, this, i);
            }
            if (i == 115 || i == 116) {
                return true;
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
                    return true;
                default:
                    switch (i) {
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
                        default:
                            return false;
                    }
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 862634187548211120L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2187383173101817116L)
    public boolean isParameters(int i) {
        try {
            if (Zo) {
                iy.u7(2456766480113688569L, this, i);
            }
            return i == 190;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 2456766480113688569L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5325112755759099424L)
    public boolean isSeparator(int i) {
        try {
            if (Zo) {
                iy.u7(1985106376241536893L, this, i);
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
            if (VH) {
                iy.j3(th, 1985106376241536893L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3638806374552286848L)
    public boolean isToken(int i) {
        try {
            if (Zo) {
                iy.u7(-2536470073168556915L, this, i);
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
                case 105:
                case 106:
                case 107:
                case 114:
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
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case ProxyTextView.INPUTTYPE_textPostalAddress /* 113 */:
                case 115:
                case 116:
                case 117:
                default:
                    return false;
            }
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2536470073168556915L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3487338306503682995L)
    public boolean isTypeIdentifier(int i) {
        try {
            if (Zo) {
                iy.u7(1489778562989191272L, this, i);
            }
            return i == 57 || i == 60 || i == 62 || i == 65 || i == 69 || i == 81 || i == 89 || i == 76 || i == 77;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1489778562989191272L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4636102285874709692L)
    public int jJ(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(2488042068449113853L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 140) {
                return syntaxTree.getLeftSisterNode(syntaxTree.getLeftSisterNode(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 172 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0)) == 159 && syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 1)) == 17) {
                return syntaxTree.getChildNode(syntaxTree.getChildNode(syntaxTree.getParentNode(i), 0), 2);
            }
            return -1;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 2488042068449113853L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5577087570017841260L)
    public int lg(SyntaxTree syntaxTree) {
        try {
            if (!Zo) {
                return 0;
            }
            iy.tp(1030390024798169381L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 1030390024798169381L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3287489406963429212L)
    public int ro(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-3273150660287397565L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getParentNode(i);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -3273150660287397565L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 548961916062203860L)
    public String sh(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return null;
            }
            iy.EQ(-421081880695169983L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -421081880695169983L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -824154610039996249L)
    public boolean tp(int i) {
        try {
            if (Zo) {
                iy.u7(-146926390266674304L, this, i);
            }
            return i < 120;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -146926390266674304L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5030821268755382220L)
    public int vy(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-3131110809419859377L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getChildNode(i, syntaxTree.getChildCount(i) - 1);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -3131110809419859377L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1216106414160735951L)
    public int wc(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-649585648982052960L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) == 140 && syntaxTree.getSyntaxTag(syntaxTree.getRightSisterNode(syntaxTree.getRightSisterNode(i))) == 124) {
                int rightSisterNode = syntaxTree.getRightSisterNode(syntaxTree.getRightSisterNode(i));
                return syntaxTree.getChildNode(rightSisterNode, syntaxTree.getChildCount(rightSisterNode) - 2);
            }
            if (syntaxTree.getSyntaxTag(syntaxTree.getParentNode(i)) != 159 || syntaxTree.getSyntaxTag(syntaxTree.getParentNode(syntaxTree.getParentNode(i))) != 172 || syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 2)) != 124 || syntaxTree.getSyntaxTag(syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 1)) != 17 || syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 0) != syntaxTree.getParentNode(i)) {
                return -1;
            }
            int childNode = syntaxTree.getChildNode(syntaxTree.getParentNode(syntaxTree.getParentNode(i)), 2);
            return syntaxTree.getChildNode(childNode, syntaxTree.getChildCount(childNode) - 2);
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -649585648982052960L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -7856569769319904640L)
    public int we(SyntaxTree syntaxTree, int i) {
        try {
            if (Zo) {
                iy.EQ(-4908023408056917465L, this, syntaxTree, new Integer(i));
            }
            return (syntaxTree.getChildCount(i) - 1) / 2;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -4908023408056917465L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1891520816302627556L)
    public boolean x9(SyntaxTree syntaxTree, int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.EQ(-1407426545389490835L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, -1407426545389490835L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2913026306018489469L)
    public boolean yS(int i) {
        try {
            if (!Zo) {
                return false;
            }
            iy.u7(-2591525279457922368L, this, i);
            return false;
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, -2591525279457922368L, this, new Integer(i));
            }
            throw th;
        }
    }
}
