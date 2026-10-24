package abcd;

/* loaded from: classes.dex */
public class bc0 {
    private int DW;
    private int[] j6 = new int[64];

    public boolean j6(int i) {
        int i2 = this.DW;
        if (i2 == 0) {
            this.j6[0] = i;
            this.DW = 1;
            return true;
        }
        int i3 = 0;
        do {
            int i4 = (i3 + i2) >>> 1;
            int[] iArr = this.j6;
            if (i < iArr[i4]) {
                i2 = i4;
            } else {
                if (i == iArr[i4]) {
                    return false;
                }
                i3 = i4 + 1;
            }
        } while (i3 < i2);
        int i5 = this.DW;
        int[] iArr2 = this.j6;
        if (i5 == iArr2.length) {
            int[] iArr3 = new int[iArr2.length * 2];
            System.arraycopy(iArr2, 0, iArr3, 0, i5);
            this.j6 = iArr3;
        }
        int i6 = this.DW;
        if (i3 < i6) {
            int[] iArr4 = this.j6;
            System.arraycopy(iArr4, i3, iArr4, i3 + 1, i6 - i3);
        }
        this.j6[i3] = i;
        this.DW++;
        return true;
    }
}
