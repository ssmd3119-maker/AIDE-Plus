package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum zt0 implements u50 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);

    private final int WB;

    zt0(int i) {
        this.WB = i;
    }

    public static zt0 j6(int i) {
        if (i == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i == 1) {
            return IOS;
        }
        if (i != 2) {
            return null;
        }
        return ANDROID;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final int Hw() {
        return this.WB;
    }
}
