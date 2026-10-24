package abcd;

/* loaded from: classes.dex */
public interface z80 {

    public static class a extends k90 {
        int iW;

        public a(j60 j60Var) {
            super(j60Var);
            this.iW = -1;
        }

        public int oY() {
            return this.iW;
        }
    }

    public static class b extends g90 implements z80 {
        private final m90 Cz;
        private final m90 Gj;
        private final int fN;

        public b(g70 g70Var, int i) {
            super(g70Var);
            this.fN = i;
            this.Gj = vJ("UNSHALLOW");
            this.Cz = vJ("REINTERESTING");
        }

        public void AL(o90 o90Var) {
            if (o90Var instanceof k90) {
                o90Var.x9(this.Gj);
            }
            super.Ev(o90Var);
        }

        @Override // abcd.z80
        public int DW() {
            return this.fN;
        }

        @Override // abcd.z80
        public m90 Hw() {
            return this.Cz;
        }

        @Override // abcd.t90
        public k90 Ws(j60 j60Var) {
            return new a(j60Var);
        }

        @Override // abcd.z80
        public m90 j6() {
            return this.Gj;
        }

        public void zh(o90 o90Var) {
            o90 o90VarBr = o90Var;
            while (o90VarBr instanceof r90) {
                o90VarBr = ((r90) o90VarBr).br();
                x9(o90VarBr);
            }
            if (o90VarBr instanceof a) {
                ((a) o90VarBr).iW = 0;
            }
            super.Ev(o90Var);
        }
    }

    public static class c extends t90 implements z80 {
        private final m90 Jl;
        private final int Q6;
        private final m90 kf;

        public c(g70 g70Var, int i) {
            super(g70Var);
            this.Q6 = i;
            this.kf = vJ("UNSHALLOW");
            this.Jl = vJ("REINTERESTING");
        }

        @Override // abcd.z80
        public int DW() {
            return this.Q6;
        }

        @Override // abcd.z80
        public m90 Hw() {
            return this.Jl;
        }

        @Override // abcd.t90
        public k90 Ws(j60 j60Var) {
            return new a(j60Var);
        }

        public void Xa(k90 k90Var) {
            if (k90Var instanceof a) {
                ((a) k90Var).iW = 0;
            }
            super.ef(k90Var);
        }

        @Override // abcd.z80
        public m90 j6() {
            return this.kf;
        }
    }

    int DW();

    m90 Hw();

    m90 j6();
}
