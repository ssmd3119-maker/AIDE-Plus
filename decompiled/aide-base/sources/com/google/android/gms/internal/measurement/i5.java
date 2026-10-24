package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class i5 {
    private static final g5 j6 = FH();
    private static final g5 DW = new h5();

    static g5 DW() {
        return DW;
    }

    private static g5 FH() {
        try {
            return (g5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static g5 j6() {
        return j6;
    }
}
