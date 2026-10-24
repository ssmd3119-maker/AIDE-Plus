package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h5 implements g5 {
    h5() {
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final int DW(int i, Object obj, Object obj2) {
        f5 f5Var = (f5) obj;
        if (f5Var.isEmpty()) {
            return 0;
        }
        Iterator it = f5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Map<?, ?> FH(Object obj) {
        return (f5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object Hw(Object obj) {
        ((f5) obj).Zo();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final e5<?, ?> VH(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final boolean Zo(Object obj) {
        return !((f5) obj).j6();
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Map<?, ?> gn(Object obj) {
        return (f5) obj;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object j6(Object obj, Object obj2) {
        f5 f5VarGn = (f5) obj;
        f5 f5Var = (f5) obj2;
        if (!f5Var.isEmpty()) {
            if (!f5VarGn.j6()) {
                f5VarGn = f5VarGn.gn();
            }
            f5VarGn.FH(f5Var);
        }
        return f5VarGn;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object v5(Object obj) {
        return f5.VH().gn();
    }
}
