package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gv0 extends j90<gv0> {
    private ev0 FH = null;
    private uu0 Hw = null;
    private lu0 v5 = null;
    private ju0 Zo = null;

    public gv0() {
        this.DW = null;
        this.j6 = -1;
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    public final void Hw(h90 h90Var) throws i90 {
        ev0 ev0Var = this.FH;
        if (ev0Var != null) {
            h90Var.DW(1, ev0Var);
        }
        uu0 uu0Var = this.Hw;
        if (uu0Var != null && uu0Var != null) {
            h90Var.yS(2, uu0Var.Hw());
        }
        lu0 lu0Var = this.v5;
        if (lu0Var != null) {
            h90Var.tp(3, lu0Var);
        }
        ju0 ju0Var = this.Zo;
        if (ju0Var != null) {
            h90Var.tp(4, ju0Var);
        }
        super.Hw(h90Var);
    }

    @Override // com.google.android.gms.internal.ads.j90, com.google.android.gms.internal.ads.p90
    protected final int gn() {
        int iGn = super.gn();
        ev0 ev0Var = this.FH;
        if (ev0Var != null) {
            iGn += h90.v5(1, ev0Var);
        }
        uu0 uu0Var = this.Hw;
        if (uu0Var != null && uu0Var != null) {
            iGn += h90.vy(2, uu0Var.Hw());
        }
        lu0 lu0Var = this.v5;
        if (lu0Var != null) {
            iGn += x40.vJ(3, lu0Var);
        }
        ju0 ju0Var = this.Zo;
        return ju0Var != null ? iGn + x40.vJ(4, ju0Var) : iGn;
    }

    @Override // com.google.android.gms.internal.ads.p90
    public final /* synthetic */ p90 j6(g90 g90Var) throws o90 {
        while (true) {
            int iZo = g90Var.Zo();
            if (iZo == 0) {
                return this;
            }
            if (iZo == 10) {
                if (this.FH == null) {
                    this.FH = new ev0();
                }
                g90Var.v5(this.FH);
            } else if (iZo == 16) {
                int iJ6 = g90Var.j6();
                int iTp = g90Var.tp();
                if (iTp == 0 || iTp == 1 || iTp == 1000) {
                    this.Hw = uu0.j6(iTp);
                } else {
                    g90Var.a8(iJ6);
                    u7(g90Var, iZo);
                }
            } else if (iZo == 26) {
                this.v5 = (lu0) g90Var.Hw(lu0.er());
            } else if (iZo == 34) {
                this.Zo = (ju0) g90Var.Hw(ju0.er());
            } else if (!super.u7(g90Var, iZo)) {
                return this;
            }
        }
    }
}
