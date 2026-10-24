package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.collections.ListOfInt;
import java.util.StringTokenizer;

@cy(clazz = 43731044773847256L, container = 43731044773847256L, user = true)
/* loaded from: classes.dex */
public class JavaScriptCommentsSyntax implements Syntax {

    @gy
    private static /* synthetic */ boolean DW;

    @fy
    private static /* synthetic */ boolean j6;

    static {
        iy.Zo(JavaScriptCommentsSyntax.class);
    }

    @ey(method = -1469590383307730112L)
    public JavaScriptCommentsSyntax() {
        try {
            if (j6) {
                iy.gn(7585735072633552224L, null);
            }
        } catch (Throwable th) {
            if (DW) {
                iy.aM(th, 7585735072633552224L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 326630641907966877L)
    public int EQ(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-2866126682586132672L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2866126682586132672L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4638232699867880269L)
    public int FH(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(2209649554340975304L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 2209649554340975304L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1170501160289525543L)
    public boolean I(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1935532714982581080L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1935532714982581080L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -367706161134511680L)
    public boolean KD(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-8588952519378306425L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -8588952519378306425L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1881472084127130768L)
    public int Mr(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(3248781958566970595L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3248781958566970595L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2259530718283267947L)
    public int OW(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(328940521581693904L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 328940521581693904L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 6064882371586592600L)
    public boolean QX(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(789590074350279267L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 789590074350279267L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4829725987540045979L)
    public boolean Sf(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(1632979956932672712L, this, syntaxTree, new Integer(i));
            }
            return syntaxTree.getSyntaxTag(i) == 2;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1632979956932672712L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 400199905756362177L)
    public boolean U2(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(1382825328238022656L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1382825328238022656L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 131495896158233376L)
    public boolean VH(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(1370961158024850175L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1370961158024850175L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4147372154277268451L)
    public int Ws(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(3098177554246561920L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3098177554246561920L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 927049780861596992L)
    public int XG(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(4380635762733259575L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 4380635762733259575L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 101883982686410592L)
    public int XL(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-3419559702410132255L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -3419559702410132255L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 308287850006098035L)
    public boolean Zo(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(-2095465058512253688L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -2095465058512253688L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2877033023772304101L)
    public int br(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (!j6) {
                return 0;
            }
            iy.we(3482796387736631556L, this, syntaxTree, new Integer(i), new Integer(i2));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, 3482796387736631556L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 7981323360235187200L)
    public boolean ca(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(1926860527089565011L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1926860527089565011L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6753252434637696L)
    public String cb(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(4029133334324313963L, this, syntaxTree, new Integer(i));
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
                iy.Mr(th, 4029133334324313963L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4200308639589338856L)
    public boolean ef(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(3285691574619873013L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3285691574619873013L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1965522771706399309L)
    public int er(SyntaxTree syntaxTree, int i, int i2) {
        try {
            if (!j6) {
                return 0;
            }
            iy.we(-516649933472077020L, this, syntaxTree, new Integer(i), new Integer(i2));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.U2(th, -516649933472077020L, this, syntaxTree, new Integer(i), new Integer(i2));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -4567288005716507693L)
    public boolean g3(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(3018149636567208528L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3018149636567208528L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2407646360093676057L)
    public int getImportEndLine(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(-4604939977942794432L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -4604939977942794432L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1383412566567513L)
    public ListOfInt getImportNodePairs(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(3601417105184739148L, this, syntaxTree);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3601417105184739148L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -237998744942314725L)
    public ListOfInt getNamespaceNodePairs(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return null;
            }
            iy.tp(8000784926250807680L, this, syntaxTree);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 8000784926250807680L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1137703648230743548L)
    public String getString(int i) {
        try {
            if (!j6) {
                return null;
            }
            iy.u7(735375782387432655L, this, i);
            return null;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 735375782387432655L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1666658361256961100L)
    public int getTokenLength(int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.u7(3126395571038685253L, this, i);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 3126395571038685253L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 65223786292802640L)
    public int gn(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(949888561129309815L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 949888561129309815L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1789370465331502359L)
    public boolean hasAttrDAIndex(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2729447609878128524L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2729447609878128524L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3173786247294494593L)
    public boolean hasAttrTarget(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2201429232739331360L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2201429232739331360L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2982297684693708576L)
    public boolean hasAttrType(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-442115700279919193L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -442115700279919193L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2740812358208065267L)
    public boolean hasAttrValue(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(150423251411303764L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 150423251411303764L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 6830655436345714896L)
    public boolean hasAttrVariableSlot(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(5027856787547992789L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 5027856787547992789L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3009519132553369253L)
    public boolean isArguments(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-435702011576093904L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -435702011576093904L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -33578697188072068L)
    public boolean isBlock(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-6446017785937542981L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -6446017785937542981L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 65858509852308949L)
    public boolean isBooleanLiteral(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2930982065044533040L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2930982065044533040L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3704172240168178368L)
    public boolean isChangedExpressionNode(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(30416083216129537L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 30416083216129537L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1952732141615601255L)
    public boolean isClassBody(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(102850581749131216L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 102850581749131216L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3476726221898569893L)
    public boolean isClassDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(826401371126901976L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 826401371126901976L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2900430568636780101L)
    public boolean isComment(int i) {
        try {
            if (j6) {
                iy.u7(2301181987453122600L, this, i);
            }
            return i == 2 || i == 1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2301181987453122600L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 2719103760478183907L)
    public boolean isDocComment(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2205505791007395840L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2205505791007395840L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 1711315847427476825L)
    public boolean isExpression(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2084870221396674228L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2084870221396674228L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 7256849711471602935L)
    public boolean isFieldDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-2954925704170285568L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -2954925704170285568L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1241030079040947696L)
    public boolean isIdentifier(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(1105183795537446011L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1105183795537446011L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1440112084851894560L)
    public boolean isLiteral(int i) {
        try {
            if (j6) {
                iy.u7(578863961927455479L, this, i);
            }
            return i == 2 || i == 1;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 578863961927455479L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -1653950772505401899L)
    public boolean isMemberDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-1807505368435938984L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1807505368435938984L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -6581534407983207828L)
    public boolean isMethodDeclaration(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-5785074416614562293L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -5785074416614562293L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2848441510915813720L)
    public boolean isOperator(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(1203749607411207945L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1203749607411207945L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 631398164894993259L)
    public boolean isParameters(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2320334389590401736L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2320334389590401736L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4278972830228819459L)
    public boolean isSeparator(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(345814078273079600L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 345814078273079600L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -84932856862864373L)
    public boolean isToken(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(-3113510138685803688L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3113510138685803688L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -2396640533171083084L)
    public boolean isTypeIdentifier(int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.u7(2201406904766966301L, this, i);
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 2201406904766966301L, this, new Integer(i));
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    @abcd.ey(method = 3870548987972249095L)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String jJ(java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aide.codemodel.language.js.JavaScriptCommentsSyntax.jJ(java.lang.String):java.lang.String");
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -3114997346236229025L)
    public int lg(SyntaxTree syntaxTree) {
        try {
            if (!j6) {
                return 0;
            }
            iy.tp(1126890027517376488L, this, syntaxTree);
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, 1126890027517376488L, this, syntaxTree);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 917705637934391913L)
    public int ro(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(1281621053082910536L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 1281621053082910536L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -926891020447823325L)
    public String sh(SyntaxTree syntaxTree, int i) {
        try {
            if (j6) {
                iy.EQ(4877957382361496840L, this, syntaxTree, new Integer(i));
            }
            return jJ(cb(syntaxTree, i));
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 4877957382361496840L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 513928477153058560L)
    public boolean tp(int i) {
        try {
            if (j6) {
                iy.u7(-1413061531294818367L, this, i);
            }
            return i < 10;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -1413061531294818367L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4838993368160351565L)
    public int vy(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(-494296392240163592L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -494296392240163592L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = 4505328914432678125L)
    public int we(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return 0;
            }
            iy.EQ(3422348256037488128L, this, syntaxTree, new Integer(i));
            return 0;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, 3422348256037488128L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -963911735782987281L)
    public boolean x9(SyntaxTree syntaxTree, int i) {
        try {
            if (!j6) {
                return false;
            }
            iy.EQ(-1497100060189650800L, this, syntaxTree, new Integer(i));
            return false;
        } catch (Throwable th) {
            if (DW) {
                iy.Mr(th, -1497100060189650800L, this, syntaxTree, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Syntax
    @ey(method = -607034114711790648L)
    public boolean yS(int i) {
        try {
            if (j6) {
                iy.u7(-3247020993159062469L, this, i);
            }
            return i == 2;
        } catch (Throwable th) {
            if (DW) {
                iy.j3(th, -3247020993159062469L, this, new Integer(i));
            }
            throw th;
        }
    }
}
