package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class js {
    protected final hs DW;
    protected final ds j6;

    public js(ds dsVar, hs hsVar) {
        this.j6 = dsVar;
        this.DW = hsVar;
    }

    public final qp DW(cs csVar, qp qpVar) {
        as asVarTp = csVar.tp();
        ArrayList<cs> arrayListQX = asVarTp.QX();
        int iIndexOf = arrayListQX.indexOf(csVar);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (iIndexOf != arrayListQX.size() - 1) {
            throw new IllegalArgumentException("Adding move here not supported:" + csVar.Zo());
        }
        qp qpVarRo = qp.ro(this.j6.vy(), qpVar.a8());
        arrayListQX.add(iIndexOf, cs.BT(new op(vp.er(qpVarRo.j6()), wp.Hw, qpVarRo, rp.vJ(qpVar)), asVarTp));
        int iMr = qpVarRo.Mr();
        zs it = asVarTp.XL().iterator();
        while (it.hasNext()) {
            this.DW.j6(iMr, it.next());
        }
        rp rpVarWs = csVar.Ws();
        int size = rpVarWs.size();
        for (int i = 0; i < size; i++) {
            this.DW.j6(iMr, rpVarWs.sG(i).Mr());
        }
        this.j6.KD();
        return qpVarRo;
    }

    public final qp j6(int i) {
        cs csVarWs = this.j6.Ws(i);
        if (csVarWs == null) {
            return null;
        }
        return csVarWs.J8();
    }
}
