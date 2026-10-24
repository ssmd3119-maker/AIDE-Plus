package abcd;

/* loaded from: classes.dex */
public class of0 extends sf0 {
    private final int FH;

    public of0(int i) {
        this.FH = i;
    }

    @Override // abcd.sf0
    public boolean DW(jf0 jf0Var) {
        kf0 kf0Var = (kf0) jf0Var.QX(this.FH, kf0.class);
        return kf0Var == null || !kf0Var.aj();
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
        return "NotIgnored(" + this.FH + ")";
    }
}
