package abcd;

/* loaded from: classes.dex */
public abstract class rq extends sq {
    private final long WB;

    public rq(long j) {
        this.WB = j;
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        long j = ((rq) bqVar).WB;
        long j2 = this.WB;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // abcd.sq
    public final long Mr() {
        return this.WB;
    }

    @Override // abcd.sq
    public final boolean QX() {
        long j = this.WB;
        return ((long) ((int) j)) == j;
    }

    @Override // abcd.sq
    public final int aM() {
        return (int) this.WB;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.WB == ((rq) obj).WB;
    }

    public final int hashCode() {
        long j = this.WB;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @Override // abcd.bq
    public final boolean v5() {
        return true;
    }
}
