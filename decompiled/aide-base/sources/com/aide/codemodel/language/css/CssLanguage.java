package com.aide.codemodel.language.css;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.abstraction.CodeRenderer;
import com.aide.codemodel.api.abstraction.FormatOption;
import com.aide.codemodel.api.abstraction.Language;
import com.aide.codemodel.api.abstraction.SignatureAnalyzer;
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.abstraction.TypeSystem;
import java.util.Collections;
import java.util.Set;

@cy(clazz = 700547958617676672L, container = 700547958617676672L, user = true)
/* loaded from: classes.dex */
public class CssLanguage implements Language {

    @gy
    private static /* synthetic */ boolean Zo;

    @fy
    private static /* synthetic */ boolean v5;

    @dy(field = -2423326083098235103L)
    private final CssCodeAnalyzer DW;

    @dy(field = -2083535674210300347L)
    private final Model FH;

    @dy(field = -1785322684146253117L)
    private final CssTools Hw;

    @dy(field = 2929462595888701863L)
    private final CssSyntax j6;

    static {
        iy.Zo(CssLanguage.class);
    }

    @ey(method = -881282628974894720L)
    public CssLanguage(Model model) {
        try {
            if (v5) {
                iy.tp(-580460903507289005L, null, model);
            }
            this.FH = model;
            this.j6 = new CssSyntax();
            this.DW = new CssCodeAnalyzer(model, this);
            this.Hw = new CssTools(model);
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, -580460903507289005L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -5309897903377818432L)
    /* renamed from: EQ, reason: merged with bridge method [inline-methods] */
    public CssCodeAnalyzer getCodeAnalyzer() {
        try {
            if (v5) {
                iy.gn(-4617027133675150632L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -4617027133675150632L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 3587133335880038616L)
    public CodeRenderer getCodeRenderer() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(-3909093320181953820L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -3909093320181953820L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1049295567849575095L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (v5) {
                iy.gn(2891218224983434137L, this);
            }
            return Collections.EMPTY_SET;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 2891218224983434137L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 517769897984129517L)
    public String getName() {
        try {
            if (!v5) {
                return "CSS";
            }
            iy.gn(-3168350012527758581L, this);
            return "CSS";
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -3168350012527758581L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 3123731305716265419L)
    public SignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(5788890737847301965L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 5788890737847301965L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1880845844852228096L)
    public Tools getTools() {
        try {
            if (v5) {
                iy.gn(-2969575315978190920L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -2969575315978190920L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2420756396691424404L)
    public TypeSystem getTypeSystem() {
        try {
            if (!v5) {
                return null;
            }
            iy.gn(-1616986399013227688L, this);
            return null;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -1616986399013227688L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -396970931255787424L)
    public boolean isParenChar(char c) {
        try {
            if (!v5) {
                return false;
            }
            iy.tp(5703806793448739324L, this, new Character(c));
            return false;
        } catch (Throwable th) {
            if (Zo) {
                iy.j3(th, 5703806793448739324L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -822975669030329144L)
    public void shrink() {
        try {
            if (v5) {
                iy.gn(2733657350091764460L, this);
            }
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, 2733657350091764460L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -655187350760842152L)
    /* renamed from: we, reason: merged with bridge method [inline-methods] */
    public CssSyntax getSyntax() {
        try {
            if (v5) {
                iy.gn(-751408350120036284L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (Zo) {
                iy.aM(th, -751408350120036284L, this);
            }
            throw th;
        }
    }
}
