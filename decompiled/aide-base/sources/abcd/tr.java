package abcd;

import abcd.cs;

/* loaded from: classes.dex */
public final class tr extends cs implements Cloneable {
    private ip jw;

    public tr(ip ipVar, as asVar) {
        super(ipVar.J0(), asVar);
        this.jw = ipVar;
    }

    @Override // abcd.cs
    public qp EQ() {
        qp qpVarSG = this.jw.EQ().Hw() == 54 ? this.jw.J8().sG(0) : J8();
        if (qpVarSG == null || qpVarSG.QX() == null) {
            return null;
        }
        return qpVarSG;
    }

    @Override // abcd.cs
    public void FH(cs.a aVar) {
        if (er()) {
            aVar.DW(this);
        } else {
            aVar.FH(this);
        }
    }

    @Override // abcd.cs
    public boolean Hw() {
        return this.jw.FH();
    }

    @Override // abcd.cs
    public ip J0() {
        return this.jw;
    }

    @Override // abcd.cs
    public rp Ws() {
        return this.jw.J8();
    }

    @Override // abcd.kt
    public String Zo() {
        return cn().Zo();
    }

    @Override // abcd.cs
    /* renamed from: cb, reason: merged with bridge method [inline-methods] */
    public tr clone() {
        return (tr) super.clone();
    }

    @Override // abcd.cs
    public ip cn() {
        return this.jw.j3(J8(), this.jw.J8());
    }

    public final void dx(rp rpVar) {
        if (this.jw.J8().size() != rpVar.size()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.jw = this.jw.j3(J8(), rpVar);
    }

    @Override // abcd.cs
    public final void ei(xr xrVar) {
        rp rpVarJ8 = this.jw.J8();
        rp rpVarFH = xrVar.FH(rpVarJ8);
        if (rpVarFH != rpVarJ8) {
            this.jw = this.jw.j3(J8(), rpVarFH);
            tp().aM().cn(this, rpVarJ8);
        }
    }

    @Override // abcd.cs
    public boolean er() {
        return this.jw.EQ().Hw() == 2;
    }

    @Override // abcd.cs
    public boolean j3() {
        tp tpVarWe = we();
        if (tpVarWe.DW() != 1) {
            return true;
        }
        boolean z = ur.DW() && EQ() != null;
        int iHw = tpVarWe.Hw();
        if (iHw == 2 || iHw == 5 || iHw == 55) {
            return z;
        }
        return true;
    }

    @Override // abcd.cs
    public boolean lg() {
        return this.jw.EQ().Hw() == 4;
    }

    public void sG() {
        rp rpVarJ8 = this.jw.J8();
        this.jw = this.jw.Mr();
        tp().aM().cn(this, rpVarJ8);
    }

    public final void sh(int i, qp qpVar) {
        rp rpVarJ8 = this.jw.J8();
        int size = rpVarJ8.size();
        rp rpVar = new rp(size);
        int i2 = 0;
        while (i2 < size) {
            rpVar.Mz(i2, i2 == i ? qpVar : rpVarJ8.sG(i2));
            i2++;
        }
        rpVar.Mr();
        qp qpVarSG = rpVarJ8.sG(i);
        if (qpVarSG.Mr() != qpVar.Mr()) {
            tp().aM().ro(this, qpVarSG, qpVar);
        }
        this.jw = this.jw.j3(J8(), rpVar);
    }

    @Override // abcd.cs
    public tp we() {
        return this.jw.EQ();
    }

    @Override // abcd.cs
    public boolean yS() {
        return er();
    }
}
