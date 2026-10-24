package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class c5 implements k5 {
    private k5[] j6;

    c5(k5... k5VarArr) {
        this.j6 = k5VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final j5 DW(Class<?> cls) {
        for (k5 k5Var : this.j6) {
            if (k5Var.j6(cls)) {
                return k5Var.DW(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final boolean j6(Class<?> cls) {
        for (k5 k5Var : this.j6) {
            if (k5Var.j6(cls)) {
                return true;
            }
        }
        return false;
    }
}
