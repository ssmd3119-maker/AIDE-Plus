package abcd;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class qj0 extends di0 {
    private int jw;

    public qj0() {
        this.jw = -1;
    }

    private int lg() {
        if (this.jw < 0) {
            int iU7 = 0;
            Enumeration enumerationJ3 = j3();
            while (enumerationJ3.hasMoreElements()) {
                iU7 += ((mh0) enumerationJ3.nextElement()).DW().we().u7();
            }
            this.jw = iU7;
        }
        return this.jw;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        yh0 yh0VarJ6 = yh0Var.j6();
        int iLg = lg();
        yh0Var.FH(49);
        yh0Var.u7(iLg);
        Enumeration enumerationJ3 = j3();
        while (enumerationJ3.hasMoreElements()) {
            yh0VarJ6.tp((mh0) enumerationJ3.nextElement());
        }
    }

    @Override // abcd.ai0
    public int u7() {
        int iLg = lg();
        return jk0.j6(iLg) + 1 + iLg;
    }

    public qj0(mh0 mh0Var) {
        super(mh0Var);
        this.jw = -1;
    }

    public qj0(nh0 nh0Var) {
        super(nh0Var, true);
        this.jw = -1;
    }

    public qj0(nh0 nh0Var, boolean z) {
        super(nh0Var, z);
        this.jw = -1;
    }
}
