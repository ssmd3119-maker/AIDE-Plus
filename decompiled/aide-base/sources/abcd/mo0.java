package abcd;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public class mo0 extends pn0 {
    private oo0 DW;

    public mo0(SecureRandom secureRandom, oo0 oo0Var) {
        super(secureRandom, FH(oo0Var));
        this.DW = oo0Var;
    }

    public static int FH(oo0 oo0Var) {
        return oo0Var.FH() != 0 ? oo0Var.FH() : oo0Var.v5().bitLength();
    }

    public oo0 DW() {
        return this.DW;
    }
}
