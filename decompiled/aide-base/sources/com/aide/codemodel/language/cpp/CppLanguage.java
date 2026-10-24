package com.aide.codemodel.language.cpp;

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

@cy(clazz = -1856623386339719424L, container = -1856623386339719424L, user = true)
/* loaded from: classes.dex */
public class CppLanguage implements Language {

    @fy
    private static /* synthetic */ boolean FH;

    @gy
    private static /* synthetic */ boolean Hw;

    @dy(field = 2906845459718681632L)
    private CppSyntax DW;

    @dy(field = -3048656152696236600L)
    private CppTools j6;

    static {
        iy.Zo(CppLanguage.class);
    }

    @ey(method = -13035996999260235L)
    public CppLanguage(Model model) {
        try {
            if (FH) {
                iy.tp(-1227650634163115325L, null, model);
            }
            if (model != null) {
                this.DW = new CppSyntax(model);
                this.j6 = new CppTools(model);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -1227650634163115325L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1535733991890607611L)
    public CodeAnalyzer getCodeAnalyzer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-3118980514884393820L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -3118980514884393820L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 389039435916029925L)
    public CodeRenderer getCodeRenderer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(1849720156644266280L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1849720156644266280L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3555972696935781912L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(1078556933895314115L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1078556933895314115L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3264696166971230248L)
    public String getName() {
        try {
            if (!FH) {
                return "C++";
            }
            iy.gn(-811209146547745559L, this);
            return "C++";
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -811209146547745559L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 5293437731447701576L)
    public SignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(-4694718912336744129L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -4694718912336744129L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 3207939894719602805L)
    public Syntax getSyntax() {
        try {
            if (FH) {
                iy.gn(1904703572474488456L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 1904703572474488456L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1135127982683112985L)
    public Tools getTools() {
        try {
            if (FH) {
                iy.gn(90175178748699892L, this);
            }
            return this.j6;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 90175178748699892L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -1483304832163633821L)
    public TypeSystem getTypeSystem() {
        try {
            if (!FH) {
                return null;
            }
            iy.gn(914877768239626816L, this);
            return null;
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, 914877768239626816L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 50601335949096777L)
    public boolean isParenChar(char c) {
        try {
            if (!FH) {
                return false;
            }
            iy.tp(-5284614042366971080L, this, new Character(c));
            return false;
        } catch (Throwable th) {
            if (Hw) {
                iy.j3(th, -5284614042366971080L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -730938588765551533L)
    public void shrink() {
        try {
            if (FH) {
                iy.gn(-1067379317565800760L, this);
            }
        } catch (Throwable th) {
            if (Hw) {
                iy.aM(th, -1067379317565800760L, this);
            }
            throw th;
        }
    }
}
