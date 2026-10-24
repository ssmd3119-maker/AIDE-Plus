package abcd;

/* loaded from: classes.dex */
public class x30 extends c40 {
    private final y30 aM;

    public x30(y30 y30Var) {
        super(y30Var.v5());
        this.aM = y30Var;
    }

    @Override // abcd.ef0
    public void BT() {
        int i = this.J8;
        int iJ8 = this.u7.J8();
        if (i < iJ8) {
            this.aM.EQ(i, iJ8 - i);
        }
    }

    @Override // abcd.c40, abcd.ef0
    public ef0 Hw(g70 g70Var) throws j40 {
        d40 d40Var = this.XL;
        if (d40Var != null) {
            return new x30(this, d40Var);
        }
        throw new j40(tp(), "tree");
    }

    @Override // abcd.ef0
    public void gW() {
        d40 d40Var = this.XL;
        if (d40Var != null) {
            this.aM.EQ(this.J8, d40Var.Zo());
        } else {
            this.aM.EQ(this.J8, 1);
        }
        Mr(1);
    }

    public x30(x30 x30Var, d40 d40Var) {
        super(x30Var, d40Var);
        this.aM = x30Var.aM;
    }
}
