package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class vl extends fk {
    public static final fk DW = new vl();

    private vl() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return z ? fk.gn(zjVar) : "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 5;
    }

    @Override // abcd.fk
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, fk.gW(rpVarWe.sG(0).Mr()));
        bitSet.set(1, fk.gW(rpVarWe.sG(1).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.ei(lsVar, fk.aM(zjVar), ((xj) zjVar).er(), (short) rpVarWe.sG(0).Mr(), (short) rpVarWe.sG(1).Mr());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return rpVarWe.sG(0).dx() + ", " + rpVarWe.sG(1).dx() + ", " + fk.u7(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        if (!fk.j6) {
            return false;
        }
        rp rpVarWe = zjVar.we();
        if (!(zjVar instanceof xj) || rpVarWe.size() != 2 || !fk.gW(rpVarWe.sG(0).Mr()) || !fk.gW(rpVarWe.sG(1).Mr())) {
            return false;
        }
        bq bqVarRN = ((xj) zjVar).rN();
        return (bqVarRN instanceof zq) || (bqVarRN instanceof lq);
    }
}
