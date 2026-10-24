package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class bk0 extends hi0 {
    private static final byte[] qp = new byte[0];

    public bk0(boolean z, int i, mh0 mh0Var) {
        super(z, i, mh0Var);
    }

    @Override // abcd.ai0
    public boolean EQ() {
        if (this.mb || this.jw) {
            return true;
        }
        return this.fY.DW().J0().EQ();
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        if (this.mb) {
            yh0Var.Zo(160, this.WB, qp);
            return;
        }
        ai0 ai0VarJ0 = this.fY.DW().J0();
        if (!this.jw) {
            yh0Var.EQ(ai0VarJ0.EQ() ? 160 : 128, this.WB);
            yh0Var.gn(ai0VarJ0);
        } else {
            yh0Var.EQ(160, this.WB);
            yh0Var.u7(ai0VarJ0.u7());
            yh0Var.tp(ai0VarJ0);
        }
    }

    @Override // abcd.ai0
    public int u7() {
        int iDW;
        if (this.mb) {
            return jk0.DW(this.WB) + 1;
        }
        int iU7 = this.fY.DW().J0().u7();
        if (this.jw) {
            iDW = jk0.DW(this.WB) + jk0.j6(iU7);
        } else {
            iU7--;
            iDW = jk0.DW(this.WB);
        }
        return iDW + iU7;
    }
}
