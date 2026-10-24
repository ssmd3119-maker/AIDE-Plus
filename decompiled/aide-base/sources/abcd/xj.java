package abcd;

/* loaded from: classes.dex */
public final class xj extends dk {
    private int VH;
    private int Zo;
    private final bq v5;

    public xj(bk bkVar, wp wpVar, rp rpVar, bq bqVar) {
        super(bkVar, wpVar, rpVar);
        if (bqVar == null) {
            throw new NullPointerException("constant == null");
        }
        this.v5 = bqVar;
        this.Zo = -1;
        this.VH = -1;
    }

    public void BT(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.Zo >= 0) {
            throw new RuntimeException("index already set");
        }
        this.Zo = i;
    }

    @Override // abcd.zj
    public zj Mr(bk bkVar) {
        xj xjVar = new xj(bkVar, EQ(), we(), this.v5);
        int i = this.Zo;
        if (i >= 0) {
            xjVar.BT(i);
        }
        int i2 = this.VH;
        if (i2 >= 0) {
            xjVar.gW(i2);
        }
        return xjVar;
    }

    @Override // abcd.zj
    public zj a8(rp rpVar) {
        xj xjVar = new xj(tp(), EQ(), rpVar, this.v5);
        int i = this.Zo;
        if (i >= 0) {
            xjVar.BT(i);
        }
        int i2 = this.VH;
        if (i2 >= 0) {
            xjVar.gW(i2);
        }
        return xjVar;
    }

    public int er() {
        int i = this.Zo;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set for " + this.v5);
    }

    public void gW(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.VH >= 0) {
            throw new RuntimeException("class index already set");
        }
        this.VH = i;
    }

    @Override // abcd.zj
    public String j6() {
        return this.v5.Zo();
    }

    public bq rN() {
        return this.v5;
    }

    public boolean yS() {
        return this.Zo >= 0;
    }
}
