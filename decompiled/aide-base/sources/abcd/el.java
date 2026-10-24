package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class el extends fk {
    public static final fk DW = new el();

    private el() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.Ws((sq) ((xj) zjVar).rN(), 16);
    }

    @Override // abcd.fk
    public int Hw() {
        return 2;
    }

    @Override // abcd.fk
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, fk.er(rpVarWe.sG(0).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        fk.SI(lsVar, fk.j3(zjVar, zjVar.we().sG(0).Mr()), (short) ((sq) ((xj) zjVar).rN()).aM());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx() + ", " + fk.QX((sq) ((xj) zjVar).rN());
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        if (!(zjVar instanceof xj) || rpVarWe.size() != 1 || !fk.er(rpVarWe.sG(0).Mr())) {
            return false;
        }
        bq bqVarRN = ((xj) zjVar).rN();
        if (!(bqVarRN instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) bqVarRN;
        return sqVar.QX() && fk.rN(sqVar.aM());
    }
}
