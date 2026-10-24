package abcd;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class yl0 extends uh0 {
    private sl0 WB;
    private xi0 mb;

    public yl0(sl0 sl0Var, mh0 mh0Var) {
        this.mb = new xi0(mh0Var);
        this.WB = sl0Var;
    }

    public static yl0 gn(Object obj) {
        if (obj instanceof yl0) {
            return (yl0) obj;
        }
        if (obj != null) {
            return new yl0(bi0.J8(obj));
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

    public sl0 VH() {
        return this.WB;
    }

    public ai0 u7() {
        return new rh0(this.mb.QX()).we();
    }

    public yl0(bi0 bi0Var) {
        if (bi0Var.j3() == 2) {
            Enumeration enumerationAM = bi0Var.aM();
            this.WB = sl0.gn(enumerationAM.nextElement());
            this.mb = xi0.XL(enumerationAM.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + bi0Var.j3());
        }
    }
}
