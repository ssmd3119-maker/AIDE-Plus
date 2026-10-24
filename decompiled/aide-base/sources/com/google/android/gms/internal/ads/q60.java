package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class q60 implements y60 {
    private y60[] j6;

    q60(y60... y60VarArr) {
        this.j6 = y60VarArr;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final x60 DW(Class<?> cls) {
        for (y60 y60Var : this.j6) {
            if (y60Var.j6(cls)) {
                return y60Var.DW(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean j6(Class<?> cls) {
        for (y60 y60Var : this.j6) {
            if (y60Var.j6(cls)) {
                return true;
            }
        }
        return false;
    }
}
