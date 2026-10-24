package com.aide.ui.util;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import groovyjarjarantlr.collections.AST;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.antlr.SourceBuffer;
import org.codehaus.groovy.antlr.UnicodeEscapingReader;
import org.codehaus.groovy.antlr.parser.GroovyLexer;
import org.codehaus.groovy.antlr.parser.GroovyRecognizer;

@cy(clazz = 1192328487832346865L, container = 1192328487832346865L, user = true)
/* loaded from: classes.dex */
public class BuildGradleExt extends Configuration<BuildGradleExt> {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 3806340903412462041L)
    private String VH;

    @dy(field = 425176550613499755L)
    private Map<String, String> Zo;

    static {
        iy.Zo(BuildGradleExt.class);
    }

    @ey(method = 2901505538324900841L)
    public BuildGradleExt() {
        try {
            if (gn) {
                iy.gn(-5623606061695898640L, null);
            }
            this.Zo = new HashMap();
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -5623606061695898640L, null);
            }
            throw th;
        }
    }

    @ey(method = 1331582724053054316L)
    private boolean EQ(AST ast, String str) {
        try {
            if (gn) {
                iy.EQ(57701430401166981L, this, ast, str);
            }
            if (tp(ast) == 90) {
                if (str.equals(u7(gn(Zo(ast))))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, 57701430401166981L, this, ast, str);
            }
            throw th;
        }
    }

    @ey(method = -8462760283172378897L)
    private AST FH(AST ast) {
        try {
            if (gn) {
                iy.tp(3294367880299303500L, this, ast);
            }
            return Zo(ast);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3294367880299303500L, this, ast);
            }
            throw th;
        }
    }

    @ey(method = 3254572278058039848L)
    private AST Hw(AST ast) {
        try {
            if (gn) {
                iy.tp(-2080700230216330875L, this, ast);
            }
            return Zo(Zo(ast));
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -2080700230216330875L, this, ast);
            }
            throw th;
        }
    }

    @ey(method = -3418343510291164377L)
    private boolean J0(AST ast, String str) {
        try {
            if (gn) {
                iy.EQ(-3059053721580552000L, this, ast, str);
            }
            if (tp(ast) == 27) {
                if (str.equals(u7(Zo(ast)))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -3059053721580552000L, this, ast, str);
            }
            throw th;
        }
    }

    @ey(method = -539477408971392457L)
    private String VH(AST ast) {
        try {
            if (gn) {
                iy.tp(-901732505205153720L, this, ast);
            }
            return u7(Zo(Zo(gn(Zo(ast)))));
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -901732505205153720L, this, ast);
            }
            throw th;
        }
    }

    @ey(method = -1352041437802818368L)
    private static AST Zo(AST ast) {
        try {
            if (gn) {
                iy.tp(2988972869782538963L, null, ast);
            }
            if (ast == null) {
                return null;
            }
            return ast.getFirstChild();
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2988972869782538963L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = -2612544466247053085L)
    private static AST gn(AST ast) {
        try {
            if (gn) {
                iy.tp(1285556629511390880L, null, ast);
            }
            if (ast == null) {
                return null;
            }
            return ast.getNextSibling();
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 1285556629511390880L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = -170711602569228828L)
    private static int tp(AST ast) {
        try {
            if (gn) {
                iy.tp(2181191008479864851L, null, ast);
            }
            if (ast == null) {
                return 0;
            }
            return ast.getType();
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2181191008479864851L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = 379813616893675195L)
    private static String u7(AST ast) {
        try {
            if (gn) {
                iy.tp(-7790228710093189548L, null, ast);
            }
            if (ast == null) {
                return null;
            }
            return ast.getText();
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7790228710093189548L, null, ast);
            }
            throw th;
        }
    }

    @ey(method = 3570724238097962729L)
    private AST v5(AST ast) {
        try {
            if (gn) {
                iy.tp(2271609172176005376L, this, ast);
            }
            return gn(Zo(Zo(ast)));
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 2271609172176005376L, this, ast);
            }
            throw th;
        }
    }

    @ey(method = -3385575969209798061L)
    private boolean we(AST ast) {
        try {
            if (gn) {
                iy.tp(1402892720951227968L, this, ast);
            }
            if (tp(ast) == 28) {
                if (tp(Zo(ast)) == 124) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 1402892720951227968L, this, ast);
            }
            throw th;
        }
    }

    @Override // com.aide.ui.util.Configuration
    @ey(method = 203511765932832516L)
    /* renamed from: J8, reason: merged with bridge method [inline-methods] */
    public BuildGradleExt makeConfiguration(String str) {
        try {
            if (gn) {
                iy.tp(-7542262609872700637L, this, str);
            }
            return new BuildGradleExt(str);
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -7542262609872700637L, this, str);
            }
            throw th;
        }
    }

    @ey(method = -993573303882931485L)
    public String Ws(String str, String str2) {
        try {
            if (gn) {
                iy.EQ(-906561065429056892L, this, str, str2);
            }
            if (str2 == null) {
                return null;
            }
            return this.Zo.containsKey(str2) ? FileSystem.Qq(this.VH, this.Zo.get(str2)) : FileSystem.Qq(str, str2.replace(":", "/"));
        } catch (Throwable th) {
            if (u7) {
                iy.Mr(th, -906561065429056892L, this, str, str2);
            }
            throw th;
        }
    }

    @ey(method = -20000246264357045L)
    private BuildGradleExt(String str) {
        try {
            if (gn) {
                iy.tp(6893873132735030784L, null, str);
            }
            this.Zo = new HashMap();
            try {
                this.VH = FileSystem.getParent(str);
                FileReader fileReader = new FileReader(str);
                SourceBuffer sourceBuffer = new SourceBuffer();
                UnicodeEscapingReader unicodeEscapingReader = new UnicodeEscapingReader(fileReader, sourceBuffer);
                GroovyLexer groovyLexer = new GroovyLexer(unicodeEscapingReader);
                unicodeEscapingReader.setLexer(groovyLexer);
                GroovyRecognizer groovyRecognizerMake = GroovyRecognizer.make(groovyLexer);
                groovyRecognizerMake.setSourceBuffer(sourceBuffer);
                groovyRecognizerMake.compilationUnit();
                fileReader.close();
                for (AST ast = groovyRecognizerMake.getAST(); ast != null; ast = ast.getNextSibling()) {
                    if (we(ast)) {
                        AST astHw = Hw(ast);
                        AST astV5 = v5(ast);
                        if (EQ(astHw, "projectDir") && J0(FH(astHw), "project") && J0(astV5, "file")) {
                            String strVH = VH(FH(astHw));
                            String strVH2 = VH(astV5);
                            if (strVH != null && strVH2 != null) {
                                this.Zo.put(strVH, strVH2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 6893873132735030784L, null, str);
            }
            throw th;
        }
    }
}
