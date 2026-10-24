package abcd;

/* loaded from: classes.dex */
public final class gk extends vk {
    private final qp v5;

    public gk(wp wpVar, qp qpVar) {
        super(wpVar);
        if (qpVar == null) {
            throw new NullPointerException("local == null");
        }
        this.v5 = qpVar;
    }

    @Override // abcd.vk, abcd.zj
    public zj U2(int i) {
        return new gk(EQ(), this.v5.vJ(i));
    }

    @Override // abcd.zj
    public String XL(boolean z) {
        return "local-end " + jk.er(this.v5);
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new gk(EQ(), this.v5);
    }

    @Override // abcd.zj
    public String j6() {
        return this.v5.toString();
    }

    public qp rN() {
        return this.v5;
    }
}
