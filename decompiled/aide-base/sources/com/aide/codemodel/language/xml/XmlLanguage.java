package com.aide.codemodel.language.xml;

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

@cy(clazz = -1957371284074585680L, container = -1957371284074585680L, user = true)
/* loaded from: classes.dex */
public class XmlLanguage implements Language {

    @gy
    private static /* synthetic */ boolean VH;

    @fy
    private static /* synthetic */ boolean Zo;

    @dy(field = 315564050177334080L)
    private XmlSyntax DW;

    @dy(field = -2920542277997228352L)
    private XmlTools FH;

    @dy(field = -4895503955118989688L)
    private XmlCodeAnalyzer Hw;

    @dy(field = 2894109400393130388L)
    private final Model j6;

    @dy(field = -3824531009358760068L)
    private boolean v5;

    static {
        iy.Zo(XmlLanguage.class);
    }

    @ey(method = 56670166752920064L)
    public XmlLanguage(Model model, boolean z) {
        try {
            if (Zo) {
                iy.EQ(384213831425048880L, null, model, new Boolean(z));
            }
            this.j6 = model;
            this.v5 = z;
            if (model != null) {
                this.Hw = new XmlCodeAnalyzer(model.errorTable, model.identifierSpace);
                this.DW = new XmlSyntax();
                this.FH = new XmlTools(model, this, z);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.Mr(th, 384213831425048880L, null, model, new Boolean(z));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -2859878063728688645L)
    public CodeAnalyzer getCodeAnalyzer() {
        try {
            if (Zo) {
                iy.gn(-5176668583767598524L, this);
            }
            return this.Hw;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -5176668583767598524L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -479543697529046691L)
    public CodeRenderer getCodeRenderer() {
        try {
            if (!Zo) {
                return null;
            }
            iy.gn(2851540948429589864L, this);
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2851540948429589864L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -345105189925656160L)
    public Set<? extends FormatOption> getFormatOptionSet() {
        try {
            if (Zo) {
                iy.gn(-1231519738652191213L, this);
            }
            return XmlFormatterOption.j6(this.v5);
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -1231519738652191213L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 779508938666427344L)
    public String getName() {
        try {
            if (Zo) {
                iy.gn(5227459816673955353L, this);
            }
            return this.v5 ? "XML" : "HTML";
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 5227459816673955353L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2245410132789317232L)
    public SignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (!Zo) {
                return null;
            }
            iy.gn(2727186748512872975L, this);
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 2727186748512872975L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -437917291691975251L)
    public Syntax getSyntax() {
        try {
            if (Zo) {
                iy.gn(-3092297761951429176L, this);
            }
            return this.DW;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3092297761951429176L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -2229937963804430743L)
    public Tools getTools() {
        try {
            if (Zo) {
                iy.gn(-3155527181087659948L, this);
            }
            return this.FH;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3155527181087659948L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = 2590181929722285027L)
    public TypeSystem getTypeSystem() {
        try {
            if (!Zo) {
                return null;
            }
            iy.gn(-3643167168278886528L, this);
            return null;
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, -3643167168278886528L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -2500765636560873935L)
    public boolean isParenChar(char c) {
        try {
            if (Zo) {
                iy.tp(3996527739877554552L, this, new Character(c));
            }
            return c == '>' || c == '%' || c == '/';
        } catch (Throwable th) {
            if (VH) {
                iy.j3(th, 3996527739877554552L, this, new Character(c));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.Language
    @ey(method = -3322262255144448005L)
    public void shrink() {
        try {
            if (Zo) {
                iy.gn(1227433886118425608L, this);
            }
        } catch (Throwable th) {
            if (VH) {
                iy.aM(th, 1227433886118425608L, this);
            }
            throw th;
        }
    }
}
