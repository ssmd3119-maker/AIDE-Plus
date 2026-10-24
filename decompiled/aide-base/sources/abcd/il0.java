package abcd;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class il0 extends uh0 {
    private wh0 WB;
    private di0 jw;
    private sl0 mb;

    public il0(sl0 sl0Var, mh0 mh0Var) {
        this(sl0Var, mh0Var, null);
    }

    public static il0 VH(Object obj) {
        if (obj instanceof il0) {
            return (il0) obj;
        }
        if (obj != null) {
            return new il0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(new sh0(0));
        nh0Var.j6(this.mb);
        nh0Var.j6(this.WB);
        if (this.jw != null) {
            nh0Var.j6(new tj0(false, 0, this.jw));
        }
        return new oj0(nh0Var);
    }

    public sl0 gn() {
        return this.mb;
    }

    public mh0 u7() {
        return ai0.tp(this.WB.Ws());
    }

    public il0(sl0 sl0Var, mh0 mh0Var, di0 di0Var) {
        this.WB = new kj0(mh0Var.DW().Zo("DER"));
        this.mb = sl0Var;
        this.jw = di0Var;
    }

    public il0(bi0 bi0Var) {
        Enumeration enumerationAM = bi0Var.aM();
        if (((sh0) enumerationAM.nextElement()).XL().intValue() == 0) {
            this.mb = sl0.gn(enumerationAM.nextElement());
            this.WB = wh0.J8(enumerationAM.nextElement());
            if (enumerationAM.hasMoreElements()) {
                this.jw = di0.QX((hi0) enumerationAM.nextElement(), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for private key info");
    }
}
