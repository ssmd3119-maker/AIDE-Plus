package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;

/* loaded from: classes.dex */
public final class q50 implements y60 {
    private static final q50 j6 = new q50();

    private q50() {
    }

    public static q50 FH() {
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final x60 DW(Class<?> cls) {
        if (!r50.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (x60) r50.rN(cls.asSubclass(r50.class)).J8(r50.e.FH, null, null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean j6(Class<?> cls) {
        return r50.class.isAssignableFrom(cls);
    }
}
