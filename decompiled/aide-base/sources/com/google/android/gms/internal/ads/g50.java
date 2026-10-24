package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g50 {
    private static final e50<?> j6 = new f50();
    private static final e50<?> DW = j6();

    static e50<?> DW() {
        return j6;
    }

    static e50<?> FH() {
        e50<?> e50Var = DW;
        if (e50Var != null) {
            return e50Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static e50<?> j6() {
        try {
            return (e50) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
