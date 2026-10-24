package com.aide.codemodel.language.java;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.abstraction.FormatOption;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
@cy(clazz = -6081133926037915885L, container = -6081133926037915885L, user = true)
/* loaded from: classes.dex */
public final class JavaFormatterOption implements FormatOption {

    @dy(field = 310492711065232560L)
    public static final JavaFormatterOption AUTO_INSERT_JAVADOC_ASTERISK_ONTYPE;

    @fy
    private static /* synthetic */ boolean fY;

    @dy(field = 3446497289132301213L)
    private static final /* synthetic */ JavaFormatterOption[] jw;

    @gy
    private static /* synthetic */ boolean qp;

    @dy(field = 2303472271396261208L)
    private final String WB;

    static {
        try {
            iy.Zo(JavaFormatterOption.class);
            if (fY) {
                iy.gn(2919319309333831680L, null);
            }
            JavaFormatterOption javaFormatterOption = new JavaFormatterOption("AUTO_INSERT_JAVADOC_ASTERISK_ONTYPE", 0, "General", "Automatically insert * in JavaDoc comments", "", "");
            AUTO_INSERT_JAVADOC_ASTERISK_ONTYPE = javaFormatterOption;
            jw = new JavaFormatterOption[]{javaFormatterOption};
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 2919319309333831680L, null);
            }
            throw th;
        }
    }

    @ey(method = -779296623636021889L)
    private JavaFormatterOption(String str, int i, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            if (fY) {
                iy.QX(-20493337841829252L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
            }
            try {
                this.WB = str3;
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    iy.rN(th, -20493337841829252L, null, new Object[]{str, new Integer(i), str2, str3, str4, str5});
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ey(method = 3221695792375589907L)
    public static Set<JavaFormatterOption> j6() {
        try {
            if (fY) {
                iy.gn(3419582166594996139L, null);
            }
            HashSet hashSet = new HashSet();
            hashSet.add(AUTO_INSERT_JAVADOC_ASTERISK_ONTYPE);
            return hashSet;
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 3419582166594996139L, null);
            }
            throw th;
        }
    }

    @ey(method = -1037720067991224936L)
    public static JavaFormatterOption valueOf(String str) {
        try {
            if (fY) {
                iy.tp(617988367365327152L, null, str);
            }
            return (JavaFormatterOption) Enum.valueOf(JavaFormatterOption.class, str);
        } catch (Throwable th) {
            if (qp) {
                iy.j3(th, 617988367365327152L, null, str);
            }
            throw th;
        }
    }

    @ey(method = 3268047748604790424L)
    public static JavaFormatterOption[] values() {
        try {
            if (fY) {
                iy.gn(1721164429379979552L, null);
            }
            return (JavaFormatterOption[]) jw.clone();
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 1721164429379979552L, null);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.api.abstraction.FormatOption
    @ey(method = 1776703014583897661L)
    public String getName() {
        try {
            if (fY) {
                iy.gn(1965302150498068013L, this);
            }
            return this.WB;
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 1965302150498068013L, this);
            }
            throw th;
        }
    }
}
