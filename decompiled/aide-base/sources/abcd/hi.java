package abcd;

/* loaded from: classes.dex */
public final class hi extends gt {
    private int fY;
    private final at jw;
    private final at mb;

    public hi(int i) {
        super(true);
        this.mb = new at(i);
        this.jw = new at(i + 1);
        this.fY = i;
    }

    public void BT(int i, int i2) {
        a8();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.mb.BT(i);
        this.jw.BT(i2);
    }

    public int KD(int i) {
        return this.jw.ro(i);
    }

    @Override // abcd.gt
    public void Mr() {
        this.mb.Mr();
        this.jw.Mr();
        super.Mr();
    }

    public void cb() {
        a8();
        int i = this.fY;
        if (i != this.jw.size() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int iRo = this.jw.ro(i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int iRo2 = this.jw.ro(i3);
            if (iRo2 != iRo) {
                if (i3 != i2) {
                    this.jw.g3(i2, iRo2);
                    at atVar = this.mb;
                    atVar.g3(i2, atVar.ro(i3));
                }
                i2++;
            }
        }
        if (i2 != i) {
            this.mb.Mz(i2);
            this.jw.g3(i2, iRo);
            this.jw.Mz(i2 + 1);
            this.fY = i2;
        }
    }

    public int cn(int i) {
        return this.mb.ro(i);
    }

    public void dx(int i) {
        a8();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        if (this.jw.size() != this.fY) {
            throw new RuntimeException("non-default elements not all set");
        }
        this.jw.BT(i);
    }

    public at ro() {
        return this.jw;
    }

    public at sh() {
        return this.mb;
    }

    public int size() {
        return this.fY;
    }

    public int vy() {
        return this.jw.ro(this.fY);
    }
}
