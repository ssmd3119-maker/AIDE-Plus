package abcd;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class tl0 extends uh0 {
    yi0 WB;
    sh0 mb;

    private tl0(bi0 bi0Var) {
        this.WB = new yi0(false);
        this.mb = null;
        if (bi0Var.j3() == 0) {
            this.WB = null;
            this.mb = null;
            return;
        }
        if (bi0Var.XL(0) instanceof yi0) {
            this.WB = yi0.Ws(bi0Var.XL(0));
        } else {
            this.WB = null;
            this.mb = gj0.J8(bi0Var.XL(0));
        }
        if (bi0Var.j3() > 1) {
            if (this.WB == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.mb = gj0.J8(bi0Var.XL(1));
        }
    }

    public static tl0 VH(Object obj) {
        if (obj instanceof tl0) {
            return (tl0) obj;
        }
        if (obj instanceof em0) {
            return VH(em0.j6((em0) obj));
        }
        if (obj != null) {
            return new tl0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        yi0 yi0Var = this.WB;
        if (yi0Var != null) {
            nh0Var.j6(yi0Var);
        }
        sh0 sh0Var = this.mb;
        if (sh0Var != null) {
            nh0Var.j6(sh0Var);
        }
        return new oj0(nh0Var);
    }

    public BigInteger gn() {
        sh0 sh0Var = this.mb;
        if (sh0Var != null) {
            return sh0Var.XL();
        }
        return null;
    }

    public String toString() {
        if (this.mb != null) {
            return "BasicConstraints: isCa(" + u7() + "), pathLenConstraint = " + this.mb.XL();
        }
        if (this.WB == null) {
            return "BasicConstraints: isCa(false)";
        }
        return "BasicConstraints: isCa(" + u7() + ")";
    }

    public boolean u7() {
        yi0 yi0Var = this.WB;
        return yi0Var != null && yi0Var.XL();
    }
}
