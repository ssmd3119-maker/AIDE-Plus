package abcd;

import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class wr {
    private final BitSet DW;
    ds j6;

    private wr(ds dsVar) {
        this.j6 = dsVar;
        this.DW = new BitSet(dsVar.a8());
    }

    public static void DW(ds dsVar) {
        new wr(dsVar).Hw();
    }

    private void Hw() {
        int iA8 = this.j6.a8();
        for (int i = 0; i < iA8; i++) {
            cs csVarWs = this.j6.Ws(i);
            if (csVarWs != null && csVarWs.J8().u7() == 0) {
                this.DW.set(i);
            }
        }
        while (true) {
            int iNextSetBit = this.DW.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.DW.clear(iNextSetBit);
            if (FH((vr) this.j6.Ws(iNextSetBit))) {
                List<cs> listRN = this.j6.rN(iNextSetBit);
                int size = listRN.size();
                for (int i2 = 0; i2 < size; i2++) {
                    cs csVar = listRN.get(i2);
                    qp qpVarJ8 = csVar.J8();
                    if (qpVarJ8 != null && (csVar instanceof vr)) {
                        this.DW.set(qpVarJ8.Mr());
                    }
                }
            }
        }
    }

    private static boolean j6(kp kpVar, kp kpVar2) {
        return kpVar == kpVar2 || (kpVar != null && kpVar.equals(kpVar2));
    }

    public boolean FH(vr vrVar) {
        vrVar.Mz(this.j6);
        rp rpVarWs = vrVar.Ws();
        int size = rpVarWs.size();
        int i = -1;
        qp qpVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            qp qpVarSG = rpVarWs.sG(i2);
            if (qpVarSG.u7() != 0) {
                i = i2;
                qpVar = qpVarSG;
            }
        }
        if (qpVar == null) {
            return false;
        }
        kp kpVarQX = qpVar.QX();
        gr grVarJ6 = qpVar.j6();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != i) {
                qp qpVarSG2 = rpVarWs.sG(i3);
                if (qpVarSG2.u7() != 0) {
                    z = z && j6(kpVarQX, qpVarSG2.QX());
                    grVarJ6 = ai.Hw(grVarJ6, qpVarSG2.j6());
                }
            }
        }
        if (grVarJ6 != null) {
            kp kpVar = z ? kpVarQX : null;
            qp qpVarJ8 = vrVar.J8();
            if (qpVarJ8.a8() == grVarJ6 && j6(kpVar, qpVarJ8.QX())) {
                return false;
            }
            vrVar.cb(grVarJ6, kpVar);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(rpVarWs.sG(i4).toString());
            sb.append(' ');
        }
        throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
    }
}
