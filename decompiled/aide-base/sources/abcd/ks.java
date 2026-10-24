package abcd;

import abcd.as;
import abcd.vr;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ks {
    private final boolean DW;
    private final hs FH;
    private final ds j6;

    class a implements as.a {
        final /* synthetic */ ArrayList j6;

        public a(ks ksVar, ArrayList arrayList) {
            this.j6 = arrayList;
        }

        @Override // abcd.as.a
        public void j6(as asVar, as asVar2) {
            ArrayList<cs> arrayListQX = asVar.QX();
            if (arrayListQX.size() == 1 && arrayListQX.get(0).we() == vp.j3) {
                BitSet bitSet = (BitSet) asVar.Mr().clone();
                for (int iNextSetBit = bitSet.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1)) {
                    ((as) this.j6.get(iNextSetBit)).sh(asVar.Ws(), asVar.a8());
                }
            }
        }
    }

    private static class b implements vr.b {
        private final ArrayList<as> j6;

        public b(ArrayList<as> arrayList) {
            this.j6 = arrayList;
        }

        @Override // abcd.vr.b
        public void j6(vr vrVar) {
            rp rpVarWs = vrVar.Ws();
            qp qpVarJ8 = vrVar.J8();
            int size = rpVarWs.size();
            for (int i = 0; i < size; i++) {
                this.j6.get(vrVar.ef(i)).Zo(qpVarJ8, rpVarWs.sG(i));
            }
        }
    }

    private ks(ds dsVar, boolean z) {
        this.DW = z;
        this.j6 = dsVar;
        this.FH = is.DW(dsVar);
    }

    private cp DW(as asVar) {
        at atVarYS = asVar.yS();
        int iLg = asVar.lg();
        as asVarAM = this.j6.aM();
        if (atVarYS.KD(asVarAM == null ? -1 : asVarAM.rN())) {
            if (atVarYS.size() > 1) {
                throw new RuntimeException("Exit predecessor must have no other successors" + xs.VH(asVar.rN()));
            }
            atVarYS = at.qp;
            u7(asVar);
            iLg = -1;
        }
        atVarYS.Mr();
        return new cp(asVar.rN(), Hw(asVar.QX()), atVarYS, iLg);
    }

    private dp FH() {
        ArrayList<as> arrayListJ0 = this.j6.J0();
        as asVarAM = this.j6.aM();
        this.j6.VH();
        int i = 0;
        dp dpVar = new dp(this.j6.J8() - ((asVarAM == null || !asVarAM.nw()) ? 0 : 1));
        Iterator<as> it = arrayListJ0.iterator();
        while (it.hasNext()) {
            as next = it.next();
            if (next.nw() && next != asVarAM) {
                dpVar.br(i, DW(next));
                i++;
            }
        }
        if (asVarAM == null || asVarAM.QX().size() == 0) {
            return dpVar;
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }

    private jp Hw(ArrayList<cs> arrayList) {
        int size = arrayList.size();
        jp jpVar = new jp(size);
        for (int i = 0; i < size; i++) {
            jpVar.g3(i, arrayList.get(i).cn());
        }
        jpVar.Mr();
        return jpVar;
    }

    private void VH() {
        this.j6.tp(false, new a(this, this.j6.J0()));
    }

    private void Zo() {
        int iU2 = this.j6.U2();
        ir irVar = new ir(this.j6.a8());
        int iA8 = this.j6.a8();
        for (int i = 0; i < iA8; i++) {
            if (i < iU2) {
                irVar.Hw(i, (iA8 - iU2) + i, 1);
            } else {
                irVar.Hw(i, i - iU2, 1);
            }
        }
        this.j6.P8(irVar);
    }

    private void gn() {
        ArrayList<as> arrayListJ0 = this.j6.J0();
        Iterator<as> it = arrayListJ0.iterator();
        while (it.hasNext()) {
            as next = it.next();
            next.we(new b(arrayListJ0));
            next.KD();
        }
        Iterator<as> it2 = arrayListJ0.iterator();
        while (it2.hasNext()) {
            it2.next().cb();
        }
    }

    private up j6() {
        fs fsVar = new fs(this.j6, this.FH, this.DW);
        xr xrVarU7 = fsVar.u7();
        this.j6.dx();
        this.j6.P8(xrVarU7);
        gn();
        if (fsVar.KD()) {
            Zo();
        }
        VH();
        dp dpVarFH = FH();
        ds dsVar = this.j6;
        return new gs(new up(dpVarFH, dsVar.Hw(dsVar.XL()))).FH();
    }

    private void u7(as asVar) {
        tp tpVarWe = asVar.QX().get(r3.size() - 1).we();
        if (tpVarWe.DW() != 2 && tpVarWe != vp.GK) {
            throw new RuntimeException("Exit predecessor must end in valid exit statement.");
        }
    }

    public static up v5(ds dsVar, boolean z) {
        return new ks(dsVar, z).j6();
    }
}
