package abcd;

import abcd.cs;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class kr {
    private final int DW;
    private final BitSet FH;
    private final ArrayList<cs>[] Hw;
    private final ds j6;

    private static class a implements cs.a {
        BitSet j6;

        public a(BitSet bitSet) {
            this.j6 = bitSet;
        }

        @Override // abcd.cs.a
        public void DW(tr trVar) {
            if (kr.DW(trVar)) {
                return;
            }
            this.j6.set(trVar.J8().Mr());
        }

        @Override // abcd.cs.a
        public void FH(tr trVar) {
            qp qpVarJ8 = trVar.J8();
            if (kr.DW(trVar) || qpVarJ8 == null) {
                return;
            }
            this.j6.set(qpVarJ8.Mr());
        }

        @Override // abcd.cs.a
        public void j6(vr vrVar) {
            if (kr.DW(vrVar)) {
                return;
            }
            this.j6.set(vrVar.J8().Mr());
        }
    }

    private kr(ds dsVar) {
        this.j6 = dsVar;
        this.DW = dsVar.a8();
        this.FH = new BitSet(this.DW);
        this.Hw = this.j6.lg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean DW(cs csVar) {
        if (csVar == null) {
            return true;
        }
        return csVar.j3();
    }

    private boolean FH(int i, BitSet bitSet) {
        if (bitSet != null && bitSet.get(i)) {
            return true;
        }
        Iterator<cs> it = this.Hw[i].iterator();
        while (it.hasNext()) {
            if (DW(it.next())) {
                return false;
            }
        }
        if (bitSet == null) {
            bitSet = new BitSet(this.DW);
        }
        bitSet.set(i);
        Iterator<cs> it2 = this.Hw[i].iterator();
        while (it2.hasNext()) {
            qp qpVarJ8 = it2.next().J8();
            if (qpVarJ8 == null || !FH(qpVarJ8.Mr(), bitSet)) {
                return false;
            }
        }
        return true;
    }

    public static void Hw(ds dsVar) {
        new kr(dsVar).Zo();
    }

    private void Zo() {
        v5();
        HashSet hashSet = new HashSet();
        this.j6.we(new a(this.FH));
        while (true) {
            int iNextSetBit = this.FH.nextSetBit(0);
            if (iNextSetBit < 0) {
                this.j6.u7(hashSet);
                return;
            }
            this.FH.clear(iNextSetBit);
            if (this.Hw[iNextSetBit].size() == 0 || FH(iNextSetBit, null)) {
                cs csVarWs = this.j6.Ws(iNextSetBit);
                if (!hashSet.contains(csVarWs)) {
                    rp rpVarWs = csVarWs.Ws();
                    int size = rpVarWs.size();
                    for (int i = 0; i < size; i++) {
                        qp qpVarSG = rpVarWs.sG(i);
                        this.Hw[qpVarSG.Mr()].remove(csVarWs);
                        if (!DW(this.j6.Ws(qpVarSG.Mr()))) {
                            this.FH.set(qpVarSG.Mr());
                        }
                    }
                    hashSet.add(csVarWs);
                }
            }
        }
    }

    private void v5() {
        HashSet hashSet = new HashSet();
        this.j6.VH();
        Iterator<as> it = this.j6.J0().iterator();
        while (it.hasNext()) {
            as next = it.next();
            if (!next.nw()) {
                for (int i = 0; i < next.QX().size(); i++) {
                    cs csVar = next.QX().get(i);
                    rp rpVarWs = csVar.Ws();
                    int size = rpVarWs.size();
                    if (size != 0) {
                        hashSet.add(csVar);
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        this.Hw[rpVarWs.sG(i2).Mr()].remove(csVar);
                    }
                    qp qpVarJ8 = csVar.J8();
                    if (qpVarJ8 != null) {
                        Iterator<cs> it2 = this.Hw[qpVarJ8.Mr()].iterator();
                        while (it2.hasNext()) {
                            cs next2 = it2.next();
                            if (next2 instanceof vr) {
                                ((vr) next2).vJ(qpVarJ8);
                            }
                        }
                    }
                }
            }
        }
        this.j6.u7(hashSet);
    }
}
