package abcd;

import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class si0 extends hi0 {
    public si0(int i, mh0 mh0Var) {
        super(true, i, mh0Var);
    }

    @Override // abcd.ai0
    public boolean EQ() {
        if (this.mb || this.jw) {
            return true;
        }
        return this.fY.DW().we().EQ();
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        Enumeration enumerationJ3;
        yh0Var.EQ(160, this.WB);
        yh0Var.FH(128);
        if (!this.mb) {
            if (this.jw) {
                yh0Var.tp(this.fY);
            } else {
                mh0 mh0Var = this.fY;
                if (mh0Var instanceof wh0) {
                    enumerationJ3 = mh0Var instanceof mi0 ? ((mi0) mh0Var).aM() : new mi0(((wh0) mh0Var).Ws()).aM();
                } else if (mh0Var instanceof bi0) {
                    enumerationJ3 = ((bi0) mh0Var).aM();
                } else {
                    if (!(mh0Var instanceof di0)) {
                        throw new RuntimeException("not implemented: " + this.fY.getClass().getName());
                    }
                    enumerationJ3 = ((di0) mh0Var).j3();
                }
                while (enumerationJ3.hasMoreElements()) {
                    yh0Var.tp((mh0) enumerationJ3.nextElement());
                }
            }
        }
        yh0Var.FH(0);
        yh0Var.FH(0);
    }

    @Override // abcd.ai0
    public int u7() {
        int iDW;
        if (this.mb) {
            return jk0.DW(this.WB) + 1;
        }
        int iU7 = this.fY.DW().u7();
        if (this.jw) {
            iDW = jk0.DW(this.WB) + jk0.j6(iU7);
        } else {
            iU7--;
            iDW = jk0.DW(this.WB);
        }
        return iDW + iU7;
    }

    public si0(boolean z, int i, mh0 mh0Var) {
        super(z, i, mh0Var);
    }
}
