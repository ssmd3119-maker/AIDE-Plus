package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.Syntax;
import com.aide.codemodel.api.abstraction.Tools;
import java.util.Set;

@cy(clazz = 2166280278353957520L, container = 2166280278353957520L, user = true)
/* loaded from: classes.dex */
public class JavaLanguage implements Language {

    @fy
    private static /* synthetic */ boolean gn;

    @gy
    private static /* synthetic */ boolean u7;

    @dy(field = 2883269187097433680L)
    private JavaSyntax DW;

    @dy(field = -2861109599989754313L)
    private JavaSignatureAnalyzer FH;

    @dy(field = 2053542101440899849L)
    private JavaCodeAnalyzer Hw;

    @dy(field = 2180640830707088004L)
    private JavaTools VH;

    @dy(field = 627063938697012144L)
    private JavaCodeRenderer Zo;

    @dy(field = 1873951929037625800L)
    private final Model j6;

    @dy(field = -2595889838730865440L)
    private JavaTypeSystem v5;

    static {
        iy.Zo(JavaLanguage.class);
    }

    @ey(method = -557568291183586035L)
    public JavaLanguage(Model model) {
        try {
            if (gn) {
                iy.tp(-894010246938553088L, null, model);
            }
            this.j6 = model;
            if (model != null) {
                this.DW = new JavaSyntax(model.identifierSpace);
                this.v5 = new JavaTypeSystem(model, this);
                this.Hw = new JavaCodeAnalyzer(model, this);
                this.FH = new JavaSignatureAnalyzer(model, this);
                this.Zo = new JavaCodeRenderer(model, this);
                this.VH = new JavaTools(model, this);
            }
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -894010246938553088L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1111675415888532067L)
    public JavaCodeAnalyzer getCodeAnalyzer() {
        try {
            if (gn) {
                iy.gn(-911624629596072000L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -911624629596072000L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 4106565106655893200L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (gn) {
                iy.gn(-1059016885983563665L, this);
            }
            return JavaFormatOption.j6();
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -1059016885983563665L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -642837168574049280L)
    public String getName() {
        try {
            if (!gn) {
                return "Java";
            }
            iy.gn(1905541352197199605L, this);
            return "Java";
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1905541352197199605L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3417457269453058560L)
    public JavaSignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (gn) {
                iy.gn(-506176800683687229L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -506176800683687229L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3932567337046816811L)
    public Syntax getSyntax() {
        try {
            if (gn) {
                iy.gn(1229698368184262760L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1229698368184262760L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -1122672584332267551L)
    public Tools getTools() {
        try {
            if (gn) {
                iy.gn(1637246063650525440L, this);
            }
            return this.VH;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 1637246063650525440L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1211911753487066235L)
    public JavaTypeSystem getTypeSystem() {
        try {
            if (gn) {
                iy.gn(3574399832392212324L, this);
            }
            return this.v5;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 3574399832392212324L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -103786195244219527L)
    public boolean isParenChar(char c) {
        try {
            if (gn) {
                iy.tp(-5582079606867667344L, this, new Character(c));
            }
            return c == '(' || c == '[' || c == '{' || c == '}' || c == ':' || c == ';';
        } catch (Throwable th) {
            if (u7) {
                iy.j3(th, -5582079606867667344L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -785614881466626861L)
    public void shrink() {
        try {
            if (gn) {
                iy.gn(592320781644779000L, this);
            }
            this.FH.er();
            this.Hw.lg();
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, 592320781644779000L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3801676756487361915L)
    /* renamed from: we, reason: merged with bridge method [inline-methods] */
    public JavaCodeRenderer getCodeRenderer() {
        try {
            if (gn) {
                iy.gn(-752108977776367256L, this);
            }
            return this.Zo;
        } catch (Throwable th) {
            if (u7) {
                iy.aM(th, -752108977776367256L, this);
            }
            throw th;
        }
    }
}
