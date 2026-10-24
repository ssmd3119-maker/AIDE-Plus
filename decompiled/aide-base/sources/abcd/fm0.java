package abcd;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes.dex */
public class fm0 extends uh0 {
    public static final vh0 AL;
    public static final vh0 Q6;
    public static final vh0 Z1;
    public static final vh0 cT;
    public static final vh0 fY;
    public static final vh0 hK;
    public static final vh0 jw;
    public static final vh0 k2;
    public static final vh0 kf;
    public static final vh0 n5;
    public static final vh0 q7;
    public static final vh0 qp;
    public static final vh0 w9;
    public static final vh0 zh;
    private Hashtable WB = new Hashtable();
    private Vector mb = new Vector();

    static {
        new vh0("2.5.29.9");
        new vh0("2.5.29.14");
        jw = new vh0("2.5.29.15");
        new vh0("2.5.29.16");
        fY = new vh0("2.5.29.17");
        new vh0("2.5.29.18");
        qp = new vh0("2.5.29.19");
        k2 = new vh0("2.5.29.20");
        new vh0("2.5.29.21");
        new vh0("2.5.29.23");
        new vh0("2.5.29.24");
        zh = new vh0("2.5.29.27");
        AL = new vh0("2.5.29.28");
        new vh0("2.5.29.29");
        w9 = new vh0("2.5.29.30");
        hK = new vh0("2.5.29.31");
        cT = new vh0("2.5.29.32");
        q7 = new vh0("2.5.29.33");
        Z1 = new vh0("2.5.29.35");
        n5 = new vh0("2.5.29.36");
        new vh0("2.5.29.37");
        Q6 = new vh0("2.5.29.46");
        kf = new vh0("2.5.29.54");
        new vh0("1.3.6.1.5.5.7.1.1");
        new vh0("1.3.6.1.5.5.7.1.11");
        new vh0("1.3.6.1.5.5.7.1.12");
        new vh0("1.3.6.1.5.5.7.1.2");
        new vh0("1.3.6.1.5.5.7.1.3");
        new vh0("1.3.6.1.5.5.7.1.4");
        new vh0("2.5.29.56");
        new vh0("2.5.29.55");
    }

    public fm0(bi0 bi0Var) {
        Enumeration enumerationAM = bi0Var.aM();
        while (enumerationAM.hasMoreElements()) {
            bi0 bi0VarJ8 = bi0.J8(enumerationAM.nextElement());
            if (bi0VarJ8.j3() == 3) {
                this.WB.put(bi0VarJ8.XL(0), new em0(yi0.Ws(bi0VarJ8.XL(1)), wh0.J8(bi0VarJ8.XL(2))));
            } else {
                if (bi0VarJ8.j3() != 2) {
                    throw new IllegalArgumentException("Bad sequence size: " + bi0VarJ8.j3());
                }
                this.WB.put(bi0VarJ8.XL(0), new em0(false, wh0.J8(bi0VarJ8.XL(1))));
            }
            this.mb.addElement(bi0VarJ8.XL(0));
        }
    }

    public static fm0 gn(Object obj) {
        if (obj == null || (obj instanceof fm0)) {
            return (fm0) obj;
        }
        if (obj instanceof bi0) {
            return new fm0((bi0) obj);
        }
        if (obj instanceof wl0) {
            return new fm0((bi0) ((wl0) obj).DW());
        }
        if (obj instanceof hi0) {
            return gn(((hi0) obj).Ws());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        Enumeration enumerationElements = this.mb.elements();
        while (enumerationElements.hasMoreElements()) {
            vh0 vh0Var = (vh0) enumerationElements.nextElement();
            em0 em0Var = (em0) this.WB.get(vh0Var);
            nh0 nh0Var2 = new nh0();
            nh0Var2.j6(vh0Var);
            if (em0Var.FH()) {
                nh0Var2.j6(new yi0(true));
            }
            nh0Var2.j6(em0Var.DW());
            nh0Var.j6(new oj0(nh0Var2));
        }
        return new oj0(nh0Var);
    }

    public em0 VH(jj0 jj0Var) {
        return (em0) this.WB.get(jj0Var);
    }

    public Enumeration u7() {
        return this.mb.elements();
    }

    public fm0(Vector vector, Hashtable hashtable) {
        Enumeration enumerationElements;
        if (vector == null) {
            enumerationElements = hashtable.keys();
        } else {
            enumerationElements = vector.elements();
        }
        while (enumerationElements.hasMoreElements()) {
            this.mb.addElement(jj0.aM(enumerationElements.nextElement()));
        }
        Enumeration enumerationElements2 = this.mb.elements();
        while (enumerationElements2.hasMoreElements()) {
            vh0 vh0VarAM = jj0.aM(enumerationElements2.nextElement());
            this.WB.put(vh0VarAM, (em0) hashtable.get(vh0VarAM));
        }
    }
}
