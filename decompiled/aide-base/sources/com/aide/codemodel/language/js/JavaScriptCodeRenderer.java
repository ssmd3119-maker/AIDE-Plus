package com.aide.codemodel.language.js;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.abstraction.CodeRenderer;

@cy(clazz = 4829510770894648600L, container = 4829510770894648600L, user = true)
/* loaded from: classes.dex */
public class JavaScriptCodeRenderer implements CodeRenderer {

    @fy
    private static /* synthetic */ boolean DW;

    @gy
    private static /* synthetic */ boolean FH;

    @dy(field = 1759333778707363785L)
    private final Model j6;

    static {
        iy.Zo(JavaScriptCodeRenderer.class);
    }

    @ey(method = 234003919921317144L)
    public JavaScriptCodeRenderer(Model model) {
        try {
            if (DW) {
                iy.tp(285571921584947396L, null, model);
            }
            this.j6 = model;
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 285571921584947396L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = -2519014976934078140L)
    public String getFullyQualifiedNameString(Entity entity) {
        try {
            if (DW) {
                iy.tp(-659645189185526355L, this, entity);
            }
            return this.j6.identifierSpace.getString(entity.getIdentifier());
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -659645189185526355L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = -3631918873047743640L)
    public String getHTMLString(Entity entity) {
        try {
            if (DW) {
                iy.tp(1852141181225599851L, this, entity);
            }
            if (!entity.isMember() || !((Member) entity).e9()) {
                if (!entity.isMember() || !((Member) entity).Gj()) {
                    return "";
                }
                return ((("" + entity.getLanguage().getName() + "<br>") + "<code>") + "<b><font color=\"#2A50D0\">var</font></b> " + getNameString(entity)) + "<p>";
            }
            String str = ((("" + entity.getLanguage().getName() + "<br>") + "<code>") + "<b><font color=\"#2A50D0\">function</font></b> " + getNameString(entity)) + "<font color=\"#0000EE\">(</font>";
            int iOY = ((Member) entity).oY();
            for (int i = 0; i < iOY; i++) {
                str = str + this.j6.identifierSpace.getString(((Member) entity).CU(i));
                if (i < iOY - 1) {
                    str = str + "<font color=\"#0000EE\">, </font>";
                }
            }
            return (str + "<font color=\"#0000EE\">) </font>") + "<p>";
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 1852141181225599851L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = -1474838485762965968L)
    public String getHTMLString(Variable variable) {
        try {
            if (DW) {
                iy.tp(-1348366296348170871L, this, variable);
            }
            return ((variable.getLanguage().getName() + "<br>") + "<code>") + this.j6.identifierSpace.getString(variable.getIdentifier()) + "</code>";
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, -1348366296348170871L, this, variable);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = -524767727548611568L)
    public String getModifiersString(int i) {
        try {
            if (!DW) {
                return "";
            }
            iy.u7(6458045637753789747L, this, i);
            return "";
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 6458045637753789747L, this, new Integer(i));
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = 3217977652871607192L)
    public String getNameString(Entity entity) {
        try {
            if (DW) {
                iy.tp(588051179396122599L, this, entity);
            }
            return this.j6.identifierSpace.getString(entity.getIdentifier());
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 588051179396122599L, this, entity);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.CodeRenderer
    @ey(method = -472968679194720144L)
    public String v5(Type type) {
        try {
            if (!DW) {
                return "";
            }
            iy.tp(597355406678726611L, this, type);
            return "";
        } catch (Throwable th) {
            if (FH) {
                iy.j3(th, 597355406678726611L, this, type);
            }
            throw th;
        }
    }
}
