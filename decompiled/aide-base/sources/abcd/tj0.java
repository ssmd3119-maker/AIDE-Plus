package abcd;

import java.io.IOException;

/* loaded from: classes.dex */
public class tj0 extends hi0 {
    private static final byte[] qp = new byte[0];

    public tj0(boolean z, int i, mh0 mh0Var) {
        super(z, i, mh0Var);
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
        if (this.mb) {
            yh0Var.Zo(160, this.WB, qp);
            return;
        }
        ai0 ai0VarWe = this.fY.DW().we();
        if (!this.jw) {
            yh0Var.EQ(ai0VarWe.EQ() ? 160 : 128, this.WB);
            yh0Var.gn(ai0VarWe);
        } else {
            yh0Var.EQ(160, this.WB);
            yh0Var.u7(ai0VarWe.u7());
            yh0Var.tp(ai0VarWe);
        }
    }

    @Override // abcd.ai0
    public int u7() {
        int iDW;
        if (this.mb) {
            return jk0.DW(this.WB) + 1;
        }
        int iU7 = this.fY.DW().we().u7();
        if (this.jw) {
            iDW = jk0.DW(this.WB) + jk0.j6(iU7);
        } else {
            iU7--;
            iDW = jk0.DW(this.WB);
        }
        return iDW + iU7;
    }
}
