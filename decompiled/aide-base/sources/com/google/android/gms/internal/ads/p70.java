package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;

/* loaded from: classes.dex */
public final class p70 implements x60 {
    private final String DW;
    private final Object[] FH;
    private final int Hw;
    private final z60 j6;

    p70(z60 z60Var, String str, Object[] objArr) {
        this.j6 = z60Var;
        this.DW = str;
        this.FH = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.Hw = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.Hw = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x60
    public final z60 DW() {
        return this.j6;
    }

    @Override // com.google.android.gms.internal.ads.x60
    public final int FH() {
        return (this.Hw & 1) == 1 ? r50.e.u7 : r50.e.tp;
    }

    final String Hw() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.x60
    public final boolean j6() {
        return (this.Hw & 2) == 2;
    }

    final Object[] v5() {
        return this.FH;
    }
}
