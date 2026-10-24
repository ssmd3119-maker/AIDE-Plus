package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class ul extends fk {
    public static final fk DW = new ul();

    private ul() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.Ws((sq) ((xj) zjVar).rN(), 64);
    }

    @Override // abcd.fk
    public int Hw() {
        return 5;
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
        fk.nw(lsVar, fk.j3(zjVar, rpVarWe.sG(0).Mr()), ((rq) ((xj) zjVar).rN()).Mr());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx() + ", " + fk.QX((sq) ((xj) zjVar).rN());
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        if ((zjVar instanceof xj) && rpVarWe.size() == 1 && fk.er(rpVarWe.sG(0).Mr())) {
            return ((xj) zjVar).rN() instanceof rq;
        }
        return false;
    }
}
