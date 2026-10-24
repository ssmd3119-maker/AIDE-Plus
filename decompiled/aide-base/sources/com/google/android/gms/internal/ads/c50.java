package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c50 {
    private static final Class<?> j6 = j6();

    public static d50 DW() {
        if (j6 != null) {
            try {
                return Hw("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return d50.FH;
    }

    static d50 FH() {
        d50 d50VarHw;
        if (j6 != null) {
            try {
                d50VarHw = Hw("loadGeneratedRegistry");
            } catch (Exception unused) {
            }
        } else {
            d50VarHw = null;
        }
        if (d50VarHw == null) {
            d50VarHw = d50.DW();
        }
        return d50VarHw == null ? DW() : d50VarHw;
    }

    private static final d50 Hw(String str) {
        return (d50) j6.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> j6() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
