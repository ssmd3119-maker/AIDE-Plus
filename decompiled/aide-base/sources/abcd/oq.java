package abcd;

/* loaded from: classes.dex */
public final class oq extends fq {
    private vq qp;

    public oq(zq zqVar, wq wqVar) {
        super(zqVar, wqVar);
        this.qp = null;
    }

    public vq BT() {
        if (this.qp == null) {
            this.qp = new vq(we(), J0());
        }
        return this.qp;
    }

    @Override // abcd.bq
    public String tp() {
        return "ifaceMethod";
    }
}
