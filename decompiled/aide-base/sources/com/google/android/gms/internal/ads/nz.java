package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class nz {
    static final /* synthetic */ int[] DW;
    static final /* synthetic */ int[] FH;
    static final /* synthetic */ int[] j6;

    static {
        int[] iArr = new int[q00.values().length];
        FH = iArr;
        try {
            iArr[q00.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            FH[q00.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            FH[q00.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[e10.values().length];
        DW = iArr2;
        try {
            iArr2[e10.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            DW[e10.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            DW[e10.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[f10.values().length];
        j6 = iArr3;
        try {
            iArr3[f10.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            j6[f10.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            j6[f10.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
