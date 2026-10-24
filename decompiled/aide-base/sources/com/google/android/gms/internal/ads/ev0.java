package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ev0 extends j90<ev0> {
    public Integer FH = null;
    public Integer Hw = null;
    public Integer v5 = null;

    public ev0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        Integer num = this.FH;
        if (num != null) {
            h90Var.yS(1, num.intValue());
        }
        Integer num2 = this.Hw;
        if (num2 != null) {
            h90Var.yS(2, num2.intValue());
        }
        Integer num3 = this.v5;
        if (num3 != null) {
            h90Var.yS(3, num3.intValue());
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        Integer num = this.FH;
        if (num != null) {
            iGn += h90.vy(1, num.intValue());
        }
        Integer num2 = this.Hw;
        if (num2 != null) {
            iGn += h90.vy(2, num2.intValue());
        }
        Integer num3 = this.v5;
        return num3 != null ? iGn + h90.vy(3, num3.intValue()) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 8) {
                this.FH = Integer.valueOf(g90Var.tp());
            } else if (iZo == 16) {
                this.Hw = Integer.valueOf(g90Var.tp());
            } else if (iZo == 24) {
                this.v5 = Integer.valueOf(g90Var.tp());
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
