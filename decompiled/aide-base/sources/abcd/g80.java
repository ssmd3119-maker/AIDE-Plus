package abcd;

/* loaded from: classes.dex */
public class g80 extends d80 {
    private final int VH;
    private final String Zo;

    static class a extends e80 {
        private final int gn;

        public a(p70 p70Var, int i) {
            super(p70Var);
            this.gn = i;
        }

        @Override // abcd.e80
        public a70 Hw() {
            return this.VH[this.gn];
        }

        @Override // abcd.e80
        public boolean VH() {
            return this.gn < this.VH.length;
        }
    }

    public g80(String str, int i) {
        this.Zo = str;
        this.VH = i;
    }

    @Override // abcd.d80
    public e80 DW(p70 p70Var) {
        return new a(p70Var, this.VH);
    }

    @Override // abcd.d80
    public String j6() {
        return this.Zo;
    }
}
