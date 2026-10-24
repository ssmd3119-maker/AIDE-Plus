package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w60 {
    private static final u60 j6 = FH();
    private static final u60 DW = new v60();

    static u60 DW() {
        return DW;
    }

    private static u60 FH() {
        try {
            return (u60) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static u60 j6() {
        return j6;
    }
}
