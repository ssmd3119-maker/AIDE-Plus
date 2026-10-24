package abcd;

/* loaded from: classes.dex */
public final class nh implements ct {
    private final int DW;
    private final int FH;
    private final at Hw;
    private final int j6;
    private final ph v5;

    public nh(int i, int i2, int i3, at atVar, ph phVar) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        if (atVar == null) {
            throw new NullPointerException("targets == null");
        }
        int size = atVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (atVar.ro(i4) < 0) {
                throw new IllegalArgumentException("successors[" + i4 + "] == " + atVar.ro(i4));
            }
        }
        if (phVar == null) {
            throw new NullPointerException("catches == null");
        }
        this.j6 = i;
        this.DW = i2;
        this.FH = i3;
        this.Hw = atVar;
        this.v5 = phVar;
    }

    public ph DW() {
        return this.v5;
    }

    public int FH() {
        return this.FH;
    }

    public int Hw() {
        return this.DW;
    }

    @Override // abcd.ct
    public int j6() {
        return this.j6;
    }

    public String toString() {
        return '{' + xs.VH(this.j6) + ": " + xs.VH(this.DW) + ".." + xs.VH(this.FH) + '}';
    }

    public at v5() {
        return this.Hw;
    }
}
