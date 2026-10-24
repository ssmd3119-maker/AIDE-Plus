package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;

/* loaded from: classes.dex */
public final class d4 implements k5 {
    private static final d4 j6 = new d4();

    private d4() {
    }

    public static d4 FH() {
        return j6;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final j5 DW(Class<?> cls) {
        if (!e4.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (j5) e4.XL(cls.asSubclass(e4.class)).we(e4.e.FH, null, null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final boolean j6(Class<?> cls) {
        return e4.class.isAssignableFrom(cls);
    }
}
