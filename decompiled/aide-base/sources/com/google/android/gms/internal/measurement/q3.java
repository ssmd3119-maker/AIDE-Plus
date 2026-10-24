package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class q3 {
    private static final Class<?> j6 = DW();

    private static Class<?> DW() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static r3 FH() {
        if (j6 != null) {
            try {
                return j6("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return r3.FH;
    }

    static r3 Hw() {
        r3 r3VarJ6;
        if (j6 != null) {
            try {
                r3VarJ6 = j6("loadGeneratedRegistry");
            } catch (Exception unused) {
            }
        } else {
            r3VarJ6 = null;
        }
        if (r3VarJ6 == null) {
            r3VarJ6 = r3.DW();
        }
        return r3VarJ6 == null ? FH() : r3VarJ6;
    }

    private static final r3 j6(String str) {
        return (r3) j6.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
