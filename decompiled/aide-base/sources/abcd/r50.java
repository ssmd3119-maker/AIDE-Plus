package abcd;

/* loaded from: classes.dex */
public class r50 {
    final w50 DW;
    final Class<? extends w50> j6;

    public r50(s50 s50Var, Class<? extends w50> cls, w50 w50Var) {
        this.j6 = cls;
        this.DW = w50Var;
    }

    public String toString() {
        return String.valueOf(this.j6.getSimpleName()) + "[" + this.DW + "]";
    }
}
