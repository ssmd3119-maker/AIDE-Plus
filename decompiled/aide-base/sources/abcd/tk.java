package abcd;

/* loaded from: classes.dex */
public final class tk extends dk {
    private wj v5;

    public tk(bk bkVar, wp wpVar, rp rpVar, wj wjVar) {
        super(bkVar, wpVar, rpVar);
        if (wjVar == null) {
            throw new NullPointerException("target == null");
        }
        this.v5 = wjVar;
    }

    public tk BT(wj wjVar) {
        return new tk(tp().Zo(), EQ(), we(), wjVar);
    }

    @Override // abcd.zj
    public zj Mr(bk bkVar) {
        return new tk(bkVar, EQ(), we(), this.v5);
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        return new tk(tp(), EQ(), rpVar, this.v5);
    }

    public int er() {
        return this.v5.Zo();
    }

    public boolean gW() {
        return J0() && this.v5.J0();
    }

    @Override // abcd.zj
    public String j6() {
        wj wjVar = this.v5;
        return wjVar == null ? "????" : wjVar.Ws();
    }

    public wj rN() {
        return this.v5;
    }

    public int yS() {
        return this.v5.Zo() - Zo();
    }
}
