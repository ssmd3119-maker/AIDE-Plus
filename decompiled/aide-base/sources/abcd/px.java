package abcd;

/* loaded from: classes.dex */
public final class px implements qx {
    private static int[] DW = new int[256];
    private int j6 = 0;

    static {
        for (int i = 0; i < 256; i++) {
            int i2 = 8;
            int i3 = i;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                } else {
                    i3 = (i3 & 1) != 0 ? (i3 >>> 1) ^ (-306674912) : i3 >>> 1;
                }
            }
            DW[i] = i3;
        }
    }

    @Override // abcd.qx
    public void DW() {
        this.j6 = 0;
    }

    @Override // abcd.qx
    public void FH(long j) {
        this.j6 = (int) (j & 4294967295L);
    }

    @Override // abcd.qx
    public long getValue() {
        return this.j6 & 4294967295L;
    }

    @Override // abcd.qx
    public void j6(byte[] bArr, int i, int i2) {
        int i3 = this.j6 ^ (-1);
        while (true) {
            i2--;
            if (i2 < 0) {
                this.j6 = i3 ^ (-1);
                return;
            }
            i3 = (i3 >>> 8) ^ DW[(bArr[i] ^ i3) & 255];
            i++;
        }
    }
}
