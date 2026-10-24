package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bv0 extends j90<bv0> {
    public String FH = null;
    private ju0 Hw = null;
    private Integer v5 = null;
    public ev0 Zo = null;
    private Integer VH = null;
    private uu0 gn = null;
    private uu0 u7 = null;
    private uu0 tp = null;

    public bv0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        String str = this.FH;
        if (str != null) {
            h90Var.EQ(1, str);
        }
        ju0 ju0Var = this.Hw;
        if (ju0Var != null) {
            h90Var.tp(2, ju0Var);
        }
        Integer num = this.v5;
        if (num != null) {
            h90Var.yS(3, num.intValue());
        }
        ev0 ev0Var = this.Zo;
        if (ev0Var != null) {
            h90Var.DW(4, ev0Var);
        }
        Integer num2 = this.VH;
        if (num2 != null) {
            h90Var.yS(5, num2.intValue());
        }
        uu0 uu0Var = this.gn;
        if (uu0Var != null && uu0Var != null) {
            h90Var.yS(6, uu0Var.Hw());
        }
        uu0 uu0Var2 = this.u7;
        if (uu0Var2 != null && uu0Var2 != null) {
            h90Var.yS(7, uu0Var2.Hw());
        }
        uu0 uu0Var3 = this.tp;
        if (uu0Var3 != null && uu0Var3 != null) {
            h90Var.yS(8, uu0Var3.Hw());
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
        ju0 ju0Var = this.Hw;
        if (ju0Var != null) {
            iGn += x40.vJ(2, ju0Var);
        }
        Integer num = this.v5;
        if (num != null) {
            iGn += h90.vy(3, num.intValue());
        }
        ev0 ev0Var = this.Zo;
        if (ev0Var != null) {
            iGn += h90.v5(4, ev0Var);
        }
        Integer num2 = this.VH;
        if (num2 != null) {
            iGn += h90.vy(5, num2.intValue());
        }
        uu0 uu0Var = this.gn;
        if (uu0Var != null && uu0Var != null) {
            iGn += h90.vy(6, uu0Var.Hw());
        }
        uu0 uu0Var2 = this.u7;
        if (uu0Var2 != null && uu0Var2 != null) {
            iGn += h90.vy(7, uu0Var2.Hw());
        }
        uu0 uu0Var3 = this.tp;
        return (uu0Var3 == null || uu0Var3 == null) ? iGn : iGn + h90.vy(8, uu0Var3.Hw());
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
            } else if (iZo == 18) {
                this.Hw = (ju0) g90Var.Hw(ju0.er());
            } else if (iZo == 24) {
                this.v5 = Integer.valueOf(g90Var.tp());
            } else if (iZo == 34) {
                if (this.Zo == null) {
                    this.Zo = new ev0();
                }
                g90Var.v5(this.Zo);
            } else if (iZo == 40) {
                this.VH = Integer.valueOf(g90Var.tp());
            } else if (iZo == 48) {
                int iJ6 = g90Var.j6();
                int iTp = g90Var.tp();
                if (iTp == 0 || iTp == 1 || iTp == 1000) {
                    this.gn = uu0.j6(iTp);
                } else {
                    g90Var.a8(iJ6);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 56) {
                int iJ62 = g90Var.j6();
                int iTp2 = g90Var.tp();
                if (iTp2 == 0 || iTp2 == 1 || iTp2 == 1000) {
                    this.u7 = uu0.j6(iTp2);
                } else {
                    g90Var.a8(iJ62);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 64) {
                int iJ63 = g90Var.j6();
                int iTp3 = g90Var.tp();
                if (iTp3 == 0 || iTp3 == 1 || iTp3 == 1000) {
                    this.tp = uu0.j6(iTp3);
                } else {
                    g90Var.a8(iJ63);
                    u7(g90Var, iZo);
                }
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
