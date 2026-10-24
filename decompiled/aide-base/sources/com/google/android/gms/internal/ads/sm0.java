package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class sm0 extends qm0 implements em0 {
    private final vm0 Zo;

    public sm0(String str, long j, zzfs zzfsVar, String str2, vm0 vm0Var, List<nm0> list) {
        super(str, -1L, zzfsVar, str2, vm0Var, list);
        this.Zo = vm0Var;
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final int DW(long j, long j2) {
        vm0 vm0Var = this.Zo;
        int i = vm0Var.Hw;
        int iFH = vm0Var.FH(j2);
        if (iFH == 0) {
            return i;
        }
        if (vm0Var.Zo == null) {
            int i2 = vm0Var.Hw + ((int) (j / ((vm0Var.v5 * 1000000) / vm0Var.DW)));
            return i2 < i ? i : iFH == -1 ? i2 : Math.min(i2, (i + iFH) - 1);
        }
        int i3 = (iFH + i) - 1;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            long jHw = vm0Var.Hw(i5);
            if (jHw < j) {
                i4 = i5 + 1;
            } else {
                if (jHw <= j) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return i4 == i ? i4 : i3;
    }

    @Override // com.google.android.gms.internal.ads.qm0
    public final em0 EQ() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final int FH(long j) {
        return this.Zo.FH(j);
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final long Hw(int i) {
        return this.Zo.Hw(i);
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final pm0 VH(int i) {
        return this.Zo.DW(this, i);
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final long Zo(int i, long j) {
        vm0 vm0Var = this.Zo;
        List<ym0> list = vm0Var.Zo;
        if (list != null) {
            return (list.get(i - vm0Var.Hw).DW * 1000000) / vm0Var.DW;
        }
        int iFH = vm0Var.FH(j);
        return (iFH == -1 || i != (vm0Var.Hw + iFH) + (-1)) ? (vm0Var.v5 * 1000000) / vm0Var.DW : j - vm0Var.Hw(i);
    }

    @Override // com.google.android.gms.internal.ads.qm0
    public final String gn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final boolean j6() {
        return this.Zo.v5();
    }

    @Override // com.google.android.gms.internal.ads.qm0
    public final pm0 tp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.em0
    public final int v5() {
        return this.Zo.Hw;
    }
}
