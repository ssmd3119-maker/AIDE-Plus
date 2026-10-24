package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;

/* loaded from: classes.dex */
public final class a6 implements j5 {
    private final String DW;
    private final Object[] FH;
    private final int Hw;
    private final l5 j6;

    a6(l5 l5Var, String str, Object[] objArr) {
        this.j6 = l5Var;
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

    @Override // com.google.android.gms.internal.measurement.j5
    public final boolean DW() {
        return (this.Hw & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.j5
    public final int FH() {
        return (this.Hw & 1) == 1 ? e4.e.u7 : e4.e.tp;
    }

    final String Hw() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.measurement.j5
    public final l5 j6() {
        return this.j6;
    }

    final Object[] v5() {
        return this.FH;
    }
}
