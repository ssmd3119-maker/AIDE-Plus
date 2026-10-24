package abcd;

/* loaded from: classes.dex */
public abstract class r80 extends d90 {
    static final r80 DW = new a(null);
    int j6;

    private static class a extends r80 {
        private a() {
        }

        @Override // abcd.r80
        public void Hw(k90 k90Var) {
            throw new UnsupportedOperationException();
        }

        @Override // abcd.r80, abcd.d90
        public k90 j6() {
            return null;
        }

        @Override // abcd.r80
        public boolean v5(int i) {
            return false;
        }

        public /* synthetic */ a(a aVar) {
            this();
        }
    }

    public static void Zo(StringBuilder sb, k90 k90Var) {
        sb.append(k90Var.toString());
        sb.append('\n');
    }

    @Override // abcd.d90
    public int DW() {
        return this.j6;
    }

    public abstract void Hw(k90 k90Var);

    @Override // abcd.d90
    public abstract k90 j6();

    public abstract boolean v5(int i);
}
