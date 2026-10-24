package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class w20 {
    static final /* synthetic */ int[] DW;
    static final /* synthetic */ int[] j6;

    static {
        int[] iArr = new int[x20.values().length];
        DW = iArr;
        try {
            iArr[x20.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            DW[x20.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            DW[x20.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[y20.values().length];
        j6 = iArr2;
        try {
            iArr2[y20.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            j6[y20.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            j6[y20.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
