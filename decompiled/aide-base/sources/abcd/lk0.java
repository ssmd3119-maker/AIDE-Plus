package abcd;

/* loaded from: classes.dex */
public class lk0 extends uh0 {
    private vh0 WB;
    private di0 mb;

    private lk0(bi0 bi0Var) {
        this.WB = (vh0) bi0Var.XL(0);
        this.mb = (di0) bi0Var.XL(1);
    }

    public static lk0 gn(Object obj) {
        if (obj instanceof lk0) {
            return (lk0) obj;
        }
        if (obj != null) {
            return new lk0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        nh0Var.j6(this.mb);
        return new oj0(nh0Var);
    }

    public vh0 VH() {
        return this.WB;
    }

    public lk0(vh0 vh0Var, di0 di0Var) {
        this.WB = vh0Var;
        this.mb = di0Var;
    }
}
