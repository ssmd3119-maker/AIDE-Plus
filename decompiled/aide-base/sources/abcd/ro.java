package abcd;

import abcd.co;
import abcd.lj;

/* loaded from: classes.dex */
public class ro {
    private co DW;
    private lj FH;
    private po j6;

    public ro(po poVar, co coVar) {
        this.j6 = poVar;
        this.DW = coVar;
        this.FH = coVar.EQ();
    }

    private void DW(qo qoVar) {
        lj.a aVar = this.FH.EQ;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.P8(gVarJ0.aM(), this.j6.j3(qoVar.FH(gVarJ0.U2())));
            }
        }
    }

    private void FH(qo qoVar) {
        lj.a aVar = this.FH.QX;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.vy(gVarJ0.aM(), this.j6.aM(qoVar.j6(gVarJ0.j3())));
            }
        }
    }

    private void Hw(qo qoVar) {
        lj.a aVar = this.FH.XL;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.nw(gVarJ0.aM(), this.j6.U2(qoVar.Ws(gVarJ0.BT())));
            }
        }
    }

    private void VH(qo qoVar) {
        lj.a aVar = this.FH.Hw;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.ro(i, this.j6.rN(qoVar.u7(gVarJ0.ro())));
            }
        }
    }

    private void Zo(qo qoVar) {
        lj.a aVar = this.FH.Zo;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.KD(i, this.j6.lg(qoVar.gn(gVarJ0.SI())));
            }
        }
    }

    private void gn(qo qoVar) {
        lj.a aVar = this.FH.DW;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.cn(i, this.j6.er(gVarJ0.XL(), gVarJ0.nw()));
            }
        }
    }

    private void j6(qo qoVar) {
        lj.a aVar = this.FH.tp;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.ei(gVarJ0.aM(), this.j6.Mr(qoVar.Hw(gVarJ0.a8())));
            }
        }
    }

    private void tp(qo qoVar) {
        lj.a aVar = this.FH.u7;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.cb(gVarJ0.aM(), this.j6.gW(qoVar.yS(gVarJ0.sG())));
            }
        }
    }

    private void u7(qo qoVar) {
        lj.a aVar = this.FH.FH;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.sh(i, this.j6.yS(qoVar.rN(gVarJ0.nw())));
            }
        }
    }

    private void v5(qo qoVar) {
        lj.a aVar = this.FH.v5;
        if (aVar.DW()) {
            co.g gVarJ0 = this.DW.J0(aVar.jw);
            for (int i = 0; i < aVar.mb; i++) {
                qoVar.SI(i, this.j6.a8(qoVar.VH(gVarJ0.P8())));
            }
        }
    }

    public qo EQ() {
        lj ljVar = this.FH;
        qo qoVar = new qo(ljVar.DW.mb, ljVar.FH.mb, ljVar.Hw.mb, ljVar.v5.mb, ljVar.Zo.mb);
        gn(qoVar);
        u7(qoVar);
        tp(qoVar);
        VH(qoVar);
        v5(qoVar);
        Zo(qoVar);
        FH(qoVar);
        DW(qoVar);
        j6(qoVar);
        Hw(qoVar);
        return qoVar;
    }
}
