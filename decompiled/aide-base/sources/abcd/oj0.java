package abcd;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class oj0 extends bi0 {
    private int mb;

    public oj0() {
        this.mb = -1;
    }

    private int U2() {
        if (this.mb < 0) {
            int iU7 = 0;
            Enumeration enumerationAM = aM();
            while (enumerationAM.hasMoreElements()) {
                iU7 += ((mh0) enumerationAM.nextElement()).DW().we().u7();
            }
            this.mb = iU7;
        }
        return this.mb;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        yh0 yh0VarJ6 = yh0Var.j6();
        int iU2 = U2();
        yh0Var.FH(48);
        yh0Var.u7(iU2);
        Enumeration enumerationAM = aM();
        while (enumerationAM.hasMoreElements()) {
            yh0VarJ6.tp((mh0) enumerationAM.nextElement());
        }
    }

    @Override // abcd.ai0
    public int u7() {
        int iU2 = U2();
        return jk0.j6(iU2) + 1 + iU2;
    }

    public oj0(nh0 nh0Var) {
        super(nh0Var);
        this.mb = -1;
    }

    public oj0(mh0[] mh0VarArr) {
        super(mh0VarArr);
        this.mb = -1;
    }
}
