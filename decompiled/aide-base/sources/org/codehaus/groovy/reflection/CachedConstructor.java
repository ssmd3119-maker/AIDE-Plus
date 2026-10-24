package org.codehaus.groovy.reflection;

import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes.dex */
public class CachedConstructor extends ParameterTypes {
    public CachedConstructor(CachedClass cachedClass, final Constructor constructor) {
        try {
            AccessController.doPrivileged(new PrivilegedAction(this) { // from class: org.codehaus.groovy.reflection.CachedConstructor.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    constructor.setAccessible(true);
                    return null;
                }
            });
        } catch (SecurityException unused) {
        }
    }
}
