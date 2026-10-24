package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum u90 implements u50 {
    SAFE(0),
    DANGEROUS(1),
    UNKNOWN(2),
    POTENTIALLY_UNWANTED(3),
    DANGEROUS_HOST(4);

    private final int WB;

    u90(int i) {
        this.WB = i;
    }

    public static u90 j6(int i) {
        if (i == 0) {
            return SAFE;
        }
        if (i == 1) {
            return DANGEROUS;
        }
        if (i == 2) {
            return UNKNOWN;
        }
        if (i == 3) {
            return POTENTIALLY_UNWANTED;
        }
        if (i != 4) {
            return null;
        }
        return DANGEROUS_HOST;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        return this.WB;
    }
}
