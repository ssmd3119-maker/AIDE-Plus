package abcd;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class rk0 extends uh0 {
    private boolean AL;
    private sh0 WB;
    private di0 fY;
    private pk0 jw;
    private di0 k2;
    private di0 mb;
    private di0 qp;
    private boolean zh;

    public rk0(di0 di0Var, pk0 pk0Var, di0 di0Var2, di0 di0Var3, di0 di0Var4) {
        this.WB = VH(pk0Var.gn(), di0Var2, di0Var3, di0Var4);
        this.mb = di0Var;
        this.jw = pk0Var;
        this.fY = di0Var2;
        this.qp = di0Var3;
        this.k2 = di0Var4;
        this.AL = di0Var3 instanceof qi0;
        this.zh = di0Var2 instanceof qi0;
    }

    private sh0 VH(vh0 vh0Var, di0 di0Var, di0 di0Var2, di0 di0Var3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (di0Var != null) {
            Enumeration enumerationJ3 = di0Var.j3();
            z = false;
            z2 = false;
            z3 = false;
            while (enumerationJ3.hasMoreElements()) {
                Object objNextElement = enumerationJ3.nextElement();
                if (objNextElement instanceof hi0) {
                    hi0 hi0VarJ8 = hi0.J8(objNextElement);
                    if (hi0VarJ8.QX() == 1) {
                        z2 = true;
                    } else if (hi0VarJ8.QX() == 2) {
                        z3 = true;
                    } else if (hi0VarJ8.QX() == 3) {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        if (z) {
            return new sh0(5);
        }
        if (di0Var2 != null) {
            Enumeration enumerationJ32 = di0Var2.j3();
            while (enumerationJ32.hasMoreElements()) {
                if (enumerationJ32.nextElement() instanceof hi0) {
                    z4 = true;
                }
            }
        }
        return z4 ? new sh0(5) : z3 ? new sh0(4) : z2 ? new sh0(3) : gn(di0Var3) ? new sh0(3) : !ok0.j6.equals(vh0Var) ? new sh0(3) : new sh0(1);
    }

    private boolean gn(di0 di0Var) {
        Enumeration enumerationJ3 = di0Var.j3();
        while (enumerationJ3.hasMoreElements()) {
            if (tk0.gn(enumerationJ3.nextElement()).u7().XL().intValue() == 3) {
                return true;
            }
        }
        return false;
    }

    public static rk0 u7(Object obj) {
        if (obj instanceof rk0) {
            return (rk0) obj;
        }
        if (obj != null) {
            return new rk0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        nh0Var.j6(this.mb);
        nh0Var.j6(this.jw);
        di0 di0Var = this.fY;
        if (di0Var != null) {
            if (this.zh) {
                nh0Var.j6(new si0(false, 0, di0Var));
            } else {
                nh0Var.j6(new tj0(false, 0, this.fY));
            }
        }
        di0 di0Var2 = this.qp;
        if (di0Var2 != null) {
            if (this.AL) {
                nh0Var.j6(new si0(false, 1, di0Var2));
            } else {
                nh0Var.j6(new tj0(false, 1, this.qp));
            }
        }
        nh0Var.j6(this.k2);
        return new oi0(nh0Var);
    }

    private rk0(bi0 bi0Var) {
        Enumeration enumerationAM = bi0Var.aM();
        this.WB = gj0.J8(enumerationAM.nextElement());
        this.mb = (di0) enumerationAM.nextElement();
        this.jw = pk0.u7(enumerationAM.nextElement());
        while (enumerationAM.hasMoreElements()) {
            ai0 ai0Var = (ai0) enumerationAM.nextElement();
            if (ai0Var instanceof hi0) {
                hi0 hi0Var = (hi0) ai0Var;
                int iQX = hi0Var.QX();
                if (iQX == 0) {
                    this.zh = hi0Var instanceof si0;
                    this.fY = di0.QX(hi0Var, false);
                } else if (iQX == 1) {
                    this.AL = hi0Var instanceof si0;
                    this.qp = di0.QX(hi0Var, false);
                } else {
                    throw new IllegalArgumentException("unknown tag value " + hi0Var.QX());
                }
            } else {
                this.k2 = (di0) ai0Var;
            }
        }
    }
}
