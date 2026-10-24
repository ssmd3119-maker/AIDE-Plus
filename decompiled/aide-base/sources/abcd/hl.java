package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class hl extends fk {
    public static final fk DW = new hl();

    private hl() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return z ? fk.gn(zjVar) : "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 2;
    }

    @Override // abcd.fk
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, fk.yS(rpVarWe.sG(0).Mr()));
        bitSet.set(1, fk.yS(rpVarWe.sG(1).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.SI(lsVar, fk.j3(zjVar, fk.XL(rpVarWe.sG(0).Mr(), rpVarWe.sG(1).Mr())), (short) ((xj) zjVar).er());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return rpVarWe.sG(0).dx() + ", " + rpVarWe.sG(1).dx() + ", " + fk.u7(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        if (!(zjVar instanceof xj) || rpVarWe.size() != 2 || !fk.yS(rpVarWe.sG(0).Mr()) || !fk.yS(rpVarWe.sG(1).Mr())) {
            return false;
        }
        xj xjVar = (xj) zjVar;
        if (!fk.gW(xjVar.er())) {
            return false;
        }
        bq bqVarRN = xjVar.rN();
        return (bqVarRN instanceof zq) || (bqVarRN instanceof lq);
    }
}
