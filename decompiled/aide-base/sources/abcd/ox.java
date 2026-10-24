package abcd;

/* loaded from: classes.dex */
public final class ox implements qx {
    private long j6 = 1;
    private long DW = 0;

    @Override // abcd.qx
    public void DW() {
        this.j6 = 1L;
        this.DW = 0L;
    }

    @Override // abcd.qx
    public void FH(long j) {
        this.j6 = j & 65535;
        this.DW = (j >> 16) & 65535;
    }

    @Override // abcd.qx
    public long getValue() {
        return (this.DW << 16) | this.j6;
    }

    @Override // abcd.qx
    public void j6(byte[] bArr, int i, int i2) {
        if (i2 == 1) {
            long j = this.j6 + (bArr[i] & 255);
            this.j6 = j;
            long j2 = this.DW + j;
            this.DW = j2;
            this.j6 = j % 65521;
            this.DW = j2 % 65521;
            return;
        }
        int i3 = i2 / 5552;
        int i4 = i2 % 5552;
        while (true) {
            int i5 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i6 = 5552;
            while (true) {
                int i7 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                long j3 = this.j6 + (bArr[i] & 255);
                this.j6 = j3;
                this.DW += j3;
                i++;
                i6 = i7;
            }
            this.j6 %= 65521;
            this.DW %= 65521;
            i3 = i5;
        }
        while (true) {
            int i8 = i4 - 1;
            if (i4 <= 0) {
                this.j6 %= 65521;
                this.DW %= 65521;
                return;
            }
            long j4 = this.j6 + (bArr[i] & 255);
            this.j6 = j4;
            this.DW += j4;
            i++;
            i4 = i8;
        }
    }
}
