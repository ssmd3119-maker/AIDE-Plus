package com.aide.engine;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.Model;
import com.aide.codemodel.api.abstraction.CodeModel;
import java.util.List;

@cy(clazz = 5274689869178220132L, container = 5274689869178220132L, user = true)
/* loaded from: classes.dex */
public interface ICodeModelsFactory {
    @ey(method = -2995865043343938336L)
    long getId();

    @ey(method = -1730822783869851240L)
    CodeModel[] makeCodeModels(Model model, List<String> list);
}
