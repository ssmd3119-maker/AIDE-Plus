package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class tl extends fk {
    public static final fk DW = new tl();

    private tl() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return z ? fk.gn(zjVar) : "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 4;
    }

    @Override // abcd.fk
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        int size = rpVarWe.size();
        BitSet bitSet = new BitSet(size);
        boolean zEr = fk.er(rpVarWe.sG(0).Mr());
        if (size == 1) {
            bitSet.set(0, zEr);
        } else if (rpVarWe.sG(0).Mr() == rpVarWe.sG(1).Mr()) {
            bitSet.set(0, zEr);
            bitSet.set(1, zEr);
        }
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.P8(lsVar, fk.aM(zjVar), ((xj) zjVar).er(), (short) rpVarWe.sG(0).Mr());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx() + ", " + fk.u7(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        qp qpVarSG;
        if (!fk.j6 || !(zjVar instanceof xj)) {
            return false;
        }
        rp rpVarWe = zjVar.we();
        int size = rpVarWe.size();
        if (size == 1) {
            qpVarSG = rpVarWe.sG(0);
        } else {
            if (size != 2) {
                return false;
            }
            qpVarSG = rpVarWe.sG(0);
            if (qpVarSG.Mr() != rpVarWe.sG(1).Mr()) {
                return false;
            }
        }
        if (!fk.gW(qpVarSG.Mr())) {
            return false;
        }
        bq bqVarRN = ((xj) zjVar).rN();
        return (bqVarRN instanceof zq) || (bqVarRN instanceof lq);
    }
}
