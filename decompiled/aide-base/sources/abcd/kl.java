package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class kl extends fk {
    public static final fk DW = new kl();

    private kl() {
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
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, fk.er(rpVarWe.sG(0).Mr()));
        bitSet.set(1, fk.gW(rpVarWe.sG(1).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.SI(lsVar, fk.j3(zjVar, rpVarWe.sG(0).Mr()), (short) rpVarWe.sG(1).Mr());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return rpVarWe.sG(0).dx() + ", " + rpVarWe.sG(1).dx();
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return (zjVar instanceof qk) && rpVarWe.size() == 2 && fk.er(rpVarWe.sG(0).Mr()) && fk.gW(rpVarWe.sG(1).Mr());
    }
}
