package abcd;

/* loaded from: classes.dex */
public class ml0 extends uh0 {
    private vh0 WB;
    private mh0 mb;

    private ml0(bi0 bi0Var) {
        this.WB = (vh0) bi0Var.XL(0);
        this.mb = bi0Var.XL(1);
    }

    public static ml0 VH(Object obj) {
        if (obj instanceof ml0) {
            return (ml0) obj;
        }
        if (obj != null) {
            return new ml0(bi0.J8(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        nh0Var.j6(this.mb);
        return new oj0(nh0Var);
    }

    public vh0 gn() {
        return this.WB;
    }

    public mh0 u7() {
        return this.mb;
    }
}
