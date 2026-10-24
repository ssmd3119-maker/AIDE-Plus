package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wv extends j90<wv> {
    public String FH = null;
    public Long Hw = null;
    private String v5 = null;
    private String Zo = null;
    private String VH = null;
    private Long gn = null;
    private Long u7 = null;
    private String tp = null;
    private Long EQ = null;
    private String we = null;

    public wv() {
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
        String str2 = this.v5;
        if (str2 != null) {
            h90Var.EQ(3, str2);
        }
        String str3 = this.Zo;
        if (str3 != null) {
            h90Var.EQ(4, str3);
        }
        String str4 = this.VH;
        if (str4 != null) {
            h90Var.EQ(5, str4);
        }
        Long l2 = this.gn;
        if (l2 != null) {
            h90Var.rN(6, l2.longValue());
        }
        Long l3 = this.u7;
        if (l3 != null) {
            h90Var.rN(7, l3.longValue());
        }
        String str5 = this.tp;
        if (str5 != null) {
            h90Var.EQ(8, str5);
        }
        Long l4 = this.EQ;
        if (l4 != null) {
            h90Var.rN(9, l4.longValue());
        }
        String str6 = this.we;
        if (str6 != null) {
            h90Var.EQ(10, str6);
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
        String str2 = this.v5;
        if (str2 != null) {
            iGn += h90.QX(3, str2);
        }
        String str3 = this.Zo;
        if (str3 != null) {
            iGn += h90.QX(4, str3);
        }
        String str4 = this.VH;
        if (str4 != null) {
            iGn += h90.QX(5, str4);
        }
        Long l2 = this.gn;
        if (l2 != null) {
            iGn += h90.U2(6, l2.longValue());
        }
        Long l3 = this.u7;
        if (l3 != null) {
            iGn += h90.U2(7, l3.longValue());
        }
        String str5 = this.tp;
        if (str5 != null) {
            iGn += h90.QX(8, str5);
        }
        Long l4 = this.EQ;
        if (l4 != null) {
            iGn += h90.U2(9, l4.longValue());
        }
        String str6 = this.we;
        return str6 != null ? iGn + h90.QX(10, str6) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 10:
                    this.FH = g90Var.FH();
                    break;
                case 16:
                    this.Hw = Long.valueOf(g90Var.EQ());
                    break;
                case 26:
                    this.v5 = g90Var.FH();
                    break;
                case 34:
                    this.Zo = g90Var.FH();
                    break;
                case 42:
                    this.VH = g90Var.FH();
                    break;
                case 48:
                    this.gn = Long.valueOf(g90Var.EQ());
                    break;
                case 56:
                    this.u7 = Long.valueOf(g90Var.EQ());
                    break;
                case 66:
                    this.tp = g90Var.FH();
                    break;
                case 72:
                    this.EQ = Long.valueOf(g90Var.EQ());
                    break;
                case 82:
                    this.we = g90Var.FH();
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
