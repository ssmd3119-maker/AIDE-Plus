package abcd;

import abcd.k70;

/* loaded from: classes.dex */
public abstract class c70 implements k70 {
    private final k70.a DW;
    private final a70 FH;
    private final String j6;

    public static class a extends c70 {
        public a(k70.a aVar, String str, a70 a70Var) {
            super(aVar, str, a70Var);
        }

        @Override // abcd.k70
        public a70 FH() {
            return null;
        }

        @Override // abcd.k70
        public boolean Hw() {
            return true;
        }
    }

    public static class b extends c70 {
        private final a70 Hw;

        public b(k70.a aVar, String str, a70 a70Var, a70 a70Var2) {
            super(aVar, str, a70Var);
            this.Hw = a70Var2;
        }

        @Override // abcd.k70
        public a70 FH() {
            return this.Hw;
        }

        @Override // abcd.k70
        public boolean Hw() {
            return true;
        }
    }

    public static class c extends c70 {
        public c(k70.a aVar, String str, a70 a70Var) {
            super(aVar, str, a70Var);
        }

        @Override // abcd.k70
        public a70 FH() {
            return null;
        }

        @Override // abcd.k70
        public boolean Hw() {
            return false;
        }
    }

    public c70(k70.a aVar, String str, a70 a70Var) {
        this.j6 = str;
        this.DW = aVar;
        this.FH = a70Var;
    }

    @Override // abcd.k70
    public a70 DW() {
        return this.FH;
    }

    @Override // abcd.k70
    public k70 VH() {
        return this;
    }

    @Override // abcd.k70
    public String getName() {
        return this.j6;
    }

    @Override // abcd.k70
    public boolean gn() {
        return false;
    }

    @Override // abcd.k70
    public k70.a j6() {
        return this.DW;
    }

    public String toString() {
        return "Ref[" + getName() + '=' + a70.I(DW()) + ']';
    }

    @Override // abcd.k70
    public k70 v5() {
        return this;
    }
}
