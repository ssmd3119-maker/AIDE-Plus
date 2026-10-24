package abcd;

/* loaded from: classes.dex */
public class lz {
    private final long DW;
    private long FH;
    private long Hw;
    private final long j6;

    public lz(long j, long j2) {
        this.j6 = j;
        this.DW = j2;
    }

    public boolean j6() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > this.FH + this.j6) {
            this.FH = jCurrentTimeMillis;
            this.Hw = 1L;
            return true;
        }
        long j = this.Hw;
        if (j >= this.DW) {
            return false;
        }
        this.Hw = j + 1;
        return true;
    }
}
