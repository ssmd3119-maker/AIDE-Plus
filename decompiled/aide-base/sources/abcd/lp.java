package abcd;

/* loaded from: classes.dex */
public final class lp {
    private final dp DW;
    private final mp FH;
    private final int[] Hw;
    private final up j6;

    private lp(up upVar) {
        if (upVar == null) {
            throw new NullPointerException("method == null");
        }
        dp dpVarDW = upVar.DW();
        int iEf = dpVarDW.ef();
        this.j6 = upVar;
        this.DW = dpVarDW;
        this.FH = new mp(upVar);
        this.Hw = ns.u7(iEf);
    }

    public static mp DW(up upVar) {
        return new lp(upVar).j6();
    }

    private void FH(int i) {
        sp spVarDx = this.FH.dx(i);
        cp cpVarLp = this.DW.lp(i);
        jp jpVarHw = cpVarLp.Hw();
        int size = jpVarHw.size();
        boolean z = cpVarLp.u7() && jpVarHw.vJ().J0() != null;
        int i2 = size - 1;
        sp spVarCb = spVarDx;
        for (int i3 = 0; i3 < size; i3++) {
            if (z && i3 == i2) {
                spVarCb.Mr();
                spVarCb = spVarCb.cb();
            }
            ip ipVarSf = jpVarHw.Sf(i3);
            qp qpVarTp = ipVarSf.tp();
            if (qpVarTp == null) {
                qp qpVarJ0 = ipVarSf.J0();
                if (qpVarJ0 != null && spVarCb.vy(qpVarJ0.Mr()) != null) {
                    spVarCb.ef(spVarCb.vy(qpVarJ0.Mr()));
                }
            } else {
                qp qpVarMz = qpVarTp.Mz();
                if (!qpVarMz.equals(spVarCb.KD(qpVarMz))) {
                    qp qpVarSh = spVarCb.sh(qpVarMz.QX());
                    if (qpVarSh != null && qpVarSh.Mr() != qpVarMz.Mr()) {
                        spVarCb.ef(qpVarSh);
                    }
                    this.FH.BT(ipVarSf, qpVarMz);
                    spVarCb.dx(qpVarMz);
                }
            }
        }
        spVarCb.Mr();
        at atVarGn = cpVarLp.gn();
        int size2 = atVarGn.size();
        int iZo = cpVarLp.Zo();
        for (int i4 = 0; i4 < size2; i4++) {
            int iRo = atVarGn.ro(i4);
            if (this.FH.cb(iRo, iRo == iZo ? spVarCb : spVarDx)) {
                ns.EQ(this.Hw, iRo);
            }
        }
    }

    private mp j6() {
        int iFH = this.j6.FH();
        while (iFH >= 0) {
            ns.FH(this.Hw, iFH);
            FH(iFH);
            iFH = ns.v5(this.Hw, 0);
        }
        this.FH.Mr();
        return this.FH;
    }
}
