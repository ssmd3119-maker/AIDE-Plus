package abcd;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class km0 extends uh0 {
    private sh0 WB;
    private sh0 fY;
    private sh0 jw;
    private sh0 mb;
    private lm0 qp;

    private km0(bi0 bi0Var) {
        if (bi0Var.j3() < 3 || bi0Var.j3() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + bi0Var.j3());
        }
        Enumeration enumerationAM = bi0Var.aM();
        this.WB = gj0.J8(enumerationAM.nextElement());
        this.mb = gj0.J8(enumerationAM.nextElement());
        this.jw = gj0.J8(enumerationAM.nextElement());
        mh0 mh0VarU7 = u7(enumerationAM);
        if (mh0VarU7 != null && (mh0VarU7 instanceof sh0)) {
            this.fY = gj0.J8(mh0VarU7);
            mh0VarU7 = u7(enumerationAM);
        }
        if (mh0VarU7 != null) {
            this.qp = lm0.VH(mh0VarU7.DW());
        }
    }

    public static km0 gn(Object obj) {
        if (obj == null || (obj instanceof km0)) {
            return (km0) obj;
        }
        if (obj instanceof bi0) {
            return new km0((bi0) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    private static mh0 u7(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (mh0) enumeration.nextElement();
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        nh0Var.j6(this.mb);
        nh0Var.j6(this.jw);
        sh0 sh0Var = this.fY;
        if (sh0Var != null) {
            nh0Var.j6(sh0Var);
        }
        lm0 lm0Var = this.qp;
        if (lm0Var != null) {
            nh0Var.j6(lm0Var);
        }
        return new oj0(nh0Var);
    }

    public sh0 VH() {
        return this.mb;
    }

    public sh0 tp() {
        return this.WB;
    }
}
