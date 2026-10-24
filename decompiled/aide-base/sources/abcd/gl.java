package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class gl extends fk {
    public static final fk DW = new gl();

    private gl() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.Ws((sq) ((xj) zjVar).rN(), 8);
    }

    @Override // abcd.fk
    public int Hw() {
        return 2;
    }

    @Override // abcd.fk
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, fk.er(rpVarWe.sG(0).Mr()));
        bitSet.set(1, fk.er(rpVarWe.sG(1).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.SI(lsVar, fk.j3(zjVar, rpVarWe.sG(0).Mr()), fk.v5(rpVarWe.sG(1).Mr(), ((sq) ((xj) zjVar).rN()).aM() & 255));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return rpVarWe.sG(0).dx() + ", " + rpVarWe.sG(1).dx() + ", " + fk.QX((sq) ((xj) zjVar).rN());
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        if (!(zjVar instanceof xj) || rpVarWe.size() != 2 || !fk.er(rpVarWe.sG(0).Mr()) || !fk.er(rpVarWe.sG(1).Mr())) {
            return false;
        }
        bq bqVarRN = ((xj) zjVar).rN();
        if (!(bqVarRN instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) bqVarRN;
        return sqVar.QX() && fk.a8(sqVar.aM());
    }
}
