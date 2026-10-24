package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.collections.ListOfInt;
import java.util.StringTokenizer;

@cy(clazz = 4842681933280417944L, container = 4842681933280417944L, user = true)
/* loaded from: classes.dex */
public class JSharpCommentsSyntax implements Syntax {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(JSharpCommentsSyntax.class);
    }

    @ey(method = -1048626426064271065L)
    public JSharpCommentsSyntax() {
        try {
            if (j6) {
                iy.gn(2790201587957659665L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 2790201587957659665L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 591745116788107200L)
    public int EQ(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(2690187674580056520L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 2690187674580056520L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3501114501725072700L)
    public int FH(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-1608534847330623552L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1608534847330623552L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 5333990037508769792L)
    public boolean I(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-3584966739538061328L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3584966739538061328L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1079346394154311925L)
    public boolean KD(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-152173482196258641L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -152173482196258641L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -868914114116419063L)
    public int Mr(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(454099635240675395L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 454099635240675395L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1423700653328150132L)
    public int OW(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(2280382616010865608L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 2280382616010865608L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5760790049300512779L)
    public boolean QX(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(-3487518107829779517L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3487518107829779517L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6482396600705816736L)
    public boolean Sf(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(5559932715233532048L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getSyntaxTag(i) == 2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 5559932715233532048L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 359639792500283424L)
    public boolean U2(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(64347222036949824L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 64347222036949824L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2704511171311288547L)
    public boolean VH(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(25199983938352135L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 25199983938352135L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 455404629100910020L)
    public int Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-6195979671400492200L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6195979671400492200L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 7820791309164480101L)
    public int XG(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(970015938966005223L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 970015938966005223L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -5415479619772400969L)
    public int XL(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(4387570649008058225L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4387570649008058225L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -381219878063567808L)
    public boolean Zo(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(268311335443074592L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 268311335443074592L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6747505708840061120L)
    public int br(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (!j6) {
                return 0;
            }
            iy.we(5504324759260000740L, this, syntaxTree, new Integer(i), new Integer(i2));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 5504324759260000740L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2871956380797929103L)
    public boolean ca(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(53626088968744875L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 53626088968744875L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 14648785941631673L)
    public String cb(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(-6703437938499131229L, this, syntaxTree, new Integer(i));
            }
            StringTokenizer stringTokenizer = new StringTokenizer(syntaxTree.getLiteralString(i), "\n");
            String str = "";
            while (stringTokenizer.hasMoreElements()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if (strTrim.equals("*/")) {
                    strTrim = "";
                } else if (strTrim.startsWith("*")) {
                    strTrim = strTrim.substring(1, strTrim.length());
                } else if (strTrim.startsWith("/**")) {
                    strTrim = strTrim.substring(3, strTrim.length());
                }
                if (strTrim.endsWith("*/")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 2);
                }
                if (strTrim.length() != 0) {
                    str = str + strTrim + "\n";
                }
            }
            return str;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6703437938499131229L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4829551072134466419L)
    public boolean ef(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(1072268959568968757L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1072268959568968757L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3109970547613843144L)
    public int er(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (!j6) {
                return 0;
            }
            iy.we(1351112466839884324L, this, syntaxTree, new Integer(i), new Integer(i2));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 1351112466839884324L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3944055386242887328L)
    public boolean g3(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(1572138633458078592L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1572138633458078592L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1746391610331101580L)
    public int getImportEndLine(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(4605253550247889224L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4605253550247889224L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 6833822474795634672L)
    public ListOfInt getImportNodePairs(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(130502059738439100L, this, syntaxTree);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 130502059738439100L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 588321434911163240L)
    public ListOfInt getNamespaceNodePairs(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(-3868556587620752240L, this, syntaxTree);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3868556587620752240L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -723835852248004375L)
    public String getString(int i) {
        try {
            if (!j6) {
                return null;
            }
            iy.u7(-706822350148551897L, this, i);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -706822350148551897L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2500629231558605237L)
    public int getTokenLength(int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.u7(-3999304247047280035L, this, i);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3999304247047280035L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 148242873214779185L)
    public int gn(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-2132420672449750905L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2132420672449750905L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2573801845995038560L)
    public boolean hasAttrDAIndex(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-3925179767303492292L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3925179767303492292L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3745778023973393520L)
    public boolean hasAttrTarget(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2648349892649184800L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2648349892649184800L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 775062486702341925L)
    public boolean hasAttrType(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2461410984645843377L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2461410984645843377L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3430265843820643296L)
    public boolean hasAttrValue(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(1168767495029692500L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1168767495029692500L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -759631464351707829L)
    public boolean hasAttrVariableSlot(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-4973116373969009675L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4973116373969009675L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 837088313266966608L)
    public boolean isArguments(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2499553153984337088L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2499553153984337088L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 424435617605143309L)
    public boolean isBlock(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-239084138103329373L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -239084138103329373L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -786044499644385408L)
    public boolean isBooleanLiteral(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2517989091449981440L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2517989091449981440L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1817160558719402061L)
    public boolean isChangedExpressionNode(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(342448145751318905L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 342448145751318905L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1694873222463099920L)
    public boolean isClassBody(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1625446592549809880L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1625446592549809880L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3340843192243473888L)
    public boolean isClassDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-3014584979646242800L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3014584979646242800L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3732430715035568448L)
    public boolean isComment(int i) {
        try {
            if (j6) {
                iy.u7(3888994485684299424L, this, i);
            }
            return i == 2 || i == 1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3888994485684299424L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4262795981195355240L)
    public boolean isDocComment(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-4513360354140475152L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4513360354140475152L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 123762404543200560L)
    public boolean isExpression(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1691705273552857924L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1691705273552857924L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1443733608951381972L)
    public boolean isFieldDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(6680646207008569544L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 6680646207008569544L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2738198209173632859L)
    public boolean isIdentifier(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2443569000419568027L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2443569000419568027L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1029613519744187787L)
    public boolean isLiteral(int i) {
        try {
            if (j6) {
                iy.u7(-912985491853939233L, this, i);
            }
            return i == 2 || i == 1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -912985491853939233L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 7780890502191142380L)
    public boolean isMemberDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2866257019372110784L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2866257019372110784L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2929119248722282917L)
    public boolean isMethodDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1597357153337065421L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1597357153337065421L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2231226515128915731L)
    public boolean isOperator(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1633601047150003335L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1633601047150003335L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -905001157428947584L)
    public boolean isParameters(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2497998427743258880L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2497998427743258880L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4578635026065392604L)
    public boolean isSeparator(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-942841889949214520L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -942841889949214520L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -951081476035773516L)
    public boolean isToken(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2702001568725673680L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2702001568725673680L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2152327298593358277L)
    public boolean isTypeIdentifier(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(1930115135077536981L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1930115135077536981L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    @abcd.ey(method = 5324331036858054832L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String jJ(java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.java.JSharpCommentsSyntax.jJ(java.lang.String):java.lang.String");
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3725619695729640000L)
    public int lg(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-2688136388703996592L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2688136388703996592L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3911748333415120640L)
    public int ro(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-2628286968561797760L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2628286968561797760L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 583928845888250560L)
    public String sh(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(-6495030917867773600L, this, syntaxTree, new Integer(i));
            }
            return jJ(cb(syntaxTree, i));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6495030917867773600L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -860257241580056861L)
    public boolean tp(int i) {
        try {
            if (j6) {
                iy.u7(-98577764316714767L, this, i);
            }
            return i < 10;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -98577764316714767L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -867950566100459840L)
    public int vy(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-3654230277680030880L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3654230277680030880L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 642055014232390808L)
    public int we(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-6384605195821187504L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -6384605195821187504L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 937901210446355344L)
    public boolean x9(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(553713995922807576L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 553713995922807576L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 3534091967990754729L)
    public boolean yS(int i) {
        try {
            if (j6) {
                iy.u7(-5120093265106370981L, this, i);
            }
            return i == 2;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5120093265106370981L, this, new Integer(i));
            }
            throw th;
        }
    }
}
