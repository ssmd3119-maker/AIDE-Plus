package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum g20 implements u50 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private final int WB;

    g20(int i) {
        this.WB = i;
    }

    public static g20 j6(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        if (this != UNRECOGNIZED) {
            return this.WB;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
