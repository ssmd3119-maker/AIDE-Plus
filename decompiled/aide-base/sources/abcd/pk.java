package abcd;

import abcd.ip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pk {
    private final int DW;
    private final mp FH;
    private final sj Hw;
    private final int VH;
    private final c Zo;
    private int[] gn = null;
    private final up j6;
    private boolean tp;
    private final int u7;
    private final lk v5;

    static class a extends ip.a {
        final /* synthetic */ int DW;
        final /* synthetic */ int FH;
        final /* synthetic */ boolean[] j6;

        public a(boolean[] zArr, int i, int i2) {
            this.j6 = zArr;
            this.DW = i;
            this.FH = i2;
        }

        @Override // abcd.ip.b
        public void DW(np npVar) {
            if (npVar.EQ().Hw() == 3) {
                int iA8 = ((nq) npVar.a8()).a8();
                boolean[] zArr = this.j6;
                zArr[0] = zArr[0] && (this.DW - this.FH) + iA8 == npVar.J0().Mr();
            }
        }
    }

    private class b extends c {
        private mp v5;

        public b(pk pkVar, lk lkVar, mp mpVar) {
            super(lkVar);
            this.v5 = mpVar;
        }

        @Override // abcd.pk.c, abcd.ip.b
        public void DW(np npVar) {
            super.DW(npVar);
            EQ(npVar);
        }

        public void EQ(ip ipVar) {
            qp qpVarVy = this.v5.vy(ipVar);
            if (qpVarVy != null) {
                VH(new jk(ipVar.we(), qpVarVy));
            }
        }

        @Override // abcd.pk.c, abcd.ip.b
        public void FH(yp ypVar) {
            super.FH(ypVar);
            EQ(ypVar);
        }

        @Override // abcd.pk.c, abcd.ip.b
        public void Hw(zp zpVar) {
            super.Hw(zpVar);
            EQ(zpVar);
        }

        @Override // abcd.pk.c, abcd.ip.b
        public void j6(op opVar) {
            super.j6(opVar);
            EQ(opVar);
        }

        @Override // abcd.pk.c, abcd.ip.b
        public void v5(xp xpVar) {
            super.v5(xpVar);
            EQ(xpVar);
        }
    }

    private class c implements ip.b {
        private cp DW;
        private wj FH;
        private final lk j6;

        public c(lk lkVar) {
            this.j6 = lkVar;
        }

        private qp u7() {
            int iZo = this.DW.Zo();
            if (iZo < 0) {
                return null;
            }
            ip ipVarSf = pk.this.j6.DW().lp(iZo).Hw().Sf(0);
            if (ipVarSf.EQ().Hw() != 56) {
                return null;
            }
            return ipVarSf.J0();
        }

        @Override // abcd.ip.b
        public void DW(np npVar) {
            wp wpVarWe = npVar.we();
            bk bkVarJ6 = ok.j6(npVar);
            tp tpVarEQ = npVar.EQ();
            int iHw = tpVarEQ.Hw();
            if (tpVarEQ.DW() != 1) {
                throw new RuntimeException("shouldn't happen");
            }
            if (iHw != 3) {
                VH(new xj(bkVarJ6, wpVarWe, pk.u7(npVar), npVar.a8()));
            } else {
                if (pk.this.tp) {
                    return;
                }
                qp qpVarJ0 = npVar.J0();
                VH(new qk(bkVarJ6, wpVarWe, rp.g3(qpVarJ0, qp.ro((pk.this.VH - pk.this.u7) + ((nq) npVar.a8()).a8(), qpVarJ0.j6()))));
            }
        }

        @Override // abcd.ip.b
        public void FH(yp ypVar) {
            wp wpVarWe = ypVar.we();
            bk bkVarJ6 = ok.j6(ypVar);
            tp tpVarEQ = ypVar.EQ();
            bq bqVarA8 = ypVar.a8();
            if (tpVarEQ.DW() != 6) {
                throw new RuntimeException("shouldn't happen");
            }
            VH(this.FH);
            if (tpVarEQ.VH()) {
                VH(new xj(bkVarJ6, wpVarWe, ypVar.J8(), bqVarA8));
                return;
            }
            qp qpVarU7 = u7();
            rp rpVarTp = pk.tp(ypVar, qpVarU7);
            if ((bkVarJ6.VH() || tpVarEQ.Hw() == 43) == (qpVarU7 != null)) {
                VH((tpVarEQ.Hw() != 41 || bkVarJ6.v5() == 35) ? new xj(bkVarJ6, wpVarWe, rpVarTp, bqVarA8) : new qk(bkVarJ6, wpVarWe, rpVarTp));
                return;
            }
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + ypVar);
        }

        @Override // abcd.ip.b
        public void Hw(zp zpVar) {
            wp wpVarWe = zpVar.we();
            bk bkVarJ6 = ok.j6(zpVar);
            if (zpVar.EQ().DW() != 6) {
                throw new RuntimeException("shouldn't happen");
            }
            qp qpVarU7 = u7();
            if (bkVarJ6.VH() == (qpVarU7 != null)) {
                VH(this.FH);
                VH(new qk(bkVarJ6, wpVarWe, pk.tp(zpVar, qpVarU7)));
            } else {
                throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + zpVar);
            }
        }

        public void VH(zj zjVar) {
            this.j6.j6(zjVar);
        }

        @Override // abcd.ip.b
        public void Zo(hp hpVar) {
            wp wpVarWe = hpVar.we();
            bq bqVarA8 = hpVar.a8();
            ArrayList<bq> arrayListLg = hpVar.lg();
            if (hpVar.EQ().DW() != 1) {
                throw new RuntimeException("shouldn't happen");
            }
            wj wjVar = new wj(wpVarWe);
            zj rjVar = new rj(wpVarWe, this.FH, arrayListLg, bqVarA8);
            zj tkVar = new tk(ck.ef, wpVarWe, pk.u7(hpVar), wjVar);
            VH(this.FH);
            VH(tkVar);
            gn(new kk(wpVarWe));
            gn(wjVar);
            gn(rjVar);
        }

        public void gn(zj zjVar) {
            this.j6.DW(zjVar);
        }

        @Override // abcd.ip.b
        public void j6(op opVar) {
            zj qkVar;
            tp tpVarEQ = opVar.EQ();
            if (tpVarEQ.Hw() == 54 || tpVarEQ.Hw() == 56) {
                return;
            }
            wp wpVarWe = opVar.we();
            bk bkVarJ6 = ok.j6(opVar);
            int iDW = tpVarEQ.DW();
            if (iDW == 1 || iDW == 2) {
                qkVar = new qk(bkVarJ6, wpVarWe, pk.u7(opVar));
            } else {
                if (iDW == 3) {
                    return;
                }
                if (iDW != 4) {
                    if (iDW != 6) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    qkVar = new qk(bkVarJ6, wpVarWe, pk.u7(opVar));
                } else {
                    qkVar = new tk(bkVarJ6, wpVarWe, pk.u7(opVar), pk.this.Hw.FH(this.DW.gn().ro(1)));
                }
            }
            VH(qkVar);
        }

        public void tp(cp cpVar, wj wjVar) {
            this.DW = cpVar;
            this.FH = wjVar;
        }

        @Override // abcd.ip.b
        public void v5(xp xpVar) {
            wp wpVarWe = xpVar.we();
            at atVarA8 = xpVar.a8();
            at atVarGn = this.DW.gn();
            int size = atVarA8.size();
            int size2 = atVarGn.size();
            int iZo = this.DW.Zo();
            if (size != size2 - 1 || iZo != atVarGn.ro(size)) {
                throw new RuntimeException("shouldn't happen");
            }
            wj[] wjVarArr = new wj[size];
            for (int i = 0; i < size; i++) {
                wjVarArr[i] = pk.this.Hw.FH(atVarGn.ro(i));
            }
            wj wjVar = new wj(wpVarWe);
            sk skVar = new sk(wpVarWe, this.FH, atVarA8, wjVarArr);
            zj tkVar = new tk(skVar.rN() ? ck.I : ck.ca, wpVarWe, pk.u7(xpVar), wjVar);
            VH(this.FH);
            VH(tkVar);
            gn(new kk(wpVarWe));
            gn(wjVar);
            gn(skVar);
        }
    }

    private pk(up upVar, int i, mp mpVar, int i2, kj kjVar) {
        this.j6 = upVar;
        this.DW = i;
        this.FH = mpVar;
        this.Hw = new sj(upVar);
        this.u7 = i2;
        this.tp = gn(upVar, i2);
        dp dpVarDW = upVar.DW();
        int size = dpVarDW.size();
        int i3 = size * 3;
        int iQq = dpVarDW.Qq() + i3;
        iQq = mpVar != null ? iQq + size + mpVar.KD() : iQq;
        int iAj = dpVarDW.aj() + (this.tp ? 0 : this.u7);
        this.VH = iAj;
        lk lkVar = new lk(kjVar, iQq, i3, iAj);
        this.v5 = lkVar;
        if (mpVar != null) {
            this.Zo = new b(this, lkVar, mpVar);
        } else {
            this.Zo = new c(lkVar);
        }
    }

    private void EQ(cp cpVar, int i) {
        wj wjVarHw = this.Hw.Hw(cpVar);
        this.v5.j6(wjVarHw);
        mp mpVar = this.FH;
        if (mpVar != null) {
            this.v5.j6(new ik(wjVarHw.EQ(), mpVar.cn(cpVar)));
        }
        this.Zo.tp(cpVar, this.Hw.DW(cpVar));
        cpVar.Hw().ef(this.Zo);
        this.v5.j6(this.Hw.j6(cpVar));
        int iZo = cpVar.Zo();
        ip ipVarV5 = cpVar.v5();
        if (iZo < 0 || iZo == i) {
            return;
        }
        if (ipVarV5.EQ().DW() == 4 && cpVar.VH() == i) {
            this.v5.v5(1, this.Hw.FH(iZo));
        } else {
            this.v5.j6(new tk(ck.vJ, ipVarV5.we(), rp.jw, this.Hw.FH(iZo)));
        }
    }

    private void J0() {
        int iRo;
        dp dpVarDW = this.j6.DW();
        int size = dpVarDW.size();
        int iEf = dpVarDW.ef();
        int[] iArrU7 = ns.u7(iEf);
        int[] iArrU72 = ns.u7(iEf);
        for (int i = 0; i < size; i++) {
            ns.EQ(iArrU7, dpVarDW.ca(i).j6());
        }
        int[] iArr = new int[size];
        int iFH = this.j6.FH();
        int i2 = 0;
        while (iFH != -1) {
            while (true) {
                at atVarHw = this.j6.Hw(iFH);
                int size2 = atVarHw.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    iRo = atVarHw.ro(i3);
                    if (ns.Zo(iArrU72, iRo)) {
                        break;
                    }
                    if (ns.Zo(iArrU7, iRo) && dpVarDW.lp(iRo).Zo() == iFH) {
                        break;
                    }
                }
                ns.EQ(iArrU72, iRo);
                iFH = iRo;
            }
            while (iFH != -1) {
                ns.FH(iArrU7, iFH);
                ns.FH(iArrU72, iFH);
                iArr[i2] = iFH;
                i2++;
                cp cpVarLp = dpVarDW.lp(iFH);
                cp cpVarOW = dpVarDW.OW(cpVarLp);
                if (cpVarOW == null) {
                    break;
                }
                int iJ6 = cpVarOW.j6();
                int iZo = cpVarLp.Zo();
                if (ns.Zo(iArrU7, iJ6)) {
                    iFH = iJ6;
                } else if (iZo == iJ6 || iZo < 0 || !ns.Zo(iArrU7, iZo)) {
                    at atVarGn = cpVarLp.gn();
                    int size3 = atVarGn.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size3) {
                            iFH = -1;
                            break;
                        }
                        int iRo2 = atVarGn.ro(i4);
                        if (ns.Zo(iArrU7, iRo2)) {
                            iFH = iRo2;
                            break;
                        }
                        i4++;
                    }
                } else {
                    iFH = iZo;
                }
            }
            iFH = ns.v5(iArrU7, 0);
        }
        if (i2 != size) {
            throw new RuntimeException("shouldn't happen");
        }
        this.gn = iArr;
    }

    public static yj J8(up upVar, int i, mp mpVar, int i2, kj kjVar) {
        return new pk(upVar, i, mpVar, i2, kjVar).Ws();
    }

    private yj Ws() {
        J0();
        we();
        return new yj(this.DW, this.v5.Hw(), new rk(this.j6, this.gn, this.Hw));
    }

    private static boolean gn(up upVar, int i) {
        boolean[] zArr = {true};
        upVar.DW().I(new a(zArr, upVar.DW().aj(), i));
        return zArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static rp tp(ip ipVar, qp qpVar) {
        rp rpVarJ8 = ipVar.J8();
        if (ipVar.EQ().gn() && rpVarJ8.size() == 2 && qpVar.Mr() == rpVarJ8.sG(1).Mr()) {
            rpVarJ8 = rp.g3(rpVarJ8.sG(1), rpVarJ8.sG(0));
        }
        return qpVar == null ? rpVarJ8 : rpVarJ8.x9(qpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static rp u7(ip ipVar) {
        return tp(ipVar, ipVar.J0());
    }

    private void we() {
        dp dpVarDW = this.j6.DW();
        int[] iArr = this.gn;
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            EQ(dpVarDW.lp(iArr[i]), i2 == iArr.length ? -1 : iArr[i2]);
            i = i2;
        }
    }
}
