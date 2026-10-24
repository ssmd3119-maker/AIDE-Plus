package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class jl extends fk {
    public static final fk DW = new jl();

    private jl() {
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
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, fk.yS(rpVarWe.sG(0).Mr()));
        bitSet.set(1, fk.yS(rpVarWe.sG(1).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.SI(lsVar, fk.j3(zjVar, fk.XL(rpVarWe.sG(0).Mr(), rpVarWe.sG(1).Mr())), (short) ((tk) zjVar).yS());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return rpVarWe.sG(0).dx() + ", " + rpVarWe.sG(1).dx() + ", " + fk.FH(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        if (!(zjVar instanceof tk) || rpVarWe.size() != 2 || !fk.yS(rpVarWe.sG(0).Mr()) || !fk.yS(rpVarWe.sG(1).Mr())) {
            return false;
        }
        tk tkVar = (tk) zjVar;
        if (tkVar.gW()) {
            return DW(tkVar);
        }
        return true;
    }
}
