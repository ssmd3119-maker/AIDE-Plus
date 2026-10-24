package abcd;

import abcd.lr;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class bs {
    private static void DW(ds dsVar) {
        Hw(dsVar);
        FH(dsVar);
        v5(dsVar);
    }

    private static void FH(ds dsVar) {
        ArrayList<as> arrayListJ0 = dsVar.J0();
        for (int size = arrayListJ0.size() - 1; size >= 0; size--) {
            as asVar = arrayListJ0.get(size);
            if (!asVar.ei() && asVar.Mr().cardinality() > 1 && asVar.QX().get(0).lg()) {
                BitSet bitSet = (BitSet) asVar.Mr().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    arrayListJ0.get(iNextSetBit).P8(asVar).QX().add(0, asVar.QX().get(0).clone());
                }
                asVar.QX().remove(0);
            }
        }
    }

    private static void Hw(ds dsVar) {
        ArrayList<as> arrayListJ0 = dsVar.J0();
        for (int size = arrayListJ0.size() - 1; size >= 0; size--) {
            as asVar = arrayListJ0.get(size);
            if (VH(asVar)) {
                asVar.vy();
            }
        }
    }

    private static boolean VH(as asVar) {
        return asVar.Mr().cardinality() > 1 && asVar.BT().cardinality() > 1;
    }

    private static boolean Zo(as asVar, as asVar2) {
        ArrayList<cs> arrayListQX = asVar.QX();
        cs csVar = arrayListQX.get(arrayListQX.size() - 1);
        return (csVar.J8() != null || csVar.Ws().size() > 0) && asVar2.Mr().cardinality() > 1;
    }

    private static void gn(ds dsVar, rr rrVar, int i) {
        ArrayList<as> arrayListJ0 = dsVar.J0();
        int size = arrayListJ0.size();
        int iA8 = dsVar.a8() - i;
        lr.a[] aVarArrHw = new lr(dsVar).Hw();
        BitSet[] bitSetArr = new BitSet[iA8];
        BitSet[] bitSetArr2 = new BitSet[iA8];
        for (int i2 = 0; i2 < iA8; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = arrayListJ0.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator<cs> it = arrayListJ0.get(i3).QX().iterator();
            while (it.hasNext()) {
                qp qpVarJ8 = it.next().J8();
                if (qpVarJ8 != null && qpVarJ8.Mr() - i >= 0) {
                    bitSetArr[qpVarJ8.Mr() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < iA8; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    bitSet.clear(iNextSetBit);
                    zs it2 = aVarArrHw[iNextSetBit].j6.iterator();
                    while (it2.hasNext()) {
                        int next = it2.next();
                        if (!bitSetArr2[i4].get(next)) {
                            bitSetArr2[i4].set(next);
                            int i5 = i4 + i;
                            qp qpVarVy = rrVar.vy(next).vy(i5);
                            if (qpVarVy == null) {
                                arrayListJ0.get(next).VH(i5);
                            } else {
                                arrayListJ0.get(next).gn(qpVarVy);
                            }
                            if (!bitSetArr[i4].get(next)) {
                                bitSet.set(next);
                            }
                        }
                    }
                }
            }
        }
    }

    public static ds j6(up upVar, int i, boolean z) {
        ds dsVarEi = ds.ei(upVar, i, z);
        DW(dsVarEi);
        gn(dsVarEi, qr.DW(dsVarEi), 0);
        new es(dsVarEi).run();
        dsVarEi.gW();
        return dsVarEi;
    }

    public static void u7(ds dsVar, int i) {
        gn(dsVar, qr.DW(dsVar), i);
        new es(dsVar, i).run();
    }

    private static void v5(ds dsVar) {
        ArrayList<as> arrayListJ0 = dsVar.J0();
        for (int size = arrayListJ0.size() - 1; size >= 0; size--) {
            as asVar = arrayListJ0.get(size);
            BitSet bitSet = (BitSet) asVar.BT().clone();
            for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                as asVar2 = arrayListJ0.get(iNextSetBit);
                if (Zo(asVar, asVar2)) {
                    asVar.P8(asVar2);
                }
            }
        }
    }
}
