package abcd;

/* loaded from: classes.dex */
public class lm0 extends uh0 {
    private xi0 WB;
    private sh0 mb;

    private lm0(bi0 bi0Var) {
        if (bi0Var.j3() == 2) {
            this.WB = xi0.XL(bi0Var.XL(0));
            this.mb = gj0.J8(bi0Var.XL(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + bi0Var.j3());
        }
    }

    public static lm0 VH(Object obj) {
        if (obj == null || (obj instanceof km0)) {
            return (lm0) obj;
        }
        if (obj instanceof bi0) {
            return new lm0((bi0) obj);
        }
        throw new IllegalArgumentException("Invalid DHValidationParms: " + obj.getClass().getName());
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        nh0Var.j6(this.mb);
        return new oj0(nh0Var);
    }
}
