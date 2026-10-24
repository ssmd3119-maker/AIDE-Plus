package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zu0 extends j90<zu0> {
    public Integer FH = null;
    private uu0 Hw = null;
    private xt0 v5 = null;
    public av0 Zo = null;
    private wt0[] VH = new wt0[0];
    private yt0 gn = null;
    private fu0 u7 = null;
    private eu0 tp = null;
    private bu0 EQ = null;
    private cu0 we = null;
    private fv0[] J0 = fv0.tp();

    public zu0() {
        this.DW = null;
        this.j6 = -1;
    }

    private final zu0 tp(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            switch (iZo) {
                case 0:
                    return this;
                case 56:
                    int iJ6 = g90Var.j6();
                    try {
                        int iTp = g90Var.tp();
                        if (iTp >= 0 && iTp <= 9) {
                            this.FH = Integer.valueOf(iTp);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(43);
                            sb.append(iTp);
                            sb.append(" is not a valid enum AdInitiater");
                            throw new IllegalArgumentException(sb.toString());
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        g90Var.a8(iJ6);
                        u7(g90Var, iZo);
                        break;
                    }
                    break;
                case 64:
                    int iJ62 = g90Var.j6();
                    int iTp2 = g90Var.tp();
                    if (iTp2 != 0 && iTp2 != 1 && iTp2 != 1000) {
                        g90Var.a8(iJ62);
                        u7(g90Var, iZo);
                        break;
                    } else {
                        this.Hw = uu0.j6(iTp2);
                        break;
                    }
                    break;
                case 74:
                    this.v5 = (xt0) g90Var.Hw(xt0.er());
                    break;
                case 82:
                    if (this.Zo == null) {
                        this.Zo = new av0();
                    }
                    g90Var.v5(this.Zo);
                    break;
                case 90:
                    int iJ63 = t90.j6(g90Var, 90);
                    wt0[] wt0VarArr = this.VH;
                    int length = wt0VarArr == null ? 0 : wt0VarArr.length;
                    int i = iJ63 + length;
                    wt0[] wt0VarArr2 = new wt0[i];
                    if (length != 0) {
                        System.arraycopy(this.VH, 0, wt0VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        wt0VarArr2[length] = (wt0) g90Var.Hw(wt0.er());
                        g90Var.Zo();
                        length++;
                    }
                    wt0VarArr2[length] = (wt0) g90Var.Hw(wt0.er());
                    this.VH = wt0VarArr2;
                    break;
                case 98:
                    this.gn = (yt0) g90Var.Hw(yt0.er());
                    break;
                case 106:
                    this.u7 = (fu0) g90Var.Hw(fu0.er());
                    break;
                case 114:
                    this.tp = (eu0) g90Var.Hw(eu0.er());
                    break;
                case 122:
                    this.EQ = (bu0) g90Var.Hw(bu0.er());
                    break;
                case 130:
                    this.we = (cu0) g90Var.Hw(cu0.er());
                    break;
                case 138:
                    int iJ64 = t90.j6(g90Var, 138);
                    fv0[] fv0VarArr = this.J0;
                    int length2 = fv0VarArr == null ? 0 : fv0VarArr.length;
                    int i2 = iJ64 + length2;
                    fv0[] fv0VarArr2 = new fv0[i2];
                    if (length2 != 0) {
                        System.arraycopy(this.J0, 0, fv0VarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        fv0VarArr2[length2] = new fv0();
                        g90Var.v5(fv0VarArr2[length2]);
                        g90Var.Zo();
                        length2++;
                    }
                    fv0VarArr2[length2] = new fv0();
                    g90Var.v5(fv0VarArr2[length2]);
                    this.J0 = fv0VarArr2;
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
        Integer num = this.FH;
        if (num != null) {
            h90Var.yS(7, num.intValue());
        }
        uu0 uu0Var = this.Hw;
        if (uu0Var != null && uu0Var != null) {
            h90Var.yS(8, uu0Var.Hw());
        }
        xt0 xt0Var = this.v5;
        if (xt0Var != null) {
            h90Var.tp(9, xt0Var);
        }
        av0 av0Var = this.Zo;
        if (av0Var != null) {
            h90Var.DW(10, av0Var);
        }
        wt0[] wt0VarArr = this.VH;
        int i = 0;
        if (wt0VarArr != null && wt0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                wt0[] wt0VarArr2 = this.VH;
                if (i2 >= wt0VarArr2.length) {
                    break;
                }
                wt0 wt0Var = wt0VarArr2[i2];
                if (wt0Var != null) {
                    h90Var.tp(11, wt0Var);
                }
                i2++;
            }
        }
        yt0 yt0Var = this.gn;
        if (yt0Var != null) {
            h90Var.tp(12, yt0Var);
        }
        fu0 fu0Var = this.u7;
        if (fu0Var != null) {
            h90Var.tp(13, fu0Var);
        }
        eu0 eu0Var = this.tp;
        if (eu0Var != null) {
            h90Var.tp(14, eu0Var);
        }
        bu0 bu0Var = this.EQ;
        if (bu0Var != null) {
            h90Var.tp(15, bu0Var);
        }
        cu0 cu0Var = this.we;
        if (cu0Var != null) {
            h90Var.tp(16, cu0Var);
        }
        fv0[] fv0VarArr = this.J0;
        if (fv0VarArr != null && fv0VarArr.length > 0) {
            while (true) {
                fv0[] fv0VarArr2 = this.J0;
                if (i >= fv0VarArr2.length) {
                    break;
                }
                fv0 fv0Var = fv0VarArr2[i];
                if (fv0Var != null) {
                    h90Var.DW(17, fv0Var);
                }
                i++;
            }
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        Integer num = this.FH;
        if (num != null) {
            iGn += h90.vy(7, num.intValue());
        }
        uu0 uu0Var = this.Hw;
        if (uu0Var != null && uu0Var != null) {
            iGn += h90.vy(8, uu0Var.Hw());
        }
        xt0 xt0Var = this.v5;
        if (xt0Var != null) {
            iGn += x40.vJ(9, xt0Var);
        }
        av0 av0Var = this.Zo;
        if (av0Var != null) {
            iGn += h90.v5(10, av0Var);
        }
        wt0[] wt0VarArr = this.VH;
        int i = 0;
        if (wt0VarArr != null && wt0VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                wt0[] wt0VarArr2 = this.VH;
                if (i2 >= wt0VarArr2.length) {
                    break;
                }
                wt0 wt0Var = wt0VarArr2[i2];
                if (wt0Var != null) {
                    iGn += x40.vJ(11, wt0Var);
                }
                i2++;
            }
        }
        yt0 yt0Var = this.gn;
        if (yt0Var != null) {
            iGn += x40.vJ(12, yt0Var);
        }
        fu0 fu0Var = this.u7;
        if (fu0Var != null) {
            iGn += x40.vJ(13, fu0Var);
        }
        eu0 eu0Var = this.tp;
        if (eu0Var != null) {
            iGn += x40.vJ(14, eu0Var);
        }
        bu0 bu0Var = this.EQ;
        if (bu0Var != null) {
            iGn += x40.vJ(15, bu0Var);
        }
        cu0 cu0Var = this.we;
        if (cu0Var != null) {
            iGn += x40.vJ(16, cu0Var);
        }
        fv0[] fv0VarArr = this.J0;
        if (fv0VarArr != null && fv0VarArr.length > 0) {
            while (true) {
                fv0[] fv0VarArr2 = this.J0;
                if (i >= fv0VarArr2.length) {
                    break;
                }
                fv0 fv0Var = fv0VarArr2[i];
                if (fv0Var != null) {
                    iGn += h90.v5(17, fv0Var);
                }
                i++;
            }
        }
        return iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        tp(g90Var);
        return this;
    }
}
