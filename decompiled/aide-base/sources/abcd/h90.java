package abcd;

/* loaded from: classes.dex */
public class h90 extends d90 {
    private static final k90 gn;
    private final w80 DW;
    private final ba0 FH;
    private final int Hw;
    private final t90 j6;
    private k90 v5 = gn;
    private int Zo = 6;
    boolean VH = true;

    static {
        k90 k90Var = new k90(a70.ca());
        gn = k90Var;
        k90Var.n5 = Integer.MAX_VALUE;
    }

    public h90(t90 t90Var, w80 w80Var, ba0 ba0Var, int i) {
        this.j6 = t90Var;
        this.DW = w80Var;
        this.FH = ba0Var;
        this.Hw = i;
    }

    @Override // abcd.d90
    public int DW() {
        return this.Hw | 1;
    }

    @Override // abcd.d90
    public k90 j6() {
        boolean zDW;
        while (true) {
            try {
                k90 k90VarJ6 = this.DW.j6();
                if (k90VarJ6 == null) {
                    this.j6.mb.U2();
                    return null;
                }
                if ((k90VarJ6.cT & 4) != 0) {
                    zDW = false;
                } else {
                    if (this.FH.FH()) {
                        k90VarJ6.aq(this.j6);
                    }
                    zDW = this.FH.DW(this.j6, k90VarJ6);
                }
                for (k90 k90Var : k90VarJ6.Z1) {
                    if ((k90Var.cT & 2) == 0) {
                        if ((k90Var.cT & 1) == 0) {
                            k90Var.OW(this.j6);
                        }
                        k90Var.cT |= 2;
                        this.DW.Hw(k90Var);
                    }
                }
                this.j6.J8(k90VarJ6);
                if ((k90VarJ6.cT & 4) != 0) {
                    if (this.DW.gn(4)) {
                        k90 k90VarEQ = this.DW.EQ();
                        if (k90VarEQ == null || k90VarEQ.n5 < this.v5.n5) {
                            int i = this.Zo - 1;
                            this.Zo = i;
                            if (i == 0) {
                                throw d50.WB;
                            }
                        } else {
                            this.Zo = 6;
                        }
                    } else {
                        this.Zo = 6;
                    }
                    if (this.VH) {
                        k90VarJ6.kQ();
                    }
                } else {
                    if (zDW) {
                        this.v5 = k90VarJ6;
                        return k90VarJ6;
                    }
                    if (this.VH) {
                        k90VarJ6.kQ();
                    }
                }
            } catch (d50 unused) {
                this.j6.mb.U2();
                this.DW.VH();
                return null;
            }
        }
    }
}
