package abcd;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class wl0 extends uh0 {
    private Hashtable WB = new Hashtable();
    private Vector mb = new Vector();

    private wl0(bi0 bi0Var) {
        Enumeration enumerationAM = bi0Var.aM();
        while (enumerationAM.hasMoreElements()) {
            bi0 bi0VarJ8 = bi0.J8(enumerationAM.nextElement());
            if (bi0VarJ8.j3() == 3) {
                this.WB.put(bi0VarJ8.XL(0), new vl0(jj0.aM(bi0VarJ8.XL(0)), yi0.Ws(bi0VarJ8.XL(1)), wh0.J8(bi0VarJ8.XL(2))));
            } else {
                if (bi0VarJ8.j3() != 2) {
                    throw new IllegalArgumentException("Bad sequence size: " + bi0VarJ8.j3());
                }
                this.WB.put(bi0VarJ8.XL(0), new vl0(jj0.aM(bi0VarJ8.XL(0)), false, wh0.J8(bi0VarJ8.XL(1))));
            }
            this.mb.addElement(bi0VarJ8.XL(0));
        }
    }

    public static wl0 gn(Object obj) {
        if (obj instanceof wl0) {
            return (wl0) obj;
        }
        if (obj != null) {
            return new wl0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        Enumeration enumerationElements = this.mb.elements();
        while (enumerationElements.hasMoreElements()) {
            vh0 vh0Var = (vh0) enumerationElements.nextElement();
            vl0 vl0Var = (vl0) this.WB.get(vh0Var);
            nh0 nh0Var2 = new nh0();
            nh0Var2.j6(vh0Var);
            if (vl0Var.DW()) {
                nh0Var2.j6(yi0.QX(true));
            }
            nh0Var2.j6(vl0Var.j6());
            nh0Var.j6(new oj0(nh0Var2));
        }
        return new oj0(nh0Var);
    }

    public vl0 VH(vh0 vh0Var) {
        return (vl0) this.WB.get(vh0Var);
    }
}
