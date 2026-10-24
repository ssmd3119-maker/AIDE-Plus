package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class av0 extends j90<av0> {
    public String FH = null;
    private wt0[] Hw = new wt0[0];
    private uu0 v5 = null;
    private uu0 Zo = null;
    private uu0 VH = null;

    public av0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        String str = this.FH;
        if (str != null) {
            h90Var.EQ(1, str);
        }
        wt0[] wt0VarArr = this.Hw;
        if (wt0VarArr != null && wt0VarArr.length > 0) {
            int i = 0;
            while (true) {
                wt0[] wt0VarArr2 = this.Hw;
                if (i >= wt0VarArr2.length) {
                    break;
                }
                wt0 wt0Var = wt0VarArr2[i];
                if (wt0Var != null) {
                    h90Var.tp(2, wt0Var);
                }
                i++;
            }
        }
        uu0 uu0Var = this.v5;
        if (uu0Var != null && uu0Var != null) {
            h90Var.yS(3, uu0Var.Hw());
        }
        uu0 uu0Var2 = this.Zo;
        if (uu0Var2 != null && uu0Var2 != null) {
            h90Var.yS(4, uu0Var2.Hw());
        }
        uu0 uu0Var3 = this.VH;
        if (uu0Var3 != null && uu0Var3 != null) {
            h90Var.yS(5, uu0Var3.Hw());
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
        wt0[] wt0VarArr = this.Hw;
        if (wt0VarArr != null && wt0VarArr.length > 0) {
            int i = 0;
            while (true) {
                wt0[] wt0VarArr2 = this.Hw;
                if (i >= wt0VarArr2.length) {
                    break;
                }
                wt0 wt0Var = wt0VarArr2[i];
                if (wt0Var != null) {
                    iGn += x40.vJ(2, wt0Var);
                }
                i++;
            }
        }
        uu0 uu0Var = this.v5;
        if (uu0Var != null && uu0Var != null) {
            iGn += h90.vy(3, uu0Var.Hw());
        }
        uu0 uu0Var2 = this.Zo;
        if (uu0Var2 != null && uu0Var2 != null) {
            iGn += h90.vy(4, uu0Var2.Hw());
        }
        uu0 uu0Var3 = this.VH;
        return (uu0Var3 == null || uu0Var3 == null) ? iGn : iGn + h90.vy(5, uu0Var3.Hw());
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
                int iJ6 = t90.j6(g90Var, 18);
                wt0[] wt0VarArr = this.Hw;
                int length = wt0VarArr == null ? 0 : wt0VarArr.length;
                int i = iJ6 + length;
                wt0[] wt0VarArr2 = new wt0[i];
                if (length != 0) {
                    System.arraycopy(this.Hw, 0, wt0VarArr2, 0, length);
                }
                while (length < i - 1) {
                    wt0VarArr2[length] = (wt0) g90Var.Hw(wt0.er());
                    g90Var.Zo();
                    length++;
                }
                wt0VarArr2[length] = (wt0) g90Var.Hw(wt0.er());
                this.Hw = wt0VarArr2;
            } else if (iZo == 24) {
                int iJ62 = g90Var.j6();
                int iTp = g90Var.tp();
                if (iTp == 0 || iTp == 1 || iTp == 1000) {
                    this.v5 = uu0.j6(iTp);
                } else {
                    g90Var.a8(iJ62);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 32) {
                int iJ63 = g90Var.j6();
                int iTp2 = g90Var.tp();
                if (iTp2 == 0 || iTp2 == 1 || iTp2 == 1000) {
                    this.Zo = uu0.j6(iTp2);
                } else {
                    g90Var.a8(iJ63);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 40) {
                int iJ64 = g90Var.j6();
                int iTp3 = g90Var.tp();
                if (iTp3 == 0 || iTp3 == 1 || iTp3 == 1000) {
                    this.VH = uu0.j6(iTp3);
                } else {
                    g90Var.a8(iJ64);
                    u7(g90Var, iZo);
                }
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
