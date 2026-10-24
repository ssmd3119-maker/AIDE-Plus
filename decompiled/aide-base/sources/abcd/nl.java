package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class nl extends fk {
    public static final fk DW = new nl();

    private nl() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return z ? fk.gn(zjVar) : "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 3;
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
        fk.vy(lsVar, fk.j3(zjVar, rpVarWe.sG(0).Mr()), ((xj) zjVar).er());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx() + ", " + fk.u7(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        qp qpVarSG;
        if (!(zjVar instanceof xj)) {
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
        if (!fk.er(qpVarSG.Mr())) {
            return false;
        }
        bq bqVarRN = ((xj) zjVar).rN();
        return (bqVarRN instanceof zq) || (bqVarRN instanceof lq) || (bqVarRN instanceof yq);
    }
}
