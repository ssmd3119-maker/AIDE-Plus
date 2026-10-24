package org.codehaus.groovy.util;

import org.codehaus.groovy.util.Finalizable;

/* loaded from: classes.dex */
public interface Reference<T, V extends Finalizable> {
    void clear();

    T get();

    V getHandler();
}
