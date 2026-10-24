package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class pl extends fk {
    public static final fk DW = new pl();

    private pl() {
    }

    @Override // abcd.fk
    public boolean DW(tk tkVar) {
        return true;
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.j6(zjVar);
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
        fk.vy(lsVar, fk.j3(zjVar, rpVarWe.sG(0).Mr()), ((tk) zjVar).yS());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx() + ", " + fk.FH(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return (zjVar instanceof tk) && rpVarWe.size() == 1 && fk.er(rpVarWe.sG(0).Mr());
    }
}
