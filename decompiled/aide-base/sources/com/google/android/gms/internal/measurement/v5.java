package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class v5 {
    private static final t5 j6 = FH();
    private static final t5 DW = new u5();

    static t5 DW() {
        return DW;
    }

    private static t5 FH() {
        try {
            return (t5) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static t5 j6() {
        return j6;
    }
}
