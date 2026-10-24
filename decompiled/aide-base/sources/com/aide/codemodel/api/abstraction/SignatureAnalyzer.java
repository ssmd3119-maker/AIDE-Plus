package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Member;
import com.aide.codemodel.api.SyntaxTree;

@cy(clazz = -2998853242133859012L, container = -2998853242133859012L, user = true)
/* loaded from: classes.dex */
public interface SignatureAnalyzer {
    @ey(method = 99790388753899960L)
    void DW(ClassType classType);

    @ey(method = -2029270681481920360L)
    void EQ(ClassType classType);

    @ey(method = 5059108305867583247L)
    void Hw(ClassType classType);

    @ey(method = 1413631911883304320L)
    void Zo(Member member);

    @ey(method = -5385910256679851328L)
    void doLoadPositions(FileEntry fileEntry);

    @ey(method = -4865175236431530239L)
    void doLoadSuperClassTypes(ClassType classType);

    @ey(method = -3341816216000730405L)
    void doLoadSyntax(FileEntry fileEntry);

    @ey(method = -2591189660918216093L)
    void doLoadTypes(FileEntry fileEntry);

    @ey(method = -1723366308721802535L)
    long getClassDeclarationDigest(SyntaxTree syntaxTree);

    @ey(method = 847897346857731001L)
    long getDeclarationDigest(SyntaxTree syntaxTree);

    @ey(method = -687793402713523200L)
    long getPublicDeclarationDigest(SyntaxTree syntaxTree);

    @ey(method = -746823793967811663L)
    long j6(SyntaxTree syntaxTree);

    @ey(method = -3690691572266649216L)
    void tp(FileEntry fileEntry);

    @ey(method = -118941107008735700L)
    void v5(SyntaxTree syntaxTree);
}
