package com.aide.codemodel.api;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.f2;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.SignatureAnalyzer;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.collections.ListOfInt;

@cy(clazz = 1294351842892446711L, container = 1294351842892446711L, user = true)
/* loaded from: classes.dex */
public class SyntaxTree {

    @fy
    private static /* synthetic */ boolean U2;

    @gy
    private static /* synthetic */ boolean a8;

    @dy(field = -2120884847720214891L)
    private long NON_VALUE;

    @dy(field = -1308333031273689943L)
    private long NON_VALUE0;

    @dy(field = -1089002982235518041L)
    private long aM;

    @dy(field = 2634899998109949504L)
    private int attributepos;

    @dy(field = 720227207003004831L)
    private int[] attributes;

    @dy(field = 628313145946586328L)
    private long classdecldigest;

    @dy(field = 3359638782115299145L)
    private boolean clearedAttributes;

    @dy(field = 696580012348835651L)
    private int[] content;

    @dy(field = 554166430752445681L)
    private int contentpos;

    @dy(field = 2157621842970311200L)
    private long decldigest;

    @dy(field = 2473146989215406496L)
    private FileEntry file;

    @dy(field = -3891898145275900125L)
    private int indexcount;

    @dy(field = 3421389545897220864L)
    private Language language;

    @dy(field = -4019323189412237259L)
    private int literalpos;

    @dy(field = -685535511738635552L)
    private char[] literals;

    @dy(field = -2242099390321513335L)
    private Model model;

    @dy(field = 1698320586371803119L)
    private long publicDecldigest;

    @dy(field = -879061987634288920L)
    private int rootnode;

    @dy(field = -74544553174374645L)
    private Syntax syntax;

    @dy(field = -1692353832846727140L)
    private long version;

    static {
        iy.Zo(SyntaxTree.class);
    }

    @ey(method = 226137042347311520L)
    public SyntaxTree(Model model) {
        try {
            if (U2) {
                iy.tp(2203727589164501199L, null, model);
            }
            this.NON_VALUE0 = 1L;
            this.NON_VALUE = 1234567891234567891L - 1;
            this.model = model;
            this.literals = new char[1000];
            this.literalpos = 1;
            this.content = new int[10000];
            this.contentpos = 0;
            this.rootnode = -1;
            this.attributes = new int[1000];
            this.attributepos = 0;
            this.decldigest = -1L;
            this.classdecldigest = -1L;
            this.publicDecldigest = -1L;
            this.aM = -1L;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2203727589164501199L, null, model);
            }
            throw th;
        }
    }

    @ey(method = 4411055247251795220L)
    private int An(int i, int i2, int i3) {
        int endColumn;
        try {
            if (U2) {
                iy.we(440469726782448436L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (!isTokenNode(i) || this.syntax.g3(getSyntaxTag(i))) {
                int i4 = Integer.MAX_VALUE;
                int childCount = getChildCount(i);
                for (int i5 = 0; i5 < childCount; i5++) {
                    int iAn = An(getChildNode(i, i5), i2, i3);
                    if (iAn < i4) {
                        i4 = iAn;
                    }
                }
                return i4;
            }
            int startLine = getStartLine(i);
            if (startLine > i2) {
                return (startLine - i2) * 1000;
            }
            int endLine = getEndLine(i);
            if (endLine < i2) {
                return (i2 - endLine) * 1000;
            }
            if (endLine == startLine) {
                int startColumn = getStartColumn(i);
                if (startColumn > i3) {
                    return startColumn - i3;
                }
                int endColumn2 = getEndColumn(i);
                if (endColumn2 < i3) {
                    return i3 - endColumn2;
                }
                return 0;
            }
            if (i2 == startLine) {
                int startColumn2 = getStartColumn(i);
                if (startColumn2 > i3) {
                    return startColumn2 - i3;
                }
            } else if (i2 == endLine && (endColumn = getEndColumn(i)) < i3) {
                return i3 - endColumn;
            }
            return 0;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 440469726782448436L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3218033902245557040L)
    private int BR(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(-6338966545055341968L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int iBR = BR(getChildNode(i, i6), i2, i3, i4, i5);
                if (iBR != -1) {
                    return iBR;
                }
            }
            if (this.syntax.VH(getSyntaxTag(i)) && containsPosition(i, i2, i3)) {
                if (containsPosition(i, i4, i5)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, -6338966545055341968L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -483854459384944221L)
    private int CU(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(8528999246858638611L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int iCU = CU(getChildNode(i, i6), i2, i3, i4, i5);
                if (iCU != -1) {
                    return iCU;
                }
            }
            if (this.syntax.isExpression(getSyntaxTag(i)) && containsPosition(i, i2, i3)) {
                if (containsPosition(i, i4, i5)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, 8528999246858638611L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = 1664223720323826228L)
    private int ce(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(770023590271691860L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (isTokenNode(i) && containsPosition(i, i2, i3)) {
                return i;
            }
            int childCount = getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                int iCe = ce(getChildNode(i, i4), i2, i3);
                if (iCe != -1) {
                    return iCe;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 770023590271691860L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3996703087379642684L)
    private void clearAttributes(int i) {
        try {
            if (U2) {
                iy.u7(2464164286041683428L, this, i);
            }
            int childCount = getChildCount(i);
            for (int i2 = 0; i2 < childCount; i2++) {
                clearAttributes(getChildNode(i, i2));
            }
            this.content[i + 2] = -1;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2464164286041683428L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1907764860300944960L)
    private void createString(StringBuffer stringBuffer, String str, f2 f2Var, int i) {
        try {
            if (U2) {
                iy.J0(-6411636814120534272L, this, stringBuffer, str, f2Var, new Integer(i));
            }
            String strSubstring = "(" + f2Var.EQ(this, i) + "," + f2Var.tp(this, i) + "-" + f2Var.u7(this, i) + "," + f2Var.VH(this, i) + ") " + i + "                     ";
            if (strSubstring.length() > 25) {
                strSubstring = strSubstring.substring(0, 25);
            }
            if (this.syntax.isIdentifier(getSyntaxTag(i))) {
                stringBuffer.append(strSubstring + str + getIdentifierString(i));
            } else if (this.syntax.isLiteral(getSyntaxTag(i))) {
                stringBuffer.append(strSubstring + str + getLiteralString(i));
            } else {
                stringBuffer.append(strSubstring + str + this.syntax.getString(getSyntaxTag(i)));
            }
            if (this.syntax != null) {
                for (int i2 = 0; i2 < getAttributeCount(getSyntaxTag(i)); i2++) {
                    stringBuffer.append(" " + getAttribute(i, i2));
                }
            }
            if (isMethodOrClassOrFieldDeclarationNode(i)) {
                stringBuffer.append(" " + getDeclarationNumber(i));
            }
            if (isSyntheticNode(i)) {
                stringBuffer.append(" synthetic");
            }
            stringBuffer.append("\n");
            int childCount = getChildCount(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                createString(stringBuffer, str + "  ", f2Var, getChildNode(i, i3));
            }
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -6411636814120534272L, this, stringBuffer, str, f2Var, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 5052475788483692569L)
    private int getArgumentsNodeAt(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(5192238075159460905L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            int childCount = getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                int argumentsNodeAt = getArgumentsNodeAt(getChildNode(i, i4), i2, i3);
                if (argumentsNodeAt != -1) {
                    return argumentsNodeAt;
                }
            }
            if (this.syntax.isArguments(getSyntaxTag(i)) || this.syntax.isClassBody(getSyntaxTag(i))) {
                if (containsPositionExt(i, i2, i3)) {
                    return i;
                }
                if (getEndLine(i) == 0 && getStartLine(i) != 0) {
                    if (i2 > getStartLine(i)) {
                        return i;
                    }
                    if (i2 == getStartLine(i)) {
                        if (i3 >= getStartColumn(i)) {
                            return i;
                        }
                    }
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 5192238075159460905L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 5499298668930293901L)
    private int getAttribute(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(24457679546302717L, this, new Integer(i), new Integer(i2));
            }
            int iTp = this.content[i + 2];
            if (iTp == -1) {
                iTp = tp(i);
            }
            int i3 = iTp + i2;
            if (i3 > this.attributes.length) {
                System.out.println("");
            }
            return this.attributes[i3];
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 24457679546302717L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1148790399884319225L)
    private int getAttributeCount(int i) {
        try {
            if (U2) {
                iy.u7(-4534779324892621545L, this, i);
            }
            if (this.syntax.hasAttrTarget(i)) {
                return 10;
            }
            if (this.syntax.hasAttrDAIndex(i)) {
                return 9;
            }
            if (this.syntax.hasAttrVariableSlot(i)) {
                return 8;
            }
            if (!this.syntax.isIdentifier(i) && !this.syntax.isArguments(i) && !this.syntax.isParameters(i)) {
                if (this.syntax.hasAttrValue(i)) {
                    return 4;
                }
                return this.syntax.hasAttrType(i) ? 2 : 0;
            }
            return 7;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -4534779324892621545L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1259705582337152475L)
    private int getClassDeclarationNode(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(5124066964175050827L, this, new Integer(i), new Integer(i2));
            }
            if (this.syntax.isClassDeclaration(getSyntaxTag(i)) && getDeclarationNumber(i) == i2) {
                return i;
            }
            int childCount = getChildCount(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                int classDeclarationNode = getClassDeclarationNode(getChildNode(i, i3), i2);
                if (classDeclarationNode != -1) {
                    return classDeclarationNode;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 5124066964175050827L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 937770849053219295L)
    private int getExpressionNodeAt(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(1475591372307329487L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            if (this.syntax.isExpression(getSyntaxTag(i)) && getStartLine(i) == i2 && getStartColumn(i) == i3) {
                return i;
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int expressionNodeAt = getExpressionNodeAt(getChildNode(i, i6), i2, i3, i4, i5);
                if (expressionNodeAt != -1) {
                    return expressionNodeAt;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, 1475591372307329487L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -5866306190822013105L)
    private int getIdentifierNodeAt(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(3563199106489240095L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.syntax.isIdentifier(getSyntaxTag(i)) && containsPosition(i, i2, i3)) {
                return i;
            }
            int childCount = getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                int identifierNodeAt = getIdentifierNodeAt(getChildNode(i, i4), i2, i3);
                if (identifierNodeAt != -1) {
                    return identifierNodeAt;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 3563199106489240095L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -1799731743523656705L)
    private int getMemberDeclarationNode(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(5956771856239288591L, this, new Integer(i), new Integer(i2));
            }
            if (this.syntax.isMemberDeclaration(getSyntaxTag(i)) && getDeclarationNumber(i) == i2) {
                return i;
            }
            int childCount = getChildCount(i);
            for (int i3 = 0; i3 < childCount; i3++) {
                int memberDeclarationNode = getMemberDeclarationNode(getChildNode(i, i3), i2);
                if (memberDeclarationNode != -1) {
                    return memberDeclarationNode;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 5956771856239288591L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -497571814379811360L)
    private int getMethodNodeAt(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(-676601774416656576L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int methodNodeAt = getMethodNodeAt(getChildNode(i, i6), i2, i3, i4, i5);
                if (methodNodeAt != -1) {
                    return methodNodeAt;
                }
            }
            if (this.syntax.isMethodDeclaration(getSyntaxTag(i)) && containsPosition(i, i2, i3)) {
                if (containsPosition(i, i4, i5)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, -676601774416656576L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = 5144218931592275621L)
    private int getMethodNodeNear(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(-211833721295965963L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            int childCount = getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                int methodNodeNear = getMethodNodeNear(getChildNode(i, i4), i2, i3);
                if (methodNodeNear != -1) {
                    return methodNodeNear;
                }
            }
            if (this.syntax.isMethodDeclaration(getSyntaxTag(i))) {
                if (!containsPosition(i, i2, i3)) {
                    if (hasLeftSisterNode(i) && beforePosition(getLeftSisterNode(i), i2, i3)) {
                        if (afterPosition(i, i2, i3)) {
                        }
                    }
                }
                return i;
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -211833721295965963L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 116192177428965764L)
    private int getNodeAt(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(-733252693315571100L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int nodeAt = getNodeAt(getChildNode(i, i6), i2, i3, i4, i5);
                if (nodeAt != -1) {
                    return nodeAt;
                }
            }
            if (this.syntax.isBlock(getSyntaxTag(i)) && containsPosition(i, i2, i3)) {
                if (containsPosition(i, i4, i5)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, -733252693315571100L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -8364826702701947295L)
    private int getReadExpressionNodeAt(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(4416785504915907249L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int readExpressionNodeAt = getReadExpressionNodeAt(getChildNode(i, i6), i2, i3, i4, i5);
                if (readExpressionNodeAt != -1) {
                    return readExpressionNodeAt;
                }
            }
            if (this.syntax.isExpression(getSyntaxTag(i)) && !isChangedExpressionNode(i) && containsPosition(i, i2, i3)) {
                if (containsPositionExt(i, i4, i5)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, 4416785504915907249L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -4002515507432392875L)
    private int getSyntaxTagNodeAt(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (U2) {
                iy.QX(2351324177367939973L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            int childCount = getChildCount(i);
            int i7 = 0;
            while (i7 < childCount) {
                int i8 = i7;
                int syntaxTagNodeAt = getSyntaxTagNodeAt(getChildNode(i, i7), i2, i3, i4, i5, i6);
                if (syntaxTagNodeAt != -1) {
                    return syntaxTagNodeAt;
                }
                i7 = i8 + 1;
            }
            if (getSyntaxTag(i) == i2 && containsPosition(i, i3, i4)) {
                if (containsPosition(i, i5, i6)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.rN(th, 2351324177367939973L, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = 6006642630757966301L)
    private int getTokenNodeAt(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(440698535733769389L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (isTokenNode(i) && containsPositionExt(i, i2, i3)) {
                return i;
            }
            int childCount = getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                int tokenNodeAt = getTokenNodeAt(getChildNode(i, i4), i2, i3);
                if (tokenNodeAt != -1) {
                    return tokenNodeAt;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 440698535733769389L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 170351146463302013L)
    private boolean isMethodOrClassOrFieldDeclarationNode(int i) {
        try {
            if (U2) {
                iy.u7(561686151557488077L, this, i);
            }
            if (!isMethodDeclarationNode(i) && !isClassDeclarationNode(i)) {
                if (!isFieldDeclarationNode(i)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 561686151557488077L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4069987967497035488L)
    private int oY(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(1679197418529620672L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (this.syntax.isIdentifier(getSyntaxTag(i)) && containsPositionExt(i, i2, i3)) {
                return i;
            }
            int childCount = getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                int iOY = oY(getChildNode(i, i4), i2, i3);
                if (iOY != -1) {
                    return iOY;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 1679197418529620672L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3478782675786185743L)
    private int pN(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(1164669666327476575L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            int childCount = getChildCount(i);
            for (int i4 = 0; i4 < childCount; i4++) {
                int iPN = pN(getChildNode(i, i4), i2, i3);
                if (iPN != -1) {
                    return iPN;
                }
            }
            if (this.syntax.isParameters(getSyntaxTag(i))) {
                if (containsPositionExt(i, i2, i3)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 1164669666327476575L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2767837846891004288L)
    private int pO(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(-332703276092594240L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int iPO = pO(getChildNode(i, i6), i2, i3, i4, i5);
                if (iPO != -1) {
                    return iPO;
                }
            }
            if (containsPositionExt(i, i2, i3)) {
                if (containsPositionExt(i, i4, i5)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, -332703276092594240L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = 413565602094773104L)
    private void setAttribute(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(-2749107966344953040L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            this.clearedAttributes = false;
            int iTp = this.content[i + 2];
            if (iTp == -1) {
                iTp = tp(i);
            }
            this.attributes[iTp + i2] = i3;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -2749107966344953040L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -635867557125048981L)
    private int sg(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(318051863670927195L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            int childCount = getChildCount(i);
            for (int i6 = 0; i6 < childCount; i6++) {
                int iSg = sg(getChildNode(i, i6), i2, i3, i4, i5);
                if (iSg != -1) {
                    return iSg;
                }
            }
            if (containsPosition(i, i2, i3)) {
                if (containsPositionExt(i, i4, i5)) {
                    return i;
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, 318051863670927195L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -1871434070107037989L)
    private int tp(int i) {
        try {
            if (U2) {
                iy.u7(-5135763520134627125L, this, i);
            }
            int i2 = this.attributepos;
            this.content[i + 2] = i2;
            int syntaxTag = getSyntaxTag(i);
            int attributeCount = this.attributepos + getAttributeCount(syntaxTag);
            this.attributepos = attributeCount;
            if (attributeCount >= this.attributes.length) {
                int[] iArr = new int[Math.min(attributeCount * 2, (this.attributes.length * 2) + 1)];
                System.arraycopy(this.attributes, 0, iArr, 0, this.attributes.length);
                this.attributes = iArr;
            }
            if (this.syntax.hasAttrType(syntaxTag)) {
                declareAttrType(i, null);
            }
            if (this.syntax.hasAttrDAIndex(syntaxTag)) {
                declareAttrDAIndex(i, -1);
            }
            if (this.syntax.hasAttrValue(syntaxTag)) {
                j3(i, this.NON_VALUE);
            }
            if (this.syntax.isIdentifier(syntaxTag)) {
                setAttribute(i, 4, 0);
                setAttribute(i, 6, -1);
            }
            if (this.syntax.isParameters(syntaxTag)) {
                setAttribute(i, 4, 0);
            }
            if (this.syntax.isArguments(syntaxTag)) {
                setAttribute(i, 4, 0);
            }
            if (this.syntax.hasAttrTarget(syntaxTag)) {
                declareAttrTarget(i, -1);
            }
            return i2;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -5135763520134627125L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 344623730926835360L)
    public int Cz(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(-443862020206281600L, this, new Integer(i), new Integer(i2));
            }
            return pN(getRootNode(), i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -443862020206281600L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -30873351874028720L)
    public void Fd(SyntaxTreeStyles syntaxTreeStyles) {
        try {
            if (U2) {
                iy.tp(8017453186970565296L, this, syntaxTreeStyles);
            }
            int i = syntaxTreeStyles.gn;
            this.literalpos = i;
            if (this.literals.length <= i) {
                this.literals = new char[(i * 5) / 4];
            }
            System.arraycopy(syntaxTreeStyles.VH, 0, this.literals, 0, this.literalpos);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 8017453186970565296L, this, syntaxTreeStyles);
            }
            throw th;
        }
    }

    @ey(method = -822375103819192041L)
    public boolean GK(int i) {
        try {
            if (U2) {
                iy.u7(-1606814630192017785L, this, i);
            }
            if (this.syntax.isIdentifier(getSyntaxTag(i))) {
                if (this.syntax.Zo(this, i)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1606814630192017785L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2167961026772179537L)
    public boolean GT(int i) {
        try {
            if (U2) {
                iy.u7(-2490995389834921761L, this, i);
            }
            return this.syntax.KD(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -2490995389834921761L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 300473596517923036L)
    public int Jl(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(-1573968183836841540L, this, new Integer(i), new Integer(i2));
            }
            return getMethodNodeNear(getRootNode(), i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -1573968183836841540L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r1 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        return getChildNode(r0, r3);
     */
    @abcd.ey(method = -647420763237114475L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Mz(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            boolean r0 = com.aide.codemodel.api.SyntaxTree.U2     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L21
            r1 = -3078254311063519419(0xd547d8036cbe7f45, double:-6.675503842616615E102)
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L4f
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L4f
            r3 = r9
            abcd.iy.J0(r1, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L21:
            int r0 = r9.getBlockNodeAt(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L4f
            r1 = -1
            if (r0 != r1) goto L29
            return r1
        L29:
            int r1 = r9.getChildCount(r0)     // Catch: java.lang.Throwable -> L4f
            r2 = 1
        L2e:
            int r3 = r1 + (-1)
            if (r2 >= r3) goto L47
            int r3 = r9.getChildNode(r0, r2)     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r9.containsPosition(r3, r10, r11)     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L46
            boolean r4 = r9.afterPosition(r3, r10, r11)     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L43
            goto L46
        L43:
            int r2 = r2 + 1
            goto L2e
        L46:
            return r3
        L47:
            if (r1 != 0) goto L4a
            return r0
        L4a:
            int r10 = r9.getChildNode(r0, r3)     // Catch: java.lang.Throwable -> L4f
            return r10
        L4f:
            r0 = move-exception
            boolean r1 = com.aide.codemodel.api.SyntaxTree.a8
            if (r1 == 0) goto L72
            r2 = -3078254311063519419(0xd547d8036cbe7f45, double:-6.675503842616615E102)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r10)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r13)
            r1 = r0
            r4 = r9
            abcd.iy.a8(r1, r2, r4, r5, r6, r7, r8)
        L72:
            goto L74
        L73:
            throw r0
        L74:
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.SyntaxTree.Mz(int, int, int, int):int");
    }

    @ey(method = -91457389198649584L)
    public boolean N0(int i) {
        try {
            if (U2) {
                iy.u7(5554543451613439056L, this, i);
            }
            return !sT(i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 5554543451613439056L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1015265135147761725L)
    public int Nh(int i, int i2, int i3, int i4) {
        try {
            if (U2) {
                iy.J0(4055930834682546675L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            return BR(getRootNode(), i, i2, i3, i4);
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, 4055930834682546675L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -186948562180946328L)
    public boolean Od(int i) {
        try {
            if (U2) {
                iy.u7(-4561488395200125208L, this, i);
            }
            return this.syntax.ef(this, i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -4561488395200125208L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1136157305479803117L)
    public int P8(char[] cArr, int i, int i2) {
        try {
            if (U2) {
                iy.we(1593976699461289405L, this, cArr, new Integer(i), new Integer(i2));
            }
            if (this.literalpos + i2 + 1 >= this.literals.length) {
                char[] cArr2 = new char[Math.max((this.literals.length * 2) + 1, this.literalpos + i2 + 1)];
                System.arraycopy(this.literals, 0, cArr2, 0, this.literals.length);
                this.literals = cArr2;
            }
            int i3 = this.literalpos;
            char[] cArr3 = this.literals;
            int i4 = this.literalpos;
            int i5 = i4 + 1;
            this.literalpos = i5;
            cArr3[i4] = (char) i2;
            System.arraycopy(cArr, i, this.literals, i5, i2);
            this.literalpos += i2;
            return i3;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 1593976699461289405L, this, cArr, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5957654411814348555L)
    public int Pa(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(-363835886358214053L, this, new Integer(i), new Integer(i2));
            }
            return ce(getRootNode(), i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -363835886358214053L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 3395722253167439811L)
    public ListOfInt Qq(int i, int i2, int i3, int i4) {
        int childNode;
        int childNode2;
        try {
            if (U2) {
                iy.J0(-4040598888606366893L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            int blockNodeAt = getBlockNodeAt(i, i2, i3, i4);
            ListOfInt listOfInt = null;
            if (blockNodeAt == -1) {
                return null;
            }
            int childCount = getChildCount(blockNodeAt);
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    childNode = -1;
                    break;
                }
                childNode = getChildNode(blockNodeAt, i5);
                if (containsPosition(childNode, i, i2) || afterPosition(childNode, i, i2)) {
                    break;
                }
                i5++;
            }
            int i6 = childCount - 1;
            while (true) {
                if (i6 < 0) {
                    childNode2 = -1;
                    break;
                }
                childNode2 = getChildNode(blockNodeAt, i6);
                if (containsPosition(childNode2, i3, i4) || beforePosition(childNode2, i3, i4)) {
                    break;
                }
                i6--;
            }
            if (childNode != -1 && childNode2 != -1) {
                if (i5 > i6) {
                    return null;
                }
                listOfInt = new ListOfInt();
                while (i5 <= i6) {
                    listOfInt.add(getChildNode(blockNodeAt, i5));
                    i5++;
                }
            }
            return listOfInt;
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -4040598888606366893L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 3644528759821898175L)
    public void U2(int i) {
        try {
            if (U2) {
                iy.u7(-3894657242290242705L, this, i);
            }
            this.rootnode = i;
            this.clearedAttributes = true;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -3894657242290242705L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4161914686650724695L)
    public int WB() {
        try {
            if (U2) {
                iy.gn(4756701280858756487L, this);
            }
            return this.syntax.lg(this);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 4756701280858756487L, this);
            }
            throw th;
        }
    }

    @ey(method = -7325027238232640965L)
    public int Za(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(-3997513118446960245L, this, new Integer(i), new Integer(i2));
            }
            return An(getRootNode(), i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -3997513118446960245L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1061579695077413369L)
    public boolean afterPosition(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(14123380365479255L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (i2 > getStartLine(i)) {
                return false;
            }
            if (i2 < getStartLine(i)) {
                return true;
            }
            return getStartColumn(i) > i3;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 14123380365479255L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -32396878205189125L)
    public long aq() {
        try {
            if (U2) {
                iy.gn(-3810314660696464437L, this);
            }
            if (this.aM != -1) {
                return this.aM;
            }
            SignatureAnalyzer signatureAnalyzer = getLanguage().getSignatureAnalyzer();
            if (signatureAnalyzer == null) {
                return 0L;
            }
            long jJ6 = signatureAnalyzer.j6(this);
            this.aM = jJ6;
            return jJ6;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -3810314660696464437L, this);
            }
            throw th;
        }
    }

    @ey(method = 1249832835439297967L)
    public boolean areEqual(int i, int i2) {
        int childCount;
        try {
            if (U2) {
                iy.EQ(390655094783402495L, this, new Integer(i), new Integer(i2));
            }
            if (getSyntaxTag(i) != getSyntaxTag(i2) || (childCount = getChildCount(i)) != getChildCount(i2)) {
                return false;
            }
            if (this.syntax.isIdentifier(getSyntaxTag(i)) && getIdentifier(i) != getIdentifier(i2)) {
                return false;
            }
            if (this.syntax.isLiteral(getSyntaxTag(i))) {
                char[] literalChars = getLiteralChars(i);
                int literalOff = getLiteralOff(i);
                int literalLen = getLiteralLen(i);
                char[] literalChars2 = getLiteralChars(i2);
                int literalOff2 = getLiteralOff(i2);
                if (literalLen != getLiteralLen(i2)) {
                    return false;
                }
                for (int i3 = 0; i3 < literalLen; i3++) {
                    if (literalChars[literalOff + i3] != literalChars2[literalOff2 + i3]) {
                        return false;
                    }
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (!areEqual(getChildNode(i, i4), getChildNode(i2, i4))) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 390655094783402495L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -965210794623015460L)
    public boolean beforePosition(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(-366616511851471236L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (getStartLine(i) == 0 || i2 < getEndLine(i)) {
                return false;
            }
            if (i2 > getEndLine(i)) {
                return true;
            }
            return getEndColumn(i) <= i3;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -366616511851471236L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -2357138396167068092L)
    public void clear() {
        try {
            if (U2) {
                iy.gn(-870621613969580700L, this);
            }
            this.literalpos = 1;
            this.contentpos = 0;
            this.rootnode = -1;
            this.decldigest = -1L;
            this.attributepos = 0;
            this.classdecldigest = -1L;
            this.publicDecldigest = -1L;
            this.aM = -1L;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -870621613969580700L, this);
            }
            throw th;
        }
    }

    @ey(method = 2334147935537196211L)
    public void clearAttributes() {
        try {
            if (U2) {
                iy.gn(-4891947367175787837L, this);
            }
            if (this.clearedAttributes) {
                return;
            }
            clearAttributes(getRootNode());
            this.clearedAttributes = true;
            this.attributepos = 0;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -4891947367175787837L, this);
            }
            throw th;
        }
    }

    @ey(method = 5723466968608531620L)
    public boolean containsPosition(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(1080979025505365188L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (getStartLine(i) == 0 || i2 < getStartLine(i) || i2 > getEndLine(i)) {
                return false;
            }
            if (getStartLine(i) == getEndLine(i)) {
                return i3 >= getStartColumn(i) && i3 < getEndColumn(i);
            }
            if (i2 != getStartLine(i) || i3 >= getStartColumn(i)) {
                return i2 != getEndLine(i) || i3 < getEndColumn(i);
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 1080979025505365188L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 271639161861236725L)
    public boolean containsPositionExt(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(4620527242146325701L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            if (i2 < getStartLine(i) || i2 > getEndLine(i)) {
                return false;
            }
            if (getStartLine(i) == getEndLine(i)) {
                return i3 >= getStartColumn(i) && i3 <= getEndColumn(i);
            }
            if (i2 != getStartLine(i) || i3 >= getStartColumn(i)) {
                return i2 != getEndLine(i) || i3 <= getEndColumn(i);
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, 4620527242146325701L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = -3883269598280875397L)
    public boolean d8(int i) {
        try {
            if (U2) {
                iy.u7(3248521486034431915L, this, i);
            }
            return this.syntax.x9(this, i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 3248521486034431915L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1282733396200971731L)
    public void declareAttrDAIndex(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(59997194561477853L, this, new Integer(i), new Integer(i2));
            }
            setAttribute(i, 8, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 59997194561477853L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1333542068340014031L)
    public void declareAttrDAIndexCount(int i) {
        try {
            if (U2) {
                iy.u7(-319625974371715809L, this, i);
            }
            this.indexcount = i;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -319625974371715809L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 37134563640903477L)
    public void declareAttrInvocationType(int i, Type type) {
        try {
            if (U2) {
                iy.EQ(-5563532518223335579L, this, new Integer(i), type);
            }
            setAttribute(i, 6, this.model.entitySpace.getId(type));
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -5563532518223335579L, this, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = 3265123229947918308L)
    public void declareAttrReferenceKind(int i, int i2, int i3) {
        try {
            if (U2) {
                iy.we(-2735566267874905788L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            setAttribute(i, 4, i2);
            setAttribute(i, 5, i3);
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -2735566267874905788L, this, new Integer(i), new Integer(i2), new Integer(i3));
            }
            throw th;
        }
    }

    @ey(method = 3631952151763134616L)
    public void declareAttrReferenceKind(int i, int i2, Entity entity) {
        try {
            if (U2) {
                iy.we(-2456910180197216360L, this, new Integer(i), new Integer(i2), entity);
            }
            setAttribute(i, 4, i2);
            setAttribute(i, 5, this.model.entitySpace.getId(entity));
        } catch (Throwable th) {
            if (a8) {
                iy.U2(th, -2456910180197216360L, this, new Integer(i), new Integer(i2), entity);
            }
            throw th;
        }
    }

    @ey(method = 482764902173940885L)
    public void declareAttrTarget(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(-734511317426441499L, this, new Integer(i), new Integer(i2));
            }
            setAttribute(i, 9, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -734511317426441499L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 957797511583502580L)
    public boolean declareAttrTarget(int i) {
        try {
            if (U2) {
                iy.u7(-1594934599337135212L, this, i);
            }
            return getAttribute(i, 9) != -1;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1594934599337135212L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4250814101606937459L)
    public void declareAttrType(int i, Type type) {
        try {
            if (U2) {
                iy.EQ(5992313596397942755L, this, new Integer(i), type);
            }
            if (this.model.entitySpace != null) {
                if (type == null) {
                    setAttribute(i, 1, -1);
                }
                setAttribute(i, 1, this.model.entitySpace.getId(type));
            }
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 5992313596397942755L, this, new Integer(i), type);
            }
            throw th;
        }
    }

    @ey(method = -1716749630428480232L)
    public void declareAttrVariableSlot(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(2786626219995068792L, this, new Integer(i), new Integer(i2));
            }
            setAttribute(i, 7, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 2786626219995068792L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1658626162135676545L)
    public int declareNode(int i, boolean z, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.QX(4433539346830450959L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            int i6 = this.contentpos;
            this.contentpos += 8;
            while (this.contentpos >= this.content.length) {
                int[] iArr = new int[(this.content.length * 2) + 1];
                System.arraycopy(this.content, 0, iArr, 0, this.content.length);
                this.content = iArr;
            }
            int[] iArr2 = this.content;
            int i7 = i6 + 1;
            iArr2[i6] = (z ? 1048576 : 0) | i | 268435456;
            int i8 = i7 + 1;
            iArr2[i7] = -1;
            int i9 = i8 + 1;
            iArr2[i8] = -1;
            int i10 = i9 + 1;
            iArr2[i9] = i2;
            int i11 = i10 + 1;
            iArr2[i10] = i3;
            iArr2[i11] = i4;
            iArr2[i11 + 1] = i5;
            return i6;
        } catch (Throwable th) {
            if (a8) {
                iy.rN(th, 4433539346830450959L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = -1640416388083374564L)
    public int declareNode(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (U2) {
                iy.QX(-548402709039955012L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            int i7 = this.contentpos;
            this.contentpos += 8;
            while (this.contentpos >= this.content.length) {
                int[] iArr = new int[(this.content.length * 2) + 1];
                System.arraycopy(this.content, 0, iArr, 0, this.content.length);
                this.content = iArr;
            }
            int[] iArr2 = this.content;
            int i8 = i7 + 1;
            iArr2[i7] = (z ? 1048576 : 0) | i | 268435456;
            int i9 = i8 + 1;
            iArr2[i8] = -1;
            int i10 = i9 + 1;
            iArr2[i9] = -1;
            int i11 = i10 + 1;
            iArr2[i10] = i2;
            int i12 = i11 + 1;
            iArr2[i11] = i3;
            int i13 = i12 + 1;
            iArr2[i12] = i4;
            iArr2[i13] = i5;
            iArr2[i13 + 1] = i6;
            return i7;
        } catch (Throwable th) {
            if (a8) {
                iy.rN(th, -548402709039955012L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = -433800163923692024L)
    public int declareNode(int i, boolean z, int[] iArr, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.QX(-1329560150282501528L, this, new Object[]{new Integer(i), new Boolean(z), iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            int i6 = this.contentpos;
            if (i3 > 0) {
                this.contentpos += i3 + 4;
            } else {
                this.contentpos += i3 + 6;
            }
            while (this.contentpos >= this.content.length) {
                int[] iArr2 = new int[(this.content.length * 2) + 1];
                System.arraycopy(this.content, 0, iArr2, 0, this.content.length);
                this.content = iArr2;
            }
            int[] iArr3 = this.content;
            int i7 = i6 + 1;
            iArr3[i6] = (z ? 1048576 : 0) | i;
            int i8 = i7 + 1;
            iArr3[i7] = -1;
            int i9 = i8 + 1;
            iArr3[i8] = -1;
            int i10 = i9 + 1;
            iArr3[i9] = i3;
            if (i3 > 0) {
                System.arraycopy(iArr, i2, iArr3, i10, i3);
                for (int i11 = 0; i11 < i3; i11++) {
                    iArr3[iArr[i2 + i11] + 1] = i6;
                }
            } else {
                iArr3[i10] = i4;
                iArr3[i10 + 1] = i5;
            }
            return i6;
        } catch (Throwable th) {
            if (a8) {
                iy.rN(th, -1329560150282501528L, this, new Object[]{new Integer(i), new Boolean(z), iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            throw th;
        }
    }

    @ey(method = -3841672852392815821L)
    public int declareNode(int i, boolean z, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        try {
            if (U2) {
                iy.QX(1130522489315424771L, this, new Object[]{new Integer(i), new Boolean(z), iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            int i8 = this.contentpos;
            if (i3 > 0) {
                this.contentpos += i3 + 5;
            } else {
                this.contentpos += i3 + 7;
            }
            while (this.contentpos >= this.content.length) {
                int[] iArr2 = new int[(this.content.length * 2) + 1];
                System.arraycopy(this.content, 0, iArr2, 0, this.content.length);
                this.content = iArr2;
            }
            int[] iArr3 = this.content;
            int i9 = i8 + 1;
            iArr3[i8] = (z ? 1048576 : 0) | i;
            int i10 = i9 + 1;
            iArr3[i9] = -1;
            int i11 = i10 + 1;
            iArr3[i10] = -1;
            int i12 = i11 + 1;
            iArr3[i11] = i3;
            if (i3 > 0) {
                System.arraycopy(iArr, i2, iArr3, i12, i3);
                for (int i13 = 0; i13 < i3; i13++) {
                    iArr3[iArr[i2 + i13] + 1] = i8;
                }
                i7 = i12 + i3;
            } else {
                int i14 = i12 + 1;
                iArr3[i12] = i4;
                i7 = i14 + 1;
                iArr3[i14] = i5;
            }
            iArr3[i7] = i6;
            return i8;
        } catch (Throwable th) {
            if (a8) {
                iy.rN(th, 1130522489315424771L, this, new Object[]{new Integer(i), new Boolean(z), iArr, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            }
            throw th;
        }
    }

    @ey(method = -143769219941979973L)
    public void declareVersion(long j) {
        try {
            if (U2) {
                iy.tp(51213403119891051L, this, new Long(j));
            }
            this.version = j;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 51213403119891051L, this, new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 4307654658444792263L)
    public int e9(int i) {
        try {
            if (U2) {
                iy.u7(3519731362693859255L, this, i);
            }
            return this.syntax.ro(this, i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 3519731362693859255L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2450429373703372672L)
    public int et(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(1315899244292813312L, this, new Integer(i), new Integer(i2));
            }
            return CU(getRootNode(), i, i2, i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 1315899244292813312L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -24153390290211720L)
    public boolean fP(int i) {
        try {
            if (U2) {
                iy.u7(6894015580425709176L, this, i);
            }
            return this.syntax.I(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 6894015580425709176L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6353820880290108396L)
    public int fY() {
        try {
            if (U2) {
                iy.gn(-2391785489392344500L, this);
            }
            return this.syntax.gn(this);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -2391785489392344500L, this);
            }
            throw th;
        }
    }

    @ey(method = 1928130577253377245L)
    public int gW(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            if (U2) {
                iy.QX(92527830019203757L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
            }
            int i8 = this.contentpos;
            this.contentpos += 9;
            while (this.contentpos >= this.content.length) {
                int[] iArr = new int[(this.content.length * 2) + 1];
                System.arraycopy(this.content, 0, iArr, 0, this.content.length);
                this.content = iArr;
            }
            int[] iArr2 = this.content;
            int i9 = i8 + 1;
            iArr2[i8] = (z ? 1048576 : 0) | i | 268435456;
            int i10 = i9 + 1;
            iArr2[i9] = -1;
            int i11 = i10 + 1;
            iArr2[i10] = -1;
            int i12 = i11 + 1;
            iArr2[i11] = i2;
            int i13 = i12 + 1;
            iArr2[i12] = i3;
            int i14 = i13 + 1;
            iArr2[i13] = i4;
            int i15 = i14 + 1;
            iArr2[i14] = i5;
            iArr2[i15] = i6;
            iArr2[i15 + 1] = i7;
            return i8;
        } catch (Throwable th) {
            if (a8) {
                iy.rN(th, 92527830019203757L, this, new Object[]{new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
            }
            throw th;
        }
    }

    @ey(method = -576073388010539980L)
    public int getArgumentsNodeAt(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(-523683655768857708L, this, new Integer(i), new Integer(i2));
            }
            int argumentsNodeAt = getArgumentsNodeAt(getRootNode(), i, i2);
            if (argumentsNodeAt != -1) {
                if (this.syntax.isClassBody(getSyntaxTag(argumentsNodeAt))) {
                    return -1;
                }
            }
            return argumentsNodeAt;
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -523683655768857708L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -7074845397257606080L)
    public int getAttrDAIndexCount() {
        try {
            if (U2) {
                iy.gn(-5837588499091661984L, this);
            }
            return this.indexcount;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -5837588499091661984L, this);
            }
            throw th;
        }
    }

    @ey(method = -222120718262668371L)
    public Type getAttrInvocationType(int i) {
        try {
            if (U2) {
                iy.u7(-69275498423213571L, this, i);
            }
            return (Type) this.model.entitySpace.getEntity(getAttribute(i, 6));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -69275498423213571L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1255064194765632109L)
    public Entity getAttrReferenceEntity(int i) {
        try {
            if (U2) {
                iy.u7(-438492623558725053L, this, i);
            }
            return this.model.entitySpace.getEntity(getAttribute(i, 5));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -438492623558725053L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -90073753836113280L)
    public int getAttrReferenceNode(int i) {
        try {
            if (U2) {
                iy.u7(2656951041168363200L, this, i);
            }
            return getAttribute(i, 5);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2656951041168363200L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1634241061947990012L)
    public int getAttrTarget(int i) {
        try {
            if (U2) {
                iy.u7(-3739975057095524380L, this, i);
            }
            return getAttribute(i, 9);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -3739975057095524380L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 218858328323280159L)
    public Type getAttrType(int i) {
        try {
            if (U2) {
                iy.u7(2309857363351115695L, this, i);
            }
            return (Type) this.model.entitySpace.getEntity(getAttribute(i, 1));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2309857363351115695L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2003548876751934400L)
    public long getAttrValue(int i) {
        try {
            if (U2) {
                iy.u7(-3095116799952671808L, this, i);
            }
            return (getAttribute(i, 2) << 32) + (getAttribute(i, 3) & 4294967295L);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -3095116799952671808L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4480260559891593345L)
    public int getAttrVariableSlot(int i) {
        try {
            if (U2) {
                iy.u7(-729737550477454255L, this, i);
            }
            return getAttribute(i, 7);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -729737550477454255L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2529626904306166368L)
    public int getAttribute(int i) {
        try {
            if (U2) {
                iy.u7(3862792546784222240L, this, i);
            }
            return getAttribute(i, 8);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 3862792546784222240L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -104267913754049525L)
    public int getBlockNodeAt(int i, int i2, int i3, int i4) {
        try {
            if (U2) {
                iy.J0(3503332992377743515L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            return getNodeAt(getRootNode(), i, i2, i3, i4);
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, 3503332992377743515L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -3083262849539722729L)
    public int getChildCount(int i) {
        try {
            if (U2) {
                iy.u7(2539271698958058279L, this, i);
            }
            if ((this.content[i] & 268435456) != 0) {
                return 0;
            }
            return this.content[i + 3];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2539271698958058279L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1674502752551383837L)
    public int getChildNode(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(-2645726271021842515L, this, new Integer(i), new Integer(i2));
            }
            return this.content[i + 4 + i2];
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -2645726271021842515L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -1363785313880036931L)
    public long getClassDeclarationDigest() {
        try {
            if (U2) {
                iy.gn(186483300783811085L, this);
            }
            if (this.classdecldigest != -1) {
                return this.classdecldigest;
            }
            SignatureAnalyzer signatureAnalyzer = getLanguage().getSignatureAnalyzer();
            if (signatureAnalyzer == null) {
                return 0L;
            }
            long classDeclarationDigest = signatureAnalyzer.getClassDeclarationDigest(this);
            this.classdecldigest = classDeclarationDigest;
            return classDeclarationDigest;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 186483300783811085L, this);
            }
            throw th;
        }
    }

    @ey(method = -604586106325099096L)
    public int getClassDeclarationNode(int i) {
        try {
            if (U2) {
                iy.u7(1168179825102721704L, this, i);
            }
            return getClassDeclarationNode(getRootNode(), i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 1168179825102721704L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5210178915051807981L)
    public long getDeclarationDigest() {
        try {
            if (U2) {
                iy.gn(2599580829042023523L, this);
            }
            if (this.decldigest != -1) {
                return this.decldigest;
            }
            SignatureAnalyzer signatureAnalyzer = getLanguage().getSignatureAnalyzer();
            if (signatureAnalyzer == null) {
                return 0L;
            }
            long declarationDigest = signatureAnalyzer.getDeclarationDigest(this);
            this.decldigest = declarationDigest;
            return declarationDigest;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 2599580829042023523L, this);
            }
            throw th;
        }
    }

    @ey(method = -129173363722823595L)
    public int getDeclarationNumber(int i) {
        try {
            if (U2) {
                iy.u7(3630401698221014885L, this, i);
            }
            if (isTokenNode(i)) {
                return this.content[i + 8];
            }
            int i2 = i + 3;
            return this.content[i2] == 0 ? this.content[i + 6] : this.content[i + 4 + this.content[i2]];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 3630401698221014885L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3194768125855000045L)
    public int getEndColumn(int i) {
        try {
            if (U2) {
                iy.u7(1083525908733095837L, this, i);
            }
            if (!isTokenNode(i)) {
                return getChildCount(i) == 0 ? this.content[i + 5] : getEndColumn(getChildNode(i, getChildCount(i) - 1));
            }
            if (!isLiteralNode(i) && !isIdentifierNode(i)) {
                return fP(i) ? this.content[i + 6] : isSyntheticNode(i) ? this.content[i + 4] : this.content[i + 4] + this.syntax.getTokenLength(getSyntaxTag(i));
            }
            return this.content[i + 7];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 1083525908733095837L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -782158623820017671L)
    public int getEndLine(int i) {
        try {
            if (U2) {
                iy.u7(-266813667501870135L, this, i);
            }
            if (!isTokenNode(i)) {
                return getChildCount(i) == 0 ? this.content[i + 4] : getEndLine(getChildNode(i, getChildCount(i) - 1));
            }
            if (!isLiteralNode(i) && !isIdentifierNode(i)) {
                return fP(i) ? this.content[i + 5] : this.content[i + 3];
            }
            return this.content[i + 6];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -266813667501870135L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 57401691217680384L)
    public int getExpressionNodeAt(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(827554396114709760L, this, new Integer(i), new Integer(i2));
            }
            int i3 = i2 + 1;
            return getExpressionNodeAt(getRootNode(), i, i3, i, i3);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 827554396114709760L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1935552609556356111L)
    public FileEntry getFile() {
        try {
            if (U2) {
                iy.gn(2037051920088535167L, this);
            }
            return this.file;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 2037051920088535167L, this);
            }
            throw th;
        }
    }

    @ey(method = 2633267130970575099L)
    public int getIdentifier(int i) {
        try {
            if (U2) {
                iy.u7(-224836775509390933L, this, i);
            }
            return this.content[i + 3];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -224836775509390933L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1959874873284581468L)
    public String getIdentifierString(int i) {
        try {
            if (U2) {
                iy.u7(-6547211289958936572L, this, i);
            }
            return this.model.identifierSpace.getString(this.content[i + 3]);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -6547211289958936572L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3378150651930656429L)
    public int getImportEndLine() {
        try {
            if (U2) {
                iy.gn(-1085929393558596765L, this);
            }
            return this.syntax.getImportEndLine(this);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -1085929393558596765L, this);
            }
            throw th;
        }
    }

    @ey(method = 3925205136573120637L)
    public ListOfInt getImportNodePairs() {
        try {
            if (U2) {
                iy.gn(4540282357276869965L, this);
            }
            return this.syntax.getImportNodePairs(this);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 4540282357276869965L, this);
            }
            throw th;
        }
    }

    @ey(method = -2211232784514510625L)
    public Language getLanguage() {
        try {
            if (U2) {
                iy.gn(-2238847541271191025L, this);
            }
            return this.language;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -2238847541271191025L, this);
            }
            throw th;
        }
    }

    @ey(method = 1922544514992537135L)
    public int getLeftSisterNode(int i) {
        try {
            if (U2) {
                iy.u7(-1736429567479659489L, this, i);
            }
            int parentNode = getParentNode(i);
            for (int i2 = 1; i2 < getChildCount(parentNode); i2++) {
                if (getChildNode(parentNode, i2) == i) {
                    return getChildNode(parentNode, i2 - 1);
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1736429567479659489L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4240652211245021596L)
    public char[] getLiteralChars(int i) {
        try {
            if (U2) {
                iy.u7(2095438848431276420L, this, i);
            }
            return this.literals;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2095438848431276420L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3230913431720611560L)
    public int getLiteralLen(int i) {
        try {
            if (U2) {
                iy.u7(297569932104613832L, this, i);
            }
            return this.literals[this.content[i + 3]];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 297569932104613832L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3235066003700763264L)
    public int getLiteralOff(int i) {
        try {
            if (U2) {
                iy.u7(306157390040880256L, this, i);
            }
            return this.content[i + 3] + 1;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 306157390040880256L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2989398454416151008L)
    public String getLiteralString(int i) {
        try {
            if (U2) {
                iy.u7(5505768138436738336L, this, i);
            }
            int i2 = this.content[i + 3];
            return new String(this.literals, i2 + 1, (int) this.literals[i2]);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 5505768138436738336L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -339117151356456312L)
    public int getMemberDeclarationNode(int i) {
        try {
            if (U2) {
                iy.u7(-110624207094939480L, this, i);
            }
            return getMemberDeclarationNode(getRootNode(), i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -110624207094939480L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 1780612198300005705L)
    public int getMethodNodeAt(int i, int i2, int i3, int i4) {
        try {
            if (U2) {
                iy.J0(-126726138978238183L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            return getMethodNodeAt(getRootNode(), i, i2, i3, i4);
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -126726138978238183L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 2824034835711295296L)
    public Model getModel() {
        try {
            if (U2) {
                iy.gn(-386862077097776640L, this);
            }
            return this.model;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -386862077097776640L, this);
            }
            throw th;
        }
    }

    @ey(method = 3126872642516617505L)
    public ListOfInt getNamespaceNodePairs() {
        try {
            if (U2) {
                iy.gn(-1398812590765049391L, this);
            }
            return this.syntax.getNamespaceNodePairs(this);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -1398812590765049391L, this);
            }
            throw th;
        }
    }

    @ey(method = -3468148115703842688L)
    public int getParentNode(int i) {
        try {
            if (U2) {
                iy.u7(2269871905661785152L, this, i);
            }
            return this.content[i + 1];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2269871905661785152L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 335161508583234816L)
    public long getPublicDeclarationDigest() {
        try {
            if (U2) {
                iy.gn(-1454964320046957952L, this);
            }
            if (this.publicDecldigest != -1) {
                return this.publicDecldigest;
            }
            SignatureAnalyzer signatureAnalyzer = getLanguage().getSignatureAnalyzer();
            if (signatureAnalyzer == null) {
                return 0L;
            }
            long publicDeclarationDigest = signatureAnalyzer.getPublicDeclarationDigest(this);
            this.publicDecldigest = publicDeclarationDigest;
            return publicDeclarationDigest;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -1454964320046957952L, this);
            }
            throw th;
        }
    }

    @ey(method = -1030353896460610780L)
    public int getReadExpressionNodeAt(int i, int i2, int i3, int i4) {
        try {
            if (U2) {
                iy.J0(1636641040684233220L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            return getReadExpressionNodeAt(getRootNode(), i, i2, i3, i4);
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, 1636641040684233220L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -3183434745063705524L)
    public int getRightSisterNode(int i) {
        try {
            if (U2) {
                iy.u7(6185318794524381100L, this, i);
            }
            int parentNode = getParentNode(i);
            for (int i2 = 0; i2 < getChildCount(parentNode) - 1; i2++) {
                if (getChildNode(parentNode, i2) == i) {
                    return getChildNode(parentNode, i2 + 1);
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 6185318794524381100L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2063399259703213905L)
    public int getRootNode() {
        try {
            if (U2) {
                iy.gn(1610919990977412225L, this);
            }
            return this.rootnode;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, 1610919990977412225L, this);
            }
            throw th;
        }
    }

    @ey(method = -3068381200520330112L)
    public int getStartColumn(int i) {
        try {
            if (U2) {
                iy.u7(-686355732691674624L, this, i);
            }
            if (!isTokenNode(i)) {
                return getChildCount(i) == 0 ? this.content[i + 5] : getStartColumn(getChildNode(i, 0));
            }
            if (!isLiteralNode(i) && !isIdentifierNode(i)) {
                return fP(i) ? this.content[i + 4] : this.content[i + 4];
            }
            return this.content[i + 5];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -686355732691674624L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2629005377776008204L)
    public int getStartLine(int i) {
        try {
            if (U2) {
                iy.u7(2743300132563769236L, this, i);
            }
            if (!isTokenNode(i)) {
                return getChildCount(i) == 0 ? this.content[i + 4] : getStartLine(getChildNode(i, 0));
            }
            if (!isLiteralNode(i) && !isIdentifierNode(i)) {
                return fP(i) ? this.content[i + 3] : this.content[i + 3];
            }
            return this.content[i + 4];
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2743300132563769236L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -154519094090054099L)
    public int getSyntaxTag(int i) {
        try {
            if (U2) {
                iy.u7(-1645872972450610435L, this, i);
            }
            return this.content[i] & 65535;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1645872972450610435L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -3442459878397046416L)
    public int getSyntaxTagNodeAt(int i, int i2, int i3, int i4, int i5) {
        try {
            if (U2) {
                iy.J8(-305372515164087120L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            return getSyntaxTagNodeAt(getRootNode(), i, i2, i3, i4, i5);
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, -305372515164087120L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5));
            }
            throw th;
        }
    }

    @ey(method = -612522976354408980L)
    public int getTokenNodeAt(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(3094592027165154892L, this, new Integer(i), new Integer(i2));
            }
            return getTokenNodeAt(getRootNode(), i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 3094592027165154892L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = -2864840752424280960L)
    public long getVersion() {
        try {
            if (U2) {
                iy.gn(-1757018842426264992L, this);
            }
            return this.version;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -1757018842426264992L, this);
            }
            throw th;
        }
    }

    @ey(method = 643042071750124493L)
    public boolean hasAttrInvocationType(int i) {
        try {
            if (U2) {
                iy.u7(45427089711977693L, this, i);
            }
            return getAttribute(i, 6) != -1;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 45427089711977693L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -389459229614498537L)
    public boolean hasAttrType(int i) {
        try {
            if (U2) {
                iy.u7(1829168262871407207L, this, i);
            }
            if (this.syntax.hasAttrType(getSyntaxTag(i))) {
                return getAttribute(i, 1) != -1;
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 1829168262871407207L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -396170577508932848L)
    public boolean hasAttrValue(int i) {
        try {
            if (U2) {
                iy.u7(-1802570537421994032L, this, i);
            }
            if (this.syntax.hasAttrValue(getSyntaxTag(i))) {
                return getAttrValue(i) != this.NON_VALUE;
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1802570537421994032L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -118881511740635049L)
    public boolean hasLeftSisterNode(int i) {
        try {
            if (U2) {
                iy.u7(-3520067495481528057L, this, i);
            }
            return getChildNode(getParentNode(i), 0) != i;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -3520067495481528057L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 6683908808560616700L)
    public boolean hasRightSisterNode(int i) {
        try {
            if (U2) {
                iy.u7(777108872215754140L, this, i);
            }
            return getChildNode(getParentNode(i), getChildCount(getParentNode(i)) - 1) != i;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 777108872215754140L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 24004523714229056L)
    public boolean isArgumentsNode(int i) {
        try {
            if (U2) {
                iy.u7(-4370822974145421632L, this, i);
            }
            return this.syntax.isArguments(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -4370822974145421632L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2281000511821234077L)
    public boolean isBlockNode(int i) {
        try {
            if (U2) {
                iy.u7(284245414879853875L, this, i);
            }
            return this.syntax.isBlock(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 284245414879853875L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1214192940072683224L)
    public boolean isChangedExpressionNode(int i) {
        try {
            if (U2) {
                iy.u7(900085504741262984L, this, i);
            }
            return this.syntax.isChangedExpressionNode(this, i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 900085504741262984L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -213100927231800280L)
    public boolean isClassDeclarationNode(int i) {
        try {
            if (U2) {
                iy.u7(19743024220849832L, this, i);
            }
            return this.syntax.isClassDeclaration(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 19743024220849832L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -4626683618550546792L)
    public boolean isComment(int i) {
        try {
            if (U2) {
                iy.u7(4874395526381652888L, this, i);
            }
            return this.syntax.isComment(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 4874395526381652888L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -2404208814097750912L)
    public boolean isEmpty() {
        try {
            if (U2) {
                iy.gn(-1799895917073369152L, this);
            }
            return this.rootnode == -1;
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -1799895917073369152L, this);
            }
            throw th;
        }
    }

    @ey(method = 1858555332175014555L)
    public boolean isEnclosingNode(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(308217590367869355L, this, new Integer(i), new Integer(i2));
            }
            if (i2 == i) {
                return true;
            }
            while (i2 != getRootNode()) {
                i2 = getParentNode(i2);
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        } finally {
        }
    }

    @ey(method = -691621479596132712L)
    public boolean isFieldDeclarationNode(int i) {
        try {
            if (U2) {
                iy.u7(-162820776430117960L, this, i);
            }
            return this.syntax.isFieldDeclaration(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -162820776430117960L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -1518351462577456689L)
    public boolean isIdentifierNode(int i) {
        try {
            if (U2) {
                iy.u7(-4717938278844320225L, this, i);
            }
            return this.syntax.isIdentifier(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -4717938278844320225L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 3388670760120392671L)
    public boolean isLiteralNode(int i) {
        try {
            if (U2) {
                iy.u7(420254434345031055L, this, i);
            }
            return this.syntax.isLiteral(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 420254434345031055L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 182908040027516787L)
    public boolean isMethodDeclarationNode(int i) {
        try {
            if (U2) {
                iy.u7(-1181742728599761021L, this, i);
            }
            return this.syntax.isMethodDeclaration(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1181742728599761021L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 2048315735769842168L)
    public boolean isParameters(int i) {
        try {
            if (U2) {
                iy.u7(-1655428337792827400L, this, i);
            }
            return this.syntax.isParameters(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1655428337792827400L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4068548730928285675L)
    public boolean isSyntheticNode(int i) {
        try {
            if (U2) {
                iy.u7(-933997744338220485L, this, i);
            }
            return (this.content[i] & 1048576) != 0;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -933997744338220485L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 272559691746138769L)
    public boolean isTokenNode(int i) {
        try {
            if (U2) {
                iy.u7(2291522638343345505L, this, i);
            }
            return (this.content[i] & 268435456) != 0;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 2291522638343345505L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 362484003835289817L)
    public void j3(int i, long j) {
        try {
            if (U2) {
                iy.EQ(518182250756189225L, this, new Integer(i), new Long(j));
            }
            setAttribute(i, 3, (int) j);
            setAttribute(i, 2, (int) (j >> 32));
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 518182250756189225L, this, new Integer(i), new Long(j));
            }
            throw th;
        }
    }

    @ey(method = 1346622825074878705L)
    public int jO(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(139503057843655233L, this, new Integer(i), new Integer(i2));
            }
            return oY(getRootNode(), i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 139503057843655233L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 5616983815680264336L)
    public int ko(int i, int i2) {
        try {
            if (U2) {
                iy.EQ(1161503709944033520L, this, new Integer(i), new Integer(i2));
            }
            return getIdentifierNodeAt(getRootNode(), i, i2);
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, 1161503709944033520L, this, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @ey(method = 1812565491561540288L)
    public void lg(FileEntry fileEntry, Language language) {
        try {
            if (U2) {
                iy.EQ(-4574838189411099072L, this, fileEntry, language);
            }
            this.file = fileEntry;
            this.language = language;
            this.syntax = language.getSyntax();
        } catch (Throwable th) {
            if (a8) {
                iy.Mr(th, -4574838189411099072L, this, fileEntry, language);
            }
            throw th;
        }
    }

    @ey(method = -2469122076679264731L)
    public long memSize() {
        try {
            if (U2) {
                iy.gn(-1857278324651276395L, this);
            }
            return (this.contentpos * 4) + (this.attributepos * 4);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -1857278324651276395L, this);
            }
            throw th;
        }
    }

    @ey(method = -1015338343266779037L)
    public ListOfInt n5(int i, int i2, int i3, int i4) {
        int i5;
        int childNode;
        int childNode2;
        try {
            if (U2) {
                iy.J0(-582209268948290445L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            int iSy = sy(i, i2, i3, i4);
            ListOfInt listOfInt = null;
            if (iSy == -1) {
                return null;
            }
            int childCount = getChildCount(iSy);
            int i6 = 0;
            while (true) {
                i5 = childCount - 1;
                if (i6 >= i5) {
                    childNode = -1;
                    break;
                }
                childNode = getChildNode(iSy, i6);
                if (containsPosition(childNode, i, i2) || afterPosition(childNode, i, i2)) {
                    break;
                }
                i6++;
            }
            while (true) {
                if (i5 < 0) {
                    childNode2 = -1;
                    break;
                }
                childNode2 = getChildNode(iSy, i5);
                if (containsPosition(childNode2, i3, i4) || beforePosition(childNode2, i3, i4)) {
                    break;
                }
                i5--;
            }
            if (childNode != -1 && childNode2 != -1) {
                if (i6 > i5) {
                    return null;
                }
                listOfInt = new ListOfInt();
                while (i6 <= i5) {
                    listOfInt.add(getChildNode(iSy, i6));
                    i6++;
                }
            }
            return listOfInt;
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -582209268948290445L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 441831977535265491L)
    public int oa(int i) {
        try {
            if (U2) {
                iy.u7(-45450274122156413L, this, i);
            }
            return this.syntax.EQ(this, i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -45450274122156413L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4316778975317175L)
    public boolean oh(int i) {
        try {
            if (U2) {
                iy.u7(-6487217610839618137L, this, i);
            }
            return this.syntax.yS(getSyntaxTag(i));
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -6487217610839618137L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 695131072066587373L)
    public boolean pl(int i) {
        try {
            if (U2) {
                iy.u7(5840223329168666781L, this, i);
            }
            return this.syntax.U2(this, i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 5840223329168666781L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -48082381689716192L)
    public boolean qP(int i) {
        try {
            if (U2) {
                iy.u7(1707151156610599200L, this, i);
            }
            return getAttribute(i, 8) != -1;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, 1707151156610599200L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = -5611078319440253376L)
    public int qp() {
        try {
            if (U2) {
                iy.gn(-4248775196637378944L, this);
            }
            return this.syntax.XG(this);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -4248775196637378944L, this);
            }
            throw th;
        }
    }

    @ey(method = 4986728155099382400L)
    public int rN(int i, boolean z, int i2, int i3, int i4) {
        try {
            if (U2) {
                iy.J8(-1634049399167125920L, this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            int i5 = this.contentpos;
            this.contentpos += 5;
            while (true) {
                if (this.contentpos < this.content.length) {
                    break;
                }
                int[] iArr = new int[(this.content.length * 2) + 1];
                System.arraycopy(this.content, 0, iArr, 0, this.content.length);
                this.content = iArr;
            }
            int[] iArr2 = this.content;
            int i6 = i5 + 1;
            iArr2[i5] = (z ? 1048576 : 0) | i | 268435456;
            int i7 = i6 + 1;
            iArr2[i6] = -1;
            int i8 = i7 + 1;
            iArr2[i7] = -1;
            iArr2[i8] = i2;
            iArr2[i8 + 1] = i3;
            return i5;
        } catch (Throwable th) {
            if (a8) {
                iy.lg(th, -1634049399167125920L, this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -268814271872315888L)
    public int sE(int i, int i2, int i3, int i4) {
        try {
            if (U2) {
                iy.J0(-805193992003998896L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            return sg(getRootNode(), i, i2, i3, i4);
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -805193992003998896L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = -2019258752930931456L)
    public boolean sT(int i) {
        try {
            if (U2) {
                iy.u7(-1297826729805963264L, this, i);
            }
            return this.syntax.ca(this, i);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -1297826729805963264L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 29209852808834496L)
    public int sh(int i) {
        try {
            if (U2) {
                iy.u7(-5531045293657421280L, this, i);
            }
            return getAttribute(i, 4);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -5531045293657421280L, this, new Integer(i));
            }
            throw th;
        }
    }

    @ey(method = 4208859163156773000L)
    public int sy(int i, int i2, int i3, int i4) {
        try {
            if (U2) {
                iy.J0(-1845339995254673304L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            int iPO = pO(getRootNode(), i, i2, i3, i4);
            if (iPO != -1) {
                while (iPO != getRootNode()) {
                    if (this.syntax.isClassBody(getSyntaxTag(iPO))) {
                        return iPO;
                    }
                    iPO = getParentNode(iPO);
                }
            }
            return -1;
        } catch (Throwable th) {
            if (a8) {
                iy.a8(th, -1845339995254673304L, this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4));
            }
            throw th;
        }
    }

    @ey(method = 3070134888405305595L)
    public String toString() {
        try {
            if (U2) {
                iy.gn(-190379137432152693L, this);
            }
            if (isEmpty()) {
                return "\n";
            }
            StringBuffer stringBuffer = new StringBuffer();
            createString(stringBuffer, "", new f2(), getRootNode());
            return stringBuffer.toString();
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -190379137432152693L, this);
            }
            throw th;
        }
    }

    @ey(method = -197755369223669367L)
    public void u7(SyntaxTree syntaxTree) {
        try {
            if (U2) {
                iy.tp(-110129584258471239L, this, syntaxTree);
            }
            if (syntaxTree.content.length < this.contentpos) {
                syntaxTree.content = new int[(this.contentpos * 5) / 4];
            }
            System.arraycopy(this.content, 0, syntaxTree.content, 0, this.contentpos);
            if (syntaxTree.literals.length <= this.literalpos) {
                syntaxTree.literals = new char[(this.literalpos * 5) / 4];
            }
            System.arraycopy(this.literals, 0, syntaxTree.literals, 0, this.literalpos);
            syntaxTree.literalpos = this.literalpos;
            syntaxTree.contentpos = this.contentpos;
            syntaxTree.rootnode = this.rootnode;
            syntaxTree.decldigest = this.decldigest;
            syntaxTree.classdecldigest = this.classdecldigest;
            syntaxTree.publicDecldigest = this.publicDecldigest;
            syntaxTree.aM = this.aM;
            syntaxTree.file = this.file;
            syntaxTree.language = this.language;
            syntaxTree.syntax = this.syntax;
            syntaxTree.version = this.version;
            syntaxTree.attributepos = 0;
            syntaxTree.clearedAttributes = this.clearedAttributes;
            syntaxTree.attributepos = this.attributepos;
            if (syntaxTree.attributes.length <= this.attributepos) {
                syntaxTree.attributes = new int[(this.attributepos * 5) / 4];
            }
            System.arraycopy(this.attributes, 0, syntaxTree.attributes, 0, this.attributepos);
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -110129584258471239L, this, syntaxTree);
            }
            throw th;
        }
    }

    @ey(method = -3950374356247790780L)
    public long u9() {
        try {
            if (U2) {
                iy.gn(-3216320501675236380L, this);
            }
            return (this.content.length * 4) + (this.attributes.length * 4);
        } catch (Throwable th) {
            if (a8) {
                iy.aM(th, -3216320501675236380L, this);
            }
            throw th;
        }
    }

    @ey(method = 32043823274956092L)
    public boolean wE(int i) {
        try {
            if (U2) {
                iy.u7(-2958570517571427300L, this, i);
            }
            if (this.syntax.isIdentifier(getSyntaxTag(i))) {
                if (this.syntax.QX(this, i)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (a8) {
                iy.j3(th, -2958570517571427300L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r2 = getChildNode(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r1 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r9.syntax.VH(getSyntaxTag(r2)) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        return r0;
     */
    @abcd.ey(method = -4012510225631257260L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int x9(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            boolean r0 = com.aide.codemodel.api.SyntaxTree.U2     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L21
            r1 = -354489795863329932(0xfb149968a910c374, double:-7.65785946790165E284)
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L67
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Throwable -> L67
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L67
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L67
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L67
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L67
            r3 = r9
            abcd.iy.J0(r1, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L67
        L21:
            int r0 = r9.getBlockNodeAt(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L67
            r1 = -1
            if (r0 != r1) goto L29
            return r1
        L29:
            int r1 = r9.getChildCount(r0)     // Catch: java.lang.Throwable -> L67
            r2 = 1
        L2e:
            int r3 = r1 + (-1)
            if (r2 >= r3) goto L52
            int r3 = r9.getChildNode(r0, r2)     // Catch: java.lang.Throwable -> L67
            com.aide.codemodel.api.abstraction.Syntax r4 = r9.syntax     // Catch: java.lang.Throwable -> L67
            int r5 = r9.getSyntaxTag(r3)     // Catch: java.lang.Throwable -> L67
            boolean r4 = r4.VH(r5)     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L4f
            boolean r4 = r9.containsPosition(r3, r10, r11)     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L4e
            boolean r4 = r9.afterPosition(r3, r10, r11)     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L4f
        L4e:
            return r3
        L4f:
            int r2 = r2 + 1
            goto L2e
        L52:
            int r2 = r9.getChildNode(r0, r3)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L66
            com.aide.codemodel.api.abstraction.Syntax r1 = r9.syntax     // Catch: java.lang.Throwable -> L67
            int r3 = r9.getSyntaxTag(r2)     // Catch: java.lang.Throwable -> L67
            boolean r10 = r1.VH(r3)     // Catch: java.lang.Throwable -> L67
            if (r10 != 0) goto L65
            goto L66
        L65:
            return r2
        L66:
            return r0
        L67:
            r0 = move-exception
            boolean r1 = com.aide.codemodel.api.SyntaxTree.a8
            if (r1 == 0) goto L8a
            r2 = -354489795863329932(0xfb149968a910c374, double:-7.65785946790165E284)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r10)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r12)
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r13)
            r1 = r0
            r4 = r9
            abcd.iy.a8(r1, r2, r4, r5, r6, r7, r8)
        L8a:
            goto L8c
        L8b:
            throw r0
        L8c:
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.api.SyntaxTree.x9(int, int, int, int):int");
    }
}
