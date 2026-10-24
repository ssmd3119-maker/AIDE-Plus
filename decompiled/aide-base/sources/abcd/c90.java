package abcd;

/* loaded from: classes.dex */
public class c90 extends sf0 {
    private final pf0 FH;
    private i90 Hw;

    public c90(pf0 pf0Var) {
        this.FH = pf0Var;
    }

    public static c90 Hw(String str) {
        return new c90(pf0.v5(str));
    }

    @Override // abcd.sf0
    public boolean DW(jf0 jf0Var) {
        return this.FH.DW(jf0Var) && sf0.DW.DW(jf0Var);
    }

    @Override // abcd.sf0
    public boolean FH() {
        return this.FH.FH() || sf0.DW.FH();
    }

    public void VH(i90 i90Var) {
        this.Hw = i90Var;
    }

    public i90 Zo() {
        return this.Hw;
    }

    @Override // abcd.sf0
    /* renamed from: j6 */
    public sf0 clone() {
        pf0 pf0Var = this.FH;
        pf0Var.Hw();
        return new c90(pf0Var);
    }

    @Override // abcd.sf0
    public String toString() {
        return "(FOLLOW(" + this.FH.toString() + ") AND " + sf0.DW.toString() + ")";
    }

    public String v5() {
        return this.FH.Zo();
    }
}
