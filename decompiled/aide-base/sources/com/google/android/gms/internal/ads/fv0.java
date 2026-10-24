package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fv0 extends j90<fv0> {
    private static volatile fv0[] j3;
    private mu0 FH = null;
    private ou0 Hw = null;
    private pu0 v5 = null;
    private qu0 Zo = null;
    private ku0 VH = null;
    private nu0 gn = null;
    private gv0 u7 = null;
    private Integer tp = null;
    private Integer EQ = null;
    private ju0 we = null;
    private Integer J0 = null;
    private Integer J8 = null;
    private Integer Ws = null;
    private Integer QX = null;
    private Integer XL = null;
    private Long aM = null;

    public fv0() {
        this.DW = null;
        this.j6 = -1;
    }

    public static fv0[] tp() {
        if (j3 == null) {
            synchronized (n90.DW) {
                if (j3 == null) {
                    j3 = new fv0[0];
                }
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        mu0 mu0Var = this.FH;
        if (mu0Var != null) {
            h90Var.tp(5, mu0Var);
        }
        ou0 ou0Var = this.Hw;
        if (ou0Var != null) {
            h90Var.tp(6, ou0Var);
        }
        pu0 pu0Var = this.v5;
        if (pu0Var != null) {
            h90Var.tp(7, pu0Var);
        }
        qu0 qu0Var = this.Zo;
        if (qu0Var != null) {
            h90Var.tp(8, qu0Var);
        }
        ku0 ku0Var = this.VH;
        if (ku0Var != null) {
            h90Var.tp(9, ku0Var);
        }
        nu0 nu0Var = this.gn;
        if (nu0Var != null) {
            h90Var.tp(10, nu0Var);
        }
        gv0 gv0Var = this.u7;
        if (gv0Var != null) {
            h90Var.DW(11, gv0Var);
        }
        Integer num = this.tp;
        if (num != null) {
            h90Var.yS(12, num.intValue());
        }
        Integer num2 = this.EQ;
        if (num2 != null) {
            h90Var.yS(13, num2.intValue());
        }
        ju0 ju0Var = this.we;
        if (ju0Var != null) {
            h90Var.tp(14, ju0Var);
        }
        Integer num3 = this.J0;
        if (num3 != null) {
            h90Var.yS(15, num3.intValue());
        }
        Integer num4 = this.J8;
        if (num4 != null) {
            h90Var.yS(16, num4.intValue());
        }
        Integer num5 = this.Ws;
        if (num5 != null) {
            h90Var.yS(17, num5.intValue());
        }
        Integer num6 = this.QX;
        if (num6 != null) {
            h90Var.yS(18, num6.intValue());
        }
        Integer num7 = this.XL;
        if (num7 != null) {
            h90Var.yS(19, num7.intValue());
        }
        Long l = this.aM;
        if (l != null) {
            h90Var.j3(20, l.longValue());
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        mu0 mu0Var = this.FH;
        if (mu0Var != null) {
            iGn += x40.vJ(5, mu0Var);
        }
        ou0 ou0Var = this.Hw;
        if (ou0Var != null) {
            iGn += x40.vJ(6, ou0Var);
        }
        pu0 pu0Var = this.v5;
        if (pu0Var != null) {
            iGn += x40.vJ(7, pu0Var);
        }
        qu0 qu0Var = this.Zo;
        if (qu0Var != null) {
            iGn += x40.vJ(8, qu0Var);
        }
        ku0 ku0Var = this.VH;
        if (ku0Var != null) {
            iGn += x40.vJ(9, ku0Var);
        }
        nu0 nu0Var = this.gn;
        if (nu0Var != null) {
            iGn += x40.vJ(10, nu0Var);
        }
        gv0 gv0Var = this.u7;
        if (gv0Var != null) {
            iGn += h90.v5(11, gv0Var);
        }
        Integer num = this.tp;
        if (num != null) {
            iGn += h90.vy(12, num.intValue());
        }
        Integer num2 = this.EQ;
        if (num2 != null) {
            iGn += h90.vy(13, num2.intValue());
        }
        ju0 ju0Var = this.we;
        if (ju0Var != null) {
            iGn += x40.vJ(14, ju0Var);
        }
        Integer num3 = this.J0;
        if (num3 != null) {
            iGn += h90.vy(15, num3.intValue());
        }
        Integer num4 = this.J8;
        if (num4 != null) {
            iGn += h90.vy(16, num4.intValue());
        }
        Integer num5 = this.Ws;
        if (num5 != null) {
            iGn += h90.vy(17, num5.intValue());
        }
        Integer num6 = this.QX;
        if (num6 != null) {
            iGn += h90.vy(18, num6.intValue());
        }
        Integer num7 = this.XL;
        if (num7 != null) {
            iGn += h90.vy(19, num7.intValue());
        }
        Long l = this.aM;
        return l != null ? iGn + h90.a8(20, l.longValue()) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 42:
                    this.FH = (mu0) g90Var.Hw(mu0.er());
                    break;
                case 50:
                    this.Hw = (ou0) g90Var.Hw(ou0.er());
                    break;
                case 58:
                    this.v5 = (pu0) g90Var.Hw(pu0.er());
                    break;
                case 66:
                    this.Zo = (qu0) g90Var.Hw(qu0.er());
                    break;
                case 74:
                    this.VH = (ku0) g90Var.Hw(ku0.er());
                    break;
                case 82:
                    this.gn = (nu0) g90Var.Hw(nu0.er());
                    break;
                case 90:
                    if (this.u7 == null) {
                        this.u7 = new gv0();
                    }
                    g90Var.v5(this.u7);
                    break;
                case 96:
                    this.tp = Integer.valueOf(g90Var.tp());
                    break;
                case 104:
                    this.EQ = Integer.valueOf(g90Var.tp());
                    break;
                case 114:
                    this.we = (ju0) g90Var.Hw(ju0.er());
                    break;
                case 120:
                    this.J0 = Integer.valueOf(g90Var.tp());
                    break;
                case 128:
                    this.J8 = Integer.valueOf(g90Var.tp());
                    break;
                case 136:
                    this.Ws = Integer.valueOf(g90Var.tp());
                    break;
                case 144:
                    this.QX = Integer.valueOf(g90Var.tp());
                    break;
                case 152:
                    this.XL = Integer.valueOf(g90Var.tp());
                    break;
                case 160:
                    this.aM = Long.valueOf(g90Var.EQ());
                    break;
                default:
                    if (!super.u7(g90Var, iZo)) {
                        return this;
                    }
                    break;
            }
        }
    }
}
