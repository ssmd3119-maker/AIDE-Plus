package abcd;

/* loaded from: classes.dex */
public class wb0 {
    final long[] DW;
    final int[] FH;
    final int Hw;
    final int[] j6;
    private int v5;

    public wb0(byte[] bArr, int i) {
        int i2 = i - (i % 16);
        int i3 = i2 / 16;
        if (i3 < 1) {
            this.j6 = new int[0];
            this.Hw = 0;
            this.DW = new long[0];
            this.FH = new int[0];
            return;
        }
        int[] iArr = new int[DW(i3)];
        this.j6 = iArr;
        this.Hw = iArr.length - 1;
        long[] jArr = new long[i3 + 1];
        this.DW = jArr;
        this.FH = new int[jArr.length];
        j6(bArr, i2);
    }

    private static int DW(int i) {
        int iNumberOfLeadingZeros = 1 << ((32 - Integer.numberOfLeadingZeros(i)) - 1);
        return iNumberOfLeadingZeros < i ? iNumberOfLeadingZeros << 1 : iNumberOfLeadingZeros;
    }

    private void j6(byte[] bArr, int i) {
        int i2 = i - 16;
        int i3 = 0;
        while (true) {
            int iU7 = vb0.u7(bArr, i2);
            int i4 = this.Hw & iU7;
            int i5 = this.j6[i4];
            if (i5 == 0 || i3 != iU7) {
                int i6 = this.v5 + 1;
                this.v5 = i6;
                this.DW[i6] = (iU7 << 32) | i2;
                this.FH[i6] = i5;
                this.j6[i4] = i6;
            } else {
                this.DW[i5] = (iU7 << 32) | i2;
            }
            i2 -= 16;
            if (i2 < 0) {
                return;
            } else {
                i3 = iU7;
            }
        }
    }
}
