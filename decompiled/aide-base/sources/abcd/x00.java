package abcd;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes.dex */
public class x00 extends OutputStream {
    OutputStream fY;
    OutputStream qp;
    int WB = 0;
    CRC32 mb = new CRC32();
    int jw = 0;

    public x00(int i, OutputStream outputStream) {
        this.fY = outputStream;
        if (i != 0) {
            this.qp = new DeflaterOutputStream(outputStream, new Deflater(9, true));
        } else {
            this.qp = outputStream;
        }
    }

    public int DW() {
        return this.WB;
    }

    public OutputStream FH() {
        return this.fY;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.qp.flush();
        this.qp.close();
        this.jw = (int) this.mb.getValue();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.qp.flush();
    }

    public int j6() {
        return this.jw;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.qp.write(bArr);
        this.mb.update(bArr);
        this.WB += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.qp.write(bArr, i, i2);
        this.mb.update(bArr, i, i2);
        this.WB += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.qp.write(i);
        this.mb.update(i);
        this.WB++;
    }
}
