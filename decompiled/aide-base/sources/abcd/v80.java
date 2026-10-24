package abcd;

/* loaded from: classes.dex */
public class v80 extends d90 {
    d90 j6;

    private class a extends d90 {
        private final a90 DW;
        private final d90 FH;
        private final t90 j6;

        public a(t90 t90Var, d90 d90Var) {
            this.j6 = t90Var;
            a90 a90Var = new a90();
            this.DW = a90Var;
            this.FH = d90Var;
            d90Var.FH(a90Var);
        }

        @Override // abcd.d90
        public int DW() {
            return this.FH.DW();
        }

        @Override // abcd.d90
        public void FH(u80 u80Var) {
            u80Var.FH(this.DW);
        }

        @Override // abcd.d90
        public k90 j6() {
            k90 k90VarJ6 = this.FH.j6();
            if (k90VarJ6 != null) {
                for (k90 k90Var : k90VarJ6.Z1) {
                    if ((k90Var.cT & 4) != 0) {
                        this.DW.Hw(k90Var);
                    }
                }
                return k90VarJ6;
            }
            a90 a90Var = new a90();
            a90Var.FH(this.DW);
            while (true) {
                k90 k90VarJ62 = this.DW.j6();
                if (k90VarJ62 == null) {
                    a90Var.VH(16);
                    v80.this.j6 = a90Var;
                    return a90Var.j6();
                }
                int i = k90VarJ62.cT;
                if ((i & 16) == 0) {
                    if ((i & 1) == 0) {
                        k90VarJ62.OW(this.j6);
                    }
                    k90VarJ62.cT = 16 | k90VarJ62.cT;
                    a90Var.Hw(k90VarJ62);
                }
            }
        }
    }

    public v80(t90 t90Var, d90 d90Var) {
        this.j6 = new a(t90Var, d90Var);
    }

    @Override // abcd.d90
    public int DW() {
        return this.j6.DW() | 16;
    }

    @Override // abcd.d90
    public void FH(u80 u80Var) {
        this.j6.FH(u80Var);
    }

    @Override // abcd.d90
    public k90 j6() {
        return this.j6.j6();
    }
}
