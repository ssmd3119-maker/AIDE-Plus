package abcd;

/* loaded from: classes.dex */
public final class kq extends uq {
    private lq jw;

    public kq(wq wqVar) {
        super(new zq(wqVar.J0()), wqVar);
        this.jw = null;
    }

    public lq QX() {
        if (this.jw == null) {
            this.jw = new lq(we(), J0());
        }
        return this.jw;
    }

    @Override // abcd.gr
    public fr j6() {
        return we().J0();
    }

    @Override // abcd.bq
    public String tp() {
        return "enum";
    }
}
