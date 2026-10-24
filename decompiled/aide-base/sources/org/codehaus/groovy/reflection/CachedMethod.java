package org.codehaus.groovy.reflection;

import groovy.lang.MetaMethod;
import java.lang.reflect.Method;
import java.util.Comparator;

/* loaded from: classes.dex */
public class CachedMethod extends MetaMethod implements Comparable {
    private final Method WB;
    private int mb;

    private static class MyComparator implements Comparator {
        private MyComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj instanceof CachedMethod) {
                return ((CachedMethod) obj).compareTo(obj2);
            }
            if (obj2 instanceof CachedMethod) {
                return -((CachedMethod) obj2).compareTo(obj);
            }
            throw new ClassCastException("One of the two comparables must be a CachedMethod");
        }
    }

    static {
        new MyComparator();
    }

    public CachedMethod(CachedClass cachedClass, Method method) {
        this.WB = method;
    }

    private int DW(Method method) {
        if (method == null) {
            return -1;
        }
        int iCompareTo = FH().compareTo(method.getName());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = v5().getName().compareTo(method.getReturnType().getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        CachedClass[] parameterTypes = getParameterTypes();
        Class<?>[] parameterTypes2 = method.getParameterTypes();
        int length = parameterTypes.length - parameterTypes2.length;
        if (length != 0) {
            return length;
        }
        for (int i = 0; i != parameterTypes.length; i++) {
            int iCompareTo3 = parameterTypes[i].VH().compareTo(parameterTypes2[i].getName());
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        return 0;
    }

    private int j6(CachedMethod cachedMethod) {
        if (cachedMethod == null) {
            return -1;
        }
        int iCompareTo = FH().compareTo(cachedMethod.FH());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = v5().getName().compareTo(cachedMethod.v5().getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        CachedClass[] parameterTypes = getParameterTypes();
        CachedClass[] parameterTypes2 = cachedMethod.getParameterTypes();
        int length = parameterTypes.length - parameterTypes2.length;
        if (length != 0) {
            return length;
        }
        for (int i = 0; i != parameterTypes.length; i++) {
            int iCompareTo3 = parameterTypes[i].VH().compareTo(parameterTypes2[i].VH());
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        throw new RuntimeException("Should never happen");
    }

    public String FH() {
        return this.WB.getName();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return obj instanceof CachedMethod ? j6((CachedMethod) obj) : DW((Method) obj);
    }

    public boolean equals(Object obj) {
        return ((obj instanceof CachedMethod) && this.WB.equals(((CachedMethod) obj).WB)) || ((obj instanceof Method) && this.WB.equals(obj));
    }

    public int hashCode() {
        if (this.mb == 0) {
            int iHashCode = this.WB.hashCode();
            this.mb = iHashCode;
            if (iHashCode == 0) {
                this.mb = -889274690;
            }
        }
        return this.mb;
    }

    public String toString() {
        return this.WB.toString();
    }

    public Class v5() {
        return this.WB.getReturnType();
    }
}
