package abcd;

import abcd.ip;

/* loaded from: classes.dex */
public final class yp extends ep {
    private final hr k2;

    public yp(tp tpVar, wp wpVar, rp rpVar, hr hrVar, bq bqVar) {
        super(tpVar, wpVar, null, rpVar, bqVar);
        if (tpVar.DW() != 6) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (hrVar == null) {
            throw new NullPointerException("catches == null");
        }
        this.k2 = hrVar;
    }

    @Override // abcd.ip
    public void DW(ip.b bVar) {
        bVar.FH(this);
    }

    @Override // abcd.ip
    public hr VH() {
        return this.k2;
    }

    @Override // abcd.ip
    public ip aM(fr frVar) {
        return new yp(EQ(), we(), J8(), this.k2.tp(frVar), a8());
    }

    @Override // abcd.ep, abcd.ip
    public String gn() {
        bq bqVarA8 = a8();
        String strZo = bqVarA8.Zo();
        if (bqVarA8 instanceof yq) {
            strZo = ((yq) bqVarA8).yS();
        }
        return strZo + " " + zp.a8(this.k2);
    }

    @Override // abcd.ip
    public ip j3(qp qpVar, rp rpVar) {
        return new yp(EQ(), we(), rpVar, this.k2, a8());
    }
}
