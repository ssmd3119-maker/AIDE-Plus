package org.codehaus.groovy.reflection.stdclasses;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.codehaus.groovy.GroovyBugError;
import org.codehaus.groovy.reflection.CachedClass;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.transform.trait.Traits;

/* loaded from: classes.dex */
public class CachedSAMClass extends CachedClass {
    private final Method J8;

    public CachedSAMClass(Class cls, ClassInfo classInfo) throws NoSuchMethodException, SecurityException {
        super(cls, classInfo);
        Method methodEQ = EQ(cls);
        this.J8 = methodEQ;
        if (methodEQ == null) {
            throw new GroovyBugError("assigned method should not have been null!");
        }
    }

    public static Method EQ(Class<?> cls) throws NoSuchMethodException, SecurityException {
        if (!Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        if (!cls.isInterface()) {
            LinkedList linkedList = new LinkedList();
            u7(cls, linkedList);
            if (linkedList.isEmpty()) {
                return null;
            }
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                if (J0(cls, (Method) listIterator.next())) {
                    listIterator.remove();
                }
            }
            return we(linkedList);
        }
        Method method = null;
        for (Method method2 : cls.getMethods()) {
            if (Modifier.isAbstract(method2.getModifiers()) && method2.getAnnotation(Traits.Implemented.class) == null) {
                try {
                    Object.class.getMethod(method2.getName(), method2.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    if (method != null) {
                        return null;
                    }
                    method = method2;
                }
            }
        }
        return method;
    }

    private static boolean J0(Class cls, Method method) throws NoSuchMethodException, SecurityException {
        if (cls == method.getDeclaringClass()) {
            return false;
        }
        try {
            Method method2 = cls.getMethod(method.getName(), method.getParameterTypes());
            int modifiers = method2.getModifiers() & 1034;
            if ((method2.getModifiers() & 5) != 0 && modifiers == 0) {
                return true;
            }
        } catch (NoSuchMethodException unused) {
        }
        if (cls == Object.class) {
            return false;
        }
        return J0(cls.getSuperclass(), method);
    }

    private static Method[] tp(final Class cls) {
        try {
            Method[] methodArr = (Method[]) AccessController.doPrivileged(new PrivilegedAction<Method[]>() { // from class: org.codehaus.groovy.reflection.stdclasses.CachedSAMClass.1
                @Override // java.security.PrivilegedAction
                /* renamed from: j6, reason: merged with bridge method [inline-methods] */
                public Method[] run() {
                    return cls.getDeclaredMethods();
                }
            });
            if (methodArr != null) {
                return methodArr;
            }
        } catch (AccessControlException unused) {
        }
        return new Method[0];
    }

    private static void u7(Class cls, List<Method> list) {
        if (cls == null || !Modifier.isAbstract(cls.getModifiers())) {
            return;
        }
        u7(cls.getSuperclass(), list);
        for (Class<?> cls2 : cls.getInterfaces()) {
            u7(cls2, list);
        }
        for (Method method : tp(cls)) {
            if (!Modifier.isPrivate(method.getModifiers()) && Modifier.isAbstract(method.getModifiers())) {
                list.add(method);
            }
        }
    }

    private static Method we(List<Method> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        Method methodRemove = list.remove(0);
        for (Method method : list) {
            if (!methodRemove.getName().equals(method.getName()) || !Arrays.equals(methodRemove.getParameterTypes(), method.getParameterTypes())) {
                return null;
            }
        }
        return methodRemove;
    }
}
