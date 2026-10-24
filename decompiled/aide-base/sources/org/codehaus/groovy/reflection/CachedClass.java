package org.codehaus.groovy.reflection;

import groovy.lang.MetaMethod;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.codehaus.groovy.runtime.callsite.CallSiteClassLoader;
import org.codehaus.groovy.util.LazyReference;
import org.codehaus.groovy.util.ReferenceBundle;

/* loaded from: classes.dex */
public class CachedClass {
    public ClassInfo DW;
    public final boolean EQ;
    private LazyReference<CachedMethod[]> FH;
    private LazyReference<CachedClass> Hw;
    public CachedMethod[] VH;
    int Zo;
    private final LazyReference<Set<CachedClass>> gn;
    private final Class j6;
    public final boolean tp;
    private final LazyReference<Set<CachedClass>> u7;
    private final LazyReference<LinkedList<ClassInfo>> v5;
    private static ReferenceBundle we = ReferenceBundle.DW();
    static final MetaMethod[] J0 = new MetaMethod[0];

    public static class CachedMethodComparatorByName implements Comparator {
        public static final Comparator WB = new CachedMethodComparatorByName();

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((CachedMethod) obj).FH().compareTo(((CachedMethod) obj2).FH());
        }
    }

    public static class CachedMethodComparatorWithString implements Comparator {
        static {
            new CachedMethodComparatorWithString();
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return obj instanceof CachedMethod ? ((CachedMethod) obj).FH().compareTo((String) obj2) : ((String) obj).compareTo(((CachedMethod) obj2).FH());
        }
    }

    public CachedClass(Class cls, ClassInfo classInfo) {
        new LazyReference<CachedField[]>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.1
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public CachedField[] v5() {
                Field[] fieldArr = (Field[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.codehaus.groovy.reflection.CachedClass.1.1
                    @Override // java.security.PrivilegedAction
                    public Object run() throws SecurityException {
                        Field[] declaredFields = CachedClass.this.gn().getDeclaredFields();
                        try {
                            AccessibleObject.setAccessible(declaredFields, true);
                        } catch (SecurityException unused) {
                        }
                        return declaredFields;
                    }
                });
                int length = fieldArr.length;
                CachedField[] cachedFieldArr = new CachedField[length];
                for (int i = 0; i != length; i++) {
                    cachedFieldArr[i] = new CachedField(fieldArr[i]);
                }
                return cachedFieldArr;
            }
        };
        new LazyReference<CachedConstructor[]>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.2
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public CachedConstructor[] v5() {
                Constructor[] constructorArr = (Constructor[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.codehaus.groovy.reflection.CachedClass.2.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        return CachedClass.this.gn().getDeclaredConstructors();
                    }
                });
                int length = constructorArr.length;
                CachedConstructor[] cachedConstructorArr = new CachedConstructor[length];
                for (int i = 0; i != length; i++) {
                    cachedConstructorArr[i] = new CachedConstructor(CachedClass.this, constructorArr[i]);
                }
                return cachedConstructorArr;
            }
        };
        this.FH = new LazyReference<CachedMethod[]>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.3
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public CachedMethod[] v5() {
                Method[] methodArr = (Method[]) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.codehaus.groovy.reflection.CachedClass.3.1
                    @Override // java.security.PrivilegedAction
                    public Object run() throws SecurityException {
                        Method[] declaredMethods = CachedClass.this.gn().getDeclaredMethods();
                        try {
                            AccessibleObject.setAccessible(declaredMethods, true);
                        } catch (SecurityException unused) {
                        }
                        return declaredMethods;
                    }
                });
                ArrayList arrayList = new ArrayList(methodArr.length);
                ArrayList arrayList2 = new ArrayList(methodArr.length);
                for (int i = 0; i != methodArr.length; i++) {
                    CachedMethod cachedMethod = new CachedMethod(CachedClass.this, methodArr[i]);
                    String strFH = cachedMethod.FH();
                    if (!methodArr[i].isBridge() && strFH.indexOf(43) < 0) {
                        if (strFH.startsWith("this$") || strFH.startsWith("super$")) {
                            arrayList2.add(cachedMethod);
                        } else {
                            arrayList.add(cachedMethod);
                        }
                    }
                }
                CachedMethod[] cachedMethodArr = (CachedMethod[]) arrayList.toArray(new CachedMethod[arrayList.size()]);
                Arrays.sort(cachedMethodArr);
                CachedClass cachedClassDW = CachedClass.this.DW();
                if (cachedClassDW != null) {
                    cachedClassDW.Zo();
                    CachedMethod[] cachedMethodArr2 = cachedClassDW.VH;
                    for (int i2 = 0; i2 != cachedMethodArr2.length; i2++) {
                        arrayList2.add(cachedMethodArr2[i2]);
                    }
                }
                CachedClass.this.VH = (CachedMethod[]) arrayList2.toArray(new CachedMethod[arrayList2.size()]);
                Arrays.sort(CachedClass.this.VH, CachedMethodComparatorByName.WB);
                return cachedMethodArr;
            }
        };
        this.Hw = new LazyReference<CachedClass>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.4
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public CachedClass v5() {
                CachedClass cachedClass = CachedClass.this;
                return !cachedClass.tp ? ReflectionCache.j6(cachedClass.gn().getSuperclass()) : (cachedClass.j6.getComponentType().isPrimitive() || CachedClass.this.j6.getComponentType() == Object.class) ? ReflectionCache.DW : ReflectionCache.FH;
            }
        };
        new LazyReference<CallSiteClassLoader>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.5
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public CallSiteClassLoader v5() {
                return (CallSiteClassLoader) AccessController.doPrivileged(new PrivilegedAction<CallSiteClassLoader>() { // from class: org.codehaus.groovy.reflection.CachedClass.5.1
                    @Override // java.security.PrivilegedAction
                    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
                    public CallSiteClassLoader run() {
                        return new CallSiteClassLoader(CachedClass.this.j6);
                    }
                });
            }
        };
        this.v5 = new LazyReference<LinkedList<ClassInfo>>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.6
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public LinkedList<ClassInfo> v5() {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(CachedClass.this.DW);
                Iterator<CachedClass> it = CachedClass.this.FH().iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(it.next().Hw());
                }
                CachedClass cachedClassDW = CachedClass.this.DW();
                if (cachedClassDW != null) {
                    linkedHashSet.addAll(cachedClassDW.Hw());
                }
                if (CachedClass.this.EQ) {
                    linkedHashSet.add(ReflectionCache.DW.DW);
                }
                return new LinkedList<>(linkedHashSet);
            }
        };
        this.gn = new LazyReference<Set<CachedClass>>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.7
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public Set<CachedClass> v5() {
                HashSet hashSet = new HashSet(0);
                for (Class<?> cls2 : CachedClass.this.gn().getInterfaces()) {
                    hashSet.add(ReflectionCache.j6(cls2));
                }
                return hashSet;
            }
        };
        this.u7 = new LazyReference<Set<CachedClass>>(we) { // from class: org.codehaus.groovy.reflection.CachedClass.8
            @Override // org.codehaus.groovy.util.LazyReference
            /* renamed from: Zo, reason: merged with bridge method [inline-methods] */
            public Set<CachedClass> v5() {
                HashSet hashSet = new HashSet(0);
                if (CachedClass.this.gn().isInterface()) {
                    hashSet.add(CachedClass.this);
                }
                for (Class<?> cls2 : CachedClass.this.gn().getInterfaces()) {
                    CachedClass cachedClassJ6 = ReflectionCache.j6(cls2);
                    if (!hashSet.contains(cachedClassJ6)) {
                        hashSet.addAll(cachedClassJ6.v5());
                    }
                }
                CachedClass cachedClassDW = CachedClass.this.DW();
                if (cachedClassDW != null) {
                    hashSet.addAll(cachedClassDW.v5());
                }
                return hashSet;
            }
        };
        this.j6 = cls;
        this.DW = classInfo;
        this.tp = cls.isArray();
        cls.isPrimitive();
        cls.getModifiers();
        this.EQ = cls.isInterface();
        Number.class.isAssignableFrom(cls);
        Iterator<CachedClass> it = v5().iterator();
        while (it.hasNext()) {
            ReflectionCache.DW(cls, it.next().j6);
        }
        for (CachedClass cachedClassDW = this; cachedClassDW != null; cachedClassDW = cachedClassDW.DW()) {
            ReflectionCache.FH(cachedClassDW.j6, cls);
        }
    }

    public CachedClass DW() {
        return this.Hw.FH();
    }

    public Set<CachedClass> FH() {
        return this.gn.FH();
    }

    public Collection<ClassInfo> Hw() {
        return this.v5.FH();
    }

    public String VH() {
        return gn().getName();
    }

    public CachedMethod[] Zo() {
        return this.FH.FH();
    }

    public final Class gn() {
        return this.j6;
    }

    public int hashCode() {
        if (this.Zo == 0) {
            int iHashCode = super.hashCode();
            this.Zo = iHashCode;
            if (iHashCode == 0) {
                this.Zo = -889274690;
            }
        }
        return this.Zo;
    }

    public String toString() {
        return this.j6.toString();
    }

    public Set<CachedClass> v5() {
        return this.u7.FH();
    }
}
