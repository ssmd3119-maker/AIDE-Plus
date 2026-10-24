package abcd;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class tk0 extends uh0 {
    private sh0 WB;
    private di0 fY;
    private sl0 jw;
    private wh0 k2;
    private sk0 mb;
    private sl0 qp;
    private di0 zh;

    public tk0(sk0 sk0Var, sl0 sl0Var, di0 di0Var, sl0 sl0Var2, wh0 wh0Var, di0 di0Var2) {
        if (sk0Var.gn()) {
            this.WB = new sh0(3);
        } else {
            this.WB = new sh0(1);
        }
        this.mb = sk0Var;
        this.jw = sl0Var;
        this.fY = di0Var;
        this.qp = sl0Var2;
        this.k2 = wh0Var;
        this.zh = di0Var2;
    }

    public static tk0 gn(Object obj) {
        if (obj == null || (obj instanceof tk0)) {
            return (tk0) obj;
        }
        if (obj instanceof bi0) {
            return new tk0((bi0) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        nh0Var.j6(this.mb);
        nh0Var.j6(this.jw);
        if (this.fY != null) {
            nh0Var.j6(new tj0(false, 0, this.fY));
        }
        nh0Var.j6(this.qp);
        nh0Var.j6(this.k2);
        if (this.zh != null) {
            nh0Var.j6(new tj0(false, 1, this.zh));
        }
        return new oj0(nh0Var);
    }

    public sl0 VH() {
        return this.jw;
    }

    public sh0 u7() {
        return this.WB;
    }

    public tk0(bi0 bi0Var) {
        Enumeration enumerationAM = bi0Var.aM();
        this.WB = (sh0) enumerationAM.nextElement();
        this.mb = sk0.VH(enumerationAM.nextElement());
        this.jw = sl0.gn(enumerationAM.nextElement());
        Object objNextElement = enumerationAM.nextElement();
        if (objNextElement instanceof hi0) {
            this.fY = di0.QX((hi0) objNextElement, false);
            this.qp = sl0.gn(enumerationAM.nextElement());
        } else {
            this.fY = null;
            this.qp = sl0.gn(objNextElement);
        }
        this.k2 = wh0.J8(enumerationAM.nextElement());
        if (enumerationAM.hasMoreElements()) {
            this.zh = di0.QX((hi0) enumerationAM.nextElement(), false);
        } else {
            this.zh = null;
        }
    }
}
