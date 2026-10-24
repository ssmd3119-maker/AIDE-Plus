package abcd;

/* loaded from: classes.dex */
public final class ek extends uk {
    private qk[] v5;

    public ek(wp wpVar, rp rpVar) {
        super(wpVar, rpVar);
        if (rpVar.size() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.v5 = null;
    }

    private static qk er(qp qpVar, int i) {
        return zj.aM(wp.Hw, qp.ro(i, qpVar.j6()), qpVar);
    }

    private void rN() {
        if (this.v5 != null) {
            return;
        }
        rp rpVarWe = we();
        int size = rpVarWe.size();
        this.v5 = new qk[size];
        int iJ0 = 0;
        for (int i = 0; i < size; i++) {
            qp qpVarSG = rpVarWe.sG(i);
            this.v5[i] = er(qpVarSG, iJ0);
            iJ0 += qpVarSG.J0();
        }
    }

    @Override // abcd.zj
    public int DW() {
        rN();
        int iDW = 0;
        for (qk qkVar : this.v5) {
            iDW += qkVar.DW();
        }
        return iDW;
    }

    @Override // abcd.zj
    public String XL(boolean z) {
        rp rpVarWe = we();
        int size = rpVarWe.size();
        StringBuffer stringBuffer = new StringBuffer(100);
        int iJ0 = 0;
        for (int i = 0; i < size; i++) {
            qp qpVarSG = rpVarWe.sG(i);
            qk qkVarEr = er(qpVarSG, iJ0);
            if (i != 0) {
                stringBuffer.append('\n');
            }
            stringBuffer.append(qkVarEr.XL(z));
            iJ0 += qpVarSG.J0();
        }
        return stringBuffer.toString();
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new ek(EQ(), rpVar);
    }

    @Override // abcd.zj
    public String j6() {
        return null;
    }

    @Override // abcd.zj
    public void lg(ls lsVar) {
        rN();
        for (qk qkVar : this.v5) {
            qkVar.lg(lsVar);
        }
    }
}
