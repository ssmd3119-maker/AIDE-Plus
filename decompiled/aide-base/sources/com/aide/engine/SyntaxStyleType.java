package com.aide.engine;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@cy(clazz = -7105191717258212208L, container = -7105191717258212208L, user = true)
/* loaded from: classes.dex */
public final class SyntaxStyleType {

    @dy(field = 254845804732982980L)
    public static final SyntaxStyleType COMMENT;

    @dy(field = 1189445283976117008L)
    public static final SyntaxStyleType DELEGATE_IDENTIFIER;

    @dy(field = 2386171625065272095L)
    public static final SyntaxStyleType DOC_COMMENT;

    @dy(field = -3629848257690943416L)
    public static final SyntaxStyleType IDENTIFIER;

    @dy(field = 2072317269390516288L)
    public static final SyntaxStyleType KEYWORD;

    @dy(field = 3413254822064026128L)
    public static final SyntaxStyleType LITERAL;

    @dy(field = -2065507223058804816L)
    public static final SyntaxStyleType NAMESPACE_IDENTIFIER;

    @dy(field = -886508999408272649L)
    public static final SyntaxStyleType OPERATOR;

    @dy(field = -1099094881330270835L)
    public static final SyntaxStyleType PLAIN;

    @dy(field = -1395376359542704500L)
    public static final SyntaxStyleType PREPROCESSOR;

    @dy(field = -1020294944244266752L)
    public static final SyntaxStyleType SCRIPT;

    @dy(field = 1710009182444697317L)
    public static final SyntaxStyleType SCRIPT_BACKGROUND;

    @dy(field = -1544377000571632480L)
    public static final SyntaxStyleType SEPARATOR;

    @dy(field = -1507610564594256735L)
    public static final SyntaxStyleType TYPE_IDENTIFIER;

    @gy
    private static /* synthetic */ boolean e3;

    @fy
    private static /* synthetic */ boolean eU;

    @dy(field = -1202483918159221335L)
    private static final /* synthetic */ SyntaxStyleType[] iW;

    @dy(field = 2359830321339562016L)
    private final int darkResId;

    @dy(field = 620790235928373680L)
    private final int lightResId;

    @dy(field = 353311019397066704L)
    private final int typefaceStyle;

    static {
        try {
            iy.Zo(SyntaxStyleType.class);
            if (eU) {
                iy.gn(-885494589664822400L, null);
            }
            PLAIN = new SyntaxStyleType("PLAIN", 0, "Plain", 2131034169, 2131034168, 0);
            KEYWORD = new SyntaxStyleType("KEYWORD", 1, "Keyword", 2131034161, 2131034160, 1);
            IDENTIFIER = new SyntaxStyleType("IDENTIFIER", 2, "Identifier", 2131034159, 2131034158, 0);
            NAMESPACE_IDENTIFIER = new SyntaxStyleType("NAMESPACE_IDENTIFIER", 3, "Namespace/Package Identifier", 2131034167, 2131034166, 2);
            TYPE_IDENTIFIER = new SyntaxStyleType("TYPE_IDENTIFIER", 4, "Type Identifier", 2131034173, 2131034172, 0);
            DELEGATE_IDENTIFIER = new SyntaxStyleType("DELEGATE_IDENTIFIER", 5, "Delegate Identifier", 2131034173, 2131034172, 2);
            OPERATOR = new SyntaxStyleType("OPERATOR", 6, "Operator", 2131034165, 2131034164, 0);
            SEPARATOR = new SyntaxStyleType("SEPARATOR", 7, "Separator/Punctuator", 2131034171, 2131034170, 0);
            LITERAL = new SyntaxStyleType("LITERAL", 8, "Literal", 2131034163, 2131034162, 0);
            PREPROCESSOR = new SyntaxStyleType("PREPROCESSOR", 9, "Preprocessor", 2131034169, 2131034168, 0);
            COMMENT = new SyntaxStyleType("COMMENT", 10, "Comment", 2131034157, 2131034156, 0);
            DOC_COMMENT = new SyntaxStyleType("DOC_COMMENT", 11, "Documentation Comment", 2131034157, 2131034156, 2);
            SCRIPT_BACKGROUND = new SyntaxStyleType("SCRIPT_BACKGROUND", 12, "Script Background", 2131034169, 2131034168, 0);
            SyntaxStyleType syntaxStyleType = new SyntaxStyleType("SCRIPT", 13, "Script", 2131034169, 2131034168, 0);
            SCRIPT = syntaxStyleType;
            iW = new SyntaxStyleType[]{PLAIN, KEYWORD, IDENTIFIER, NAMESPACE_IDENTIFIER, TYPE_IDENTIFIER, DELEGATE_IDENTIFIER, OPERATOR, SEPARATOR, LITERAL, PREPROCESSOR, COMMENT, DOC_COMMENT, SCRIPT_BACKGROUND, syntaxStyleType};
        } catch (Throwable th) {
            if (e3) {
                iy.aM(th, -885494589664822400L, null);
            }
            throw th;
        }
    }

    @ey(method = -6720440813366796984L)
    private SyntaxStyleType(String str, int i, String str2, int i2, int i3, int i4) {
        try {
            if (eU) {
                iy.QX(-16565109499817536L, null, new Object[]{str, new Integer(i), str2, new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            this.lightResId = i2;
            this.darkResId = i3;
            this.typefaceStyle = i4;
        } catch (Throwable th) {
            if (e3) {
                iy.rN(th, -16565109499817536L, null, new Object[]{str, new Integer(i), str2, new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            throw th;
        }
    }

    @ey(method = -535845413706734592L)
    public static SyntaxStyleType valueOf(String str) {
        try {
            if (eU) {
                iy.tp(-229878418184232440L, null, str);
            }
            return (SyntaxStyleType) Enum.valueOf(SyntaxStyleType.class, str);
        } catch (Throwable th) {
            if (e3) {
                iy.j3(th, -229878418184232440L, null, str);
            }
            throw th;
        }
    }

    @ey(method = -1021886170872184364L)
    public static SyntaxStyleType[] values() {
        try {
            if (eU) {
                iy.gn(2783424317711596032L, null);
            }
            return (SyntaxStyleType[]) iW.clone();
        } catch (Throwable th) {
            if (e3) {
                iy.aM(th, 2783424317711596032L, null);
            }
            throw th;
        }
    }

    @ey(method = 971164409909141035L)
    public int getColor(Context context, boolean z) {
        try {
            if (eU) {
                iy.EQ(-320314520831201655L, this, context, new Boolean(z));
            }
            return context.getResources().getColor(z ? this.lightResId : this.darkResId);
        } catch (Throwable th) {
            if (e3) {
                iy.Mr(th, -320314520831201655L, this, context, new Boolean(z));
            }
            throw th;
        }
    }

    @ey(method = -3185477945342733632L)
    public int getTypefaceStyle() {
        try {
            if (eU) {
                iy.gn(209603465243113248L, this);
            }
            return this.typefaceStyle;
        } catch (Throwable th) {
            if (e3) {
                iy.aM(th, 209603465243113248L, this);
            }
            throw th;
        }
    }
}
