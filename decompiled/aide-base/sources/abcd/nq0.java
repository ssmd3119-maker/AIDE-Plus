package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class nq0 extends OutputStream {
    private OutputStream WB;
    private OutputStream mb;

    public nq0(OutputStream outputStream, OutputStream outputStream2) {
        this.WB = outputStream;
        this.mb = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.WB.close();
        this.mb.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.WB.flush();
        this.mb.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.WB.write(bArr);
        this.mb.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.WB.write(bArr, i, i2);
        this.mb.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.WB.write(i);
        this.mb.write(i);
    }
}
