package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.SyntaxTree;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.SetOfInt;

@cy(clazz = -2343062644660502445L, container = -2343062644660502445L, user = true)
/* loaded from: classes.dex */
public interface CodeAnalyzer {
    @ey(method = 67910639604622848L)
    void FH(SyntaxTree syntaxTree);

    @ey(method = 4127339005690185369L)
    void Hw(SyntaxTree syntaxTree, int i);

    @ey(method = -498844056607741521L)
    void VH(SyntaxTree syntaxTree, int i);

    @ey(method = 3968855828478130152L)
    void Zo(SyntaxTree syntaxTree);

    @ey(method = 3218679584125288920L)
    void analyzeEveryIdentifiers(SyntaxTree syntaxTree, SetOfInt setOfInt);

    @ey(method = 2121664987226903301L)
    Type analyzeTypeName(SyntaxTree syntaxTree, int i, int i2, String str);

    @ey(method = -1354901615488424973L)
    void j6(SyntaxTree syntaxTree, int i);

    @ey(method = -2417396441124226999L)
    void v5(SyntaxTree syntaxTree);
}
