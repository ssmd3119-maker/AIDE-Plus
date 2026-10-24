package abcd;

/* loaded from: classes.dex */
public class cm0 {
    sh0 DW;
    private xi0 EQ;
    sl0 FH;
    ol0 Hw;
    ol0 VH;
    bm0 Zo;
    yl0 gn;
    tj0 j6 = new tj0(true, 0, new sh0(2));
    private boolean tp;
    wl0 u7;
    bm0 v5;
    private xi0 we;

    public void DW(bm0 bm0Var) {
        this.Zo = bm0Var;
    }

    public void FH(wl0 wl0Var) {
        vl0 vl0VarVH;
        this.u7 = wl0Var;
        if (wl0Var == null || (vl0VarVH = wl0Var.VH(vl0.FH)) == null || !vl0VarVH.DW()) {
            return;
        }
        this.tp = true;
    }

    public void Hw(fm0 fm0Var) {
        FH(wl0.gn(fm0Var));
    }

    public void VH(sl0 sl0Var) {
        this.FH = sl0Var;
    }

    public void Zo(sh0 sh0Var) {
        this.DW = sh0Var;
    }

    public void gn(bm0 bm0Var) {
        this.v5 = bm0Var;
    }

    public zl0 j6() {
        if (this.DW == null || this.FH == null || this.Hw == null || this.v5 == null || this.Zo == null || ((this.VH == null && !this.tp) || this.gn == null)) {
            throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
        }
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.j6);
        nh0Var.j6(this.DW);
        nh0Var.j6(this.FH);
        nh0Var.j6(this.Hw);
        nh0 nh0Var2 = new nh0();
        nh0Var2.j6(this.v5);
        nh0Var2.j6(this.Zo);
        nh0Var.j6(new oj0(nh0Var2));
        ol0 ol0Var = this.VH;
        if (ol0Var != null) {
            nh0Var.j6(ol0Var);
        } else {
            nh0Var.j6(new oj0());
        }
        nh0Var.j6(this.gn);
        if (this.EQ != null) {
            nh0Var.j6(new tj0(false, 1, this.EQ));
        }
        if (this.we != null) {
            nh0Var.j6(new tj0(false, 2, this.we));
        }
        if (this.u7 != null) {
            nh0Var.j6(new tj0(true, 3, this.u7));
        }
        return zl0.gn(new oj0(nh0Var));
    }

    public void tp(yl0 yl0Var) {
        this.gn = yl0Var;
    }

    public void u7(hm0 hm0Var) {
        this.VH = ol0.VH(hm0Var.DW());
    }

    public void v5(hm0 hm0Var) {
        this.Hw = ol0.VH(hm0Var);
    }
}
