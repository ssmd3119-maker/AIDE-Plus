package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fa0 extends j90<fa0> {
    public String FH = null;
    public Long Hw = null;
    public Boolean v5 = null;

    public fa0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        String str = this.FH;
        if (str != null) {
            h90Var.EQ(1, str);
        }
        Long l = this.Hw;
        if (l != null) {
            h90Var.rN(2, l.longValue());
        }
        Boolean bool = this.v5;
        if (bool != null) {
            h90Var.Mr(3, bool.booleanValue());
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        String str = this.FH;
        if (str != null) {
            iGn += h90.QX(1, str);
        }
        Long l = this.Hw;
        if (l != null) {
            iGn += h90.U2(2, l.longValue());
        }
        Boolean bool = this.v5;
        if (bool == null) {
            return iGn;
        }
        bool.booleanValue();
        return iGn + h90.we(3) + 1;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 10) {
                this.FH = g90Var.FH();
            } else if (iZo == 16) {
                this.Hw = Long.valueOf(g90Var.VH());
            } else if (iZo == 24) {
                this.v5 = Boolean.valueOf(g90Var.u7());
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
