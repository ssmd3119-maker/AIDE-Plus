package abcd;

/* loaded from: classes.dex */
public class no0 extends ko0 {
    private oo0 DW;

    public no0(boolean z, oo0 oo0Var) {
        super(z);
        this.DW = oo0Var;
    }

    public oo0 DW() {
        return this.DW;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof no0)) {
            return false;
        }
        no0 no0Var = (no0) obj;
        oo0 oo0Var = this.DW;
        return oo0Var == null ? no0Var.DW() == null : oo0Var.equals(no0Var.DW());
    }

    public int hashCode() {
        int i = !j6() ? 1 : 0;
        oo0 oo0Var = this.DW;
        return oo0Var != null ? i ^ oo0Var.hashCode() : i;
    }
}
