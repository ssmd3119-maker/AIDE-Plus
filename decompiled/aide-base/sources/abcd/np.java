package abcd;

import abcd.ip;

/* loaded from: classes.dex */
public final class np extends ep {
    public np(tp tpVar, wp wpVar, qp qpVar, rp rpVar, bq bqVar) {
        super(tpVar, wpVar, qpVar, rpVar, bqVar);
        if (tpVar.DW() != 1) {
            throw new IllegalArgumentException("bogus branchingness");
        }
    }

    @Override // abcd.ip
    public void DW(ip.b bVar) {
        bVar.DW(this);
    }

    @Override // abcd.ip
    public hr VH() {
        return er.jw;
    }

    @Override // abcd.ip
    public ip aM(fr frVar) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // abcd.ip
    public ip j3(qp qpVar, rp rpVar) {
        return new np(EQ(), we(), qpVar, rpVar, a8());
    }
}
