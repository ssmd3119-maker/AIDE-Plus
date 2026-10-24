package abcd;

/* loaded from: classes.dex */
public class pk0 extends uh0 implements ok0 {
    private vh0 WB;
    private mh0 mb;

    public pk0(bi0 bi0Var) {
        if (bi0Var.j3() < 1 || bi0Var.j3() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + bi0Var.j3());
        }
        this.WB = (vh0) bi0Var.XL(0);
        if (bi0Var.j3() > 1) {
            hi0 hi0Var = (hi0) bi0Var.XL(1);
            if (!hi0Var.aM() || hi0Var.QX() != 0) {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            this.mb = hi0Var.Ws();
        }
    }

    public static pk0 u7(Object obj) {
        if (obj instanceof pk0) {
            return (pk0) obj;
        }
        if (obj != null) {
            return new pk0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        mh0 mh0Var = this.mb;
        if (mh0Var != null) {
            nh0Var.j6(new si0(0, mh0Var));
        }
        return new oi0(nh0Var);
    }

    public mh0 VH() {
        return this.mb;
    }

    public vh0 gn() {
        return this.WB;
    }

    public pk0(vh0 vh0Var, mh0 mh0Var) {
        this.WB = vh0Var;
        this.mb = mh0Var;
    }
}
