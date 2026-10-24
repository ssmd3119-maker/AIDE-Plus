package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
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

@cy(clazz = 481641944393818713L, container = 481641944393818713L, user = true)
/* loaded from: classes.dex */
public class JavaScriptCommentsLanguage implements Language {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 2459204103940561696L)
    private JavaScriptCommentsTools DW;

    @dy(field = 3207732084250330172L)
    private JavaScriptCommentsSyntax j6;

    static {
        iy.Zo(JavaScriptCommentsLanguage.class);
    }

    @ey(method = -352283289134054707L)
    public JavaScriptCommentsLanguage(Model model) {
        try {
            if (FH) {
                iy.tp(555426001475073091L, null, model);
            }
            if (model != null) {
                this.j6 = new JavaScriptCommentsSyntax();
                this.DW = new JavaScriptCommentsTools(model, this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 555426001475073091L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -2327136337772002045L)
    public CodeAnalyzer getCodeAnalyzer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(4748252108593076523L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 4748252108593076523L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -989180797989912191L)
    public CodeRenderer getCodeRenderer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-1969608259365340895L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1969608259365340895L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -659352311511926160L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(2813515040122593448L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2813515040122593448L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2155380780942046152L)
    public String getName() {
        try {
            if (!FH) {
                return "JavaScript Comments";
            }
            iy.gn(1316425400137246560L, this);
            return "JavaScript Comments";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1316425400137246560L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 6089396485955247208L)
    public SignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(498883554853573168L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 498883554853573168L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2722784667241329457L)
    public Syntax getSyntax() {
        try {
            if (FH) {
                iy.gn(1475957013738852241L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1475957013738852241L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2591070752919048633L)
    public Tools getTools() {
        try {
            if (FH) {
                iy.gn(-2467797698429635455L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2467797698429635455L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 3962626894980290979L)
    public TypeSystem getTypeSystem() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(2907196996399923995L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 2907196996399923995L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -4624508413555356067L)
    public boolean isParenChar(char c) {
        try {
            if (!FH) {
                return false;
            }
            iy.tp(4613575844337271501L, this, new Character(c));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 4613575844337271501L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -375886814905849625L)
    public void shrink() {
        try {
            if (FH) {
                iy.gn(-2555153661896164505L, this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2555153661896164505L, this);
            }
            throw th;
        }
    }
}
