package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class xm0 extends vm0 {
    final cn0 VH;
    final cn0 gn;

    public xm0(pm0 pm0Var, long j, long j2, int i, long j3, List<ym0> list, cn0 cn0Var, cn0 cn0Var2) {
        super(pm0Var, j, j2, i, j3, list);
        this.VH = cn0Var;
        this.gn = cn0Var2;
    }

    @Override // com.google.android.gms.internal.ads.vm0
    public final pm0 DW(qm0 qm0Var, int i) {
        List<ym0> list = this.Zo;
        long j = list != null ? list.get(i - this.Hw).j6 : (i - this.Hw) * this.v5;
        cn0 cn0Var = this.gn;
        zzfs zzfsVar = qm0Var.j6;
        return new pm0(cn0Var.j6(zzfsVar.WB, i, zzfsVar.mb, j), 0L, -1L);
    }

    @Override // com.google.android.gms.internal.ads.vm0
    public final int FH(long j) {
        List<ym0> list = this.Zo;
        if (list != null) {
            return list.size();
        }
        if (j != -9223372036854775807L) {
            return (int) ip0.lg(j, (this.v5 * 1000000) / this.DW);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.um0
    public final pm0 j6(qm0 qm0Var) {
        cn0 cn0Var = this.VH;
        if (cn0Var == null) {
            return super.j6(qm0Var);
        }
        zzfs zzfsVar = qm0Var.j6;
        return new pm0(cn0Var.j6(zzfsVar.WB, 0, zzfsVar.mb, 0L), 0L, -1L);
    }
}
