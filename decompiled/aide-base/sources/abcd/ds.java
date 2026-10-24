package abcd;

import abcd.as;
import abcd.cs;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes.dex */
public final class ds {
    private int DW;
    private List<cs>[] EQ;
    private int FH;
    private int Hw;
    private int VH;
    private int Zo;
    private final int gn;
    private ArrayList<as> j6;
    private ArrayList<cs>[] tp;
    private cs[] u7;
    private int v5;
    private boolean we = false;

    class a implements cs.a {
        public a() {
        }

        @Override // abcd.cs.a
        public void DW(tr trVar) {
            ds.this.u7[trVar.J8().Mr()] = trVar;
        }

        @Override // abcd.cs.a
        public void FH(tr trVar) {
            if (trVar.J8() != null) {
                ds.this.u7[trVar.J8().Mr()] = trVar;
            }
        }

        @Override // abcd.cs.a
        public void j6(vr vrVar) {
            ds.this.u7[vrVar.J8().Mr()] = vrVar;
        }
    }

    class b implements cs.a {
        public b() {
        }

        private void Hw(cs csVar) {
            rp rpVarWs = csVar.Ws();
            int size = rpVarWs.size();
            for (int i = 0; i < size; i++) {
                ds.this.tp[rpVarWs.sG(i).Mr()].add(csVar);
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

    private ds(up upVar, int i, boolean z) {
        this.gn = i;
        this.VH = upVar.DW().ef();
        int iAj = upVar.DW().aj();
        this.Hw = iAj;
        this.v5 = iAj;
    }

    public static BitSet FH(dp dpVar, at atVar) {
        BitSet bitSet = new BitSet(dpVar.size());
        int size = atVar.size();
        for (int i = 0; i < size; i++) {
            bitSet.set(dpVar.Sf(atVar.ro(i)));
        }
        return bitSet;
    }

    private static cs Mr(as asVar) {
        return new tr(new op(vp.j3, wp.Hw, (qp) null, rp.jw), asVar);
    }

    private void Zo() {
        if (this.we) {
            throw new RuntimeException("No use list in back mode");
        }
        this.tp = new ArrayList[this.Hw];
        for (int i = 0; i < this.Hw; i++) {
            this.tp[i] = new ArrayList<>();
        }
        we(new b());
        this.EQ = new List[this.Hw];
        for (int i2 = 0; i2 < this.Hw; i2++) {
            this.EQ[i2] = Collections.unmodifiableList(this.tp[i2]);
        }
    }

    public static ds ei(up upVar, int i, boolean z) {
        ds dsVar = new ds(upVar, i, z);
        dsVar.gn(upVar);
        return dsVar;
    }

    public static at er(dp dpVar, at atVar) {
        at atVar2 = new at(atVar.size());
        int size = atVar.size();
        for (int i = 0; i < size; i++) {
            atVar2.BT(dpVar.Sf(atVar.ro(i)));
        }
        return atVar2;
    }

    private void gn(up upVar) {
        int size = upVar.DW().size();
        this.j6 = new ArrayList<>(size + 2);
        for (int i = 0; i < size; i++) {
            this.j6.add(as.SI(upVar, i, this));
        }
        this.DW = this.j6.get(upVar.DW().Sf(upVar.FH())).vy().Ws();
        this.FH = -1;
    }

    private void sh(cs csVar, rp rpVar) {
        if (rpVar == null) {
            return;
        }
        int size = rpVar.size();
        for (int i = 0; i < size; i++) {
            if (!this.tp[rpVar.sG(i).Mr()].remove(csVar)) {
                throw new RuntimeException("use not found");
            }
        }
    }

    public as BT() {
        int size = this.j6.size();
        int i = this.VH;
        this.VH = i + 1;
        as asVar = new as(size, i, this);
        asVar.QX().add(Mr(asVar));
        this.j6.add(asVar);
        return asVar;
    }

    public void EQ(as.a aVar) {
        BitSet bitSet = new BitSet(J0().size());
        Stack stack = new Stack();
        stack.add(QX());
        while (stack.size() > 0) {
            as asVar = (as) stack.pop();
            ArrayList<as> arrayListJ8 = asVar.J8();
            if (!bitSet.get(asVar.Ws())) {
                for (int size = arrayListJ8.size() - 1; size >= 0; size--) {
                    stack.add(arrayListJ8.get(size));
                }
                bitSet.set(asVar.Ws());
                aVar.j6(asVar, null);
            }
        }
    }

    public int Hw(int i) {
        if (i < 0) {
            return -1;
        }
        return this.j6.get(i).rN();
    }

    public ArrayList<as> J0() {
        return this.j6;
    }

    public int J8() {
        Iterator<as> it = this.j6.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().nw()) {
                i++;
            }
        }
        return i;
    }

    public void KD() {
        this.u7 = null;
        this.tp = null;
        this.EQ = null;
    }

    public void P8(xr xrVar) {
        Iterator<as> it = J0().iterator();
        while (it.hasNext()) {
            Iterator<cs> it2 = it.next().QX().iterator();
            while (it2.hasNext()) {
                it2.next().P8(xrVar);
            }
        }
        int iJ6 = xrVar.j6();
        this.Hw = iJ6;
        this.v5 = iJ6;
    }

    public as QX() {
        return this.j6.get(this.DW);
    }

    public void SI(cs csVar) {
        if (this.tp != null) {
            sh(csVar, csVar.Ws());
        }
        qp qpVarJ8 = csVar.J8();
        cs[] csVarArr = this.u7;
        if (csVarArr == null || qpVarJ8 == null) {
            return;
        }
        csVarArr[qpVarJ8.Mr()] = null;
    }

    public int U2() {
        return this.gn;
    }

    public void VH() {
        Iterator<as> it = this.j6.iterator();
        while (it.hasNext()) {
            it.next().sG(0);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(QX());
        while (!arrayList.isEmpty()) {
            as asVar = (as) arrayList.remove(0);
            if (!asVar.nw()) {
                asVar.sG(1);
                BitSet bitSetBT = asVar.BT();
                for (int iNextSetBit = bitSetBT.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetBT.nextSetBit(iNextSetBit + 1)) {
                    arrayList.add(this.j6.get(iNextSetBit));
                }
            }
        }
    }

    public cs Ws(int i) {
        if (this.we) {
            throw new RuntimeException("No def list in back mode");
        }
        cs[] csVarArr = this.u7;
        if (csVarArr != null) {
            return csVarArr[i];
        }
        this.u7 = new cs[a8()];
        we(new a());
        return this.u7[i];
    }

    public int XL() {
        return this.DW;
    }

    public int a8() {
        return this.Hw;
    }

    public as aM() {
        int i = this.FH;
        if (i < 0) {
            return null;
        }
        return this.j6.get(i);
    }

    public void cb() {
        this.Zo = 0;
    }

    public void cn(cs csVar, rp rpVar) {
        if (this.tp == null) {
            return;
        }
        if (rpVar != null) {
            sh(csVar, rpVar);
        }
        rp rpVarWs = csVar.Ws();
        int size = rpVarWs.size();
        for (int i = 0; i < size; i++) {
            this.tp[rpVarWs.sG(i).Mr()].add(csVar);
        }
    }

    public void dx() {
        this.we = true;
        this.tp = null;
        this.u7 = null;
    }

    public void ef(cs csVar, qp qpVar) {
        if (this.u7 == null) {
            return;
        }
        if (qpVar != null) {
            this.u7[qpVar.Mr()] = null;
        }
        qp qpVarJ8 = csVar.J8();
        if (qpVarJ8 != null) {
            int iMr = qpVarJ8.Mr();
            cs[] csVarArr = this.u7;
            if (csVarArr[iMr] != null) {
                throw new RuntimeException("Duplicate add of insn");
            }
            csVarArr[qpVarJ8.Mr()] = csVar;
        }
    }

    public void gW() {
        if (this.FH >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        this.FH = this.j6.size();
        int i = this.FH;
        int i2 = this.VH;
        this.VH = i2 + 1;
        as asVar = new as(i, i2, this);
        this.j6.add(asVar);
        Iterator<as> it = this.j6.iterator();
        while (it.hasNext()) {
            it.next().tp(asVar);
        }
        if (asVar.Mr().cardinality() == 0) {
            this.j6.remove(this.FH);
            this.FH = -1;
            this.VH--;
        }
    }

    public int j3() {
        return this.FH;
    }

    public ArrayList<cs>[] lg() {
        if (this.tp == null) {
            Zo();
        }
        ArrayList<cs>[] arrayListArr = new ArrayList[this.Hw];
        for (int i = 0; i < this.Hw; i++) {
            arrayListArr[i] = new ArrayList<>(this.tp[i]);
        }
        return arrayListArr;
    }

    public void nw(cs csVar) {
        cn(csVar, null);
        ef(csVar, null);
    }

    public List<cs> rN(int i) {
        if (this.EQ == null) {
            Zo();
        }
        return this.EQ[i];
    }

    public void ro(cs csVar, qp qpVar, qp qpVar2) {
        if (this.tp == null) {
            return;
        }
        if (qpVar != null) {
            this.tp[qpVar.Mr()].remove(csVar);
        }
        int iMr = qpVar2.Mr();
        ArrayList<cs>[] arrayListArr = this.tp;
        if (arrayListArr.length <= iMr) {
            this.tp = null;
        } else {
            arrayListArr[iMr].add(csVar);
        }
    }

    public void sG(int i) {
        this.Hw = i;
        this.v5 = i;
        KD();
    }

    public void tp(boolean z, as.a aVar) {
        BitSet bitSet = new BitSet(this.j6.size());
        Stack stack = new Stack();
        as asVarAM = z ? aM() : QX();
        if (asVarAM == null) {
            return;
        }
        stack.add(null);
        stack.add(asVarAM);
        while (stack.size() > 0) {
            as asVar = (as) stack.pop();
            as asVar2 = (as) stack.pop();
            if (!bitSet.get(asVar.Ws())) {
                BitSet bitSetMr = z ? asVar.Mr() : asVar.BT();
                for (int iNextSetBit = bitSetMr.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetMr.nextSetBit(iNextSetBit + 1)) {
                    stack.add(asVar);
                    stack.add(this.j6.get(iNextSetBit));
                }
                bitSet.set(asVar.Ws());
                aVar.j6(asVar, asVar2);
            }
        }
    }

    public void u7(Set<cs> set) {
        Iterator<as> it = J0().iterator();
        while (it.hasNext()) {
            as next = it.next();
            ArrayList<cs> arrayListQX = next.QX();
            for (int size = arrayListQX.size() - 1; size >= 0; size--) {
                cs csVar = arrayListQX.get(size);
                if (set.contains(csVar)) {
                    SI(csVar);
                    arrayListQX.remove(size);
                }
            }
            int size2 = arrayListQX.size();
            cs csVar2 = size2 == 0 ? null : arrayListQX.get(size2 - 1);
            if (next != aM() && (size2 == 0 || csVar2.J0() == null || csVar2.J0().EQ().DW() == 1)) {
                arrayListQX.add(cs.BT(new op(vp.j3, wp.Hw, (qp) null, rp.jw), next));
                BitSet bitSetBT = next.BT();
                for (int iNextSetBit = bitSetBT.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetBT.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != next.a8()) {
                        next.ro(iNextSetBit);
                    }
                }
            }
        }
    }

    public int v5(int i) {
        int i2 = this.v5;
        int i3 = this.Zo;
        int i4 = i2 + i3;
        this.Zo = i3 + i;
        this.Hw = Math.max(this.Hw, i + i4);
        return i4;
    }

    public int vy() {
        int i = this.Hw;
        int i2 = i + 1;
        this.Hw = i2;
        this.v5 = i2;
        KD();
        return i;
    }

    public void we(cs.a aVar) {
        Iterator<as> it = this.j6.iterator();
        while (it.hasNext()) {
            it.next().EQ(aVar);
        }
    }

    public boolean yS(qp qpVar) {
        cs csVarWs = Ws(qpVar.Mr());
        if (csVarWs == null) {
            return false;
        }
        if (csVarWs.EQ() != null) {
            return true;
        }
        Iterator<cs> it = rN(qpVar.Mr()).iterator();
        while (it.hasNext()) {
            ip ipVarJ0 = it.next().J0();
            if (ipVarJ0 != null && ipVarJ0.EQ().Hw() == 54) {
                return true;
            }
        }
        return false;
    }
}
