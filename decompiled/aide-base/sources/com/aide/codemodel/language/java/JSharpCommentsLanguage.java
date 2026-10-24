package com.aide.codemodel.language.java;

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

@cy(clazz = 178719302130280569L, container = 178719302130280569L, user = true)
/* loaded from: classes.dex */
public class JSharpCommentsLanguage implements Language {

    @fy
    private static /* synthetic */ boolean Hw;

    @gy
    private static /* synthetic */ boolean v5;

    @dy(field = 2723815625806541043L)
    private JSharpCommentsSyntax DW;

    @dy(field = -2268188254585557733L)
    private JSharpCommentsTools FH;

    @dy(field = 2020565206189612776L)
    private final boolean j6;

    static {
        iy.Zo(JSharpCommentsLanguage.class);
    }

    @ey(method = -61926182197801911L)
    public JSharpCommentsLanguage(Model model, boolean z) {
        try {
            if (Hw) {
                iy.EQ(1025912345155296777L, null, model, new Boolean(z));
            }
            this.j6 = z;
            if (model != null) {
                this.DW = new JSharpCommentsSyntax();
                this.FH = new JSharpCommentsTools(model, this);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.Mr(th, 1025912345155296777L, null, model, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -1634190190428325192L)
    public CodeAnalyzer getCodeAnalyzer() {
        try {
            if (!Hw) {
                return null;
            }
            iy.gn(296705921269087583L, this);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 296705921269087583L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 3328573456523597984L)
    public CodeRenderer getCodeRenderer() {
        try {
            if (!Hw) {
                return null;
            }
            iy.gn(2524302867153751509L, this);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2524302867153751509L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1257106557471470801L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (Hw) {
                iy.gn(-268602380323527432L, this);
            }
            return JavaFormatterOption.j6();
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -268602380323527432L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -4574251777223392485L)
    public String getName() {
        try {
            if (Hw) {
                iy.gn(-3956217786338996512L, this);
            }
            return this.j6 ? "J# Comments" : "Java Comments";
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -3956217786338996512L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 1247718075273595693L)
    public SignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (!Hw) {
                return null;
            }
            iy.gn(2519660633357653968L, this);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 2519660633357653968L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2463815691950268256L)
    public Syntax getSyntax() {
        try {
            if (Hw) {
                iy.gn(-2385163423968066875L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2385163423968066875L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -394280447121559632L)
    public Tools getTools() {
        try {
            if (Hw) {
                iy.gn(3104735942800409437L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 3104735942800409437L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -2800623506525553936L)
    public TypeSystem getTypeSystem() {
        try {
            if (!Hw) {
                return null;
            }
            iy.gn(-2432929770234921705L, this);
            return null;
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, -2432929770234921705L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -86007743215598784L)
    public boolean isParenChar(char c) {
        try {
            if (!Hw) {
                return false;
            }
            iy.tp(7691740960245549937L, this, new Character(c));
            return false;
        } catch (Throwable th) {
            if (v5) {
                iy.j3(th, 7691740960245549937L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -922229880895839168L)
    public void shrink() {
        try {
            if (Hw) {
                iy.gn(25043731050474291L, this);
            }
        } catch (Throwable th) {
            if (v5) {
                iy.aM(th, 25043731050474291L, this);
            }
            throw th;
        }
    }
}
