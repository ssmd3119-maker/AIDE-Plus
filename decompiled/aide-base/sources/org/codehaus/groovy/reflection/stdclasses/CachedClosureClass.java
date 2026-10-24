package org.codehaus.groovy.reflection.stdclasses;

import org.codehaus.groovy.reflection.CachedClass;
import org.codehaus.groovy.reflection.CachedMethod;
import org.codehaus.groovy.reflection.ClassInfo;

/* loaded from: classes.dex */
public class CachedClosureClass extends CachedClass {
    public CachedClosureClass(Class cls, ClassInfo classInfo) {
        super(cls, classInfo);
        int length = -1;
        for (CachedMethod cachedMethod : Zo()) {
            if ("doCall".equals(cachedMethod.FH())) {
                Class[] nativeParameterTypes = cachedMethod.getNativeParameterTypes();
                if (nativeParameterTypes.length > length) {
                    length = nativeParameterTypes.length;
                }
            }
        }
        Math.max(length, 0);
    }
}
