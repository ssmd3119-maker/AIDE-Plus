package abcd;

/* loaded from: classes.dex */
public class hn0 {
    private boolean DW;
    private sm0 FH;
    private sm0 Hw;
    private tp0 j6;
    private wm0 v5;

    public hn0(tp0 tp0Var) {
        this(tp0Var, new dn0());
    }

    private gn0 FH(op0 op0Var, sk0 sk0Var) {
        if (this.DW) {
            return new gn0(sk0Var, op0Var, this.j6, this.v5, true);
        }
        if (this.FH == null && this.Hw == null) {
            return new gn0(sk0Var, op0Var, this.j6, this.v5);
        }
        if (this.FH == null) {
            this.FH = new en0();
        }
        return new gn0(sk0Var, op0Var, this.j6, this.v5, this.FH, this.Hw);
    }

    public gn0 DW(op0 op0Var, byte[] bArr) {
        return FH(op0Var, new sk0((wh0) new kj0(bArr)));
    }

    public hn0 Hw(boolean z) {
        this.DW = z;
        return this;
    }

    public hn0 Zo(sm0 sm0Var) {
        this.Hw = sm0Var;
        return this;
    }

    public gn0 j6(op0 op0Var, om0 om0Var) {
        gn0 gn0VarFH = FH(op0Var, new sk0(new qk0(om0Var.DW())));
        gn0VarFH.Zo(om0Var);
        return gn0VarFH;
    }

    public hn0 v5(sm0 sm0Var) {
        this.FH = sm0Var;
        return this;
    }

    public hn0(tp0 tp0Var, wm0 wm0Var) {
        this.j6 = tp0Var;
        this.v5 = wm0Var;
    }
}
