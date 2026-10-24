package abcd;

import java.math.BigInteger;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class gl0 extends uh0 {
    sh0 WB;
    sh0 jw;
    sh0 mb;

    public gl0(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.WB = new sh0(bigInteger);
        this.mb = new sh0(bigInteger2);
        if (i != 0) {
            this.jw = new sh0(i);
        } else {
            this.jw = null;
        }
    }

    public static gl0 gn(Object obj) {
        if (obj instanceof gl0) {
            return (gl0) obj;
        }
        if (obj != null) {
            return new gl0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        nh0Var.j6(this.WB);
        nh0Var.j6(this.mb);
        if (u7() != null) {
            nh0Var.j6(this.jw);
        }
        return new oj0(nh0Var);
    }

    public BigInteger VH() {
        return this.mb.QX();
    }

    public BigInteger tp() {
        return this.WB.QX();
    }

    public BigInteger u7() {
        sh0 sh0Var = this.jw;
        if (sh0Var == null) {
            return null;
        }
        return sh0Var.QX();
    }

    private gl0(bi0 bi0Var) {
        Enumeration enumerationAM = bi0Var.aM();
        this.WB = gj0.J8(enumerationAM.nextElement());
        this.mb = gj0.J8(enumerationAM.nextElement());
        if (enumerationAM.hasMoreElements()) {
            this.jw = (sh0) enumerationAM.nextElement();
        } else {
            this.jw = null;
        }
    }
}
