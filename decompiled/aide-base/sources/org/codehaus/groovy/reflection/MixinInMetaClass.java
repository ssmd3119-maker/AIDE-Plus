package org.codehaus.groovy.reflection;

import groovy.lang.ExpandoMetaClass;
import org.codehaus.groovy.runtime.metaclass.NewInstanceMetaMethod;
import org.codehaus.groovy.util.ManagedConcurrentMap;
import org.codehaus.groovy.util.ReferenceBundle;

/* loaded from: classes.dex */
public class MixinInMetaClass extends ManagedConcurrentMap {
    final ExpandoMetaClass Hw;
    final CachedConstructor Zo;
    final CachedClass v5;

    /* renamed from: org.codehaus.groovy.reflection.MixinInMetaClass$1, reason: invalid class name */
    public final class AnonymousClass1 extends NewInstanceMetaMethod {
    }

    static {
        ReferenceBundle.DW();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixinInMetaClass) || !super.equals(obj)) {
            return false;
        }
        CachedClass cachedClass = this.v5;
        CachedClass cachedClass2 = ((MixinInMetaClass) obj).v5;
        return cachedClass == null ? cachedClass2 == null : cachedClass.equals(cachedClass2);
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        ExpandoMetaClass expandoMetaClass = this.Hw;
        int iHashCode2 = (iHashCode + (expandoMetaClass != null ? expandoMetaClass.hashCode() : 0)) * 31;
        CachedClass cachedClass = this.v5;
        int iHashCode3 = (iHashCode2 + (cachedClass != null ? cachedClass.hashCode() : 0)) * 31;
        CachedConstructor cachedConstructor = this.Zo;
        return iHashCode3 + (cachedConstructor != null ? cachedConstructor.hashCode() : 0);
    }
}
