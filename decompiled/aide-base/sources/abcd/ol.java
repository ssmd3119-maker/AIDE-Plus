package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class ol extends fk {
    public static final fk DW = new ol();

    private ol() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.Ws((sq) ((xj) zjVar).rN(), 32);
    }

    @Override // abcd.fk
    public int Hw() {
        return 3;
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
        rp rpVarWe = zjVar.we();
        fk.vy(lsVar, fk.j3(zjVar, rpVarWe.sG(0).Mr()), ((sq) ((xj) zjVar).rN()).aM());
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
        if (bqVarRN instanceof sq) {
            return ((sq) bqVarRN).QX();
        }
        return false;
    }
}
