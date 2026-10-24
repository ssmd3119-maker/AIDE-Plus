package com.aide.codemodel.api.callback;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.SyntaxTreeStyles;
import com.aide.codemodel.api.abstraction.Language;

@cy(clazz = -72465541065478557L, container = -72465541065478557L, user = true)
/* loaded from: classes.dex */
public interface HighlighterCallback {
    @ey(method = -2272075198936828272L)
    void addSyntaxTreeStyles(Language language, SyntaxTreeStyles syntaxTreeStyles);

    @ey(method = 6235404073264304551L)
    void delegateFound(Language language, int i, int i2, int i3, int i4);

    @ey(method = 609555229355750968L)
    void fileFinished(FileEntry fileEntry);

    @ey(method = 579148472057428515L)
    void identifierFound(Language language, int i, int i2, int i3, int i4);

    @ey(method = 3077425856808691005L)
    void j6();

    @ey(method = 1153660820375959181L)
    void keywordFound(Language language, int i, int i2, int i3, int i4);

    @ey(method = 968569066294455483L)
    void namespaceFound(Language language, int i, int i2, int i3, int i4);

    @ey(method = 4219091007553570712L)
    void releaseSyntaxTree();

    @ey(method = -2335203121676107824L)
    void typeFound(Language language, int i, int i2, int i3, int i4);

    @ey(method = 1146524146406397948L)
    void unifedLineFound(FileEntry fileEntry, int i);
}
