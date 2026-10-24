package abcd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class w00 extends InputStream {
    RandomAccessFile WB;
    h00 fY;
    int jw;
    int mb;
    boolean qp;
    boolean k2 = false;
    OutputStream zh = null;

    public w00(v00 v00Var) throws IOException {
        h00 h00VarJ6 = i00.j6(w00.class.getName());
        this.fY = h00VarJ6;
        this.qp = h00VarJ6.j6();
        this.jw = 0;
        this.mb = v00Var.FH();
        this.WB = v00Var.XL().DW;
        if (v00Var.gn() < 0) {
            v00Var.lg();
            return;
        }
        if (this.qp) {
            this.fY.Hw(String.format("Seeking to %d", Long.valueOf(v00Var.gn())));
        }
        this.WB.seek(v00Var.gn());
    }

    private int j6(byte[] bArr, int i, int i2) throws IOException {
        if (this.mb - this.jw == 0) {
            if (!this.k2) {
                return -1;
            }
            this.k2 = false;
            bArr[i] = 0;
            return 1;
        }
        int i3 = this.WB.read(bArr, i, Math.min(i2, available()));
        if (i3 > 0) {
            OutputStream outputStream = this.zh;
            if (outputStream != null) {
                outputStream.write(bArr, i, i3);
            }
            this.jw += i3;
        }
        if (this.qp) {
            this.fY.Hw(String.format("Read %d bytes for read(b,%d,%d)", Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return i3;
    }

    public void DW(OutputStream outputStream) {
        this.zh = outputStream;
    }

    public void FH(boolean z) {
        this.k2 = z;
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.mb - this.jw;
        if (this.qp) {
            this.fY.Hw(String.format("Available = %d", Integer.valueOf(i)));
        }
        if (i == 0 && this.k2) {
            return 1;
        }
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.mb - this.jw == 0) {
            if (!this.k2) {
                return -1;
            }
            this.k2 = false;
            return 0;
        }
        int i = this.WB.read();
        if (i >= 0) {
            OutputStream outputStream = this.zh;
            if (outputStream != null) {
                outputStream.write(i);
            }
            if (this.qp) {
                this.fY.Hw("Read 1 byte");
            }
            this.jw++;
        } else if (this.qp) {
            this.fY.Hw("Read 0 bytes");
        }
        return i;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long jMin = Math.min(j, available());
        RandomAccessFile randomAccessFile = this.WB;
        randomAccessFile.seek(randomAccessFile.getFilePointer() + jMin);
        if (this.qp) {
            this.fY.Hw(String.format("Skipped %d bytes", Long.valueOf(jMin)));
        }
        return jMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return j6(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return j6(bArr, 0, bArr.length);
    }
}
