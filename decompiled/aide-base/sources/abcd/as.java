package abcd;

import abcd.cs;
import abcd.vr;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class as {
    private BitSet DW;
    private BitSet FH;
    private bt J0;
    private bt J8;
    private ds VH;
    private int Zo;
    private int gn;
    private int v5 = -1;
    private int tp = 0;
    private int EQ = 0;
    private int we = -1;
    private ArrayList<cs> j6 = new ArrayList<>();
    private at Hw = new at();
    private final ArrayList<as> u7 = new ArrayList<>();

    public interface a {
        void j6(as asVar, as asVar2);
    }

    public as(int i, int i2, ds dsVar) {
        this.VH = dsVar;
        this.gn = i;
        this.Zo = i2;
        this.DW = new BitSet(dsVar.J0().size());
        this.FH = new BitSet(dsVar.J0().size());
    }

    private int J0() {
        int size = this.j6.size();
        int i = 0;
        while (i < size && (this.j6.get(i) instanceof vr)) {
            i++;
        }
        return i;
    }

    public static as SI(up upVar, int i, ds dsVar) {
        dp dpVarDW = upVar.DW();
        cp cpVarCa = dpVarDW.ca(i);
        as asVar = new as(i, cpVarCa.j6(), dsVar);
        jp jpVarHw = cpVarCa.Hw();
        asVar.j6.ensureCapacity(jpVarHw.size());
        int size = jpVarHw.size();
        for (int i2 = 0; i2 < size; i2++) {
            asVar.j6.add(new tr(jpVarHw.Sf(i2), asVar));
        }
        asVar.DW = ds.FH(dpVarDW, upVar.Hw(cpVarCa.j6()));
        asVar.FH = ds.FH(dpVarDW, cpVarCa.gn());
        at atVarEr = ds.er(dpVarDW, cpVarCa.gn());
        asVar.Hw = atVarEr;
        if (atVarEr.size() != 0) {
            int iZo = cpVarCa.Zo();
            asVar.v5 = iZo < 0 ? -1 : dpVarDW.Sf(iZo);
        }
        return asVar;
    }

    private void dx(List<cs> list) {
        BitSet bitSet = new BitSet(this.VH.a8());
        BitSet bitSet2 = new BitSet(this.VH.a8());
        int size = list.size();
        int i = 0;
        while (i < size) {
            for (int i2 = i; i2 < size; i2++) {
                ef(bitSet, list.get(i2).Ws().sG(0));
                ef(bitSet2, list.get(i2).J8());
            }
            int i3 = i;
            int i4 = i3;
            while (i3 < size) {
                if (!u7(bitSet, list.get(i3).J8())) {
                    Collections.swap(list, i3, i4);
                    i4++;
                }
                i3++;
            }
            if (i == i4) {
                cs csVar = null;
                int i5 = i4;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    cs csVar2 = list.get(i5);
                    if (u7(bitSet, csVar2.J8()) && u7(bitSet2, csVar2.Ws().sG(0))) {
                        Collections.swap(list, i4, i5);
                        csVar = csVar2;
                        break;
                    }
                    i5++;
                }
                qp qpVarJ8 = csVar.J8();
                qp qpVarG3 = qpVarJ8.g3(this.VH.v5(qpVarJ8.J0()));
                tr trVar = new tr(new op(vp.er(qpVarJ8.j6()), wp.Hw, qpVarG3, csVar.Ws()), this);
                i = i4 + 1;
                list.add(i4, trVar);
                list.set(i, new tr(new op(vp.er(qpVarJ8.j6()), wp.Hw, qpVarJ8, rp.vJ(qpVarG3)), this));
                size = list.size();
            } else {
                i = i4;
            }
            bitSet.clear();
            bitSet2.clear();
        }
    }

    private static void ef(BitSet bitSet, qp qpVar) {
        bitSet.set(qpVar.Mr());
        if (qpVar.J0() > 1) {
            bitSet.set(qpVar.Mr() + 1);
        }
    }

    private static boolean u7(BitSet bitSet, qp qpVar) {
        int iMr = qpVar.Mr();
        int iJ0 = qpVar.J0();
        if (bitSet.get(iMr)) {
            return true;
        }
        return iJ0 == 2 && bitSet.get(iMr + 1);
    }

    public BitSet BT() {
        return this.FH;
    }

    public void DW(ip ipVar) {
        cs csVarBT = cs.BT(ipVar, this);
        this.j6.add(J0(), csVarBT);
        this.VH.nw(csVarBT);
    }

    public void EQ(cs.a aVar) {
        int size = this.j6.size();
        for (int i = 0; i < size; i++) {
            this.j6.get(i).FH(aVar);
        }
    }

    public void FH(int i) {
        if (this.J0 == null) {
            this.J0 = zr.FH(this.VH.a8());
        }
        this.J0.add(i);
    }

    public void Hw(int i) {
        if (this.J8 == null) {
            this.J8 = zr.FH(this.VH.a8());
        }
        this.J8.add(i);
    }

    public ArrayList<as> J8() {
        return this.u7;
    }

    public void KD() {
        this.j6.subList(0, J0()).clear();
    }

    public BitSet Mr() {
        return this.DW;
    }

    public as P8(as asVar) {
        as asVarBT = this.VH.BT();
        if (!this.FH.get(asVar.gn)) {
            throw new RuntimeException("Block " + asVar.er() + " not successor of " + er());
        }
        asVarBT.DW.set(this.gn);
        asVarBT.FH.set(asVar.gn);
        asVarBT.Hw.BT(asVar.gn);
        asVarBT.v5 = asVar.gn;
        for (int size = this.Hw.size() - 1; size >= 0; size--) {
            if (this.Hw.ro(size) == asVar.gn) {
                this.Hw.g3(size, asVarBT.gn);
            }
        }
        if (this.v5 == asVar.gn) {
            this.v5 = asVarBT.gn;
        }
        this.FH.clear(asVar.gn);
        this.FH.set(asVarBT.gn);
        asVar.DW.set(asVarBT.gn);
        asVar.DW.set(this.gn, this.FH.get(asVar.gn));
        return asVarBT;
    }

    public ArrayList<cs> QX() {
        return this.j6;
    }

    public as U2() {
        if (this.v5 < 0) {
            return null;
        }
        return this.VH.J0().get(this.v5);
    }

    public void VH(int i) {
        this.j6.add(0, new vr(i, this));
    }

    public int Ws() {
        return this.gn;
    }

    public bt XL() {
        if (this.J8 == null) {
            this.J8 = zr.FH(this.VH.a8());
        }
        return this.J8;
    }

    public void Zo(qp qpVar, qp qpVar2) {
        if (qpVar.Mr() == qpVar2.Mr()) {
            return;
        }
        tr trVar = (tr) this.j6.get(r0.size() - 1);
        if (trVar.J8() != null || trVar.Ws().size() > 0) {
            int iNextSetBit = this.FH.nextSetBit(0);
            while (iNextSetBit >= 0) {
                this.VH.J0().get(iNextSetBit).v5(qpVar, qpVar2);
                iNextSetBit = this.FH.nextSetBit(iNextSetBit + 1);
            }
            return;
        }
        tr trVar2 = new tr(new op(vp.er(qpVar.j6()), wp.Hw, qpVar, rp.vJ(qpVar2)), this);
        this.j6.add(r5.size() - 1, trVar2);
        this.tp++;
    }

    public int a8() {
        return this.v5;
    }

    public ds aM() {
        return this.VH;
    }

    public void cb() {
        int i = this.EQ;
        if (i > 1) {
            dx(this.j6.subList(0, i));
            if (this.j6.get(this.EQ).lg()) {
                throw new RuntimeException("Unexpected: moves from phis before move-exception");
            }
        }
        if (this.tp > 1) {
            ArrayList<cs> arrayList = this.j6;
            dx(arrayList.subList((arrayList.size() - this.tp) - 1, this.j6.size() - 1));
        }
        this.VH.cb();
    }

    public void cn(ip ipVar) {
        if (ipVar.EQ().DW() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        ArrayList<cs> arrayList = this.j6;
        cs csVar = arrayList.get(arrayList.size() - 1);
        cs csVarBT = cs.BT(ipVar, this);
        ArrayList<cs> arrayList2 = this.j6;
        arrayList2.set(arrayList2.size() - 1, csVarBT);
        this.VH.SI(csVar);
        this.VH.nw(csVarBT);
    }

    public boolean ei() {
        return this.gn == this.VH.j3();
    }

    public String er() {
        return xs.VH(this.Zo);
    }

    public at gW() {
        return this.Hw;
    }

    public void gn(qp qpVar) {
        this.j6.add(0, new vr(qpVar, this));
    }

    public List<cs> j3() {
        return this.j6.subList(0, J0());
    }

    public void j6(as asVar) {
        this.u7.add(asVar);
    }

    public int lg() {
        return this.VH.Hw(this.v5);
    }

    public boolean nw() {
        if (this.we == -1) {
            this.VH.VH();
        }
        return this.we == 1;
    }

    public int rN() {
        return this.Zo;
    }

    public void ro(int i) {
        int i2 = 0;
        for (int size = this.Hw.size() - 1; size >= 0; size--) {
            if (this.Hw.ro(size) == i) {
                i2 = size;
            } else {
                this.v5 = this.Hw.ro(size);
            }
        }
        this.Hw.vJ(i2);
        this.FH.clear(i);
        this.VH.J0().get(i).DW.clear(this.gn);
    }

    public void sG(int i) {
        this.we = i;
    }

    public void sh(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.FH.set(i2);
        if (this.v5 == i) {
            this.v5 = i2;
        }
        for (int size = this.Hw.size() - 1; size >= 0; size--) {
            if (this.Hw.ro(size) == i) {
                this.Hw.g3(size, i2);
            }
        }
        this.FH.clear(i);
        this.VH.J0().get(i2).DW.set(this.gn);
        this.VH.J0().get(i).DW.clear(this.gn);
    }

    public String toString() {
        return "{" + this.gn + ":" + xs.VH(this.Zo) + '}';
    }

    public void tp(as asVar) {
        if (this != asVar && this.Hw.size() == 0) {
            this.FH.set(asVar.gn);
            this.Hw.BT(asVar.gn);
            this.v5 = asVar.gn;
            asVar.DW.set(this.gn);
        }
    }

    public void v5(qp qpVar, qp qpVar2) {
        if (qpVar.Mr() == qpVar2.Mr()) {
            return;
        }
        this.j6.add(J0(), new tr(new op(vp.er(qpVar.j6()), wp.Hw, qpVar, rp.vJ(qpVar2)), this));
        this.EQ++;
    }

    public as vy() {
        as asVarBT = this.VH.BT();
        asVarBT.DW = this.DW;
        asVarBT.FH.set(this.gn);
        asVarBT.Hw.BT(this.gn);
        asVarBT.v5 = this.gn;
        BitSet bitSet = new BitSet(this.VH.J0().size());
        this.DW = bitSet;
        bitSet.set(asVarBT.gn);
        for (int iNextSetBit = asVarBT.DW.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = asVarBT.DW.nextSetBit(iNextSetBit + 1)) {
            this.VH.J0().get(iNextSetBit).sh(this.gn, asVarBT.gn);
        }
        return asVarBT;
    }

    public void we(vr.b bVar) {
        int size = this.j6.size();
        for (int i = 0; i < size; i++) {
            cs csVar = this.j6.get(i);
            if (!(csVar instanceof vr)) {
                return;
            }
            bVar.j6((vr) csVar);
        }
    }

    public at yS() {
        at atVar = new at(this.Hw.size());
        int size = this.Hw.size();
        for (int i = 0; i < size; i++) {
            atVar.BT(this.VH.Hw(this.Hw.ro(i)));
        }
        return atVar;
    }
}
