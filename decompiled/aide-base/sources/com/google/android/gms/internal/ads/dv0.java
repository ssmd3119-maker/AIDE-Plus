package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dv0 extends j90<dv0> {
    private Integer FH = null;
    public String Hw = null;
    private Integer v5 = null;
    private uu0 Zo = null;
    private ev0 VH = null;
    public long[] gn = t90.DW;
    public bv0 u7 = null;
    private cv0 tp = null;
    private du0 EQ = null;
    public zu0 we = null;

    public dv0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        Integer num = this.FH;
        if (num != null) {
            h90Var.yS(9, num.intValue());
        }
        String str = this.Hw;
        if (str != null) {
            h90Var.EQ(10, str);
        }
        Integer num2 = this.v5;
        int i = 0;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            h90Var.er(11, 0);
            h90Var.aM(iIntValue);
        }
        uu0 uu0Var = this.Zo;
        if (uu0Var != null && uu0Var != null) {
            h90Var.yS(12, uu0Var.Hw());
        }
        ev0 ev0Var = this.VH;
        if (ev0Var != null) {
            h90Var.DW(13, ev0Var);
        }
        long[] jArr = this.gn;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                long[] jArr2 = this.gn;
                if (i >= jArr2.length) {
                    break;
                }
                h90Var.j3(14, jArr2[i]);
                i++;
            }
        }
        bv0 bv0Var = this.u7;
        if (bv0Var != null) {
            h90Var.DW(15, bv0Var);
        }
        cv0 cv0Var = this.tp;
        if (cv0Var != null) {
            h90Var.DW(16, cv0Var);
        }
        du0 du0Var = this.EQ;
        if (du0Var != null) {
            h90Var.tp(17, du0Var);
        }
        zu0 zu0Var = this.we;
        if (zu0Var != null) {
            h90Var.DW(18, zu0Var);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        long[] jArr;
        int iGn = super.gn();
        Integer num = this.FH;
        if (num != null) {
            iGn += h90.vy(9, num.intValue());
        }
        String str = this.Hw;
        if (str != null) {
            iGn += h90.QX(10, str);
        }
        Integer num2 = this.v5;
        if (num2 != null) {
            iGn += h90.we(11) + h90.J8(num2.intValue());
        }
        uu0 uu0Var = this.Zo;
        if (uu0Var != null && uu0Var != null) {
            iGn += h90.vy(12, uu0Var.Hw());
        }
        ev0 ev0Var = this.VH;
        if (ev0Var != null) {
            iGn += h90.v5(13, ev0Var);
        }
        long[] jArr2 = this.gn;
        if (jArr2 != null && jArr2.length > 0) {
            int i = 0;
            int iGn2 = 0;
            while (true) {
                jArr = this.gn;
                if (i >= jArr.length) {
                    break;
                }
                iGn2 += h90.gn(jArr[i]);
                i++;
            }
            iGn = iGn + iGn2 + (jArr.length * 1);
        }
        bv0 bv0Var = this.u7;
        if (bv0Var != null) {
            iGn += h90.v5(15, bv0Var);
        }
        cv0 cv0Var = this.tp;
        if (cv0Var != null) {
            iGn += h90.v5(16, cv0Var);
        }
        du0 du0Var = this.EQ;
        if (du0Var != null) {
            iGn += x40.vJ(17, du0Var);
        }
        zu0 zu0Var = this.we;
        return zu0Var != null ? iGn + h90.v5(18, zu0Var) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 72:
                    this.FH = Integer.valueOf(g90Var.tp());
                    break;
                case 82:
                    this.Hw = g90Var.FH();
                    break;
                case 88:
                    this.v5 = Integer.valueOf(g90Var.tp());
                    break;
                case 96:
                    int iJ6 = g90Var.j6();
                    int iTp = g90Var.tp();
                    if (iTp != 0 && iTp != 1 && iTp != 1000) {
                        g90Var.a8(iJ6);
                        u7(g90Var, iZo);
                        break;
                    } else {
                        this.Zo = uu0.j6(iTp);
                        break;
                    }
                    break;
                case 106:
                    if (this.VH == null) {
                        this.VH = new ev0();
                    }
                    g90Var.v5(this.VH);
                    break;
                case 112:
                    int iJ62 = t90.j6(g90Var, 112);
                    long[] jArr = this.gn;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iJ62 + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(this.gn, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = g90Var.EQ();
                        g90Var.Zo();
                        length++;
                    }
                    jArr2[length] = g90Var.EQ();
                    this.gn = jArr2;
                    break;
                case 114:
                    int iJ3 = g90Var.j3(g90Var.tp());
                    int iJ63 = g90Var.j6();
                    int i2 = 0;
                    while (g90Var.QX() > 0) {
                        g90Var.EQ();
                        i2++;
                    }
                    g90Var.a8(iJ63);
                    long[] jArr3 = this.gn;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(this.gn, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = g90Var.EQ();
                        length2++;
                    }
                    this.gn = jArr4;
                    g90Var.Mr(iJ3);
                    break;
                case 122:
                    if (this.u7 == null) {
                        this.u7 = new bv0();
                    }
                    g90Var.v5(this.u7);
                    break;
                case 130:
                    if (this.tp == null) {
                        this.tp = new cv0();
                    }
                    g90Var.v5(this.tp);
                    break;
                case 138:
                    this.EQ = (du0) g90Var.Hw(du0.er());
                    break;
                case 146:
                    if (this.we == null) {
                        this.we = new zu0();
                    }
                    g90Var.v5(this.we);
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
