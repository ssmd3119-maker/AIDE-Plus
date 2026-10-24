package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public abstract class vm0 extends um0 {
    final int Hw;
    final List<ym0> Zo;
    final long v5;

    public vm0(pm0 pm0Var, long j, long j2, int i, long j3, List<ym0> list) {
        super(pm0Var, j, j2);
        this.Hw = i;
        this.v5 = j3;
        this.Zo = list;
    }

    public abstract pm0 DW(qm0 qm0Var, int i);

    public abstract int FH(long j);

    public final long Hw(int i) {
        List<ym0> list = this.Zo;
        return ip0.Hw(list != null ? list.get(i - this.Hw).j6 - this.FH : (i - this.Hw) * this.v5, 1000000L, this.DW);
    }

    public boolean v5() {
        return this.Zo != null;
    }
}
