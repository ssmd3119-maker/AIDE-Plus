package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class u3 {
    private static final s3<?> j6 = new t3();
    private static final s3<?> DW = j6();

    static s3<?> DW() {
        return j6;
    }

    static s3<?> FH() {
        s3<?> s3Var = DW;
        if (s3Var != null) {
            return s3Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static s3<?> j6() {
        try {
            return (s3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
