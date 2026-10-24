package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class m70 {
    private static final m70 FH = new m70();
    private final ConcurrentMap<Class<?>, r70<?>> DW = new ConcurrentHashMap();
    private final s70 j6;

    private m70() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        s70 s70VarHw = null;
        for (int i = 0; i <= 0; i++) {
            s70VarHw = Hw(strArr[0]);
            if (s70VarHw != null) {
                break;
            }
        }
        this.j6 = s70VarHw == null ? new o60() : s70VarHw;
    }

    public static m70 DW() {
        return FH;
    }

    private static s70 Hw(String str) {
        try {
            return (s70) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> r70<T> FH(Class<T> cls) {
        t50.Hw(cls, "messageType");
        r70<T> r70Var = (r70) this.DW.get(cls);
        if (r70Var != null) {
            return r70Var;
        }
        r70<T> r70VarJ6 = this.j6.j6(cls);
        t50.Hw(cls, "messageType");
        t50.Hw(r70VarJ6, "schema");
        r70<T> r70Var2 = (r70) this.DW.putIfAbsent(cls, r70VarJ6);
        return r70Var2 != null ? r70Var2 : r70VarJ6;
    }

    public final <T> r70<T> j6(T t) {
        return FH(t.getClass());
    }
}
