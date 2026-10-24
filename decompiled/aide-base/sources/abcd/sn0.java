package abcd;

/* loaded from: classes.dex */
public abstract class sn0 implements on0 {
    private int DW;
    private long FH;
    private byte[] j6;

    public sn0() {
        this.j6 = new byte[4];
        this.DW = 0;
    }

    @Override // abcd.on0
    public void DW() {
        this.FH = 0L;
        this.DW = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.j6;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // abcd.on0
    public void FH(byte b) {
        byte[] bArr = this.j6;
        int i = this.DW;
        int i2 = i + 1;
        this.DW = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            tp(bArr, 0);
            this.DW = 0;
        }
        this.FH++;
    }

    public void VH() {
        long j = this.FH << 3;
        FH((byte) -128);
        while (this.DW != 0) {
            FH((byte) 0);
        }
        u7(j);
        gn();
    }

    public abstract void gn();

    @Override // abcd.on0
    public void j6(byte[] bArr, int i, int i2) {
        while (this.DW != 0 && i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.j6.length) {
            tp(bArr, i);
            byte[] bArr2 = this.j6;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.FH += bArr2.length;
        }
        while (i2 > 0) {
            FH(bArr[i]);
            i++;
            i2--;
        }
    }

    public abstract void tp(byte[] bArr, int i);

    public abstract void u7(long j);

    public sn0(sn0 sn0Var) {
        byte[] bArr = new byte[sn0Var.j6.length];
        this.j6 = bArr;
        byte[] bArr2 = sn0Var.j6;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.DW = sn0Var.DW;
        this.FH = sn0Var.FH;
    }
}
