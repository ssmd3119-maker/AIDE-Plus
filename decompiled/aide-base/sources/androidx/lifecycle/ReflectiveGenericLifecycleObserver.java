package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    static final Map<Class, a> FH = new HashMap();
    private final a DW;
    private final Object j6;

    static class a {
        final Map<b, Lifecycle.Event> DW;
        final Map<Lifecycle.Event, List<b>> j6 = new HashMap();

        a(Map<b, Lifecycle.Event> map) {
            this.DW = map;
            for (Map.Entry<b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<b> arrayList = this.j6.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.j6.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }
    }

    static class b {
        final Method DW;
        final int j6;

        b(int i, Method method) {
            this.j6 = i;
            this.DW = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.j6 == bVar.j6 && this.DW.getName().equals(bVar.DW.getName());
        }

        public int hashCode() {
            return (this.j6 * 31) + this.DW.getName().hashCode();
        }
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.j6 = obj;
        this.DW = FH(obj.getClass());
    }

    private static a DW(Class cls) throws SecurityException {
        int i;
        a aVarFH;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarFH = FH(superclass)) != null) {
            map.putAll(aVarFH.DW);
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : FH(cls2).DW.entrySet()) {
                VH(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        for (Method method : declaredMethods) {
            e eVar = (e) method.getAnnotation(e.class);
            if (eVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle.Event eventValue = eVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                VH(map, new b(i, method), eventValue, cls);
            }
        }
        a aVar = new a(map);
        FH.put(cls, aVar);
        return aVar;
    }

    private static a FH(Class cls) {
        a aVar = FH.get(cls);
        return aVar != null ? aVar : DW(cls);
    }

    private void Hw(b bVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            int i = bVar.j6;
            if (i == 0) {
                bVar.DW.invoke(this.j6, new Object[0]);
            } else if (i == 1) {
                bVar.DW.invoke(this.j6, lifecycleOwner);
            } else {
                if (i != 2) {
                    return;
                }
                bVar.DW.invoke(this.j6, lifecycleOwner, event);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("Failed to call observer method", e2.getCause());
        }
    }

    private static void VH(Map<b, Lifecycle.Event> map, b bVar, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.DW.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    private void Zo(List<b> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Hw(list.get(size), lifecycleOwner, event);
            }
        }
    }

    private void v5(a aVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Zo(aVar.j6.get(event), lifecycleOwner, event);
        Zo(aVar.j6.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.GenericLifecycleObserver
    public void j6(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        v5(this.DW, lifecycleOwner, event);
    }
}
