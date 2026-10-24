package org.codehaus.groovy.reflection;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.groovy.util.TripleKeyHashMap;

/* loaded from: classes.dex */
public class ReflectionCache {
    public static final CachedClass DW;
    public static final CachedClass FH;
    private static Map j6;

    static {
        HashMap map = new HashMap();
        j6 = map;
        map.put(Byte.TYPE, Byte.class);
        j6.put(Boolean.TYPE, Boolean.class);
        j6.put(Character.TYPE, Character.class);
        j6.put(Double.TYPE, Double.class);
        j6.put(Float.TYPE, Float.class);
        j6.put(Integer.TYPE, Integer.class);
        j6.put(Long.TYPE, Long.class);
        j6.put(Short.TYPE, Short.class);
        new TripleKeyHashMap();
        j6(String.class);
        DW = j6(Object.class);
        FH = j6(Object[].class);
    }

    public static boolean DW(Class cls, Class cls2) {
        if (cls == cls2) {
            return true;
        }
        return cls.isAssignableFrom(cls2);
    }

    static void FH(Class cls, Class cls2) {
    }

    public static CachedClass j6(Class cls) {
        if (cls == null) {
            return null;
        }
        return ClassInfo.EQ(cls).tp();
    }
}
