package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum uu0 implements u50 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);

    private final int WB;

    uu0(int i) {
        this.WB = i;
    }

    public static v50 DW() {
        return vu0.j6;
    }

    public static uu0 j6(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        return this.WB;
    }
}
