package abcd;

/* loaded from: classes.dex */
public abstract class qq extends sq {
    private final int WB;

    public qq(int i) {
        this.WB = i;
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        int i = ((qq) bqVar).WB;
        int i2 = this.WB;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // abcd.sq
    public final long Mr() {
        return this.WB;
    }

    @Override // abcd.sq
    public final boolean QX() {
        return true;
    }

    @Override // abcd.sq
    public final int aM() {
        return this.WB;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.WB == ((qq) obj).WB;
    }

    public final int hashCode() {
        return this.WB;
    }

    @Override // abcd.bq
    public final boolean v5() {
        return false;
    }
}
