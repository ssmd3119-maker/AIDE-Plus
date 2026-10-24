package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final /* synthetic */ class z3 {
    static final /* synthetic */ int[] DW;
    static final /* synthetic */ int[] j6;

    static {
        int[] iArr = new int[m4.values().length];
        DW = iArr;
        try {
            iArr[m4.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            DW[m4.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            DW[m4.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[a4.values().length];
        j6 = iArr2;
        try {
            iArr2[a4.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            j6[a4.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            j6[a4.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
