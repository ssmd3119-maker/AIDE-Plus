package abcd;

/* loaded from: classes.dex */
public abstract class ep extends ip {
    private final bq qp;

    public ep(tp tpVar, wp wpVar, qp qpVar, rp rpVar, bq bqVar) {
        super(tpVar, wpVar, qpVar, rpVar);
        if (bqVar == null) {
            throw new NullPointerException("cst == null");
        }
        this.qp = bqVar;
    }

    @Override // abcd.ip
    public boolean Hw(ip ipVar) {
        return super.Hw(ipVar) && this.qp.equals(((ep) ipVar).a8());
    }

    public bq a8() {
        return this.qp;
    }

    @Override // abcd.ip
    public String gn() {
        return this.qp.Zo();
    }
}
