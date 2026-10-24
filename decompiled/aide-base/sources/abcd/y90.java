package abcd;

/* loaded from: classes.dex */
public abstract class y90 extends ba0 {

    private static class a extends y90 {
        private final ba0 FH;
        private final ba0 Hw;
        private final boolean v5;

        public a(ba0 ba0Var, ba0 ba0Var2) {
            this.FH = ba0Var;
            this.Hw = ba0Var2;
            this.v5 = ba0Var.FH() || this.Hw.FH();
        }

        @Override // abcd.ba0
        public boolean DW(t90 t90Var, k90 k90Var) {
            return this.FH.DW(t90Var, k90Var) && this.Hw.DW(t90Var, k90Var);
        }

        @Override // abcd.ba0
        public boolean FH() {
            return this.v5;
        }

        @Override // abcd.ba0
        /* renamed from: j6 */
        public ba0 clone() {
            return new a(this.FH.clone(), this.Hw.clone());
        }

        @Override // abcd.ba0
        public String toString() {
            return "(" + this.FH.toString() + " AND " + this.Hw.toString() + ")";
        }
    }

    public static ba0 Hw(ba0 ba0Var, ba0 ba0Var2) {
        ba0 ba0Var3 = ba0.j6;
        return ba0Var == ba0Var3 ? ba0Var2 : ba0Var2 == ba0Var3 ? ba0Var : new a(ba0Var, ba0Var2);
    }
}
