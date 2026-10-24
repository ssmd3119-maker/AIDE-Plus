package abcd;

import java.io.InputStream;

/* loaded from: classes.dex */
public class db0 extends InputStream {
    private final ob0 WB;
    private long jw;
    private final wa0 mb;

    public db0(wa0 wa0Var, long j, ob0 ob0Var) {
        this.mb = wa0Var;
        this.jw = j;
        this.WB = ob0Var;
        ob0Var.vy(wa0Var, j);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.WB.XL();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int iA8 = this.WB.a8(this.mb, this.jw, bArr, i, i2);
        this.jw += iA8;
        return iA8;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 1) {
            return bArr[0] & 255;
        }
        return -1;
    }
}
