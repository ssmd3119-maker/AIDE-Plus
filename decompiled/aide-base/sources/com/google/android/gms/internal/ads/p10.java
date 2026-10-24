package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p10 extends j90<p10> {
    private Long FH = null;
    private Long Hw = null;
    public Long v5 = null;
    public Long Zo = null;
    public Long VH = null;

    public p10() {
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        Long l = this.FH;
        if (l != null) {
            h90Var.rN(1, l.longValue());
        }
        Long l2 = this.Hw;
        if (l2 != null) {
            h90Var.rN(2, l2.longValue());
        }
        Long l3 = this.v5;
        if (l3 != null) {
            h90Var.rN(3, l3.longValue());
        }
        Long l4 = this.Zo;
        if (l4 != null) {
            h90Var.rN(4, l4.longValue());
        }
        Long l5 = this.VH;
        if (l5 != null) {
            h90Var.rN(5, l5.longValue());
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        Long l = this.FH;
        if (l != null) {
            iGn += h90.U2(1, l.longValue());
        }
        Long l2 = this.Hw;
        if (l2 != null) {
            iGn += h90.U2(2, l2.longValue());
        }
        Long l3 = this.v5;
        if (l3 != null) {
            iGn += h90.U2(3, l3.longValue());
        }
        Long l4 = this.Zo;
        if (l4 != null) {
            iGn += h90.U2(4, l4.longValue());
        }
        Long l5 = this.VH;
        return l5 != null ? iGn + h90.U2(5, l5.longValue()) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 8) {
                this.FH = Long.valueOf(g90Var.EQ());
            } else if (iZo == 16) {
                this.Hw = Long.valueOf(g90Var.EQ());
            } else if (iZo == 24) {
                this.v5 = Long.valueOf(g90Var.EQ());
            } else if (iZo == 32) {
                this.Zo = Long.valueOf(g90Var.EQ());
            } else if (iZo == 40) {
                this.VH = Long.valueOf(g90Var.EQ());
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
