package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class wm0 extends vm0 {
    final List<pm0> VH;

    public wm0(pm0 pm0Var, long j, long j2, int i, long j3, List<ym0> list, List<pm0> list2) {
        super(pm0Var, j, j2, i, j3, list);
        this.VH = list2;
    }

    @Override // com.google.android.gms.internal.ads.vm0
    public final pm0 DW(qm0 qm0Var, int i) {
        return this.VH.get(i - this.Hw);
    }

    @Override // com.google.android.gms.internal.ads.vm0
    public final int FH(long j) {
        return this.VH.size();
    }

    @Override // com.google.android.gms.internal.ads.vm0
    public final boolean v5() {
        return true;
    }
}
