package com.aide.codemodel.language.xml;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.collections.ListOfInt;
import com.aide.uidesigner.ProxyTextView;

@cy(clazz = 1366373214826503345L, container = 1366373214826503345L, user = true)
/* loaded from: classes.dex */
public class XmlSyntax implements Syntax {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(XmlSyntax.class);
    }

    @ey(method = -1332436500454628620L)
    public XmlSyntax() {
        try {
            if (j6) {
                iy.gn(2971298116182799532L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2971298116182799532L, null);
            }
            throw th;
        }
    }

    @ey(method = 2300899937022575460L)
    public static boolean et(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(-261631193787175680L, null, syntaxTree, new Integer(i));
            }
            int childNode = syntaxTree.getChildNode(i, 0);
            if (syntaxTree.isSyntheticNode(syntaxTree.getChildNode(childNode, 0))) {
                return syntaxTree.isSyntheticNode(syntaxTree.getChildNode(childNode, 1));
            }
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -261631193787175680L, null, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 7304804225497100000L)
    public static int jJ(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(-1815459315700433660L, null, syntaxTree, new Integer(i));
            }
            if (et(syntaxTree, i)) {
                return syntaxTree.getIdentifier(syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 2));
            }
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1815459315700433660L, null, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1030269254806035264L)
    public static int wc(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(-6027579780462335268L, null, syntaxTree, new Integer(i));
            }
            int iJJ = jJ(syntaxTree, i);
            if (iJJ != 0) {
                return syntaxTree.getModel().identifierSpace.QX(iJJ);
            }
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6027579780462335268L, null, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1503981366218025961L)
    public int EQ(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-1778106882883226709L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1778106882883226709L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5920045445156170405L)
    public int FH(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(3358285887982946921L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3358285887982946921L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 145445257829450645L)
    public boolean I(int i) {
        try {
            if (j6) {
                iy.u7(-990261919026804375L, this, i);
            }
            if (i == 33 || i == 39 || i == 45 || i == 70 || i == 78) {
                return true;
            }
            switch (i) {
                case 72:
                case 73:
                case 74:
                case 75:
                    return true;
                default:
                    return false;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -990261919026804375L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 909230822602329824L)
    public boolean KD(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-13180410149425200L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -13180410149425200L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5102358455085042100L)
    public int Mr(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-4421556713381519600L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -4421556713381519600L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2172569274404273829L)
    public int OW(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(-432009946764460807L, this, syntaxTree, new Integer(i));
            }
            if (syntaxTree.getSyntaxTag(i) == 210) {
                return syntaxTree.getChildNode(syntaxTree.getChildNode(i, 0), 1);
            }
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -432009946764460807L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3372417749500510608L)
    public boolean QX(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(1510232668396956876L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1510232668396956876L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1286743230173700375L)
    public boolean Sf(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(-4796049920453895429L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -4796049920453895429L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4551317175869387265L)
    public boolean U2(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(-3165850712904684233L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3165850712904684233L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -178412903186661680L)
    public boolean VH(int i) {
        try {
            if (j6) {
                iy.u7(859165927623624816L, this, i);
            }
            return i == 210;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 859165927623624816L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4067833865990660061L)
    public int Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(1984001303897928513L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1984001303897928513L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1876712232103334220L)
    public int XG(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-1140674861340967680L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1140674861340967680L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1886655871871494080L)
    public int XL(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(781376003248733628L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 781376003248733628L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1801529389308634575L)
    public boolean Zo(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(1121361346069565L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1121361346069565L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3465124252417466447L)
    public int br(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (!j6) {
                return 0;
            }
            iy.we(874707393599501007L, this, syntaxTree, new Integer(i), new Integer(i2));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 874707393599501007L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4313897195531746656L)
    public boolean ca(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(3543447967627098360L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3543447967627098360L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 563598442135816752L)
    public String cb(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return null;
            }
            iy.EQ(4178920571186395704L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4178920571186395704L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6657945074879648304L)
    public boolean ef(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(-2691801439927803740L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2691801439927803740L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5371304365393573199L)
    public int er(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (!j6) {
                return 0;
            }
            iy.we(-2691638959321146513L, this, syntaxTree, new Integer(i), new Integer(i2));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -2691638959321146513L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2337290039298068523L)
    public boolean g3(int i) {
        try {
            if (j6) {
                iy.u7(1634847857819228645L, this, i);
            }
            return i == 46 || i == 47 || i == 77;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1634847857819228645L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3647945338343519207L)
    public int getImportEndLine(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-4091957724183625899L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4091957724183625899L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2824576278799759365L)
    public ListOfInt getImportNodePairs(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-1945943643557265885L, this, syntaxTree);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1945943643557265885L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 592705056260008757L)
    public ListOfInt getNamespaceNodePairs(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-730902957790179579L, this, syntaxTree);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -730902957790179579L, this, syntaxTree);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x013c  */
    /* JADX WARN: Type inference failed for: r6v78, types: [java.lang.String] */
    @Override // com.aide.codemodel.api.abstraction.Syntax
    @abcd.ey(method = 2130429263027740496L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r6) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.xml.XmlSyntax.getString(int):java.lang.String");
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -100356174156057960L)
    public int getTokenLength(int i) {
        try {
            if (j6) {
                iy.u7(-397159283698484400L, this, i);
            }
            if (i == 4) {
                return 9;
            }
            if (i == 5) {
                return 3;
            }
            if (i == 7 || i == 8 || i == 16 || i == 17 || i == 22 || i == 23 || i == 27 || i == 28) {
                return 1;
            }
            if (i == 40 || i == 44) {
                return 3;
            }
            if (i == 47) {
                return 2;
            }
            if (i == 49) {
                return 1;
            }
            if (i == 71 || i == 76) {
                return 2;
            }
            if (i == 100) {
                return 3;
            }
            switch (i) {
                case 11:
                case 12:
                    return 2;
                case 13:
                    return 1;
                default:
                    switch (i) {
                        case 30:
                            return 5;
                        case 31:
                        case 32:
                            return 2;
                        default:
                            switch (i) {
                                case 34:
                                    return 9;
                                case 35:
                                case ProxyTextView.INPUTTYPE_time /* 36 */:
                                    return 6;
                                default:
                                    return 0;
                            }
                    }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -397159283698484400L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -142653402968980640L)
    public int gn(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-7546365661335690252L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -7546365661335690252L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -328390398599564165L)
    public boolean hasAttrDAIndex(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-551800880950875677L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -551800880950875677L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -877370903302820463L)
    public boolean hasAttrTarget(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2682547059167420473L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2682547059167420473L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3632835776898689456L)
    public boolean hasAttrType(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1573520191700277088L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1573520191700277088L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2524551735351216359L)
    public boolean hasAttrValue(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(739320577753160247L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 739320577753160247L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1811068366154382720L)
    public boolean hasAttrVariableSlot(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(1386867815964244692L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1386867815964244692L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3662049520731487347L)
    public boolean isArguments(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1587913391099182707L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1587913391099182707L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 821103043391136144L)
    public boolean isBlock(int i) {
        try {
            if (j6) {
                iy.u7(-140088826717965240L, this, i);
            }
            return i == 210;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -140088826717965240L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1770950678769773107L)
    public boolean isBooleanLiteral(int i) {
        try {
            if (j6) {
                iy.u7(1075998675073393459L, this, i);
            }
            if (i == 37) {
                return true;
            }
            switch (i) {
                case 16:
                case ProxyTextView.INPUTTYPE_textUri /* 17 */:
                case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
                    return true;
                default:
                    switch (i) {
                        case ProxyTextView.INPUTTYPE_date /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                            return true;
                        default:
                            return false;
                    }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1075998675073393459L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1260053310397762272L)
    public boolean isChangedExpressionNode(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(-2762295835349757408L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2762295835349757408L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2486426439773651261L)
    public boolean isClassBody(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-790647187303943985L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -790647187303943985L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6472853323616933239L)
    public boolean isClassDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-5034581570024048539L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5034581570024048539L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1411573102526925703L)
    public boolean isComment(int i) {
        try {
            if (j6) {
                iy.u7(-1435054583760860971L, this, i);
            }
            if (i == 44 || i == 45 || i == 75) {
                return true;
            }
            switch (i) {
                case 40:
                case 41:
                case 42:
                    return true;
                default:
                    return false;
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1435054583760860971L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4448390177013867747L)
    public boolean isDocComment(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-4502648559536862915L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4502648559536862915L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1197136745320440645L)
    public boolean isExpression(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2069707879790481181L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2069707879790481181L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4857498417878104905L)
    public boolean isFieldDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(4544227612425886565L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4544227612425886565L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4216838368776797568L)
    public boolean isIdentifier(int i) {
        try {
            if (j6) {
                iy.u7(1975025028745856460L, this, i);
            }
            return i == 21 || i == 29 || i == 38 || i == 50 || i == 25 || i == 26;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1975025028745856460L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1707927568261617040L)
    public boolean isLiteral(int i) {
        try {
            if (j6) {
                iy.u7(738128015716786240L, this, i);
            }
            return i == 6 || i == 18 || i == 20 || i == 37 || i == 41 || i == 46 || i == 48 || i == 77 || i == 14 || i == 15;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 738128015716786240L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -7063900188169356909L)
    public boolean isMemberDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-6212102002926799105L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6212102002926799105L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5701228393038101800L)
    public boolean isMethodDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(4720424668982235920L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4720424668982235920L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 6306500872147860972L)
    public boolean isOperator(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(3756498491352201600L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3756498491352201600L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2301808622717008503L)
    public boolean isParameters(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2839306971457308475L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2839306971457308475L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3415011264985265325L)
    public boolean isSeparator(int i) {
        try {
            if (j6) {
                iy.u7(1678223973932339729L, this, i);
            }
            if (i == 7 || i == 8 || i == 76 || i == 100) {
                return true;
            }
            switch (i) {
                case 11:
                case 12:
                case 13:
                    return true;
                default:
                    switch (i) {
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                            return true;
                        default:
                            return false;
                    }
            }
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1678223973932339729L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1637366157018304893L)
    public boolean isToken(int i) {
        try {
            if (j6) {
                iy.u7(969589564498871505L, this, i);
            }
            return i == 25;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 969589564498871505L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -575786956755620880L)
    public boolean isTypeIdentifier(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(5074628426667384968L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5074628426667384968L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6101253190618802515L)
    public int lg(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-4721453704089960655L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4721453704089960655L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 564144347504364683L)
    public int ro(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(604280105626352535L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 604280105626352535L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 171272211629691425L)
    public String sh(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return null;
            }
            iy.EQ(7799251004056513805L, this, syntaxTree, new Integer(i));
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 7799251004056513805L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -983752276281524100L)
    public boolean tp(int i) {
        try {
            if (j6) {
                iy.u7(-32474898351609440L, this, i);
            }
            return i < 200;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -32474898351609440L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3213114776336765391L)
    public int vy(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(4657022852542803459L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4657022852542803459L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 84265101817860915L)
    public int we(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(2234096834010442483L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 2234096834010442483L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4321071389933027301L)
    public boolean x9(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(952261739764599209L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 952261739764599209L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1734400932870309044L)
    public boolean yS(int i) {
        try {
            if (j6) {
                iy.u7(-2521982007436518528L, this, i);
            }
            return i == 75 || i == 216 || i == 301 || i == 320 || i == 209 || i == 210;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2521982007436518528L, this, new Integer(i));
            }
            throw th;
        }
    }
}
