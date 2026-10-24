package abcd;

import abcd.as;
import abcd.lr;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class mr {
    private final ds DW;
    private final ArrayList<as> FH;
    private final b[] Hw;
    private final lr.a[] Zo;
    private final boolean j6;
    private final ArrayList<as> v5;

    private static final class b {
        public as DW;
        public as FH;
        public as Hw;
        public int j6;
        public ArrayList<as> v5 = new ArrayList<>();
    }

    private class c implements as.a {
        private int j6;

        private c() {
            this.j6 = 0;
        }

        @Override // abcd.as.a
        public void j6(as asVar, as asVar2) {
            b bVar = new b();
            int i = this.j6 + 1;
            this.j6 = i;
            bVar.j6 = i;
            bVar.FH = asVar;
            bVar.DW = asVar2;
            mr.this.v5.add(asVar);
            mr.this.Hw[asVar.Ws()] = bVar;
        }
    }

    private mr(ds dsVar, lr.a[] aVarArr, boolean z) {
        this.DW = dsVar;
        this.Zo = aVarArr;
        this.j6 = z;
        ArrayList<as> arrayListJ0 = dsVar.J0();
        this.FH = arrayListJ0;
        this.Hw = new b[arrayListJ0.size() + 2];
        this.v5 = new ArrayList<>();
    }

    private void FH(as asVar) {
        if (this.Hw[this.Hw[asVar.Ws()].Hw.Ws()].Hw != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            arrayList.add(asVar);
            while (!arrayList.isEmpty()) {
                int size = arrayList.size() - 1;
                b bVar = this.Hw[((as) arrayList.get(size)).Ws()];
                as asVar2 = bVar.Hw;
                b bVar2 = this.Hw[asVar2.Ws()];
                if (!hashSet.add(asVar2) || bVar2.Hw == null) {
                    arrayList.remove(size);
                    if (bVar2.Hw != null) {
                        as asVar3 = bVar2.FH;
                        if (this.Hw[asVar3.Ws()].j6 < this.Hw[bVar.FH.Ws()].j6) {
                            bVar.FH = asVar3;
                        }
                        bVar.Hw = bVar2.Hw;
                    }
                } else {
                    arrayList.add(asVar2);
                }
            }
        }
    }

    private as Hw(as asVar) {
        b bVar = this.Hw[asVar.Ws()];
        if (bVar.Hw == null) {
            return asVar;
        }
        FH(asVar);
        return bVar.FH;
    }

    private void VH() {
        int i;
        int i2;
        as asVarAM = this.j6 ? this.DW.aM() : this.DW.QX();
        if (asVarAM != null) {
            this.v5.add(asVarAM);
            this.Zo[asVarAM.Ws()].DW = asVarAM.Ws();
        }
        this.DW.tp(this.j6, new c());
        int size = this.v5.size() - 1;
        int i3 = size;
        while (true) {
            if (i3 < 2) {
                break;
            }
            as asVar = this.v5.get(i3);
            b bVar = this.Hw[asVar.Ws()];
            BitSet bitSetV5 = v5(asVar);
            for (int iNextSetBit = bitSetV5.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetV5.nextSetBit(iNextSetBit + 1)) {
                as asVar2 = this.FH.get(iNextSetBit);
                if (this.Hw[asVar2.Ws()] != null && (i2 = this.Hw[Hw(asVar2).Ws()].j6) < bVar.j6) {
                    bVar.j6 = i2;
                }
            }
            this.Hw[this.v5.get(bVar.j6).Ws()].v5.add(asVar);
            as asVar3 = bVar.DW;
            bVar.Hw = asVar3;
            ArrayList<as> arrayList = this.Hw[asVar3.Ws()].v5;
            while (!arrayList.isEmpty()) {
                as asVarRemove = arrayList.remove(arrayList.size() - 1);
                as asVarHw = Hw(asVarRemove);
                if (this.Hw[asVarHw.Ws()].j6 < this.Hw[asVarRemove.Ws()].j6) {
                    this.Zo[asVarRemove.Ws()].DW = asVarHw.Ws();
                } else {
                    this.Zo[asVarRemove.Ws()].DW = bVar.DW.Ws();
                }
            }
            i3--;
        }
        for (i = 2; i <= size; i++) {
            as asVar4 = this.v5.get(i);
            if (this.Zo[asVar4.Ws()].DW != this.v5.get(this.Hw[asVar4.Ws()].j6).Ws()) {
                lr.a aVar = this.Zo[asVar4.Ws()];
                lr.a[] aVarArr = this.Zo;
                aVar.DW = aVarArr[aVarArr[asVar4.Ws()].DW].DW;
            }
        }
    }

    public static mr Zo(ds dsVar, lr.a[] aVarArr, boolean z) {
        mr mrVar = new mr(dsVar, aVarArr, z);
        mrVar.VH();
        return mrVar;
    }

    private BitSet v5(as asVar) {
        return this.j6 ? asVar.BT() : asVar.Mr();
    }
}
