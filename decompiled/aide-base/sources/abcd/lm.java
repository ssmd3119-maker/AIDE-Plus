package abcd;

/* loaded from: classes.dex */
public final class lm extends fn {
    private byte[] k2;
    private final eq qp;

    public lm(eq eqVar) {
        super(1, -1);
        if (eqVar == null) {
            throw new NullPointerException("array == null");
        }
        this.qp = eqVar;
        this.k2 = null;
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        ps psVar = new ps();
        new tn(jnVar.v5(), psVar).Zo(this.qp, false);
        byte[] bArrAM = psVar.aM();
        this.k2 = bArrAM;
        U2(bArrAM.length);
    }

    @Override // abcd.fn
    public String a8() {
        return this.qp.Zo();
    }

    public int hashCode() {
        return this.qp.hashCode();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        tn.DW(kmVar, this.qp);
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        if (!lsVar.EQ()) {
            lsVar.write(this.k2);
            return;
        }
        lsVar.Hw(0, XL() + " encoded array");
        new tn(kmVar, lsVar).Zo(this.qp, true);
    }

    @Override // abcd.fn
    public int tp(fn fnVar) {
        return this.qp.compareTo(((lm) fnVar).qp);
    }
}
