package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class yk extends fk {
    public static final fk DW = new yk();

    private yk() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.Ws((sq) ((xj) zjVar).rN(), 4);
    }

    @Override // abcd.fk
    public int Hw() {
        return 1;
    }

    @Override // abcd.fk
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, fk.yS(rpVarWe.sG(0).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        fk.BT(lsVar, fk.j3(zjVar, fk.XL(zjVar.we().sG(0).Mr(), ((sq) ((xj) zjVar).rN()).aM() & 15)));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx() + ", " + fk.QX((sq) ((xj) zjVar).rN());
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        if (!(zjVar instanceof xj) || rpVarWe.size() != 1 || !fk.yS(rpVarWe.sG(0).Mr())) {
            return false;
        }
        bq bqVarRN = ((xj) zjVar).rN();
        if (!(bqVarRN instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) bqVarRN;
        return sqVar.QX() && fk.lg(sqVar.aM());
    }
}
