package abcd;

import abcd.ip;

/* loaded from: classes.dex */
public final class op extends ip {
    public op(tp tpVar, wp wpVar, qp qpVar, rp rpVar) {
        super(tpVar, wpVar, qpVar, rpVar);
        int iDW = tpVar.DW();
        if (iDW == 5 || iDW == 6) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (qpVar != null && tpVar.DW() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    @Override // abcd.ip
    public void DW(ip.b bVar) {
        bVar.j6(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // abcd.ip
    public ip Mr() {
        rp rpVarJ8 = J8();
        int size = rpVarJ8.size();
        if (size == 0) {
            return this;
        }
        gr grVarA8 = rpVarJ8.sG(size - 1).a8();
        if (!grVarA8.XL()) {
            gr grVarA82 = rpVarJ8.sG(0).a8();
            if (size != 2 || !grVarA82.XL()) {
                return this;
            }
            bq bqVar = (bq) grVarA82;
            rp rpVarSy = rpVarJ8.sy();
            return new np(vp.I(EQ().Hw(), J0(), rpVarSy, bqVar), we(), J0(), rpVarSy, bqVar);
        }
        bq bqVarYS = (bq) grVarA8;
        rp rpVarAj = rpVarJ8.aj();
        try {
            int iHw = EQ().Hw();
            if (iHw == 15 && (bqVarYS instanceof nq)) {
                iHw = 14;
                bqVarYS = nq.yS(-((nq) bqVarYS).a8());
            }
            bq bqVar2 = bqVarYS;
            return new np(vp.I(iHw, J0(), rpVarAj, bqVar2), we(), J0(), rpVarAj, bqVar2);
        } catch (IllegalArgumentException unused) {
            return this;
        }
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
        return new op(EQ(), we(), qpVar, rpVar);
    }

    public op(tp tpVar, wp wpVar, qp qpVar, qp qpVar2) {
        this(tpVar, wpVar, qpVar, rp.vJ(qpVar2));
    }
}
