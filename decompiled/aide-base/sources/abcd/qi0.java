package abcd;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class qi0 extends di0 {
    public qi0() {
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        yh0Var.FH(49);
        yh0Var.FH(128);
        Enumeration enumerationJ3 = j3();
        while (enumerationJ3.hasMoreElements()) {
            yh0Var.tp((mh0) enumerationJ3.nextElement());
        }
        yh0Var.FH(0);
        yh0Var.FH(0);
    }

    @Override // abcd.ai0
    public int u7() {
        Enumeration enumerationJ3 = j3();
        int iU7 = 0;
        while (enumerationJ3.hasMoreElements()) {
            iU7 += ((mh0) enumerationJ3.nextElement()).DW().u7();
        }
        return iU7 + 2 + 2;
    }

    public qi0(mh0 mh0Var) {
        super(mh0Var);
    }

    public qi0(nh0 nh0Var) {
        super(nh0Var, false);
    }

    public qi0(mh0[] mh0VarArr) {
        super(mh0VarArr, false);
    }
}
