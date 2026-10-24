package abcd;

import abcd.cp;
import abcd.ph;
import abcd.wh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class di {
    private final oh DW;
    private boolean EQ;
    private final int FH;
    private final int Hw;
    private boolean J0;
    private final uh[] VH;
    private final gi Zo;
    private final ArrayList<cp> gn;
    private final sh j6;
    private final fr[] tp;
    private final ArrayList<at> u7;
    private final ei v5;
    private final d[] we;

    class a implements cp.a {
        final /* synthetic */ at j6;

        public a(at atVar) {
            this.j6 = atVar;
        }

        @Override // abcd.cp.a
        public void j6(cp cpVar) {
            if (di.this.SI(cpVar)) {
                this.j6.BT(cpVar.j6());
            }
        }
    }

    class b implements cp.a {
        final /* synthetic */ at j6;

        public b(di diVar, at atVar) {
            this.j6 = atVar;
        }

        @Override // abcd.cp.a
        public void j6(cp cpVar) {
            this.j6.BT(cpVar.j6());
        }
    }

    private static class c {
        int j6;

        public c(int i) {
            this.j6 = i;
        }

        public int j6() {
            int i = this.j6;
            this.j6 = i + 1;
            return i;
        }
    }

    private class e {
        private final BitSet DW;
        private int FH;
        private int Hw;
        private final ArrayList<at> Zo;
        private final HashMap<Integer, Integer> j6 = new HashMap<>();
        private final c v5;

        public e(c cVar, ArrayList<at> arrayList) {
            this.DW = new BitSet(di.this.Hw);
            this.v5 = cVar;
            this.Zo = arrayList;
        }

        private boolean FH(int i, int i2) {
            at atVar = this.Zo.get(i);
            return atVar != null && atVar.size() > 0 && atVar.ca() == i2;
        }

        private int Hw(int i) {
            Integer num = this.j6.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
            if (!FH(i, this.FH)) {
                return i;
            }
            int iJ6 = this.v5.j6();
            this.DW.set(i);
            this.j6.put(Integer.valueOf(i), Integer.valueOf(iJ6));
            while (this.Zo.size() <= iJ6) {
                this.Zo.add(null);
            }
            ArrayList<at> arrayList = this.Zo;
            arrayList.set(iJ6, arrayList.get(i));
            return iJ6;
        }

        private void j6(int i, int i2) {
            at atVarDx;
            cp cpVarRo = di.this.ro(i);
            at atVarGn = cpVarRo.gn();
            int i3 = -1;
            if (di.this.SI(cpVarRo)) {
                atVarDx = at.sG(Hw(atVarGn.ro(0)), atVarGn.ro(1));
            } else {
                d dVarEf = di.this.ef(i);
                if (dVarEf == null) {
                    int iZo = cpVarRo.Zo();
                    int size = atVarGn.size();
                    at atVar = new at(size);
                    for (int i4 = 0; i4 < size; i4++) {
                        int iRo = atVarGn.ro(i4);
                        int iHw = Hw(iRo);
                        atVar.BT(iHw);
                        if (iZo == iRo) {
                            i3 = iHw;
                        }
                    }
                    atVar.Mr();
                    atVarDx = atVar;
                } else {
                    if (dVarEf.FH != this.FH) {
                        throw new RuntimeException("ret instruction returns to label " + xs.VH(dVarEf.FH) + " expected: " + xs.VH(this.FH));
                    }
                    atVarDx = at.dx(this.Hw);
                    i3 = this.Hw;
                }
            }
            di diVar = di.this;
            diVar.tp(new cp(i2, diVar.Mr(cpVarRo.Hw()), atVarDx, i3), this.Zo.get(i2));
        }

        public void DW(cp cpVar) {
            this.Hw = cpVar.gn().ro(0);
            int iRo = cpVar.gn().ro(1);
            this.FH = iRo;
            int iHw = Hw(iRo);
            int iNextSetBit = this.DW.nextSetBit(0);
            while (iNextSetBit >= 0) {
                this.DW.clear(iNextSetBit);
                int iIntValue = this.j6.get(Integer.valueOf(iNextSetBit)).intValue();
                j6(iNextSetBit, iIntValue);
                di diVar = di.this;
                if (diVar.SI(diVar.ro(iNextSetBit))) {
                    di.this.new e(this.v5, this.Zo).DW(di.this.ro(iIntValue));
                }
                iNextSetBit = this.DW.nextSetBit(0);
            }
            di.this.J0(new cp(cpVar.j6(), cpVar.Hw(), at.dx(iHw), iHw), this.Zo.get(cpVar.j6()));
        }
    }

    private di(sh shVar, aq aqVar) {
        if (shVar == null) {
            throw new NullPointerException("method == null");
        }
        if (aqVar == null) {
            throw new NullPointerException("advice == null");
        }
        this.j6 = shVar;
        oh ohVarJ0 = mh.J0(shVar);
        this.DW = ohVarJ0;
        this.Hw = ohVarJ0.ef();
        this.FH = shVar.we();
        ei eiVar = new ei(this, shVar, aqVar);
        this.v5 = eiVar;
        this.Zo = new gi(eiVar, shVar);
        int i = this.Hw;
        this.VH = new uh[i];
        this.we = new d[i];
        this.gn = new ArrayList<>((this.DW.size() * 2) + 10);
        this.u7 = new ArrayList<>((this.DW.size() * 2) + 10);
        this.tp = new fr[this.Hw];
        this.EQ = false;
        this.VH[0] = new uh(this.FH, shVar.J0());
    }

    private up BT() {
        int size = this.gn.size();
        dp dpVar = new dp(size);
        for (int i = 0; i < size; i++) {
            dpVar.br(i, this.gn.get(i));
        }
        dpVar.Mr();
        return new up(dpVar, vy(-1));
    }

    private void EQ() {
        int length = this.tp.length;
        for (int i = 0; i < length; i++) {
            fr frVar = this.tp[i];
            if (frVar != null) {
                wp wpVarWe = ro(i).FH().we();
                jp jpVar = new jp(2);
                jpVar.g3(0, new op(vp.yS(frVar), wpVarWe, qp.ro(this.FH, frVar), rp.jw));
                jpVar.g3(1, new op(vp.j3, wpVarWe, (qp) null, rp.jw));
                jpVar.Mr();
                tp(new cp(rN(i), jpVar, at.dx(i), i), this.VH[i].Zo());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J0(cp cpVar, at atVar) {
        boolean z;
        if (cpVar == null) {
            throw new NullPointerException("block == null");
        }
        int iCn = cn(cpVar.j6());
        if (iCn < 0) {
            z = false;
        } else {
            this.gn.remove(iCn);
            this.u7.remove(iCn);
            z = true;
        }
        this.gn.add(cpVar);
        atVar.yS();
        this.u7.add(atVar);
        return z;
    }

    private void J8() {
        tp tpVarSG = this.v5.sG();
        if (tpVarSG == null) {
            return;
        }
        wp wpVarEf = this.v5.ef();
        int iVy = vy(-2);
        if (KD()) {
            jp jpVar = new jp(1);
            jpVar.g3(0, new zp(vp.Yi, wpVarEf, rp.vJ(P8()), er.jw));
            jpVar.Mr();
            int iVy2 = vy(-3);
            tp(new cp(iVy, jpVar, at.dx(iVy2), iVy2), at.qp);
            iVy = iVy2;
        }
        jp jpVar2 = new jp(1);
        hr hrVarZo = tpVarSG.Zo();
        jpVar2.g3(0, new op(tpVarSG, wpVarEf, (qp) null, hrVarZo.size() == 0 ? rp.jw : rp.vJ(qp.ro(0, hrVarZo.v5(0)))));
        jpVar2.Mr();
        tp(new cp(iVy, jpVar2, at.qp, -1), at.qp);
    }

    private boolean KD() {
        return (this.j6.j6() & 32) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jp Mr(jp jpVar) {
        int size = jpVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (jpVar.Sf(i2).EQ() != vp.VH) {
                i++;
            }
        }
        if (i == size) {
            return jpVar;
        }
        jp jpVar2 = new jp(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ip ipVarSf = jpVar.Sf(i4);
            if (ipVarSf.EQ() != vp.VH) {
                jpVar2.g3(i3, ipVarSf);
                i3++;
            }
        }
        jpVar2.Mr();
        return jpVar2;
    }

    private qp P8() {
        int iGW = gW();
        if (iGW < 1) {
            iGW = 1;
        }
        return qp.ro(iGW, fr.sg);
    }

    private void QX() {
        if (this.EQ) {
            wp wpVarJ8 = this.j6.J8(0);
            qp qpVarRo = qp.ro(0, fr.Gj);
            jp jpVar = new jp(2);
            jpVar.g3(0, new op(vp.yS(fr.Gj), wpVarJ8, qpVarRo, rp.jw));
            jpVar.g3(1, new zp(vp.Yi, wpVarJ8, rp.vJ(P8()), er.jw));
            jpVar.Mr();
            int iVy = vy(-7);
            tp(new cp(vy(-6), jpVar, at.dx(iVy), iVy), at.qp);
            jp jpVar2 = new jp(1);
            jpVar2.g3(0, new zp(vp.GK, wpVarJ8, rp.vJ(qpVarRo), er.jw));
            jpVar2.Mr();
            tp(new cp(iVy, jpVar2, at.qp, -1), at.qp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean SI(cp cpVar) {
        at atVarGn = cpVar.gn();
        if (atVarGn.size() < 2) {
            return false;
        }
        int iRo = atVarGn.ro(1);
        d[] dVarArr = this.we;
        return iRo < dVarArr.length && dVarArr[iRo] != null;
    }

    private void U2(int i, cp.a aVar) {
        a8(ro(i), aVar, new BitSet(this.Hw));
    }

    private void Ws() {
        jp jpVar;
        wh whVarEQ = this.j6.EQ();
        int i = 0;
        wp wpVarJ8 = this.j6.J8(0);
        er erVarV5 = this.j6.DW().v5();
        int size = erVarV5.size();
        jp jpVar2 = new jp(size + 1);
        int i2 = 0;
        int iTp = 0;
        while (i2 < size) {
            fr frVarSf = erVarV5.Sf(i2);
            wh.a aVarG3 = whVarEQ.g3(i, iTp);
            jpVar2.g3(i2, new np(vp.gW(frVarSf), wpVarJ8, aVarG3 == null ? qp.ro(iTp, frVarSf) : qp.sh(iTp, frVarSf, aVarG3.DW()), rp.jw, nq.yS(iTp)));
            iTp += frVarSf.tp();
            i2++;
            i = 0;
        }
        jpVar2.g3(size, new op(vp.j3, wpVarJ8, (qp) null, rp.jw));
        jpVar2.Mr();
        boolean zKD = KD();
        int iVy = zKD ? vy(-4) : 0;
        tp(new cp(vy(-1), jpVar2, at.dx(iVy), iVy), at.qp);
        if (zKD) {
            qp qpVarP8 = P8();
            if (nw()) {
                yp ypVar = new yp(vp.XL, wpVarJ8, rp.jw, er.jw, this.j6.FH());
                jpVar = new jp(1);
                jpVar.g3(0, ypVar);
            } else {
                jp jpVar3 = new jp(2);
                jpVar3.g3(0, new np(vp.we, wpVarJ8, qpVarP8, rp.jw, nq.fY));
                jpVar3.g3(1, new op(vp.j3, wpVarJ8, (qp) null, rp.jw));
                jpVar = jpVar3;
            }
            int iVy2 = vy(-5);
            jpVar.Mr();
            tp(new cp(iVy, jpVar, at.dx(iVy2), iVy2), at.qp);
            jp jpVar4 = new jp(nw() ? 2 : 1);
            if (nw()) {
                jpVar4.g3(0, new op(vp.vy(qpVarP8), wpVarJ8, qpVarP8, rp.jw));
            }
            jpVar4.g3(nw() ? 1 : 0, new zp(vp.dW, wpVarJ8, rp.vJ(qpVarP8), er.jw));
            jpVar4.Mr();
            tp(new cp(iVy2, jpVar4, at.dx(0), 0), at.qp);
        }
    }

    public static up XL(sh shVar, aq aqVar) {
        try {
            di diVar = new di(shVar, aqVar);
            diVar.j3();
            return diVar.BT();
        } catch (fi e2) {
            e2.j6("...while working on method " + shVar.v5().Zo());
            throw e2;
        }
    }

    private void a8(cp cpVar, cp.a aVar, BitSet bitSet) {
        int iCn;
        aVar.j6(cpVar);
        bitSet.set(cpVar.j6());
        at atVarGn = cpVar.gn();
        int size = atVarGn.size();
        for (int i = 0; i < size; i++) {
            int iRo = atVarGn.ro(i);
            if (!bitSet.get(iRo) && ((!SI(cpVar) || i <= 0) && (iCn = cn(iRo)) >= 0)) {
                a8(this.gn.get(iCn), aVar, bitSet);
            }
        }
    }

    private void aM() {
        at atVar = new at(this.gn.size());
        this.u7.clear();
        U2(vy(-1), new b(this, atVar));
        atVar.I();
        for (int size = this.gn.size() - 1; size >= 0; size--) {
            if (atVar.sh(this.gn.get(size).j6()) < 0) {
                this.gn.remove(size);
            }
        }
    }

    private void cb(nh nhVar, uh uhVar, int[] iArr) {
        at atVar;
        int size;
        d dVar;
        at atVarEf;
        int i;
        int i2;
        int i3;
        at atVar2;
        int i4;
        int i5;
        at atVarDx;
        ph phVarDW = nhVar.DW();
        this.v5.ca(phVarDW.g3());
        uh uhVarFH = uhVar.FH();
        this.Zo.VH(nhVar, uhVarFH);
        uhVarFH.J8();
        int iCn = this.v5.cn();
        ArrayList<ip> arrayListSh = this.v5.sh();
        int size2 = arrayListSh.size();
        int size3 = phVarDW.size();
        at atVarV5 = nhVar.v5();
        if (this.v5.vJ()) {
            int iRo = atVarV5.ro(1);
            d[] dVarArr = this.we;
            if (dVarArr[iRo] == null) {
                dVarArr[iRo] = new d(iRo);
            }
            this.we[iRo].FH(nhVar.j6());
            atVar = atVarV5;
            dVar = this.we[iRo];
            size = 1;
        } else {
            if (this.v5.g3()) {
                int iDW = this.v5.dx().DW();
                d[] dVarArr2 = this.we;
                if (dVarArr2[iDW] == null) {
                    dVarArr2[iDW] = new d(this, iDW, nhVar.j6());
                } else {
                    dVarArr2[iDW].Hw(nhVar.j6());
                }
                at atVarZo = this.we[iDW].Zo();
                this.we[iDW].VH(uhVarFH, iArr);
                size = atVarZo.size();
                atVar = atVarZo;
            } else if (this.v5.Qq()) {
                atVar = atVarV5;
                size = size3;
            } else {
                atVar = atVarV5;
                size = 0;
            }
            dVar = null;
        }
        int size4 = atVar.size();
        int i6 = size;
        while (i6 < size4) {
            int iRo2 = atVar.ro(i6);
            try {
                int i7 = i6;
                int i8 = size4;
                at atVar3 = atVar;
                sh(iRo2, nhVar.j6(), dVar, uhVarFH, iArr);
                i6 = i7 + 1;
                atVar = atVar3;
                size4 = i8;
            } catch (fi e2) {
                e2.j6("...while merging to block " + xs.VH(iRo2));
                throw e2;
            }
        }
        int i9 = size4;
        at atVar4 = atVar;
        if (i9 == 0 && this.v5.I()) {
            atVarEf = at.dx(vy(-2));
            i = 1;
        } else {
            atVarEf = atVar4;
            i = i9;
        }
        if (i == 0) {
            i2 = -1;
        } else {
            int iCb = this.v5.cb();
            if (iCb >= 0) {
                iCb = atVarEf.ro(iCb);
            }
            i2 = iCb;
        }
        boolean z = KD() && this.v5.ro();
        if (z || size3 != 0) {
            at atVar5 = new at(i);
            boolean z2 = false;
            int i10 = 0;
            while (i10 < size3) {
                ph.a aVarSG = phVarDW.sG(i10);
                zq zqVarFH = aVarSG.FH();
                int iHw = aVarSG.Hw();
                boolean z3 = (zqVarFH == zq.fY) | z2;
                try {
                    atVar2 = atVar5;
                    i4 = i2;
                    i5 = i10;
                } catch (fi e3) {
                    e = e3;
                }
                try {
                    sh(iHw, nhVar.j6(), null, uhVarFH.gn(zqVarFH), iArr);
                    fr[] frVarArr = this.tp;
                    fr frVar = frVarArr[iHw];
                    if (frVar == null) {
                        frVarArr[iHw] = zqVarFH.J0();
                    } else if (frVar != zqVarFH.J0()) {
                        this.tp[iHw] = fr.sg;
                    }
                    atVar2.BT(rN(iHw));
                    i10 = i5 + 1;
                    atVar5 = atVar2;
                    z2 = z3;
                    i2 = i4;
                } catch (fi e4) {
                    e = e4;
                    iHw = iHw;
                    e.j6("...while merging exception to block " + xs.VH(iHw));
                    throw e;
                }
            }
            at atVar6 = atVar5;
            int i11 = i2;
            if (z && !z2) {
                atVar6.BT(vy(-6));
                this.EQ = true;
                for (int i12 = (size2 - iCn) - 1; i12 < size2; i12++) {
                    ip ipVar = arrayListSh.get(i12);
                    if (ipVar.FH()) {
                        arrayListSh.set(i12, ipVar.aM(fr.sg));
                    }
                }
            }
            i3 = i11;
            if (i3 >= 0) {
                atVar6.BT(i3);
            }
            atVar6.Mr();
            atVarEf = atVar6;
        } else {
            i3 = i2;
        }
        int iSh = atVarEf.sh(i3);
        int i13 = i3;
        while (iCn > 0) {
            size2--;
            ip ipVar2 = arrayListSh.get(size2);
            boolean z4 = ipVar2.EQ().DW() == 1;
            jp jpVar = new jp(z4 ? 2 : 1);
            jpVar.g3(0, ipVar2);
            if (z4) {
                jpVar.g3(1, new op(vp.j3, ipVar2.we(), (qp) null, rp.jw));
                atVarDx = at.dx(i13);
            } else {
                atVarDx = atVarEf;
            }
            jpVar.Mr();
            int iLg = lg();
            tp(new cp(iLg, jpVar, atVarDx, i13), uhVarFH.Zo());
            atVarEf = atVarEf.ef();
            atVarEf.g3(iSh, iLg);
            atVarEf.Mr();
            iCn--;
            i13 = iLg;
        }
        ip ipVar3 = size2 == 0 ? null : arrayListSh.get(size2 - 1);
        if (ipVar3 == null || ipVar3.EQ().DW() == 1) {
            arrayListSh.add(new op(vp.j3, ipVar3 == null ? wp.Hw : ipVar3.we(), (qp) null, rp.jw));
            size2++;
        }
        jp jpVar2 = new jp(size2);
        for (int i14 = 0; i14 < size2; i14++) {
            jpVar2.g3(i14, arrayListSh.get(i14));
        }
        jpVar2.Mr();
        we(new cp(nhVar.j6(), jpVar2, atVarEf, i13), uhVarFH.Zo());
    }

    private int cn(int i) {
        int size = this.gn.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.gn.get(i2).j6() == i) {
                return i2;
            }
        }
        return -1;
    }

    private void dx(int i) {
        int iYS = yS();
        at atVarGn = this.gn.get(i).gn();
        int size = atVarGn.size();
        this.gn.remove(i);
        this.u7.remove(i);
        for (int i2 = 0; i2 < size; i2++) {
            int iRo = atVarGn.ro(i2);
            if (iRo >= iYS) {
                int iCn = cn(iRo);
                if (iCn < 0) {
                    throw new RuntimeException("Invalid label " + xs.VH(iRo));
                }
                dx(iCn);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d ef(int i) {
        for (int length = this.we.length - 1; length >= 0; length--) {
            d[] dVarArr = this.we;
            if (dVarArr[length] != null) {
                d dVar = dVarArr[length];
                if (dVar.DW.get(i)) {
                    return dVar;
                }
            }
        }
        return null;
    }

    private void ei() {
        at atVar = new at(4);
        U2(0, new a(atVar));
        int iLg = lg();
        ArrayList arrayList = new ArrayList(iLg);
        for (int i = 0; i < iLg; i++) {
            arrayList.add(null);
        }
        for (int i2 = 0; i2 < this.gn.size(); i2++) {
            cp cpVar = this.gn.get(i2);
            if (cpVar != null) {
                arrayList.set(cpVar.j6(), this.u7.get(i2));
            }
        }
        int size = atVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            new e(new c(lg()), arrayList).DW(ro(atVar.ro(i3)));
        }
        aM();
    }

    private int gW() {
        return this.FH + this.j6.J0();
    }

    private void j3() {
        int[] iArrU7 = ns.u7(this.Hw);
        ns.EQ(iArrU7, 0);
        Ws();
        sG();
        while (true) {
            int iV5 = ns.v5(iArrU7, 0);
            if (iV5 < 0) {
                break;
            }
            ns.FH(iArrU7, iV5);
            try {
                cb(this.DW.ca(iV5), this.VH[iV5], iArrU7);
            } catch (fi e2) {
                e2.j6("...while working on block " + xs.VH(iV5));
                throw e2;
            }
        }
        J8();
        QX();
        EQ();
        if (this.J0) {
            ei();
        }
    }

    private int lg() {
        int iYS = yS();
        Iterator<cp> it = this.gn.iterator();
        while (it.hasNext()) {
            int iJ6 = it.next().j6();
            if (iJ6 >= iYS) {
                iYS = iJ6 + 1;
            }
        }
        return iYS;
    }

    private boolean nw() {
        return (this.j6.j6() & 8) != 0;
    }

    private int rN(int i) {
        return this.Hw + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cp ro(int i) {
        int iCn = cn(i);
        if (iCn >= 0) {
            return this.gn.get(iCn);
        }
        throw new IllegalArgumentException("no such label " + xs.VH(i));
    }

    private void sG() {
        this.VH[0].VH(this.j6.DW().v5());
        this.VH[0].J8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sh(int i, int i2, d dVar, uh uhVar, int[] iArr) {
        uh[] uhVarArr = this.VH;
        uh uhVar2 = uhVarArr[i];
        if (uhVar2 == null) {
            if (dVar != null) {
                uhVarArr[i] = uhVar.tp(i, i2);
            } else {
                uhVarArr[i] = uhVar;
            }
            ns.EQ(iArr, i);
            return;
        }
        uh uhVarJ0 = dVar != null ? uhVar2.J0(uhVar, dVar.v5(), i2) : uhVar2.we(uhVar);
        if (uhVarJ0 != uhVar2) {
            this.VH[i] = uhVarJ0;
            ns.EQ(iArr, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tp(cp cpVar, at atVar) {
        if (cpVar == null) {
            throw new NullPointerException("block == null");
        }
        this.gn.add(cpVar);
        atVar.yS();
        this.u7.add(atVar);
    }

    private int vy(int i) {
        return (this.Hw * 2) + (i ^ (-1));
    }

    private boolean we(cp cpVar, at atVar) {
        boolean z;
        if (cpVar == null) {
            throw new NullPointerException("block == null");
        }
        int iCn = cn(cpVar.j6());
        if (iCn < 0) {
            z = false;
        } else {
            dx(iCn);
            z = true;
        }
        this.gn.add(cpVar);
        atVar.yS();
        this.u7.add(atVar);
        return z;
    }

    private int yS() {
        return (this.Hw * 2) + 7;
    }

    public int er() {
        int iGW = gW();
        return KD() ? iGW + 1 : iGW;
    }

    private class d {
        private BitSet DW;
        private int FH;
        private BitSet j6;

        public d(int i) {
            this.FH = i;
            this.DW = new BitSet(di.this.Hw);
            this.j6 = new BitSet(di.this.Hw);
            di.this.J0 = true;
        }

        public void FH(int i) {
            this.j6.set(i);
        }

        public void Hw(int i) {
            this.DW.set(i);
        }

        public void VH(uh uhVar, int[] iArr) {
            int iNextSetBit = this.j6.nextSetBit(0);
            while (iNextSetBit >= 0) {
                int iRo = di.this.ro(iNextSetBit).gn().ro(0);
                uh uhVarWs = uhVar.Ws(this.FH, iNextSetBit);
                if (uhVarWs != null) {
                    di.this.sh(iRo, -1, null, uhVarWs, iArr);
                } else {
                    ns.EQ(iArr, iNextSetBit);
                }
                iNextSetBit = this.j6.nextSetBit(iNextSetBit + 1);
            }
        }

        public at Zo() {
            at atVar = new at(this.j6.size());
            int iNextSetBit = this.j6.nextSetBit(0);
            while (iNextSetBit >= 0) {
                atVar.BT(di.this.ro(iNextSetBit).gn().ro(0));
                iNextSetBit = this.j6.nextSetBit(iNextSetBit + 1);
            }
            atVar.Mr();
            return atVar;
        }

        public int v5() {
            return this.FH;
        }

        public d(di diVar, int i, int i2) {
            this(i);
            Hw(i2);
        }
    }
}
