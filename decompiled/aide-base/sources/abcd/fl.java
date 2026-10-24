package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class fl extends fk {
    public static final fk DW = new fl();

    private fl() {
    }

    @Override // abcd.fk
    public boolean DW(tk tkVar) {
        int iYS = tkVar.yS();
        return iYS != 0 && fk.rN(iYS);
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.j6(zjVar);
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
        fk.SI(lsVar, fk.j3(zjVar, zjVar.we().sG(0).Mr()), (short) ((tk) zjVar).yS());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx() + ", " + fk.FH(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        if (!(zjVar instanceof tk) || rpVarWe.size() != 1 || !fk.er(rpVarWe.sG(0).Mr())) {
            return false;
        }
        tk tkVar = (tk) zjVar;
        if (tkVar.gW()) {
            return DW(tkVar);
        }
        return true;
    }
}
