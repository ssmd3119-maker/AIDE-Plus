package org.codehaus.groovy.reflection.stdclasses;

import org.codehaus.groovy.reflection.CachedClass;
import org.codehaus.groovy.reflection.ClassInfo;

/* loaded from: classes.dex */
public class ObjectCachedClass extends CachedClass {
    public ObjectCachedClass(ClassInfo classInfo) {
        super(Object.class, classInfo);
    }

    @Override // org.codehaus.groovy.reflection.CachedClass
    public synchronized CachedClass DW() {
        return null;
    }
}
