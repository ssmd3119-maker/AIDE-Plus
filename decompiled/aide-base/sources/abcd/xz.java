package abcd;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class xz {
    private AtomicLong j6 = new AtomicLong(0);

    public boolean DW(long j) {
        return this.j6.get() / 1000 > j;
    }

    public long j6(long j) {
        long j2;
        long j3;
        do {
            j2 = this.j6.get();
            long j4 = j2 / 1000;
            if (j4 == j) {
                if (j2 % 1000 >= 999) {
                    Long.signum(j);
                    return (j * 1000) + 999;
                }
                j3 = 1 + j2;
            } else {
                if (j <= j4) {
                    long j5 = j * 1000;
                    this.j6.set(j5);
                    return j5;
                }
                j3 = 1000 * j;
            }
        } while (!this.j6.compareAndSet(j2, j3));
        return j3;
    }
}
