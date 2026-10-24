package abcd;

import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public class qr {
    private final ArrayList<as> DW;
    private final rr FH;
    private final BitSet Hw;
    private final ds j6;

    private qr(ds dsVar) {
        if (dsVar == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList<as> arrayListJ0 = dsVar.J0();
        this.j6 = dsVar;
        this.DW = arrayListJ0;
        this.FH = new rr(dsVar);
        this.Hw = new BitSet(arrayListJ0.size());
    }

    public static rr DW(ds dsVar) {
        return new qr(dsVar).j6();
    }

    private void FH(int i) {
        sp spVarCn = this.FH.cn(i);
        as asVar = this.DW.get(i);
        ArrayList<cs> arrayListQX = asVar.QX();
        int size = arrayListQX.size();
        if (i == this.j6.j3()) {
            return;
        }
        int i2 = size - 1;
        cs csVar = arrayListQX.get(i2);
        boolean z = (csVar.J0().VH().size() != 0) && csVar.J8() != null;
        sp spVarCb = spVarCn;
        for (int i3 = 0; i3 < size; i3++) {
            if (z && i3 == i2) {
                spVarCb.Mr();
                spVarCb = spVarCb.cb();
            }
            cs csVar2 = arrayListQX.get(i3);
            qp qpVarEQ = csVar2.EQ();
            if (qpVarEQ == null) {
                qp qpVarJ8 = csVar2.J8();
                if (qpVarJ8 != null && spVarCb.vy(qpVarJ8.Mr()) != null) {
                    spVarCb.ef(spVarCb.vy(qpVarJ8.Mr()));
                }
            } else {
                qp qpVarMz = qpVarEQ.Mz();
                if (!qpVarMz.equals(spVarCb.KD(qpVarMz))) {
                    qp qpVarSh = spVarCb.sh(qpVarMz.QX());
                    if (qpVarSh != null && qpVarSh.Mr() != qpVarMz.Mr()) {
                        spVarCb.ef(qpVarSh);
                    }
                    this.FH.BT(csVar2, qpVarMz);
                    spVarCb.dx(qpVarMz);
                }
            }
        }
        spVarCb.Mr();
        at atVarGW = asVar.gW();
        int size2 = atVarGW.size();
        int iA8 = asVar.a8();
        for (int i4 = 0; i4 < size2; i4++) {
            int iRo = atVarGW.ro(i4);
            if (this.FH.ro(iRo, iRo == iA8 ? spVarCb : spVarCn)) {
                this.Hw.set(iRo);
            }
        }
    }

    private rr j6() {
        if (this.j6.a8() > 0) {
            int iXL = this.j6.XL();
            while (iXL >= 0) {
                this.Hw.clear(iXL);
                FH(iXL);
                iXL = this.Hw.nextSetBit(0);
            }
        }
        this.FH.Mr();
        return this.FH;
    }
}
