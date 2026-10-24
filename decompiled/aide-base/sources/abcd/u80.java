package abcd;

/* loaded from: classes.dex */
public abstract class u80 extends r80 {
    protected b FH = new b();

    static final class a {
        final k90[] DW = new k90[256];
        int FH;
        int Hw;
        a j6;

        public boolean DW() {
            return this.FH > 0;
        }

        public void FH() {
            this.j6 = null;
            this.FH = 0;
            this.Hw = 0;
        }

        public boolean Hw() {
            return this.FH == this.Hw;
        }

        public void VH() {
            this.Hw = 256;
            this.FH = 256;
        }

        public k90 Zo() {
            k90[] k90VarArr = this.DW;
            int i = this.FH;
            this.FH = i + 1;
            return k90VarArr[i];
        }

        public void gn() {
            this.Hw = 128;
            this.FH = 128;
        }

        public void j6(k90 k90Var) {
            k90[] k90VarArr = this.DW;
            int i = this.Hw;
            this.Hw = i + 1;
            k90VarArr[i] = k90Var;
        }

        public void u7(k90 k90Var) {
            k90[] k90VarArr = this.DW;
            int i = this.FH - 1;
            this.FH = i;
            k90VarArr[i] = k90Var;
        }

        public boolean v5() {
            return this.Hw == 256;
        }
    }

    static final class b {
        private a j6;

        public a DW() {
            a aVar = this.j6;
            if (aVar == null) {
                return new a();
            }
            this.j6 = aVar.j6;
            aVar.FH();
            return aVar;
        }

        public void j6(a aVar) {
            aVar.j6 = this.j6;
            this.j6 = aVar;
        }
    }

    public u80() {
    }

    @Override // abcd.d90
    public void FH(u80 u80Var) {
        this.FH = u80Var.FH;
    }

    public u80(d90 d90Var) {
        this.j6 = d90Var.DW();
        d90Var.FH(this);
        while (true) {
            k90 k90VarJ6 = d90Var.j6();
            if (k90VarJ6 == null) {
                return;
            } else {
                Hw(k90VarJ6);
            }
        }
    }
}
