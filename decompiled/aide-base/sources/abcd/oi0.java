package abcd;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class oi0 extends bi0 {
    public oi0() {
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        yh0Var.FH(48);
        yh0Var.FH(128);
        Enumeration enumerationAM = aM();
        while (enumerationAM.hasMoreElements()) {
            yh0Var.tp((mh0) enumerationAM.nextElement());
        }
        yh0Var.FH(0);
        yh0Var.FH(0);
    }

    @Override // abcd.ai0
    public int u7() {
        Enumeration enumerationAM = aM();
        int iU7 = 0;
        while (enumerationAM.hasMoreElements()) {
            iU7 += ((mh0) enumerationAM.nextElement()).DW().u7();
        }
        return iU7 + 2 + 2;
    }

    public oi0(mh0 mh0Var) {
        super(mh0Var);
    }

    public oi0(nh0 nh0Var) {
        super(nh0Var);
    }
}
