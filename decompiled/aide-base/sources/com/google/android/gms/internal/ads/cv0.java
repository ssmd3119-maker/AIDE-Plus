package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cv0 extends j90<cv0> {
    private zt0 FH = null;
    private ev0 Hw = null;
    private String v5 = null;
    private String Zo = null;

    public cv0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        zt0 zt0Var = this.FH;
        if (zt0Var != null && zt0Var != null) {
            h90Var.yS(5, zt0Var.Hw());
        }
        ev0 ev0Var = this.Hw;
        if (ev0Var != null) {
            h90Var.DW(6, ev0Var);
        }
        String str = this.v5;
        if (str != null) {
            h90Var.EQ(7, str);
        }
        String str2 = this.Zo;
        if (str2 != null) {
            h90Var.EQ(8, str2);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        zt0 zt0Var = this.FH;
        if (zt0Var != null && zt0Var != null) {
            iGn += h90.vy(5, zt0Var.Hw());
        }
        ev0 ev0Var = this.Hw;
        if (ev0Var != null) {
            iGn += h90.v5(6, ev0Var);
        }
        String str = this.v5;
        if (str != null) {
            iGn += h90.QX(7, str);
        }
        String str2 = this.Zo;
        return str2 != null ? iGn + h90.QX(8, str2) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 40) {
                int iJ6 = g90Var.j6();
                int iTp = g90Var.tp();
                if (iTp == 0 || iTp == 1 || iTp == 2) {
                    this.FH = zt0.j6(iTp);
                } else {
                    g90Var.a8(iJ6);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 50) {
                if (this.Hw == null) {
                    this.Hw = new ev0();
                }
                g90Var.v5(this.Hw);
            } else if (iZo == 58) {
                this.v5 = g90Var.FH();
            } else if (iZo == 66) {
                this.Zo = g90Var.FH();
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
