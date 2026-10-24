package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class ql extends fk {
    public static final fk DW = new ql();

    private ql() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 3;
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
        fk.KD(lsVar, fk.j3(zjVar, 0), (short) rpVarWe.sG(0).Mr(), (short) rpVarWe.sG(1).Mr());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return rpVarWe.sG(0).dx() + ", " + rpVarWe.sG(1).dx();
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return (zjVar instanceof qk) && rpVarWe.size() == 2 && fk.gW(rpVarWe.sG(0).Mr()) && fk.gW(rpVarWe.sG(1).Mr());
    }
}
