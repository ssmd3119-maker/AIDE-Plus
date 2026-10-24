package abcd;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ek0 extends hk0 {
    private int fY;
    private int jw;
    private boolean k2;
    private boolean qp;

    public ek0(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.qp = false;
        this.k2 = true;
        this.jw = inputStream.read();
        int i2 = inputStream.read();
        this.fY = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        FH();
    }

    private boolean FH() {
        if (!this.qp && this.k2 && this.jw == 0 && this.fY == 0) {
            this.qp = true;
            DW(true);
        }
        return this.qp;
    }

    public void Hw(boolean z) {
        this.k2 = z;
        FH();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.k2 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.qp) {
            return -1;
        }
        int i3 = this.WB.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.jw;
        bArr[i + 1] = (byte) this.fY;
        this.jw = this.WB.read();
        int i4 = this.WB.read();
        this.fY = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (FH()) {
            return -1;
        }
        int i = this.WB.read();
        if (i >= 0) {
            int i2 = this.jw;
            this.jw = this.fY;
            this.fY = i;
            return i2;
        }
        throw new EOFException();
    }
}
