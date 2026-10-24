package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum f10 implements u50 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    private final int WB;

    f10(int i) {
        this.WB = i;
    }

    public static f10 j6(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        if (this != UNRECOGNIZED) {
            return this.WB;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
