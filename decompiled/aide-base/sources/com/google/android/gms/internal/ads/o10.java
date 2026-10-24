package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum o10 implements u50 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private final int WB;

    o10(int i) {
        this.WB = i;
    }

    public static o10 j6(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        if (this != UNRECOGNIZED) {
            return this.WB;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
