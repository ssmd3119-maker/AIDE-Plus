package abcd;

/* loaded from: classes.dex */
public class sl0 extends uh0 {
    private vh0 WB;
    private boolean jw;
    private mh0 mb;

    public sl0(vh0 vh0Var) {
        this.jw = false;
        this.WB = vh0Var;
    }

    public static sl0 gn(Object obj) {
        if (obj == null || (obj instanceof sl0)) {
            return (sl0) obj;
        }
        if (obj instanceof vh0) {
            return new sl0((vh0) obj);
        }
        if (obj instanceof String) {
            return new sl0((String) obj);
        }
        if ((obj instanceof bi0) || (obj instanceof ci0)) {
            return new sl0(bi0.J8(obj));
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public static sl0 u7(hi0 hi0Var, boolean z) {
        return gn(bi0.Ws(hi0Var, z));
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        if (this.jw) {
            mh0 mh0Var = this.mb;
            if (mh0Var != null) {
                nh0Var.j6(mh0Var);
            } else {
                nh0Var.j6(hj0.WB);
            }
        }
        return new oj0(nh0Var);
    }

    public mh0 EQ() {
        return this.mb;
    }

    public vh0 VH() {
        return new vh0(this.WB.XL());
    }

    public vh0 tp() {
        return this.WB;
    }

    public sl0(String str) {
        this.jw = false;
        this.WB = new vh0(str);
    }

    public sl0(jj0 jj0Var) {
        this.jw = false;
        this.WB = new vh0(jj0Var.XL());
    }

    public sl0(jj0 jj0Var, mh0 mh0Var) {
        this.jw = false;
        this.jw = true;
        this.WB = new vh0(jj0Var.XL());
        this.mb = mh0Var;
    }

    public sl0(vh0 vh0Var, mh0 mh0Var) {
        this.jw = false;
        this.jw = true;
        this.WB = vh0Var;
        this.mb = mh0Var;
    }

    public sl0(bi0 bi0Var) {
        this.jw = false;
        if (bi0Var.j3() >= 1 && bi0Var.j3() <= 2) {
            this.WB = jj0.aM(bi0Var.XL(0));
            if (bi0Var.j3() == 2) {
                this.jw = true;
                this.mb = bi0Var.XL(1);
                return;
            } else {
                this.mb = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + bi0Var.j3());
    }
}
