package com.aide.codemodel.api.callback;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;
import com.aide.codemodel.api.abstraction.Language;
import java.util.List;

@cy(clazz = 1236924944566557756L, container = 1236924944566557756L, user = true)
/* loaded from: classes.dex */
public interface CodeCompleterCallback {
    @ey(method = 490789915147069824L)
    void DW(String str);

    @ey(method = -54674433110702988L)
    void EQ(FileEntry fileEntry, int i, int i2);

    @ey(method = -3175094722989019340L)
    boolean FH(SyntaxTree syntaxTree, ClassType classType);

    @ey(method = -66349269687701943L)
    void Hw(Type type);

    @ey(method = 2692060888892283664L)
    void J0(Variable variable);

    @ey(method = 582246967937206509L)
    void J8(FileEntry fileEntry, Language language, int i, int i2, int i3, boolean z, boolean z2);

    @ey(method = -1394332667481570075L)
    void Mr(Entity entity);

    @ey(method = 3226768787164331089L)
    void QX(FileEntry fileEntry);

    @ey(method = -5067433102674230988L)
    void U2(Entity entity);

    @ey(method = -7592909628079289664L)
    boolean VH(SyntaxTree syntaxTree, ClassType classType);

    @ey(method = -3405201999235041104L)
    void Ws(ClassType classType);

    @ey(method = -2503747053838975072L)
    void XL(Entity entity, Type type, boolean z);

    @ey(method = 293117018288006640L)
    void Zo(String str);

    @ey(method = -5112785366740365552L)
    void a8(FileEntry fileEntry, int i, int i2);

    @ey(method = 3235282716433000731L)
    void aM(Entity entity, String str);

    @ey(method = -604920670158782677L)
    void gn(String str);

    @ey(method = -2250194826181488100L)
    void j3(Entity entity, boolean z);

    @ey(method = 3614943582710505340L)
    void j6();

    @ey(method = 2504113868289368400L)
    void tp(Entity entity, Type type);

    @ey(method = -2446046536101100299L)
    void u7(FileEntry fileEntry, int i, int i2, int[] iArr, int[] iArr2);

    @ey(method = -8776774532177663L)
    void v5(List<Variable> list);

    @ey(method = 2798291727999007744L)
    void we(Entity entity, Type type);
}
