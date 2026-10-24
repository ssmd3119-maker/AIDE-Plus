package abcd;

/* loaded from: classes.dex */
public class gg0 {
    private int DW;
    private long[] j6;

    public gg0() {
        this(10);
    }

    private void v5() {
        long[] jArr = this.j6;
        long[] jArr2 = new long[((jArr.length + 16) * 3) / 2];
        System.arraycopy(jArr, 0, jArr2, 0, this.DW);
        this.j6 = jArr2;
    }

    public void DW() {
        this.DW = 0;
    }

    public boolean FH(long j) {
        for (int i = 0; i < this.DW; i++) {
            if (this.j6[i] == j) {
                return true;
            }
        }
        return false;
    }

    public long Hw(int i) {
        if (this.DW > i) {
            return this.j6[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public void Zo(int i, long j) {
        int i2 = this.DW;
        if (i2 < i) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 == i) {
            j6(j);
        } else {
            this.j6[i] = j;
        }
    }

    public void j6(long j) {
        if (this.DW == this.j6.length) {
            v5();
        }
        long[] jArr = this.j6;
        int i = this.DW;
        this.DW = i + 1;
        jArr[i] = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < this.DW; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.j6[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    public gg0(int i) {
        this.j6 = new long[i];
    }
}
