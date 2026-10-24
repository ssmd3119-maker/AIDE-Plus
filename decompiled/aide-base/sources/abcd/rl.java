package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class rl extends fk {
    public static final fk DW = new rl();

    private rl() {
    }

    private static rp cb(rp rpVar) {
        int iDx = dx(rpVar);
        int size = rpVar.size();
        if (iDx == size) {
            return rpVar;
        }
        rp rpVar2 = new rp(iDx);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            qp qpVarSG = rpVar.sG(i2);
            rpVar2.Mz(i, qpVarSG);
            if (qpVarSG.J0() == 2) {
                rpVar2.Mz(i + 1, qp.ro(qpVarSG.Mr() + 1, fr.Jl));
                i += 2;
            } else {
                i++;
            }
        }
        rpVar2.Mr();
        return rpVar2;
    }

    private static int dx(rp rpVar) {
        int size = rpVar.size();
        if (size > 5) {
            return -1;
        }
        int iJ0 = 0;
        for (int i = 0; i < size; i++) {
            iJ0 += rpVar.sG(i).J0();
            if (!fk.yS((r5.Mr() + r5.J0()) - 1)) {
                return -1;
            }
        }
        if (iJ0 <= 5) {
            return iJ0;
        }
        return -1;
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
        for (int i = 0; i < size; i++) {
            qp qpVarSG = rpVarWe.sG(i);
            bitSet.set(i, fk.yS((qpVarSG.Mr() + qpVarSG.J0()) - 1));
        }
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        int iEr = ((xj) zjVar).er();
        rp rpVarCb = cb(zjVar.we());
        int size = rpVarCb.size();
        fk.KD(lsVar, fk.j3(zjVar, fk.XL(size > 4 ? rpVarCb.sG(4).Mr() : 0, size)), (short) iEr, fk.Zo(size > 0 ? rpVarCb.sG(0).Mr() : 0, size > 1 ? rpVarCb.sG(1).Mr() : 0, size > 2 ? rpVarCb.sG(2).Mr() : 0, size > 3 ? rpVarCb.sG(3).Mr() : 0));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return fk.Mr(cb(zjVar.we())) + ", " + fk.u7(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        if (!(zjVar instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) zjVar;
        if (!fk.gW(xjVar.er())) {
            return false;
        }
        bq bqVarRN = xjVar.rN();
        return ((bqVarRN instanceof vq) || (bqVarRN instanceof zq)) && dx(xjVar.we()) >= 0;
    }
}
