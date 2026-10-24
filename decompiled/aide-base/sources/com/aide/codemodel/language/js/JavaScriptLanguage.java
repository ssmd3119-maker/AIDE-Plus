package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import abcd.z6;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.abstraction.CodeAnalyzer;
import com.aide.codemodel.api.abstraction.CodeRenderer;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.SignatureAnalyzer;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.abstraction.TypeSystem;
import java.util.Set;

@cy(clazz = 4430136534252721644L, container = 4430136534252721644L, user = true)
/* loaded from: classes.dex */
public class JavaScriptLanguage implements Language {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = -2185689098642681401L)
    private JavaScriptSyntax DW;

    @dy(field = -234485428486754965L)
    private JavaScriptTools FH;

    @dy(field = -2626025116910507052L)
    private z6 Hw;

    @dy(field = 3733230302571292119L)
    private JavaScriptCodeRenderer VH;

    @dy(field = 6735317469674465424L)
    private JavaScriptSignatureAnalyzer Zo;

    @dy(field = -518239173855139659L)
    private final Model j6;

    @dy(field = -2619632579650089003L)
    private JavaScriptTypeSystem v5;

    static {
        iy.Zo(JavaScriptLanguage.class);
    }

    @ey(method = 327295774272836088L)
    public JavaScriptLanguage(Model model) {
        try {
            if (gn) {
                iy.tp(-4855292529672477348L, null, model);
            }
            this.j6 = model;
            if (model != null) {
                this.DW = new JavaScriptSyntax(model.identifierSpace);
                this.FH = new JavaScriptTools(model, this);
                this.Hw = new z6(model, this);
                this.v5 = new JavaScriptTypeSystem(model, this);
                this.Zo = new JavaScriptSignatureAnalyzer(model, this);
                this.VH = new JavaScriptCodeRenderer(model);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -4855292529672477348L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -4659456109193108184L)
    public CodeAnalyzer getCodeAnalyzer() {
        try {
            if (gn) {
                iy.gn(-3282054556128496837L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -3282054556128496837L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -4608740523815655276L)
    public CodeRenderer getCodeRenderer() {
        try {
            if (gn) {
                iy.gn(-2513460368853692163L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -2513460368853692163L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1621192966200025857L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (gn) {
                iy.gn(1571981657322048192L, this);
            }
            return JavaScriptFormatterOption.j6();
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1571981657322048192L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 11880316667474499L)
    public String getName() {
        try {
            if (!gn) {
                return "JavaScript";
            }
            iy.gn(3187580527702489712L, this);
            return "JavaScript";
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 3187580527702489712L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3188473637977799595L)
    public SignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (gn) {
                iy.gn(-7068291531791192496L, this);
            }
            return this.Zo;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -7068291531791192496L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3835354876320084492L)
    public Syntax getSyntax() {
        try {
            if (gn) {
                iy.gn(-1904658235383760819L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -1904658235383760819L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2925800210756752392L)
    public Tools getTools() {
        try {
            if (gn) {
                iy.gn(860787658420706665L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 860787658420706665L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1817501982037195992L)
    public TypeSystem getTypeSystem() {
        try {
            if (gn) {
                iy.gn(4852801043142786339L, this);
            }
            return this.v5;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 4852801043142786339L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -2310631468991220L)
    public boolean isParenChar(char c) {
        try {
            if (gn) {
                iy.tp(3131450400730718353L, this, new Character(c));
            }
            return c == '(' || c == '[' || c == '{' || c == '}' || c == ':' || c == ';';
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, 3131450400730718353L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 842853548244491196L)
    public void shrink() {
        try {
            if (gn) {
                iy.gn(1381802062228001499L, this);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1381802062228001499L, this);
            }
            throw th;
        }
    }
}
