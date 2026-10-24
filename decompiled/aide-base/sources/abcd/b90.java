package abcd;

/* loaded from: classes.dex */
public final class b90 extends d90 {
    private final d90 j6;

    public b90(d90 d90Var) {
        this.j6 = d90Var;
    }

    @Override // abcd.d90
    public int DW() {
        return this.j6.DW();
    }

    @Override // abcd.d90
    public k90 j6() {
        k90 k90VarJ6;
        do {
            k90VarJ6 = this.j6.j6();
            if (k90VarJ6 == null) {
                return null;
            }
        } while ((k90VarJ6.cT & 4) != 0);
        return k90VarJ6;
    }
}
