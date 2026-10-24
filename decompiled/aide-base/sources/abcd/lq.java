package abcd;

/* loaded from: classes.dex */
public final class lq extends uq {
    public lq(zq zqVar, wq wqVar) {
        super(zqVar, wqVar);
    }

    public static lq QX(fr frVar) {
        return new lq(zq.we(frVar), wq.jw);
    }

    @Override // abcd.uq, abcd.bq
    public int FH(bq bqVar) {
        int iFH = super.FH(bqVar);
        return iFH != 0 ? iFH : J0().we().compareTo(((lq) bqVar).J0().we());
    }

    @Override // abcd.gr
    public fr j6() {
        return J0().J0();
    }

    @Override // abcd.bq
    public String tp() {
        return "field";
    }
}
