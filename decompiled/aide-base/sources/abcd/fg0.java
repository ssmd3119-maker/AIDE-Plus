package abcd;

/* loaded from: classes.dex */
public class fg0 {
    private int DW;
    private int[] j6;

    public fg0() {
        this(10);
    }

    private void v5() {
        int[] iArr = this.j6;
        int[] iArr2 = new int[((iArr.length + 16) * 3) / 2];
        System.arraycopy(iArr, 0, iArr2, 0, this.DW);
        this.j6 = iArr2;
    }

    public void DW() {
        this.DW = 0;
    }

    public void FH(int i, int i2) {
        while (this.DW < i) {
            j6(i2);
        }
    }

    public int Hw(int i) {
        if (this.DW > i) {
            return this.j6[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public int VH() {
        return this.DW;
    }

    public void Zo(int i, int i2) {
        int i3 = this.DW;
        if (i3 < i) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i3 == i) {
            j6(i2);
        } else {
            this.j6[i] = i2;
        }
    }

    public void j6(int i) {
        if (this.DW == this.j6.length) {
            v5();
        }
        int[] iArr = this.j6;
        int i2 = this.DW;
        this.DW = i2 + 1;
        iArr[i2] = i;
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

    public fg0(int i) {
        this.j6 = new int[i];
    }
}
