package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class ll extends fk {
    public static final fk DW = new ll();

    private ll() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 2;
    }

    @Override // abcd.fk
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        BitSet bitSet = new BitSet(3);
        bitSet.set(0, fk.er(rpVarWe.sG(0).Mr()));
        bitSet.set(1, fk.er(rpVarWe.sG(1).Mr()));
        bitSet.set(2, fk.er(rpVarWe.sG(2).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.SI(lsVar, fk.j3(zjVar, rpVarWe.sG(0).Mr()), fk.v5(rpVarWe.sG(1).Mr(), rpVarWe.sG(2).Mr()));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return rpVarWe.sG(0).dx() + ", " + rpVarWe.sG(1).dx() + ", " + rpVarWe.sG(2).dx();
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return (zjVar instanceof qk) && rpVarWe.size() == 3 && fk.er(rpVarWe.sG(0).Mr()) && fk.er(rpVarWe.sG(1).Mr()) && fk.er(rpVarWe.sG(2).Mr());
    }
}
