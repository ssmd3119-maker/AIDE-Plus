package org.codehaus.groovy.reflection;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class ReflectionUtils {
    private static final Set<String> j6;

    private static class ClassContextHelper extends SecurityManager {
        private ClassContextHelper() {
        }

        @Override // java.lang.SecurityManager
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        j6 = hashSet;
        hashSet.add("groovy.lang");
        j6.add("org.codehaus.groovy.reflection");
        j6.add("org.codehaus.groovy.runtime.callsite");
        j6.add("org.codehaus.groovy.runtime.metaclass");
        j6.add("org.codehaus.groovy.runtime");
        j6.add("sun.reflect");
        j6.add("java.lang.invoke");
        j6.add("org.codehaus.groovy.vmplugin.v7");
        new ClassContextHelper();
    }
}
