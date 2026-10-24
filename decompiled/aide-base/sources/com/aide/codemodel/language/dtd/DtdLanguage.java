package com.aide.codemodel.language.dtd;

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
import com.aide.codemodel.api.abstraction.Tools;
import com.aide.codemodel.api.abstraction.TypeSystem;
import java.util.Collections;
import java.util.Set;

@cy(clazz = 3138827421715518960L, container = 3138827421715518960L, user = true)
/* loaded from: classes.dex */
public class DtdLanguage implements Language {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = -397860353081080652L)
    private DtdSyntax DW;

    @dy(field = -284395053749204352L)
    private final Model j6;

    static {
        iy.Zo(DtdLanguage.class);
    }

    @ey(method = -598184640469706121L)
    public DtdLanguage(Model model) {
        try {
            if (FH) {
                iy.tp(413698258020571860L, null, model);
            }
            this.j6 = model;
            this.DW = new DtdSyntax();
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 413698258020571860L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 52055142044915331L)
    /* renamed from: EQ, reason: merged with bridge method [inline-methods] */
    public DtdSyntax getSyntax() {
        try {
            if (FH) {
                iy.gn(-512935594214818824L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -512935594214818824L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 6011799054388549305L)
    public CodeAnalyzer getCodeAnalyzer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-2001116633402956992L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2001116633402956992L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -1220266617432780237L)
    public CodeRenderer getCodeRenderer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-1609733902566892168L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1609733902566892168L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3885638416313574316L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (FH) {
                iy.gn(598076307940471111L, this);
            }
            return Collections.EMPTY_SET;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 598076307940471111L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3776554090179207468L)
    public String getName() {
        try {
            if (!FH) {
                return "DTD";
            }
            iy.gn(-2505314705990157475L, this);
            return "DTD";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -2505314705990157475L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -7253059208536713252L)
    public SignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-105061909070786213L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -105061909070786213L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3125741889008420957L)
    public Tools getTools() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(16160904132727296L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 16160904132727296L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -1924947486170364747L)
    public TypeSystem getTypeSystem() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-880001907288079884L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -880001907288079884L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3126642753590577L)
    public boolean isParenChar(char c) {
        try {
            if (!FH) {
                return false;
            }
            iy.tp(1740780060682787712L, this, new Character(c));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, 1740780060682787712L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2935469184960617605L)
    public void shrink() {
        try {
            if (FH) {
                iy.gn(1422307630829555624L, this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1422307630829555624L, this);
            }
            throw th;
        }
    }
}
