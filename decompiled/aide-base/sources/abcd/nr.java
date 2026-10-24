package abcd;

import abcd.as;
import abcd.cs;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class nr {
    private int DW;
    private ArrayList<c> FH = new ArrayList<>();
    private ds j6;

    class a extends xr {
        final /* synthetic */ qp DW;
        final /* synthetic */ qp j6;

        public a(qp qpVar, qp qpVar2) {
            this.j6 = qpVar;
            this.DW = qpVar2;
        }

        @Override // abcd.xr
        public qp DW(qp qpVar) {
            return qpVar.Mr() == this.j6.Mr() ? this.DW : qpVar;
        }

        @Override // abcd.xr
        public int j6() {
            return nr.this.j6.a8();
        }
    }

    class b implements as.a {

        class a implements cs.a {
            public a() {
            }

            @Override // abcd.cs.a
            public void DW(tr trVar) {
            }

            @Override // abcd.cs.a
            public void FH(tr trVar) {
                nr.this.we(trVar);
            }

            @Override // abcd.cs.a
            public void j6(vr vrVar) {
            }
        }

        public b() {
        }

        @Override // abcd.as.a
        public void j6(as asVar, as asVar2) {
            asVar.EQ(new a());
        }
    }

    static class c {
        d DW;
        ArrayList<c> FH;
        ArrayList<c> Hw;
        BitSet j6;
        boolean v5;

        public c(int i, int i2, d dVar) {
            BitSet bitSet = new BitSet(i2);
            this.j6 = bitSet;
            bitSet.set(i);
            this.DW = dVar;
            this.FH = new ArrayList<>();
            this.Hw = new ArrayList<>();
            this.v5 = false;
        }
    }

    public enum d {
        TOP,
        NONE,
        METHOD,
        INTER,
        GLOBAL
    }

    private nr(ds dsVar) {
        this.j6 = dsVar;
        this.DW = dsVar.a8();
    }

    public static void EQ(ds dsVar) {
        new nr(dsVar).Mr();
    }

    private void FH(c cVar, c cVar2) {
        if (!cVar2.Hw.contains(cVar)) {
            cVar2.Hw.add(cVar);
        }
        if (cVar.FH.contains(cVar2)) {
            return;
        }
        cVar.FH.add(cVar2);
    }

    private int Hw(qp qpVar) {
        int i = 0;
        while (i < this.FH.size() && !this.FH.get(i).j6.get(qpVar.Mr())) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private abcd.nr.c J0(abcd.cs r5) {
        /*
            r4 = this;
            abcd.qp r0 = r5.J8()
            abcd.cs r5 = r4.v5(r5)
            abcd.tp r1 = r5.we()
            int r1 = r1.Hw()
            r2 = 5
            if (r1 == r2) goto Laf
            r2 = 38
            r3 = 0
            if (r1 == r2) goto L65
            r2 = 45
            if (r1 == r2) goto L65
            r2 = 46
            if (r1 == r2) goto L57
            switch(r1) {
                case 40: goto Laf;
                case 41: goto L25;
                case 42: goto L25;
                case 43: goto L65;
                default: goto L23;
            }
        L23:
            r5 = 0
            return r5
        L25:
            abcd.rp r5 = r5.Ws()
            abcd.qp r5 = r5.sG(r3)
            abcd.gr r5 = r5.a8()
            boolean r5 = r5.XL()
            if (r5 == 0) goto L49
            abcd.nr$c r5 = new abcd.nr$c
            int r0 = r0.Mr()
            int r1 = r4.DW
            abcd.nr$d r2 = abcd.nr.d.NONE
            r5.<init>(r0, r1, r2)
            r0 = 1
            r5.v5 = r0
            goto Lbc
        L49:
            abcd.nr$c r5 = new abcd.nr$c
            int r0 = r0.Mr()
            int r1 = r4.DW
            abcd.nr$d r2 = abcd.nr.d.GLOBAL
            r5.<init>(r0, r1, r2)
            goto Lbc
        L57:
            abcd.nr$c r5 = new abcd.nr$c
            int r0 = r0.Mr()
            int r1 = r4.DW
            abcd.nr$d r2 = abcd.nr.d.GLOBAL
            r5.<init>(r0, r1, r2)
            goto Lbc
        L65:
            abcd.rp r5 = r5.Ws()
            abcd.qp r5 = r5.sG(r3)
            int r1 = r4.Hw(r5)
            java.util.ArrayList<abcd.nr$c> r2 = r4.FH
            int r2 = r2.size()
            if (r1 == r2) goto L8b
            java.util.ArrayList<abcd.nr$c> r5 = r4.FH
            java.lang.Object r5 = r5.get(r1)
            abcd.nr$c r5 = (abcd.nr.c) r5
            java.util.BitSet r1 = r5.j6
            int r0 = r0.Mr()
            r1.set(r0)
            return r5
        L8b:
            abcd.fr r5 = r5.j6()
            abcd.fr r1 = abcd.fr.iW
            if (r5 != r1) goto La1
            abcd.nr$c r5 = new abcd.nr$c
            int r0 = r0.Mr()
            int r1 = r4.DW
            abcd.nr$d r2 = abcd.nr.d.NONE
            r5.<init>(r0, r1, r2)
            goto Lbc
        La1:
            abcd.nr$c r5 = new abcd.nr$c
            int r0 = r0.Mr()
            int r1 = r4.DW
            abcd.nr$d r2 = abcd.nr.d.GLOBAL
            r5.<init>(r0, r1, r2)
            goto Lbc
        Laf:
            abcd.nr$c r5 = new abcd.nr$c
            int r0 = r0.Mr()
            int r1 = r4.DW
            abcd.nr$d r2 = abcd.nr.d.NONE
            r5.<init>(r0, r1, r2)
        Lbc:
            java.util.ArrayList<abcd.nr$c> r0 = r4.FH
            r0.add(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.nr.J0(abcd.cs):abcd.nr$c");
    }

    private void J8(cs csVar, c cVar, ArrayList<qp> arrayList) {
        int iHw = Hw(csVar.J8());
        if (iHw == this.FH.size()) {
            cVar.j6.set(csVar.J8().Mr());
            arrayList.add(csVar.J8());
            return;
        }
        c cVar2 = this.FH.get(iHw);
        if (cVar2 != cVar) {
            cVar.v5 = false;
            cVar.j6.or(cVar2.j6);
            if (cVar.DW.compareTo(cVar2.DW) < 0) {
                cVar.DW = cVar2.DW;
            }
            aM(cVar, cVar2);
            this.FH.remove(iHw);
        }
    }

    private void Mr() {
        this.j6.EQ(new b());
        Iterator<c> it = this.FH.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.DW != d.NONE) {
                Iterator<c> it2 = next.FH.iterator();
                while (it2.hasNext()) {
                    c next2 = it2.next();
                    if (next.DW.compareTo(next2.DW) > 0) {
                        next2.DW = next.DW;
                    }
                }
            }
        }
        U2();
    }

    private void QX(qp qpVar, cs csVar, c cVar, ArrayList<qp> arrayList) {
        int iHw = csVar.we().Hw();
        if (iHw == 2) {
            cVar.j6.set(csVar.J8().Mr());
            arrayList.add(csVar.J8());
            return;
        }
        if (iHw != 33 && iHw != 35) {
            if (iHw == 43 || iHw == 7 || iHw == 8) {
                if (cVar.DW.compareTo(d.METHOD) < 0) {
                    cVar.DW = d.METHOD;
                    return;
                }
                return;
            }
            if (iHw == 38) {
                if (csVar.Ws().sG(1).a8().XL()) {
                    return;
                }
                cVar.v5 = false;
                return;
            }
            if (iHw != 39) {
                switch (iHw) {
                    case 48:
                        cVar.DW = d.GLOBAL;
                        break;
                }
                return;
            } else if (!csVar.Ws().sG(2).a8().XL()) {
                cVar.v5 = false;
            }
            if (csVar.Ws().sG(0).a8().u7() != 9) {
                return;
            }
            cVar.v5 = false;
            rp rpVarWs = csVar.Ws();
            if (rpVarWs.sG(0).Mr() == qpVar.Mr()) {
                int iHw2 = Hw(rpVarWs.sG(1));
                if (iHw2 != this.FH.size()) {
                    c cVar2 = this.FH.get(iHw2);
                    FH(cVar2, cVar);
                    if (cVar.DW.compareTo(cVar2.DW) < 0) {
                        cVar.DW = cVar2.DW;
                        return;
                    }
                    return;
                }
                return;
            }
            int iHw3 = Hw(rpVarWs.sG(0));
            if (iHw3 != this.FH.size()) {
                c cVar3 = this.FH.get(iHw3);
                FH(cVar, cVar3);
                if (cVar3.DW.compareTo(cVar.DW) < 0) {
                    cVar3.DW = cVar.DW;
                    return;
                }
                return;
            }
            return;
        }
        cVar.DW = d.INTER;
    }

    private void U2() {
        Iterator<c> it = this.FH.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.v5 && next.DW == d.NONE) {
                int iNextSetBit = next.j6.nextSetBit(0);
                cs csVarWs = this.j6.Ws(iNextSetBit);
                cs csVarV5 = v5(csVarWs);
                int iAM = ((sq) csVarV5.Ws().sG(0).a8()).aM();
                ArrayList<qp> arrayList = new ArrayList<>(iAM);
                HashSet<cs> hashSet = new HashSet<>();
                XL(csVarWs, csVarV5, iAM, arrayList);
                hashSet.add(csVarV5);
                hashSet.add(csVarWs);
                for (cs csVar : this.j6.rN(iNextSetBit)) {
                    j3(csVar, csVarV5, arrayList, hashSet);
                    hashSet.add(csVar);
                }
                this.j6.u7(hashSet);
                this.j6.KD();
                bs.u7(this.j6, this.DW);
                tp();
            }
        }
    }

    private void VH(cs csVar, qp qpVar, HashSet<cs> hashSet) {
        zq zqVar = new zq(gp.DW);
        u7(csVar, rp.jw, null, 40, zqVar);
        as asVarTp = csVar.tp();
        as asVarP8 = asVarTp.P8(asVarTp.U2());
        cs csVar2 = asVarP8.QX().get(0);
        qp qpVarRo = qp.ro(this.j6.vy(), zqVar);
        gn(csVar2, rp.jw, qpVarRo, 56, null);
        as asVarP82 = asVarP8.P8(asVarP8.U2());
        cs csVar3 = asVarP82.QX().get(0);
        u7(csVar3, rp.g3(qpVarRo, qpVar), null, 52, new vq(zqVar, new wq(new yq("<init>"), new yq("(I)V"))));
        hashSet.add(csVar3);
        as asVarP83 = asVarP82.P8(asVarP82.U2());
        cs csVar4 = asVarP83.QX().get(0);
        u7(csVar4, rp.vJ(qpVarRo), null, 35, null);
        asVarP83.sh(asVarP83.a8(), this.j6.aM().Ws());
        hashSet.add(csVar4);
    }

    private void Ws(qp qpVar, c cVar) {
        ArrayList<qp> arrayList = new ArrayList<>();
        arrayList.add(qpVar);
        while (!arrayList.isEmpty()) {
            qp qpVarRemove = arrayList.remove(arrayList.size() - 1);
            for (cs csVar : this.j6.rN(qpVarRemove.Mr())) {
                if (csVar.we() == null) {
                    J8(csVar, cVar, arrayList);
                } else {
                    QX(qpVarRemove, csVar, cVar, arrayList);
                }
            }
        }
    }

    private void XL(cs csVar, cs csVar2, int i, ArrayList<qp> arrayList) {
        fr frVarJ6 = csVar.J8().j6();
        for (int i2 = 0; i2 < i; i2++) {
            bq bqVarJ6 = cr.j6(frVarJ6.J0());
            qp qpVarRo = qp.ro(this.j6.vy(), (br) bqVarJ6);
            arrayList.add(qpVarRo);
            gn(csVar, rp.jw, qpVarRo, 5, bqVarJ6);
        }
    }

    private cs Zo(cs csVar) {
        return this.j6.J0().get(csVar.tp().BT().nextSetBit(0)).QX().get(0);
    }

    private void aM(c cVar, c cVar2) {
        Iterator<c> it = cVar2.Hw.iterator();
        while (it.hasNext()) {
            c next = it.next();
            next.FH.remove(cVar2);
            next.FH.add(cVar);
            cVar.Hw.add(next);
        }
        Iterator<c> it2 = cVar2.FH.iterator();
        while (it2.hasNext()) {
            c next2 = it2.next();
            next2.Hw.remove(cVar2);
            next2.Hw.add(cVar);
            cVar.FH.add(next2);
        }
    }

    private void gn(cs csVar, rp rpVar, qp qpVar, int i, bq bqVar) {
        ip ipVarJ0 = csVar.J0();
        tp tpVarVy = i == 56 ? vp.vy(qpVar.j6()) : vp.I(i, qpVar, rpVar, bqVar);
        tr trVar = new tr(bqVar == null ? new op(tpVarVy, ipVarJ0.we(), qpVar, rpVar) : new np(tpVarVy, ipVarJ0.we(), qpVar, rpVar, bqVar), csVar.tp());
        ArrayList<cs> arrayListQX = csVar.tp().QX();
        arrayListQX.add(arrayListQX.lastIndexOf(csVar), trVar);
        this.j6.nw(trVar);
    }

    private void j3(cs csVar, cs csVar2, ArrayList<qp> arrayList, HashSet<cs> hashSet) {
        int size = arrayList.size();
        int iHw = csVar.we().Hw();
        if (iHw == 34) {
            Object objA8 = csVar2.Ws().sG(0).a8();
            cs csVarZo = Zo(csVar);
            gn(csVarZo, rp.jw, csVarZo.J8(), 5, (bq) objA8);
            hashSet.add(csVarZo);
            return;
        }
        if (iHw == 57) {
            ArrayList<bq> arrayListLg = ((hp) csVar.J0()).lg();
            for (int i = 0; i < size; i++) {
                qp qpVarRo = qp.ro(arrayList.get(i).Mr(), (gr) arrayListLg.get(i));
                gn(csVar, rp.jw, qpVarRo, 5, arrayListLg.get(i));
                arrayList.set(i, qpVarRo);
            }
            return;
        }
        if (iHw == 38) {
            cs csVarZo2 = Zo(csVar);
            rp rpVarWs = csVar.Ws();
            int iAM = ((sq) rpVarWs.sG(1).a8()).aM();
            if (iAM < size) {
                qp qpVar = arrayList.get(iAM);
                gn(csVarZo2, rp.vJ(qpVar), qpVar.g3(csVarZo2.J8().Mr()), 2, null);
            } else {
                VH(csVarZo2, rpVarWs.sG(1), hashSet);
                hashSet.add(csVarZo2.tp().QX().get(2));
            }
            hashSet.add(csVarZo2);
            return;
        }
        if (iHw != 39) {
            return;
        }
        rp rpVarWs2 = csVar.Ws();
        int iAM2 = ((sq) rpVarWs2.sG(2).a8()).aM();
        if (iAM2 >= size) {
            VH(csVar, rpVarWs2.sG(2), hashSet);
            return;
        }
        qp qpVarSG = rpVarWs2.sG(0);
        qp qpVarG3 = qpVarSG.g3(arrayList.get(iAM2).Mr());
        gn(csVar, rp.vJ(qpVarSG), qpVarG3, 2, null);
        arrayList.set(iAM2, qpVarG3.Mz());
    }

    private void tp() {
        for (int i = 0; i < this.j6.a8(); i++) {
            cs csVarWs = this.j6.Ws(i);
            if (csVarWs != null && csVarWs.we() != null && csVarWs.we().Hw() == 2) {
                ArrayList<cs>[] arrayListArrLg = this.j6.lg();
                qp qpVarSG = csVarWs.Ws().sG(0);
                qp qpVarJ8 = csVarWs.J8();
                if (qpVarSG.Mr() >= this.DW || qpVarJ8.Mr() >= this.DW) {
                    a aVar = new a(qpVarJ8, qpVarSG);
                    Iterator<cs> it = arrayListArrLg[qpVarJ8.Mr()].iterator();
                    while (it.hasNext()) {
                        it.next().ei(aVar);
                    }
                }
            }
        }
    }

    private void u7(cs csVar, rp rpVar, qp qpVar, int i, bq bqVar) {
        ip ipVarJ0 = csVar.J0();
        tp tpVarI = vp.I(i, qpVar, rpVar, bqVar);
        tr trVar = new tr(bqVar == null ? new zp(tpVarI, ipVarJ0.we(), rpVar, er.jw) : new yp(tpVarI, ipVarJ0.we(), rpVar, er.jw, bqVar), csVar.tp());
        ArrayList<cs> arrayListQX = csVar.tp().QX();
        arrayListQX.add(arrayListQX.lastIndexOf(csVar), trVar);
        this.j6.nw(trVar);
    }

    private cs v5(cs csVar) {
        return this.j6.J0().get(csVar.tp().Mr().nextSetBit(0)).QX().get(r2.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void we(cs csVar) {
        int iHw = csVar.we().Hw();
        qp qpVarJ8 = csVar.J8();
        if (iHw == 56 && qpVarJ8.a8().u7() == 9) {
            Ws(qpVarJ8, J0(csVar));
            return;
        }
        if (iHw == 3 && qpVarJ8.a8().u7() == 9) {
            c cVar = new c(qpVarJ8.Mr(), this.DW, d.NONE);
            this.FH.add(cVar);
            Ws(qpVarJ8, cVar);
        } else if (iHw == 55 && qpVarJ8.a8().u7() == 9) {
            c cVar2 = new c(qpVarJ8.Mr(), this.DW, d.NONE);
            this.FH.add(cVar2);
            Ws(qpVarJ8, cVar2);
        }
    }
}
