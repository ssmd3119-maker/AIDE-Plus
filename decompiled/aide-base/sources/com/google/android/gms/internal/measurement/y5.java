package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class y5 {
    private static final y5 FH = new y5();
    private final ConcurrentMap<Class<?>, c6<?>> DW = new ConcurrentHashMap();
    private final d6 j6 = new a5();

    private y5() {
    }

    public static y5 FH() {
        return FH;
    }

    public final <T> c6<T> DW(Class<T> cls) {
        g4.Hw(cls, "messageType");
        c6<T> c6Var = (c6) this.DW.get(cls);
        if (c6Var != null) {
            return c6Var;
        }
        c6<T> c6VarJ6 = this.j6.j6(cls);
        g4.Hw(cls, "messageType");
        g4.Hw(c6VarJ6, "schema");
        c6<T> c6Var2 = (c6) this.DW.putIfAbsent(cls, c6VarJ6);
        return c6Var2 != null ? c6Var2 : c6VarJ6;
    }

    public final <T> c6<T> j6(T t) {
        return DW(t.getClass());
    }
}
