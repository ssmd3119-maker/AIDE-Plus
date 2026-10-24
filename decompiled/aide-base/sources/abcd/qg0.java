package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class qg0 extends OutputStream {
    private final OutputStream WB;
    private boolean qp;
    private int mb = -1;
    private byte[] jw = new byte[8000];
    private int fY = 0;

    public qg0(OutputStream outputStream) {
        this.WB = outputStream;
    }

    private int DW(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.fY;
        byte[] bArr2 = this.jw;
        if (i3 > bArr2.length) {
            return i2;
        }
        int iMin = Math.min(bArr2.length - i3, i2);
        System.arraycopy(bArr, i, this.jw, this.fY, iMin);
        this.fY += iMin;
        int i4 = i2 - iMin;
        if (i4 > 0) {
            FH();
        }
        return i4;
    }

    private void FH() throws IOException {
        this.qp = m30.Zo(this.jw, this.fY);
        int i = this.fY;
        byte[] bArr = this.jw;
        this.fY = bArr.length + 1;
        write(bArr, 0, i);
    }

    private int j6(byte b) throws IOException {
        int i = this.fY;
        byte[] bArr = this.jw;
        if (i > bArr.length) {
            return 1;
        }
        int i2 = i + 1;
        this.fY = i2;
        bArr[i] = b;
        if (i2 != bArr.length) {
            return 0;
        }
        FH();
        return 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.WB.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        if (this.fY < this.jw.length) {
            FH();
        }
        this.mb = -1;
        this.WB.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (j6((byte) i) >= 0) {
            return;
        }
        if (this.qp) {
            this.WB.write(i);
            return;
        }
        if (i != 10) {
            if (i == 13) {
                this.WB.write(i);
                this.mb = 13;
                return;
            } else {
                this.WB.write(i);
                this.mb = -1;
                return;
            }
        }
        int i2 = this.mb;
        if (i2 == 13) {
            this.WB.write(10);
            this.mb = -1;
        } else if (i2 == -1) {
            this.WB.write(13);
            this.WB.write(10);
            this.mb = -1;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        int iDW = DW(bArr, 0, bArr.length);
        if (iDW > 0) {
            write(bArr, bArr.length - iDW, iDW);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int iDW = DW(bArr, i, i2);
        if (iDW < 0) {
            return;
        }
        int i4 = (i + i2) - iDW;
        if (iDW == 0) {
            return;
        }
        if (this.qp) {
            this.WB.write(bArr, i4, iDW);
            return;
        }
        int i5 = i4;
        int i6 = i5;
        while (true) {
            i3 = i4 + iDW;
            if (i5 >= i3) {
                break;
            }
            byte b = bArr[i5];
            if (b == 13) {
                this.mb = 13;
            } else if (b == 10) {
                if (this.mb != 13) {
                    if (i6 < i5) {
                        this.WB.write(bArr, i6, i5 - i6);
                    }
                    this.WB.write(13);
                    i6 = i5;
                }
                this.mb = -1;
            } else {
                this.mb = -1;
            }
            i5++;
        }
        if (i6 < i3) {
            this.WB.write(bArr, i6, i3 - i6);
        }
        if (bArr[i3 - 1] == 13) {
            this.mb = 13;
        }
    }
}
