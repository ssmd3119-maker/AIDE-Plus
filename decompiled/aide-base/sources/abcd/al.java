package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class al extends fk {
    public static final fk DW = new al();

    private al() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 1;
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
        int size = rpVarWe.size();
        fk.BT(lsVar, fk.j3(zjVar, fk.XL(rpVarWe.sG(size - 2).Mr(), rpVarWe.sG(size - 1).Mr())));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        rp rpVarWe = zjVar.we();
        int size = rpVarWe.size();
        return rpVarWe.sG(size - 2).dx() + ", " + rpVarWe.sG(size - 1).dx();
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        qp qpVarSG;
        qp qpVarSG2;
        if (!(zjVar instanceof qk)) {
            return false;
        }
        rp rpVarWe = zjVar.we();
        int size = rpVarWe.size();
        if (size == 2) {
            qpVarSG = rpVarWe.sG(0);
            qpVarSG2 = rpVarWe.sG(1);
        } else {
            if (size != 3) {
                return false;
            }
            qpVarSG = rpVarWe.sG(1);
            qpVarSG2 = rpVarWe.sG(2);
            if (qpVarSG.Mr() != rpVarWe.sG(0).Mr()) {
                return false;
            }
        }
        return fk.yS(qpVarSG.Mr()) && fk.yS(qpVarSG2.Mr());
    }
}
