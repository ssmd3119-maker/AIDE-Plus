package com.aide.codemodel.api.abstraction;

import abcd.cy;
import abcd.ey;
import com.aide.codemodel.api.Entity;
import com.aide.codemodel.api.Type;
import com.aide.codemodel.api.Variable;

@cy(clazz = -1335264569956155456L, container = -1335264569956155456L, user = true)
/* loaded from: classes.dex */
public interface CodeRenderer {
    @ey(method = 5714463263439627445L)
    String getFullyQualifiedNameString(Entity entity);

    @ey(method = 2539229375105696875L)
    String getHTMLString(Entity entity);

    @ey(method = 4180494098323310425L)
    String getHTMLString(Variable variable);

    @ey(method = -6077704585346339757L)
    String getModifiersString(int i);

    @ey(method = 921113871848743095L)
    String getNameString(Entity entity);

    @ey(method = 922422406451162043L)
    String v5(Type type);
}
