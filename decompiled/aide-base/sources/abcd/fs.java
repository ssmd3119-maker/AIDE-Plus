package abcd;

import abcd.cs;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class fs extends js {
    private final BitSet EQ;
    private final Map<kp, ArrayList<qp>> FH;
    private final ArrayList<tr> Hw;
    private final BitSet VH;
    private final ArrayList<vr> Zo;
    private final or gn;
    private final BitSet tp;
    private final int u7;
    private final ArrayList<tr> v5;

    class a implements cs.a {
        public a() {
        }

        private void Hw(cs csVar) {
            qp qpVarEQ = csVar.EQ();
            if (qpVarEQ != null) {
                kp kpVarQX = qpVarEQ.QX();
                ArrayList arrayList = (ArrayList) fs.this.FH.get(kpVarQX);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    fs.this.FH.put(kpVarQX, arrayList);
                }
                arrayList.add(qpVarEQ);
            }
            if (!(csVar instanceof tr)) {
                if (csVar instanceof vr) {
                    fs.this.Zo.add((vr) csVar);
                }
            } else if (csVar.we().Hw() == 56) {
                fs.this.Hw.add((tr) csVar);
            } else if (ur.j6().DW(csVar.J0().EQ(), csVar.Ws())) {
                fs.this.v5.add((tr) csVar);
            }
        }

        @Override // abcd.cs.a
        public void DW(tr trVar) {
            Hw(trVar);
        }

        @Override // abcd.cs.a
        public void FH(tr trVar) {
            Hw(trVar);
        }

        @Override // abcd.cs.a
        public void j6(vr vrVar) {
            Hw(vrVar);
        }
    }

    private static class b {
        private final int[] DW;
        private int FH = 0;
        private final int[] j6;

        public b(int i) {
            this.j6 = new int[i];
            this.DW = new int[i];
        }

        public int DW() {
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < this.FH; i4++) {
                int[] iArr = this.DW;
                if (i3 < iArr[i4]) {
                    int i5 = this.j6[i4];
                    i3 = iArr[i4];
                    i2 = i5;
                    i = i4;
                }
            }
            this.DW[i] = 0;
            return i2;
        }

        public int FH() {
            return this.FH;
        }

        public void j6(int i) {
            int i2 = 0;
            while (true) {
                int i3 = this.FH;
                if (i2 >= i3) {
                    this.j6[i3] = i;
                    this.DW[i3] = 1;
                    this.FH = i3 + 1;
                    return;
                } else {
                    if (this.j6[i2] == i) {
                        int[] iArr = this.DW;
                        iArr[i2] = iArr[i2] + 1;
                        return;
                    }
                    i2++;
                }
            }
        }
    }

    public fs(ds dsVar, hs hsVar, boolean z) {
        super(dsVar, hsVar);
        this.VH = new BitSet(dsVar.a8());
        this.gn = new or(hsVar, dsVar.a8());
        this.u7 = dsVar.U2();
        BitSet bitSet = new BitSet(this.u7 * 2);
        this.tp = bitSet;
        bitSet.set(0, this.u7);
        this.EQ = new BitSet(this.u7 * 2);
        this.FH = new TreeMap();
        this.Hw = new ArrayList<>();
        this.v5 = new ArrayList<>();
        this.Zo = new ArrayList<>();
    }

    private void BT(vr vrVar) {
        qp qpVarJ8 = vrVar.J8();
        int iMr = qpVarJ8.Mr();
        int iJ0 = qpVarJ8.J0();
        rp rpVarWs = vrVar.Ws();
        int size = rpVarWs.size();
        ArrayList<qp> arrayList = new ArrayList<>();
        b bVar = new b(size + 1);
        if (this.VH.get(iMr)) {
            bVar.j6(this.gn.v5(iMr));
        } else {
            arrayList.add(qpVarJ8);
        }
        for (int i = 0; i < size; i++) {
            qp qpVarJ82 = this.j6.Ws(rpVarWs.sG(i).Mr()).J8();
            int iMr2 = qpVarJ82.Mr();
            if (this.VH.get(iMr2)) {
                bVar.j6(this.gn.v5(iMr2));
            } else {
                arrayList.add(qpVarJ82);
            }
        }
        for (int i2 = 0; i2 < bVar.FH(); i2++) {
            SI(arrayList, bVar.DW(), iJ0, false);
        }
        int iJ8 = J8(this.u7, iJ0);
        while (!SI(arrayList, iJ8, iJ0, false)) {
            iJ8 = J8(iJ8 + 1, iJ0);
        }
    }

    private boolean EQ(qp qpVar, int i) {
        return (P8(i, qpVar.J0()) || this.gn.u7(qpVar, i)) ? false : true;
    }

    private int J0(tr trVar, int i, int[] iArr, BitSet bitSet) {
        int i2 = this.u7;
        while (true) {
            int iJ8 = J8(i2, i);
            if (XL(iJ8, trVar, iArr, bitSet) >= 0) {
                return iJ8;
            }
            i2 = iJ8 + 1;
            bitSet.clear();
        }
    }

    private int J8(int i, int i2) {
        int iNextClearBit = this.tp.nextClearBit(i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.tp.get(iNextClearBit + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iNextClearBit;
            }
            iNextClearBit = this.tp.nextClearBit(iNextClearBit + i3);
        }
    }

    private void Mr() {
        Iterator<tr> it = this.Hw.iterator();
        while (it.hasNext()) {
            tr next = it.next();
            qp qpVarJ8 = next.J8();
            int iMr = qpVarJ8.Mr();
            BitSet bitSetMr = next.tp().Mr();
            if (bitSetMr.cardinality() == 1) {
                ArrayList<cs> arrayListQX = this.j6.J0().get(bitSetMr.nextSetBit(0)).QX();
                cs csVar = arrayListQX.get(arrayListQX.size() - 1);
                if (csVar.we().Hw() == 43) {
                    qp qpVarSG = csVar.Ws().sG(0);
                    int iMr2 = qpVarSG.Mr();
                    int iJ0 = qpVarSG.J0();
                    boolean zNw = this.VH.get(iMr);
                    boolean zNw2 = this.VH.get(iMr2);
                    if ((!zNw2) & zNw) {
                        zNw2 = nw(qpVarSG, this.gn.v5(iMr), iJ0);
                    }
                    if ((!zNw) & zNw2) {
                        zNw = nw(qpVarJ8, this.gn.v5(iMr2), iJ0);
                    }
                    if (!zNw || !zNw2) {
                        int iJ8 = J8(this.u7, iJ0);
                        ArrayList<qp> arrayList = new ArrayList<>(2);
                        arrayList.add(qpVarJ8);
                        arrayList.add(qpVarSG);
                        while (!SI(arrayList, iJ8, iJ0, false)) {
                            iJ8 = J8(iJ8 + 1, iJ0);
                        }
                    }
                    boolean z = csVar.J0().VH().size() != 0;
                    int iV5 = this.gn.v5(iMr);
                    if (iV5 != this.gn.v5(iMr2) && !z) {
                        ((tr) csVar).sh(0, DW(csVar, qpVarSG));
                        VH(csVar.Ws().sG(0), iV5);
                    }
                }
            }
        }
    }

    private boolean P8(int i, int i2) {
        int i3 = this.u7;
        return i < i3 && i + i2 > i3;
    }

    private int QX(int i, int i2) {
        int iNextClearBit = this.EQ.nextClearBit(i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !this.EQ.get(iNextClearBit + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return iNextClearBit;
            }
            iNextClearBit = this.EQ.nextClearBit(iNextClearBit + i3);
        }
    }

    private boolean SI(ArrayList<qp> arrayList, int i, int i2, boolean z) {
        Iterator<qp> it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            qp next = it.next();
            if (!this.VH.get(next.Mr())) {
                boolean zNw = nw(next, i, i2);
                z2 = !zNw || z2;
                if (zNw && z) {
                    gW(i, next.J0());
                }
            }
        }
        return !z2;
    }

    private void U2() {
        Iterator<tr> it = this.v5.iterator();
        while (it.hasNext()) {
            gn(it.next());
        }
    }

    private void VH(qp qpVar, int i) {
        int iMr = qpVar.Mr();
        if (this.VH.get(iMr) || !EQ(qpVar, i)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int iJ0 = qpVar.J0();
        this.gn.Hw(qpVar.Mr(), i, iJ0);
        this.VH.set(iMr);
        this.EQ.set(i, iJ0 + i);
    }

    private int Ws(tr trVar) {
        int iV5;
        BitSet bitSet;
        int iXL;
        rp rpVarWs = trVar.Ws();
        int size = rpVarWs.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = rpVarWs.sG(i2).J0();
            i += iArr[i2];
        }
        int i3 = Integer.MIN_VALUE;
        BitSet bitSet2 = null;
        int i4 = 0;
        int iJ0 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            int iMr = rpVarWs.sG(i5).Mr();
            if (i5 != 0) {
                i4 -= iArr[i5 - 1];
            }
            if (this.VH.get(iMr) && (iV5 = this.gn.v5(iMr) + i4) >= 0 && !P8(iV5, i) && (iXL = XL(iV5, trVar, iArr, (bitSet = new BitSet(size)))) >= 0) {
                int iCardinality = iXL - bitSet.cardinality();
                if (iCardinality > i3) {
                    i3 = iCardinality;
                    iJ0 = iV5;
                    bitSet2 = bitSet;
                }
                if (iXL == i) {
                    break;
                }
            }
        }
        if (iJ0 == -1) {
            bitSet2 = new BitSet(size);
            iJ0 = J0(trVar, i, iArr, bitSet2);
        }
        for (int iNextSetBit = bitSet2.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1)) {
            trVar.sh(iNextSetBit, DW(trVar, rpVarWs.sG(iNextSetBit)));
        }
        return iJ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int XL(int r11, abcd.tr r12, int[] r13, java.util.BitSet r14) {
        /*
            r10 = this;
            abcd.rp r0 = r12.Ws()
            int r1 = r0.size()
            abcd.as r12 = r12.tp()
            abcd.bt r12 = r12.XL()
            abcd.rp r12 = r10.ei(r12)
            java.util.BitSet r2 = new java.util.BitSet
            abcd.ds r3 = r10.j6
            int r3 = r3.a8()
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L21:
            r5 = -1
            if (r3 >= r1) goto L7d
            abcd.qp r6 = r0.sG(r3)
            int r7 = r6.Mr()
            r8 = r13[r3]
            if (r3 == 0) goto L35
            int r9 = r3 + (-1)
            r9 = r13[r9]
            int r11 = r11 + r9
        L35:
            java.util.BitSet r9 = r10.VH
            boolean r9 = r9.get(r7)
            if (r9 == 0) goto L47
            abcd.or r9 = r10.gn
            int r9 = r9.v5(r7)
            if (r9 != r11) goto L47
        L45:
            int r4 = r4 + r8
            goto L77
        L47:
            boolean r9 = r10.vy(r11, r8)
            if (r9 == 0) goto L4f
        L4d:
            r4 = -1
            goto L7d
        L4f:
            java.util.BitSet r9 = r10.VH
            boolean r9 = r9.get(r7)
            if (r9 != 0) goto L64
            boolean r6 = r10.EQ(r6, r11)
            if (r6 == 0) goto L64
            boolean r6 = r2.get(r7)
            if (r6 != 0) goto L64
            goto L45
        L64:
            abcd.or r6 = r10.gn
            boolean r6 = r6.VH(r12, r11, r8)
            if (r6 != 0) goto L4d
            abcd.or r6 = r10.gn
            boolean r6 = r6.VH(r0, r11, r8)
            if (r6 != 0) goto L4d
            r14.set(r3)
        L77:
            r2.set(r7)
            int r3 = r3 + 1
            goto L21
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.fs.XL(int, abcd.tr, int[], java.util.BitSet):int");
    }

    private void a8() {
        for (ArrayList<qp> arrayList : this.FH.values()) {
            int i = this.u7;
            boolean zSI = false;
            do {
                int size = arrayList.size();
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    qp qpVar = arrayList.get(i3);
                    int iJ0 = qpVar.J0();
                    if (!this.VH.get(qpVar.Mr()) && iJ0 > i2) {
                        i2 = iJ0;
                    }
                }
                int iQX = QX(i, i2);
                if (we(arrayList, iQX)) {
                    zSI = SI(arrayList, iQX, i2, true);
                }
                i = iQX + 1;
            } while (!zSI);
        }
    }

    private kp aM(int i) {
        for (Map.Entry<kp, ArrayList<qp>> entry : this.FH.entrySet()) {
            Iterator<qp> it = entry.getValue().iterator();
            while (it.hasNext()) {
                if (it.next().Mr() == i) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    private void er() {
        Iterator<vr> it = this.Zo.iterator();
        while (it.hasNext()) {
            BT(it.next());
        }
    }

    private void gW(int i, int i2) {
        this.tp.set(i, i2 + i, true);
    }

    private void gn(tr trVar) {
        int iWs = Ws(trVar);
        rp rpVarWs = trVar.Ws();
        int size = rpVarWs.size();
        int i = 0;
        while (i < size) {
            qp qpVarSG = rpVarWs.sG(i);
            int iMr = qpVarSG.Mr();
            int iJ0 = qpVarSG.J0();
            int i2 = iWs + iJ0;
            if (!this.VH.get(iMr)) {
                kp kpVarAM = aM(iMr);
                VH(qpVarSG, iWs);
                if (kpVarAM != null) {
                    gW(iWs, iJ0);
                    ArrayList<qp> arrayList = this.FH.get(kpVarAM);
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        qp qpVar = arrayList.get(i3);
                        if (-1 == rpVarWs.Sf(qpVar.Mr())) {
                            nw(qpVar, iWs, iJ0);
                        }
                    }
                }
            }
            i++;
            iWs = i2;
        }
    }

    private int j3(int i) {
        tp tpVarWe;
        cs csVarWs = this.j6.Ws(i);
        if (csVarWs == null || (tpVarWe = csVarWs.we()) == null || tpVarWe.Hw() != 3) {
            return -1;
        }
        return ((nq) ((ep) csVarWs.J0()).a8()).a8();
    }

    private void lg() {
        for (ArrayList<qp> arrayList : this.FH.values()) {
            int size = arrayList.size();
            int i = -1;
            int iJ0 = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                qp qpVar = arrayList.get(i2);
                int iJ3 = j3(qpVar.Mr());
                if (iJ3 >= 0) {
                    iJ0 = qpVar.J0();
                    VH(qpVar, iJ3);
                    i = iJ3;
                    break;
                }
                i2++;
                i = iJ3;
            }
            if (i >= 0) {
                SI(arrayList, i, iJ0, true);
            }
        }
    }

    private boolean nw(qp qpVar, int i, int i2) {
        if (qpVar.J0() > i2 || this.VH.get(qpVar.Mr()) || !EQ(qpVar, i)) {
            return false;
        }
        VH(qpVar, i);
        return true;
    }

    private void rN() {
        qp qpVarJ6;
        int iA8 = this.j6.a8();
        for (int i = 0; i < iA8; i++) {
            if (!this.VH.get(i) && (qpVarJ6 = j6(i)) != null) {
                int iJ0 = qpVarJ6.J0();
                int iJ8 = J8(this.u7, iJ0);
                while (!EQ(qpVarJ6, iJ8)) {
                    iJ8 = J8(iJ8 + 1, iJ0);
                }
                VH(qpVarJ6, iJ8);
            }
        }
    }

    private void tp() {
        this.j6.we(new a());
    }

    private boolean vy(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.tp.get(i3)) {
                return true;
            }
        }
        return false;
    }

    private boolean we(ArrayList<qp> arrayList, int i) {
        Iterator<qp> it = arrayList.iterator();
        while (it.hasNext()) {
            qp next = it.next();
            if (!this.VH.get(next.Mr()) && !EQ(next, i)) {
                return false;
            }
        }
        return true;
    }

    private void yS() {
        int iA8 = this.j6.a8();
        for (int i = 0; i < iA8; i++) {
            if (!this.VH.get(i)) {
                int iJ3 = j3(i);
                qp qpVarJ6 = j6(i);
                if (iJ3 >= 0) {
                    VH(qpVarJ6, iJ3);
                }
            }
        }
    }

    public boolean KD() {
        return true;
    }

    public rp ei(bt btVar) {
        rp rpVar = new rp(btVar.DW());
        zs it = btVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            rpVar.Mz(i, j6(it.next()));
            i++;
        }
        return rpVar;
    }

    public xr u7() {
        tp();
        lg();
        yS();
        U2();
        a8();
        Mr();
        er();
        rN();
        return this.gn;
    }
}
