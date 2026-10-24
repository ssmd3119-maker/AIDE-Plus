package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class sb {
    static final /* synthetic */ int[] DW;
    private static final /* synthetic */ int[] j6;

    static {
        int[] iArr = new int[abcd.iu.values().length];
        DW = iArr;
        try {
            iArr[abcd.iu.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            DW[abcd.iu.INVALID_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            DW[abcd.iu.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            DW[abcd.iu.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[abcd.ju.values().length];
        j6 = iArr2;
        try {
            iArr2[abcd.ju.FEMALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            j6[abcd.ju.MALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            j6[abcd.ju.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
