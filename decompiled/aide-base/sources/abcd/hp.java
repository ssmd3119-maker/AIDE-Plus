package abcd;

import abcd.ip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hp extends ip {
    private final bq k2;
    private final ArrayList<bq> qp;

    public hp(tp tpVar, wp wpVar, rp rpVar, ArrayList<bq> arrayList, bq bqVar) {
        super(tpVar, wpVar, null, rpVar);
        if (tpVar.DW() != 1) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        this.qp = arrayList;
        this.k2 = bqVar;
    }

    @Override // abcd.ip
    public void DW(ip.b bVar) {
        bVar.Zo(this);
    }

    @Override // abcd.ip
    public hr VH() {
        return er.jw;
    }

    public bq a8() {
        return this.k2;
    }

    @Override // abcd.ip
    public ip aM(fr frVar) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // abcd.ip
    public ip j3(qp qpVar, rp rpVar) {
        return new hp(EQ(), we(), rpVar, this.qp, this.k2);
    }

    public ArrayList<bq> lg() {
        return this.qp;
    }
}
