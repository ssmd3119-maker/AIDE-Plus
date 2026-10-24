package abcd;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class go0 {
    private mo0 j6;

    public void DW(pn0 pn0Var) {
        this.j6 = (mo0) pn0Var;
    }

    public kn0 j6() {
        ho0 ho0Var = ho0.j6;
        oo0 oo0VarDW = this.j6.DW();
        BigInteger bigIntegerJ6 = ho0Var.j6(oo0VarDW, this.j6.j6());
        return new kn0(new qo0(ho0Var.DW(oo0VarDW, bigIntegerJ6), oo0VarDW), new po0(bigIntegerJ6, oo0VarDW));
    }
}
