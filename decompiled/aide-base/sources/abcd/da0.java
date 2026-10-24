package abcd;

import java.security.MessageDigest;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class da0 extends fa0 {
    private final byte[] Hw;

    public da0(wa0 wa0Var, long j, byte[] bArr) {
        super(wa0Var, j, bArr.length);
        this.Hw = bArr;
    }

    @Override // abcd.fa0
    public int DW(int i, byte[] bArr, int i2, int i3) {
        int iMin = Math.min(this.Hw.length - i, i3);
        System.arraycopy(this.Hw, i, bArr, i2, iMin);
        return iMin;
    }

    @Override // abcd.fa0
    public int Hw(int i, Inflater inflater) {
        byte[] bArr = this.Hw;
        int length = bArr.length - i;
        inflater.setInput(bArr, i, length);
        return length;
    }

    @Override // abcd.fa0
    public void VH(fc0 fc0Var, long j, int i, MessageDigest messageDigest) {
        int i2 = (int) (j - this.DW);
        fc0Var.write(this.Hw, i2, i);
        if (messageDigest != null) {
            messageDigest.update(this.Hw, i2, i);
        }
    }

    public void gn(Inflater inflater, byte[] bArr, long j, int i) {
        inflater.setInput(this.Hw, (int) (j - this.DW), i);
        while (inflater.inflate(bArr, 0, bArr.length) > 0) {
        }
    }

    public void u7(CRC32 crc32, long j, int i) {
        crc32.update(this.Hw, (int) (j - this.DW), i);
    }
}
