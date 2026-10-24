package groovyjarjarantlr;

import groovyjarjarantlr.collections.AST;
import groovyjarjarantlr.collections.impl.ASTArray;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class ASTFactory {
    static /* synthetic */ Class FH;
    protected Class j6 = null;
    protected Hashtable DW = null;

    public ASTFactory() {
    }

    static /* synthetic */ Class DW(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public Class EQ(int i) {
        Class cls;
        Hashtable hashtable = this.DW;
        if (hashtable != null && (cls = (Class) hashtable.get(new Integer(i))) != null) {
            return cls;
        }
        Class cls2 = this.j6;
        if (cls2 != null) {
            return cls2;
        }
        Class cls3 = FH;
        if (cls3 != null) {
            return cls3;
        }
        Class clsDW = DW("groovyjarjarantlr.CommonAST");
        FH = clsDW;
        return clsDW;
    }

    public AST FH(int i) {
        AST astZo = Zo(EQ(i));
        if (astZo != null) {
            astZo.a8(i, "");
        }
        return astZo;
    }

    public AST Hw(int i, String str) {
        AST astFH = FH(i);
        if (astFH != null) {
            astFH.a8(i, str);
        }
        return astFH;
    }

    public AST J0(AST[] astArr) {
        AST nextSibling;
        AST nextSibling2;
        AST ast;
        AST ast2 = null;
        if (astArr == null || astArr.length == 0) {
            return null;
        }
        AST ast3 = astArr[0];
        if (ast3 != null) {
            ast3.U2(null);
        }
        for (int i = 1; i < astArr.length; i++) {
            if (astArr[i] != null) {
                if (ast3 == null) {
                    nextSibling2 = astArr[i];
                    ast = nextSibling2;
                } else {
                    if (ast2 == null) {
                        ast3.U2(astArr[i]);
                        nextSibling = ast3.getFirstChild();
                    } else {
                        ast2.tp(astArr[i]);
                        nextSibling = ast2.getNextSibling();
                    }
                    AST ast4 = ast3;
                    nextSibling2 = nextSibling;
                    ast = ast4;
                }
                while (nextSibling2.getNextSibling() != null) {
                    nextSibling2 = nextSibling2.getNextSibling();
                }
                AST ast5 = nextSibling2;
                ast3 = ast;
                ast2 = ast5;
            }
        }
        return ast3;
    }

    public void J8(ASTPair aSTPair, AST ast) {
        if (ast != null) {
            ast.we(aSTPair.j6);
            aSTPair.DW = aSTPair.j6;
            aSTPair.j6();
            aSTPair.j6 = ast;
        }
    }

    public void QX(Hashtable hashtable) {
        this.DW = hashtable;
    }

    public AST VH(AST ast) {
        if (ast == null) {
            return null;
        }
        AST astZo = Zo(ast.getClass());
        astZo.aM(ast);
        return astZo;
    }

    public void Ws(Class cls) {
        if (cls != null) {
            this.j6 = cls;
            cls.getName();
        }
    }

    protected AST Zo(Class cls) {
        try {
            return (AST) cls.newInstance();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't create AST Node ");
            stringBuffer.append(cls.getName());
            tp(stringBuffer.toString());
            return null;
        }
    }

    public AST gn(AST ast) {
        AST astU7 = u7(ast);
        AST nextSibling = astU7;
        while (ast != null) {
            ast = ast.getNextSibling();
            nextSibling.tp(u7(ast));
            nextSibling = nextSibling.getNextSibling();
        }
        return astU7;
    }

    public void j6(ASTPair aSTPair, AST ast) {
        if (ast != null) {
            AST ast2 = aSTPair.j6;
            if (ast2 == null) {
                aSTPair.j6 = ast;
            } else {
                AST ast3 = aSTPair.DW;
                if (ast3 == null) {
                    ast2.U2(ast);
                } else {
                    ast3.tp(ast);
                }
            }
            aSTPair.DW = ast;
            aSTPair.j6();
        }
    }

    public void tp(String str) {
        System.err.println(str);
    }

    public AST u7(AST ast) {
        AST astVH = VH(ast);
        if (ast != null) {
            astVH.U2(gn(ast.getFirstChild()));
        }
        return astVH;
    }

    public AST v5(Token token) {
        AST astFH = FH(token.Hw());
        if (astFH != null) {
            astFH.J0(token);
        }
        return astFH;
    }

    public AST we(ASTArray aSTArray) {
        return J0(aSTArray.DW);
    }

    public ASTFactory(Hashtable hashtable) {
        QX(hashtable);
    }
}
