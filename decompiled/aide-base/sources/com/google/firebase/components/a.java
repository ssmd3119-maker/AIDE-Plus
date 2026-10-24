package com.google.firebase.components;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<T> {
    private final Set<e> DW;
    private final int FH;
    private final c<T> Hw;
    private final Set<Class<? super T>> j6;
    private final Set<Class<?>> v5;

    /* renamed from: com.google.firebase.components.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0115a<T> {
        private final l<T> DW;
        private final T j6;

        private C0115a(T t, l<T> lVar) {
            this.j6 = t;
            this.DW = lVar;
        }

        static List<a<?>> FH(List<a<?>> list) {
            n nVar;
            HashMap map = new HashMap(list.size());
            for (a<?> aVar : list) {
                n nVar2 = new n(aVar);
                for (Class<? super Object> cls : aVar.v5()) {
                    if (map.put(cls, nVar2) != null) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            }
            for (n nVar3 : map.values()) {
                for (e eVar : nVar3.FH().Zo()) {
                    if (eVar.Hw() && (nVar = (n) map.get(eVar.DW())) != null) {
                        nVar3.DW(nVar);
                        nVar.Hw(nVar3);
                    }
                }
            }
            HashSet<n> hashSet = new HashSet(map.values());
            Set<n> setHw = Hw(hashSet);
            ArrayList arrayList = new ArrayList();
            while (!setHw.isEmpty()) {
                n next = setHw.iterator().next();
                setHw.remove(next);
                arrayList.add(next.FH());
                for (n nVar4 : next.j6()) {
                    nVar4.v5(next);
                    if (nVar4.Zo()) {
                        setHw.add(nVar4);
                    }
                }
            }
            if (arrayList.size() == list.size()) {
                Collections.reverse(arrayList);
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (n nVar5 : hashSet) {
                if (!nVar5.Zo() && !nVar5.VH()) {
                    arrayList2.add(nVar5.FH());
                }
            }
            throw new f(arrayList2);
        }

        private static Set<n> Hw(Set<n> set) {
            HashSet hashSet = new HashSet();
            for (n nVar : set) {
                if (nVar.Zo()) {
                    hashSet.add(nVar);
                }
            }
            return hashSet;
        }

        public static C0115a<Context> j6(Context context) {
            return new C0115a<>(context, new k((byte) 0));
        }

        private static List<d> v5(List<String> list) throws ClassNotFoundException {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                try {
                    Class<?> cls = Class.forName(str);
                    if (d.class.isAssignableFrom(cls)) {
                        arrayList.add((d) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } else {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                    }
                } catch (ClassNotFoundException e) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str), e);
                } catch (IllegalAccessException e2) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e2);
                } catch (InstantiationException e3) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e3);
                } catch (NoSuchMethodException e4) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e4);
                } catch (InvocationTargetException e5) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e5);
                }
            }
            return arrayList;
        }

        public List<d> DW() {
            return v5(this.DW.j6(this.j6));
        }
    }

    public static class b<T> {
        private final Set<e> DW;
        private int FH;
        private c<T> Hw;
        private final Set<Class<? super T>> j6;
        private Set<Class<?>> v5;

        /* synthetic */ b(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        private b<T> Zo(int i) {
            com.google.android.gms.common.internal.p.J0(this.FH == 0, "Instantiation type has already been set.");
            this.FH = i;
            return this;
        }

        public b<T> DW() {
            Zo(1);
            return this;
        }

        public a<T> FH() {
            com.google.android.gms.common.internal.p.J0(this.Hw != null, "Missing required property: factory.");
            return new a<>(new HashSet(this.j6), new HashSet(this.DW), this.FH, this.Hw, this.v5, (byte) 0);
        }

        public b<T> Hw() {
            Zo(2);
            return this;
        }

        public b<T> j6(e eVar) {
            com.google.android.gms.common.internal.p.tp(eVar, "Null dependency");
            com.google.android.gms.common.internal.p.DW(!this.j6.contains(eVar.DW()), "Components are not allowed to depend on interfaces they themselves provide.");
            this.DW.add(eVar);
            return this;
        }

        public b<T> v5(c<T> cVar) {
            com.google.android.gms.common.internal.p.tp(cVar, "Null factory");
            this.Hw = cVar;
            return this;
        }

        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.j6 = new HashSet();
            this.DW = new HashSet();
            this.FH = 0;
            this.v5 = new HashSet();
            com.google.android.gms.common.internal.p.tp(cls, "Null interface");
            this.j6.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                com.google.android.gms.common.internal.p.tp(cls2, "Null interface");
            }
            Collections.addAll(this.j6, clsArr);
        }
    }

    /* synthetic */ a(Set set, Set set2, int i, c cVar, Set set3, byte b2) {
        this(set, set2, i, cVar, set3);
    }

    public static <T> b<T> DW(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr, (byte) 0);
    }

    @SafeVarargs
    public static <T> a<T> FH(T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVarDW = DW(cls, clsArr);
        bVarDW.v5(j.DW(t));
        return bVarDW.FH();
    }

    static /* synthetic */ Object Hw(Object obj) {
        return obj;
    }

    public static <T> b<T> j6(Class<T> cls) {
        return new b<>(cls, new Class[0], (byte) 0);
    }

    public final c<T> VH() {
        return this.Hw;
    }

    public final Set<e> Zo() {
        return this.DW;
    }

    public final Set<Class<?>> gn() {
        return this.v5;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.j6.toArray()) + ">{" + this.FH + ", deps=" + Arrays.toString(this.DW.toArray()) + "}";
    }

    public final boolean tp() {
        return this.FH == 2;
    }

    public final boolean u7() {
        return this.FH == 1;
    }

    public final Set<Class<? super T>> v5() {
        return this.j6;
    }

    private a(Set<Class<? super T>> set, Set<e> set2, int i, c<T> cVar, Set<Class<?>> set3) {
        this.j6 = Collections.unmodifiableSet(set);
        this.DW = Collections.unmodifiableSet(set2);
        this.FH = i;
        this.Hw = cVar;
        this.v5 = Collections.unmodifiableSet(set3);
    }
}
