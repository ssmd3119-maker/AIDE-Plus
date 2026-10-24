package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class l50 {
    static final /* synthetic */ int[] DW;
    static final /* synthetic */ int[] j6;

    static {
        int[] iArr = new int[a60.values().length];
        DW = iArr;
        try {
            iArr[a60.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            DW[a60.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            DW[a60.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[m50.values().length];
        j6 = iArr2;
        try {
            iArr2[m50.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            j6[m50.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            j6[m50.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
