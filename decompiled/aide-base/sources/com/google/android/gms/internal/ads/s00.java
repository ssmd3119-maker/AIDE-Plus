package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class s00 extends j90<s00> {
    private static volatile s00[] rN;
    public Integer J0;
    public Integer u7;
    public Long FH = null;
    public Long Hw = null;
    public Long v5 = null;
    public Long Zo = null;
    public Long VH = null;
    public Long gn = null;
    public Long tp = null;
    public Long EQ = null;
    public Long we = null;
    public Long J8 = null;
    public Long Ws = null;
    public Long QX = null;
    public Long XL = null;
    public Long aM = null;
    public Long j3 = null;
    public Long Mr = null;
    public Long U2 = null;
    private Long a8 = null;
    private Long lg = null;

    public s00() {
        this.j6 = -1;
    }

    public static s00[] EQ() {
        if (rN == null) {
            synchronized (n90.DW) {
                if (rN == null) {
                    rN = new s00[0];
                }
            }
        }
        return rN;
    }

    private final s00 tp(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 8:
                    this.FH = Long.valueOf(g90Var.EQ());
                    break;
                case 16:
                    this.Hw = Long.valueOf(g90Var.EQ());
                    break;
                case 24:
                    this.v5 = Long.valueOf(g90Var.EQ());
                    break;
                case 32:
                    this.Zo = Long.valueOf(g90Var.EQ());
                    break;
                case 40:
                    this.VH = Long.valueOf(g90Var.EQ());
                    break;
                case 48:
                    this.gn = Long.valueOf(g90Var.EQ());
                    break;
                case 56:
                    int iJ6 = g90Var.j6();
                    try {
                        int iTp = g90Var.tp();
                        ry.j6(iTp);
                        this.u7 = Integer.valueOf(iTp);
                        break;
                    } catch (IllegalArgumentException unused) {
                        g90Var.a8(iJ6);
                        u7(g90Var, iZo);
                        break;
                    }
                case 64:
                    this.tp = Long.valueOf(g90Var.EQ());
                    break;
                case 72:
                    this.EQ = Long.valueOf(g90Var.EQ());
                    break;
                case 80:
                    this.we = Long.valueOf(g90Var.EQ());
                    break;
                case 88:
                    int iJ62 = g90Var.j6();
                    try {
                        int iTp2 = g90Var.tp();
                        ry.j6(iTp2);
                        this.J0 = Integer.valueOf(iTp2);
                        break;
                    } catch (IllegalArgumentException unused2) {
                        g90Var.a8(iJ62);
                        u7(g90Var, iZo);
                        break;
                    }
                case 96:
                    this.J8 = Long.valueOf(g90Var.EQ());
                    break;
                case 104:
                    this.Ws = Long.valueOf(g90Var.EQ());
                    break;
                case 112:
                    this.QX = Long.valueOf(g90Var.EQ());
                    break;
                case 120:
                    this.XL = Long.valueOf(g90Var.EQ());
                    break;
                case 128:
                    this.aM = Long.valueOf(g90Var.EQ());
                    break;
                case 136:
                    this.j3 = Long.valueOf(g90Var.EQ());
                    break;
                case 144:
                    this.Mr = Long.valueOf(g90Var.EQ());
                    break;
                case 152:
                    this.U2 = Long.valueOf(g90Var.EQ());
                    break;
                case 160:
                    this.a8 = Long.valueOf(g90Var.EQ());
                    break;
                case 168:
                    this.lg = Long.valueOf(g90Var.EQ());
                    break;
                default:
                    if (!super.u7(g90Var, iZo)) {
                        return this;
                    }
                    break;
            }
        }
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
        Long l6 = this.gn;
        if (l6 != null) {
            h90Var.rN(6, l6.longValue());
        }
        Integer num = this.u7;
        if (num != null) {
            h90Var.yS(7, num.intValue());
        }
        Long l7 = this.tp;
        if (l7 != null) {
            h90Var.rN(8, l7.longValue());
        }
        Long l8 = this.EQ;
        if (l8 != null) {
            h90Var.rN(9, l8.longValue());
        }
        Long l9 = this.we;
        if (l9 != null) {
            h90Var.rN(10, l9.longValue());
        }
        Integer num2 = this.J0;
        if (num2 != null) {
            h90Var.yS(11, num2.intValue());
        }
        Long l10 = this.J8;
        if (l10 != null) {
            h90Var.rN(12, l10.longValue());
        }
        Long l11 = this.Ws;
        if (l11 != null) {
            h90Var.rN(13, l11.longValue());
        }
        Long l12 = this.QX;
        if (l12 != null) {
            h90Var.rN(14, l12.longValue());
        }
        Long l13 = this.XL;
        if (l13 != null) {
            h90Var.rN(15, l13.longValue());
        }
        Long l14 = this.aM;
        if (l14 != null) {
            h90Var.rN(16, l14.longValue());
        }
        Long l15 = this.j3;
        if (l15 != null) {
            h90Var.rN(17, l15.longValue());
        }
        Long l16 = this.Mr;
        if (l16 != null) {
            h90Var.rN(18, l16.longValue());
        }
        Long l17 = this.U2;
        if (l17 != null) {
            h90Var.rN(19, l17.longValue());
        }
        Long l18 = this.a8;
        if (l18 != null) {
            h90Var.rN(20, l18.longValue());
        }
        Long l19 = this.lg;
        if (l19 != null) {
            h90Var.rN(21, l19.longValue());
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
        if (l5 != null) {
            iGn += h90.U2(5, l5.longValue());
        }
        Long l6 = this.gn;
        if (l6 != null) {
            iGn += h90.U2(6, l6.longValue());
        }
        Integer num = this.u7;
        if (num != null) {
            iGn += h90.vy(7, num.intValue());
        }
        Long l7 = this.tp;
        if (l7 != null) {
            iGn += h90.U2(8, l7.longValue());
        }
        Long l8 = this.EQ;
        if (l8 != null) {
            iGn += h90.U2(9, l8.longValue());
        }
        Long l9 = this.we;
        if (l9 != null) {
            iGn += h90.U2(10, l9.longValue());
        }
        Integer num2 = this.J0;
        if (num2 != null) {
            iGn += h90.vy(11, num2.intValue());
        }
        Long l10 = this.J8;
        if (l10 != null) {
            iGn += h90.U2(12, l10.longValue());
        }
        Long l11 = this.Ws;
        if (l11 != null) {
            iGn += h90.U2(13, l11.longValue());
        }
        Long l12 = this.QX;
        if (l12 != null) {
            iGn += h90.U2(14, l12.longValue());
        }
        Long l13 = this.XL;
        if (l13 != null) {
            iGn += h90.U2(15, l13.longValue());
        }
        Long l14 = this.aM;
        if (l14 != null) {
            iGn += h90.U2(16, l14.longValue());
        }
        Long l15 = this.j3;
        if (l15 != null) {
            iGn += h90.U2(17, l15.longValue());
        }
        Long l16 = this.Mr;
        if (l16 != null) {
            iGn += h90.U2(18, l16.longValue());
        }
        Long l17 = this.U2;
        if (l17 != null) {
            iGn += h90.U2(19, l17.longValue());
        }
        Long l18 = this.a8;
        if (l18 != null) {
            iGn += h90.U2(20, l18.longValue());
        }
        Long l19 = this.lg;
        return l19 != null ? iGn + h90.U2(21, l19.longValue()) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        tp(g90Var);
        return this;
    }
}
