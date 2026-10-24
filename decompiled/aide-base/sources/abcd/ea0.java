package abcd;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class ea0 extends fa0 {
    private final ByteBuffer Hw;

    public ea0(wa0 wa0Var, long j, ByteBuffer byteBuffer) {
        super(wa0Var, j, byteBuffer.capacity());
        this.Hw = byteBuffer;
    }

    @Override // abcd.fa0
    public int DW(int i, byte[] bArr, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.Hw.slice();
        byteBufferSlice.position(i);
        int iMin = Math.min(byteBufferSlice.remaining(), i3);
        byteBufferSlice.get(bArr, i2, iMin);
        return iMin;
    }

    @Override // abcd.fa0
    public int Hw(int i, Inflater inflater) {
        ByteBuffer byteBufferSlice = this.Hw.slice();
        byteBufferSlice.position(i);
        int iMin = Math.min(byteBufferSlice.remaining(), 512);
        byte[] bArr = new byte[iMin];
        byteBufferSlice.get(bArr, 0, iMin);
        inflater.setInput(bArr, 0, iMin);
        return iMin;
    }

    @Override // abcd.fa0
    public void VH(fc0 fc0Var, long j, int i, MessageDigest messageDigest) {
        ByteBuffer byteBufferSlice = this.Hw.slice();
        byteBufferSlice.position((int) (j - this.DW));
        while (i > 0) {
            byte[] bArrHw = fc0Var.Hw();
            int iMin = Math.min(i, bArrHw.length);
            byteBufferSlice.get(bArrHw, 0, iMin);
            fc0Var.write(bArrHw, 0, iMin);
            if (messageDigest != null) {
                messageDigest.update(bArrHw, 0, iMin);
            }
            i -= iMin;
        }
    }
}
