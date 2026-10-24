package abcd;

/* loaded from: classes.dex */
public class rf0 extends sf0 {
    private final int FH;

    public rf0(int i) {
        this.FH = i;
    }

    @Override // abcd.sf0
    public boolean DW(jf0 jf0Var) {
        b40 b40VarVy;
        c40 c40Var = (c40) jf0Var.QX(this.FH, c40.class);
        return c40Var == null || (b40VarVy = c40Var.vy()) == null || !b40VarVy.XL();
    }

    @Override // abcd.sf0
    public boolean FH() {
        return false;
    }

    @Override // abcd.sf0
    /* renamed from: j6 */
    public sf0 clone() {
        return this;
    }

    @Override // abcd.sf0
    public String toString() {
        return "SkipWorkTree(" + this.FH + ")";
    }
}
