package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import java.util.Set;

@cy(clazz = -3566845499721880156L, container = -3566845499721880156L, user = true)
/* loaded from: classes.dex */
public interface Language {
    @ey(method = -3888847314084889660L)
    CodeAnalyzer getCodeAnalyzer();

    @ey(method = 3057316493002465824L)
    CodeRenderer getCodeRenderer();

    @ey(method = -1774858726190934837L)
    Set<? extends FormatOption> getFormatOptionSet();

    @ey(method = -3697263402407404655L)
    String getName();

    @ey(method = 2871827102755454391L)
    SignatureAnalyzer getSignatureAnalyzer();

    @ey(method = 3295702505860017216L)
    Syntax getSyntax();

    @ey(method = 398087315136081060L)
    Tools getTools();

    @ey(method = -1853547096534635264L)
    TypeSystem getTypeSystem();

    @ey(method = -74105029050740704L)
    boolean isParenChar(char c);

    @ey(method = -3258001039737653904L)
    void shrink();
}
