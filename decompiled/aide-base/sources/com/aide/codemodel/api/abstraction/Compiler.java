package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.SyntaxTree;
import java.util.List;

@cy(clazz = 359246397366387693L, container = 359246397366387693L, user = true)
/* loaded from: classes.dex */
public interface Compiler {
    @ey(method = -947532117529576167L)
    void compile(List<SyntaxTree> list, boolean z);

    @ey(method = 70487194304827881L)
    void init(CodeModel codeModel);
}
