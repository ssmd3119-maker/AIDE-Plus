package abcd;

import abcd.ip;

/* loaded from: classes.dex */
public final class xp extends ip {
    private final at qp;

    public xp(tp tpVar, wp wpVar, qp qpVar, rp rpVar, at atVar) {
        super(tpVar, wpVar, qpVar, rpVar);
        if (tpVar.DW() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (atVar == null) {
            throw new NullPointerException("cases == null");
        }
        this.qp = atVar;
    }

    @Override // abcd.ip
    public void DW(ip.b bVar) {
        bVar.v5(this);
    }

    @Override // abcd.ip
    public boolean Hw(ip ipVar) {
        return false;
    }

    @Override // abcd.ip
    public hr VH() {
        return er.jw;
    }

    public at a8() {
        return this.qp;
    }

    @Override // abcd.ip
    public ip aM(fr frVar) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // abcd.ip
    public String gn() {
        return this.qp.toString();
    }

    @Override // abcd.ip
    public ip j3(qp qpVar, rp rpVar) {
        return new xp(EQ(), we(), qpVar, rpVar, this.qp);
    }
}
