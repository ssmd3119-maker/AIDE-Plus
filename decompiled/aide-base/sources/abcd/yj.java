package abcd;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class yj {
    private mk DW;
    private tj FH;
    private vj Hw;
    private ak VH;
    private hk Zo;
    private final int j6;
    private nk v5;

    public interface a {
        int j6(bq bqVar);
    }

    public yj(int i, mk mkVar, tj tjVar) {
        if (mkVar == null) {
            throw new NullPointerException("unprocessedInsns == null");
        }
        if (tjVar == null) {
            throw new NullPointerException("unprocessedCatches == null");
        }
        this.j6 = i;
        this.DW = mkVar;
        this.FH = tjVar;
        this.Hw = null;
        this.v5 = null;
        this.Zo = null;
        this.VH = null;
    }

    private void DW() {
        if (this.VH != null) {
            return;
        }
        ak akVarEQ = this.DW.EQ();
        this.VH = akVarEQ;
        this.v5 = nk.ef(akVarEQ, this.j6);
        this.Zo = hk.ef(this.VH);
        this.Hw = this.FH.BT();
        this.DW = null;
        this.FH = null;
    }

    public boolean EQ() {
        return this.j6 != 1 && this.DW.Ws();
    }

    public HashSet<fr> FH() {
        return this.FH.DW();
    }

    public vj Hw() {
        DW();
        return this.Hw;
    }

    public hk VH() {
        DW();
        return this.Zo;
    }

    public ak Zo() {
        DW();
        return this.VH;
    }

    public nk gn() {
        DW();
        return this.v5;
    }

    public void j6(a aVar) {
        this.DW.VH(aVar);
    }

    public boolean tp() {
        return this.DW.J8();
    }

    public boolean u7() {
        return this.FH.j6();
    }

    public HashSet<bq> v5() {
        return this.DW.J0();
    }
}
