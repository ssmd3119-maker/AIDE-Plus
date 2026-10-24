package abcd;

/* loaded from: classes.dex */
public class x90 extends d90 {
    private final int DW;
    private final a90 j6 = new a90();

    public x90(d90 d90Var) {
        this.DW = d90Var.DW() | 8;
        d90Var.FH(this.j6);
        while (true) {
            k90 k90VarJ6 = d90Var.j6();
            if (k90VarJ6 == null) {
                return;
            }
            for (k90 k90Var : k90VarJ6.Z1) {
                k90Var.Q6++;
            }
            this.j6.Hw(k90VarJ6);
        }
    }

    @Override // abcd.d90
    public int DW() {
        return this.DW;
    }

    @Override // abcd.d90
    public void FH(u80 u80Var) {
        u80Var.FH(this.j6);
    }

    @Override // abcd.d90
    public k90 j6() {
        while (true) {
            k90 k90VarJ6 = this.j6.j6();
            if (k90VarJ6 == null) {
                return null;
            }
            if (k90VarJ6.Q6 <= 0) {
                for (k90 k90Var : k90VarJ6.Z1) {
                    int i = k90Var.Q6 - 1;
                    k90Var.Q6 = i;
                    if (i == 0) {
                        int i2 = k90Var.cT;
                        if ((i2 & 32) != 0) {
                            k90Var.cT = i2 & (-33);
                            this.j6.gn(k90Var);
                        }
                    }
                }
                return k90VarJ6;
            }
            k90VarJ6.cT |= 32;
        }
    }
}
