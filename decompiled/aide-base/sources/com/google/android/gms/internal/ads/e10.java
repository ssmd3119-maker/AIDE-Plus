package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum e10 implements u50 {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);

    private final int WB;

    e10(int i) {
        this.WB = i;
    }

    public static e10 j6(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i != 4) {
            return null;
        }
        return NIST_P521;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        if (this != UNRECOGNIZED) {
            return this.WB;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
