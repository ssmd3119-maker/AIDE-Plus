package abcd;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ry {
    public static Set<Long> j6 = new HashSet();
    public static Set<Long> DW = new HashSet();
    private static Map<Long, Set<Long>> FH = new HashMap();
    private static Map<Long, Set<Long>> Hw = new HashMap();
    private static Map<Long, List<Class>> v5 = new HashMap();
    private static Map<Long, Class> Zo = new HashMap();
    private static Map<Long, Method> VH = new HashMap();
    private static Map<Long, Constructor> gn = new HashMap();
    private static Map<Long, Field> u7 = new HashMap();

    public static void DW(long j, long j2, boolean z) {
        b00.j6("Code", "Set onThrow " + z + ": container " + j + " method " + j2);
        if (z) {
            DW.add(Long.valueOf(j2));
            if (!FH.containsKey(Long.valueOf(j))) {
                FH.put(Long.valueOf(j), new HashSet());
            }
            FH.get(Long.valueOf(j)).add(Long.valueOf(j2));
            if (v5.containsKey(Long.valueOf(j))) {
                Iterator it = new ArrayList(v5.get(Long.valueOf(j))).iterator();
                while (it.hasNext()) {
                    J8((Class) it.next(), true);
                }
                return;
            }
            return;
        }
        DW.remove(Long.valueOf(j2));
        if (FH.containsKey(Long.valueOf(j))) {
            FH.get(Long.valueOf(j)).remove(Long.valueOf(j2));
            if (FH.get(Long.valueOf(j)).size() == 0) {
                Map<Long, Set<Long>> map = FH;
                map.remove(map);
            }
        }
        if (FH.containsKey(Long.valueOf(j2)) || !v5.containsKey(Long.valueOf(j))) {
            return;
        }
        Iterator it2 = new ArrayList(v5.get(Long.valueOf(j))).iterator();
        while (it2.hasNext()) {
            J8((Class) it2.next(), false);
        }
    }

    public static void EQ(Class<?> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            EQ(cls2);
        }
        if (cls.getSuperclass() != null) {
            EQ(cls.getSuperclass());
        }
        cy cyVar = (cy) cls.getAnnotation(cy.class);
        if (cyVar != null) {
            we(cls, cyVar.container(), cyVar.clazz());
        }
    }

    public static Class<?> FH(long j) {
        return Zo.get(Long.valueOf(j));
    }

    public static String Hw(Class<?> cls) {
        cy cyVar = (cy) cls.getAnnotation(cy.class);
        if (cyVar == null) {
            return "" + cls.getName();
        }
        return "{{" + cyVar.clazz() + "}}";
    }

    private static void J0(Class<?> cls, boolean z) {
        try {
            b00.j6("Code", "Toggle onEnter " + z + " " + cls);
            for (Field field : cls.getDeclaredFields()) {
                if (field.getAnnotation(fy.class) != null) {
                    field.setAccessible(true);
                    field.set(null, Boolean.valueOf(z));
                    return;
                }
            }
        } catch (Throwable th) {
            b00.VH("Runtime Error", th);
        }
    }

    private static void J8(Class<?> cls, boolean z) {
        try {
            b00.j6("Code", "Toggle onThrow " + z + " " + cls);
            for (Field field : cls.getDeclaredFields()) {
                if (field.getAnnotation(gy.class) != null) {
                    field.setAccessible(true);
                    field.set(null, Boolean.valueOf(z));
                    return;
                }
            }
        } catch (Throwable th) {
            b00.VH("Runtime Error", th);
        }
    }

    public static Method VH(long j, long j2) throws SecurityException {
        Method method = VH.get(Long.valueOf(j2));
        if (method != null) {
            return method;
        }
        Class cls = Zo.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        for (Method method2 : cls.getDeclaredMethods()) {
            ey eyVar = (ey) method2.getAnnotation(ey.class);
            if (eyVar != null && eyVar.method() == j2) {
                VH.put(Long.valueOf(j2), method2);
                return method2;
            }
        }
        return null;
    }

    public static Field Zo(long j, long j2) {
        Field field = u7.get(Long.valueOf(j2));
        if (field != null) {
            return field;
        }
        Class cls = Zo.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        for (Field field2 : cls.getDeclaredFields()) {
            dy dyVar = (dy) field2.getAnnotation(dy.class);
            if (dyVar != null && dyVar.field() == j2) {
                u7.put(Long.valueOf(j2), field2);
                return field2;
            }
        }
        return null;
    }

    public static Object gn(Object obj, long j) {
        Class cls = Zo.get(Long.valueOf(j));
        if (cls != null) {
            return u7(obj, cls);
        }
        return null;
    }

    public static void j6(long j, long j2, boolean z) {
        b00.j6("Code", "Set onEnter " + z + ": container " + j + " method " + j2);
        if (z) {
            j6.add(Long.valueOf(j2));
            if (!Hw.containsKey(Long.valueOf(j))) {
                Hw.put(Long.valueOf(j), new HashSet());
            }
            Hw.get(Long.valueOf(j)).add(Long.valueOf(j2));
            if (v5.containsKey(Long.valueOf(j))) {
                Iterator it = new ArrayList(v5.get(Long.valueOf(j))).iterator();
                while (it.hasNext()) {
                    J0((Class) it.next(), true);
                }
                return;
            }
            return;
        }
        j6.remove(Long.valueOf(j2));
        if (Hw.containsKey(Long.valueOf(j))) {
            Hw.get(Long.valueOf(j)).remove(Long.valueOf(j2));
            if (Hw.get(Long.valueOf(j)).size() == 0) {
                Map<Long, Set<Long>> map = Hw;
                map.remove(map);
            }
        }
        if (Hw.containsKey(Long.valueOf(j2)) || !v5.containsKey(Long.valueOf(j))) {
            return;
        }
        Iterator it2 = new ArrayList(v5.get(Long.valueOf(j))).iterator();
        while (it2.hasNext()) {
            J0((Class) it2.next(), false);
        }
    }

    public static boolean tp(String str) {
        try {
            cy cyVar = (cy) Class.forName(str).getAnnotation(cy.class);
            if (cyVar != null) {
                return cyVar.user();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T u7(Object obj, Class<T> cls) throws NoSuchFieldException {
        if (obj == 0) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        try {
            try {
                try {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (((hy) field.getAnnotation(hy.class)) != null) {
                            field.setAccessible(true);
                            return (T) u7(field.get(obj), cls);
                        }
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            } catch (Exception unused2) {
                Field declaredField = obj.getClass().getDeclaredField("arg$1");
                declaredField.setAccessible(true);
                return (T) u7(declaredField.get(obj), cls);
            }
        } catch (Exception unused3) {
            Field declaredField2 = obj.getClass().getDeclaredField("this$0");
            declaredField2.setAccessible(true);
            return (T) u7(declaredField2.get(obj), cls);
        }
    }

    public static Constructor v5(long j, long j2) throws SecurityException {
        Constructor constructor = gn.get(Long.valueOf(j2));
        if (constructor != null) {
            return constructor;
        }
        Class cls = Zo.get(Long.valueOf(j));
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor2 : cls.getDeclaredConstructors()) {
            ey eyVar = (ey) constructor2.getAnnotation(ey.class);
            if (eyVar != null && eyVar.method() == j2) {
                gn.put(Long.valueOf(j2), constructor2);
                return constructor2;
            }
        }
        return null;
    }

    public static void we(Class<?> cls, long j, long j2) {
        if (Zo.containsKey(Long.valueOf(j2))) {
            return;
        }
        Zo.put(Long.valueOf(j2), cls);
        py.QX(j);
        List<Class> list = v5.get(Long.valueOf(j));
        if (list == null) {
            Map<Long, List<Class>> map = v5;
            Long lValueOf = Long.valueOf(j);
            ArrayList arrayList = new ArrayList();
            map.put(lValueOf, arrayList);
            list = arrayList;
        }
        list.add(cls);
        if (Hw.containsKey(Long.valueOf(j)) || FH.containsKey(Long.valueOf(j))) {
            b00.j6("Code", "Load active class " + cls + ": container " + j + " class " + j2);
        }
        if (Hw.containsKey(Long.valueOf(j))) {
            J0(cls, true);
        }
        if (FH.containsKey(Long.valueOf(j))) {
            J8(cls, true);
        }
    }
}
