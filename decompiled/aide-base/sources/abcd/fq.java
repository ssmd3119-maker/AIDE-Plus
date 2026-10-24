package abcd;

/* loaded from: classes.dex */
public abstract class fq extends uq {
    private dr fY;
    private final dr jw;

    public fq(zq zqVar, wq wqVar) {
        super(zqVar, wqVar);
        this.jw = dr.u7(J0().we().J0());
        this.fY = null;
    }

    @Override // abcd.uq, abcd.bq
    public final int FH(bq bqVar) {
        int iFH = super.FH(bqVar);
        return iFH != 0 ? iFH : this.jw.compareTo(((fq) bqVar).jw);
    }

    public final dr Mr(boolean z) {
        if (z) {
            return this.jw;
        }
        if (this.fY == null) {
            this.fY = this.jw.XL(we().J0());
        }
        return this.fY;
    }

    public final int QX(boolean z) {
        return Mr(z).v5().vJ();
    }

    public final boolean a8() {
        return J0().aM();
    }

    public final dr aM() {
        return this.jw;
    }

    @Override // abcd.gr
    public final fr j6() {
        return this.jw.Zo();
    }

    public final boolean yS() {
        return J0().Mr();
    }
}
