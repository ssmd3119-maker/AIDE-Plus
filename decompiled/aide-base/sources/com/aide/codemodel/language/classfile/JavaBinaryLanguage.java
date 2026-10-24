package com.aide.codemodel.language.classfile;

import abcd.cy;
import abcd.dy;
import abcd.ey;
import abcd.fy;
import abcd.gy;
import abcd.iy;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.language.java.JavaLanguage;

@cy(clazz = -274850961251143032L, container = -274850961251143032L, user = true)
/* loaded from: classes.dex */
public class JavaBinaryLanguage extends JavaLanguage {

    @fy
    private static /* synthetic */ boolean EQ;

    @gy
    private static /* synthetic */ boolean we;

    @dy(field = 3494162435785222320L)
    private JavaBinarySignatureAnalyzer mJavaBinarySignatureAnalyzer;

    static {
        iy.Zo(JavaBinaryLanguage.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @ey(method = -546764112674127040L)
    public JavaBinaryLanguage(Model model) {
        super(model);
        try {
            if (EQ) {
                iy.tp(-1362017578555818851L, null, model);
            }
            if (model != null) {
                this.mJavaBinarySignatureAnalyzer = new JavaBinarySignatureAnalyzer(model, this);
            }
        } catch (Throwable th) {
            if (we) {
                iy.j3(th, -1362017578555818851L, null, model);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.language.java.JavaLanguage, com.aide.codemodel.api.abstraction.Language
    @ey(method = -1464742443264812541L)
    /* renamed from: Ws, reason: merged with bridge method [inline-methods] */
    public JavaBinarySignatureAnalyzer getSignatureAnalyzer() {
        try {
            if (EQ) {
                iy.gn(-3030885408333655304L, this);
            }
            return this.mJavaBinarySignatureAnalyzer;
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -3030885408333655304L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.language.java.JavaLanguage, com.aide.codemodel.api.abstraction.Language
    @ey(method = -2363784384674359275L)
    public String getName() {
        try {
            if (!EQ) {
                return "Java Binary";
            }
            iy.gn(-3613046755762622120L, this);
            return "Java Binary";
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -3613046755762622120L, this);
            }
            throw th;
        }
    }

    @Override // com.aide.codemodel.language.java.JavaLanguage, com.aide.codemodel.api.abstraction.Language
    @ey(method = -2015246168650177344L)
    public void shrink() {
        try {
            if (EQ) {
                iy.gn(-1144323990643924077L, this);
            }
            super.shrink();
        } catch (Throwable th) {
            if (we) {
                iy.aM(th, -1144323990643924077L, this);
            }
            throw th;
        }
    }
}
