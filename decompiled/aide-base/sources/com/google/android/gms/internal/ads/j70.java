package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j70 {
    private static final h70 j6 = FH();
    private static final h70 DW = new i70();

    static h70 DW() {
        return DW;
    }

    private static h70 FH() {
        try {
            return (h70) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static h70 j6() {
        return j6;
    }
}
