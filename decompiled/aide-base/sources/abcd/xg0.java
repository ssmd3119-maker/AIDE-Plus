package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class xg0 extends InputStream {
    private byte[] WB;
    private OutputStream jw;
    private InputStream mb;

    public xg0(InputStream inputStream, OutputStream outputStream) {
        this.mb = inputStream;
        this.jw = outputStream;
    }

    private byte[] j6() {
        if (this.WB == null) {
            this.WB = new byte[2048];
        }
        return this.WB;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        byte[] bArrJ6 = j6();
        while (true) {
            int i = this.mb.read(bArrJ6);
            if (i <= 0) {
                this.jw.close();
                this.mb.close();
                return;
            }
            this.jw.write(bArrJ6, 0, i);
        }
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArrJ6 = j6();
        if (read(bArrJ6, 0, 1) == 1) {
            return bArrJ6[0] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int i;
        byte[] bArrJ6 = j6();
        long j2 = 0;
        while (0 < j && (i = this.mb.read(bArrJ6, 0, (int) Math.min(bArrJ6.length, j))) > 0) {
            this.jw.write(bArrJ6, 0, i);
            long j3 = i;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.mb.read(bArr, i, i2);
        if (i3 > 0) {
            this.jw.write(bArr, i, i3);
        }
        return i3;
    }
}
