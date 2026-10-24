package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum q00 implements u50 {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    private final int WB;

    q00(int i) {
        this.WB = i;
    }

    public static q00 j6(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        if (this != UNRECOGNIZED) {
            return this.WB;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
