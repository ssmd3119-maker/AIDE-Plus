package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.ArrayType;
import com.aide.codemodel.api.ClassType;
import com.aide.codemodel.api.FileEntry;
import com.aide.codemodel.api.Namespace;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.collections.SetOf;

@cy(clazz = -1151313389845042257L, container = -1151313389845042257L, user = true)
/* loaded from: classes.dex */
public interface TypeSystem {
    @ey(method = -23778832784059424L)
    boolean DW();

    @ey(method = -1613076571230501984L)
    ClassType EQ(FileEntry fileEntry);

    @ey(method = 76293700759047600L)
    boolean FH();

    @ey(method = -1661113668767582168L)
    Type Hw(FileEntry fileEntry, Type type);

    @ey(method = 5004969452110601064L)
    boolean J0();

    @ey(method = 2017114707095091324L)
    boolean J8(FileEntry fileEntry, Type type, Type type2);

    @ey(method = 2235621894443732839L)
    boolean VH(FileEntry fileEntry, Type type, Type type2);

    @ey(method = -6598889485793249008L)
    ClassType Zo(FileEntry fileEntry);

    @ey(method = 3381798031316957793L)
    Type gn(FileEntry fileEntry, Type type, Type type2);

    @ey(method = -22194546623198656L)
    int j6(int i);

    @ey(method = -4872620478879852L)
    Type tp(FileEntry fileEntry, int i, Type type, Type type2);

    @ey(method = -575248586802367119L)
    int u7(Namespace namespace, int i);

    @ey(method = 527018487703160961L)
    SetOf<Type> v5(FileEntry fileEntry, ArrayType arrayType);

    @ey(method = 594926291639039997L)
    boolean we();
}
