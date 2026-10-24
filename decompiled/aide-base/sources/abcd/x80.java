package abcd;

/* loaded from: classes.dex */
public final class x80 extends d90 {
    private final a90 DW = new a90();
    private int FH;
    private final d90 j6;

    public x80(d90 d90Var) {
        this.j6 = d90Var;
    }

    @Override // abcd.d90
    public int DW() {
        return this.j6.DW();
    }

    @Override // abcd.d90
    public k90 j6() {
        k90 k90VarJ6;
        while (this.FH < 6 && (k90VarJ6 = this.j6.j6()) != null) {
            this.DW.Hw(k90VarJ6);
            this.FH++;
        }
        k90 k90VarJ62 = this.DW.j6();
        if (k90VarJ62 == null) {
            return null;
        }
        this.FH--;
        return k90VarJ62;
    }
}
